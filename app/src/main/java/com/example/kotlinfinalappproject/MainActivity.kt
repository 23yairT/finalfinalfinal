package com.example.kotlinfinalappproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.kotlinfinalappproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragmentOneButton.setOnClickListener {

            replacementFragment(fragmentOne())
        }

        binding.fragmentTwoButton.setOnClickListener {

            replacementFragment(fragmentTwo())
        }

        binding.fragmentThreeButton.setOnClickListener {

            replacementFragment(fragmentThree())
        }

        binding.fragmentFourButton.setOnClickListener {

            replacementFragment(fragmentFour())
        }

        binding.fragmentFiveButton.setOnClickListener {

            replacementFragment(fragmentFive())
        }

        binding.fragmentSixButton.setOnClickListener {

            replacementFragment(fragmentSix())
        }

        binding.fragmentSevenButton.setOnClickListener {

            replacementFragment(fragmentSeven())
        }

        binding.fragmentEightButton.setOnClickListener {

            replacementFragment(fragmentEight())
        }

        binding.fragmentNineButton.setOnClickListener {

            replacementFragment(fragmentNine())
        }

        binding.fragmentTenButton.setOnClickListener {

            replacementFragment(fragmentTen())
        }
    }

    private fun replacementFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()

    }

    private fun cookedBread(msg: String?) {
        val toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT)
        toast.show()
    }

    fun displayCookedBread(v: View?) {
        cookedBread("What?")
    }

    fun displayCookedBread2(v: View?) {
        cookedBread("Not Strong")
    }

    fun displayCookedBread3(v: View?) {
        cookedBread("Sacrifice Accepted")
    }
}