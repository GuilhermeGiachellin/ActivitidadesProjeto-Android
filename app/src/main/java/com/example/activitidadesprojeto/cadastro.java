package com.example.activitidadesprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void salvarOnClick (View v) {
        EditText cadastroNome = (EditText) findViewById(R.id.cadastroNome);
        EditText cadastroCep = (EditText) findViewById(R.id.cadastroCep);
        EditText cadastroEndereco = (EditText) findViewById(R.id.cadastroEndereco);
        EditText cadastroComplemento = (EditText) findViewById(R.id.cadastroComplemento);
        EditText cadastroEmail = (EditText) findViewById(R.id.cadastroEmail);
        EditText cadastroNumero = (EditText) findViewById(R.id.cadastroNumero);

        ArrayList<String> conteudo = new ArrayList<String>();
        String[] campo = {"Nome", "Cep", "Endereco", "Complemento", "Email", "Numero"};
        String respostaErro = "";
        String respostaSucesso = "";

        conteudo.add(cadastroNome.getText().toString());
        conteudo.add(cadastroCep.getText().toString());
        conteudo.add(cadastroEndereco.getText().toString());
        conteudo.add(cadastroComplemento.getText().toString());
        conteudo.add(cadastroEmail.getText().toString());
        conteudo.add(cadastroNumero.getText().toString());

        for(int i = 0; i < conteudo.size(); i++) {
            if (conteudo.get(i).isEmpty()) {
                respostaErro += campo[i] + " ";
            }
        }

        if(!respostaErro.equals("")) {
            Intent telaCadastroErro = new Intent(this, erroCadastro.class);
            telaCadastroErro.putExtra("respostaErro", respostaErro);

            startActivity(telaCadastroErro);

        } else {
            Intent telaSucessoCadastro = new Intent(this, sucessoCadastro.class);
            respostaSucesso = "Olá " + conteudo.get(0);
            telaSucessoCadastro.putExtra("respostaSucesso", respostaSucesso);

            startActivity(telaSucessoCadastro);
        }
    }

}