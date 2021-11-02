package com.qonita.dzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.qonita.dzikirapp.R
import com.qonita.dzikirapp.adapter.DzikirDoaAdapter
import com.qonita.dzikirapp.model.DataDzikirDoa
import com.qonita.dzikirapp.model.DzikirDoa

class QauliyahActivity : AppCompatActivity() {
    private lateinit var rvQauliyah : RecyclerView
    private var listQauliyah : ArrayList <DzikirDoa> = arrayListOf()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qauliyah)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        rvQauliyah = findViewById(R.id.rvQauliyah)
        listQauliyah.clear()
        listQauliyah.addAll(DataDzikirDoa.listQauliyah)

        rvQauliyah.layoutManager = LinearLayoutManager(this)
        rvQauliyah.adapter = DzikirDoaAdapter(listQauliyah)
        rvQauliyah.setHasFixedSize(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}