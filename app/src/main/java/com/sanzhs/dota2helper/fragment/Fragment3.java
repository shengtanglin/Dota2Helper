package com.sanzhs.dota2helper.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import com.sanzhs.dota2helper.R;

/**
 * Created by sanzhs on 2017/8/24.
 */

public class Fragment3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment3, container, false);

        TextView tv = (TextView) rootView.findViewById(R.id.textView3);
        tv.setText("fragment3");
        Log.i("tag","fragment3 setChecked and setText done");

        return rootView;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}