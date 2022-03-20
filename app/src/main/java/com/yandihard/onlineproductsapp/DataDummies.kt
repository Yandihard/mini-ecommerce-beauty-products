package com.yandihard.onlineproductsapp

import com.yandihard.onlineproductsapp.model.DataProducts
import com.yandihard.onlineproductsapp.model.ProductCategory

object DataDummies {

    fun generateCategoryDummy() : List<ProductCategory> {
        val category = ArrayList<ProductCategory>()

        category.add(ProductCategory(1, "Most Popular"))
        category.add(ProductCategory(2, "All Body Products"))
        category.add(ProductCategory(3, "Skin Care"))
        category.add(ProductCategory(4, "Hair"))
        return category
    }

    fun generateProductDummy() : List<DataProducts> {
        val products = ArrayList<DataProducts>()

        products.add(DataProducts(1, "Japanese Cherry Blossom", "250 ml", 17.00, R.drawable.prod2))
        products.add(DataProducts(2, "African Mango Shower Gel", "350 ml", 25.00, R.drawable.prod1))
        products.add(DataProducts(1, "Japanese Cherry Blossom", "250 ml", 17.00, R.drawable.prod2))
        products.add(DataProducts(2, "African Mango Shower Gel", "350 ml", 25.00, R.drawable.prod1))
        products.add(DataProducts(1, "Japanese Cherry Blossom", "250 ml", 17.00, R.drawable.prod2))
        products.add(DataProducts(2, "African Mango Shower Gel", "350 ml", 25.00, R.drawable.prod1))
        return products
    }
}