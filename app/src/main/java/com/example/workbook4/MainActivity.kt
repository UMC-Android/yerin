package com.example.workbook4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.workbook4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var memoText: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            val memo = binding.editTextMemo.text.toString().trim()
            if (memo.isNotEmpty()) {
                memoText = memo
                showConfirmDialog()
            }
        }
    }

    private fun showConfirmDialog() {
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setMessage("메모를 확인하시겠습니까?")
            .setCancelable(false)
            .setPositiveButton("확인") { dialog, _ ->
                showConfirmActivity()
                dialog.dismiss()
            }
            .setNegativeButton("취소") { dialog, _ ->
                dialog.dismiss()
            }
        val alert = dialogBuilder.create()
        alert.show()
    }

    private fun showConfirmActivity() {
        val intent = Intent(this, ConfirmActivity::class.java)
        intent.putExtra("memo", memoText)
        startActivity(intent)
        finish() // MainActivity 종료
    }
}