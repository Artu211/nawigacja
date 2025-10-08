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

        Button openSecondActivityButton = findViewById(R.id.openFirstActivityButton);

        openSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. Stworzenie intencji jawnej
                // Podajemy kontekst (this) i klasę docelowej Aktywności
                Intent intent = new Intent(ThirdActivity.this, MainActivity.class);

                // 2. Uruchomienie Aktywności
                startActivity(intent);
            }
        });
    }
}