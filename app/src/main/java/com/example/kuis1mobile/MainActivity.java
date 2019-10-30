package com.example.kuis1mobile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public RecyclerView recyclerView;
    public keluargaAdapter adapter;
    private ArrayList<keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = findViewById(R.id.recylerview);
        adapter = new keluargaAdapter(keluargaArrayList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new keluarga("Hadi Machsun","Bokap", R.drawable.bapak));
        keluargaArrayList.add(new keluarga("Ela Mariyawati", "Nyokap", R.drawable.mama));
        keluargaArrayList.add(new keluarga("Rizal Fikri","Anak Sulung", R.drawable.fotoku));
        keluargaArrayList.add(new keluarga("Zaidan Ibrahim","Anak Tengah", R.drawable.zaidan));
        keluargaArrayList.add(new keluarga("Faatikh El Hamdy","Anak Bungsu", R.drawable.fatih));
    }
}
