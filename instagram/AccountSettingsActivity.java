package com.example.instagram;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class AccountSettingsActivity extends AppCompatActivity {
    private static final String TAG = "AccountSettingsActivity";
    private Context mContext;

    private SectionsStatePagerAdapter pagerAdapter;
    private ViewPager mViewPager;
    private RelativeLayout mRelativeLayout;
    private Button signout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_setting);
        mContext = AccountSettingsActivity.this;
        Log.d(TAG, "onCreate: started");

        mViewPager = (ViewPager) findViewById(R.id.viewpager);
    //    mRelativeLayout = (RelativeLayout) findViewById(R.id.relLayout11);


        setupSettingsList();
        setupFragments();
     //   getIncomingIntent();
        ImageView backArrow = (ImageView) findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: navigating back to ProfileActivity");
                finish();
            }
        });
    }


//    private void getIncomingIntent() {
//        Intent intent = getIntent();
//        if (intent.hasExtra(getString(R.string.calling_activity))) {
//            Log.d(TAG, "getIncomingIntent: received income from" + getString(R.string.profile_activity));
//            setmViewPager(pagerAdapter.getFragmentNumber(getString(R.string.edit_profile_fragment)));
//        }
//    }

    private void setupFragments() {
        pagerAdapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new EditProfileFragment(), getString(R.string.edit_profile_fragment));//fragment 0
        pagerAdapter.addFragment(new SignOutFragment(), getString(R.string.sign_out_fragment));//fragment 1
        Button signout = (Button) findViewById(R.id.signout);
    }

//    private void setmViewPager(int fragementNumber) {
//        mRelativeLayout.setVisibility(View.GONE);
//        Log.d(TAG, "setmViewPager: navigating to fragment #:" + fragementNumber);
//        mViewPager.setAdapter(pagerAdapter);
//        mViewPager.setCurrentItem(fragementNumber);
//
//    }

    private void setupSettingsList() {
        Log.d(TAG, "setupSettingsLIst: initializing 'Account Settings'list.");
        //ListView listView = (ListView) findViewById(R.id.IvAccountSettings);
        ArrayList<String> options = new ArrayList<>();
        Object getString;
        options.add(getString(R.string.edit_profile_fragment));//fragment 0
        options.add(getString(R.string.sign_out_fragment));//fragment 1

        ArrayAdapter adapter = new ArrayAdapter(mContext, android.R.layout.simple_list_item_1, options);
       // listView.setAdapter(adapter);

//    ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//        @Override
//        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            Log.d(TAG, "onItemClick: navigating to fragment#:" + position);
//            setmViewPager(position);
//        }
//    });
    }
}
