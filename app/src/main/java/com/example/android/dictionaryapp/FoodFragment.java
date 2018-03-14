package com.example.android.dictionaryapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    WordAdapter adapter3;

    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_food, container, false);


        ArrayList<Word> words3= new ArrayList<Word>();
        words3.add(new Word("Burger King","4.4MB  4.3*",  R.drawable.burger));
        words3.add(new Word("Chai Point Food & Tea","55MB  4.4*",  R.drawable.chai));
        words3.add(new Word("Domino's Pizza","95MB  4.4*",  R.drawable.dominos));
        words3.add(new Word("Foodpanda","72MB  4.4*",  R.drawable.foodpanda));
        words3.add(new Word("FreshMenu","95MB  4.6*",  R.drawable.fresh));
        words3.add(new Word("Starbucks","95MB  4.6*",  R.drawable.starbucks));
        words3.add(new Word("Swiggy","8.5MB  4.6*",  R.drawable.swiggy));
        words3.add(new Word("The Fork","8.5MB  4.6*",  R.drawable.fork));
        words3.add(new Word("UberEats","7.0MB  4.1*",  R.drawable.ubereat));
        words3.add(new Word("Zomato","23MB  4.3*",  R.drawable.zomato));



         adapter3 = new WordAdapter(getActivity(), words3);

        ListView listView3 = (ListView) rootView.findViewById(R.id.list3);

        listView3.setAdapter(adapter3);
        return rootView;
    }


    @Override
    public void onStop() {
        super.onStop();
    }
    }

