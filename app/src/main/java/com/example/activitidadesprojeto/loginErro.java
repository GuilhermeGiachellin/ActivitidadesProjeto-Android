package com.example.activitidadesprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginErro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_erro);
    }

    public void botaoVoltarOnClick (View v) {
        Intent telaLogin = new Intent(this, login.class);
        startActivity(telaLogin);
    }
}