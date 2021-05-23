package com.example.trenmath;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;
import java.util.List;

public class Read1011ProstYravnenya extends AppCompatActivity {
    TextView number1, number2,number3,number4,number5,des1,des2,des3,des4,des5;
    CheckBox cb1011_1_1,cb1011_1_2,cb1011_1_3,cb1011_1_4,
            cb1011_2_1,cb1011_2_2,cb1011_2_3,cb1011_2_4,
            cb1011_3_1,cb1011_3_2,cb1011_3_3,cb1011_3_4,
            cb1011_4_1,cb1011_4_2,cb1011_4_3,cb1011_4_4,
            cb1011_5_1,cb1011_5_2,cb1011_5_3,cb1011_5_4;

    Button checked10_11;

    int countCorrent = 0;


    ArrayList<String> desNew = new ArrayList<String>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_layout1011_5);


        // включаем кнопку назад
        getSupportActionBar().setTitle("10-11 класс"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
        checked10_11 = (Button)findViewById(R.id.checked10_11);

        number1 = (TextView)findViewById(R.id.numberTask1011_1);
        number2 = (TextView)findViewById(R.id.numberTask1011_2);
        number3 = (TextView)findViewById(R.id.numberTask1011_3);
        number4 = (TextView)findViewById(R.id.numberTask1011_4);
        number5 = (TextView)findViewById(R.id.numberTask1011_5);
        // получаем список тем из ресурсов
        String[] numberTaskList = getResources().getStringArray(R.array.number_task);

        number1.setText(numberTaskList[0]);
        number2.setText(numberTaskList[1]);
        number3.setText(numberTaskList[2]);
        number4.setText(numberTaskList[3]);
        number5.setText(numberTaskList[4]);


        des1 = (TextView)findViewById(R.id.des_task1011_1);
        des2 = (TextView)findViewById(R.id.des_task1011_2);
        des3 = (TextView)findViewById(R.id.des_task1011_3);
        des4 = (TextView)findViewById(R.id.des_task1011_4);
        des5 = (TextView)findViewById(R.id.des_task1011_5);

        des1.setText("Найдите корень уравнения: (4/7)x=7*3/7");
        des2.setText("Найдите корень уравнения: (2x+7)^2=(2x-1)^2");
        des3.setText("Решите уравнение: (x-6)^2= -24x");
        des4.setText("Решите уравнение: x^2+9=(x+9)^2");
        des5.setText("Решите уравнение: (x-1)^3 = 8");

        cb1011_1_1 = (CheckBox) findViewById(R.id.cb1011_1_1);
        cb1011_1_2 = (CheckBox) findViewById(R.id.cb1011_1_2);
        cb1011_1_3 = (CheckBox) findViewById(R.id.cb1011_1_3);
        cb1011_1_4 = (CheckBox) findViewById(R.id.cb1011_1_4);


        cb1011_2_1 = (CheckBox) findViewById(R.id.cb1011_2_1);
        cb1011_2_2 = (CheckBox) findViewById(R.id.cb1011_2_2);
        cb1011_2_3 = (CheckBox) findViewById(R.id.cb1011_2_3);
        cb1011_2_4 = (CheckBox) findViewById(R.id.cb1011_2_4);

        cb1011_3_1 = (CheckBox) findViewById(R.id.cb1011_3_1);
        cb1011_3_2 = (CheckBox) findViewById(R.id.cb1011_3_2);
        cb1011_3_3 = (CheckBox) findViewById(R.id.cb1011_3_3);
        cb1011_3_4 =  (CheckBox) findViewById(R.id.cb1011_3_4);



        cb1011_4_1 = (CheckBox) findViewById(R.id.cb1011_4_1);
        cb1011_4_2 = (CheckBox) findViewById(R.id.cb1011_4_2);
        cb1011_4_3 = (CheckBox) findViewById(R.id.cb1011_4_3);
        cb1011_4_4 = (CheckBox) findViewById(R.id.cb1011_4_4);



        cb1011_5_1 = (CheckBox) findViewById(R.id.cb1011_5_1);
        cb1011_5_2 = (CheckBox) findViewById(R.id.cb1011_5_2);
        cb1011_5_3 = (CheckBox) findViewById(R.id.cb1011_5_3);
        cb1011_5_4 = (CheckBox) findViewById(R.id.cb1011_5_4);

        cb1011_1_1.setText("3");
        cb1011_1_2.setText("5");
        cb1011_1_3.setText("13"); //правильный ответ
        cb1011_1_4.setText("14");

        cb1011_2_1.setText("1");
        cb1011_2_2.setText("-5");
        cb1011_2_3.setText("10");
        cb1011_2_4.setText("-1.5"); // правильный ответ



        cb1011_3_1.setText("8");
        cb1011_3_2.setText("34");
        cb1011_3_3.setText("-4");
        cb1011_3_4.setText("6");// правильный ответ



        cb1011_4_1.setText("10");
        cb1011_4_2.setText("9");
        cb1011_4_3.setText("-4"); // правильный ответ
        cb1011_4_4.setText("-24");


        cb1011_5_1.setText("3"); // правильный ответ
        cb1011_5_2.setText("-2");
        cb1011_5_3.setText("5");
        cb1011_5_4.setText("-9");


        // обработка нажатия чекбоксов
        checked10_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cb1011_1_3.isChecked()){
                    countCorrent ++;
                }
                if (cb1011_2_4.isChecked()){
                    countCorrent ++;
                }
                if (cb1011_3_4.isChecked()){
                    countCorrent ++;
                }
                if (cb1011_4_3.isChecked()){
                    countCorrent ++;
                }
                if (cb1011_5_1.isChecked()){
                    countCorrent ++;
                }



                if (countCorrent==5){
                    String ans= "Правильный ответов "+ countCorrent + "/5";
                    //создаём и отображаем текстовое уведомление
                    Toast toast = Toast.makeText(getApplicationContext(),
                            ans,
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    countCorrent = 0;

                }
                else {
                    String ans= "Правильный ответов "+ countCorrent + "/5. Попробуйте снова!";
                    //создаём и отображаем текстовое уведомление
                    Toast toast = Toast.makeText(getApplicationContext(),
                            ans,
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    countCorrent = 0;
                }


            }
        });



    }



    //кнопка назад
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }



}
