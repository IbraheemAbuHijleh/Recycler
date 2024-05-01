package com.example.recyler_viwes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycler = findViewById(R.id.pizza_recycler);

        String[] captions = new String[Pizaa.pizaas.length];
        int[] ids = new int[Pizaa.pizaas.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = Pizaa.pizaas[i].getName();
            ids[i] = Pizaa.pizaas[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids);
        recycler.setAdapter(adapter);
    }

}

