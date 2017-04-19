package com.example.pratikraj.quickdeal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
    }


    public void buyer(View view){

        Intent intent1 = new Intent(this,buyer.class);
        startActivity(intent1);


    }
    public void seller(View view){

        Intent intent2 = new Intent(this,seller.class);
        startActivity(intent2);
    }

}
