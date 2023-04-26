package com.example.activitidadesprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void botaoLogin (View v) {
        EditText loginEmail = (EditText) findViewById(R.id.loginEmail);
        EditText loginSenha = (EditText) findViewById(R.id.loginSenha);

        String emailString = loginEmail.getText().toString();
        String senhaString = loginSenha.getText().toString();

        String emailCadastrado = "gui@gmail.com";
        String senhaCadastrada = "123456";

        if(emailString.isEmpty() || senhaString.isEmpty()) {
            Intent telaFalhaLogin = new Intent(this, falhaLogin.class);
            startActivity(telaFalhaLogin);

        } else if (emailString == emailCadastrado && senhaString == senhaCadastrada) {
            Intent telaSucessoLogin = new Intent(this, sucessoLogin.class);
            startActivity(telaSucessoLogin);

        } else {
            startActivity(telaFalhaLogin);
        }
    }
}