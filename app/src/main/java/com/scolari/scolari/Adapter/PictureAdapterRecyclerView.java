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
import com.scolari.scolari.model.CreatActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by zilikos on 27/8/17.
 */

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder>{

    private ArrayList<CreatActivity> pictures;
    private int resource;
    private Activity activity;

    public PictureAdapterRecyclerView(ArrayList<CreatActivity> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource,parent,false);

        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {
        CreatActivity picture = pictures.get(position);
        holder. titleAct.setText(picture.getTitleA());



    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{


     //   private ImageView pictureCardAct;
        private TextView titleAct;


        public PictureViewHolder(View itemView) {
            super(itemView);

         //   pictureCardAct     = (ImageView) itemView.findViewById(R.id.pictureCardAct);
            titleAct    = (TextView) itemView.findViewById(R.id.titleAct);


        }


    }
}
