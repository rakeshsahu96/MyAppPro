package com.example.awizom.myapppro.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.awizom.myapppro.FileConverterActivity;
import com.example.awizom.myapppro.R;
public class HomeFragment extends Fragment {
    ImageButton fileconverte;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
fileconverte=view.findViewById(R.id.id1);
fileconverte.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(getContext(), FileConverterActivity.class);
        startActivity(intent);
    }
});
        return view;
    }

}
