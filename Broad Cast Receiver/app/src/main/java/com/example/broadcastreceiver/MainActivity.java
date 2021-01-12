package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private BroadCastReceiverWithoutPermission broadCastReceiverWithoutPermission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerBroadCastWithoutPermission();

    }
    private void registerBroadCastWithoutPermission() {
        IntentFilter intentFilter = new IntentFilter("com.lloyd.broadcast");
        broadCastReceiverWithoutPermission = new BroadCastReceiverWithoutPermission();
        registerReceiver(broadCastReceiverWithoutPermission, intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(broadCastReceiverWithoutPermission);
    }




}