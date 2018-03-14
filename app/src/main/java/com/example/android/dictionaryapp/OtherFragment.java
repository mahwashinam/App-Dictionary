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
public class OtherFragment extends Fragment {


    public OtherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_other, container, false);

        ArrayList<Word> words5= new ArrayList<Word>();
        words5.add(new Word("Chrome","4.4MB  4.3*",  R.drawable.chrome));
        words5.add(new Word("Circle of 6","4.4MB  4.3*",  R.drawable.circle));
        words5.add(new Word("Dropbox","55MB  4.4*",  R.drawable.dropbox));
        words5.add(new Word("Evernote","95MB  4.4*",  R.drawable.evernote));
        words5.add(new Word("Google Drive","72MB  4.4*",  R.drawable.googled));
        words5.add(new Word("IFTTT","95MB  4.6*",  R.drawable.ifttt));
        words5.add(new Word("Inshorts","8.5MB  4.6*",  R.drawable.inshorts));
        words5.add(new Word("NDTV News","8.5MB  4.6*",  R.drawable.ndtv));
        words5.add(new Word("Opera Mini","4.4MB  4.3*",  R.drawable.opera));
        words5.add(new Word("Oxford Dictionary","7.0MB  4.1*",  R.drawable.oxford));
        words5.add(new Word("PayTm","4.4MB  4.3*",  R.drawable.paytm));
        words5.add(new Word("Skout","23MB  4.3*",  R.drawable.skout));
        words5.add(new Word("Tasker","3.3MB  4.7*",  R.drawable.tasker));
        words5.add(new Word("Times of India News","92MB  4.3*",  R.drawable.toi));
        words5.add(new Word("UC Browser","4.4MB  4.3*",  R.drawable.circle));
        words5.add(new Word("Zombies, Run!","35MB  4.7*",  R.drawable.zombie));


        WordAdapter adapter5 = new WordAdapter(getActivity(), words5);

        ListView listView5 = (ListView) rootView.findViewById(R.id.list5);

        listView5.setAdapter(adapter5);
        return rootView;
    }
    @Override
    public void onStop() {
        super.onStop();
    }


}
