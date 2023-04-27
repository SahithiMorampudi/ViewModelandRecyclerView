package com.example.viewmodelandrecyclerviewpractice.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel(){

    private var fName= MutableLiveData<String>()
    private var lName = MutableLiveData<String>()

    val _fName: LiveData<String> get() = fName
    val _lName: LiveData<String> get() = lName

    fun getFirstName(){
        fName.value = "SAHITHI "
    }

    fun getLastName(){
        lName.value = "MORAMPUDI "
    }

}