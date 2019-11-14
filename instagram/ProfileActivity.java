package com.example.instagram;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.instagram.model.Data;
import com.example.instagram.net.InstagramRecyclerViewAdapter;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {
    ArrayList<Data> model;
    private static final String TAG = "ProfileActivity";
    private ProgressBar mProgressBar;
    private ImageView profilePhoto;
    private TextView editprofile;
    private ImageView menu;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

//
//        // ...
//        // Lookup the recyclerview in activity layout
//        RecyclerView centerprofile = (RecyclerView) findViewById(R.id.centerprofile);
//
//        // Initialize contacts
//        //  model = Data.createcenterList(20);
//        // Create adapter passing in the sample user data
//        InstagramRecyclerViewAdapter adapter = new InstagramRecyclerViewAdapter(model);
//        // Attach the adapter to the recyclerview to populate items
//        centerprofile.setAdapter(adapter);
//        // Set layout manager to position the items
//        centerprofile.setLayoutManager(new LinearLayoutManager(this));
//

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d(TAG, "onCreate: started");
        editprofile = (TextView) findViewById(R.id.editprofile);
        editprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editprofile.setText(" ");

            }
        });
//        setContentView(R.layout.snippet_top_profile);
//        menu = (ImageView)findViewById(R.id.menu);
//        menu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                menu.set(" ");
//            }
//        });
    }
}



//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_editprofile, container, false);
//       // editprofile = (TextView) view.findViewById(R.id.editprofile);
//
////        public final void editprofile(View view) {
////        Intent intent = new Intent(this, AccountSettingsActivity.class);
////        startActivity(intent);
//        //}




