package com.datstorm.imageviews.view.home.view

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.datstorm.imageviews.R
import com.datstorm.imageviews.config.ApplicationConstants
import com.datstorm.imageviews.view.home.model.view_all_offers.Advertisement

class ViewAllOffersAdapter (
    private val context: Context,
    var result: List<Advertisement>
) : RecyclerView.Adapter<ViewAllOffersAdapter.MyViewHolder>() {

    private var onItemClickListener: OnItemClickListener? = null

    var position: Int?=0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.row_view_all_offers, parent, false)
        return MyViewHolder(view)
    }


    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val bean = result[position]
        if (!bean?.ThumbnailUrl.isNullOrEmpty()) {
            Glide.with(context).load(ApplicationConstants.IMAGE_BASE_URL +bean?.ThumbnailUrl)
                .thumbnail(0.5f)
                .apply(
                    RequestOptions.placeholderOf(R.drawable.product_placeholder)
                        .error(R.drawable.product_placeholder)
                )
                .into(holder.imageView)
        }
        holder.itemView.setOnClickListener {
            onItemClickListener?.onItemClick(bean, position,0)
        }


    }

    override fun getItemCount(): Int {
        return result!!.size
    }


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    fun refresh(result: List<Advertisement>) {
        this.result = result
        notifyDataSetChanged()
    }

    fun addItem(items: List<Advertisement>) {
        result+=items
        notifyDataSetChanged()
    }

    fun getItem(position: Int) {
        this.position = position
        notifyDataSetChanged()
    }

    interface OnItemClickListener {
        fun onItemClick(bean: Advertisement, position: Int, i: Int)
    }

    fun setOnItemClickListener(onItemClickListener: OnItemClickListener) {
        this.onItemClickListener = onItemClickListener
    }

}
