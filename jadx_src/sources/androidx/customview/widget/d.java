package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.core.view.j1;
import java.util.Arrays;

/* JADX INFO: compiled from: ViewDragHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class d {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 4;
    public static final int F = 8;
    public static final int G = 15;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 3;
    private static final int K = 20;
    private static final int L = 256;
    private static final int M = 600;
    private static final Interpolator N = new a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f22009x = "ViewDragHelper";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f22010y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f22011z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22013b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f22015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f22016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f22017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f22018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f22019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f22020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f22021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f22022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VelocityTracker f22023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f22024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f22025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f22026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f22027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f22028q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private OverScroller f22029r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c f22030s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f22031t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f22032u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ViewGroup f22033v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22014c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f22034w = new b();

    /* JADX INFO: compiled from: ViewDragHelper.java */
    public class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX INFO: compiled from: ViewDragHelper.java */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.R(0);
        }
    }

    /* JADX INFO: compiled from: ViewDragHelper.java */
    public static abstract class c {
        public int a(@n0 View view, int i10, int i11) {
            return 0;
        }

        public int b(@n0 View view, int i10, int i11) {
            return 0;
        }

        public int c(int i10) {
            return i10;
        }

        public int d(@n0 View view) {
            return 0;
        }

        public int e(@n0 View view) {
            return 0;
        }

        public void f(int i10, int i11) {
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public void i(@n0 View view, int i10) {
        }

        public void j(int i10) {
        }

        public void k(@n0 View view, int i10, int i11, @t0 int i12, @t0 int i13) {
        }

        public void l(@n0 View view, float f10, float f11) {
        }

        public abstract boolean m(@n0 View view, int i10);
    }

    private d(@n0 Context context, @n0 ViewGroup viewGroup, @n0 c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f22033v = viewGroup;
        this.f22030s = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f22027p = i10;
        this.f22026o = i10;
        this.f22013b = viewConfiguration.getScaledTouchSlop();
        this.f22024m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f22025n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f22029r = new OverScroller(context, N);
    }

    private int C(int i10, int i11) {
        int i12 = i10 < this.f22033v.getLeft() + this.f22026o ? 1 : 0;
        if (i11 < this.f22033v.getTop() + this.f22026o) {
            i12 |= 4;
        }
        if (i10 > this.f22033v.getRight() - this.f22026o) {
            i12 |= 2;
        }
        return i11 > this.f22033v.getBottom() - this.f22026o ? i12 | 8 : i12;
    }

    private boolean K(int i10) {
        if (J(i10)) {
            return true;
        }
        Log.e(f22009x, "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void N() {
        this.f22023l.computeCurrentVelocity(1000, this.f22024m);
        r(i(this.f22023l.getXVelocity(this.f22014c), this.f22025n, this.f22024m), i(this.f22023l.getYVelocity(this.f22014c), this.f22025n, this.f22024m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.d$c] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void O(float f10, float f11, int i10) {
        int i11;
        boolean zE = e(f10, f11, i10, 1);
        ?? r10 = zE;
        if (e(f11, f10, i10, 4)) {
            r10 = (zE ? 1 : 0) | 4;
        }
        ?? r11 = r10;
        if (e(f10, f11, i10, 2)) {
            r11 = (r10 == true ? 1 : 0) | 2;
        }
        ?? r12 = r11;
        if (e(f11, f10, i10, 8)) {
            i11 = (r11 == true ? 1 : 0) | 8;
        }
        if (r12 == 0) {
            r12 = i11;
            return;
        }
        r12 = i11;
        int[] iArr = this.f22020i;
        iArr[i10] = (iArr[i10] | r12) == true ? 1 : 0;
        this.f22030s.f(r12, i10);
    }

    private void P(float f10, float f11, int i10) {
        u(i10);
        float[] fArr = this.f22015d;
        this.f22017f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f22016e;
        this.f22018g[i10] = f11;
        fArr2[i10] = f11;
        this.f22019h[i10] = C((int) f10, (int) f11);
        this.f22022k |= 1 << i10;
    }

    private void Q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (K(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f22017f[pointerId] = x10;
                this.f22018g[pointerId] = y10;
            }
        }
    }

    private boolean e(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f22019h[i10] & i11) != i11 || (this.f22028q & i11) == 0 || (this.f22021j[i10] & i11) == i11 || (this.f22020i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f22013b;
        if (fAbs <= i12 && fAbs2 <= i12) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f22030s.g(i11)) {
            return (this.f22020i[i10] & i11) == 0 && fAbs > ((float) this.f22013b);
        }
        int[] iArr = this.f22021j;
        iArr[i10] = iArr[i10] | i11;
        return false;
    }

    private boolean h(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f22030s.d(view) > 0;
        boolean z11 = this.f22030s.e(view) > 0;
        if (z10 && z11) {
            float f12 = (f10 * f10) + (f11 * f11);
            int i10 = this.f22013b;
            return f12 > ((float) (i10 * i10));
        }
        if (z10) {
            return Math.abs(f10) > ((float) this.f22013b);
        }
        return z11 && Math.abs(f11) > ((float) this.f22013b);
    }

    private float i(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return 0.0f;
        }
        if (fAbs > f12) {
            return f10 > 0.0f ? f12 : -f12;
        }
        return f10;
    }

    private int j(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        if (iAbs > i12) {
            return i10 > 0 ? i12 : -i12;
        }
        return i10;
    }

    private void k() {
        float[] fArr = this.f22015d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f22016e, 0.0f);
        Arrays.fill(this.f22017f, 0.0f);
        Arrays.fill(this.f22018g, 0.0f);
        Arrays.fill(this.f22019h, 0);
        Arrays.fill(this.f22020i, 0);
        Arrays.fill(this.f22021j, 0);
        this.f22022k = 0;
    }

    private void l(int i10) {
        if (this.f22015d == null || !J(i10)) {
            return;
        }
        this.f22015d[i10] = 0.0f;
        this.f22016e[i10] = 0.0f;
        this.f22017f[i10] = 0.0f;
        this.f22018g[i10] = 0.0f;
        this.f22019h[i10] = 0;
        this.f22020i[i10] = 0;
        this.f22021j[i10] = 0;
        this.f22022k = (~(1 << i10)) & this.f22022k;
    }

    private int m(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f22033v.getWidth();
        float f10 = width / 2;
        float fS = f10 + (s(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fS / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    private int n(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int iJ = j(i12, (int) this.f22025n, (int) this.f22024m);
        int iJ2 = j(i13, (int) this.f22025n, (int) this.f22024m);
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        int iAbs3 = Math.abs(iJ);
        int iAbs4 = Math.abs(iJ2);
        int i14 = iAbs3 + iAbs4;
        int i15 = iAbs + iAbs2;
        if (iJ != 0) {
            f10 = iAbs3;
            f11 = i14;
        } else {
            f10 = iAbs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (iJ2 != 0) {
            f12 = iAbs4;
            f13 = i14;
        } else {
            f12 = iAbs2;
            f13 = i15;
        }
        return (int) ((m(i10, iJ, this.f22030s.d(view)) * f14) + (m(i11, iJ2, this.f22030s.e(view)) * (f12 / f13)));
    }

    public static d p(@n0 ViewGroup viewGroup, float f10, @n0 c cVar) {
        d dVarQ = q(viewGroup, cVar);
        dVarQ.f22013b = (int) (dVarQ.f22013b * (1.0f / f10));
        return dVarQ;
    }

    public static d q(@n0 ViewGroup viewGroup, @n0 c cVar) {
        return new d(viewGroup.getContext(), viewGroup, cVar);
    }

    private void r(float f10, float f11) {
        this.f22032u = true;
        this.f22030s.l(this.f22031t, f10, f11);
        this.f22032u = false;
        if (this.f22012a == 1) {
            R(0);
        }
    }

    private float s(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void t(int i10, int i11, int i12, int i13) {
        int left = this.f22031t.getLeft();
        int top = this.f22031t.getTop();
        if (i12 != 0) {
            i10 = this.f22030s.a(this.f22031t, i10, i12);
            j1.e1(this.f22031t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f22030s.b(this.f22031t, i11, i13);
            j1.f1(this.f22031t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f22030s.k(this.f22031t, i14, i15, i14 - left, i15 - top);
    }

    private void u(int i10) {
        float[] fArr = this.f22015d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f22016e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f22017f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f22018g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f22019h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f22020i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f22021j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f22015d = fArr2;
            this.f22016e = fArr3;
            this.f22017f = fArr4;
            this.f22018g = fArr5;
            this.f22019h = iArr;
            this.f22020i = iArr2;
            this.f22021j = iArr3;
        }
    }

    private boolean x(int i10, int i11, int i12, int i13) {
        int left = this.f22031t.getLeft();
        int top = this.f22031t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f22029r.abortAnimation();
            R(0);
            return false;
        }
        this.f22029r.startScroll(left, top, i14, i15, n(this.f22031t, i14, i15, i12, i13));
        R(2);
        return true;
    }

    @t0
    public int A() {
        return this.f22027p;
    }

    @t0
    public int B() {
        return this.f22026o;
    }

    public float D() {
        return this.f22025n;
    }

    @t0
    public int E() {
        return this.f22013b;
    }

    public int F() {
        return this.f22012a;
    }

    public boolean G(int i10, int i11) {
        return L(this.f22031t, i10, i11);
    }

    public boolean H(int i10) {
        int length = this.f22019h.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (I(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean I(int i10, int i11) {
        return J(i11) && (i10 & this.f22019h[i11]) != 0;
    }

    public boolean J(int i10) {
        return ((1 << i10) & this.f22022k) != 0;
    }

    public boolean L(@p0 View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void M(@n0 MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
        }
        if (this.f22023l == null) {
            this.f22023l = VelocityTracker.obtain();
        }
        this.f22023l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewV = v((int) x10, (int) y10);
            P(x10, y10, pointerId);
            Y(viewV, pointerId);
            int i12 = this.f22019h[pointerId];
            int i13 = this.f22028q;
            if ((i12 & i13) != 0) {
                this.f22030s.h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f22012a == 1) {
                N();
            }
            c();
            return;
        }
        if (actionMasked == 2) {
            if (this.f22012a == 1) {
                if (K(this.f22014c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f22014c);
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f22017f;
                    int i14 = this.f22014c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.f22018g[i14]);
                    t(this.f22031t.getLeft() + i15, this.f22031t.getTop() + i16, i15, i16);
                    Q(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (K(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f22015d[pointerId2];
                    float f11 = y12 - this.f22016e[pointerId2];
                    O(f10, f11, pointerId2);
                    if (this.f22012a != 1) {
                        View viewV2 = v((int) x12, (int) y12);
                        if (h(viewV2, f10, f11) && Y(viewV2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            Q(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f22012a == 1) {
                r(0.0f, 0.0f);
            }
            c();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            P(x13, y13, pointerId3);
            if (this.f22012a != 0) {
                if (G((int) x13, (int) y13)) {
                    Y(this.f22031t, pointerId3);
                    return;
                }
                return;
            } else {
                Y(v((int) x13, (int) y13), pointerId3);
                int i17 = this.f22019h[pointerId3];
                int i18 = this.f22028q;
                if ((i17 & i18) != 0) {
                    this.f22030s.h(i17 & i18, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f22012a == 1 && pointerId4 == this.f22014c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f22014c) {
                    View viewV3 = v((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f22031t;
                    if (viewV3 == view && Y(view, pointerId5)) {
                        i10 = this.f22014c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                N();
            }
        }
        l(pointerId4);
    }

    void R(int i10) {
        this.f22033v.removeCallbacks(this.f22034w);
        if (this.f22012a != i10) {
            this.f22012a = i10;
            this.f22030s.j(i10);
            if (this.f22012a == 0) {
                this.f22031t = null;
            }
        }
    }

    public void S(@f0(from = 0) @t0 int i10) {
        this.f22026o = i10;
    }

    public void T(int i10) {
        this.f22028q = i10;
    }

    public void U(float f10) {
        this.f22025n = f10;
    }

    public boolean V(int i10, int i11) {
        if (this.f22032u) {
            return x(i10, i11, (int) this.f22023l.getXVelocity(this.f22014c), (int) this.f22023l.getYVelocity(this.f22014c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ff  */
    public boolean W(@n0 MotionEvent motionEvent) {
        boolean z10;
        View viewV;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
        }
        if (this.f22023l == null) {
            this.f22023l = VelocityTracker.obtain();
        }
        this.f22023l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                c();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    c();
                } else if (actionMasked == 5) {
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    float x10 = motionEvent.getX(actionIndex);
                    float y10 = motionEvent.getY(actionIndex);
                    P(x10, y10, pointerId);
                    int i10 = this.f22012a;
                    if (i10 == 0) {
                        int i11 = this.f22019h[pointerId];
                        int i12 = this.f22028q;
                        if ((i11 & i12) != 0) {
                            this.f22030s.h(i11 & i12, pointerId);
                        }
                    } else if (i10 == 2 && (viewV = v((int) x10, (int) y10)) == this.f22031t) {
                        Y(viewV, pointerId);
                    }
                } else if (actionMasked == 6) {
                    l(motionEvent.getPointerId(actionIndex));
                }
            } else if (this.f22015d != null && this.f22016e != null) {
                int pointerCount = motionEvent.getPointerCount();
                for (int i13 = 0; i13 < pointerCount; i13++) {
                    int pointerId2 = motionEvent.getPointerId(i13);
                    if (K(pointerId2)) {
                        float x11 = motionEvent.getX(i13);
                        float y11 = motionEvent.getY(i13);
                        float f10 = x11 - this.f22015d[pointerId2];
                        float f11 = y11 - this.f22016e[pointerId2];
                        View viewV2 = v((int) x11, (int) y11);
                        boolean z11 = viewV2 != null && h(viewV2, f10, f11);
                        if (!z11) {
                            O(f10, f11, pointerId2);
                            if (this.f22012a != 1) {
                                break;
                            }
                        } else {
                            int left = viewV2.getLeft();
                            int i14 = (int) f10;
                            int iA = this.f22030s.a(viewV2, left + i14, i14);
                            int top = viewV2.getTop();
                            int i15 = (int) f11;
                            int iB = this.f22030s.b(viewV2, top + i15, i15);
                            int iD = this.f22030s.d(viewV2);
                            int iE = this.f22030s.e(viewV2);
                            if ((iD == 0 || (iD > 0 && iA == left)) && (iE == 0 || (iE > 0 && iB == top))) {
                                break;
                            }
                            O(f10, f11, pointerId2);
                            if (this.f22012a != 1 || (z11 && Y(viewV2, pointerId2))) {
                                break;
                            }
                        }
                    }
                }
                Q(motionEvent);
            }
            z10 = false;
        } else {
            float x12 = motionEvent.getX();
            float y12 = motionEvent.getY();
            z10 = false;
            int pointerId3 = motionEvent.getPointerId(0);
            P(x12, y12, pointerId3);
            View viewV3 = v((int) x12, (int) y12);
            if (viewV3 == this.f22031t && this.f22012a == 2) {
                Y(viewV3, pointerId3);
            }
            int i16 = this.f22019h[pointerId3];
            int i17 = this.f22028q;
            if ((i16 & i17) != 0) {
                this.f22030s.h(i16 & i17, pointerId3);
            }
        }
        if (this.f22012a == 1) {
            return true;
        }
        return z10;
    }

    public boolean X(@n0 View view, int i10, int i11) {
        this.f22031t = view;
        this.f22014c = -1;
        boolean zX = x(i10, i11, 0, 0);
        if (!zX && this.f22012a == 0 && this.f22031t != null) {
            this.f22031t = null;
        }
        return zX;
    }

    boolean Y(View view, int i10) {
        if (view == this.f22031t && this.f22014c == i10) {
            return true;
        }
        if (view == null || !this.f22030s.m(view, i10)) {
            return false;
        }
        this.f22014c = i10;
        d(view, i10);
        return true;
    }

    public void a() {
        c();
        if (this.f22012a == 2) {
            int currX = this.f22029r.getCurrX();
            int currY = this.f22029r.getCurrY();
            this.f22029r.abortAnimation();
            int currX2 = this.f22029r.getCurrX();
            int currY2 = this.f22029r.getCurrY();
            this.f22030s.k(this.f22031t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        R(0);
    }

    protected boolean b(@n0 View view, boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i15 = i12 + scrollX;
                if (i15 >= childAt.getLeft() && i15 < childAt.getRight() && (i14 = i13 + scrollY) >= childAt.getTop() && i14 < childAt.getBottom() && b(childAt, true, i10, i11, i15 - childAt.getLeft(), i14 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && (view.canScrollHorizontally(-i10) || view.canScrollVertically(-i11));
    }

    public void c() {
        this.f22014c = -1;
        k();
        VelocityTracker velocityTracker = this.f22023l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f22023l = null;
        }
    }

    public void d(@n0 View view, int i10) {
        if (view.getParent() == this.f22033v) {
            this.f22031t = view;
            this.f22014c = i10;
            this.f22030s.i(view, i10);
            R(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f22033v + ")");
    }

    public boolean f(int i10) {
        int length = this.f22015d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (g(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int i10, int i11) {
        if (!J(i11)) {
            return false;
        }
        boolean z10 = (i10 & 1) == 1;
        boolean z11 = (i10 & 2) == 2;
        float f10 = this.f22017f[i11] - this.f22015d[i11];
        float f11 = this.f22018g[i11] - this.f22016e[i11];
        if (z10 && z11) {
            float f12 = (f10 * f10) + (f11 * f11);
            int i12 = this.f22013b;
            return f12 > ((float) (i12 * i12));
        }
        if (z10) {
            return Math.abs(f10) > ((float) this.f22013b);
        }
        return z11 && Math.abs(f11) > ((float) this.f22013b);
    }

    public boolean o(boolean z10) {
        if (this.f22012a == 2) {
            boolean zComputeScrollOffset = this.f22029r.computeScrollOffset();
            int currX = this.f22029r.getCurrX();
            int currY = this.f22029r.getCurrY();
            int left = currX - this.f22031t.getLeft();
            int top = currY - this.f22031t.getTop();
            if (left != 0) {
                j1.e1(this.f22031t, left);
            }
            if (top != 0) {
                j1.f1(this.f22031t, top);
            }
            if (left != 0 || top != 0) {
                this.f22030s.k(this.f22031t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f22029r.getFinalX() && currY == this.f22029r.getFinalY()) {
                this.f22029r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z10) {
                    this.f22033v.post(this.f22034w);
                } else {
                    R(0);
                }
            }
        }
        return this.f22012a == 2;
    }

    @p0
    public View v(int i10, int i11) {
        for (int childCount = this.f22033v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f22033v.getChildAt(this.f22030s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void w(int i10, int i11, int i12, int i13) {
        if (!this.f22032u) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.f22029r.fling(this.f22031t.getLeft(), this.f22031t.getTop(), (int) this.f22023l.getXVelocity(this.f22014c), (int) this.f22023l.getYVelocity(this.f22014c), i10, i12, i11, i13);
        R(2);
    }

    public int y() {
        return this.f22014c;
    }

    @p0
    public View z() {
        return this.f22031t;
    }
}
