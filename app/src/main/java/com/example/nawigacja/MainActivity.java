package com.example.nawigacja;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button phone = findViewById(R.id.phone);
        Button map = findViewById(R.id.map);
        Button mail = findViewById(R.id.mail);
        Button gallery = findViewById(R.id.gallery);
        Button openFirstActivityButton = findViewById(R.id.openFirstActivityButton);
        Button openSecondActivityButton = findViewById(R.id.openSecondActivityButton);
        Button openThirdActivityButton = findViewById(R.id.openThirdActivityButton);

        openFirstActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivity.class);

                // 2. Uruchomienie Aktywności
                startActivity(intent);
            }
        });

        openSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                // 2. Uruchomienie Aktywności
                startActivity(intent);
            }
        });

        openThirdActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);

                // 2. Uruchomienie Aktywności
                startActivity(intent);
            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:123456789"));

                // 2. Uruchomienie Aktywności
                startActivity(intent);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:52.2318,21.0060"));

                // 2. Uruchomienie Aktywności
                startActivity(intent);
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:test@example.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Wiadomość z mojej aplikacji");

                // 2. Uruchomienie Aktywności
                startActivity(intent);
            }
        });

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:test@example.com"));
                intent.setDataAndType(Uri.parse(""), "image/*");

                // 2. Uruchomienie Aktywności
                startActivity(intent);
            }
        });
    }
}
