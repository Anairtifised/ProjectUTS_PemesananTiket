package com.desinabila.projectuts_desinabila

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.desinabila.projectuts_desinabila.R.id.alamat
import com.desinabila.projectuts_desinabila.R.id.anak
import com.desinabila.projectuts_desinabila.R.id.asal
import com.desinabila.projectuts_desinabila.R.id.backhome
import com.desinabila.projectuts_desinabila.R.id.cekin
import com.desinabila.projectuts_desinabila.R.id.cekout
import com.desinabila.projectuts_desinabila.R.id.date
import com.desinabila.projectuts_desinabila.R.id.dewasa
import com.desinabila.projectuts_desinabila.R.id.nama
import com.desinabila.projectuts_desinabila.R.id.tujuan

class RiwayatActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat)

        val intent = intent
        val dates = intent.getStringExtra("date")
        val asals = intent.getStringExtra("asal")
        val tujuans = intent.getStringExtra("tujuan")
        val dewasas = intent.getStringExtra("dewasa")
        val anaks = intent.getStringExtra("anak")

        val namas = intent.getStringExtra("nama")
        val alamats = intent.getStringExtra("alamat")
        val cekins = intent.getStringExtra("Check In")
        val cekouts = intent.getStringExtra("Check Out")

        val date = findViewById<TextView>(date)
        val asal = findViewById<TextView>(asal)
        val tujuan = findViewById<TextView>(tujuan)
        val dewasa = findViewById<TextView>(dewasa)
        val anak = findViewById<TextView>(anak)
        val nama = findViewById<TextView>(nama)
        val alamat = findViewById<TextView>(alamat)
        val cekin = findViewById<TextView>(cekin)
        val cekout = findViewById<TextView>(cekout)

        asal.text = ":"+asals
        date.text = ":"+dates
        tujuan.text = ":"+tujuans
        dewasa.text = ":"+dewasas

        anak.text = ":"+anaks
        nama.text = ":"+namas
        alamat.text = ":"+alamats
        cekin.text = ":"+cekins
        cekout.text = ":"+cekouts

        val btnLogout = findViewById<Button>(backhome)
        btnLogout.setOnClickListener{
            val intent = Intent(this@RiwayatActivity, PesanTravelActivity::class.java)
            startActivity(intent)
        }
    }
}
