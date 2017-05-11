package com.example.kh.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kh.myapplication.Module.Fragment_A;
import com.example.kh.myapplication.Module.Fragment_B;
import com.example.kh.myapplication.Module.Fragment_C;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.paper);
        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
    }
}

class MyAdapter extends FragmentPagerAdapter {
    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if(position==0){
            fragment = new Fragment_A();
        }
        if(position==1){
            fragment = new Fragment_B();
        }
        if(position==2){
            fragment = new Fragment_C();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Tab 1";
        }
        if(position==1){
            return "Tab 2";
        }
        if(position==2){
            return "Tab 3";
        }
        return super.getPageTitle(position);
    }
}
