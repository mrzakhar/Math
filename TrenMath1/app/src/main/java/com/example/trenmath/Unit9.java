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

public class Unit9 extends AppCompatActivity {
    ListView lv_unit9;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit9_layout);
        // включаем кнопку назад
        getSupportActionBar().setTitle("9 класс"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
        // связваем listview  по id
        lv_unit9 = (ListView)findViewById(R.id.lv_unit9);
        // получаем список тем из ресурсов
        String[] temaList = getResources().getStringArray(R.array.tema9);
        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, temaList);
        // присваиваем адаптер списку
        lv_unit9.setAdapter(adapter);

        // обрабатываем нажатие на элемет списка

        // обрабатываем нажатие на элемет списка
        lv_unit9.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Intent intent;
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        //intent = new Intent(Unit1.this, Read1011Veroyatnost.class);
                        //startActivity(intent);
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
