package com.yandihard.onlineproductsapp.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.yandihard.onlineproductsapp.databinding.ActivityProductDetailBinding

class ProductDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductDetailBinding
    private var quantity = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupQuantity()
        binding.arrowBack.setOnClickListener { onBackPressed() }
    }

    private fun setupQuantity() {
        binding.plusQuantity.setOnClickListener { quantity++
            binding.tvQuantity.text = quantity.toString() }

        binding.minQuantity.setOnClickListener {
             if(quantity <= 1) quantity = 1
             else quantity--
            binding.tvQuantity.text = quantity.toString() }
    }
}