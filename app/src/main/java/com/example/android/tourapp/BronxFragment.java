package com.example.android.tourapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BronxFragment extends Fragment {


    public BronxFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();

        tours.add(new Tour(R.drawable.bronxzoo, getString(R.string.bronxzootitle), getString(R.string.bronxzooinfo)));
        tours.add(new Tour(R.drawable.yankeestadium, getString(R.string.yankeetitle), getString(R.string.yankeeinfo)));
        tours.add(new Tour(R.drawable.bronxart, getString(R.string.arttitle), getString(R.string.artinfo)));
        tours.add(new Tour(R.drawable.eap, getString(R.string.eaptitle), getString(R.string.eapinfo)));

        TourAdapter manhattanAdapter = new TourAdapter(getActivity(), tours, R.color.category_bronx);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(manhattanAdapter);



        return rootView;
    }

}
