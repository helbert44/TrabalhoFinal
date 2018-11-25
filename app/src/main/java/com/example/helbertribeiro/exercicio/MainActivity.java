package com.example.helbertribeiro.exercicio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.edtUsuario);
        Button btn = (Button) findViewById(R.id.btn01);
    }

    @Override
    public void onClick(View view){

        Intent intencao = new Intent(this, SegundaTela.class);
        String nameAcesso = nome.getText().toString();
        startActivity(intencao);
        Toast.makeText(this, "Bem Vindo, "+nameAcesso+"!", Toast.LENGTH_LONG).show();
    }

}
