package com.example.activitidadesprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginSucesso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sucesso);
    }

    public void botaoSobreOnClick (View v) {
        Intent telaSobre = new Intent(this, sobre.class);
        startActivity(telaSobre);

    }

}