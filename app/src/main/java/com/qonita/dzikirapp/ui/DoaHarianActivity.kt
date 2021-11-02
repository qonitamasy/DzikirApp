package com.qonita.dzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.qonita.dzikirapp.R
import com.qonita.dzikirapp.model.DzikirDoa

class DoaHarianActivity : AppCompatActivity() {
    private lateinit var rvDoaharian :RecyclerView
    private var dzikirDoa : ArrayList<DzikirDoa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        rvDoaharian = findViewById(R.id.rvDoaHarian)
        initData ()

    }

    private fun initData() {
        val desc = resources.getStringArray(R.array.dzikir_doa_harian)
        val lafaz = resources.getStringArray(R.array.lafaz_dzikir_doa_harian)
        val terjemah = resources.getStringArray(R.array.terjemah_dzikir_doa_harian)

        dzikirDoa.clear()
        for (data in desc .indices){
            dzikirDoa.add (
                DzikirDoa(desc[data], lafaz[data], terjemah[data])
                    )
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}