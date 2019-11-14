package com.example.instagram.net;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;
import com.example.instagram.model.Counts;
import java.util.ArrayList;
import java.util.List;


public class UserFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private Object Counts;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public UserFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static UserFragment newInstance(int columnCount) {
        UserFragment fragment = new UserFragment();
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
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(context));

//            runDb();

 //           runQeuery();

  //          List<Counts> counts =  runQeuery();
//            products.add(new ProductModel("id1", "asfs", "asfsa", "asfs"));
//            products.add(new ProductModel("id2", "asfs", "asfsa", "asfs"));
//            products.add(new ProductModel("id3", "asfs", "asfsa", "asfs"));

 //           recyclerView.setAdapter(new MyInstagramRecyclerViewAdapter(counts));
        }
        return view;
    }

//    private List<Counts> runQeuery() {
//        InstagramDbHelper dbHelper = new InstagramDbHelper(getContext());
//
//        SQLiteDatabase db = dbHelper.getWritableDatabase();
//
//        Cursor cursor = db.query(
//                Counts.UserTable.TABLE_NAME,   // The table to query
//                null,             // The array of columns to return (pass null to get all)
//                null,              // The columns for the WHERE clause
//                null,          // The values for the WHERE clause
//                null,                   // don't group the rows
//                null,                   // don't filter by row groups
//                null               // The sort order
//        );
//
//        List<Counts> items = new ArrayList<>();
//        while (cursor.moveToNext()) {
//            cursor.moveToNext();
//
//            String media = cursor.getString(
//                    cursor.getColumnIndexOrThrow(Counts.UserTable.COLUMN_NAME_MEDIA));
//            String follows = cursor.getString(
//                    cursor.getColumnIndexOrThrow(Counts.UserTable.COLUMN_NAME_FOLLOWED));
//            String followedby = cursor.getString(
//                    cursor.getColumnIndexOrThrow(Counts.UserTable.COLUMN_NAME_FOLLOWEDBY));
//
//            Counts counts = new Counts(media,follows, followedby);
//
//            items.add(Counts);
//
//        items.add(Counts);
//        }
//        cursor.close();
//        return items;
//    }
//
//    private void runDb() {
//        InstagramDbHelper dbHelper = new InstagramDbHelper(getContext());
//
//        SQLiteDatabase db = dbHelper.getWritableDatabase();
//
////        dbHelper.onCreate(db);
//
//        ContentValues row1 = new ContentValues();
//        row1.put(Counts.UserTable.COLUMN_NAME_NAME, "");
//        row1.put(Counts.UserTable.COLUMN_NAME_DESC, "");
//        row1.put(Counts.UserTable.COLUMN_NAME_IMAGE, "");
//
//
//        ContentValues row2 = new ContentValues();
//
//        row1.put(Counts.UserTable.COLUMN_NAME_NAME, "");
//        row1.put(Counts.UserTable.COLUMN_NAME_DESC, "");
//        row1.put(Counts.UserTable.COLUMN_NAME_IMAGE, "");
//
//// Insert the new row, returning the primary key value of the new row
//        long newRowId = db.insert(Counts.UserTable.TABLE_NAME, null, row1);
//        long newRowId1 = db.insert(Counts.UserTable.TABLE_NAME, null, row2);
//    }

}
