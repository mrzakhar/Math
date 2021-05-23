package com.example.trenmath;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ReadAcrivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String> adapter;
    List<String> listData;
    private DatabaseReference mDataBase; // объект, который хранит ссылку на бд
    private String TASK_KEY = "10УРАВНЕНИЯ"; ; // группа для бд

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_layout);

        // включаем кнопку назад
        getSupportActionBar().setTitle("10-11 класс"); // for set actionbar title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // for add back arrow in action bar


        listView = (ListView)findViewById(R.id.listview);
        listData = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listData);
        listView.setAdapter(adapter);
        mDataBase = FirebaseDatabase.getInstance().getReference(TASK_KEY);// получили бд
        readDataFromDB();




    }
    private void readDataFromDB(){
        ValueEventListener valueEventListener  = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (listData.size()> 0)listData.clear(); // очищаем список
                for(DataSnapshot ds: dataSnapshot.getChildren()){
                    Task task = ds.getValue(Task.class);
                    assert task !=null;
                    listData.add(task.description); // достали только имя
                }
                adapter.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        mDataBase.addValueEventListener(valueEventListener);
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
