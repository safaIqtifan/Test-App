package com.example.test;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginFragment extends Fragment {

    Button logIn;
    EditText edEmail,tvPassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_login, container, false);

        logIn=root.findViewById(R.id.logIn);
        edEmail=root.findViewById(R.id.edEmail);
        tvPassword=root.findViewById(R.id.tvPassword);

        logIn.setOnClickListener(v -> {
            if(tvPassword.getText().toString().equals("123")){

                SecandFragment fragment = new SecandFragment();
                Bundle bundle = new Bundle();
                bundle.putString("userName", edEmail.getText().toString());
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, fragment).commit();
            }else {
                Toast.makeText(getActivity(), "Invalid Password", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}