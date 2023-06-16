package com.axel.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Felin> felins;
    private FelinAdapter felinAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.felinRecycler);



    }













    private void loadFelinData() {
        felins.add(new Felin("Chat", R.drawable.chat));
        felins.add(new Felin("Jaguard", R.drawable.jaguard));
        felins.add(new Felin("Lion", R.drawable.lion));
        felins.add(new Felin("Puma", R.drawable.puma));
        felins.add(new Felin("Serval", R.drawable.servalm));
        felins.add(new Felin("Tigre", R.drawable.tigre));
    }

    private void setRecyclerView() {
        felinAdapter = new FelinAdapter(felins);
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        recyclerView.setAdapter(felinAdapter);
        recyclerView.setHasFixedSize(true);
    }

}