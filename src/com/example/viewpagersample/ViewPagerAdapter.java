package com.example.viewpagersample;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
        case 0:
            return new LeftViewFragment();
        case 1:
            return new CenterViewFragment();
        default:
            return new RightViewFragment();
        }
    }

    // ページ数
    @Override
    public int getCount() {
        return 3;
    }

    // タブタイトル
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
        case 0:
            return "Left View";
        case 1:
            return "Center View";
        case 2:
            return "Right View";
        }
        return "";
    }
}