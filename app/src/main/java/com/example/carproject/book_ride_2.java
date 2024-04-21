package com.example.carproject;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class book_ride_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_ride_2);

        ImageView imgView = findViewById(R.id.image_view);
        TextView txtName = findViewById(R.id.text_name);
        TextView txtAddress = findViewById(R.id.text_address);

        // Receive the intent from RecyclerContactAdapter and update the views
        int imgId = getIntent().getIntExtra("img", -1); // Default value as -1 if no image provided
        String name = getIntent().getStringExtra("name");
        String address = getIntent().getStringExtra("address");

        // Update the ImageView and TextViews with the data
        if (imgId != -1) {
            imgView.setImageResource(imgId);
        }
        txtName.setText(name);
        txtAddress.setText(address);
    }
}
