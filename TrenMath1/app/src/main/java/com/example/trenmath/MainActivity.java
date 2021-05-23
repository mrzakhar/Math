package com.example.trenmath;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    Button bt1_4,bt5_9,bt10_11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1_4 = (Button)findViewById(R.id.bt1_4);
        bt5_9 = (Button)findViewById(R.id.bt5_9);
        bt10_11= (Button)findViewById(R.id.bt10_11);

        // обработка нажатия кнопки для открытия тем 1-4 класс
        bt1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Unit14.class);
                startActivity(intent);
            }
        });

        // обработка нажатия кнопки для открытия тем 5-9 класс
        bt5_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Unit59.class);
                startActivity(intent);
            }
        });

        // обработка нажатия кнопки для открытия тем 10-11 класс
        bt10_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Unit1011.class);
                startActivity(intent);
            }
        });





    }


}