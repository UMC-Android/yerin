package com.example.workbook4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.workbook4.databinding.ActivityConfirmBinding

class ConfirmActivity : AppCompatActivity() {
    private lateinit var binding: ActivityConfirmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConfirmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val memoText = intent.getStringExtra("memo")
        binding.textViewMemo.text = memoText
    }
}