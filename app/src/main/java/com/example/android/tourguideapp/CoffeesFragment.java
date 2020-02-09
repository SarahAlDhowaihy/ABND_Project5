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

public class CoffeesFragment extends Fragment {
    public CoffeesFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Places> coffees = new ArrayList<Places>();
        coffees.add(new Places(R.string.coffees_almasaa_name,R.string.coffees_almasaa_info,R.drawable.almasaa));

        PlaceAdapter placeAdapter = new PlaceAdapter (getActivity(),coffees);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
