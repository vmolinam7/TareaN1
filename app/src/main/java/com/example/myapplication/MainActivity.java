package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnenviar (View view){
        Intent intent = new Intent(MainActivity.this, MainActivitymostar.class);
        EditText txtcedu = (EditText)findViewById(R.id.txtcedula2);
        EditText txtnom = (EditText)findViewById(R.id.txtnombre2);
        EditText txtfec = (EditText)findViewById(R.id.dtFecha2);
        EditText txtciu = (EditText)findViewById(R.id.txtciudad2);
        RadioButton rbt = (RadioButton)findViewById(R.id.rbtMasculino);
        EditText txtcor = (EditText)findViewById(R.id.txtcorreo2);
        EditText txxtel = (EditText)findViewById(R.id.txtbumero2);
        Bundle b = new Bundle();
        b.putString("CEDULA", txtcedu.getText().toString());
        b.putString("NOMBRE",txtnom.getText().toString());
        b.putString("FECHA", txtfec.getText().toString());
        b.putString("CIUDAD",txtciu.getText().toString());
        b.putString("GENERO",rbt.getText().toString());
        b.putString("CORREO", txtcor.getText().toString());
        b.putString("TELEFONO",txxtel.getText().toString());

        intent.putExtras(b);
        startActivity(intent);
    }
    public void limpiar (View view){
        EditText txtcedu = (EditText)findViewById(R.id.txtcedula2);
        EditText txtnom = (EditText)findViewById(R.id.txtnombre2);
        EditText txtfec = (EditText)findViewById(R.id.dtFecha2);
        EditText txtciu = (EditText)findViewById(R.id.txtciudad2);
        RadioButton rbt = (RadioButton)findViewById(R.id.rbtMasculino);
        EditText txtcor = (EditText)findViewById(R.id.txtcorreo2);
        EditText txxtel = (EditText)findViewById(R.id.txtbumero2);
        txtcedu.setText("");
        txtnom.setText("");
        txtfec.setText("");
        txtciu.setText("");
        txtcor.setText("");
        txxtel.setText("");
    }
}