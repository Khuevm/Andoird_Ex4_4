package com.example.ex4_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.ex4_4.model.Cat;
import com.example.ex4_4.model.CatAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CatAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);

        List<Cat> catList = new ArrayList<>();
        Cat cat1 = new Cat(R.drawable.cat1, "Cat 1");
        Cat cat2 = new Cat(R.drawable.cat2, "Cat 2");
        Cat cat3 = new Cat(R.drawable.cat3, "Cat 3");
        Cat cat4 = new Cat(R.drawable.cat4, "Cat 4");

        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);

        adapter = new CatAdapter(this, catList);

        GridLayoutManager manager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
}