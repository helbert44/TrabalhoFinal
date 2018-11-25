package com.example.helbertribeiro.exercicio;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.graphics.BitmapFactory;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.graphics.Bitmap;

public class TerceiraTela extends AppCompatActivity {
    private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_tela);
        Button btnImg = (Button) findViewById(R.id.btnBaixaImg);
    }

    public void carregaImG(View view){

        new Thread() {
            public void run(){
                Bitmap img = null;
                    try{
                        URL url = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSCE1EXNsPXadW5VXn4Zm4j87-Yq2-aBOjlogheEnE1EXq_bAro");
                        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                        InputStream input = conexao.getInputStream();
                        img = BitmapFactory.decodeStream(input);
                    } catch (IOException e){e.printStackTrace();}

                    final Bitmap imgAux = img;
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            ImageView imagem = new ImageView(getBaseContext());
                            imagem.setImageBitmap(imgAux);

                            ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.lwTerceiraTela);
                            cl.addView(imagem);
                        }
                    });
                }
        }.start();
    }
}
