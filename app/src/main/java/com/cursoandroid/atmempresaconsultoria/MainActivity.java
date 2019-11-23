package com.cursoandroid.atmempresaconsultoria;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView menu_empresa;

    private ImageView menu_servicos;

    private ImageView menu_clientes;

    private ImageView menu_contato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu_empresa = findViewById(R.id.menu_empresa);

        menu_empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EmpresaActivity.class));
            }
        });

        menu_servicos = findViewById(R.id.menu_servicos);

        menu_servicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ServicoActivity.class));
            }
        });

        menu_clientes = findViewById(R.id.menu_clientes);

        menu_clientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ClienteActivity.class));
            }
        });

        menu_contato = findViewById(R.id.menu_contato);

        menu_contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }
        });


    }
}
