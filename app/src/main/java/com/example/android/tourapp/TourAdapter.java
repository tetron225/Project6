package com.example.android.tourapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {

    private int colorResourceID;

    public TourAdapter(Activity context, ArrayList<Tour> tourList, int colorCode) {
        super(context, 0, tourList);
        colorResourceID = colorCode;
    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Tour currentTour = getItem(position);

        View textContainer = listItemView.findViewById(R.id.listText);
        int color = ContextCompat.getColor(getContext(), colorResourceID);
        textContainer.setBackgroundColor(color);

        TextView cityText = (TextView) listItemView.findViewById(R.id.cityword);
        cityText.setTextSize(16);
        cityText.setText(currentTour.getCityName());

        TextView detailText = (TextView) listItemView.findViewById(R.id.detailword);
        detailText.setTextSize(10);
        detailText.setText(currentTour.getDetails());

        ImageView imageID = (ImageView) listItemView.findViewById(R.id.imagesource);
        if(currentTour.hasImage()) {
            imageID.setImageResource(currentTour.getImageResourceId());
            imageID.setVisibility(View.VISIBLE);
        } else {
            imageID.setVisibility(View.GONE);
        }

        return listItemView;


    }
}
