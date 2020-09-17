package com.example.themeuiapplication

import android.os.Bundle

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class FavoriteActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.favorite_activity)

        val toolbarFavorite = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbarFavorite)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.action_favorite->{
                Toast.makeText(this,"Favorite",Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_delete->{
                Toast.makeText(this,"Delete",Toast.LENGTH_SHORT).show()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }
}