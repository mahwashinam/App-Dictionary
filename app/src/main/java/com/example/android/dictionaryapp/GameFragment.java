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
public class GameFragment extends Fragment {


    public GameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_game, container, false);

        ArrayList<Word> words4= new ArrayList<Word>();
        words4.add(new Word("2048","2.3MB  4.4*",  R.drawable.g2048));
        words4.add(new Word("8 Ball Pool","53MB  4.5*",  R.drawable.pool8));
        words4.add(new Word("Angry Birds","95MB  4.4*",  R.drawable.angrybirds));
        words4.add(new Word("Benji Banana","23MB  4.3*",  R.drawable.benji));
        words4.add(new Word("Candy Crush","72MB  4.4*",  R.drawable.candy));
        words4.add(new Word("Clash of Clans","95MB  4.6*",  R.drawable.clash));
        words4.add(new Word("Criminal Case","62MB  4.5*",  R.drawable.criminal));
        words4.add(new Word("Eternium","86MB  4.8*",  R.drawable.eternium));
        words4.add(new Word("Fruit Ninja","92MB  4.3*",  R.drawable.fruit));
        words4.add(new Word("G-Switch 3","35MB  4.7*",  R.drawable.g_switch));
        words4.add(new Word("Hill Climb Racing","48MB  4.4*",  R.drawable.hill));
        words4.add(new Word("Knock Down","3.0MB  4.0*",  R.drawable.knock));
        words4.add(new Word("Ludo King","35MB  4.4*",  R.drawable.ludoking));
        words4.add(new Word("My Talking Tom","76MB  4.5*",  R.drawable.talkingtom));
        words4.add(new Word("N.O.V.A. Legacy","29MB  4.5*",  R.drawable.nova));
        words4.add(new Word("Subway Surfers","69MB  4.5*",  R.drawable.subway));
        words4.add(new Word("Sudoku","65MB  4.7*",  R.drawable.sudoku));
        words4.add(new Word("Temple Run","67MB  4.3*",  R.drawable.temple));
        words4.add(new Word("World Cricket Championship 2","140MB  4.6*",  R.drawable.wcc));


        WordAdapter adapter4 = new WordAdapter(getActivity(), words4);

        ListView listView4 = (ListView) rootView.findViewById(R.id.list4);

        listView4.setAdapter(adapter4);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }


}
