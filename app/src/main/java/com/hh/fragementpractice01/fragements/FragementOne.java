package com.hh.fragementpractice01.fragements;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hh.fragementpractice01.MainActivity;
import com.hh.fragementpractice01.R;
import com.hh.fragementpractice01.databinding.Fragment01Binding;

public class FragementOne extends Fragment {

    //Fragem
    Fragment01Binding binding;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_01, container, false);
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_01, container, false);

        return  binding.getRoot();



    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        /*TextView myTextView = getActivity().findViewById(R.id.myTextView);

        myTextView.setText("JAVA");

        */

        binding.myTextView.setText("데이터 바인딩 이용");

        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = binding.titleEdt.getText().toString();

                ((MainActivity) getActivity()).setCustomTitle(title);
            }
        });



    }

    public void changeTextMsg(String inputMessage) {
        binding.myTextView.setText(inputMessage);
    }
}
