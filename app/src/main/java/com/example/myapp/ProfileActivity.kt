package com.example.myapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)
        val toolbar = findViewById(R.id.tool_bar) as Toolbar?
        toolbar?.setTitle("Hakkımızda")
        toolbar?.setTitleTextColor(Color.BLACK)
        setSupportActionBar(toolbar);
    }
    //onCreateOptionsMenu ile, oluşturduğumuz menu.xml i çağırıyoruz.
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_profile -> {
                val intent =  Intent(this,ProfileActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.action_ana_sayfa -> {
                val intent =  Intent(this,MainActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}