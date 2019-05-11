package com.hh.fragementpractice01;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hh.fragementpractice01.adapters.PagerAdapter;
import com.hh.fragementpractice01.databinding.ActivityMainBinding;
import com.hh.fragementpractice01.fragements.FragementOne;
import com.hh.fragementpractice01.fragements.FragementTwo;

public class MainActivity extends BaseActivity {
    ActivityMainBinding act;
    PagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bindViews();
        setupEvents();
        setValues();

    }

    @Override
    public void setupEvents() {

        act.changeFragOneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                act.viewPager.setCurrentItem(0);

               /* act.changeFragOneBtn.setText("현재 선택됨");
                act.changeFragTwoBtn.setText("2번 프래그먼트");
                act.changeFragThreeBtn.setText("3번 프래그먼트");*/
            }
        });

        act.changeFragTwoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*Fragment fr = new FragementTwo();

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragOne, fr);
                fragmentTransaction.commit();*/

                // 2번 화면 버튼을 누름 => 2번째 페이지를 보여주자

                act.viewPager.setCurrentItem(1);

               /* act.changeFragOneBtn.setText("1번 프래그먼트");
                act.changeFragTwoBtn.setText("현재 선택됨");
                act.changeFragThreeBtn.setText("3번 프래그먼트");
*/



            }
        });

        act.changeFragThreeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                act.viewPager.setCurrentItem(2);

                /*act.changeFragOneBtn.setText("1번 프래그먼트");
                act.changeFragTwoBtn.setText("2번 프래그먼트");
                act.changeFragThreeBtn.setText("현재 선택됨");*/
            }
        });


        act.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

                if (i == 0) {
                    act.changeFragOneBtn.setText("현재 선택됨");
                    act.changeFragTwoBtn.setText("2번 프래그먼트333");
                    act.changeFragThreeBtn.setText("3번 프래그먼트");
                }
                else if (i == 1){
                    act.changeFragOneBtn.setText("1번 프래그먼트");
                    act.changeFragTwoBtn.setText("현재 선택됨222");
                    act.changeFragThreeBtn.setText("3번 프래그먼트");
                }
                else if (i == 2){
                    act.changeFragOneBtn.setText("1번 프래그먼트");
                    act.changeFragTwoBtn.setText("2번 프래그먼트");
                    act.changeFragThreeBtn.setText("현재 선택됨11");
                }


            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });


        act.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //                버튼이 눌렸을때 하고싶은 일?

//                1. 지금 보여지고 있는 Fragment에 접근
//                 => 현재 작성중인 MainActivity에서?

                Fragment currentFrag = pagerAdapter.getItem(act.viewPager.getCurrentItem());

//                2. 접근한 Fragment에게 어떻게 작업을 시킬건지?

                if (act.viewPager.getCurrentItem() == 0) {
//                    currentFrag가 FragmentOne 이다!

                    ((FragementOne) currentFrag).changeTextMsg(act.testEdt.getText().toString());


                }
                else if (act.viewPager.getCurrentItem() == 1) {
//                    currentFrag가 FragmentTwo !
                }
                else if (act.viewPager.getCurrentItem() == 2) {
//                    currentFrag가 FragmentThree !
                }





            }
        });

    }

    @Override
    public void setValues() {

        /*PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), 3);
        act.viewPager.setAdapter(pagerAdapter);*/

        act.viewPager.setOffscreenPageLimit(4); // 프래그먼의 갯수와 맞춰주자!

        pagerAdapter = new PagerAdapter(getSupportFragmentManager(), 3);
        act.viewPager.setAdapter(pagerAdapter);


    }

    public void setCustomTitle(String inputTitle) {
        setTitle(String.format("입력값 : %s", inputTitle));
        act.testEdt.setText(inputTitle);
    }

    @Override
    public void bindViews() {
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);

    }
}
