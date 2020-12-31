package com.michaelmagdy.fragmentdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstFragment extends Fragment {


    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        Button launchBtn = view.findViewById(R.id.launch_btn);
        EditText editText = view.findViewById(R.id.edit_text);
        launchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = editText.getText().toString();
                if (text.isEmpty()){
                    Toast.makeText(getContext(), "text is required", Toast.LENGTH_SHORT).show();
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("user_text", text);
                    FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager()
                            .beginTransaction();
                    SecondFragment secondFragment = new SecondFragment();
                    secondFragment.setArguments(bundle);
                    fragmentTransaction.replace(R.id.container_layout, secondFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }

            }
        });

        return view;
    }
}