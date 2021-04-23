package me.kithumini.lolascupcake;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;


public class CakeListFragment extends Fragment {

    List<Cake> cakeList = Arrays.asList(
            new Cake("Chocolate Cupcake1",500, "cagsdhabs dbasd bkjas bdkjas dkja bsdkj asdja", "img1.png"),
            new Cake("Chocolate Cupcake2",300, "cagsdhabs dbasd bkjas bdkjas dkja bsdkj asdja", "img1.png"),
            new Cake("Chocolate Cupcake3",400, "cagsdhabs dbasd bkjas bdkjas dkja bsdkj asdja", "img1.png"),
            new Cake("Chocolate Cupcake4",200, "cagsdhabs dbasd bkjas bdkjas dkja bsdkj asdja", "img1.png"),
            new Cake("Chocolate Cupcake5",500, "cagsdhabs dbasd bkjas bdkjas dkja bsdkj asdja", "img1.png"),
            new Cake("Chocolate Cupcake6",550, "cagsdhabs dbasd bkjas bdkjas dkja bsdkj asdja", "img1.png"),
            new Cake("Chocolate Cupcake7",760, "cagsdhabs dbasd bkjas bdkjas dkja bsdkj asdja", "img1.png")
    );

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
        View cakeListView = inflater.inflate(R.layout.fragment_cake_list, container, false);
        RecyclerView cakeListRecycleView = cakeListView.findViewById(R.id.cake_list_recycleview);
        cakeListRecycleView.setLayoutManager(new LinearLayoutManager(cakeListRecycleView.getContext()));
        cakeListRecycleView.setAdapter(new CakeListAdapter(cakeList));


        return cakeListView;
    }
}