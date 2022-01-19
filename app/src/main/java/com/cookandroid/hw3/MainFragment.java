package com.cookandroid.hw3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class MainFragment extends Fragment {
    View v;
    Button btn_fragA, btn_fragB, btn_fragC;
    EditText editText;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_main, container, false);

        btn_fragA = (Button)v.findViewById(R.id.btn_fragA);
        btn_fragB = (Button)v.findViewById(R.id.btn_fragB);
        btn_fragC = (Button)v.findViewById(R.id.btn_fragC);

        btn_fragA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText=(EditText)v.findViewById(R.id.editText);
                String input = String.valueOf(editText.getText());
                MainActivity mainActivity = (MainActivity)getActivity();
                mainActivity.changeFragment(FragmentA.getData(input));
            }
        });

        btn_fragB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText=(EditText)v.findViewById(R.id.editText);
                String input = String.valueOf(editText.getText());
                MainActivity mainActivity = (MainActivity)getActivity();
                mainActivity.changeFragment(FragmentB.getData(input));
            }
        });
        btn_fragC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText=(EditText)v.findViewById(R.id.editText);
                String input = String.valueOf(editText.getText());
                MainActivity mainActivity = (MainActivity)getActivity();
                mainActivity.changeFragment(FragmentC.getData(input));
            }
        });

        return v;
    }
}
