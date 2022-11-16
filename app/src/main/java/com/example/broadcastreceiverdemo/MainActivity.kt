package com.example.broadcastreceiverdemo

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

import android.content.IntentFilter
import android.widget.Button


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init();
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            println("Rishabh btn clicked");
            val filter = Intent();
            filter.action = "com.android.rishabh.demoBroadcast";
            sendBroadcast(filter);
        }
    }

    fun init() {
        println("Rishabh init function is called");
        val filter = IntentFilter();
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        filter.addAction(Intent.ACTION_BOOT_COMPLETED);
        filter.addAction("com.android.rishabh.demoBroadcast");
        val mReceiver:BootCompletedReceiverDemo = BootCompletedReceiverDemo();
        registerReceiver(mReceiver, filter);
    }
}
