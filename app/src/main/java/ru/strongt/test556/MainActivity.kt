package ru.strongt.test556

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_activity_button_push_me.setOnClickListener { Toast.makeText(this, "Bingo!!", Toast.LENGTH_LONG).show() }
    }
}
