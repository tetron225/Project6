package com.example.android.tourapp;

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

public class ManhattanFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();

        tours.add(new Tour(R.drawable.empirestate, getString(R.string.empiretitle), getString(R.string.empireinfo)));
        tours.add(new Tour(R.drawable.naturalmuseum, getString(R.string.museumtitle), getString(R.string.museum)));
        tours.add(new Tour(R.drawable.freedomtower, getString(R.string.freedomtitle), getString(R.string.freedominfo)));
        tours.add(new Tour(R.drawable.timesquare, getString(R.string.timetitle), getString(R.string.timeinfo)));

        TourAdapter manhattanAdapter = new TourAdapter(getActivity(), tours, R.color.category_manhattan);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(manhattanAdapter);



        return rootView;
    }

}
