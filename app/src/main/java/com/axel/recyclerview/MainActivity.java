package com.axel.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Felin> felinList;
    private FelinAdapter felinAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.felinRecycler);

        loadFelinData();
        setRecyclerView();

    }



    // Chargement de la liste : felinList
    private void loadFelinData() {

        felinList = new ArrayList<>();

        felinList.add(
                new Felin("Chat", R.drawable.chat)
        );

        felinList.add(
                new Felin("Jaguard", R.drawable.jaguard)
        );
        felinList.add(
                new Felin("Lion", R.drawable.lion)
        );
        felinList.add(
                new Felin("Puma", R.drawable.puma)
        );
        felinList.add(
                new Felin("Serval", R.drawable.servalm)
        );
        felinList.add(
                new Felin("Tigre", R.drawable.tigre)
        );
    }

  /*  private void setRecyclerView() {
        felinAdapter = new FelinAdapter(felins);
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        recyclerView.setAdapter(felinAdapter);
        recyclerView.setHasFixedSize(true);
    }*/

    private void setRecyclerView() {
        felinAdapter = new FelinAdapter(felinList);

        // lier FelinAdapter au RecyclerView
        recyclerView.setAdapter(felinAdapter);
        // Disposition des items du RecyclerView
        recyclerView.setLayoutManager(
                new GridLayoutManager(
                        MainActivity.this,
                        2
                )
        );
        recyclerView.setHasFixedSize(true);
    }

}