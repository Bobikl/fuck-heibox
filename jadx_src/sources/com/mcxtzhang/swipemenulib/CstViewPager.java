package com.mcxtzhang.swipemenulib;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes13.dex */
public class CstViewPager extends ViewPager {

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final String f96203c4 = "zxt/CstViewPager";

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private int f96204a4;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private int f96205b4;

    public CstViewPager(Context context) {
        super(context);
    }

    public CstViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean Y(int i10, int i11) {
        return Math.abs(i11 - this.f96205b4) < Math.abs(i10 - this.f96204a4);
    }

    private boolean Z() {
        androidx.viewpager.widget.a adapter = getAdapter();
        return adapter != null && adapter.getCount() - 1 == getCurrentItem();
    }

    private boolean a0() {
        return getCurrentItem() == 0;
    }

    private boolean b0(int i10) {
        return i10 - this.f96204a4 < 0;
    }

    private boolean c0(int i10) {
        return i10 - this.f96204a4 > 0;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        boolean z10 = motionEvent.getAction() == 2 && Y(x10, y10) && !((a0() && c0(x10)) || (Z() && b0(x10)));
        this.f96204a4 = x10;
        this.f96205b4 = y10;
        return z10 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }
}
