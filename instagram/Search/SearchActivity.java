package com.example.instagram.Search;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.instagram.R;

public class SearchActivity  extends AppCompatActivity {


    private static final String TAG = "SearchActivity";
    private ImageView searchpic;
    private Context context;

    //private mExampleList list;
    @Nullable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


//        setContentView(R.layout.activity_profile);
//        Log.d(TAG, "onCreate: started");
//        searchpic = (ImageView) findViewById(R.id.searchpic);
//        searchpic.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                searchpic.getImageAlpha();
//
//            }
//        });
    }
}








