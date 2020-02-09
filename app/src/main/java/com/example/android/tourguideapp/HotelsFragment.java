package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {
    public HotelsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Places> hotels = new ArrayList<Places>();
        hotels.add(new Places(R.string.hotels_retaz_name, R.string.hotels_retaz_info, R.drawable.ritz));
        hotels.add(new Places(R.string.hotels_rafal_name, R.string.hotels_rafal_info, R.drawable.rafal));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), hotels);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);
        return rootView;
    }
}