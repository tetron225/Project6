package com.example.android.tourapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {


    private String tabTitles[];
    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        tabTitles = context.getResources().getStringArray(R.array.cityArray);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) {
            return new QueensFragment();
        } else if(position == 1) {
            return new BrooklynFragment();
        } else if(position == 2) {
            return new BronxFragment();
        } else if(position == 3) {
            return new StatenIslandFragment();
        } else {
            return new ManhattanFragment();
        }
    }

    @Override
    public int getCount() { return 5;}

    @Override
    public CharSequence getPageTitle(int position) { return tabTitles[position];}

}
