package com.example.sun2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    /**
     * Menubar 作用： 显示 menu
     */
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.sunmenu, menu)
        return true
    }

    /**
     * Menubar 作用： 点击menu不同菜单，执行不同功能
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.sun_reflash -> {
                println("Jessice:11111")
                true
            }
            R.id.sun_game -> {
                println("Jessice:22222")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}