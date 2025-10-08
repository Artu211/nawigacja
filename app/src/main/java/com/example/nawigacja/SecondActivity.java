package com.example.nawigacja;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button openSecondActivityButton = findViewById(R.id.openThirdActivityButton);

        openSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. Stworzenie intencji jawnej
                // Podajemy kontekst (this) i klasę docelowej Aktywności
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);

                // 2. Uruchomienie Aktywności
                startActivity(intent);
            }
        });
    }
}