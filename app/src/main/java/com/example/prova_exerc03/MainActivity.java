package com.example.prova_exerc03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {

    TextView txtnum, txtresult1, txtresult2, txtresult3;

    Button btnok, btnlimpar;

    double n, r1, r2, r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlimpar = findViewById(R.id.btnlimpar);
        btnlimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtnum = (TextView) findViewById(R.id.txtnum);
                txtresult1 = (TextView) findViewById(R.id.txtresult1);
                txtresult2 = (TextView) findViewById(R.id.txtresult2);
                txtresult3 = (TextView) findViewById(R.id.txtresult3);

                txtnum.setText("");
                txtresult1.setText("");
                txtresult2.setText("");
                txtresult3.setText("");
            }
        });

        //txtnum =(TextView) findViewById(R.id.txtnum);

        btnok = findViewById(R.id.btnok);
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtnum = (TextView) findViewById(R.id.txtnum);
                txtresult1 = (TextView) findViewById(R.id.txtresult1);
                txtresult2 = (TextView) findViewById(R.id.txtresult2);
                txtresult3 = (TextView) findViewById(R.id.txtresult3);


                n = Double.parseDouble(txtnum.getText().toString());

                // par e impar

                r1 = n % 2;

                if(r1 == 0)
                {
                    //par
                    txtresult1.setText("Par");
                }
                else
                {
                    // Impar
                    txtresult1.setText("Ímpar");
                }

                //Dobro Num
                r2 = n * 2;
                txtresult2.setText(String.valueOf(r2));

                //Raiz Quadrada
                r3 = sqrt(n);
                txtresult3.setText(String.valueOf(r3));

            }
        });

    }
}