package com.max.hbcustomview.viewpager2.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HBFakeDrag.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HBViewPager2 f69777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f69778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RecyclerView f69779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private VelocityTracker f69780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f69782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f69783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f69784h;

    d(HBViewPager2 hBViewPager2, g gVar, RecyclerView recyclerView) {
        this.f69777a = hBViewPager2;
        this.f69778b = gVar;
        this.f69779c = recyclerView;
    }

    private void a(long j10, int i10, float f10, float f11) {
        Object[] objArr = {new Long(j10), new Integer(i10), new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.px, new Class[]{Long.TYPE, Integer.TYPE, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(this.f69784h, j10, i10, f10, f11, 0);
        this.f69780d.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    private void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.ox, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        VelocityTracker velocityTracker = this.f69780d;
        if (velocityTracker != null) {
            velocityTracker.clear();
        } else {
            this.f69780d = VelocityTracker.obtain();
            this.f69781e = ViewConfiguration.get(this.f69777a.getContext()).getScaledMaximumFlingVelocity();
        }
    }

    @i1
    boolean b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.lx, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.f69778b.isDragging()) {
            return false;
        }
        this.f69783g = 0;
        this.f69782f = 0;
        this.f69784h = SystemClock.uptimeMillis();
        c();
        this.f69778b.notifyBeginFakeDrag();
        if (!this.f69778b.isIdle()) {
            this.f69779c.stopScroll();
        }
        a(this.f69784h, 0, 0.0f, 0.0f);
        return true;
    }

    @i1
    boolean d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.nx, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!this.f69778b.isFakeDragging()) {
            return false;
        }
        this.f69778b.notifyEndFakeDrag();
        VelocityTracker velocityTracker = this.f69780d;
        velocityTracker.computeCurrentVelocity(1000, this.f69781e);
        if (this.f69779c.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            return true;
        }
        this.f69777a.u();
        return true;
    }

    @i1
    boolean e(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.mx, new Class[]{Float.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!this.f69778b.isFakeDragging()) {
            return false;
        }
        float f11 = this.f69782f - f10;
        this.f69782f = f11;
        int iRound = Math.round(f11 - this.f69783g);
        this.f69783g += iRound;
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z10 = this.f69777a.getOrientation() == 0;
        int i10 = z10 ? iRound : 0;
        int i11 = z10 ? 0 : iRound;
        float f12 = z10 ? this.f69782f : 0.0f;
        float f13 = z10 ? 0.0f : this.f69782f;
        this.f69779c.scrollBy(i10, i11);
        a(jUptimeMillis, 2, f12, f13);
        return true;
    }

    boolean f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.kx, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f69778b.isFakeDragging();
    }
}
