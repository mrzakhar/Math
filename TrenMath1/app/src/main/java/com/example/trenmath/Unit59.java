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

public class Unit59 extends AppCompatActivity {

    ListView listView5_9;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit5_9_activity);
        // включаем кнопку назад
        getSupportActionBar().setTitle("5-9 класс"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar

        listView5_9 = (ListView)findViewById(R.id.lw_5_9);
        // получаем список тем из ресурсов
        String[] temaList = getResources().getStringArray(R.array.number_Unit2);
        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, temaList);
        // присваиваем адаптер списку
        listView5_9.setAdapter(adapter);

        // обрабатываем нажатие на элемет списка
        listView5_9.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position){
                    case 0:
                        intent= new Intent(Unit59.this,Unit5.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(Unit59.this,Unit6.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(Unit59.this,Unit7.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(Unit59.this,Unit8.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(Unit59.this,Unit9.class);
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
