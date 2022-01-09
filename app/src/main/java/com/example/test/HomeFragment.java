package com.example.test;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    Button btnHom;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

            View root = inflater.inflate(R.layout.fragment_home, container, false);

        btnHom = root.findViewById(R.id.btnHome);
        btnHom.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "Welcom to Home Fragment", Toast.LENGTH_SHORT).show();

        });

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}