package com.example.android.tourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class QueensFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();

        tours.add(new Tour(R.drawable.hallscience, getString(R.string.halltitle), getString(R.string.hallinfo)));
        tours.add(new Tour(R.drawable.flushingmeadow, getString(R.string.flushingtitle), getString(R.string.flushinginfo)));
        tours.add(new Tour(R.drawable.citifield, getString(R.string.citititle), getString(R.string.citiinfo)));
        tours.add(new Tour(R.drawable.queensgarden, getString(R.string.gardentitle), getString(R.string.gardeninfo)));

        TourAdapter manhattanAdapter = new TourAdapter(getActivity(), tours, R.color.category_queens);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(manhattanAdapter);

        return rootView;
    }
}
