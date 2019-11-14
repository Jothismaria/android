package com.example.instagram;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.List;
/*class to store fragment of tabs*/

public class SectionsStatePagerAdapter extends FragmentPagerAdapter {
    private static final String TAG = "SectionStatePagerAdapter";
    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final HashMap<Fragment,Integer> mFragments = new HashMap<>();
    private final HashMap<String,Integer> mFragmentNumbers = new HashMap<>();
    private final HashMap<Integer,String> mFragmentNames = new HashMap<>();
    private String mFragmentName;
    private String fragmentName;

    public SectionsStatePagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position){
        return mFragmentList.get(position);
    }
    public int getCount(){
        return mFragmentList.size();
    }
    public void addFragment(Fragment fragment, String string){
        mFragmentList.add(fragment);
        mFragments.put(fragment,mFragmentList.size()-1);
        mFragmentNumbers.put(fragmentName,mFragmentList.size()-1);
        mFragmentNames.put(mFragmentList.size()-1, fragmentName);
    }

    public Integer getFragmentNumber(String fragmentName){
        if(mFragmentNumbers.containsKey(fragmentName)) {
            return mFragmentNumbers.get(fragmentName);
        }
        else{
            return null;
        }
    }
    /*returns fragment with name @param fragment*/
    public Integer getFragmentNumber(Fragment fragment){
        if(mFragmentNumbers.containsKey(fragmentName)) {
            return mFragmentNumbers.get(fragmentName);
        }
        else{
            return null;
        }
    }
}

