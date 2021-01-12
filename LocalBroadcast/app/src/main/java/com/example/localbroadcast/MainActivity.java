package com.example.localbroadcast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private LocalBroadCastReceiver localBroadCastReceiver;
private TextView mTvName;
private TextView mTvAge;
private Button mBtnSendMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewsAndListners();
        registerLocalBroadCast();
    }

    private void initViewsAndListners() {
        mTvName = findViewById(R.id.tvName);
        mTvAge = findViewById(R.id.tvAge);
        mBtnSendMessage = findViewById(R.id.btnSendMessage);


        mBtnSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent("com.mintu.local.broadcast.message");
                intent.putExtra("data", "My name is Akash");
                sendBroadcast(intent);


            }
        });


    }


    private  void registerLocalBroadCast(){
        localBroadCastReceiver = new LocalBroadCastReceiver();
        IntentFilter intentFilter = new IntentFilter("com.mintu.local.broadcast.message");
        registerReceiver(localBroadCastReceiver, intentFilter);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(localBroadCastReceiver);
    }

    private  class LocalBroadCastReceiver extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getExtras() != null){
                String data = intent.getStringExtra("data");
                mTvName.setText(data);
            }

        }



    }

}