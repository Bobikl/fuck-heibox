package com.max.hbcustomview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.viewpager.widget.ViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class CanSetScrollViewPager extends ViewPager {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private boolean f68378a4;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    float f68379b4;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    float f68380c4;

    public CanSetScrollViewPager(@n0 Context context) {
        super(context);
        this.f68378a4 = false;
        this.f68379b4 = 0.0f;
        this.f68380c4 = 0.0f;
    }

    public CanSetScrollViewPager(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68378a4 = false;
        this.f68379b4 = 0.0f;
        this.f68380c4 = 0.0f;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i10) {
        return !this.f68378a4;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.f32616v3, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            return !this.f68378a4 && super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.f32594u3, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            return !this.f68378a4 && super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public void setNoScroll(boolean z10) {
        this.f68378a4 = z10;
    }
}
