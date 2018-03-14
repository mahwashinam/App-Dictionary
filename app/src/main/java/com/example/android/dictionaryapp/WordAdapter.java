package com.example.android.dictionaryapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mahwash Inam on 20-02-2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Word> words)
    {
        super(context, 0, words);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item1, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView gameName = (TextView) listItemView.findViewById(R.id.gName);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        gameName.setText(currentWord.getName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView gameDesc = (TextView) listItemView.findViewById(R.id.gDescription);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        gameDesc.setText(currentWord.getDescription());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView gameIconView = (ImageView) listItemView.findViewById(R.id.list_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        gameIconView.setImageResource(currentWord.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
