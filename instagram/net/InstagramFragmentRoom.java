package com.example.instagram.net;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import com.example.instagram.R;
import com.example.instagram.model.Counts;

import java.util.ArrayList;
import java.util.List;


public class InstagramFragmentRoom extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public InstagramFragmentRoom() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static InstagramFragmentRoom newInstance(int columnCount) {
        InstagramFragmentRoom fragment = new InstagramFragmentRoom();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            final RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(context));




           // AppDatabase db = Room.databaseBuilder(getActivity(),
              //      AppDatabase.class, "user").build();

            //final InstagramDao productDao = db.instagramDao();

            final List<Counts> all = new ArrayList<Counts>();

            new Thread(new Runnable() {
                @Override
                public void run() {

//                    productDao.insertAll(products.get(0), products.get(1), products.get(2));
//                    all.addAll(productDao.getAll());

                }
            }).start();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    recyclerView.setAdapter(new MyInstagramRecyclerViewAdapter(all));
                }
            }, 3000);

        }
        return view;
    }

}
