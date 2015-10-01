package com.wakwak.listfragmentdelayloadingsample;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class HeadFragment extends Fragment {


    public HeadFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_head, container, false);
        //EventBus.getDefault().post(new CreatedHead(true));
        return view;
    }
}
