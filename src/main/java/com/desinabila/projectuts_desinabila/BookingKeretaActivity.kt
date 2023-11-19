package com.desinabila.projectuts_desinabila

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import com.desinabila.projectuts_desinabila.R.id.anakitem
import com.desinabila.projectuts_desinabila.R.id.asal
import com.desinabila.projectuts_desinabila.R.id.bokingsekarang
import com.desinabila.projectuts_desinabila.R.id.date
import com.desinabila.projectuts_desinabila.R.id.dewasaitem
import com.desinabila.projectuts_desinabila.R.id.tujuan
import com.google.android.material.textfield.TextInputEditText

class BookingKeretaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_kereta)

        val spinners = findViewById<Spinner>(asal)
        val spinner1 = findViewById<Spinner>(tujuan)
        val spinner2 = findViewById<Spinner>(dewasaitem)
        val spinner3 = findViewById<Spinner>(anakitem)
        val date = findViewById<TextInputEditText>(date)

        ArrayAdapter.createFromResource(this, R.array.asal, android.R.layout.simple_spinner_item)
            .also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinners.adapter = adapter
            }

        ArrayAdapter.createFromResource(this, R.array.tujuan, android.R.layout.simple_spinner_item)
            .also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinner1.adapter = adapter
            }

        ArrayAdapter.createFromResource(
            this,
            R.array.jumlah_dewasa,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner2.adapter = adapter
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.jumlah_anak,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner3.adapter = adapter
        }

        val bookBtn = findViewById<Button>(bokingsekarang)

        bookBtn.setOnClickListener {
            val selectedDate = date.text.toString()
            val selectedSpinners = spinners.selectedItem.toString()
            val selectedSpinner2 = spinner2.selectedItem.toString()
            val selectedSpinner3 = spinner3.selectedItem.toString()
            val selectedSpinner1 = spinner1.selectedItem.toString()

            val intent = Intent(this@BookingKeretaActivity, RiwayatActivity::class.java)
            intent.putExtra("date", selectedDate)
            intent.putExtra("asal", selectedSpinners)
            intent.putExtra("tujuan", selectedSpinner1)
            intent.putExtra("dewasa", selectedSpinner2)
            intent.putExtra("anak", selectedSpinner3)

            startActivity(intent)
        }
    }
}