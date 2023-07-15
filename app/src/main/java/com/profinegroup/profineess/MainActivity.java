package com.profinegroup.profineess;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String URL = "https://mitarbeiter.profine-group.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Start");
        openWebPage("https://mitarbeiter.profine-group.com");
        finish();
        Log.d(TAG, "END");
    }
    private void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        Log.d(TAG, "preload");
        // Überprüfe, ob eine Activity den Intent behandeln kann, bevor sie gestartet wird.
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
            Log.d(TAG, "load");
        }
    }
}