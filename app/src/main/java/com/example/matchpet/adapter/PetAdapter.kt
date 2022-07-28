package com.example.matchpet.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.matchpet.R
import com.example.matchpet.model.Pet

class PetAdapter(
    private val pets: List<Pet>
) : RecyclerView.Adapter<PetAdapter.PetViewHolder>() {

    class PetViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(pet: Pet) {
//            val name = itemView.findViewById<TextView>(R.id.tvPetName)
//            name.text = pet.name
//            val city = itemView.findViewById<TextView>(R.id.tvPetCity)
//            city.text = pet.city
//            val type = itemView.findViewById<TextView>(R.id.TypePet)
//            type.text = pet.type

/*          val sex = itemView.findViewById<EditText>(R.id.sexPet)
            val age = itemView.findViewById<EditText>(R.id.AgePet)
            val breed = itemView.findViewById<EditText>(R.id.tvBreed)
            val size = itemView.findViewById<EditText>(R.id.SizePet)
            val description = itemView.findViewById<EditText>(R.id.PetPersonality)
            val health = itemView.findViewById<EditText>(R.id.PetHealth)
            val care = itemView.findViewById<EditText>(R.id.PetCare)*/
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.card_view, parent, false)
        return PetViewHolder(view)
    }

    override fun onBindViewHolder(holder: PetViewHolder, position: Int) {
        val pet = pets[position]
        holder.vincula(pet)
    }

    override fun getItemCount(): Int = pets.size

}
