package com.scolari.scolari.Adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.scolari.scolari.R;
import com.scolari.scolari.model.ListActividad;
import com.scolari.scolari.model.ListaActividad;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by zilikos on 15/10/17.
 */

public class ListaActividadRecycler extends RecyclerView.Adapter<ListaActividadRecycler.ListaViewHolder> {


  //  private static final String LIST_ACT =  "LisActividades";
    private ArrayList<ListActividad> listActividades;
    private int resource;
    private Activity activity;

   // private DatabaseReference databaseReference;


    public ListaActividadRecycler(ArrayList<ListActividad> listActividades, int resource, Activity activity) {
        this.listActividades = listActividades;
        this.resource = resource;
        this.activity = activity;
    }



    @Override
    public ListaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource,parent,false);

    //    FirebaseDatabase.getInstance().setPersistenceEnabled(true); //aqui es para cuando no hay internet
      //  databaseReference = FirebaseDatabase.getInstance().getReference(); // aqui estamos dcienidole que vaya a la URL


        return new ListaViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ListaViewHolder holder, int position) {
        ListActividad listActividad = listActividades.get(position);
        holder.titulo.setText(listActividad.getTitulo());
        holder.descripcion.setText(listActividad.getDescripcion());
        holder.hecho.setChecked(listActividad.getHecho());



    }

    @Override
    public int getItemCount() {
        return listActividades.size();
    }


   // public void createActividad(){
     //   ListActividad listActividad = new ListActividad(databaseReference.push().getKey() , "Avances Tesis", false);
      //  databaseReference.child(LIST_ACT).child(listActividad.getTitulo()).setValue(listActividad);

//    }


    public class ListaViewHolder extends RecyclerView.ViewHolder{

        private TextView titulo;
        private TextView descripcion;
        private CheckBox hecho;


        public ListaViewHolder(View itemView) {
            super(itemView);


            titulo               = (TextView) itemView.findViewById(R.id.txtTitulo);
            descripcion          = (TextView) itemView.findViewById(R.id.txtDescription);
            hecho                = (CheckBox) itemView.findViewById(R.id.chkHecho);


        }
    }



}
