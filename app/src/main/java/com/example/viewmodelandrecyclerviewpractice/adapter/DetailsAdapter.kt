package com.example.viewmodelandrecyclerviewpractice.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewmodelandrecyclerviewpractice.databinding.ListPlayersBinding
import com.example.viewmodelandrecyclerviewpractice.model.Details

class DetailsAdapter(private val list : ArrayList<Details>):
    RecyclerView.Adapter<DetailsAdapter.ViewHolder>() {

    /*class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val playerName : TextView = itemView.findViewById(R.id.player)
        val teamName : TextView = itemView.findViewById(R.id.team)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_players, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val value = list[position]
        holder.playerName.text = value.playerName
        holder.teamName.text = value.teamName
    }

    override fun getItemCount(): Int {
        return list.size
    }*/


    private lateinit var binding: ListPlayersBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ListPlayersBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.view.details = list[position]

    }

    override fun getItemCount(): Int  {
        return  list.size
    }

    class ViewHolder(var view: ListPlayersBinding): RecyclerView.ViewHolder(view.root){

    }


}