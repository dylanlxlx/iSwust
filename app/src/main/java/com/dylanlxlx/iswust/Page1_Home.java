package com.dylanlxlx.iswust;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Page1_Home extends Fragment implements View.OnClickListener {

    ViewFlipper vFlipper;
    private final List<Page1_Item> items = new ArrayList<>();
    private Button d1, d2, d3, d4, d5, d6, d7;
    Page1_WeekSchedule1 fra1 = new Page1_WeekSchedule1();
    Page1_WeekSchedule2 fra2 = new Page1_WeekSchedule2();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_page1_home, container, false);
        vFlipper = v.findViewById(R.id.flipper);
        vFlipper.startFlipping();
        initItem();
        initBtnWeek(v);
        RecyclerView recyclerView = v.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        Page1_RV_Adapter adapter = new Page1_RV_Adapter(items);
        recyclerView.addItemDecoration(new SpaceItemDecoration(30));
        recyclerView.setAdapter(adapter);
        return v;
    }

    private void initBtnWeek(View view) {
        d1 = view.findViewById(R.id.day1);
        d2 = view.findViewById(R.id.day2);
        d3 = view.findViewById(R.id.day3);
        d4 = view.findViewById(R.id.day4);
        d5 = view.findViewById(R.id.day5);
        d6 = view.findViewById(R.id.day6);
        d7 = view.findViewById(R.id.day7);

        d1.setOnClickListener(this);
        d2.setOnClickListener(this);
        d3.setOnClickListener(this);
        d4.setOnClickListener(this);
        d5.setOnClickListener(this);
        d6.setOnClickListener(this);
        d7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.day1) {
            getChildFragmentManager().beginTransaction().replace(R.id.schedule_fra, fra1).commit();
            d1.setTextSize(20);
            d2.setTextSize(12);
            d3.setTextSize(12);
            d4.setTextSize(12);
            d5.setTextSize(12);
            d6.setTextSize(12);
            d7.setTextSize(12);
        } else if (id == R.id.day2) {
            getChildFragmentManager().beginTransaction().replace(R.id.schedule_fra, fra2).commit();
            d2.setTextSize(20);
            d1.setTextSize(12);
            d3.setTextSize(12);
            d4.setTextSize(12);
            d5.setTextSize(12);
            d6.setTextSize(12);
            d7.setTextSize(12);
        } else if (id == R.id.day3) {
            getChildFragmentManager().beginTransaction().replace(R.id.schedule_fra, fra2).commit();
            d3.setTextSize(20);
            d2.setTextSize(12);
            d1.setTextSize(12);
            d4.setTextSize(12);
            d5.setTextSize(12);
            d6.setTextSize(12);
            d7.setTextSize(12);
        } else if (id == R.id.day4) {
            getChildFragmentManager().beginTransaction().replace(R.id.schedule_fra, fra1).commit();
            d4.setTextSize(20);
            d2.setTextSize(12);
            d2.setTextSize(12);
            d3.setTextSize(12);
            d1.setTextSize(12);
            d5.setTextSize(12);
            d6.setTextSize(12);
            d7.setTextSize(12);
        } else if (id == R.id.day5) {
            getChildFragmentManager().beginTransaction().replace(R.id.schedule_fra, fra2).commit();
            d5.setTextSize(20);
            d2.setTextSize(12);
            d3.setTextSize(12);
            d4.setTextSize(12);
            d1.setTextSize(12);
            d6.setTextSize(12);
            d7.setTextSize(12);
        } else if (id == R.id.day6) {
            getChildFragmentManager().beginTransaction().replace(R.id.schedule_fra, fra1).commit();
            d6.setTextSize(20);
            d2.setTextSize(12);
            d3.setTextSize(12);
            d4.setTextSize(12);
            d5.setTextSize(12);
            d1.setTextSize(12);
            d7.setTextSize(12);
        } else if (id == R.id.day7) {
            getChildFragmentManager().beginTransaction().replace(R.id.schedule_fra, fra1).commit();
            d7.setTextSize(20);
            d2.setTextSize(12);
            d3.setTextSize(12);
            d4.setTextSize(12);
            d5.setTextSize(12);
            d6.setTextSize(12);
            d1.setTextSize(12);
        }
    }

    private void initItem() {
        Page1_Item wenjuan = new Page1_Item("问卷", R.drawable.wenjuan);
        Page1_Item chengji = new Page1_Item("成绩", R.drawable.chengji);
        Page1_Item qiandao = new Page1_Item("西科签到", R.drawable.qiandao);
        Page1_Item kaoshi = new Page1_Item("考试", R.drawable.kaoshi);
        Page1_Item tushuguan = new Page1_Item("图书馆", R.drawable.tushuguan);
        Page1_Item yingxun = new Page1_Item("西科影讯", R.drawable.yingxun);
        Page1_Item ditu = new Page1_Item("地图", R.drawable.ditu);
        Page1_Item xiaoche = new Page1_Item("校车时刻", R.drawable.xiaoche);
        Page1_Item dianhua = new Page1_Item("办公电话", R.drawable.dianhua);
        Page1_Item xiaoli = new Page1_Item("校历", R.drawable.xiaoli);

        items.add(wenjuan);
        items.add(chengji);
        items.add(qiandao);
        items.add(kaoshi);
        items.add(tushuguan);
        items.add(yingxun);
        items.add(ditu);
        items.add(xiaoche);
        items.add(dianhua);
        items.add(xiaoli);
    }

    static class SpaceItemDecoration extends RecyclerView.ItemDecoration {
        int mSpace;

        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.left = mSpace;
            outRect.right = mSpace;
        }

        public SpaceItemDecoration(int space) {
            this.mSpace = space;
        }
    }

}