package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text


class amdbuilder : AppCompatActivity() {


    private lateinit var amdProcessor_addButton : ImageView
    private lateinit var imgBackarrow : ImageView
    private lateinit var tv_processorName : TextView
    private lateinit var processorImage : ImageView
    private lateinit var processor_description : TextView
    private lateinit var processor_price : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amdbuilder)

        amdProcessor_addButton = findViewById(R.id.img_add_processor_amdbuilder)
        imgBackarrow = findViewById(R.id.img_backArrow)
        tv_processorName = findViewById(R.id.tv_amdProcessor_amdbuilder)
        processorImage = findViewById(R.id.processor_image)
        processor_description = findViewById(R.id.processor_description)
        processor_price = findViewById(R.id.processor_price)




        val getr9Title = intent.getStringExtra("Ryzen 9 5900x")
        tv_processorName.text = getr9Title

        val getr9Price = intent.getStringExtra("tv_r9_price")
        processor_price.text = getr9Price

        val getr9Description = intent.getStringExtra("tv_r9_description")
        processor_description.text = getr9Description

        val getImgExt = intent.getIntExtra("img_ryzen9", 0)
        if (getImgExt != 0) {
            processorImage.setImageResource(getImgExt)
        }




        amdProcessor_addButton.setOnClickListener {
            val int = Intent(this, AmdProcessorProducts::class.java)
            startActivity(int)
            finish()
        }

        imgBackarrow.setOnClickListener {
            val int = Intent(this, rvHompagee::class.java)
            startActivity(int)
            finish()
        }

        tv_processorName.text = getr9Title ?: "AMD Processor"
        processor_price.text = getr9Price ?: ""
        processor_description.text = getr9Description ?: ""



    }
}