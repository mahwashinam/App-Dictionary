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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_shopping, container, false);

        ArrayList<Word> words6= new ArrayList<Word>();
        words6.add(new Word("Ajio Online Shopping","8.4MB  4.3*",  R.drawable.ajio));
        words6.add(new Word("AliExpress Shopping","55MB  4.4*",  R.drawable.aliexprs));
        words6.add(new Word("Amazon","95MB  4.4*",  R.drawable.amazon));
        words6.add(new Word("BrandFactory","11.2MB  4.4*",  R.drawable.brandfac));
        words6.add(new Word("ClubFactory","9.5MB  4.6*",  R.drawable.club));
        words6.add(new Word("CraftVilla","8.5MB  4.6*",  R.drawable.craftvilla));
        words6.add(new Word("eBay","8.5MB  4.6*",  R.drawable.ebay));
        words6.add(new Word("Flipkart","7.0MB  4.1*",  R.drawable.flipkart));
        words6.add(new Word("Home18 Mobile","23MB  4.3*",  R.drawable.homeshop));
        words6.add(new Word("Jabong","3.3MB  4.7*",  R.drawable.jabong));
        words6.add(new Word("KOOVS","9.2MB  4.3*",  R.drawable.koovs));
        words6.add(new Word("Kraftly","35MB  4.7*",  R.drawable.kraftly));
        words6.add(new Word("LimeRoad ","8.4MB  4.3*",  R.drawable.limeroad));
        words6.add(new Word("Max Fashion","55MB  4.4*",  R.drawable.max));
        words6.add(new Word("Myntra","95MB  4.4*",  R.drawable.myntra));
        words6.add(new Word("Nykaa","11.2MB  4.4*",  R.drawable.nykaa));
        words6.add(new Word("Paytm Mall","9.5MB  4.6*",  R.drawable.paytmmall));
        words6.add(new Word("ROMWE","8.5MB  4.6*",  R.drawable.rowme));
        words6.add(new Word("Shein","8.5MB  4.6*",  R.drawable.shein));
        words6.add(new Word("Shopper Stop","7.0MB  4.1*",  R.drawable.shopperstop));
        words6.add(new Word("Snapdeal","23MB  4.3*",  R.drawable.snapdeal));
        words6.add(new Word("Voonik","3.3MB  4.7*",  R.drawable.voonik));
        words6.add(new Word("Wish","9.2MB  4.3*",  R.drawable.wish));
        words6.add(new Word("Yepme","35MB  4.7*",  R.drawable.yepme));
        words6.add(new Word("Zara","35MB  4.7*",  R.drawable.zara));



        WordAdapter adapter6 = new WordAdapter(getActivity(), words6);

        ListView listView6 = (ListView) rootView.findViewById(R.id.list6);

        listView6.setAdapter(adapter6);
        return rootView;
    }
    @Override
    public void onStop() {
        super.onStop();
    }

}
