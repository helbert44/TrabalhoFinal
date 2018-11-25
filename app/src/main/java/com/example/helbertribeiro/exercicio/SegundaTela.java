package com.example.helbertribeiro.exercicio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SegundaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
    }

    public void abrePortalKroton(View view) {

        Intent intecao = new Intent(Intent.ACTION_VIEW, Uri.parse("https://login.kroton.com.br/"));
        startActivity(intecao);

    }

    public void abrePortalBib(View view){

        Intent intecao = new Intent(Intent.ACTION_VIEW, Uri.parse("http://187.86.214.60/pergamum/biblioteca/index.php?id=ANHAN"));
        startActivity(intecao);
    }

    public void mostraImage(View view){

        Intent itencao = new Intent(this, TerceiraTela.class);
        startActivity(itencao);
    }

}