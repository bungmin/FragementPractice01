package com.hh.fragementpractice01;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hh.fragementpractice01.adapters.PagerAdapter;
import com.hh.fragementpractice01.databinding.ActivityMainBinding;
import com.hh.fragementpractice01.fragements.FragementTwo;

public class MainActivity extends BaseActivity {
    ActivityMainBinding act;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bindViews();
        setupEvents();
        setValues();

    }

    @Override
    public void setupEvents() {

        act.changeFragTwoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment fr = new FragementTwo();

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragOne, fr);
                fragmentTransaction.commit();




            }
        });

    }

    @Override
    public void setValues() {

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), 3);
        act.viewPager.setAdapter(pagerAdapter);


    }

    @Override
    public void bindViews() {
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);

    }
}
