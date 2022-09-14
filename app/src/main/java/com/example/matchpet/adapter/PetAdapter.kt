package com.example.matchpet.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.matchpet.R
import com.example.matchpet.data.model.pet.Pet

class PetAdapter(
    private val pets: List<Pet>
) : RecyclerView.Adapter<PetAdapter.PetViewHolder>() {

    class PetViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.card_view, parent, false)
        return PetViewHolder(view)
    }

    override fun onBindViewHolder(holder: PetViewHolder, position: Int) {
        val pet = pets[position]

        holder.itemView.findViewById<TextView>(R.id.tvPetName)
            .text = pet.name

        holder.itemView.findViewById<TextView>(R.id.tvPetCity)
            .text = pet.city

        holder.itemView.findViewById<TextView>(R.id.tvPetType)
            .text = pet.type

    }

    override fun getItemCount(): Int = pets.size

}
