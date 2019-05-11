package com.hh.fragementpractice01.fragements;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hh.fragementpractice01.R;
import com.hh.fragementpractice01.databinding.Fagment03Binding;

public class FragementThree extends Fragment {

    Fagment03Binding binding;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fagment_03, container, false);

        binding = DataBindingUtil.inflate(inflater,R.layout.fagment_03, container, false);

        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        /*TextView textView = getActivity().findViewById(R.id.textTest);

        textView.setText("JAVA + 데이터바인딩");
        */

        binding.textTest.setText("JAVA + 데이터바인딩");




    }
}
