package com.max.hbcustomview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class ViewPagerFixed extends ViewPager {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private boolean f68979a4;

    public ViewPagerFixed(Context context) {
        super(context);
        this.f68979a4 = true;
    }

    public ViewPagerFixed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68979a4 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.f32561se, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            return this.f68979a4 && super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.f32539re, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            return this.f68979a4 && super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public void setCanScroll(boolean z10) {
        this.f68979a4 = z10;
    }
}
