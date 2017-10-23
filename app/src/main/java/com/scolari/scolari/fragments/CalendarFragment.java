package com.scolari.scolari.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scolari.scolari.Adapter.ListaActividadRecycler;
import com.scolari.scolari.AnadirActividad;
import com.scolari.scolari.R;
import com.scolari.scolari.model.ListActividad;
import com.scolari.scolari.model.ListaActividad;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CalendarFragment extends Fragment {

    private FloatingActionButton fabNewAct;


    public CalendarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calendar, container, false);
        RecyclerView actividadRecycler = (RecyclerView) view.findViewById(R.id.actividadRecycler);

        fabNewAct = (FloatingActionButton) view.findViewById(R.id.fabNewAct);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        actividadRecycler.setLayoutManager(linearLayoutManager);

        ListaActividadRecycler listaActividadRecycler = new ListaActividadRecycler(buidPictures(), R.layout.cardview_activity, getActivity());



        actividadRecycler.setAdapter(listaActividadRecycler);


        fabNewAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), AnadirActividad.class);
                //here
                startActivity(intent);
            }
        });

        return view;
    }

    public ArrayList<ListActividad> buidPictures(){
        ArrayList<ListActividad> pictures = new ArrayList<>();
        pictures.add(new ListActividad( "Avance de Tesis", "15 de noviembre 2017", false));
        pictures.add(new ListActividad("Avance del Proyecto ", "19 de octubre 2017",false));
        pictures.add(new ListActividad("Examen de Cerdina ", "1 noviembre 2017",false));


        return pictures;

    }


}
