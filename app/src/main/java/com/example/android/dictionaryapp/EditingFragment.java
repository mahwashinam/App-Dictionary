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
public class EditingFragment extends Fragment {


    public EditingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_editing, container, false);

        ArrayList<Word> words8= new ArrayList<Word>();
        words8.add(new Word("Adobe Photoshop", "8.4MB  4.3*", R.drawable.adobeicon));
        words8.add(new Word("B612","55MB  4.4*",  R.drawable.iconbsix));
        words8.add(new Word("Beauty Plus","95MB  4.4*",  R.drawable.beauty));
        words8.add(new Word("musical.ly","23MB  4.3*",  R.drawable.musicaly));
        words8.add(new Word("PicsArt","11.2MB  4.4*",  R.drawable.picsart));
        words8.add(new Word("Pixlr","9.5MB  4.6*",  R.drawable.pixlr));
        words8.add(new Word("Snapseed","8.5MB  4.6*",  R.drawable.linkedin));
        words8.add(new Word("Toolwiz","7.0MB  4.1*",  R.drawable.messenger));
        words8.add(new Word("Viva Video","23MB  4.3*",  R.drawable.musicaly));
        words8.add(new Word("YouCam Perfect","3.3MB  4.7*",  R.drawable.youcam));

        WordAdapter adapter1 = new WordAdapter(getActivity(), words8);

        ListView listView1 = (ListView) rootView.findViewById(R.id.list1);

        listView1.setAdapter(adapter1);
        return rootView;
    }
    @Override
    public void onStop() {
        super.onStop();
    }
}
