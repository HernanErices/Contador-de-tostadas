package com.example.contadordetostadas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private int nClick = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv_contador);
    }

    public void mostrarTostada(View view){
        Toast.makeText(this, "Tostada", Toast.LENGTH_LONG).show();
    }

    public void contadorNclick(View view){
         nClick++;
         tv1.setText(Integer.toString(nClick));
    }

    public void resetContadoor(View view){
        nClick=0;
        tv1.setText(Integer.toString(nClick));
    }

    public void reducirContador(View view){
        nClick--;
        tv1.setText(Integer.toString(nClick));
    }
}