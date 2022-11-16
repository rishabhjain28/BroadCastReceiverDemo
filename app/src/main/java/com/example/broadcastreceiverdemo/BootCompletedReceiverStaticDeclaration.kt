package com.example.broadcastreceiverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class BootCompletedReceiverStaticDeclaration : BroadcastReceiver() {
    private val TAG: String = com.example.broadcastreceiverdemo.BootCompletedReceiverStaticDeclaration::class.java.getSimpleName()
    override fun onReceive(p0: Context?, p1: Intent?) {
        val msg = "Rishabh Received Broadcast is  " + p1?.action;
        println(TAG + msg);
    }
}