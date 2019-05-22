
package com.dnb.pademo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView





import android.widget.Toast;
import com.github.florent37.singledateandtimepicker.SingleDateAndTimePicker;
import java.util.Date;
import com.github.florent37.singledateandtimepicker.dialog.SingleDateAndTimePickerDialog

import kotlinx.android.synthetic.main.fragment_about.view.*


class AboutFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)

       return inflater?.inflate(R.layout.fragment_about, null)

     //  val view = inflater?.inflate(R.layout.fragment_about, container,null)
    //  var date = TextView findViewById(R.id.dateText);

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var test = view?.findViewById<TextView>(R.id.dateText)

        Log.e("About Fragment" , "view created")
        SingleDateAndTimePickerDialog.Builder(context)
            .bottomSheet()
            .curved()
            .displayMinutes(false)
            .displayHours(false)
            .displayDays(false)
            .displayMonth(false)
            .displayYears(false)
            .displayDaysOfMonth(false)
            .displayListener {
                val e = Log.e("About Fragment", "Date -->${it.date}")
              //  test.text = "${it.date}"
            }
            .display()
    }

//return view;
}

