package com.example.activitidadesprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class sobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
    }

    public void uniftecOnClick (View v) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ftec.com.br")));
    }

    public void voltarOnClick (View v) {
        startActivity(new Intent(this, MainActivity.class));
    }
}