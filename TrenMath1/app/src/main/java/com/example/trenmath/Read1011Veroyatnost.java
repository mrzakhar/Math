package com.example.trenmath;

import android.graphics.Color;
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

public class Read1011Veroyatnost extends AppCompatActivity {
    TextView number1, number2,number3,number4,number5,des1,des2,des3,des4,des5;
    CheckBox cb1011_1_1,cb1011_1_2,cb1011_1_3,cb1011_1_4,
            cb1011_2_1,cb1011_2_2,cb1011_2_3,cb1011_2_4,
            cb1011_3_1,cb1011_3_2,cb1011_3_3,cb1011_3_4,
            cb1011_4_1,cb1011_4_2,cb1011_4_3,cb1011_4_4,
            cb1011_5_1,cb1011_5_2,cb1011_5_3,cb1011_5_4;

    Button checked10_11;

    int countCorrent = 0;
    int countInCorrent = 0;

    ArrayList<String> desNew = new ArrayList<String>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_layout1011_1);


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

        des1.setText("В кармане у Миши было четыре конфеты — «Грильяж», «Белочка», «Коровка» и «Ласточка», а также ключи от квартиры. Вынимая ключи, Миша случайно выронил из кармана одну конфету. Найдите вероятность того, что потерялась конфета «Грильяж» ");
        des2.setText("На экзамен вынесено 60 вопросов, Андрей не выучил 3 из них. Найдите вероятность того, что ему попадется выученный вопрос");
        des3.setText("В среднем из 1400 садовых насосов, поступивших в продажу, 7 подтекают. Найдите вероятность того, что один случайно выбранный для контроля насос не подтекает.");
        des4.setText("Фабрика выпускает сумки. В среднем 8 сумок из 100 имеют скрытые дефекты. Найдите вероятность того, что купленная сумка окажется без дефектов.");
        des5.setText("При производстве в среднем на каждые 2982 исправных насоса приходится 18 неисправных. Найдите вероятность того, что случайно выбранный насос окажется неисправным");

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

        cb1011_1_1.setText("0.2");
        cb1011_1_2.setText("0.5");
        cb1011_1_3.setText("0.75");
        cb1011_1_4.setText("0.25"); //правильный ответ


        cb1011_2_1.setText("0.5");
        cb1011_2_2.setText("0.95"); // правильный ответ
        cb1011_2_3.setText("0.75");
        cb1011_2_4.setText("0.25");


        cb1011_3_1.setText("0.995");// правильный ответ
        cb1011_3_2.setText("0.45");
        cb1011_3_3.setText("0.5");
        cb1011_3_4.setText("0.25");

        cb1011_4_1.setText("0.4");
        cb1011_4_2.setText("0.93");// правильный ответ
        cb1011_4_3.setText("0.87");
        cb1011_4_4.setText("0.63");

        cb1011_5_1.setText("0.14");
        cb1011_5_2.setText("0.67");
        cb1011_5_3.setText("0.003");
        cb1011_5_4.setText("0.006"); // правильный ответ


        // обработка нажатия чекбоксов
        checked10_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cb1011_1_4.isChecked()){
                    countCorrent ++;
                }
                if (cb1011_2_2.isChecked()){
                    countCorrent ++;
                }
                if (cb1011_3_1.isChecked()){
                    countCorrent ++;
                }
                if (cb1011_4_2.isChecked()){
                    countCorrent ++;
                }
                if (cb1011_5_4.isChecked()){
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
