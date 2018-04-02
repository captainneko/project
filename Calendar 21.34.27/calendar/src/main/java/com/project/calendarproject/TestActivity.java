package com.project.calendarviewproject;

import android.support.v4.widget.NestedScrollView;
import android.view.View;

import com.project.calendarview.CalendarView;
import com.project.calendarviewproject.base.activity.BaseActivity;


public class TestActivity extends BaseActivity {

    private NestedScrollView mScrollView;
    private CalendarView mCalendarView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_test;
    }

    @Override
    protected void initView() {
        mCalendarView = (CalendarView) findViewById(R.id.calendarView);
        mScrollView = (NestedScrollView) findViewById(R.id.nestedScrollView);
        mScrollView.post(new Runnable() {
            @Override
            public void run() {
                mScrollView.scrollTo(0, 0);
            }
        });
    }

    @Override
    protected void initData() {

    }

    public void onClick(View view) {
        mCalendarView.showSelectLayout(mCalendarView.getCurYear());
    }
}
