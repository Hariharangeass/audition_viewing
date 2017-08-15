package com.example.rajiv.auditioning;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by rajiv on 7/10/2017.
 */

public class Recycler_Adapter extends RecyclerView.Adapter<Recycler_Adapter.Holder> {
    private ArrayList<weather_forecast> w1;

    public static class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView proj_name,proj_type,proj_desc,role_desc,features,shooting_loc,aud_loc,valid_from,contact_no,valid_to;
        Button accept;
        private weather_forecast y;

        public Holder(View v) {
            super(v);
            proj_name = (TextView) v.findViewById(R.id.proj_name);
            proj_type = (TextView) v.findViewById(R.id.proj_type);

            proj_desc = (TextView) v.findViewById(R.id.proj_desc);
            role_desc = (TextView) v.findViewById(R.id.role_desc);
            features = (TextView) v.findViewById(R.id.features);
            shooting_loc = (TextView) v.findViewById(R.id.shoot_loc);
            aud_loc = (TextView) v.findViewById(R.id.audition_loc);
            valid_from = (TextView) v.findViewById(R.id.valid_from);
            valid_to = (TextView) v.findViewById(R.id.valid_to);
            contact_no = (TextView) v.findViewById(R.id.contact_no);
            accept = (Button) v.findViewById(R.id.accept);
            v.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {

        }

        public void binder(weather_forecast x) {
            y=x;

            proj_name.setText(x.retproj_name());
            proj_type.setText(x.retproj_type());
            proj_desc.setText(x.retproj_desc());
            role_desc.setText(x.retrole_desc_name());
            features.setText(x.retfeatures());
            shooting_loc.setText(x.retshooting_loc());
            aud_loc.setText(x.retaud_loc());
            valid_from.setText(x.retvalid_from());
            valid_to.setText(x.retvalid_to());
            contact_no.setText(x.retcontact_no());



        }
    }
    public Recycler_Adapter(ArrayList<weather_forecast> y)
    {
        w1=y;
    }

    @Override
    public Recycler_Adapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler__adapter,parent,false);
        return new Holder(inflatedView);

    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        weather_forecast w = w1.get(position);
        holder.binder(w);
        holder.accept.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Applied", Toast.LENGTH_SHORT).show();}
        });


    }



    @Override
    public int getItemCount() {
        return w1.size();
    }
}
