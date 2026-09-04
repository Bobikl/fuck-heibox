package com.max.hbexpression.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.viewpager.widget.ViewPager;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class ExpressionViewPager extends ViewPager {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private boolean f70249a4;

    public ExpressionViewPager(@n0 Context context) {
        super(context);
        this.f70249a4 = true;
    }

    public ExpressionViewPager(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70249a4 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, c.g.f32767c4, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f70249a4 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, c.g.f32787d4, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f70249a4 && super.onTouchEvent(motionEvent);
    }

    public void setScanScroll(boolean z10) {
        this.f70249a4 = z10;
    }
}
