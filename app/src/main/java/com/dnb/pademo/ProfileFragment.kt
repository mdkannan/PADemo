package com.dnb.pademo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ProfileFragment : Fragment(){
    //val text: TextView = findViewById(R.id.textProfile) as TextView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)
        return inflater?.inflate(R.layout.fragment_profile, null)
       // val str: String = intent.getStringExtra("title")



    }
}