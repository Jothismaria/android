package com.example.instagram;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.instagram.Camera.CameraFragment;
import com.example.instagram.Search.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ImageView cam;
    private ImageView sen;

    final Fragment homeFragment = new HomeFragment();
    final Fragment likeFragment = new LikeFragment();
    final Fragment searchFragment = new SearchFragment();
    final Fragment messageFragment = new MessageFragment();
    final Fragment cameraFragment = new CameraFragment();
    final Fragment profileFragment = new ProfileFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: starting.");
        Log.d(TAG, "onCreateView: started");
        // setupToolbar();


        final FragmentManager fragmentManager = getSupportFragmentManager();
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView.");
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment fragment;
                        switch (item.getItemId()) {
                            case R.id.home:
                                fragment = homeFragment;
                                break;
                            case R.id.search:
                                fragment = searchFragment;
                                break;
                            case R.id.circle:
                                fragment = cameraFragment;
                                break;
                            case R.id.fav:
                                fragment = likeFragment;
                                break;
                            case R.id.profile:
                                fragment = profileFragment;
                                break;
                            default:
                                fragment = homeFragment;
                                break;


                        }
                        fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
                        return true;
                    }
                });
        // Set default selection
        bottomNavigationView.setSelectedItemId(R.id.home);
    }

    @Nullable

    public void onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        cam = (ImageView) findViewById(R.id.cam);
        cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cam.getImageAlpha();

            }
        });

    }
}