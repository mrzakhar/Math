package com.example.trenmath;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Unit1011 extends AppCompatActivity {

    ListView listView10_11;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit10_11_activity);

        // включаем кнопку назад
        getSupportActionBar().setTitle("10-11 класс"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar

        // связваем listview  по id
        listView10_11 = (ListView)findViewById(R.id.lw_10_11);
        // получаем список тем из ресурсов
        String[] temaList = getResources().getStringArray(R.array.tema10_11);
        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, temaList);
        // присваиваем адаптер списку
        listView10_11.setAdapter(adapter);

        // обрабатываем нажатие на элемет списка
        listView10_11.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                Intent intent;
                switch (position){
                    case 0:
                        intent = new Intent(Unit1011.this, Read1011Veroyatnost.class);
                        startActivity(intent);
                        break;
                    case 1:
                         intent = new Intent(Unit1011.this, Read1011ProstZadachi.class);
                         startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(Unit1011.this, Read1011PricladnyeZadachi.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(Unit1011.this, Read1011TextZadachi.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(Unit1011.this, Read1011ProstYravnenya.class);
                        startActivity(intent);
                        break;

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
