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
public class BrooklynFragment extends Fragment {


    public BrooklynFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.drawable.prospectpark, getString(R.string.prospecttitle), getString(R.string.prospectinfo)));
        tours.add(new Tour(R.drawable.prospectzoo, getString(R.string.prospectzootitle), getString(R.string.prospectzooinfo)));
        tours.add(new Tour(R.drawable.nyaquarium, getString(R.string.nyaquatitle), getString(R.string.nyaquainfo)));
        tours.add(new Tour(R.drawable.bridge, getString(R.string.bridgetitle), getString(R.string.bridgeinfo)));

        TourAdapter manhattanAdapter = new TourAdapter(getActivity(), tours, R.color.category_brooklyn);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(manhattanAdapter);


        return rootView;
    }
}
