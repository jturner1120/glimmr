package com.bourke.glimmr.common;

import android.content.Context;

import android.graphics.Typeface;

import android.view.LayoutInflater;
import android.view.View;

import android.widget.TextView;

import com.actionbarsherlock.app.ActionBar;

import com.bourke.glimmr.common.Constants;
import com.bourke.glimmr.R;

public class GlimmrAbCustomTitle {

    protected TextView mAbTitle;
    protected Context mContext;

    public GlimmrAbCustomTitle(Context context) {
        mContext = context;
    }

    public void init(ActionBar actionbar) {
        LayoutInflater inflator = (LayoutInflater)
            mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflator.inflate(R.layout.action_bar_title_item, null);
        mAbTitle = (TextView) v.findViewById(R.id.abTitle);
        Typeface typeface = Typeface.createFromAsset(mContext.getAssets(),
                Constants.FONT_SHADOWSINTOLIGHT);
        mAbTitle.setTypeface(typeface);
        mAbTitle.setText(mContext.getString(R.string.app_name));
        actionbar.setDisplayShowCustomEnabled(true);
        actionbar.setDisplayShowTitleEnabled(false);
        actionbar.setCustomView(v);
    }
}