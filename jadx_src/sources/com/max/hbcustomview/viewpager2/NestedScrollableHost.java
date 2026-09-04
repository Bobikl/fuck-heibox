package com.max.hbcustomview.viewpager2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NestedScrollableHost.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class NestedScrollableHost extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f69691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f69692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f69693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(@d Context context) {
        super(context);
        f0.p(context, "context");
        this.f69691b = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(@d Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        this.f69691b = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private final boolean a(int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), new Float(f10)}, this, changeQuickRedirect, false, c.f.Yv, new Class[]{Integer.TYPE, Float.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int i11 = -((int) Math.signum(f10));
        if (i10 == 0) {
            View child = getChild();
            if (child != null) {
                return child.canScrollHorizontally(i11);
            }
            return false;
        }
        if (i10 != 1) {
            throw new IllegalArgumentException();
        }
        View child2 = getChild();
        if (child2 != null) {
            return child2.canScrollVertically(i11);
        }
        return false;
    }

    private final void b(MotionEvent motionEvent) {
        ViewPager2 parentViewPager;
        if (PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, c.f.aw, new Class[]{MotionEvent.class}, Void.TYPE).isSupported || (parentViewPager = getParentViewPager()) == null) {
            return;
        }
        int orientation = parentViewPager.getOrientation();
        if (a(orientation, -1.0f) || a(orientation, 1.0f)) {
            if (motionEvent.getAction() == 0) {
                this.f69692c = motionEvent.getX();
                this.f69693d = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                return;
            }
            if (motionEvent.getAction() == 2) {
                float x10 = motionEvent.getX() - this.f69692c;
                float y10 = motionEvent.getY() - this.f69693d;
                boolean z10 = orientation == 0;
                float fAbs = Math.abs(x10) * (z10 ? 0.5f : 1.0f);
                float fAbs2 = Math.abs(y10) * (z10 ? 1.0f : 0.5f);
                int i10 = this.f69691b;
                if (fAbs > i10 || fAbs2 > i10) {
                    if (z10 == (fAbs2 > fAbs)) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        return;
                    }
                    if (!z10) {
                        x10 = y10;
                    }
                    if (a(orientation, x10)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        }
    }

    private final View getChild() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Xv, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0027, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.viewpager2.widget.ViewPager2 getParentViewPager() {
        /*
            r8 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = com.max.hbcustomview.viewpager2.NestedScrollableHost.changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<androidx.viewpager2.widget.ViewPager2> r7 = androidx.viewpager2.widget.ViewPager2.class
            r4 = 0
            r5 = 6105(0x17d9, float:8.555E-42)
            r2 = r8
            com.meituan.robust.PatchProxyResult r0 = com.meituan.robust.PatchProxy.proxy(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r0.isSupported
            if (r1 == 0) goto L1a
            java.lang.Object r0 = r0.result
            androidx.viewpager2.widget.ViewPager2 r0 = (androidx.viewpager2.widget.ViewPager2) r0
            return r0
        L1a:
            android.view.ViewParent r0 = r8.getParent()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto L26
            android.view.View r0 = (android.view.View) r0
            goto L27
        L26:
            r0 = r2
        L27:
            if (r0 == 0) goto L38
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r1 != 0) goto L38
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L26
            android.view.View r0 = (android.view.View) r0
            goto L27
        L38:
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r1 == 0) goto L3f
            r2 = r0
            androidx.viewpager2.widget.ViewPager2 r2 = (androidx.viewpager2.widget.ViewPager2) r2
        L3f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.hbcustomview.viewpager2.NestedScrollableHost.getParentViewPager():androidx.viewpager2.widget.ViewPager2");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@d MotionEvent e10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, c.f.Zv, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(e10, "e");
        b(e10);
        return super.onInterceptTouchEvent(e10);
    }
}
