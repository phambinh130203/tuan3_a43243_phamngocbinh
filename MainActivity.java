package com.example.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    t3adapter adapter;
    ArrayList<T3> ls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.Tuan3lv);
        ls.add(new T3("Pham Ngoc Binh","20",R.drawable.ic_launcher_background));
        ls.add(new T3("Pham Van a","20",R.drawable.ic_launcher_background));
        ls.add(new T3("Nguyen Van a","19",R.drawable.ic_launcher_background));
        ls.add(new T3("Pham Ngoc a","20",R.drawable.ic_launcher_background));
        ls.add(new T3("Nguyen Van c","10",R.drawable.ic_launcher_background));
        ls.add(new T3("Nguyen Van d","16",R.drawable.ic_launcher_background));
        adapter= new t3adapter(ls, this);
        lv.setAdapter(adapter);
    }
}