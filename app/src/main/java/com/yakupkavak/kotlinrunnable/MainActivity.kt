package com.yakupkavak.kotlinrunnable

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.yakupkavak.kotlinrunnable.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var myNumber = 0

        binding.button.setOnClickListener {
            myNumber = binding.editTextNumber.text.toString().toInt()
            binding.deluxe.text = "Deluxe: ${(myNumber* 2.3).toInt()}"
            binding.superior.text = "Superior: ${(myNumber* 2.7).toInt()}"
            binding.senior.text = "Senior: ${(myNumber* 2.9).toInt()}"
            binding.sky.text = "Sky: ${(myNumber* 2.65).toInt()}"
            binding.family.text = "Family: ${(myNumber* 3.25).toInt()}"
            binding.ekonomik.text = "Economic: ${(myNumber* 1.75).toInt()}"








        }





    }

    /*

    var number = 0
    var runnable: Runnable = Runnable {  }
    var handler : Handler = Handler(Looper.getMainLooper())
    fun Stop(view: View){
        //Thread.sleep(1000) direk appi uyutuyo pezevenk
        handler.removeCallbacks(runnable)
        number = 0
        textView.text = "Time: 0"

    }
    fun Start(view: View){
        number = 0
        runnable = object : Runnable{
            override fun run() {
                number = number+1
                textView.text = "Time: ${number}"
                handler.postDelayed(this,1000) //runnablei referans veriyoruz
            }

        }
        handler.post(runnable)
    }*/
}