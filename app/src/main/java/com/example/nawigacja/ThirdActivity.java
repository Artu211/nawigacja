package com.example.nawigacja;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button openFirstActivityButton = findViewById(R.id.openFirstActivityButton);
        Button openSecondActivityButton = findViewById(R.id.openSecondActivityButton);
        Button openThirdActivityButton = findViewById(R.id.openThirdActivityButton);

        openFirstActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ThirdActivity.this, MainActivity.class);

                // 2. Uruchomienie Aktywności
                startActivity(intent);
            }
        });

        openSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);

                // 2. Uruchomienie Aktywności
                startActivity(intent);
            }
        });

        openThirdActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ThirdActivity.this, ThirdActivity.class);

                // 2. Uruchomienie Aktywności
                startActivity(intent);
            }
        });
    }
}
