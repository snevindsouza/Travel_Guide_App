package com.snevinleoneel.travelguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        bottomNavigationView=findViewById(R.id.bottomview);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new FirstFragment()).commit();
        bottomNavigationView.setSelectedItemId(R.id.des);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()) {

                    case R.id.des:
                        fragment = new FirstFragment();
                        break;
                    case R.id.pro:
                        fragment = new SecondFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).commit();
                return true;
            }
        });
    }
}