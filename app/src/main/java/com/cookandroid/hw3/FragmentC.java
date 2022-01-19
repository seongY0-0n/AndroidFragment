package com.cookandroid.hw3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentC extends Fragment {
    View v;
    EditText editText;

    public static FragmentC getData(String input) {
        FragmentC fragmentC = new FragmentC();
        Bundle data =  new Bundle();
        data.putString("text",input);
        fragmentC.setArguments(data);
        return fragmentC;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_c, container, false);
        editText = (EditText)v.findViewById(R.id.editText);
        if(getArguments() != null){
            String newText = getArguments().getString("text");
            editText.setText(newText);
        }
        return v;
    }
}
