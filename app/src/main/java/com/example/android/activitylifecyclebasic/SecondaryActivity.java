package com.example.android.activitylifecyclebasic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by UFO_24 on 14-02-2018.
 */

public class SecondaryActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();

        String msg1 = extras.getString("Message1");
        int msg2= extras.getInt("Message2");


        setContentView(R.layout.activity_second);
        TextView textView =  (TextView)findViewById(R.id.sec_act_text_view);

        textView.setText(msg1+" "+String.valueOf(msg2));

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(SecondaryActivity.this, "OnStart Call 2", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(SecondaryActivity.this, "OnPostResume Call 2", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(SecondaryActivity.this, "OnStop Call 2", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(SecondaryActivity.this, "OnPause Call 2", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(SecondaryActivity.this, "OnDestroy Call 2", Toast.LENGTH_LONG).show();
    }
}
