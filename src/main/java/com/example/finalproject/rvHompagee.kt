package com.example.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class rvHompagee : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    private lateinit var recyclerViewAdapter : RecyclerViewApater
    private var productList = mutableListOf<Product>()
    private lateinit var amdBuilder : ImageView

    private lateinit var bottomNaviation : BottomNavigationView



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv_hompagee)

        amdBuilder = findViewById(R.id.img_amd_builder)

        bottomNaviation = findViewById(R.id.btnav_bottomNavigation)

        productList = ArrayList()

        recyclerView = findViewById(R.id.mainContainer) as RecyclerView

        recyclerViewAdapter = RecyclerViewApater(this@rvHompagee, productList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2,)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewAdapter

        prepareProductList()

        bottomNaviation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> {val intent = Intent(this, rvHompagee::class.java)
                startActivity(intent)
                finish()}
            }
            true

        }
        amdBuilder.setOnClickListener {
            val int = Intent(this, amdbuilder::class.java)
            startActivity(int)
        }



    }


    private fun prepareProductList(){
        var shopProducts = Product("G.Skill Tridentz rgb 2x8 3200mhz", "The G.Skill Trident Z RAM has a speed of 7200...", R.drawable.tridentzrgb2x83200mhz, "₱500.00")
        productList.add(shopProducts)

        shopProducts = Product("AMD Ryzen 7 5700X 3.4GHz 65W", "8 CPU cores and 16 threads, 3.4GHz base clock...", R.drawable.amdryzen75700x, "₱10,000.00")
        productList.add(shopProducts)

        shopProducts = Product("B450m Steel Legend AM4 Socket", "Supports DDR4 3533+ (OC) RAM, up to 64GB...", R.drawable.b450msteellegend, "₱5,450.00")
        productList.add(shopProducts)

        shopProducts = Product("Corsair Force Series MP500 M.2 NVMe", "Available in 120GB, 240GB and 480GB capacities...", R.drawable.corsairmp500m2nvmepciegen3x4ssd, "₱3,000.00")
        productList.add(shopProducts)

        shopProducts = Product("GALAX GeForce RTX 3060TI 1-Click OC", "2nd Gen Ray Tracing Cores, 3rd Gen Tensor Cores...", R.drawable.galaxrtx3060ti, "₱15,000.00")
        productList.add(shopProducts)

        shopProducts = Product("GALAX GeForce RTX 3060TI 1-Click OC", "2nd Gen Ray Tracing Cores, 3rd Gen Tensor Cores...", R.drawable.galaxrtx3060ti, "₱15,000.00")
        productList.add(shopProducts)

        shopProducts = Product("GALAX GeForce RTX 3060TI 1-Click OC", "2nd Gen Ray Tracing Cores, 3rd Gen Tensor Cores...", R.drawable.galaxrtx3060ti, "₱15,000.00")
        productList.add(shopProducts)

        shopProducts = Product("GALAX GeForce RTX 3060TI 1-Click OC", "2nd Gen Ray Tracing Cores, 3rd Gen Tensor Cores...", R.drawable.galaxrtx3060ti, "₱15,000.00")
        productList.add(shopProducts)

        shopProducts = Product("GALAX GeForce RTX 3060TI 1-Click OC", "2nd Gen Ray Tracing Cores, 3rd Gen Tensor Cores...", R.drawable.galaxrtx3060ti, "₱15,000.00")
        productList.add(shopProducts)

        shopProducts = Product("GALAX GeForce RTX 3060TI 1-Click OC", "2nd Gen Ray Tracing Cores, 3rd Gen Tensor Cores...", R.drawable.galaxrtx3060ti, "₱15,000.00")
        productList.add(shopProducts)

        shopProducts = Product("GALAX GeForce RTX 3060TI 1-Click OC", "2nd Gen Ray Tracing Cores, 3rd Gen Tensor Cores...", R.drawable.galaxrtx3060ti, "₱15,000.00")
        productList.add(shopProducts)

        shopProducts = Product("GALAX GeForce RTX 3060TI 1-Click OC", "2nd Gen Ray Tracing Cores, 3rd Gen Tensor Cores...", R.drawable.galaxrtx3060ti, "₱15,000.00")
        productList.add(shopProducts)

    }
}