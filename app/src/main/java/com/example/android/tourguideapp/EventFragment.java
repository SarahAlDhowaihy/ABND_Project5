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

public class EventFragment extends Fragment {
    public EventFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Places> events = new ArrayList<Places>();
        events.add(new Places(R.string.event_jenadriyah_name,R.string.event_jenadriyah_info,R.drawable.janadriyah));
        events.add(new Places(R.string.event_spring_name,R.string.event_spring_info,R.drawable.spring));

        PlaceAdapter placeAdapter = new PlaceAdapter (getActivity(),events);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }

}
