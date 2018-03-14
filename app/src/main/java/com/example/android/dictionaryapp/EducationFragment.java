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
public class EducationFragment extends Fragment {


    public EducationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_education, container, false);

        ArrayList<Word> words2= new ArrayList<Word>();
        words2.add(new Word("BYJU'S","8.4MB  4.3*",  R.drawable.byju));
        words2.add(new Word("Coursera","55MB  4.4*",  R.drawable.coursera));
        words2.add(new Word("DataCamp","95MB  4.4*",  R.drawable.datacamp));
        words2.add(new Word("edX","11.2MB  4.4*",  R.drawable.edx));
        words2.add(new Word("GeeksforGeeks","9.5MB  4.6*",  R.drawable.geeks));
        words2.add(new Word("Kindle","8.5MB  4.6*",  R.drawable.kindle));
        words2.add(new Word("Learn Code Online","8.5MB  4.6*",  R.drawable.learn));
        words2.add(new Word("Lynda","7.0MB  4.1*",  R.drawable.lynda));
        words2.add(new Word("Quora","23MB  4.3*",  R.drawable.quora));
        words2.add(new Word("Solo Learn","3.3MB  4.7*",  R.drawable.solo));
        words2.add(new Word("Stack Overflow","9.2MB  4.3*",  R.drawable.stack));
        words2.add(new Word("Udacity","35MB  4.7*",  R.drawable.udacity));
        words2.add(new Word("Udemy ","8.4MB  4.3*",  R.drawable.udemy));
        words2.add(new Word("Wikipedia","55MB  4.4*",  R.drawable.wikipedia));
        words2.add(new Word("Youth4work","95MB  4.4*",  R.drawable.youth));




        WordAdapter adapter2 = new WordAdapter(getActivity(), words2);

        ListView listView2 = (ListView) rootView.findViewById(R.id.list2);

        listView2.setAdapter(adapter2);
        return rootView;
    }
    @Override
    public void onStop() {
        super.onStop();
    }

}
