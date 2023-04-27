package com.example.activitidadesprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class erroCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erro_cadastro);

        TextView textErro = (TextView) findViewById(R.id.textErro);

        Intent telaErro = getIntent();
        textErro.setText(telaErro.getStringExtra("respostaErro"));
    }
    public void voltarOnClick (View v) {
        startActivity(new Intent(this, cadastro.class));
    }

}