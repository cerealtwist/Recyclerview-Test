package com.example.recyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val item1 = intent.getParcelableExtra<Items>(MainActivity.INTENT_PARCELABLE)

        val imgItems1 = findViewById<ImageView>(R.id.img_item_photo)
        val nameItems = findViewById<TextView>(R.id.tv_item_name)
        val descItems = findViewById<TextView>(R.id.tv_item_description)

        imgItems1.setImageResource(item1?.imgItems1!!)
        nameItems.text = item1.nameItems
        descItems.text = item1.descItems

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}