package com.example.victorruelas.practica001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText cuadro;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  cuadro = (EditText) findViewById(R.id.txtCadena);
    res=(TextView) findViewById(R.id.textView2);


    }

    //sintaxis para metodo de boton
    public void verificar (View v){




        String sCadena = cuadro.getText().toString();
     String cadenai= "";

   for (int x=sCadena.length()-1; x>=0; x--){

        cadenai=cadenai+ sCadena.charAt(x);

   }
        res.setText(cadenai.toUpperCase());
    }


}
