package com.example.demoarchcomp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.demoarchcomp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.user = User("Shubham", "Agarwal")

        // Specify the current activity as the lifecycle owner.
        // it's doing something but idk
        binding.setLifecycleOwner(this)
    }
}
