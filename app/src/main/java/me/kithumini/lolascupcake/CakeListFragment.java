package me.kithumini.lolascupcake;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CakeListFragment extends Fragment {

    public CakeListFragment() {
        // Required empty public constructor
    }

    public static CakeListFragment newInstance() {
        CakeListFragment fragment = new CakeListFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cake_list, container, false);
    }
}