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

public class Unit14 extends AppCompatActivity {

    ListView listView1_4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit1_4_activity);
        // включаем кнопку назад
        getSupportActionBar().setTitle("1-4 класс"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar
        // связваем listview  по id
        listView1_4 = (ListView)findViewById(R.id.lw_1_4);
        // получаем список тем из ресурсов
        String[] temaList = getResources().getStringArray(R.array.number_Unit1);
        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, temaList);
        // присваиваем адаптер списку
        listView1_4.setAdapter(adapter);

        // обрабатываем нажатие на элемет списка

        // обрабатываем нажатие на элемет списка
        listView1_4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position){
                    case 0:
                        intent = new Intent(Unit14.this, Unit1.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(Unit14.this, Unit2.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(Unit14.this, Unit3.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(Unit14.this, Unit4.class);
                        startActivity(intent);
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
