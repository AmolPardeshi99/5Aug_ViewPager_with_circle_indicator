package com.example.a5aug_viewpager_with_circle_indicator;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new Fragment_one();
            case 1: return new Fragment_two();
            case 2: return new Fragment_three();
            case 3: return new Fragment_four();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
