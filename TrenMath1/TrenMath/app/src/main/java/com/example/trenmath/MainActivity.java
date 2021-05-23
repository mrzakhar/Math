package com.example.trenmath;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    DatabaseReference myMath; // объект, который хранит ссылку на бд
    String TASK_KEY = "10УРАВНЕНИЯ"; // группа для бд
    Button save,bt1_4,bt5_9,bt10_11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save = (Button)findViewById(R.id.save) ;
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



        myMath = FirebaseDatabase.getInstance().getReference(TASK_KEY);// получили бд
        /*
        //кнопка для записи данных в бд (не трогать код)
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // получаем id пользователя из бд (сами не создаем)
                //String id = mDataBase.getKey();
                //String nameUs = "ghbdtn";
                //String a1 = "ghbdtn";
                //String a2= "ghbdtn";
                //String a3 = "ghbdtn";
                //String a4 = "ghbdtn";

                //Task task = new Task(id, nameUs,a1,a2,a3,a4); // собрали данные для сохранения их бд
                if (!TextUtils.isEmpty(nameUs) ) { //проверка, что поля не пустые
                   // mDataBase.push().setValue(task); // передали объект для бд
                }*/
                 /*

                // Write a message to the database
                //FirebaseDatabase database = FirebaseDatabase.getInstance();
                //DatabaseReference myMath = database.getReference(TASK_KEY);
                //String id0 = myMath.getKey();// получаем id пользователя из бд (сами не создаем)
                // собираем все данные в объект
               // String n0 = "0";
                //Task task0 = new Task(id0,n0, "Найдите корень уравнения: (4/7)x=7*3/7",
                        "3", "5","14", "13"
                );

                myMath.push().setValue(task0); // записываем данные в бд

                String id1 = myMath.getKey();// получаем id пользователя из бд (сами не создаем)
                // собираем все данные в объект
                String n1 = "1";
                Task task1 = new Task(id1,n1, "Найдите корень уравнения: (2x+7)^2=(2x-1)^2",
                        "1", "-5","10", "-1.5"
                );
                myMath.push().setValue(task1); // записываем данные в бд


                String id2 = myMath.getKey();// получаем id пользователя из бд (сами не создаем)
                // собираем все данные в объект
                String n2 = "2";
                Task task2 = new Task(id2,n2, "Решите уравнение: (x-6)^2= -24x",
                        "8", "-4","34", "-6"
                );

                myMath.push().setValue(task2); // записываем данные в бд

                String id3 = myMath.getKey();// получаем id пользователя из бд (сами не создаем)
                // собираем все данные в объект
                String n3 = "3";
                Task task3 = new Task(id3,n3, "Решите уравнение: x^2+9=(x+9)^2",
                        "10", "9","-24", "-4"
                );

                myMath.push().setValue(task3); // записываем данные в бд

                String id4 = myMath.getKey();// получаем id пользователя из бд (сами не создаем)
                // собираем все данные в объект
                String n4 = "4";
                Task task4 = new Task(id4,n4, "Решите уравнение: (x-1)^3 = 8",
                        "-9", "5","-2", "3"
                );

                myMath.push().setValue(task4); // записываем данные в бд


                //создаём и отображаем текстовое уведомление
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Данные сохранены!",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });*/


    }


}