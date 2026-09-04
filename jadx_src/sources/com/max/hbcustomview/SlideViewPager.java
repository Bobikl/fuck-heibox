package com.max.hbcustomview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class SlideViewPager extends CanSetScrollViewPager {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final String f68913f4 = "SlideViewPager";

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    float f68914d4;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    float f68915e4;

    public SlideViewPager(@n0 Context context) {
        super(context);
        this.f68914d4 = 0.0f;
        this.f68915e4 = 0.0f;
    }

    public SlideViewPager(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68914d4 = 0.0f;
        this.f68915e4 = 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.Ac, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.f68914d4 = motionEvent.getX();
            this.f68915e4 = motionEvent.getY();
        } else if (action == 2) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float f10 = x10 - this.f68914d4;
            if (Math.abs(f10) <= ((double) Math.abs(y10 - this.f68915e4)) * 1.2d) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (getCurrentItem() == 0 && f10 > 0.0f) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (getCurrentItem() != getAdapter().getCount() - 1 || f10 >= 0.0f) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
