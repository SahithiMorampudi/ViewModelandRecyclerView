package com.example.viewmodelandrecyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewmodelandrecyclerviewpractice.adapter.DetailsAdapter
import com.example.viewmodelandrecyclerviewpractice.databinding.ActivityMainBinding
import com.example.viewmodelandrecyclerviewpractice.model.Details
import com.example.viewmodelandrecyclerviewpractice.viewModel.MyViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myViewModel : MyViewModel
    private lateinit var detailsAdapter: DetailsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)


        myViewModel.getFirstName()
        myViewModel.getLastName()


        myViewModel._fName.observe(this){
            binding.firstname.text = it.toString()
        }

        myViewModel._lName.observe(this){
            binding.lastName.text = it.toString()
        }


        val details = Details("Virat Kohli","RCB")
        val details1 = Details("Shubham Gill","GT")
        val details2 = Details("Hardik Pandya","GT")
        val details3 = Details("Rohit Sharma","MI")
        val details4 = Details("SKY","MI")
        val details5 = Details("Bhuvi","SRH")
        val details6 = Details("Ishan Kishan","MI")

        val allDetails = arrayListOf<Details>(details,details1,details2,details3,details4,details5,details6)

        detailsAdapter = DetailsAdapter(allDetails)

        /*val recyclerView = findViewById<RecyclerView>(R.id.playersRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = detailsAdapter*/

        binding.playersRecyclerView.layoutManager = LinearLayoutManager(this)

        /*with(binding){
            playersRecyclerView.adapter = detailsAdapter
        }*/
        binding.playersRecyclerView.adapter = detailsAdapter

    }
}