package jp.techacademy.ushio.zaizen.kadai2humanclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1=Human("山田",35,"音楽")
        human1.say()
        human1.think()

        val human2=Human("山本",28, "読書")
        human2.say()
        human2.think()
    }
}