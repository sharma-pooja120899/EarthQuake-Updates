package com.e.earthquakeupdates;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<EarthCustom> {
    public CustomAdapter(Context context, List<EarthCustom> resource) {
        super(context,0, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=convertView;

        if(view==null){
            view= LayoutInflater.from(getContext()).inflate(R.layout.listitemone,parent,false);
        }

        EarthCustom eCustom=getItem(position);

        TextView tvMagnitude=view.findViewById(R.id.magnitude);
        TextView tvLocation =view.findViewById(R.id.location);
        TextView tvDate=view.findViewById(R.id.date);
        TextView tvTime=view.findViewById(R.id.time);
        TextView tvPlace=view.findViewById(R.id.place);

//        //To change the background color of textview
     GradientDrawable magnitudeCircle = (GradientDrawable) tvMagnitude.getBackground();
    double magnitude=Double.parseDouble(eCustom.getMagnitude());
    int magnitudeColor =  getMagnitudeColor(magnitude);
    magnitudeCircle.setColor(magnitudeColor);
//

        tvMagnitude.setText(eCustom.getMagnitude());
        tvLocation.setText(eCustom.getLocation());
        tvDate.setText(eCustom.getDate());
        tvTime.setText(eCustom.getTime());
        tvPlace.setText(eCustom.getPlace());

        return view;
    }

    private int getMagnitudeColor(double magnitude) {
        int magnitudeColorResourceId;
        int magnitudeFloor = (int) Math.floor(magnitude);
        switch (magnitudeFloor) {
            case 0:
            case 1:
                magnitudeColorResourceId = R.color.magnitude1;
                break;
            case 2:
                magnitudeColorResourceId = R.color.magnitude2;
                break;
            case 3:
                magnitudeColorResourceId = R.color.magnitude3;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude4;
                break;
            case 5:
                magnitudeColorResourceId = R.color.magnitude5;
                break;
            case 6:
                magnitudeColorResourceId = R.color.magnitude6;
                break;
            case 7:
                magnitudeColorResourceId = R.color.magnitude7;
                break;
            case 8:
                magnitudeColorResourceId = R.color.magnitude8;
                break;
            case 9:
                magnitudeColorResourceId = R.color.magnitude9;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude10plus;
                break;
        }
        return ContextCompat.getColor(getContext(), magnitudeColorResourceId);
    }
}
