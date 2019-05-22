package com.dnb.pademo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v7.app.AppCompatActivity


class BookingSpaceFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)
        return inflater?.inflate(R.layout.fragment_booking_space, null)

        //to change title of activity
      //  val actionBar = supportActionBar
      //  actionBar!!.title = "About"

        getActivity()?.getActionBar()?.setTitle("Whatever you want");
    }
}