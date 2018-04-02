package com.project.calendarviewproject.custom;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;

import com.project.calendarview.Calendar;
import com.project.calendarview.WeekBar;
import com.project.calendarviewproject.R;



public class CustomWeekBar extends WeekBar {

    private int mPreSelectedIndex;

    public CustomWeekBar(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.english_week_bar, this, true);
        setBackgroundColor(Color.WHITE);
    }

    @Override
    protected void onDateSelected(Calendar calendar, boolean isClick) {
        getChildAt(mPreSelectedIndex).setSelected(false);
        getChildAt(calendar.getWeek()).setSelected(true);
        mPreSelectedIndex = calendar.getWeek();
    }
}
