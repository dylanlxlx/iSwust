package com.dylanlxlx.iswust;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shrikanthravi.collapsiblecalendarview.data.Day;
import com.shrikanthravi.collapsiblecalendarview.widget.CollapsibleCalendar;

public class Page3_Schedule extends Fragment implements CollapsibleCalendar.CalendarListener {

    Page3_DaySchedule1 fra1 = new Page3_DaySchedule1();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_page3_schedule, container, false);

        CollapsibleCalendar collapsibleCalendar = v.findViewById(R.id.calendarView);
        collapsibleCalendar.setCalendarListener(this);
        getChildFragmentManager().beginTransaction().replace(R.id.page3_fra, fra1).commit();
        return v;
    }

    @Override
    public void onClickListener() {

    }

    @Override
    public void onDataUpdate() {

    }

    @Override
    public void onDayChanged() {

    }

    @Override
    public void onDaySelect() {

    }

    @Override
    public void onItemClick(@NonNull View view) {

    }

    @Override
    public void onMonthChange() {

    }

    @Override
    public void onWeekChange(int i) {

    }
}