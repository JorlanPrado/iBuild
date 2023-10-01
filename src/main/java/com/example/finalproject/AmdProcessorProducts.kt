package com.example.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class AmdProcessorProducts : AppCompatActivity() {

    private  var recyclerView : RecyclerView? = null
    private  var amdbuilder_Adapter : amdbuilderAdapter? = null
    private  var amd_processorList = mutableListOf<AmdBuilderDataClass>()

    private lateinit var bt_select : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amd_processor_products)


        amd_processorList = ArrayList()
        recyclerView = findViewById<View>(R.id.rv_processorProducts) as RecyclerView

        amdbuilder_Adapter = amdbuilderAdapter(this@AmdProcessorProducts, amd_processorList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 1)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = amdbuilder_Adapter

        amdProducts()


//        bt_select = findViewById(R.id.bt_select)
//        bt_select.setOnClickListener {
//            val int = Intent(this, amdbuilder::class.java)
//            int.putExtra("Ryzen 9 5900x", title.text.toString())
//            int.putExtra("img_ryzen9", R.drawable.amdryzen)
//            int.putExtra("tv_r9_price", tv_r9_price.text.toString())
//            int.putExtra("tv_r9_description", tv_r9_description.text.toString())
//            startActivity(int)
//        }

    }
    private fun amdProducts(){
        var amdProductModel = AmdBuilderDataClass("AMD Ryzen 3 3200g", "Socket: AM4\nBase clock: 3.6 GHz\nBoost clock: 4 GHz\nL3 cache: 4 MB\nTDP: 65 W", "₱10,000.00", R.drawable.ryzen33200g)
        amd_processorList.add(amdProductModel)


        amdProductModel = AmdBuilderDataClass("AMD Ryzen 5 3600", "Has 1 PCIe 3.0 x16, 1 PCIe 2.0 x16, 1 PCIe 2.0 x1, and 4 SATA3 slots\nSupports AMD Quad CrossFireX™", "₱10,000.00", R.drawable.ryzen53600)
        amd_processorList.add(amdProductModel)

        amdProductModel = AmdBuilderDataClass("AMD Ryzen 5 5600G", "Socket: AM4\nClockspeed: 3.9 GHz\nTurbo Speed: 4.4 GHz\nCores: 6\nThreads: 12\nTDP: 65 W", "₱10,000.00", R.drawable.ryzen55600g)
        amd_processorList.add(amdProductModel)


    }
}

