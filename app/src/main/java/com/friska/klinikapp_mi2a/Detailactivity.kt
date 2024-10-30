package com.friska.klinikapp_mi2a

import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Detailactivity : AppCompatActivity() {
    private lateinit var imgDetailDokter : ImageView
    private lateinit var txtDetailNamaDokter : TextView
    private lateinit var txtDetailSpesialis : TextView
    private lateinit var txtDetailReview : TextView
    private lateinit var txtDetailNilai : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailactivity)

        imgDetailDokter = findViewById(R.id.imgDetailDokter)
        txtDetailNamaDokter = findViewById(R.id.txtDetailNamaDokter)
        txtDetailSpesialis = findViewById(R.id.txtDetailSpesialis)
        txtDetailReview = findViewById(R.id.txtDetailReview)
        txtDetailNilai = findViewById(R.id.txtDetailNilai)

        //get Data
        val detailNama = intent.getStringExtra("NamaDoctor")
        val detailSpec = intent.getStringExtra("Spesdoctors")
        val detailreview= intent.getStringExtra("JumlahReview")
        val detailRating = intent.getStringExtra("JumlahRating")
        val detailImg = intent.getIntExtra("ImgDoctor",0)
        //set data ke widget

        txtDetailNamaDokter.setText(detailNama)
        txtDetailNilai.setText(detailRating)
        txtDetailReview.setText(detailreview)
        txtDetailSpesialis.setText(detailSpec)
        imgDetailDokter.setImageResource(detailImg)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}