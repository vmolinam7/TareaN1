package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivitymostar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitymostar);

        TextView txtSaludo = (TextView)findViewById(R.id.txtinfo);
        Bundle bundle = this.getIntent().getExtras();
        txtSaludo.setText("Hola!, Bienvenido \n " +
                bundle.getString("NOMBRE") +"\n"+
                bundle.getString("CEDULA")+"\n"+
                bundle.getString("FECHA")+"\n"+
                bundle.getString("CIUDAD")+"\n"+
                bundle.getString("GENERO")+"\n"+
                bundle.getString("CORREO")+"\n"+
                bundle.getString("TELEFONO"));

    }


}