package com.scolari.scolari.fragments;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scolari.scolari.AnadirActividad;
import com.scolari.scolari.ContainerActivity;
import com.scolari.scolari.CreateAccountActivity;
import com.scolari.scolari.MainActivity;
import com.scolari.scolari.R;



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


        fabNewAct = (FloatingActionButton) view.findViewById(R.id.fabNewAct);



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







    public void showToolbar(String tittle, boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }




}
