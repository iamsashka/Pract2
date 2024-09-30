package com.example.practos2;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<State> states = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // Важно установить LayoutManager

        StateAdapter adapter = new StateAdapter(this, states, state -> {
            // Показать всплывающее сообщение при нажатии на элемент
            Toast.makeText(this, "Страна: " + state.getName() + "\nСтолица: " + state.getCapital(), Toast.LENGTH_SHORT).show();
        });
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        states.add(new State("Испания", "Мадрид", R.drawable.ispania));
        states.add(new State("Австралия", "Канберра", R.drawable.avst));
        states.add(new State("Россия", "Москва", R.drawable.russia));
    }
}