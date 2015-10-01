package com.wakwak.listfragmentdelayloadingsample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment headFragment = new HeadFragment();
        Fragment listUnderFragment = new ListUnderFragment();
        ft.replace(R.id.headFragment, headFragment);
        ft.replace(R.id.listFragment, listUnderFragment);
        ft.commit();
    }
}
