package com.max.hbcustomview.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class SwipeableViewPager extends ViewPager {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private Boolean f69690a4;

    public SwipeableViewPager(Context context) {
        super(context);
        this.f69690a4 = Boolean.FALSE;
    }

    public SwipeableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69690a4 = Boolean.FALSE;
    }

    public void Y(Boolean bool) {
        this.f69690a4 = bool;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, c.f.Uv, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return !this.f69690a4.booleanValue() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, c.f.Vv, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return !this.f69690a4.booleanValue() && super.onTouchEvent(motionEvent);
    }
}
