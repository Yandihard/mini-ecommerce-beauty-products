package com.yandihard.onlineproductsapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yandihard.onlineproductsapp.R
import com.yandihard.onlineproductsapp.databinding.CategoryRowItemBinding
import com.yandihard.onlineproductsapp.model.ProductCategory

class CategoryAdapter(private val context: Context, private val listProduct: List<ProductCategory>) : RecyclerView.Adapter<CategoryAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.ProductViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_row_item, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryAdapter.ProductViewHolder, position: Int) {
        holder.binding.categoryName.text = listProduct[position].productName
    }

    override fun getItemCount(): Int = listProduct.size

    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = CategoryRowItemBinding.bind(itemView)
    }
}