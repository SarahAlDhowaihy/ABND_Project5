package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by sarahaldowihy on 8/6/2017 AD.
 */

public class PlaceAdapter extends ArrayAdapter<Places> {

    public PlaceAdapter(Activity context, ArrayList<Places> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Places currentPlace = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView placeName = (TextView) listItemView.findViewById(R.id.placeName);
        placeName.setText(currentPlace.getPlaceName());

        TextView information = (TextView) listItemView.findViewById(R.id.information);
        information.setText(currentPlace.getInformation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        imageView.setImageResource(currentPlace.getImageResource());

        return listItemView;
    }
}
