package com.alysson.apptestedeinterao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.alysson.apptestedeinterao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.img.setOnClickListener(this)
        edit()
    }

    override fun onClick(v: View) {
        toast()
    }

    private fun toast() {
        Toast.makeText(this, "oi", Toast.LENGTH_SHORT).show()
    }


    private fun edit() {
        val a = binding.textView
        val b = binding.editTextText
        val c = "Clique na androdzinho"

        b.addTextChangedListener {
            if (b.text.toString().count() <= 10) {
                a.text = b.text
            } else if (b.text.toString().count() > 10) {
                a.text = c
            }
        }
    }
}