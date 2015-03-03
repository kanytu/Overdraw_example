package com.poliveira.apps.overdrawtest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by poliveira on 27/02/2015.
 */
public class Fragment2 extends Fragment {
    public static final String TAG = "fragment2";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().getWindow().setBackgroundDrawable(null);
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        getActivity().getWindow().setBackgroundDrawable(Utils.getWindowBackground(getActivity()));
    }

}
