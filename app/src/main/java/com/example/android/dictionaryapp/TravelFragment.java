package com.example.android.dictionaryapp;


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
public class TravelFragment extends Fragment {


    public TravelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_travel, container, false);

        ArrayList<Word> words8= new ArrayList<Word>();
        words8.add(new Word("Goibibo","4.4MB  4.3*",  R.drawable.goibibo));
        words8.add(new Word("Google Earth","55MB  4.4*",  R.drawable.google));
        words8.add(new Word("IndiGo","95MB  4.4*",  R.drawable.indigo));
        words8.add(new Word("IRCTC","72MB  4.4*",  R.drawable.irctc));
        words8.add(new Word("ixigo","95MB  4.6*",  R.drawable.ixigo));
        words8.add(new Word("MakeyTrip","35MB  4.7*",  R.drawable.make));
        words8.add(new Word("MAPS.ME","8.5MB  4.6*",  R.drawable.mapme));
        words8.add(new Word("Ola","8.5MB  4.6*",  R.drawable.ola));
        words8.add(new Word("Tracker","7.0MB  4.1*",  R.drawable.tracker));
        words8.add(new Word("Trivago","23MB  4.3*",  R.drawable.trivago));
        words8.add(new Word("Uber","3.3MB  4.7*",  R.drawable.uber));
        words8.add(new Word("Yatra","92MB  4.3*",  R.drawable.yatra));



        WordAdapter adapter8 = new WordAdapter(getActivity(), words8);

        ListView listView8 = (ListView) rootView.findViewById(R.id.list8);

        listView8.setAdapter(adapter8);
        return rootView;
    }
    @Override
    public void onStop() {
        super.onStop();
    }
    }


