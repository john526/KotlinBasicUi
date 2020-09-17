package com.example.themeuiapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View

import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // indiquez au MainActivity qu'il doit utiliser notre toolBar
        // recuperez l'id de notre toolBar

        val toolBar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolBar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_favorite ->{
                val intent = Intent(this, FavoriteActivity::class.java)
                startActivity(intent)
                return true
            }

            R.id.action_delete ->{
                Toast.makeText(this,"Delete",Toast.LENGTH_SHORT).show()
                return true
            }

            else ->return super.onOptionsItemSelected(item)
        }
        return true
    }
}
