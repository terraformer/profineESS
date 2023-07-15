package com.profinegroup.profineess;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String URL = "https://mitarbeiter.profine-group.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        openWebPage(URL);
        finish();

    }
    private void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        // Überprüfe, ob eine Activity den Intent behandeln kann, bevor sie gestartet wird.
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }
}