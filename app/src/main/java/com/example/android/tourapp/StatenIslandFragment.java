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
public class StatenIslandFragment extends Fragment {


    public StatenIslandFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();

        tours.add(new Tour(R.drawable.statenmuseum, getString(R.string.statentitle), getString(R.string.stateninfo)));
        tours.add(new Tour(R.drawable.ferry, getString(R.string.ferrytitle), getString(R.string.ferryinfo)));
        tours.add(new Tour(R.drawable.statenzoo, getString(R.string.zootitle), getString(R.string.zooinfo)));
        tours.add(new Tour(R.drawable.jmmta, getString(R.string.jmmotatitle), getString(R.string.jmmotainfo)));

        TourAdapter manhattanAdapter = new TourAdapter(getActivity(), tours, R.color.category_statenisland);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(manhattanAdapter);



        return rootView;
    }

}
