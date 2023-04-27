package com.example.activitidadesprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoLoginOnClick(View v) {
        startActivity(new Intent(this, login.class));
    }

    public void botaoCadastroOnClick (View v) {
        startActivity(new Intent(this, cadastro.class));
    }

    public void botaoSobreOnClick (View v) {
        startActivity(new Intent(this, sobre.class));
    }
}