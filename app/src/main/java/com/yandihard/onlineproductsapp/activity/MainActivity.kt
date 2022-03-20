package com.yandihard.onlineproductsapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yandihard.onlineproductsapp.DataDummies
import com.yandihard.onlineproductsapp.adapter.CategoryAdapter
import com.yandihard.onlineproductsapp.adapter.ProductAdapter
import com.yandihard.onlineproductsapp.databinding.ActivityMainBinding
import com.yandihard.onlineproductsapp.model.DataProducts
import com.yandihard.onlineproductsapp.model.ProductCategory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var productAdapter: ProductAdapter
    private val categoryDummies = DataDummies.generateCategoryDummy()
    private val productDummies = DataDummies.generateProductDummy()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setCategoryRecyclerList(categoryDummies)
        setProductRecyclerList(productDummies)
    }

    private fun setCategoryRecyclerList(listProduct: List<ProductCategory>) {
        categoryAdapter = CategoryAdapter(this, listProduct)
        binding.rvCategory.setHasFixedSize(true)
        binding.rvCategory.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        binding.rvCategory.adapter = categoryAdapter
    }

    private fun setProductRecyclerList(dataProduct: List<DataProducts>) {
        productAdapter = ProductAdapter(this, dataProduct)
        binding.rvProduct.setHasFixedSize(true)
        binding.rvProduct.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        binding.rvProduct.adapter = productAdapter
    }
}