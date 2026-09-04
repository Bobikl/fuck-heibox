package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.collection.l2;
import androidx.core.view.accessibility.a0;
import androidx.core.view.accessibility.c0;
import androidx.core.view.accessibility.d0;
import androidx.core.view.j1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ExploreByTouchHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends androidx.core.view.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f21988k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f21989l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f21990m = "android.view.View";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Rect f21991n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final androidx.customview.widget.b.a<a0> f21992o = new C0154a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final androidx.customview.widget.b.InterfaceC0155b<l2<a0>, a0> f21993p = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AccessibilityManager f21998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f21999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f22000g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f21994a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f21995b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f21996c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f21997d = new int[2];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f22001h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f22002i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22003j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: androidx.customview.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ExploreByTouchHelper.java */
    public class C0154a implements androidx.customview.widget.b.a<a0> {
        C0154a() {
        }

        @Override // androidx.customview.widget.b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(a0 a0Var, Rect rect) {
            a0Var.s(rect);
        }
    }

    /* JADX INFO: compiled from: ExploreByTouchHelper.java */
    public class b implements androidx.customview.widget.b.InterfaceC0155b<l2<a0>, a0> {
        b() {
        }

        @Override // androidx.customview.widget.b.InterfaceC0155b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a0 a(l2<a0> l2Var, int i10) {
            return l2Var.y(i10);
        }

        @Override // androidx.customview.widget.b.InterfaceC0155b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(l2<a0> l2Var) {
            return l2Var.x();
        }
    }

    /* JADX INFO: compiled from: ExploreByTouchHelper.java */
    public class c extends c0 {
        c() {
        }

        @Override // androidx.core.view.accessibility.c0
        public a0 b(int i10) {
            return a0.K0(a.this.y(i10));
        }

        @Override // androidx.core.view.accessibility.c0
        public a0 d(int i10) {
            int i11 = i10 == 2 ? a.this.f22001h : a.this.f22002i;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // androidx.core.view.accessibility.c0
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.G(i10, i11, bundle);
        }
    }

    public a(@n0 View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f21999f = view;
        this.f21998e = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (j1.V(view) == 0) {
            j1.R1(view, 1);
        }
    }

    private boolean H(int i10, int i11, Bundle bundle) {
        if (i11 == 1) {
            return K(i10);
        }
        if (i11 == 2) {
            return b(i10);
        }
        if (i11 != 64) {
            return i11 != 128 ? A(i10, i11, bundle) : a(i10);
        }
        return J(i10);
    }

    private boolean I(int i10, Bundle bundle) {
        return j1.l1(this.f21999f, i10, bundle);
    }

    private boolean J(int i10) {
        int i11;
        if (!this.f21998e.isEnabled() || !this.f21998e.isTouchExplorationEnabled() || (i11 = this.f22001h) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            a(i11);
        }
        this.f22001h = i10;
        this.f21999f.invalidate();
        L(i10, 32768);
        return true;
    }

    private void M(int i10) {
        int i11 = this.f22003j;
        if (i11 == i10) {
            return;
        }
        this.f22003j = i10;
        L(i10, 128);
        L(i11, 256);
    }

    private boolean a(int i10) {
        if (this.f22001h != i10) {
            return false;
        }
        this.f22001h = Integer.MIN_VALUE;
        this.f21999f.invalidate();
        L(i10, 65536);
        return true;
    }

    private boolean c() {
        int i10 = this.f22002i;
        return i10 != Integer.MIN_VALUE && A(i10, 16, null);
    }

    private AccessibilityEvent d(int i10, int i11) {
        return i10 != -1 ? e(i10, i11) : f(i11);
    }

    private AccessibilityEvent e(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        a0 a0VarY = y(i10);
        accessibilityEventObtain.getText().add(a0VarY.W());
        accessibilityEventObtain.setContentDescription(a0VarY.A());
        accessibilityEventObtain.setScrollable(a0VarY.B0());
        accessibilityEventObtain.setPassword(a0VarY.z0());
        accessibilityEventObtain.setEnabled(a0VarY.s0());
        accessibilityEventObtain.setChecked(a0VarY.m0());
        C(i10, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(a0VarY.w());
        d0.Y(accessibilityEventObtain, this.f21999f, i10);
        accessibilityEventObtain.setPackageName(this.f21999f.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent f(int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        this.f21999f.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    @n0
    private a0 g(int i10) {
        a0 a0VarH0 = a0.H0();
        a0VarH0.l1(true);
        a0VarH0.n1(true);
        a0VarH0.b1("android.view.View");
        Rect rect = f21991n;
        a0VarH0.W0(rect);
        a0VarH0.X0(rect);
        a0VarH0.F1(this.f21999f);
        E(i10, a0VarH0);
        if (a0VarH0.W() == null && a0VarH0.A() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        a0VarH0.s(this.f21995b);
        if (this.f21995b.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iP = a0VarH0.p();
        if ((iP & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iP & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        a0VarH0.D1(this.f21999f.getContext().getPackageName());
        a0VarH0.Q1(this.f21999f, i10);
        if (this.f22001h == i10) {
            a0VarH0.T0(true);
            a0VarH0.a(128);
        } else {
            a0VarH0.T0(false);
            a0VarH0.a(64);
        }
        boolean z10 = this.f22002i == i10;
        if (z10) {
            a0VarH0.a(2);
        } else if (a0VarH0.t0()) {
            a0VarH0.a(1);
        }
        a0VarH0.o1(z10);
        this.f21999f.getLocationOnScreen(this.f21997d);
        a0VarH0.t(this.f21994a);
        if (this.f21994a.equals(rect)) {
            a0VarH0.s(this.f21994a);
            if (a0VarH0.f21373b != -1) {
                a0 a0VarH1 = a0.H0();
                for (int i11 = a0VarH0.f21373b; i11 != -1; i11 = a0VarH1.f21373b) {
                    a0VarH1.G1(this.f21999f, -1);
                    a0VarH1.W0(f21991n);
                    E(i11, a0VarH1);
                    a0VarH1.s(this.f21995b);
                    Rect rect2 = this.f21994a;
                    Rect rect3 = this.f21995b;
                    rect2.offset(rect3.left, rect3.top);
                }
                a0VarH1.N0();
            }
            this.f21994a.offset(this.f21997d[0] - this.f21999f.getScrollX(), this.f21997d[1] - this.f21999f.getScrollY());
        }
        if (this.f21999f.getLocalVisibleRect(this.f21996c)) {
            this.f21996c.offset(this.f21997d[0] - this.f21999f.getScrollX(), this.f21997d[1] - this.f21999f.getScrollY());
            if (this.f21994a.intersect(this.f21996c)) {
                a0VarH0.X0(this.f21994a);
                if (v(this.f21994a)) {
                    a0VarH0.e2(true);
                }
            }
        }
        return a0VarH0;
    }

    @n0
    private a0 h() {
        a0 a0VarI0 = a0.I0(this.f21999f);
        j1.i1(this.f21999f, a0VarI0);
        ArrayList arrayList = new ArrayList();
        q(arrayList);
        if (a0VarI0.v() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a0VarI0.d(this.f21999f, ((Integer) arrayList.get(i10)).intValue());
        }
        return a0VarI0;
    }

    private l2<a0> l() {
        ArrayList arrayList = new ArrayList();
        q(arrayList);
        l2<a0> l2Var = new l2<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            l2Var.n(arrayList.get(i10).intValue(), g(arrayList.get(i10).intValue()));
        }
        return l2Var;
    }

    private void m(int i10, Rect rect) {
        y(i10).s(rect);
    }

    private static Rect r(@n0 View view, int i10, @n0 Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
        } else if (i10 == 33) {
            rect.set(0, height, width, height);
        } else if (i10 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean v(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f21999f.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f21999f.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int w(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean x(int i10, @p0 Rect rect) {
        a0 a0Var;
        l2<a0> l2VarL = l();
        int i11 = this.f22002i;
        a0 a0VarG = i11 == Integer.MIN_VALUE ? null : l2VarL.g(i11);
        if (i10 == 1 || i10 == 2) {
            a0Var = (a0) androidx.customview.widget.b.d(l2VarL, f21993p, f21992o, a0VarG, i10, j1.Z(this.f21999f) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i12 = this.f22002i;
            if (i12 != Integer.MIN_VALUE) {
                m(i12, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                r(this.f21999f, i10, rect2);
            }
            a0Var = (a0) androidx.customview.widget.b.c(l2VarL, f21993p, f21992o, a0VarG, rect2, i10);
        }
        return K(a0Var != null ? l2VarL.m(l2VarL.k(a0Var)) : Integer.MIN_VALUE);
    }

    protected abstract boolean A(int i10, int i11, @p0 Bundle bundle);

    protected void B(@n0 AccessibilityEvent accessibilityEvent) {
    }

    protected void C(int i10, @n0 AccessibilityEvent accessibilityEvent) {
    }

    protected void D(@n0 a0 a0Var) {
    }

    protected abstract void E(int i10, @n0 a0 a0Var);

    protected void F(int i10, boolean z10) {
    }

    boolean G(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? H(i10, i11, bundle) : I(i11, bundle);
    }

    public final boolean K(int i10) {
        int i11;
        if ((!this.f21999f.isFocused() && !this.f21999f.requestFocus()) || (i11 = this.f22002i) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            b(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f22002i = i10;
        F(i10, true);
        L(i10, 8);
        return true;
    }

    public final boolean L(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f21998e.isEnabled() || (parent = this.f21999f.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f21999f, d(i10, i11));
    }

    public final boolean b(int i10) {
        if (this.f22002i != i10) {
            return false;
        }
        this.f22002i = Integer.MIN_VALUE;
        F(i10, false);
        L(i10, 8);
        return true;
    }

    @Override // androidx.core.view.a
    public c0 getAccessibilityNodeProvider(View view) {
        if (this.f22000g == null) {
            this.f22000g = new c();
        }
        return this.f22000g;
    }

    public final boolean i(@n0 MotionEvent motionEvent) {
        if (!this.f21998e.isEnabled() || !this.f21998e.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iP = p(motionEvent.getX(), motionEvent.getY());
            M(iP);
            return iP != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f22003j == Integer.MIN_VALUE) {
            return false;
        }
        M(Integer.MIN_VALUE);
        return true;
    }

    public final boolean j(@n0 KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return x(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return x(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iW = w(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z10 = false;
                    while (i10 < repeatCount && x(iW, null)) {
                        i10++;
                        z10 = true;
                    }
                    return z10;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        c();
        return true;
    }

    public final int k() {
        return this.f22001h;
    }

    @Deprecated
    public int n() {
        return k();
    }

    public final int o() {
        return this.f22002i;
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        B(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view, a0 a0Var) {
        super.onInitializeAccessibilityNodeInfo(view, a0Var);
        D(a0Var);
    }

    protected abstract int p(float f10, float f11);

    protected abstract void q(List<Integer> list);

    public final void s() {
        u(-1, 1);
    }

    public final void t(int i10) {
        u(i10, 0);
    }

    public final void u(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f21998e.isEnabled() || (parent = this.f21999f.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventD = d(i10, 2048);
        androidx.core.view.accessibility.b.i(accessibilityEventD, i11);
        parent.requestSendAccessibilityEvent(this.f21999f, accessibilityEventD);
    }

    @n0
    a0 y(int i10) {
        return i10 == -1 ? h() : g(i10);
    }

    public final void z(boolean z10, int i10, @p0 Rect rect) {
        int i11 = this.f22002i;
        if (i11 != Integer.MIN_VALUE) {
            b(i11);
        }
        if (z10) {
            x(i10, rect);
        }
    }
}
