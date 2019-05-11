package com.hh.fragementpractice01.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.hh.fragementpractice01.fragements.FragementOne;
import com.hh.fragementpractice01.fragements.FragementThree;
import com.hh.fragementpractice01.fragements.FragementTwo;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int mNumOfTabs) {
        super(fm);
        this.mNumOfTabs = mNumOfTabs;
    }

    @Override
    public Fragment getItem(int i) {

        Fragment fr = null;

        if (i == 0) {
            FragementOne frag1 = new FragementOne();
            fr = frag1;

        }
        else if (i == 1) {
            FragementTwo frag2 = new FragementTwo();
            fr = frag2;

        }
        else if (i == 2) {
            FragementThree frag3 = new FragementThree();
            fr = frag3;
        }



        return fr;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
