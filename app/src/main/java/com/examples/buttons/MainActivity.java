package com.examples.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // initialize different buttons
    Button button, button_image;
    ImageButton imageButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // let's introduce button to java that we will use them
        button = findViewById(R.id.button);
        button_image = findViewById(R.id.button_image);
        imageButton = findViewById(R.id.image_button);
        textView = findViewById(R.id.text_view);

        // now set listener to every button so that text view can be changed accordingly
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Button is Clicked!");
            }
        });

        button_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Button with Image is Clicked");
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Image Button is Clicked");
            }
        });
    }
}