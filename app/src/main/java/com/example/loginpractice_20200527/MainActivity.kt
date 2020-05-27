package com.example.loginpractice_20200527

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        eventBtn.setOnClickListener {

            Log.d("이벤트확인", "버튼 클릭")
            Log.e("이벤트확인","에러 로그 발생")
            Toast.makeText(this,"버튼 클릭 됨",Toast.LENGTH_LONG).show()

            val inputContent = contentEdt.text.toString()

            eventBtn.text = inputContent
        }
    }
}
