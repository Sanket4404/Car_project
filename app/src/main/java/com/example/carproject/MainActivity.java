package com.example.carproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycle;
    ArrayList<book_ride_1_model> arrcontact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycle = findViewById(R.id.recycler);
        recycle.setLayoutManager(new LinearLayoutManager(this));

        // Efficient way to add models to the list using Arrays.asList
        // Name of Driver
        arrcontact = new ArrayList<>(Arrays.asList(
                new book_ride_1_model(R.drawable.a, "A", "College Road"),
                new book_ride_1_model(R.drawable.b, "B", "College Road"),
                new book_ride_1_model(R.drawable.c, "C", "College Road"),
                new book_ride_1_model(R.drawable.d, "D", "College Road"),
                new book_ride_1_model(R.drawable.e, "E", "College Road"),
                new book_ride_1_model(R.drawable.f, "F", "College Road"),
                new book_ride_1_model(R.drawable.g, "G", "College Road"),
                new book_ride_1_model(R.drawable.h, "H", "College Road"),
                new book_ride_1_model(R.drawable.i, "I", "College Road"),
                new book_ride_1_model(R.drawable.a, "J", "College Road"),
                new book_ride_1_model(R.drawable.b, "K", "College Road"),
                new book_ride_1_model(R.drawable.c, "L", "College Road"),
                new book_ride_1_model(R.drawable.d, "M", "College Road"),
                new book_ride_1_model(R.drawable.e, "N", "College Road"),
                new book_ride_1_model(R.drawable.f, "O", "College Road"),
                new book_ride_1_model(R.drawable.g, "P", "College Road"),
                new book_ride_1_model(R.drawable.h, "Q", "College Road")
        ));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrcontact);
        recycle.setAdapter(adapter);
    }
}
