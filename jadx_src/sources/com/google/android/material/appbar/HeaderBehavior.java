package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes7.dex */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f53024p = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private Runnable f53025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    OverScroller f53026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f53027k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f53028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f53029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f53030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private VelocityTracker f53031o;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CoordinatorLayout f53032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final V f53033c;

        a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f53032b = coordinatorLayout;
            this.f53033c = v10;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f53033c == null || (overScroller = HeaderBehavior.this.f53026j) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                HeaderBehavior.this.Y(this.f53032b, this.f53033c);
                return;
            }
            HeaderBehavior headerBehavior = HeaderBehavior.this;
            headerBehavior.a0(this.f53032b, this.f53033c, headerBehavior.f53026j.getCurrY());
            j1.p1(this.f53033c, this);
        }
    }

    public HeaderBehavior() {
        this.f53028l = -1;
        this.f53030n = -1;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53028l = -1;
        this.f53030n = -1;
    }

    private void T() {
        if (this.f53031o == null) {
            this.f53031o = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean H(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 MotionEvent motionEvent) {
        boolean z10;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.f53031o;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f53031o.computeCurrentVelocity(1000);
                U(coordinatorLayout, v10, -W(v10), 0, this.f53031o.getYVelocity(this.f53028l));
                z10 = true;
            }
            this.f53027k = false;
            this.f53028l = -1;
            velocityTracker = this.f53031o;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f53031o = null;
            }
            velocityTracker2 = this.f53031o;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.f53027k) {
                return true;
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f53028l);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int i10 = this.f53029m - y10;
            this.f53029m = y10;
            Z(coordinatorLayout, v10, i10, V(v10), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f53028l = motionEvent.getPointerId(i11);
                this.f53029m = (int) (motionEvent.getY(i11) + 0.5f);
            }
        }
        z10 = false;
        velocityTracker2 = this.f53031o;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f53027k || z10;
        z10 = false;
        this.f53027k = false;
        this.f53028l = -1;
        velocityTracker = this.f53031o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f53031o = null;
        }
        velocityTracker2 = this.f53031o;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f53027k) {
            return true;
        }
    }

    boolean S(V v10) {
        return false;
    }

    final boolean U(CoordinatorLayout coordinatorLayout, @n0 V v10, int i10, int i11, float f10) {
        Runnable runnable = this.f53025i;
        if (runnable != null) {
            v10.removeCallbacks(runnable);
            this.f53025i = null;
        }
        if (this.f53026j == null) {
            this.f53026j = new OverScroller(v10.getContext());
        }
        this.f53026j.fling(0, K(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f53026j.computeScrollOffset()) {
            Y(coordinatorLayout, v10);
            return false;
        }
        a aVar = new a(coordinatorLayout, v10);
        this.f53025i = aVar;
        j1.p1(v10, aVar);
        return true;
    }

    int V(@n0 V v10) {
        return -v10.getHeight();
    }

    int W(@n0 V v10) {
        return v10.getHeight();
    }

    int X() {
        return K();
    }

    void Y(CoordinatorLayout coordinatorLayout, V v10) {
    }

    final int Z(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        return b0(coordinatorLayout, v10, X() - i10, i11, i12);
    }

    int a0(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        return b0(coordinatorLayout, v10, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int b0(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int iE;
        int iK = K();
        if (i11 == 0 || iK < i11 || iK > i12 || iK == (iE = a2.a.e(i10, i11, i12))) {
            return 0;
        }
        Q(iE);
        return iK - iE;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean o(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f53030n < 0) {
            this.f53030n = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f53027k) {
            int i10 = this.f53028l;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f53029m) > this.f53030n) {
                this.f53029m = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f53028l = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = S(v10) && coordinatorLayout.C(v10, x10, y11);
            this.f53027k = z10;
            if (z10) {
                this.f53029m = y11;
                this.f53028l = motionEvent.getPointerId(0);
                T();
                OverScroller overScroller = this.f53026j;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f53026j.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f53031o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}
