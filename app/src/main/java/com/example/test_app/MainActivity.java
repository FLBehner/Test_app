package com.example.test_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button changeButton;
    private TextView helloText;
    private RadioButton radioButton1;
    private RadioButton radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeButton = (Button) findViewById(R.id.changeButton);
        helloText = (TextView) findViewById(R.id.helloText);


        changeButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                helloText.setText("It works!");
            }
        });

    }
}
