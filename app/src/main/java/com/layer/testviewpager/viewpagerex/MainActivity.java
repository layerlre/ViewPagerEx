package com.layer.testviewpager.viewpagerex;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add sample data
        ArrayList<Integer> picList = new ArrayList<Integer>();
        picList.add(R.drawable.pic01);
        picList.add(R.drawable.pic02);
        picList.add(R.drawable.pic03);

        MyPagerAdapter mAdapter = new MyPagerAdapter();

        //add View to Adapter
        for (int resource : picList) {
            ImageView iv = (ImageView) getLayoutInflater().inflate(R.layout.my_image,null);
            iv.setImageResource(resource);
            mAdapter.addView(iv);
        }

        ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        viewPager.setAdapter(mAdapter);

    }

}
