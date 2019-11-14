package com.example.instagram;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;

import com.example.instagram.Camera.CameraFragment;

class SectionsPagerAdapter extends PagerAdapter {
    public SectionsPagerAdapter(FragmentManager supportFragmentManager) {
    }

    public void addFragment(CameraFragment cameraFragment) {
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }

    public void addFragment(HomeFragment homeFragment) {
    }

    public void addFragment(MessageFragment messageFragment) {
    }
}
