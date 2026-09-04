package com.max.mediaselector.lib.photoview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: CustomGestureDetector.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f75337k = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f75338a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f75339b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScaleGestureDetector f75340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private VelocityTracker f75341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f75342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f75343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f75344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f75345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f75346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f75347j;

    /* JADX INFO: compiled from: CustomGestureDetector.java */
    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f75348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f75349c = 0.0f;

        a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{scaleGestureDetector}, this, changeQuickRedirect, false, bb.c.m.f34600a3, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            if (scaleFactor >= 0.0f) {
                b.this.f75347j.d(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), scaleGestureDetector.getFocusX() - this.f75348b, scaleGestureDetector.getFocusY() - this.f75349c);
                this.f75348b = scaleGestureDetector.getFocusX();
                this.f75349c = scaleGestureDetector.getFocusY();
            }
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{scaleGestureDetector}, this, changeQuickRedirect, false, bb.c.m.f34623b3, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            this.f75348b = scaleGestureDetector.getFocusX();
            this.f75349c = scaleGestureDetector.getFocusY();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    b(Context context, c cVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f75346i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f75345h = viewConfiguration.getScaledTouchSlop();
        this.f75347j = cVar;
        this.f75340c = new ScaleGestureDetector(context, new a());
    }

    private float b(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.m.V2, new Class[]{MotionEvent.class}, Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        try {
            return motionEvent.getX(this.f75339b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    private float c(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.m.W2, new Class[]{MotionEvent.class}, Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        try {
            return motionEvent.getY(this.f75339b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    private boolean g(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.m.Z2, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f75338a = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f75341d = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f75343f = b(motionEvent);
            this.f75344g = c(motionEvent);
            this.f75342e = false;
        } else if (action == 1) {
            this.f75338a = -1;
            if (this.f75342e && this.f75341d != null) {
                this.f75343f = b(motionEvent);
                this.f75344g = c(motionEvent);
                this.f75341d.addMovement(motionEvent);
                this.f75341d.computeCurrentVelocity(1000);
                float xVelocity = this.f75341d.getXVelocity();
                float yVelocity = this.f75341d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f75346i) {
                    this.f75347j.b(this.f75343f, this.f75344g, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker = this.f75341d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f75341d = null;
            }
        } else if (action == 2) {
            float fB = b(motionEvent);
            float fC = c(motionEvent);
            float f10 = fB - this.f75343f;
            float f11 = fC - this.f75344g;
            if (!this.f75342e) {
                this.f75342e = Math.sqrt((double) ((f10 * f10) + (f11 * f11))) >= ((double) this.f75345h);
            }
            if (this.f75342e) {
                this.f75347j.a(f10, f11);
                this.f75343f = fB;
                this.f75344g = fC;
                VelocityTracker velocityTracker2 = this.f75341d;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.f75338a = -1;
            VelocityTracker velocityTracker3 = this.f75341d;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f75341d = null;
            }
        } else if (action == 6) {
            int iB = l.b(motionEvent.getAction());
            if (motionEvent.getPointerId(iB) == this.f75338a) {
                int i10 = iB == 0 ? 1 : 0;
                this.f75338a = motionEvent.getPointerId(i10);
                this.f75343f = motionEvent.getX(i10);
                this.f75344g = motionEvent.getY(i10);
            }
        }
        int i11 = this.f75338a;
        this.f75339b = motionEvent.findPointerIndex(i11 != -1 ? i11 : 0);
        return true;
    }

    public boolean d() {
        return this.f75342e;
    }

    public boolean e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.X2, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f75340c.isInProgress();
    }

    public boolean f(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.m.Y2, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            this.f75340c.onTouchEvent(motionEvent);
            return g(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}
