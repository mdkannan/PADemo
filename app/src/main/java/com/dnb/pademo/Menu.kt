package com.dnb.pademo

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.app_bar_menu.*
import kotlinx.android.synthetic.main.content_menu.view.*
import android.support.v4.app.Fragment;

class Menu : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        setSupportActionBar(toolbar)



        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
        displaySelectedScreen(-1)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    fun displaySelectedScreen(id: Int) {

      var fragmentNavigation =  when(id) {

                R.id.nav_book_space -> {
                    // Handle the camera action
                    AboutFragment()


                }
                R.id.nav_my_bookings -> {
                    BookingSpaceFragment()

                }
                R.id.nav_profile -> {
                    ProfileFragment()
                }
                R.id.nav_vehicle_info -> {
                    InfoFragment()
                }
                R.id.nav_support -> {
                    SupportFragment()
                }
                R.id.nav_payments -> {
                    PaymentsFragment()
                }
                R.id.nav_ref_earn -> {
                    ReferFragment()
                }
                R.id.nav_about -> {
                    AboutFragment()
                }
                R.id.nav_logout -> {
                    AboutFragment()
                }
            else -> {
                AboutFragment()
            }

        }

      supportFragmentManager.beginTransaction()
           .replace(R.id.relativeLayout, fragmentNavigation).commit()

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.

        displaySelectedScreen(item.itemId);
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
