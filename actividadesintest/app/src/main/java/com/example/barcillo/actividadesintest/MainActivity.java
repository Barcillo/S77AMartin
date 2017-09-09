package com.example.barcillo.actividadesintest;

import android.support.annotation.ColorInt;
import android.support.v4.util.LogWriter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button miBoton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miboton = (Button)findViewById(R.id.btnActivity);
        miBoton.setText("Mi actividad");
        miBoton.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));



        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(), "Click en el boton", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e("CICLO","Paso por el metodos onStart");

    }
}
