package com.github.chrisbanes.photoview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: CustomGestureDetector.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f43084k = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43085a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43086b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScaleGestureDetector f43087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private VelocityTracker f43088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f43089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f43090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f43091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f43092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f43093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f43094j;

    /* JADX INFO: compiled from: CustomGestureDetector.java */
    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            if (scaleFactor < 0.0f) {
                return true;
            }
            c.this.f43094j.c(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    c(Context context, d dVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f43093i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f43092h = viewConfiguration.getScaledTouchSlop();
        this.f43094j = dVar;
        this.f43087c = new ScaleGestureDetector(context, new a());
    }

    private float b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f43086b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    private float c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f43086b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    private boolean g(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f43085a = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f43088d = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f43090f = b(motionEvent);
            this.f43091g = c(motionEvent);
            this.f43089e = false;
        } else if (action == 1) {
            this.f43085a = -1;
            if (this.f43089e && this.f43088d != null) {
                this.f43090f = b(motionEvent);
                this.f43091g = c(motionEvent);
                this.f43088d.addMovement(motionEvent);
                this.f43088d.computeCurrentVelocity(1000);
                float xVelocity = this.f43088d.getXVelocity();
                float yVelocity = this.f43088d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f43093i) {
                    this.f43094j.b(this.f43090f, this.f43091g, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker = this.f43088d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f43088d = null;
            }
        } else if (action == 2) {
            float fB = b(motionEvent);
            float fC = c(motionEvent);
            float f10 = fB - this.f43090f;
            float f11 = fC - this.f43091g;
            if (!this.f43089e) {
                this.f43089e = Math.sqrt((double) ((f10 * f10) + (f11 * f11))) >= ((double) this.f43092h);
            }
            if (this.f43089e) {
                this.f43094j.a(f10, f11);
                this.f43090f = fB;
                this.f43091g = fC;
                VelocityTracker velocityTracker2 = this.f43088d;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.f43085a = -1;
            VelocityTracker velocityTracker3 = this.f43088d;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f43088d = null;
            }
        } else if (action == 6) {
            int iB = m.b(motionEvent.getAction());
            if (motionEvent.getPointerId(iB) == this.f43085a) {
                int i10 = iB == 0 ? 1 : 0;
                this.f43085a = motionEvent.getPointerId(i10);
                this.f43090f = motionEvent.getX(i10);
                this.f43091g = motionEvent.getY(i10);
            }
        }
        int i11 = this.f43085a;
        this.f43086b = motionEvent.findPointerIndex(i11 != -1 ? i11 : 0);
        return true;
    }

    public boolean d() {
        return this.f43089e;
    }

    public boolean e() {
        return this.f43087c.isInProgress();
    }

    public boolean f(MotionEvent motionEvent) {
        try {
            this.f43087c.onTouchEvent(motionEvent);
            return g(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}
