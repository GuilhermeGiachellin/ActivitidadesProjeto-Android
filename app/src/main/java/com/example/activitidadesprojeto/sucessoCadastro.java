package com.example.activitidadesprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class sucessoCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucesso_cadastro);

        TextView nomeCadastro = (TextView) findViewById(R.id.nomeCadastro);

        Intent telaSucesso = getIntent();
        nomeCadastro.setText(telaSucesso.getStringExtra("respostaSucesso"));
    }

    public void sobreOnClick (View v) {
        startActivity(new Intent(this, sobre.class));
    }
}