package com.example.android.tourguideapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {
    public RestaurantFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Places> restaurant = new ArrayList<Places>();
        restaurant.add(new Places(R.string.restaurant_najd_name,R.string.restaurant_najd_info,R.drawable.najd));
        restaurant.add(new Places(R.string.restaurant_mamanoura_name,R.string.restaurant_mamanoura_info,R.drawable.mamanoura));

        PlaceAdapter placeAdapter = new PlaceAdapter (getActivity(),restaurant);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
