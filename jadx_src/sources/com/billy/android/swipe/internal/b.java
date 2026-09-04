package com.billy.android.swipe.internal;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.billy.android.swipe.f;
import java.util.Arrays;

/* JADX INFO: compiled from: SwipeHelper.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static final int A = 3;
    private static final Interpolator B = new a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f40469t = "SwipeHelper";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f40470u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f40471v = -2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f40472w = -3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f40473x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f40474y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f40475z = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewConfiguration f40476a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f40479d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f40481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f40482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f40483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f40484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f40485j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private VelocityTracker f40486k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f40487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f40488m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private OverScroller f40489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final f f40490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f40491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ViewGroup f40492q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f40493r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f40494s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40477b = 600;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40480e = -1;

    /* JADX INFO: compiled from: SwipeHelper.java */
    public static final class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    private b(Context context, ViewGroup viewGroup, f fVar, Interpolator interpolator) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (fVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f40492q = viewGroup;
        this.f40490o = fVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f40476a = viewConfiguration;
        this.f40479d = viewConfiguration.getScaledTouchSlop();
        this.f40487l = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f40488m = viewConfiguration.getScaledMinimumFlingVelocity();
        I(context, interpolator);
    }

    private void E() {
        this.f40486k.computeCurrentVelocity(1000, this.f40487l);
        o(d(this.f40486k.getXVelocity(this.f40480e), this.f40488m, this.f40487l), d(this.f40486k.getYVelocity(this.f40480e), this.f40488m, this.f40487l));
    }

    private void F(float f10, float f11, int i10) {
        r(i10);
        float[] fArr = this.f40481f;
        this.f40483h[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f40482g;
        this.f40484i[i10] = f11;
        fArr2[i10] = f11;
        this.f40485j |= 1 << i10;
    }

    private void G(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (z(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f40483h[pointerId] = x10;
                this.f40484i[pointerId] = y10;
            }
        }
    }

    private boolean O(int i10, int i11, int i12, int i13) {
        int i14 = this.f40493r;
        int i15 = this.f40494s;
        int i16 = i10 - i14;
        int i17 = i11 - i15;
        this.f40489n.abortAnimation();
        if (i16 == 0 && i17 == 0) {
            H(2);
            this.f40490o.o1(i10, i11, i16, i17);
            H(0);
            return false;
        }
        this.f40489n.startScroll(i14, i15, i16, i17, i(i16, i17, i12, i13));
        H(2);
        return true;
    }

    private boolean R(int i10, boolean z10, float f10, float f11, float f12, float f13) {
        return S(i10, z10, f10, f11, f12, f13, true);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    private boolean S(int i10, boolean z10, float f10, float f11, float f12, float f13, boolean z11) {
        float f14;
        if (this.f40480e == i10) {
            return true;
        }
        if (!((z10 || this.f40478c == 2) ? this.f40490o.W1(i10, f10, f11) : this.f40490o.V1(i10, f10, f11, f12, f13))) {
            return false;
        }
        this.f40480e = i10;
        float f15 = 0.0f;
        if (i10 >= 0) {
            float[] fArr = this.f40481f;
            if (i10 < fArr.length) {
                float[] fArr2 = this.f40482g;
                if (i10 < fArr2.length) {
                    f15 = fArr[i10];
                    f14 = fArr2[i10];
                } else {
                    f14 = 0.0f;
                }
            } else {
                f14 = 0.0f;
            }
        } else {
            f14 = 0.0f;
        }
        this.f40490o.n1(i10, z10, f15, f14);
        this.f40493r = this.f40490o.g(0, 0);
        this.f40494s = this.f40490o.h(0, 0);
        H(z11 ? 1 : 3);
        return true;
    }

    private boolean c(float f10, float f11) {
        boolean z10 = this.f40490o.X(f10, f11) > 0;
        boolean z11 = this.f40490o.j0(f10, f11) > 0;
        if (z10 && z11) {
            float f12 = (f10 * f10) + (f11 * f11);
            int i10 = this.f40479d;
            return f12 > ((float) (i10 * i10));
        }
        if (z10) {
            return Math.abs(f10) > ((float) this.f40479d);
        }
        return z11 && Math.abs(f11) > ((float) this.f40479d);
    }

    private float d(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return 0.0f;
        }
        if (fAbs > f12) {
            return f10 > 0.0f ? f12 : -f12;
        }
        return f10;
    }

    private int e(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        if (iAbs > i12) {
            return i10 > 0 ? i12 : -i12;
        }
        return i10;
    }

    private void f() {
        float[] fArr = this.f40481f;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f40482g, 0.0f);
        Arrays.fill(this.f40483h, 0.0f);
        Arrays.fill(this.f40484i, 0.0f);
        this.f40485j = 0;
    }

    private void g(int i10) {
        if (this.f40481f == null || !y(i10)) {
            return;
        }
        this.f40481f[i10] = 0.0f;
        this.f40482g[i10] = 0.0f;
        this.f40483h[i10] = 0.0f;
        this.f40484i[i10] = 0.0f;
        this.f40485j = (~(1 << i10)) & this.f40485j;
    }

    private int h(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f40492q.getWidth();
        float f10 = width >> 1;
        float fP = f10 + (p(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fP / iAbs) * 1000.0f) * 4 : (int) ((Math.abs(i10) / i12) * this.f40477b), this.f40477b);
    }

    private int i(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int iE = e(i12, (int) this.f40488m, (int) this.f40487l);
        int iE2 = e(i13, (int) this.f40488m, (int) this.f40487l);
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        int iAbs3 = Math.abs(iE);
        int iAbs4 = Math.abs(iE2);
        int i14 = iAbs3 + iAbs4;
        int i15 = iAbs + iAbs2;
        if (iE != 0) {
            f10 = iAbs3;
            f11 = i14;
        } else {
            f10 = iAbs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (iE2 != 0) {
            f12 = iAbs4;
            f13 = i14;
        } else {
            f12 = iAbs2;
            f13 = i15;
        }
        float f15 = i10;
        float f16 = i11;
        return (int) ((h(i10, iE, this.f40490o.X(f15, f16)) * f14) + (h(i11, iE2, this.f40490o.j0(f15, f16)) * (f12 / f13)));
    }

    public static b k(ViewGroup viewGroup, float f10, f fVar) {
        return l(viewGroup, f10, fVar, null);
    }

    public static b l(ViewGroup viewGroup, float f10, f fVar, Interpolator interpolator) {
        b bVarN = n(viewGroup, fVar, interpolator);
        bVarN.f40479d = (int) (bVarN.f40479d * (1.0f / f10));
        return bVarN;
    }

    public static b m(ViewGroup viewGroup, f fVar) {
        return n(viewGroup, fVar, null);
    }

    public static b n(ViewGroup viewGroup, f fVar, Interpolator interpolator) {
        return new b(viewGroup.getContext(), viewGroup, fVar, interpolator);
    }

    private float p(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void q(int i10, int i11, int i12, int i13) {
        int i14 = this.f40493r;
        int i15 = this.f40494s;
        if (i12 != 0) {
            i10 = this.f40490o.g(i10, i12);
            this.f40493r = i10;
        }
        if (i13 != 0) {
            i11 = this.f40490o.h(i11, i13);
            this.f40494s = i11;
        }
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f40490o.o1(i10, i11, i10 - i14, i11 - i15);
    }

    private void r(int i10) {
        float[] fArr = this.f40481f;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f40482g;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f40483h;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f40484i;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
            }
            this.f40481f = fArr2;
            this.f40482g = fArr3;
            this.f40483h = fArr4;
            this.f40484i = fArr5;
        }
    }

    private boolean z(int i10) {
        if (y(i10)) {
            return true;
        }
        Log.e(f40469t, "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  SwipeHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean A(int i10, int i11, int[] iArr, boolean z10) {
        int iG;
        int iH;
        if (this.f40478c == 0) {
            return C(i10, i11, z10);
        }
        int i12 = this.f40493r;
        if (i12 == 0 && i10 == 0) {
            iG = 0;
        } else {
            iG = this.f40490o.g(i12 + i10, i10);
            iArr[0] = iG - this.f40493r;
        }
        int i13 = this.f40494s;
        if (i13 == 0 && i11 == 0) {
            iH = 0;
        } else {
            iH = this.f40490o.h(i13 + i11, i11);
            iArr[1] = iH - this.f40494s;
        }
        if (this.f40493r != 0 || this.f40494s != 0 || iArr[0] != 0 || iArr[1] != 0) {
            q(iG, iH, iArr[0], iArr[1]);
            return true;
        }
        this.f40480e = -1;
        H(0);
        return false;
    }

    public void B() {
        if (this.f40478c == 3) {
            o(0.0f, 0.0f);
        }
    }

    public boolean C(int i10, int i11, boolean z10) {
        return S(z10 ? -3 : -2, false, 0.0f, 0.0f, i10, i11, false);
    }

    public void D(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0 && this.f40478c != 1) {
            b();
        }
        if (this.f40486k == null) {
            this.f40486k = VelocityTracker.obtain();
        }
        this.f40486k.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            F(x10, y10, pointerId);
            int i12 = this.f40478c;
            if (i12 != 1) {
                R(pointerId, i12 == 2 || i12 == 3, x10, y10, 0.0f, 0.0f);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f40478c == 1) {
                E();
            }
            b();
            return;
        }
        if (actionMasked == 2) {
            if (this.f40478c == 1) {
                if (z(this.f40480e) && (iFindPointerIndex = motionEvent.findPointerIndex(this.f40480e)) >= 0) {
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f40483h;
                    int i13 = this.f40480e;
                    int i14 = (int) (x11 - fArr[i13]);
                    int i15 = (int) (y11 - this.f40484i[i13]);
                    q(this.f40493r + i14, this.f40494s + i15, i14, i15);
                    G(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            for (int i16 = 0; i16 < pointerCount; i16++) {
                int pointerId2 = motionEvent.getPointerId(i16);
                if (z(pointerId2)) {
                    float x12 = motionEvent.getX(i16);
                    float y12 = motionEvent.getY(i16);
                    float f10 = this.f40481f[pointerId2];
                    float f11 = this.f40482g[pointerId2];
                    float f12 = x12 - f10;
                    float f13 = y12 - f11;
                    if (c(f12, f13) && R(pointerId2, false, f10, f11, f12, f13)) {
                        break;
                    }
                }
            }
            G(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f40478c == 1) {
                o(0.0f, 0.0f);
            }
            b();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            F(x13, y13, pointerId3);
            if (this.f40478c == 1) {
                R(pointerId3, true, x13, y13, 0.0f, 0.0f);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f40478c == 1 && pointerId4 == this.f40480e) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f40480e && z(pointerId5)) {
                    float f14 = this.f40481f[pointerId5];
                    if (R(pointerId5, true, f14, f14, 0.0f, 0.0f)) {
                        i10 = this.f40480e;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                E();
            }
        }
        g(pointerId4);
    }

    void H(int i10) {
        if (this.f40478c != i10) {
            this.f40478c = i10;
            this.f40490o.m1(i10);
        }
    }

    public void I(Context context, Interpolator interpolator) {
        if (interpolator == null) {
            interpolator = B;
        }
        if (this.f40489n != null) {
            a();
            this.f40489n = null;
        }
        this.f40489n = new OverScroller(context, interpolator);
    }

    public void J(int i10) {
        this.f40477b = i10;
    }

    public b K(float f10) {
        this.f40488m = f10;
        return this;
    }

    public void L(float f10) {
        this.f40479d = (int) (this.f40476a.getScaledTouchSlop() * (1.0f / f10));
    }

    public boolean M(int i10, int i11) {
        if (this.f40491p) {
            return O(i10, i11, (int) this.f40486k.getXVelocity(this.f40480e), (int) this.f40486k.getYVelocity(this.f40480e));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    public boolean N(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f40486k == null) {
            this.f40486k = VelocityTracker.obtain();
        }
        this.f40486k.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            F(x10, y10, pointerId);
            int i10 = this.f40478c;
            if (i10 == 2 || i10 == 3) {
                R(pointerId, true, x10, y10, 0.0f, 0.0f);
            }
        } else if (actionMasked == 1) {
            b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                F(x11, y11, pointerId2);
                int i11 = this.f40478c;
                if (i11 == 2 || i11 == 3) {
                    R(pointerId2, true, x11, y11, 0.0f, 0.0f);
                }
            } else if (actionMasked == 6) {
                g(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f40481f != null && this.f40482g != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i12 = 0; i12 < pointerCount; i12++) {
                int pointerId3 = motionEvent.getPointerId(i12);
                if (z(pointerId3)) {
                    float x12 = motionEvent.getX(i12);
                    float y12 = motionEvent.getY(i12);
                    float f10 = this.f40481f[pointerId3];
                    float f11 = this.f40482g[pointerId3];
                    float f12 = x12 - f10;
                    float f13 = y12 - f11;
                    boolean zC = c(f12, f13);
                    if (zC) {
                        int iX = this.f40490o.X(f12, f13);
                        int iJ0 = this.f40490o.j0(f12, f13);
                        if (iX != 0 || iJ0 != 0) {
                            if (zC && R(pointerId3, false, f10, f11, f12, f13)) {
                                break;
                            }
                        }
                    } else if (zC) {
                        continue;
                    }
                }
            }
            G(motionEvent);
        }
        return this.f40478c == 1;
    }

    public boolean P(int i10, int i11) {
        VelocityTracker velocityTracker = this.f40486k;
        boolean zO = velocityTracker != null ? O(i10, i11, (int) velocityTracker.getXVelocity(this.f40480e), (int) this.f40486k.getYVelocity(this.f40480e)) : O(i10, i11, 0, 0);
        this.f40480e = -1;
        return zO;
    }

    public boolean Q(int i10, int i11, int i12, int i13) {
        this.f40493r = i10;
        this.f40494s = i11;
        return P(i12, i13);
    }

    public void a() {
        b();
        int i10 = this.f40478c;
        if (i10 == 2 || i10 == 3) {
            int currX = this.f40489n.getCurrX();
            int currY = this.f40489n.getCurrY();
            this.f40489n.abortAnimation();
            int currX2 = this.f40489n.getCurrX();
            int currY2 = this.f40489n.getCurrY();
            this.f40490o.o1(currX2, currY2, currX2 - currX, currY2 - currY);
        }
        H(0);
    }

    public void b() {
        this.f40480e = -1;
        f();
        VelocityTracker velocityTracker = this.f40486k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f40486k = null;
        }
    }

    public boolean j() {
        if (this.f40478c == 2) {
            boolean zComputeScrollOffset = this.f40489n.computeScrollOffset();
            int currX = this.f40489n.getCurrX();
            int currY = this.f40489n.getCurrY();
            int i10 = currX - this.f40493r;
            int i11 = currY - this.f40494s;
            if (i10 != 0) {
                this.f40493r = currX;
            }
            if (i11 != 0) {
                this.f40494s = currY;
            }
            if (i10 != 0 || i11 != 0) {
                this.f40490o.o1(currX, currY, i10, i11);
            }
            if (zComputeScrollOffset && currX == this.f40489n.getFinalX() && currY == this.f40489n.getFinalY()) {
                this.f40489n.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                H(0);
            }
        }
        return this.f40478c == 2;
    }

    public void o(float f10, float f11) {
        this.f40491p = true;
        this.f40490o.p1(f10, f11);
        this.f40491p = false;
        if (this.f40478c == 1) {
            H(0);
        }
    }

    public int s() {
        return this.f40480e;
    }

    public int t() {
        return this.f40478c;
    }

    public int u() {
        return this.f40477b;
    }

    public float v() {
        return this.f40488m;
    }

    public f w() {
        return this.f40490o;
    }

    public int x() {
        return this.f40479d;
    }

    public boolean y(int i10) {
        return ((1 << i10) & this.f40485j) != 0;
    }
}
