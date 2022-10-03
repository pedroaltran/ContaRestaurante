package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_calcular = (Button) findViewById(R.id.btnCalcular);

        button_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double total_, couvert_, pessoas_, taxa_,sup, contatotal, porpessoa;



                EditText _total = (EditText) findViewById(R.id.total);
                total_ = Double.parseDouble(_total.getText().toString());

                EditText _couvert = (EditText) findViewById(R.id.couvert);
                couvert_ = Double.parseDouble(_couvert.getText().toString());

                EditText _pessoas = (EditText) findViewById(R.id.pessoas);
                pessoas_ = Double.parseDouble(_pessoas.getText().toString());

                EditText _taxa = (EditText) findViewById(R.id.taxa);
                taxa_ = Double.parseDouble(_taxa.getText().toString());

                TextView textResult = findViewById(R.id.txtResult);
                TextView textResultPessoa = findViewById(R.id.txtResultPessoa);

                sup = total_ + (couvert_ * pessoas_);
                contatotal = sup + (sup*(taxa_/100));

                porpessoa = (contatotal / pessoas_);


                    textResult.setText(String.valueOf(contatotal));
                    textResultPessoa.setText(String.valueOf(porpessoa));
                }
            });
        };
    }

