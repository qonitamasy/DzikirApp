package com.qonita.dzikirapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.qonita.dzikirapp.R
import com.qonita.dzikirapp.model.DzikirDoa

class DzikirDoaAdapter(private val listdzikirDoa: ArrayList<DzikirDoa>):
RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>(){

    inner class MyViewHolder (view : View): RecyclerView.ViewHolder(view){
        val tvDesc = view.findViewById<TextView>(R.id.tvDesc)
        val tvlafaz = view.findViewById<TextView>(R.id.tvlafaz)
        val tvTerjemah = view.findViewById<TextView>(R.id.tvTerjemah)
        


    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = MyViewHolder (
        LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doa,parent,false)
    )

    override fun onBindViewHolder(holder: DzikirDoaAdapter.MyViewHolder, position: Int) {
        val dzikir = listdzikirDoa[position]
        holder.tvDesc.text =dzikir.desc
        holder.tvlafaz.text = dzikir.lafaz
        holder.tvTerjemah.text = dzikir.terjemah
    }

    override fun getItemCount() = listdzikirDoa.size
}