package com.datstorm.imageviews.view.home.view

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.datstorm.estore.view.categories.model.domain.Detail
import com.datstorm.imageviews.R
import com.datstorm.imageviews.config.ApplicationConstants

class CategoryAdapter(
    private val context: Context,
    var result: List<Detail>,
    var i: Int
) : RecyclerView.Adapter<CategoryAdapter.MyViewHolder>() {

    private var onItemClickListener: OnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.row_category, parent, false)
        return MyViewHolder(view)
    }


    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val bean = result[position]
        holder.titleTextView.text = bean?.Name
        if (!bean?.ThumbnailUrl.isNullOrEmpty()) {
            Glide.with(context).load(ApplicationConstants.IMAGE_BASE_URL + bean?.ThumbnailUrl)
                .thumbnail(0.5f)
                .apply(
                    RequestOptions.placeholderOf(R.drawable.product_placeholder)
                        .error(R.drawable.product_placeholder)
                )
                .into(holder.imageView)
        }
        holder.itemView.setOnClickListener {
            onItemClickListener?.onItemClick(bean, position, 0)
        }

    }

    override fun getItemCount(): Int {
        return result!!.size
    }


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        internal val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    fun refresh(result: List<Detail>) {
        this.result = result
        notifyDataSetChanged()
    }

    fun addItem(items: List<Detail>) {
        result+=items
        notifyDataSetChanged()
    }

    interface OnItemClickListener {
        fun onItemClick(bean: Detail, position: Int, i: Int)
    }

    fun setOnItemClickListener(onItemClickListener: OnItemClickListener) {
        this.onItemClickListener = onItemClickListener
    }

}
