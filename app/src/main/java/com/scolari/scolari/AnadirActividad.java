package com.scolari.scolari;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.scolari.scolari.fragments.AcademyFragment;
import com.scolari.scolari.model.ListActividad;

public class AnadirActividad extends AppCompatActivity  implements View.OnClickListener{

    Button b_fecha,b_hora;
    EditText e_fecha,e_hora;
    private int dia,mes,anio,hora,minutos;
    private static final String LIST_ACT =  "LisActividades";

    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir_actividad);


        b_fecha =(Button) findViewById(R.id.b_fecha);
        b_hora = (Button) findViewById(R.id.b_hora);
        e_fecha =(EditText) findViewById(R.id.e_fecha);
        e_hora = (EditText) findViewById(R.id.e_hora);
        b_fecha.setOnClickListener(this);
        b_hora.setOnClickListener(this);


        FirebaseDatabase.getInstance().setPersistenceEnabled(true); //aqui es para cuando no hay internet
        databaseReference = FirebaseDatabase.getInstance().getReference(); // aqui estamos dcienidole que vaya a la URL


    }

    public void createActividad (View v){
        ListActividad listActividad = new ListActividad(databaseReference.push().getKey() , "Avances Tesis", false);
        databaseReference.child(LIST_ACT).child(listActividad.getTitulo()).setValue(listActividad);// como se van ingresando

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View v) {
        if(v==b_fecha) {
            final Calendar c= Calendar.getInstance();
            dia=c.get(Calendar.DAY_OF_MONTH);
            mes=c.get(Calendar.MONTH);
            anio=c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    e_fecha.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                }
            }
                    ,dia,mes,anio);
            datePickerDialog.show();
        }
        if(v==b_hora){
            final Calendar c= Calendar.getInstance();
            hora=c.get(Calendar.HOUR_OF_DAY);
            minutos=c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    e_hora.setText(hourOfDay+":"+minute);
                }
            },hora,minutos,false);
            timePickerDialog.show();
        }
    }




    }






