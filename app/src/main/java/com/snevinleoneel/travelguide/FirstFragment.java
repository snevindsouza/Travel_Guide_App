package com.snevinleoneel.travelguide;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class FirstFragment extends Fragment {


    View view;
    FrameLayout Venice,Sydney,London,Delhi,Dubai;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_first, container, false);
        Venice=view.findViewById(R.id.venice);
        Sydney=view.findViewById(R.id.sydney);
        London=view.findViewById(R.id.london);
        Delhi=view.findViewById(R.id.delhi);
        Dubai=view.findViewById(R.id.dubai);

        Venice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getActivity(),VeniceActivity.class);
                startActivity(a);
            }
        });
        Sydney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(getActivity(),SydneyActivity.class);
                startActivity(b);
            }
        });
        London.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(getActivity(),LondonActivity.class);
                startActivity(b);
            }
        });
        Delhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(getActivity(),DelhiActivity.class);
                startActivity(c);
            }
        });
        Dubai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(getActivity(),DubaiActivity.class);
                startActivity(c);
            }
        });


        return view;

    }
}