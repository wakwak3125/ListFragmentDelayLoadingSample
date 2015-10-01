package com.wakwak.listfragmentdelayloadingsample;


import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListUnderFragment extends Fragment {

    ArrayAdapter<String> mAdapter;
    ExpandableHeightListView mListView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public ListUnderFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_under, container, false);
        mListView = (ExpandableHeightListView) view.findViewById(R.id.listView);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        List<String> stringList = new ArrayList<String>();
        for (int i = 0; i <= 100; i++) {
            stringList.add("USER" + i);
        }
        mAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1,
                stringList
        );
        mListView.setExpanded(true);
        execSetAdapter();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public void execSetAdapter() {
        Log.d("ExecSetAdapter", "Now Setting, Adapter for List.");
        Handler handler = new Handler();
        handler.postDelayed(setAdapterForList, 2000);

    }

    private Runnable setAdapterForList = new Runnable() {
        @Override
        public void run() {
            mListView.setAdapter(mAdapter);
        }
    };
}
