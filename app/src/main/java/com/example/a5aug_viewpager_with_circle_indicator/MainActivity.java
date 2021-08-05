package com.example.a5aug_viewpager_with_circle_indicator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener{

    private TextView mTvSkip, mTvDone;
    private ViewPager2 viewPager2;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setPagerAdapter();
    }

    private void setPagerAdapter() {
        FragmentAdapter fragmentAdapter = new FragmentAdapter(MainActivity.this);
        viewPager2.setAdapter(fragmentAdapter);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

            }
        }).attach();
    }

    private void initViews() {
        mTvSkip = findViewById(R.id.tvSkip);
        mTvDone = findViewById(R.id.tvDone);
        viewPager2 = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        tabLayout.addOnTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        if (tab.getPosition()==3){
            mTvDone.setVisibility(View.VISIBLE);
            mTvSkip.setVisibility(View.INVISIBLE);
        }else {
            mTvDone.setVisibility(View.INVISIBLE);
            mTvSkip.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}