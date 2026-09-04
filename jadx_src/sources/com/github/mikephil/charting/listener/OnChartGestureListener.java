package com.github.mikephil.charting.listener;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes6.dex */
public interface OnChartGestureListener {
    void onChartDoubleTapped(MotionEvent motionEvent);

    void onChartFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11);

    void onChartGestureEnd(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture);

    void onChartGestureStart(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture);

    void onChartLongPressed(MotionEvent motionEvent);

    void onChartScale(MotionEvent motionEvent, float f10, float f11);

    void onChartSingleTapped(MotionEvent motionEvent);

    void onChartTranslate(MotionEvent motionEvent, float f10, float f11);
}
