package com.scolari.scolari.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scolari.scolari.Adapter.ListaActividadRecycler;
import com.scolari.scolari.R;
import com.scolari.scolari.model.ListaActividad;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CalendarFragment extends Fragment {


    public CalendarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calendar, container, false);
        RecyclerView actividadRecycler = (RecyclerView) view.findViewById(R.id.actividadRecycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        actividadRecycler.setLayoutManager(linearLayoutManager);

        ListaActividadRecycler listaActividadRecycler = new ListaActividadRecycler(buidPictures(), R.layout.cardview_activity, getActivity());



        actividadRecycler.setAdapter(listaActividadRecycler);


        return view;
    }

    public ArrayList<ListaActividad> buidPictures(){
        ArrayList<ListaActividad> pictures = new ArrayList<>();
        pictures.add(new ListaActividad("15 de noviembre 2017", "Avance de Tesis" ));
        pictures.add(new ListaActividad("19 de octubre 2017","Avance del Proyecto "));
        pictures.add(new ListaActividad( "16 de octibre 2017","Examen de cuper"));

        return pictures;

    }


}
