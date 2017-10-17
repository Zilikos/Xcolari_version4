package com.scolari.scolari.Adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.scolari.scolari.R;
import com.scolari.scolari.model.ListaActividad;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by zilikos on 15/10/17.
 */

public class ListaActividadRecycler extends RecyclerView.Adapter<ListaActividadRecycler.ListaViewHolder> {

    private ArrayList<ListaActividad> listaActividades;
    private int resource;
    private Activity activity;


    public ListaActividadRecycler(ArrayList<ListaActividad> listaActividades, int resource, Activity activity) {
        this.listaActividades = listaActividades;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public ListaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource,parent,false);

        return new ListaViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ListaViewHolder holder, int position) {
        ListaActividad listaActividad = listaActividades.get(position);
        holder.dateNumberCard.setText(listaActividad.getDate());
        holder.titleNameCard.setText(listaActividad.getTitle());


    }

    @Override
    public int getItemCount() {
        return listaActividades.size();
    }


    public class ListaViewHolder extends RecyclerView.ViewHolder{



        private TextView titleNameCard;
        private TextView dateNumberCard;


        public ListaViewHolder(View itemView) {
            super(itemView);


            titleNameCard   = (TextView) itemView.findViewById(R.id.titleNameCard);
            dateNumberCard        = (TextView) itemView.findViewById(R.id.dateNumberCard);


        }


    }



}
