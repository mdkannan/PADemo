package com.dnb.pademo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class login : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btn_new_activity = findViewById(R.id.loginid) as Button
        btn_new_activity.setOnClickListener {
            val intent = Intent(this@login, Menu::class.java)
            intent.putExtra("title","Kannan")
            val userName = intent.getStringExtra("title")
            findViewById<TextView>(R.id.loginTxt).text = userName
            startActivity(intent);
        }

    }
}
