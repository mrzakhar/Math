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

public class Read1011ProstZadachi extends AppCompatActivity {
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
        setContentView(R.layout.read_layout1011_2);


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

        des1.setText("Килограмм орехов стоит 75 рублей. Маша купила 4 кг 400 г орехов. Сколько рублей сдачи она должна получить с 350 рублей?");
        des2.setText("Павел Иванович купил американский автомобиль, на спидометре которого скорость измеряется в милях в час. Американская миля равна 1609 м. Какова скорость автомобиля в километрах в час, если спидометр показывает 50 миль в час? Ответ округлите до целого числа");
        des3.setText("Поезд Казань-Москва отправляется в 21:35, а прибывает в 10:35 на следующий день (время московское). Сколько часов поезд находится в пути?");
        des4.setText("Маша отправила SMS-сообщения с новогодними поздравлениями своим 16 друзьям. Стоимость одного SMS-сообщения 1 рубль 30 копеек. Перед отправкой сообщения на счету у Маши было 30 рублей. Сколько рублей останется у Маши после отправки всех сообщений?");
        des5.setText("В книге Елены Молоховец «Подарок молодым хозяйкам» имеется рецепт пирога с черносливом. Для пирога на 10 человек следует взять 1/10 фунта чернослива. Сколько граммов чернослива следует взять для пирога, рассчитанного на 3 человек? Считайте, что 1 фунт равен 0,4 кг.");

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

        cb1011_1_1.setText("20");//правильный ответ
        cb1011_1_2.setText("30");
        cb1011_1_3.setText("45");
        cb1011_1_4.setText("12");

        cb1011_2_1.setText("56");
        cb1011_2_2.setText("80"); // правильный ответ
        cb1011_2_3.setText("67");
        cb1011_2_4.setText("30");


        cb1011_3_1.setText("13");// правильный ответ
        cb1011_3_2.setText("40");
        cb1011_3_3.setText("27");
        cb1011_3_4.setText("13");


        cb1011_4_1.setText("2.5");
        cb1011_4_2.setText("0.93");
        cb1011_4_3.setText("1");
        cb1011_4_4.setText("9.2"); // правильный ответ


        cb1011_5_1.setText("6");
        cb1011_5_2.setText("26");
        cb1011_5_3.setText("10");
        cb1011_5_4.setText("12"); // правильный ответ


        // обработка нажатия чекбоксов
        checked10_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cb1011_1_1.isChecked()){
                    countCorrent ++;
                }
                if (cb1011_2_2.isChecked()){
                    countCorrent ++;
                }
                if (cb1011_3_1.isChecked()){
                    countCorrent ++;
                }
                if (cb1011_4_4.isChecked()){
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
