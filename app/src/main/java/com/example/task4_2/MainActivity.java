package com.example.task4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view);

        ArrayList<String> recipes = new ArrayList<>();

        recipes.add("ΓΙΟΥΒΕΤΣΙ");
        recipes.add("ΜΟΥΣΑΚΑΣ");
        recipes.add("ΓΕΜΙΣΤΑ");
        recipes.add("ΦΑΣΟΛΑΔΑ");
        recipes.add("ΓΙΟΥΒΑΡΛΑΚΙΑ");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,R.layout.list_item,recipes);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                TextView textView = view.findViewById((R.id.textView) );
                intent.putExtra("name",textView.getText().toString());
                startActivity(intent);
            }
        });

    }
}