package com.ajinkyad.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewCountryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCountryList = findViewById(R.id.recyclerViewCountryList);

        List<String> countriesList = Arrays.asList(getResources().getStringArray(R.array.countries_array));

        CountriesListAdapter listAdapter = new CountriesListAdapter(this, countriesList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        recyclerViewCountryList.setLayoutManager(linearLayoutManager);

        recyclerViewCountryList.setAdapter(listAdapter);
    }
}
