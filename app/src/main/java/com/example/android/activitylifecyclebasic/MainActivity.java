package com.example.android.activitylifecyclebasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/*
  Activity Lifecycle methods
  Calling Sequence :

  OnCreate() -> OnStart() -> OnPostResume() -> OnPause() -> OnStop() -> OnDestroy()

  Inside the actvity -> OnCreate(), OnStart(), OnPostResume()
  Outside the activiy -> OnPause(), OnStop(), OnDestroy()

 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "OnCreate Call", Toast.LENGTH_LONG).show();

       Button hitbttn = (Button)findViewById(R.id.click_me_btn);

       hitbttn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);

               intent.putExtra("Message1", "Hello from Activity");
               intent.putExtra("Message2", 1);

               startActivity(intent);

           }
       });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "OnStart Call", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(MainActivity.this, "OnPostResume Call", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "OnStop Call", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "OnPause Call", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "OnDestroy Call", Toast.LENGTH_LONG).show();
    }
}
