package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RestrictTo;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.core.graphics.h0;
import androidx.core.view.accessibility.a0;
import androidx.core.view.accessibility.e0;
import androidx.core.view.j1;
import androidx.core.view.n;
import androidx.core.view.n3;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DrawerLayout extends ViewGroup implements androidx.customview.widget.c {
    private static boolean G2 = false;
    private static final String M = "DrawerLayout";
    public static final int O = 0;
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 0;
    public static final int S = 1;
    public static final int T = 2;
    public static final int U = 3;
    private static final int V = 64;
    private static final int W = -1728053248;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f22794a0 = 160;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f22795b0 = 400;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final boolean f22796c0 = false;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final boolean f22797p1 = true;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    static final boolean f22798p2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final float f22799x1 = 1.0f;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final boolean f22800x2;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final String f22802y2 = "androidx.drawerlayout.widget.DrawerLayout";
    private CharSequence A;
    private CharSequence B;
    private Object C;
    private boolean D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private Drawable H;
    private final ArrayList<View> I;
    private Rect J;
    private Matrix K;
    private final e0 L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f22803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f22804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f22807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f22808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.customview.widget.d f22809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.customview.widget.d f22810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f22811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g f22812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f22813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f22814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f22815n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f22816o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f22817p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f22818q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f22819r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f22820s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @p0
    private e f22821t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List<e> f22822u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f22823v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f22824w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Drawable f22825x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Drawable f22826y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f22827z;
    private static final int[] N = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    static final int[] f22801y1 = {R.attr.layout_gravity};

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f22828e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f22829f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f22830g = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f22832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f22833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f22834d;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f22831a = 0;
        }

        public LayoutParams(int i10, int i11, int i12) {
            this(i10, i11);
            this.f22831a = i12;
        }

        public LayoutParams(@n0 Context context, @p0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f22831a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f22801y1);
            this.f22831a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(@n0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f22831a = 0;
        }

        public LayoutParams(@n0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f22831a = 0;
        }

        public LayoutParams(@n0 LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f22831a = 0;
            this.f22831a = layoutParams.f22831a;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f22835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f22836c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f22837d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22838e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f22839f;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@n0 Parcel parcel, @p0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f22835b = 0;
            this.f22835b = parcel.readInt();
            this.f22836c = parcel.readInt();
            this.f22837d = parcel.readInt();
            this.f22838e = parcel.readInt();
            this.f22839f = parcel.readInt();
        }

        public SavedState(@n0 Parcelable parcelable) {
            super(parcelable);
            this.f22835b = 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f22835b);
            parcel.writeInt(this.f22836c);
            parcel.writeInt(this.f22837d);
            parcel.writeInt(this.f22838e);
            parcel.writeInt(this.f22839f);
        }
    }

    public class a implements e0 {
        a() {
        }

        @Override // androidx.core.view.accessibility.e0
        public boolean perform(@n0 View view, @p0 e0.a aVar) {
            if (!DrawerLayout.this.D(view) || DrawerLayout.this.r(view) == 2) {
                return false;
            }
            DrawerLayout.this.f(view);
            return true;
        }
    }

    public class b implements View.OnApplyWindowInsetsListener {
        b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class c extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f22842a = new Rect();

        c() {
        }

        private void a(a0 a0Var, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (DrawerLayout.A(childAt)) {
                    a0Var.c(childAt);
                }
            }
        }

        private void b(a0 a0Var, a0 a0Var2) {
            Rect rect = this.f22842a;
            a0Var2.t(rect);
            a0Var.X0(rect);
            a0Var.e2(a0Var2.G0());
            a0Var.D1(a0Var2.P());
            a0Var.b1(a0Var2.w());
            a0Var.f1(a0Var2.A());
            a0Var.l1(a0Var2.s0());
            a0Var.o1(a0Var2.u0());
            a0Var.T0(a0Var2.k0());
            a0Var.N1(a0Var2.C0());
            a0Var.a(a0Var2.p());
        }

        @Override // androidx.core.view.a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewP = DrawerLayout.this.p();
            if (viewP == null) {
                return true;
            }
            CharSequence charSequenceS = DrawerLayout.this.s(DrawerLayout.this.t(viewP));
            if (charSequenceS == null) {
                return true;
            }
            text.add(charSequenceS);
            return true;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.f22802y2);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, a0 a0Var) {
            if (DrawerLayout.f22798p2) {
                super.onInitializeAccessibilityNodeInfo(view, a0Var);
            } else {
                a0 a0VarK0 = a0.K0(a0Var);
                super.onInitializeAccessibilityNodeInfo(view, a0VarK0);
                a0Var.P1(view);
                Object objL0 = j1.l0(view);
                if (objL0 instanceof View) {
                    a0Var.F1((View) objL0);
                }
                b(a0Var, a0VarK0);
                a0VarK0.N0();
                a(a0Var, (ViewGroup) view);
            }
            a0Var.b1(DrawerLayout.f22802y2);
            a0Var.n1(false);
            a0Var.o1(false);
            a0Var.P0(a0.a.f21376f);
            a0Var.P0(a0.a.f21377g);
        }

        @Override // androidx.core.view.a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f22798p2 || DrawerLayout.A(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public static final class d extends androidx.core.view.a {
        d() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            if (DrawerLayout.A(view)) {
                return;
            }
            a0Var.F1(null);
        }
    }

    public interface e {
        void a(@n0 View view);

        void b(@n0 View view);

        void c(int i10);

        void d(@n0 View view, float f10);
    }

    public static abstract class f implements e {
        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void a(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void b(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void c(int i10) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void d(View view, float f10) {
        }
    }

    public class g extends androidx.customview.widget.d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f22844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.customview.widget.d f22845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f22846c = new a();

        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.o();
            }
        }

        g(int i10) {
            this.f22844a = i10;
        }

        private void n() {
            View viewN = DrawerLayout.this.n(this.f22844a == 3 ? 5 : 3);
            if (viewN != null) {
                DrawerLayout.this.f(viewN);
            }
        }

        @Override // androidx.customview.widget.d.c
        public int a(View view, int i10, int i11) {
            if (DrawerLayout.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        @Override // androidx.customview.widget.d.c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public int d(View view) {
            if (DrawerLayout.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.d.c
        public void f(int i10, int i11) {
            View viewN = (i10 & 1) == 1 ? DrawerLayout.this.n(3) : DrawerLayout.this.n(5);
            if (viewN == null || DrawerLayout.this.r(viewN) != 0) {
                return;
            }
            this.f22845b.d(viewN, i11);
        }

        @Override // androidx.customview.widget.d.c
        public boolean g(int i10) {
            return false;
        }

        @Override // androidx.customview.widget.d.c
        public void h(int i10, int i11) {
            DrawerLayout.this.postDelayed(this.f22846c, 160L);
        }

        @Override // androidx.customview.widget.d.c
        public void i(View view, int i10) {
            ((LayoutParams) view.getLayoutParams()).f22833c = false;
            n();
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i10) {
            DrawerLayout.this.V(i10, this.f22845b.z());
        }

        @Override // androidx.customview.widget.d.c
        public void k(View view, int i10, int i11, int i12, int i13) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.c(view, 3) ? i10 + width : DrawerLayout.this.getWidth() - i10) / width;
            DrawerLayout.this.S(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public void l(View view, float f10, float f11) {
            int i10;
            float fU = DrawerLayout.this.u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                i10 = (f10 > 0.0f || (f10 == 0.0f && fU > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && fU > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f22845b.V(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(View view, int i10) {
            return DrawerLayout.this.E(view) && DrawerLayout.this.c(view, this.f22844a) && DrawerLayout.this.r(view) == 0;
        }

        void o() {
            View viewN;
            int width;
            int iB = this.f22845b.B();
            boolean z10 = this.f22844a == 3;
            if (z10) {
                viewN = DrawerLayout.this.n(3);
                width = (viewN != null ? -viewN.getWidth() : 0) + iB;
            } else {
                viewN = DrawerLayout.this.n(5);
                width = DrawerLayout.this.getWidth() - iB;
            }
            if (viewN != null) {
                if (((!z10 || viewN.getLeft() >= width) && (z10 || viewN.getLeft() <= width)) || DrawerLayout.this.r(viewN) != 0) {
                    return;
                }
                LayoutParams layoutParams = (LayoutParams) viewN.getLayoutParams();
                this.f22845b.X(viewN, width, viewN.getTop());
                layoutParams.f22833c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f22846c);
        }

        public void q(androidx.customview.widget.d dVar) {
            this.f22845b = dVar;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f22798p2 = true;
        f22800x2 = true;
        G2 = i10 >= 29;
    }

    public DrawerLayout(@n0 Context context) {
        this(context, null);
    }

    public DrawerLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, androidx.drawerlayout.R.attr.drawerLayoutStyle);
    }

    public DrawerLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22803b = new d();
        this.f22806e = W;
        this.f22808g = new Paint();
        this.f22815n = true;
        this.f22816o = 3;
        this.f22817p = 3;
        this.f22818q = 3;
        this.f22819r = 3;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.L = new a();
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f22805d = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        g gVar = new g(3);
        this.f22811j = gVar;
        g gVar2 = new g(5);
        this.f22812k = gVar2;
        androidx.customview.widget.d dVarP = androidx.customview.widget.d.p(this, 1.0f, gVar);
        this.f22809h = dVarP;
        dVarP.T(1);
        dVarP.U(f11);
        gVar.q(dVarP);
        androidx.customview.widget.d dVarP2 = androidx.customview.widget.d.p(this, 1.0f, gVar2);
        this.f22810i = dVarP2;
        dVarP2.T(2);
        dVarP2.U(f11);
        gVar2.q(dVarP2);
        setFocusableInTouchMode(true);
        j1.R1(this, 1);
        j1.B1(this, new c());
        setMotionEventSplittingEnabled(false);
        if (j1.U(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(N);
            try {
                this.f22825x = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, androidx.drawerlayout.R.styleable.f22789b, i10, 0);
        try {
            int i11 = androidx.drawerlayout.R.styleable.DrawerLayout_elevation;
            if (typedArrayObtainStyledAttributes2.hasValue(i11)) {
                this.f22804c = typedArrayObtainStyledAttributes2.getDimension(i11, 0.0f);
            } else {
                this.f22804c = getResources().getDimension(androidx.drawerlayout.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.I = new ArrayList<>();
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th3;
        }
    }

    static boolean A(View view) {
        return (j1.V(view) == 4 || j1.V(view) == 2) ? false : true;
    }

    private boolean H(float f10, float f11, View view) {
        if (this.J == null) {
            this.J = new Rect();
        }
        view.getHitRect(this.J);
        return this.J.contains((int) f10, (int) f11);
    }

    private void I(Drawable drawable, int i10) {
        if (drawable == null || !androidx.core.graphics.drawable.d.h(drawable)) {
            return;
        }
        androidx.core.graphics.drawable.d.m(drawable, i10);
    }

    private Drawable P() {
        int iZ = j1.Z(this);
        if (iZ == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                I(drawable, iZ);
                return this.E;
            }
        } else {
            Drawable drawable2 = this.F;
            if (drawable2 != null) {
                I(drawable2, iZ);
                return this.F;
            }
        }
        return this.G;
    }

    private Drawable Q() {
        int iZ = j1.Z(this);
        if (iZ == 0) {
            Drawable drawable = this.F;
            if (drawable != null) {
                I(drawable, iZ);
                return this.F;
            }
        } else {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                I(drawable2, iZ);
                return this.E;
            }
        }
        return this.H;
    }

    private void R() {
        if (f22800x2) {
            return;
        }
        this.f22826y = P();
        this.f22827z = Q();
    }

    private void T(View view) {
        a0.a aVar = a0.a.f21396z;
        j1.r1(view, aVar.b());
        if (!D(view) || r(view) == 2) {
            return;
        }
        j1.u1(view, aVar, null, this.L);
    }

    private void U(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || E(childAt)) && !(z10 && childAt == view)) {
                j1.R1(childAt, 4);
            } else {
                j1.R1(childAt, 1);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventV = v(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventV);
            motionEventV.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.K == null) {
                this.K = new Matrix();
            }
            matrix.invert(this.K);
            motionEventObtain.transform(this.K);
        }
        return motionEventObtain;
    }

    static String w(int i10) {
        if ((i10 & 3) == 3) {
            return "LEFT";
        }
        return (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((LayoutParams) getChildAt(i10).getLayoutParams()).f22833c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        return p() != null;
    }

    boolean B(View view) {
        return ((LayoutParams) view.getLayoutParams()).f22831a == 0;
    }

    public boolean C(int i10) {
        View viewN = n(i10);
        if (viewN != null) {
            return D(viewN);
        }
        return false;
    }

    public boolean D(@n0 View view) {
        if (E(view)) {
            return (((LayoutParams) view.getLayoutParams()).f22834d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean E(View view) {
        int iD = n.d(((LayoutParams) view.getLayoutParams()).f22831a, j1.Z(view));
        return ((iD & 3) == 0 && (iD & 5) == 0) ? false : true;
    }

    public boolean F(int i10) {
        View viewN = n(i10);
        if (viewN != null) {
            return G(viewN);
        }
        return false;
    }

    public boolean G(@n0 View view) {
        if (E(view)) {
            return ((LayoutParams) view.getLayoutParams()).f22832b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void J(View view, float f10) {
        float fU = u(view);
        float width = view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (fU * width));
        if (!c(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        S(view, f10);
    }

    public void K(int i10) {
        L(i10, true);
    }

    public void L(int i10, boolean z10) {
        View viewN = n(i10);
        if (viewN != null) {
            N(viewN, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void M(@n0 View view) {
        N(view, true);
    }

    public void N(@n0 View view, boolean z10) {
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f22815n) {
            layoutParams.f22832b = 1.0f;
            layoutParams.f22834d = 1;
            U(view, true);
            T(view);
        } else if (z10) {
            layoutParams.f22834d |= 2;
            if (c(view, 3)) {
                this.f22809h.X(view, 0, view.getTop());
            } else {
                this.f22810i.X(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            J(view, 1.0f);
            V(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void O(@n0 e eVar) {
        List<e> list;
        if (eVar == null || (list = this.f22822u) == null) {
            return;
        }
        list.remove(eVar);
    }

    void S(View view, float f10) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f10 == layoutParams.f22832b) {
            return;
        }
        layoutParams.f22832b = f10;
        l(view, f10);
    }

    void V(int i10, View view) {
        int iF = this.f22809h.F();
        int iF2 = this.f22810i.F();
        int i11 = 2;
        if (iF == 1 || iF2 == 1) {
            i11 = 1;
        } else if (iF != 2 && iF2 != 2) {
            i11 = 0;
        }
        if (view != null && i10 == 0) {
            float f10 = ((LayoutParams) view.getLayoutParams()).f22832b;
            if (f10 == 0.0f) {
                j(view);
            } else if (f10 == 1.0f) {
                k(view);
            }
        }
        if (i11 != this.f22813l) {
            this.f22813l = i11;
            List<e> list = this.f22822u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f22822u.get(size).c(i11);
                }
            }
        }
    }

    public void a(@n0 e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f22822u == null) {
            this.f22822u = new ArrayList();
        }
        this.f22822u.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!E(childAt)) {
                this.I.add(childAt);
            } else if (D(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z10 = true;
            }
        }
        if (!z10) {
            int size = this.I.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = this.I.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        this.I.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (o() != null || E(view)) {
            j1.R1(view, 4);
        } else {
            j1.R1(view, 1);
        }
        if (f22798p2) {
            return;
        }
        j1.B1(view, this.f22803b);
    }

    void b() {
        if (this.f22820s) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f22820s = true;
    }

    boolean c(View view, int i10) {
        return (t(view) & i10) == i10;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.c
    public void close() {
        d(n.f21701b);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i10).getLayoutParams()).f22832b);
        }
        this.f22807f = fMax;
        boolean zO = this.f22809h.o(true);
        boolean zO2 = this.f22810i.o(true);
        if (zO || zO2) {
            j1.n1(this);
        }
    }

    public void d(int i10) {
        e(i10, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f22807f <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (H(x10, y10, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        int height = getHeight();
        boolean zB = B(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i10 = 0;
        if (zB) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(iSave);
        float f10 = this.f22807f;
        if (f10 > 0.0f && zB) {
            int i13 = this.f22806e;
            this.f22808g.setColor((i13 & 16777215) | (((int) ((((-16777216) & i13) >>> 24) * f10)) << 24));
            canvas.drawRect(i10, 0.0f, width, getHeight(), this.f22808g);
        } else if (this.f22826y != null && c(view, 3)) {
            int intrinsicWidth = this.f22826y.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f22809h.B(), 1.0f));
            this.f22826y.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f22826y.setAlpha((int) (fMax * 255.0f));
            this.f22826y.draw(canvas);
        } else if (this.f22827z != null && c(view, 5)) {
            int intrinsicWidth2 = this.f22827z.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f22810i.B(), 1.0f));
            this.f22827z.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f22827z.setAlpha((int) (fMax2 * 255.0f));
            this.f22827z.draw(canvas);
        }
        return zDrawChild;
    }

    public void e(int i10, boolean z10) {
        View viewN = n(i10);
        if (viewN != null) {
            g(viewN, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void f(@n0 View view) {
        g(view, true);
    }

    public void g(@n0 View view, boolean z10) {
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f22815n) {
            layoutParams.f22832b = 0.0f;
            layoutParams.f22834d = 0;
        } else if (z10) {
            layoutParams.f22834d |= 4;
            if (c(view, 3)) {
                this.f22809h.X(view, -view.getWidth(), view.getTop());
            } else {
                this.f22810i.X(view, getWidth(), view.getTop());
            }
        } else {
            J(view, 0.0f);
            V(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (f22800x2) {
            return this.f22804c;
        }
        return 0.0f;
    }

    @p0
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f22825x;
    }

    public void h() {
        i(false);
    }

    void i(boolean z10) {
        int childCount = getChildCount();
        boolean zX = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (E(childAt) && (!z10 || layoutParams.f22833c)) {
                zX |= c(childAt, 3) ? this.f22809h.X(childAt, -childAt.getWidth(), childAt.getTop()) : this.f22810i.X(childAt, getWidth(), childAt.getTop());
                layoutParams.f22833c = false;
            }
        }
        this.f22811j.p();
        this.f22812k.p();
        if (zX) {
            invalidate();
        }
    }

    @Override // androidx.customview.widget.c
    public boolean isOpen() {
        return C(n.f21701b);
    }

    void j(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f22834d & 1) == 1) {
            layoutParams.f22834d = 0;
            List<e> list = this.f22822u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f22822u.get(size).b(view);
                }
            }
            U(view, false);
            T(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void k(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f22834d & 1) == 0) {
            layoutParams.f22834d = 1;
            List<e> list = this.f22822u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f22822u.get(size).a(view);
                }
            }
            U(view, true);
            T(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void l(View view, float f10) {
        List<e> list = this.f22822u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f22822u.get(size).d(view, f10);
            }
        }
    }

    View n(int i10) {
        int iD = n.d(i10, j1.Z(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((t(childAt) & 7) == iD) {
                return childAt;
            }
        }
        return null;
    }

    View o() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((LayoutParams) childAt.getLayoutParams()).f22834d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22815n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22815n = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.D || this.f22825x == null) {
            return;
        }
        Object obj = this.C;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f22825x.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f22825x.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View viewV;
        int actionMasked = motionEvent.getActionMasked();
        boolean zW = this.f22809h.W(motionEvent) | this.f22810i.W(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i(true);
                this.f22820s = false;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i(true);
                    this.f22820s = false;
                }
            } else if (this.f22809h.f(3)) {
                this.f22811j.p();
                this.f22812k.p();
            }
            z10 = false;
        } else {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f22823v = x10;
            this.f22824w = y10;
            z10 = this.f22807f > 0.0f && (viewV = this.f22809h.v((int) x10, (int) y10)) != null && B(viewV);
            this.f22820s = false;
        }
        return zW || z10 || y() || this.f22820s;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !z()) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View viewP = p();
        if (viewP != null && r(viewP) == 0) {
            h();
        }
        return viewP != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        boolean z11 = true;
        this.f22814m = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i17 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i17, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i17, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f11 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (layoutParams.f22832b * f11));
                        f10 = (measuredWidth + i14) / f11;
                    } else {
                        float f12 = measuredWidth;
                        int i18 = i15 - ((int) (layoutParams.f22832b * f12));
                        f10 = (i15 - i18) / f12;
                        i14 = i18;
                    }
                    boolean z12 = f10 != layoutParams.f22832b ? z11 : false;
                    int i19 = layoutParams.f22831a & 112;
                    if (i19 == 16) {
                        int i20 = i13 - i11;
                        int i21 = (i20 - measuredHeight) / 2;
                        int i22 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i21 < i22) {
                            i21 = i22;
                        } else {
                            int i23 = i21 + measuredHeight;
                            int i24 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i23 > i20 - i24) {
                                i21 = (i20 - i24) - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i21, measuredWidth + i14, measuredHeight + i21);
                    } else if (i19 != 80) {
                        int i25 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i14, i25, measuredWidth + i14, measuredHeight + i25);
                    } else {
                        int i26 = i13 - i11;
                        childAt.layout(i14, (i26 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i26 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z12) {
                        S(childAt, f10);
                    }
                    int i27 = layoutParams.f22832b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i27) {
                        childAt.setVisibility(i27);
                    }
                }
            }
            i16++;
            z11 = true;
        }
        if (G2 && (rootWindowInsets = getRootWindowInsets()) != null) {
            h0 h0VarN = n3.K(rootWindowInsets).n();
            androidx.customview.widget.d dVar = this.f22809h;
            dVar.S(Math.max(dVar.A(), h0VarN.f20742a));
            androidx.customview.widget.d dVar2 = this.f22810i;
            dVar2.S(Math.max(dVar2.A(), h0VarN.f20744c));
        }
        this.f22814m = false;
        this.f22815n = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i12 = 0;
        boolean z10 = this.C != null && j1.U(this);
        int iZ = j1.Z(this);
        int childCount = getChildCount();
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z10) {
                    int iD = n.d(layoutParams.f22831a, iZ);
                    if (j1.U(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.C;
                        if (iD == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), i12, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iD == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(i12, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.C;
                        if (iD == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), i12, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iD == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(i12, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else {
                    if (!E(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i13 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f22800x2) {
                        float fR = j1.R(childAt);
                        float f10 = this.f22804c;
                        if (fR != f10) {
                            j1.N1(childAt, f10);
                        }
                    }
                    int iT = t(childAt) & 7;
                    int i14 = iT == 3 ? 1 : i12;
                    if ((i14 != 0 && z11) || (i14 == 0 && z12)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(iT) + " but this " + M + " already has a drawer view along that edge");
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f22805d + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
            }
            i13++;
            i12 = 0;
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewN;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i10 = savedState.f22835b;
        if (i10 != 0 && (viewN = n(i10)) != null) {
            M(viewN);
        }
        int i11 = savedState.f22836c;
        if (i11 != 3) {
            setDrawerLockMode(i11, 3);
        }
        int i12 = savedState.f22837d;
        if (i12 != 3) {
            setDrawerLockMode(i12, 5);
        }
        int i13 = savedState.f22838e;
        if (i13 != 3) {
            setDrawerLockMode(i13, n.f21701b);
        }
        int i14 = savedState.f22839f;
        if (i14 != 3) {
            setDrawerLockMode(i14, n.f21702c);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        R();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i10).getLayoutParams();
            int i11 = layoutParams.f22834d;
            boolean z10 = i11 == 1;
            boolean z11 = i11 == 2;
            if (z10 || z11) {
                savedState.f22835b = layoutParams.f22831a;
                break;
            }
        }
        savedState.f22836c = this.f22816o;
        savedState.f22837d = this.f22817p;
        savedState.f22838e = this.f22818q;
        savedState.f22839f = this.f22819r;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View viewO;
        this.f22809h.M(motionEvent);
        this.f22810i.M(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f22823v = x10;
            this.f22824w = y10;
            this.f22820s = false;
        } else if (action == 1) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            View viewV = this.f22809h.v((int) x11, (int) y11);
            if (viewV != null && B(viewV)) {
                float f10 = x11 - this.f22823v;
                float f11 = y11 - this.f22824w;
                int iE = this.f22809h.E();
                z10 = (f10 * f10) + (f11 * f11) >= ((float) (iE * iE)) || (viewO = o()) == null || r(viewO) == 2;
            }
            i(z10);
        } else if (action == 3) {
            i(true);
            this.f22820s = false;
        }
        return true;
    }

    @Override // androidx.customview.widget.c
    public void open() {
        K(n.f21701b);
    }

    View p() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (E(childAt) && G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i10) {
        int iZ = j1.Z(this);
        if (i10 == 3) {
            int i11 = this.f22816o;
            if (i11 != 3) {
                return i11;
            }
            int i12 = iZ == 0 ? this.f22818q : this.f22819r;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i10 == 5) {
            int i13 = this.f22817p;
            if (i13 != 3) {
                return i13;
            }
            int i14 = iZ == 0 ? this.f22819r : this.f22818q;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
        if (i10 == 8388611) {
            int i15 = this.f22818q;
            if (i15 != 3) {
                return i15;
            }
            int i16 = iZ == 0 ? this.f22816o : this.f22817p;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        }
        if (i10 != 8388613) {
            return 0;
        }
        int i17 = this.f22819r;
        if (i17 != 3) {
            return i17;
        }
        int i18 = iZ == 0 ? this.f22817p : this.f22816o;
        if (i18 != 3) {
            return i18;
        }
        return 0;
    }

    public int r(@n0 View view) {
        if (E(view)) {
            return q(((LayoutParams) view.getLayoutParams()).f22831a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f22814m) {
            return;
        }
        super.requestLayout();
    }

    @p0
    public CharSequence s(int i10) {
        int iD = n.d(i10, j1.Z(this));
        if (iD == 3) {
            return this.A;
        }
        if (iD == 5) {
            return this.B;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setChildInsets(Object obj, boolean z10) {
        this.C = obj;
        this.D = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f10) {
        this.f22804c = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (E(childAt)) {
                j1.N1(childAt, this.f22804c);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.f22821t;
        if (eVar2 != null) {
            O(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.f22821t = eVar;
    }

    public void setDrawerLockMode(int i10) {
        setDrawerLockMode(i10, 3);
        setDrawerLockMode(i10, 5);
    }

    public void setDrawerLockMode(int i10, int i11) {
        View viewN;
        int iD = n.d(i11, j1.Z(this));
        if (i11 == 3) {
            this.f22816o = i10;
        } else if (i11 == 5) {
            this.f22817p = i10;
        } else if (i11 == 8388611) {
            this.f22818q = i10;
        } else if (i11 == 8388613) {
            this.f22819r = i10;
        }
        if (i10 != 0) {
            (iD == 3 ? this.f22809h : this.f22810i).c();
        }
        if (i10 != 1) {
            if (i10 == 2 && (viewN = n(iD)) != null) {
                M(viewN);
                return;
            }
            return;
        }
        View viewN2 = n(iD);
        if (viewN2 != null) {
            f(viewN2);
        }
    }

    public void setDrawerLockMode(int i10, @n0 View view) {
        if (E(view)) {
            setDrawerLockMode(i10, ((LayoutParams) view.getLayoutParams()).f22831a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void setDrawerShadow(@v int i10, int i11) {
        setDrawerShadow(androidx.core.content.d.i(getContext(), i10), i11);
    }

    public void setDrawerShadow(Drawable drawable, int i10) {
        if (f22800x2) {
            return;
        }
        if ((i10 & n.f21701b) == 8388611) {
            this.E = drawable;
        } else if ((i10 & n.f21702c) == 8388613) {
            this.F = drawable;
        } else if ((i10 & 3) == 3) {
            this.G = drawable;
        } else if ((i10 & 5) != 5) {
            return;
        } else {
            this.H = drawable;
        }
        R();
        invalidate();
    }

    public void setDrawerTitle(int i10, @p0 CharSequence charSequence) {
        int iD = n.d(i10, j1.Z(this));
        if (iD == 3) {
            this.A = charSequence;
        } else if (iD == 5) {
            this.B = charSequence;
        }
    }

    public void setScrimColor(@l int i10) {
        this.f22806e = i10;
        invalidate();
    }

    public void setStatusBarBackground(int i10) {
        this.f22825x = i10 != 0 ? androidx.core.content.d.i(getContext(), i10) : null;
        invalidate();
    }

    public void setStatusBarBackground(@p0 Drawable drawable) {
        this.f22825x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@l int i10) {
        this.f22825x = new ColorDrawable(i10);
        invalidate();
    }

    int t(View view) {
        return n.d(((LayoutParams) view.getLayoutParams()).f22831a, j1.Z(this));
    }

    float u(View view) {
        return ((LayoutParams) view.getLayoutParams()).f22832b;
    }
}
