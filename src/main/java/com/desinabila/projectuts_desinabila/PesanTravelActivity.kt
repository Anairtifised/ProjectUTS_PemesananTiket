package com.desinabila.projectuts_desinabila

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import com.desinabila.projectuts_desinabila.R.id.booking_hotel
import com.desinabila.projectuts_desinabila.R.id.booking_kereta
import com.desinabila.projectuts_desinabila.R.id.profile
import com.desinabila.projectuts_desinabila.R.id.riwayat
import com.desinabila.projectuts_desinabila.R.id.sigout
import com.desinabila.projectuts_desinabila.R.id.tentang_aplikasi

class PesanTravelActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesan_travel)

        val btnlogin = findViewById<Button>(sigout)
        btnlogin.setOnClickListener(this)
        val btnProfil = findViewById<ImageButton>(profile)
        btnProfil.setOnClickListener(this)
        val btnHistory = findViewById<ImageButton>(riwayat)
        btnHistory.setOnClickListener(this)
        val btnKereta = findViewById<ImageButton>(booking_kereta)
        btnKereta.setOnClickListener(this)
        val btnHotel = findViewById<ImageButton>(booking_hotel)
        btnHotel.setOnClickListener(this)
        val btnTentang = findViewById<ImageButton>(tentang_aplikasi)
        btnTentang.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id){
            sigout -> {
                val moveIntent = Intent(this@PesanTravelActivity,
                    MainActivity::class.java)
                startActivity(moveIntent)
            }
            profile -> {
                val moveIntent = Intent(this@PesanTravelActivity,
                    ProfileActivity::class.java)
                startActivity(moveIntent)
            }
            riwayat -> {
                val moveIntent = Intent(this@PesanTravelActivity,
                    RiwayatActivity::class.java)
                startActivity(moveIntent)
            }
            booking_kereta -> {
                val moveIntent = Intent(this@PesanTravelActivity,
                    BookingKeretaActivity::class.java)
                startActivity(moveIntent)
            }
            booking_hotel -> {
                val moveIntent = Intent(this@PesanTravelActivity,
                    BookingHotelActivity::class.java)
                startActivity(moveIntent)
            }
            tentang_aplikasi -> {
                val moveIntent = Intent(this@PesanTravelActivity,
                    TentangAplikasiActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

}