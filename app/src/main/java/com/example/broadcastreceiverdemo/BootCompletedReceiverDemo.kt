package com.example.broadcastreceiverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class BootCompletedReceiverDemo : BroadcastReceiver() {

    private val TAG: String = com.example.broadcastreceiverdemo.BootCompletedReceiverDemo::class.java.getSimpleName()
    override fun onReceive(p0: Context?, p1: Intent?) {
        val msg = "Rishabh Received Broadcast is  " + p1?.action;
        if(p1?.action == "com.android.rishabh.demoBroadcast") {
            println(msg);
        } else {
            println("rishabh broadcast received");
        }

    }


}