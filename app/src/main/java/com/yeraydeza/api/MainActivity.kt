package com.yeraydeza.api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.yeraydeza.api.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragment1Btn.setOnClickListener{

            replaceFragment(Chats())

        }

        binding.fragment2Btn.setOnClickListener{

            replaceFragment(Profile())

        }
    }

    private fun replaceFragment(fragment: Fragment) {

            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer,fragment)
            fragmentTransaction.commit()


    }
}