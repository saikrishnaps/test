package com.datstorm.imageviews.utils;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.Gravity;
import android.view.View;

import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.core.content.ContextCompat;

import static android.view.View.LAYER_TYPE_SOFTWARE;

public class ViewUtils {

    public static Drawable generateBackgroundWithShadow(View view, @ColorRes int backgroundColor,
                                                        @DimenRes int cornerRadius,
                                                        int shadowColor,
                                                        @DimenRes int leftElevation,
                                                        @DimenRes int rightElevation,
                                                        @DimenRes int topElevation,
                                                        @DimenRes int bottomElevation,
                                                        float corner,
                                                        int shadowGravity) {
        float cornerRadiusValue = view.getContext().getResources().getDimension(cornerRadius);
//        float corner = view.getContext().getResources().getDimension(R.dimen.corner);
        int leftlevationValue = (int) view.getContext().getResources().getDimension(leftElevation);
        int rightlevationValue = (int) view.getContext().getResources().getDimension(rightElevation);
        int toplevationValue = (int) view.getContext().getResources().getDimension(topElevation);
        int bottomlevationValue = (int) view.getContext().getResources().getDimension(bottomElevation);
        int shadowColorValue = shadowColor;
        int backgroundColorValue = ContextCompat.getColor(view.getContext(), backgroundColor);

        float[] outerRadius = {corner, corner, corner,
                corner, corner, corner, corner,
                corner};

        Paint backgroundPaint = new Paint();
        backgroundPaint.setStyle(Paint.Style.FILL);
        backgroundPaint.setShadowLayer(cornerRadiusValue * 2, 0, 0, 0);

        Rect shapeDrawablePadding = new Rect();
        shapeDrawablePadding.left = leftlevationValue;
        shapeDrawablePadding.right = rightlevationValue;

        int DY, DX;
        switch (shadowGravity) {
            case Gravity.CENTER:
                shapeDrawablePadding.top = toplevationValue;
                shapeDrawablePadding.bottom = bottomlevationValue;
                DX = 0;
                DY = 0;
                break;
//            case Gravity.TOP:
//                shapeDrawablePadding.top = elevationValue*2;
//                shapeDrawablePadding.bottom = elevationValue;
//                DY = -1*elevationValue/3;
//                DX = 0;
//                break;
            default:
            case Gravity.BOTTOM:
                shapeDrawablePadding.top = toplevationValue;
                shapeDrawablePadding.bottom = bottomlevationValue * 2;
                DY = bottomlevationValue / 9;
                DX = 0;
                break;
        }

        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(outerRadius, null, null));

        shapeDrawable.setPadding(shapeDrawablePadding);

        shapeDrawable.getPaint().setColor(backgroundColorValue);
        shapeDrawable.getPaint().setShadowLayer(cornerRadiusValue / 3, DX, DY, shadowColorValue);

        view.setLayerType(LAYER_TYPE_SOFTWARE, shapeDrawable.getPaint());

        LayerDrawable drawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        drawable.setLayerInset(0, leftlevationValue, toplevationValue, rightlevationValue, bottomlevationValue);


        return drawable;

    }

}