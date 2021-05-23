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

public class Read1011PricladnyeZadachi extends AppCompatActivity {
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
        setContentView(R.layout.read_layout1011_3);


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

        des1.setText("После дождя уровень воды в колодце может повыситься. Мальчик измеряет время t падения небольших камешков в колодец и рассчитывает расстояние до воды по формуле h=5t^2, где h – расстояние в метрах, t – время падения в секундах. До дождя время падения камешков составляло 0,6 с. На сколько должен подняться уровень воды после дождя, чтобы измеряемое время изменилось на 0,2 с? Ответ выразите в метрах. ");
        des2.setText("Зависимость объeма спроса q (единиц в месяц) на продукцию предприятия – монополиста от цены p (тыс. руб.) задаeтся формулой q=100-10p Выручка предприятия за месяц r (в тыс. руб.) вычисляется по формуле r(p)=q*p Определите наибольшую цену p, при которой месячная выручка r(p) составит не менее 240 тыс. руб. Ответ приведите в тыс. руб.");
        des3.setText("Высота над землeй подброшенного вверх мяча меняется по закону h(t)=1,6 + 8t – 5t^2, где h – высота в метрах, t – время в секундах, прошедшее с момента броска. Сколько секунд мяч будет находиться на высоте не менее трeх метров?");
        des4.setText("Камень брошен вертикально вверх. Пока камень не упал, высота, на которой он находится, описывается формулой h(t)=– 5t^2 + 18t,, где  h — высота в метрах, t — время в секундах, прошедшее с момента броска. Сколько секунд камень находился на высоте не менее 9 метров.");
        des5.setText("Сила тока в цепи I (в амперах) определяется напряжением в цепи и сопротивлением электроприбора по закону Ома: I=U/R, где U – напряжение в вольтах, R – сопротивление электроприбора в омах. В электросеть включeн предохранитель, который плавится, если сила тока превышает 4 А. Определите, какое минимальное сопротивление должно быть у электроприбора, подключаемого к розетке в 220 вольт, чтобы сеть продолжала работать. Ответ выразите в омах.");

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

        cb1011_1_1.setText("1"); //правильный ответ
        cb1011_1_2.setText("6");
        cb1011_1_3.setText("5");
        cb1011_1_4.setText("23");

        cb1011_2_1.setText("7");
        cb1011_2_2.setText("6"); // правильный ответ
        cb1011_2_3.setText("78");
        cb1011_2_4.setText("12");


        cb1011_3_1.setText("2.1");
        cb1011_3_2.setText("6");
        cb1011_3_3.setText("1.2"); // правильный ответ
        cb1011_3_4.setText("4.6");

        cb1011_4_1.setText("6.9");
        cb1011_4_2.setText("2.4");// правильный ответ
        cb1011_4_3.setText("1");
        cb1011_4_4.setText("1.2");


        cb1011_5_1.setText("76.9");
        cb1011_5_2.setText("11.3");
        cb1011_5_3.setText("53");
        cb1011_5_4.setText("55"); // правильный ответ

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
                if (cb1011_3_3.isChecked()){
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
