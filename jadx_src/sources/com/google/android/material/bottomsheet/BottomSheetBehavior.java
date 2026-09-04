package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import androidx.annotation.d1;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.x;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.h0;
import androidx.core.view.accessibility.a0;
import androidx.core.view.accessibility.e0;
import androidx.core.view.n3;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.internal.j0;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    @j1
    static final int A0 = 500;
    private static final float B0 = 0.5f;
    private static final float C0 = 0.1f;
    private static final int D0 = 500;
    private static final int E0 = -1;
    private static final int F0 = 0;

    @j1
    static final int G0 = 1;
    private static final int H0 = R.style.Widget_Design_BottomSheet_Modal;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f53243m0 = 1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f53244n0 = 2;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f53245o0 = 3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f53246p0 = 4;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f53247q0 = 5;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f53248r0 = 6;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f53249s0 = -1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f53250t0 = 1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f53251u0 = 2;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f53252v0 = 4;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f53253w0 = 8;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f53254x0 = -1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f53255y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final String f53256z0 = "BottomSheetBehavior";
    private boolean A;
    private int B;
    private int C;
    private boolean D;
    private p E;
    private boolean F;
    private final BottomSheetBehavior<V>.j G;

    @p0
    private ValueAnimator H;
    int I;
    int J;
    int K;
    float L;
    int M;
    float N;
    boolean O;
    private boolean P;
    private boolean Q;
    int R;
    int S;

    @p0
    androidx.customview.widget.d T;
    private boolean U;
    private int V;
    private boolean W;
    private float X;
    private int Y;
    int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    int f53257a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @p0
    WeakReference<V> f53258b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @p0
    WeakReference<View> f53259c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @p0
    WeakReference<View> f53260d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @n0
    private final ArrayList<f> f53261e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f53262f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @p0
    private VelocityTracker f53263f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f53264g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    int f53265g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f53266h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f53267h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f53268i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    boolean f53269i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f53270j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @p0
    private Map<View, Integer> f53271j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f53272k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @j1
    final SparseIntArray f53273k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f53274l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final androidx.customview.widget.d.c f53275l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f53276m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f53277n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private k f53278o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private ColorStateList f53279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f53280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f53281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f53282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f53283t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f53284u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f53285v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f53286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f53287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f53288y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f53289z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f53290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f53291c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f53292d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f53293e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f53294f;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @p0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@n0 Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @n0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@n0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @n0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@n0 Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(@n0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f53290b = parcel.readInt();
            this.f53291c = parcel.readInt();
            this.f53292d = parcel.readInt() == 1;
            this.f53293e = parcel.readInt() == 1;
            this.f53294f = parcel.readInt() == 1;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i10) {
            super(parcelable);
            this.f53290b = i10;
        }

        public SavedState(Parcelable parcelable, @n0 BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f53290b = bottomSheetBehavior.R;
            this.f53291c = ((BottomSheetBehavior) bottomSheetBehavior).f53272k;
            this.f53292d = ((BottomSheetBehavior) bottomSheetBehavior).f53264g;
            this.f53293e = bottomSheetBehavior.O;
            this.f53294f = ((BottomSheetBehavior) bottomSheetBehavior).P;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@n0 Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f53290b);
            parcel.writeInt(this.f53291c);
            parcel.writeInt(this.f53292d ? 1 : 0);
            parcel.writeInt(this.f53293e ? 1 : 0);
            parcel.writeInt(this.f53294f ? 1 : 0);
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f53295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f53296c;

        a(View view, int i10) {
            this.f53295b = view;
            this.f53296c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.t1(this.f53295b, this.f53296c, false);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@n0 ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f53278o != null) {
                BottomSheetBehavior.this.f53278o.p0(fFloatValue);
            }
        }
    }

    public class c implements j0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f53299a;

        c(boolean z10) {
            this.f53299a = z10;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.j0.e
        public n3 a(View view, n3 n3Var, j0.f fVar) {
            boolean z10;
            h0 h0VarF = n3Var.f(n3.m.i());
            h0 h0VarF2 = n3Var.f(n3.m.f());
            BottomSheetBehavior.this.C = h0VarF.f20743b;
            boolean zQ = j0.q(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f53284u) {
                BottomSheetBehavior.this.B = n3Var.o();
                paddingBottom = fVar.f54524d + BottomSheetBehavior.this.B;
            }
            if (BottomSheetBehavior.this.f53285v) {
                paddingLeft = (zQ ? fVar.f54523c : fVar.f54521a) + h0VarF.f20742a;
            }
            if (BottomSheetBehavior.this.f53286w) {
                paddingRight = (zQ ? fVar.f54521a : fVar.f54523c) + h0VarF.f20744c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z11 = true;
            if (BottomSheetBehavior.this.f53288y) {
                int i10 = marginLayoutParams.leftMargin;
                int i11 = h0VarF.f20742a;
                if (i10 != i11) {
                    marginLayoutParams.leftMargin = i11;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (BottomSheetBehavior.this.f53289z) {
                int i12 = marginLayoutParams.rightMargin;
                int i13 = h0VarF.f20744c;
                if (i12 != i13) {
                    marginLayoutParams.rightMargin = i13;
                    z10 = true;
                }
            }
            if (BottomSheetBehavior.this.A) {
                int i14 = marginLayoutParams.topMargin;
                int i15 = h0VarF.f20743b;
                if (i14 != i15) {
                    marginLayoutParams.topMargin = i15;
                } else {
                    z11 = z10;
                }
            } else {
                z11 = z10;
            }
            if (z11) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f53299a) {
                BottomSheetBehavior.this.f53282s = h0VarF2.f20745d;
            }
            if (BottomSheetBehavior.this.f53284u || this.f53299a) {
                BottomSheetBehavior.this.y1(false);
            }
            return n3Var;
        }
    }

    public class d extends androidx.customview.widget.d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f53301a;

        d() {
        }

        private boolean n(@n0 View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f53257a0 + bottomSheetBehavior.t0()) / 2;
        }

        @Override // androidx.customview.widget.d.c
        public int a(@n0 View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.d.c
        public int b(@n0 View view, int i10, int i11) {
            return a2.a.e(i10, BottomSheetBehavior.this.t0(), e(view));
        }

        @Override // androidx.customview.widget.d.c
        public int e(@n0 View view) {
            return BottomSheetBehavior.this.j0() ? BottomSheetBehavior.this.f53257a0 : BottomSheetBehavior.this.M;
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.Q) {
                BottomSheetBehavior.this.l1(1);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void k(@n0 View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.p0(i11);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:6:0x0010  */
        @Override // androidx.customview.widget.d.c
        public void l(@n0 View view, float f10, float f11) {
            int i10 = 6;
            if (f11 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.O && bottomSheetBehavior.q1(view, f11)) {
                    if ((Math.abs(f10) < Math.abs(f11) && f11 > BottomSheetBehavior.this.f53270j) || n(view)) {
                        i10 = 5;
                    } else if (BottomSheetBehavior.this.f53264g || Math.abs(view.getTop() - BottomSheetBehavior.this.t0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.K)) {
                        i10 = 3;
                    }
                } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f53264g) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i11 = bottomSheetBehavior2.K;
                        if (top < i11) {
                            if (top < Math.abs(top - bottomSheetBehavior2.M)) {
                                i10 = 3;
                            } else if (BottomSheetBehavior.this.r1()) {
                                i10 = 4;
                            }
                        } else if (Math.abs(top - i11) >= Math.abs(top - BottomSheetBehavior.this.M) || BottomSheetBehavior.this.r1()) {
                            i10 = 4;
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.J) < Math.abs(top - BottomSheetBehavior.this.M)) {
                        i10 = 3;
                    } else {
                        i10 = 4;
                    }
                } else if (BottomSheetBehavior.this.f53264g) {
                    i10 = 4;
                } else {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.K) >= Math.abs(top2 - BottomSheetBehavior.this.M) || BottomSheetBehavior.this.r1()) {
                        i10 = 4;
                    }
                }
            } else if (BottomSheetBehavior.this.f53264g) {
                i10 = 3;
            } else {
                int top3 = view.getTop();
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f53301a;
                if (BottomSheetBehavior.this.r1()) {
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior3.o1(jCurrentTimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.f53257a0)) {
                        i10 = 4;
                    }
                } else if (top3 <= BottomSheetBehavior.this.K) {
                }
                i10 = 3;
            }
            BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
            bottomSheetBehavior4.t1(view, i10, bottomSheetBehavior4.s1());
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(@n0 View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.R;
            if (i11 == 1 || bottomSheetBehavior.f53269i0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f53265g0 == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.f53260d0;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f53301a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f53258b0;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public class e implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f53303a;

        e(int i10) {
            this.f53303a = i10;
        }

        @Override // androidx.core.view.accessibility.e0
        public boolean perform(@n0 View view, @p0 e0.a aVar) {
            BottomSheetBehavior.this.c(this.f53303a);
            return true;
        }
    }

    public static abstract class f {
        void a(@n0 View view) {
        }

        public abstract void b(@n0 View view, float f10);

        public abstract void c(@n0 View view, int i10);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface g {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface h {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface i {
    }

    public class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f53305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f53306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f53307c;

        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j.this.f53306b = false;
                androidx.customview.widget.d dVar = BottomSheetBehavior.this.T;
                if (dVar != null && dVar.o(true)) {
                    j jVar = j.this;
                    jVar.c(jVar.f53305a);
                    return;
                }
                j jVar2 = j.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.R == 2) {
                    bottomSheetBehavior.l1(jVar2.f53305a);
                }
            }
        }

        private j() {
            this.f53307c = new a();
        }

        /* synthetic */ j(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }

        void c(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f53258b0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f53305a = i10;
            if (this.f53306b) {
                return;
            }
            androidx.core.view.j1.p1(BottomSheetBehavior.this.f53258b0.get(), this.f53307c);
            this.f53306b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f53262f = 0;
        this.f53264g = true;
        this.f53266h = false;
        this.f53280q = -1;
        this.f53281r = -1;
        this.G = new j(this, null);
        this.L = 0.5f;
        this.N = -1.0f;
        this.Q = true;
        this.R = 4;
        this.S = 4;
        this.X = 0.1f;
        this.f53261e0 = new ArrayList<>();
        this.f53273k0 = new SparseIntArray();
        this.f53275l0 = new d();
    }

    public BottomSheetBehavior(@n0 Context context, @p0 AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f53262f = 0;
        this.f53264g = true;
        this.f53266h = false;
        this.f53280q = -1;
        this.f53281r = -1;
        this.G = new j(this, null);
        this.L = 0.5f;
        this.N = -1.0f;
        this.Q = true;
        this.R = 4;
        this.S = 4;
        this.X = 0.1f;
        this.f53261e0 = new ArrayList<>();
        this.f53273k0 = new SparseIntArray();
        this.f53275l0 = new d();
        this.f53277n = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f52887x);
        int i11 = R.styleable.BottomSheetBehavior_Layout_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f53279p = com.google.android.material.resources.c.a(context, typedArrayObtainStyledAttributes, i11);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.E = p.e(context, attributeSet, R.attr.bottomSheetStyle, H0).m();
        }
        m0(context);
        n0();
        this.N = typedArrayObtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i12 = R.styleable.BottomSheetBehavior_Layout_android_maxWidth;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            f1(typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = R.styleable.BottomSheetBehavior_Layout_android_maxHeight;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            e1(typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i14);
        if (typedValuePeekValue == null || (i10 = typedValuePeekValue.data) != -1) {
            g1(typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, -1));
        } else {
            g1(i10);
        }
        c1(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        Z0(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        Y0(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        k1(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        W0(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        i1(typedArrayObtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        a1(typedArrayObtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i15 = R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i15);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            X0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i15, 0));
        } else {
            X0(typedValuePeekValue2.data);
        }
        j1(typedArrayObtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.f53284u = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f53285v = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f53286w = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f53287x = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.f53288y = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.f53289z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.A = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.D = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f53268i = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private int F0(int i10) {
        if (i10 == 3) {
            return t0();
        }
        if (i10 == 4) {
            return this.M;
        }
        if (i10 == 5) {
            return this.f53257a0;
        }
        if (i10 == 6) {
            return this.K;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float G0() {
        VelocityTracker velocityTracker = this.f53263f0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f53268i);
        return this.f53263f0.getYVelocity(this.f53265g0);
    }

    private boolean I0() {
        return this.R == 3 && (this.D || t0() == 0);
    }

    private boolean N0(V v10) {
        ViewParent parent = v10.getParent();
        return parent != null && parent.isLayoutRequested() && androidx.core.view.j1.O0(v10);
    }

    private void Q0(View view, a0.a aVar, int i10) {
        androidx.core.view.j1.u1(view, aVar, null, l0(i10));
    }

    private void R0() {
        this.f53265g0 = -1;
        VelocityTracker velocityTracker = this.f53263f0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f53263f0 = null;
        }
    }

    private void S0(@n0 SavedState savedState) {
        int i10 = this.f53262f;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f53272k = savedState.f53291c;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f53264g = savedState.f53292d;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.O = savedState.f53293e;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.P = savedState.f53294f;
        }
    }

    private void T0(V v10, Runnable runnable) {
        if (N0(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    private int c0(View view, @d1 int i10, int i11) {
        return androidx.core.view.j1.c(view, view.getResources().getString(i10), l0(i11));
    }

    private void e0() {
        int iG0 = g0();
        if (this.f53264g) {
            this.M = Math.max(this.f53257a0 - iG0, this.J);
        } else {
            this.M = this.f53257a0 - iG0;
        }
    }

    private void f0() {
        this.K = (int) (this.f53257a0 * (1.0f - this.L));
    }

    private int g0() {
        int i10;
        if (this.f53274l) {
            return Math.min(Math.max(this.f53276m, this.f53257a0 - ((this.Z * 9) / 16)), this.Y) + this.B;
        }
        return (this.f53283t || this.f53284u || (i10 = this.f53282s) <= 0) ? this.f53272k + this.B : Math.max(this.f53272k, i10 + this.f53277n);
    }

    private float i0(int i10) {
        float f10;
        float fT0;
        int i11 = this.M;
        if (i10 > i11 || i11 == t0()) {
            int i12 = this.M;
            f10 = i12 - i10;
            fT0 = this.f53257a0 - i12;
        } else {
            int i13 = this.M;
            f10 = i13 - i10;
            fT0 = i13 - t0();
        }
        return f10 / fT0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j0() {
        return L0() && M0();
    }

    private void k0(View view, int i10) {
        if (view == null) {
            return;
        }
        androidx.core.view.j1.r1(view, 524288);
        androidx.core.view.j1.r1(view, 262144);
        androidx.core.view.j1.r1(view, 1048576);
        int i11 = this.f53273k0.get(i10, -1);
        if (i11 != -1) {
            androidx.core.view.j1.r1(view, i11);
            this.f53273k0.delete(i10);
        }
    }

    private e0 l0(int i10) {
        return new e(i10);
    }

    private void m0(@n0 Context context) {
        if (this.E == null) {
            return;
        }
        k kVar = new k(this.E);
        this.f53278o = kVar;
        kVar.Z(context);
        ColorStateList colorStateList = this.f53279p;
        if (colorStateList != null) {
            this.f53278o.o0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
        this.f53278o.setTint(typedValue.data);
    }

    private void n0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.H = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.H.addUpdateListener(new b());
    }

    private void n1(@n0 View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || K0() || this.f53274l) ? false : true;
        if (this.f53284u || this.f53285v || this.f53286w || this.f53288y || this.f53289z || this.A || z10) {
            j0.f(view, new c(z10));
        }
    }

    private boolean p1() {
        return this.T != null && (this.Q || this.R == 1);
    }

    @n0
    public static <V extends View> BottomSheetBehavior<V> r0(@n0 V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behaviorF = ((CoordinatorLayout.f) layoutParams).f();
        if (behaviorF instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behaviorF;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int s0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t1(View view, int i10, boolean z10) {
        int iF0 = F0(i10);
        androidx.customview.widget.d dVar = this.T;
        if (!(dVar != null && (!z10 ? !dVar.X(view, view.getLeft(), iF0) : !dVar.V(view.getLeft(), iF0)))) {
            l1(i10);
            return;
        }
        l1(2);
        w1(i10, true);
        this.G.c(i10);
    }

    private void u1() {
        WeakReference<V> weakReference = this.f53258b0;
        if (weakReference != null) {
            v1(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.f53259c0;
        if (weakReference2 != null) {
            v1(weakReference2.get(), 1);
        }
    }

    private void v1(View view, int i10) {
        if (view == null) {
            return;
        }
        k0(view, i10);
        if (!this.f53264g && this.R != 6) {
            this.f53273k0.put(i10, c0(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.O && M0() && this.R != 5) {
            Q0(view, a0.a.f21396z, 5);
        }
        int i11 = this.R;
        if (i11 == 3) {
            Q0(view, a0.a.f21395y, this.f53264g ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            Q0(view, a0.a.f21394x, this.f53264g ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            Q0(view, a0.a.f21395y, 4);
            Q0(view, a0.a.f21394x, 3);
        }
    }

    private void w1(int i10, boolean z10) {
        boolean zI0;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.F == (zI0 = I0()) || this.f53278o == null) {
            return;
        }
        this.F = zI0;
        if (!z10 || (valueAnimator = this.H) == null) {
            ValueAnimator valueAnimator2 = this.H;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.H.cancel();
            }
            this.f53278o.p0(this.F ? 0.0f : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.H.reverse();
            return;
        }
        float f10 = zI0 ? 0.0f : 1.0f;
        this.H.setFloatValues(1.0f - f10, f10);
        this.H.start();
    }

    private void x1(boolean z10) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f53258b0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f53271j0 != null) {
                    return;
                } else {
                    this.f53271j0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f53258b0.get()) {
                    if (z10) {
                        this.f53271j0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f53266h) {
                            androidx.core.view.j1.R1(childAt, 4);
                        }
                    } else if (this.f53266h && (map = this.f53271j0) != null && map.containsKey(childAt)) {
                        androidx.core.view.j1.R1(childAt, this.f53271j0.get(childAt).intValue());
                    }
                }
            }
            if (!z10) {
                this.f53271j0 = null;
            } else if (this.f53266h) {
                this.f53258b0.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y1(boolean z10) {
        V v10;
        if (this.f53258b0 != null) {
            e0();
            if (this.R != 4 || (v10 = this.f53258b0.get()) == null) {
                return;
            }
            if (z10) {
                c(4);
            } else {
                v10.requestLayout();
            }
        }
    }

    public int A0() {
        if (this.f53274l) {
            return -1;
        }
        return this.f53272k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void B(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.B(coordinatorLayout, v10, savedState.getSuperState());
        S0(savedState);
        int i10 = savedState.f53290b;
        if (i10 == 1 || i10 == 2) {
            this.R = 4;
            this.S = 4;
        } else {
            this.R = i10;
            this.S = i10;
        }
    }

    @j1
    int B0() {
        return this.f53276m;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @n0
    public Parcelable C(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10) {
        return new SavedState(super.C(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    public int C0() {
        return this.f53262f;
    }

    public int D0() {
        return this.f53270j;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean E(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, @n0 View view2, int i10, int i11) {
        this.V = 0;
        this.W = false;
        return (i10 & 2) != 0;
    }

    public boolean E0() {
        return this.P;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void G(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, int i10) {
        WeakReference<View> weakReference;
        int i11 = 3;
        if (v10.getTop() == t0()) {
            l1(3);
            return;
        }
        if (!O0() || ((weakReference = this.f53260d0) != null && view == weakReference.get() && this.W)) {
            if (this.V > 0) {
                if (!this.f53264g && v10.getTop() > this.K) {
                    i11 = 6;
                }
            } else if (this.O && q1(v10, G0())) {
                i11 = 5;
            } else if (this.V == 0) {
                int top = v10.getTop();
                if (!this.f53264g) {
                    int i12 = this.K;
                    if (top < i12) {
                        if (top >= Math.abs(top - this.M)) {
                            if (r1()) {
                                i11 = 4;
                            } else {
                                i11 = 6;
                            }
                        }
                    } else if (Math.abs(top - i12) < Math.abs(top - this.M)) {
                        i11 = 6;
                    } else {
                        i11 = 4;
                    }
                } else if (Math.abs(top - this.J) >= Math.abs(top - this.M)) {
                    i11 = 4;
                }
            } else {
                if (!this.f53264g) {
                    int top2 = v10.getTop();
                    if (Math.abs(top2 - this.K) < Math.abs(top2 - this.M)) {
                        i11 = 6;
                    }
                }
                i11 = 4;
            }
            t1(v10, i11, false);
            this.W = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean H(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.R == 1 && actionMasked == 0) {
            return true;
        }
        if (p1()) {
            this.T.M(motionEvent);
        }
        if (actionMasked == 0) {
            R0();
        }
        if (this.f53263f0 == null) {
            this.f53263f0 = VelocityTracker.obtain();
        }
        this.f53263f0.addMovement(motionEvent);
        if (p1() && actionMasked == 2 && !this.U && Math.abs(this.f53267h0 - motionEvent.getY()) > this.T.E()) {
            this.T.d(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.U;
    }

    public boolean H0() {
        return this.Q;
    }

    public boolean J0() {
        return this.f53264g;
    }

    public boolean K0() {
        return this.f53283t;
    }

    public boolean L0() {
        return this.O;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean M0() {
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean O0() {
        return true;
    }

    public void P0(@n0 f fVar) {
        this.f53261e0.remove(fVar);
    }

    void U0(@p0 View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.f53259c0) == null) {
            this.f53259c0 = new WeakReference<>(view);
            v1(view, 1);
        } else {
            k0(weakReference.get(), 1);
            this.f53259c0 = null;
        }
    }

    @Deprecated
    public void V0(f fVar) {
        Log.w(f53256z0, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f53261e0.clear();
        if (fVar != null) {
            this.f53261e0.add(fVar);
        }
    }

    public void W0(boolean z10) {
        this.Q = z10;
    }

    public void X0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.I = i10;
        w1(this.R, true);
    }

    public void Y0(boolean z10) {
        if (this.f53264g == z10) {
            return;
        }
        this.f53264g = z10;
        if (this.f53258b0 != null) {
            e0();
        }
        l1((this.f53264g && this.R == 6) ? 3 : this.R);
        w1(this.R, true);
        u1();
    }

    public void Z0(boolean z10) {
        this.f53283t = z10;
    }

    public void a1(@x(from = 0.0d, fromInclusive = false, to = com.google.android.material.color.utilities.d.f53848a, toInclusive = false) float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.L = f10;
        if (this.f53258b0 != null) {
            f0();
        }
    }

    public void b1(float f10) {
        this.X = f10;
    }

    public void c(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.O && i10 == 5) {
            Log.w(f53256z0, "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f53264g && F0(i10) <= this.J) ? 3 : i10;
        WeakReference<V> weakReference = this.f53258b0;
        if (weakReference == null || weakReference.get() == null) {
            l1(i10);
        } else {
            V v10 = this.f53258b0.get();
            T0(v10, new a(v10, i11));
        }
    }

    public void c1(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            if (!z10 && this.R == 5) {
                c(4);
            }
            u1();
        }
    }

    public void d0(@n0 f fVar) {
        if (this.f53261e0.contains(fVar)) {
            return;
        }
        this.f53261e0.add(fVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void d1(boolean z10) {
        this.O = z10;
    }

    public void e1(@t0 int i10) {
        this.f53281r = i10;
    }

    public void f1(@t0 int i10) {
        this.f53280q = i10;
    }

    public void g1(int i10) {
        h1(i10, false);
    }

    public int getState() {
        return this.R;
    }

    public float h0() {
        WeakReference<V> weakReference = this.f53258b0;
        if (weakReference == null || weakReference.get() == null) {
            return -1.0f;
        }
        return i0(this.f53258b0.get().getTop());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    public final void h1(int i10, boolean z10) {
        boolean z11 = true;
        if (i10 == -1) {
            if (this.f53274l) {
                z11 = false;
            } else {
                this.f53274l = true;
            }
        } else if (this.f53274l || this.f53272k != i10) {
            this.f53274l = false;
            this.f53272k = Math.max(0, i10);
        } else {
            z11 = false;
        }
        if (z11) {
            y1(z10);
        }
    }

    public void i1(int i10) {
        this.f53262f = i10;
    }

    public void j1(int i10) {
        this.f53270j = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void k(@n0 CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f53258b0 = null;
        this.T = null;
    }

    public void k1(boolean z10) {
        this.P = z10;
    }

    void l1(int i10) {
        V v10;
        if (this.R == i10) {
            return;
        }
        this.R = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.O && i10 == 5)) {
            this.S = i10;
        }
        WeakReference<V> weakReference = this.f53258b0;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            x1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            x1(false);
        }
        w1(i10, true);
        for (int i11 = 0; i11 < this.f53261e0.size(); i11++) {
            this.f53261e0.get(i11).c(v10, i10);
        }
        u1();
    }

    public void m1(boolean z10) {
        this.f53266h = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void n() {
        super.n();
        this.f53258b0 = null;
        this.T = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean o(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 MotionEvent motionEvent) {
        androidx.customview.widget.d dVar;
        if (!v10.isShown() || !this.Q) {
            this.U = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            R0();
        }
        if (this.f53263f0 == null) {
            this.f53263f0 = VelocityTracker.obtain();
        }
        this.f53263f0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.f53267h0 = (int) motionEvent.getY();
            if (this.R != 2) {
                WeakReference<View> weakReference = this.f53260d0;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.C(view, x10, this.f53267h0)) {
                    this.f53265g0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f53269i0 = true;
                }
            }
            this.U = this.f53265g0 == -1 && !coordinatorLayout.C(v10, x10, this.f53267h0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f53269i0 = false;
            this.f53265g0 = -1;
            if (this.U) {
                this.U = false;
                return false;
            }
        }
        if (!this.U && (dVar = this.T) != null && dVar.W(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f53260d0;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.U || this.R == 1 || coordinatorLayout.C(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.T == null || Math.abs(((float) this.f53267h0) - motionEvent.getY()) <= ((float) this.T.E())) ? false : true;
    }

    @j1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void o0() {
        this.H = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean o1(long j10, @x(from = 0.0d, to = 100.0d) float f10) {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean p(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, int i10) {
        if (androidx.core.view.j1.U(coordinatorLayout) && !androidx.core.view.j1.U(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.f53258b0 == null) {
            this.f53276m = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            n1(v10);
            androidx.core.view.j1.y2(v10, new com.google.android.material.bottomsheet.d(v10));
            this.f53258b0 = new WeakReference<>(v10);
            k kVar = this.f53278o;
            if (kVar != null) {
                androidx.core.view.j1.I1(v10, kVar);
                k kVar2 = this.f53278o;
                float fR = this.N;
                if (fR == -1.0f) {
                    fR = androidx.core.view.j1.R(v10);
                }
                kVar2.n0(fR);
            } else {
                ColorStateList colorStateList = this.f53279p;
                if (colorStateList != null) {
                    androidx.core.view.j1.J1(v10, colorStateList);
                }
            }
            u1();
            if (androidx.core.view.j1.V(v10) == 0) {
                androidx.core.view.j1.R1(v10, 1);
            }
        }
        if (this.T == null) {
            this.T = androidx.customview.widget.d.q(coordinatorLayout, this.f53275l0);
        }
        int top = v10.getTop();
        coordinatorLayout.K(v10, i10);
        this.Z = coordinatorLayout.getWidth();
        this.f53257a0 = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.Y = height;
        int i11 = this.f53257a0;
        int i12 = i11 - height;
        int i13 = this.C;
        if (i12 < i13) {
            if (this.f53287x) {
                this.Y = i11;
            } else {
                this.Y = i11 - i13;
            }
        }
        this.J = Math.max(0, i11 - this.Y);
        f0();
        e0();
        int i14 = this.R;
        if (i14 == 3) {
            androidx.core.view.j1.f1(v10, t0());
        } else if (i14 == 6) {
            androidx.core.view.j1.f1(v10, this.K);
        } else if (this.O && i14 == 5) {
            androidx.core.view.j1.f1(v10, this.f53257a0);
        } else if (i14 == 4) {
            androidx.core.view.j1.f1(v10, this.M);
        } else if (i14 == 1 || i14 == 2) {
            androidx.core.view.j1.f1(v10, top - v10.getTop());
        }
        w1(this.R, false);
        this.f53260d0 = new WeakReference<>(q0(v10));
        for (int i15 = 0; i15 < this.f53261e0.size(); i15++) {
            this.f53261e0.get(i15).a(v10);
        }
        return true;
    }

    void p0(int i10) {
        V v10 = this.f53258b0.get();
        if (v10 == null || this.f53261e0.isEmpty()) {
            return;
        }
        float fI0 = i0(i10);
        for (int i11 = 0; i11 < this.f53261e0.size(); i11++) {
            this.f53261e0.get(i11).b(v10, fI0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean q(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(s0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f53280q, marginLayoutParams.width), s0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f53281r, marginLayoutParams.height));
        return true;
    }

    @j1
    @p0
    View q0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (androidx.core.view.j1.W0(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewQ0 = q0(viewGroup.getChildAt(i10));
                if (viewQ0 != null) {
                    return viewQ0;
                }
            }
        }
        return null;
    }

    boolean q1(@n0 View view, float f10) {
        if (this.P) {
            return true;
        }
        if (M0() && view.getTop() >= this.M) {
            return Math.abs((((float) view.getTop()) + (f10 * this.X)) - ((float) this.M)) / ((float) g0()) > 0.5f;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean r1() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean s(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, float f10, float f11) {
        WeakReference<View> weakReference;
        if (O0() && (weakReference = this.f53260d0) != null && view == weakReference.get()) {
            return this.R != 3 || super.s(coordinatorLayout, v10, view, f10, f11);
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean s1() {
        return true;
    }

    public int t0() {
        if (this.f53264g) {
            return this.J;
        }
        return Math.max(this.I, this.f53287x ? 0 : this.C);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void u(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, int i10, int i11, @n0 int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f53260d0;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!O0() || view == view2) {
            int top = v10.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (i13 < t0()) {
                    int iT0 = top - t0();
                    iArr[1] = iT0;
                    androidx.core.view.j1.f1(v10, -iT0);
                    l1(3);
                } else {
                    if (!this.Q) {
                        return;
                    }
                    iArr[1] = i11;
                    androidx.core.view.j1.f1(v10, -i11);
                    l1(1);
                }
            } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                if (i13 > this.M && !j0()) {
                    int i14 = top - this.M;
                    iArr[1] = i14;
                    androidx.core.view.j1.f1(v10, -i14);
                    l1(4);
                } else {
                    if (!this.Q) {
                        return;
                    }
                    iArr[1] = i11;
                    androidx.core.view.j1.f1(v10, -i11);
                    l1(1);
                }
            }
            p0(v10.getTop());
            this.V = i11;
            this.W = true;
        }
    }

    @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    public float u0() {
        return this.L;
    }

    public float v0() {
        return this.X;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int w0() {
        return this.S;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void x(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, int i10, int i11, int i12, int i13, int i14, @n0 int[] iArr) {
    }

    k x0() {
        return this.f53278o;
    }

    @t0
    public int y0() {
        return this.f53281r;
    }

    @t0
    public int z0() {
        return this.f53280q;
    }
}
