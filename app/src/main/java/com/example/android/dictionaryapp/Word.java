package com.example.android.dictionaryapp;

/**
 * Created by Mahwash Inam on 20-02-2018.
 */

public class Word {
    private String gName;
    private String gDescription;
    // Drawable resource ID
    private int gImageResourceId;

    public Word(String gN, String gDesc, int imgId)
    {
        gName = gN;
        gDescription = gDesc;
        gImageResourceId = imgId;
    }

    public String getName()
    {
        return gName;
    }

    public String getDescription()
    {
        return gDescription;
    }

    public int getImageResourceId() {
        return gImageResourceId;
    }


}
