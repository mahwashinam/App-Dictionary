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
public class ChattingFragment extends Fragment {


    public ChattingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_chatting, container, false);

        ArrayList<Word> words7= new ArrayList<Word>();
        words7.add(new Word("Dubsmash","8.4MB  4.3*",  R.drawable.dubsmash));
        words7.add(new Word("Facebook","55MB  4.4*",  R.drawable.facebook));
        words7.add(new Word("Hike","95MB  4.4*",  R.drawable.hike));
        words7.add(new Word("imo","11.2MB  4.4*",  R.drawable.imo));
        words7.add(new Word("Instagram","9.5MB  4.6*",  R.drawable.insta));
        words7.add(new Word("LinkedIn","8.5MB  4.6*",  R.drawable.linkedin));
        words7.add(new Word("Messenger","7.0MB  4.1*",  R.drawable.messenger));
        words7.add(new Word("Pinterest","3.3MB  4.7*",  R.drawable.pinterest));
        words7.add(new Word("Skype","9.2MB  4.3*",  R.drawable.skype));
        words7.add(new Word("Snapchat","35MB  4.7*",  R.drawable.snapchat));
        words7.add(new Word("Tumblr","8.4MB  4.3*",  R.drawable.tumblr));
        words7.add(new Word("Twitter","55MB  4.4*",  R.drawable.twitter));
        words7.add(new Word("Viber","95MB  4.4*",  R.drawable.viber));
        words7.add(new Word("WeChat","95MB  4.4*",  R.drawable.wechat));
        words7.add(new Word("Whatsapp","95MB  4.4*",  R.drawable.whatsapp));
        words7.add(new Word("Youtube","95MB  4.4*",  R.drawable.youtube));

        WordAdapter adapter7 = new WordAdapter(getActivity(), words7);

        ListView listView7 = (ListView) rootView.findViewById(R.id.list7);

        listView7.setAdapter(adapter7);
        return rootView;
    }
    @Override
    public void onStop() {
        super.onStop();
    }

}
