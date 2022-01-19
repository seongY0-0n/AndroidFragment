package com.cookandroid.hw3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {
    View v;
    EditText editText;

    public static FragmentB getData(String input) {
        FragmentB fragmentB = new FragmentB();
        Bundle data =  new Bundle();
        data.putString("text",input);
        fragmentB.setArguments(data);
        return fragmentB;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_b, container, false);
        editText = (EditText)v.findViewById(R.id.editText);
        if(getArguments() != null){
            String newText = getArguments().getString("text");
            editText.setText(newText);
        }
        return v;
    }
}
