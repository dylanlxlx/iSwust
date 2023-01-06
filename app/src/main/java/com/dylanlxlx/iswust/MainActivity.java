package com.dylanlxlx.iswust;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<Fragment> pages = new ArrayList<>();
    private ViewPager viewPager;
    private ImageButton btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), pages);
        init();
        viewPager.setAdapter(pagerAdapter);
    }

    private void init() {
        viewPager = findViewById(R.id.myViewpage);
        btn1 = findViewById(R.id.home);
        btn2 = findViewById(R.id.course_table);
        btn3 = findViewById(R.id.schedule);
        btn4 = findViewById(R.id.my);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

        pages.add(new Page1_Home());
        pages.add(new Page2_CourseTable());
        pages.add(new Page3_Schedule());
        pages.add(new Page4_My());

        viewPager.setCurrentItem(0);
        btn1.setImageResource(R.drawable.home_color);
        btn2.setImageResource(R.drawable.course_table);
        btn3.setImageResource(R.drawable.schedule);
        btn4.setImageResource(R.drawable.my);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.home) {
            viewPager.setCurrentItem(0);
            btn1.setImageResource(R.drawable.home_color);
            btn2.setImageResource(R.drawable.course_table);
            btn3.setImageResource(R.drawable.schedule);
            btn4.setImageResource(R.drawable.my);
        } else if (v.getId() == R.id.course_table) {
            viewPager.setCurrentItem(1);
            btn1.setImageResource(R.drawable.home);
            btn2.setImageResource(R.drawable.course_color);
            btn3.setImageResource(R.drawable.schedule);
            btn4.setImageResource(R.drawable.my);
        } else if (v.getId() == R.id.schedule) {
            viewPager.setCurrentItem(2);
            btn1.setImageResource(R.drawable.home);
            btn2.setImageResource(R.drawable.course_table);
            btn3.setImageResource(R.drawable.schedule_color);
            btn4.setImageResource(R.drawable.my);
        } else if (v.getId() == R.id.my) {
            viewPager.setCurrentItem(3);
            btn1.setImageResource(R.drawable.home);
            btn2.setImageResource(R.drawable.course_table);
            btn3.setImageResource(R.drawable.schedule);
            btn4.setImageResource(R.drawable.my_color);
        }
    }

    class PagerAdapter extends FragmentPagerAdapter {

        public PagerAdapter(@NonNull FragmentManager fm, ArrayList<Fragment> fragments) {
            super(fm);
            pages = fragments;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return pages.get(position);
        }

        @Override
        public int getCount() {
            return pages.size();
        }
    }
}