package com.scolari.scolari.fragments;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scolari.scolari.Adapter.PictureAdapterRecyclerView;
import com.scolari.scolari.AnadirActividad;
import com.scolari.scolari.ContainerActivity;
import com.scolari.scolari.CreateAccountActivity;
import com.scolari.scolari.MainActivity;
import com.scolari.scolari.R;
import com.scolari.scolari.model.CreatActivity;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AcademyFragment extends Fragment {

    private FloatingActionButton fabNewAct;
    private Activity activity;



    public AcademyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_academy, container, false);
        showToolbar(getResources().getString(R.string.tab_home) ,false, view);
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);



       /* LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL); */

        GridLayoutManager glm = new GridLayoutManager(getContext(), 2);

        picturesRecycler.setLayoutManager(glm);

        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buidPictures(), R.layout.cardview_actividades, getActivity());



        picturesRecycler.setAdapter(pictureAdapterRecyclerView);




        return view;
    }


    public ArrayList<CreatActivity> buidPictures(){
        ArrayList<CreatActivity> pictures = new ArrayList<>();
        pictures.add(new CreatActivity( 10, "Hacer la tesis", 11 ));
        pictures.add(new CreatActivity( 10, "Proyectos Maria", 11 ));
        pictures.add(new CreatActivity( 10, "Ir de compras", 11 ));



        return pictures;

    }



    public void showToolbar(String tittle, boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }
    
}
