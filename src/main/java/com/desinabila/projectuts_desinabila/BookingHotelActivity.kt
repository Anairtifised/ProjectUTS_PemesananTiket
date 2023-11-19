package com.desinabila.projectuts_desinabila

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.desinabila.projectuts_desinabila.R.id.alamat
import com.desinabila.projectuts_desinabila.R.id.bookingnow
import com.desinabila.projectuts_desinabila.R.id.cekin
import com.desinabila.projectuts_desinabila.R.id.cekout
import com.desinabila.projectuts_desinabila.R.id.nama


class BookingHotelActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_hotel)

        val book_btn = findViewById<Button>(bookingnow)
        val nama = findViewById<EditText>(nama)
        val alamat = findViewById<EditText>(alamat)
        val cekin = findViewById<EditText>(cekin)
        val cekout = findViewById<EditText>(cekout)

        book_btn.setOnClickListener {
            val nama = nama.text.toString()
            val alamat = alamat.text.toString()
            val cekin = cekin.text.toString()
            val cekout = cekout.text.toString()

            val intents = Intent(this@BookingHotelActivity,RiwayatActivity::class.java)
            intents.putExtra("nama",nama)
            intents.putExtra("alamat",alamat)
            intents.putExtra("Check In",cekin)
            intents.putExtra("Check Out",cekout)

            startActivity(intents)
        }
    }
}