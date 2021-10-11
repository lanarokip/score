package com.kipkoech.score;


import android.content.Context;

import android.widget.ArrayAdapter;

public class livescoreAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mCountries;
    private String[] mNoGames;

    public livescoreAdapter(Context mContext,int resource,String[] mCountries,String[] mNoGames){
        super(mContext, resource);
        this.mContext=mContext;
        this.mCountries = mCountries;
        this.mNoGames = mNoGames;
    }

    @Override
      public Object getItem(int position){
        String countries = mCountries[position];
        String noGames = mNoGames[position];
        return  String.format("%s \n run %s" , countries,noGames);
    }
    @Override
    public int getCount() {
        return mCountries.length;
    }
}