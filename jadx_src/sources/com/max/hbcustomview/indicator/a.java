package com.max.hbcustomview.indicator;

import androidx.viewpager.widget.ViewPager;

/* JADX INFO: compiled from: PageIndicator.java */
/* JADX INFO: loaded from: classes10.dex */
public interface a extends ViewPager.i {
    void notifyDataSetChanged();

    void setCurrentItem(int i10);

    void setOnPageChangeListener(ViewPager.i iVar);

    void setViewPager(ViewPager viewPager);

    void setViewPager(ViewPager viewPager, int i10);
}
