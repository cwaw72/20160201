package com.fit.basic.kr.Fragment;

import android.app.ActionBar;
import android.app.FragmentManager;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.fit.basic.kr.R;

public class Activity_group_test extends FragmentActivity {


    TestFragmentAdapter mAdapter;
    ViewPager mPager;
    PageIndicator mIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_test);

        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mPager.setOffscreenPageLimit(4);

        mIndicator = (IconPageIndicator) findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);

        Log.i("fuck", "you");
    }

}
