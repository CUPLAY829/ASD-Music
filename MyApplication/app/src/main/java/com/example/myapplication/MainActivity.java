package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;


public class MainActivity extends AppCompatActivity {

    // Daftar lagu contoh
    String[] songs = {
            "Lagu 1 - Artis A",
            "Lagu 2 - Artis B",
            "Lagu 3 - Artis C",
            "Lagu 4 - Artis D",
            "Lagu 5 - Artis E"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Menghubungkan ListView di XML dengan kode Java
        ListView songListView = findViewById(R.id.songList);

        // Menyiapkan adapter untuk menampilkan daftar lagu
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, // Layout standar untuk item ListView
                songs // Data untuk ditampilkan
        );

        // Menyetel adapter ke ListView
        songListView.setAdapter(adapter);
    }
}