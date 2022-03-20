package com.yandihard.onlineproductsapp.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.app.ActivityOptions
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yandihard.onlineproductsapp.R
import com.yandihard.onlineproductsapp.activity.ProductDetailActivity
import com.yandihard.onlineproductsapp.databinding.ProductRowItemBinding
import com.yandihard.onlineproductsapp.model.DataProducts

class ProductAdapter(private val context: Activity, private val dataProduct: List<DataProducts>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ProductViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_row_item, parent, false)
        return ProductViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ProductAdapter.ProductViewHolder, position: Int) {
        holder.binding.apply {
            productName.text = dataProduct[position].productName
            productQty.text = dataProduct[position].productQty
            val price = dataProduct[position].productPrice
            productPrice.text = "$ $price"
            productImage.setImageResource(dataProduct[position].imageProduct)
        }

        holder.itemView.setOnClickListener {
            val intent = Intent(context, ProductDetailActivity::class.java)

            val pairs = Pair<View, String>(holder.binding.productImage, "image")
            val activityOptions = ActivityOptions.makeSceneTransitionAnimation(context, pairs.first, pairs.second)
            context.startActivity(intent, activityOptions.toBundle())
        }
    }

    override fun getItemCount(): Int = dataProduct.size

    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ProductRowItemBinding.bind(itemView)
    }
}