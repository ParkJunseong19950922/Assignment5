package com.example.extstudent.assignment5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/*
 * CSE41246 - Android Java Fundamentals
 * Fall 2019
 * Assignment #5
 * Park, Junseong
 */

public class MainActivity extends AppCompatActivity {
    private ListView mainListView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TO-DO: Create a reference to the ListView widget.
        mainListView = (ListView)findViewById(R.id.listView);
        initListView();
    }

    private void initListView() {
        // TO-DO:
        // 1. Create an ArrayAdapter and add String data to it. Use .add
        // 2. Set the adaptor for the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_layout_entry);
        adapter.add("Creater: Junseong Park");
        adapter.add("First Custom Item");
        adapter.add("Second Custom Item");
        adapter.add("Third Custom Item");

        // TO-DO: Set the adaptor for the ListView
        this.mainListView.setAdapter(adapter);
    }
}
