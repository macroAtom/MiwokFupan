package com.example.android.miwokfupan;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CategoryFragementAdapter} factory method to
 * create an instance of this fragment.
 */
public class CategoryFragementAdapter extends FragmentPagerAdapter {


    public CategoryFragementAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {

        if(position == 0){
            return new NumbersFragment();
        }else {
            return new ColorsFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab " + (position + 1);
    }
}