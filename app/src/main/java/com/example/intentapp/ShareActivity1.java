package com.example.intentapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.intentapp.R;

public class ShareActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share1);

        EditText shareEditText = findViewById(R.id.shareEditText);
        Button shareButton = findViewById(R.id.shareButton);

        shareButton.setOnClickListener(v ->{
            String textToShare = shareEditText.getText().toString();
            Intent shareIntent = new Intent();
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.putExtra(Intent.EXTRA_TEXT, textToShare);
            shareIntent.setType("text/plain");
            startActivity(Intent.createChooser(shareIntent, "share text"));
        });
    }
}