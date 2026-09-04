package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.a0;
import androidx.core.view.accessibility.e0;
import androidx.core.view.j1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.shape.p;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements com.google.android.material.sidesheet.b<k> {
    static final int D = 500;
    private static final float E = 0.5f;
    private static final float F = 0.1f;
    private static final int G = -1;

    @n0
    private final Set<k> A;
    private final androidx.customview.widget.d.c B;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f55214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f55215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private com.google.android.material.shape.k f55216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private ColorStateList f55217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p f55218j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SideSheetBehavior<V>.b f55219k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f55220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f55221m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f55222n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f55223o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private androidx.customview.widget.d f55224p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f55225q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f55226r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f55227s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f55228t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f55229u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private WeakReference<V> f55230v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private WeakReference<View> f55231w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @d0
    private int f55232x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @p0
    private VelocityTracker f55233y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f55234z;
    private static final int C = R.string.side_sheet_accessibility_pane_title;
    private static final int H = R.style.Widget_Material3_SideSheet;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f55235b;

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
            this.f55235b = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, @n0 SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f55235b = ((SideSheetBehavior) sideSheetBehavior).f55222n;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@n0 Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f55235b);
        }
    }

    public class a extends androidx.customview.widget.d.c {
        a() {
        }

        @Override // androidx.customview.widget.d.c
        public int a(@n0 View view, int i10, int i11) {
            return a2.a.e(i10, SideSheetBehavior.this.h0(), SideSheetBehavior.this.f55228t);
        }

        @Override // androidx.customview.widget.d.c
        public int b(@n0 View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public int d(@n0 View view) {
            return SideSheetBehavior.this.f55228t;
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f55221m) {
                SideSheetBehavior.this.H0(1);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void k(@n0 View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewF0 = SideSheetBehavior.this.f0();
            if (viewF0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) != null) {
                SideSheetBehavior.this.f55214f.j(marginLayoutParams, view.getLeft(), view.getRight());
                viewF0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.Z(view, i10);
        }

        @Override // androidx.customview.widget.d.c
        public void l(@n0 View view, float f10, float f11) {
            int iC = SideSheetBehavior.this.f55214f.c(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.M0(view, iC, sideSheetBehavior.L0());
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(@n0 View view, int i10) {
            return (SideSheetBehavior.this.f55222n == 1 || SideSheetBehavior.this.f55230v == null || SideSheetBehavior.this.f55230v.get() != view) ? false : true;
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f55237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f55238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f55239c = new Runnable() { // from class: com.google.android.material.sidesheet.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f55262b.c();
            }
        };

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f55238b = false;
            if (SideSheetBehavior.this.f55224p != null && SideSheetBehavior.this.f55224p.o(true)) {
                b(this.f55237a);
            } else if (SideSheetBehavior.this.f55222n == 2) {
                SideSheetBehavior.this.H0(this.f55237a);
            }
        }

        void b(int i10) {
            if (SideSheetBehavior.this.f55230v == null || SideSheetBehavior.this.f55230v.get() == null) {
                return;
            }
            this.f55237a = i10;
            if (this.f55238b) {
                return;
            }
            j1.p1((View) SideSheetBehavior.this.f55230v.get(), this.f55239c);
            this.f55238b = true;
        }
    }

    public SideSheetBehavior() {
        this.f55219k = new b();
        this.f55221m = true;
        this.f55222n = 5;
        this.f55223o = 5;
        this.f55226r = 0.1f;
        this.f55232x = -1;
        this.A = new LinkedHashSet();
        this.B = new a();
    }

    public SideSheetBehavior(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55219k = new b();
        this.f55221m = true;
        this.f55222n = 5;
        this.f55223o = 5;
        this.f55226r = 0.1f;
        this.f55232x = -1;
        this.A = new LinkedHashSet();
        this.B = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f52856m1);
        int i10 = R.styleable.SideSheetBehavior_Layout_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f55217i = com.google.android.material.resources.c.a(context, typedArrayObtainStyledAttributes, i10);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f55218j = p.e(context, attributeSet, 0, H).m();
        }
        int i11 = R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            D0(typedArrayObtainStyledAttributes.getResourceId(i11, -1));
        }
        Y(context);
        this.f55220l = typedArrayObtainStyledAttributes.getDimension(R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        E0(typedArrayObtainStyledAttributes.getBoolean(R.styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        typedArrayObtainStyledAttributes.recycle();
        G0(g0());
        this.f55215g = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void A0() {
        VelocityTracker velocityTracker = this.f55233y;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f55233y = null;
        }
    }

    private void B0(@n0 V v10, Runnable runnable) {
        if (u0(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void G0(int i10) {
        d dVar = this.f55214f;
        if (dVar == null || dVar.g() != i10) {
            if (i10 == 0) {
                this.f55214f = new com.google.android.material.sidesheet.a(this);
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0");
        }
    }

    private boolean I0() {
        return this.f55224p != null && (this.f55221m || this.f55222n == 1);
    }

    private boolean K0(@n0 V v10) {
        return (v10.isShown() || j1.J(v10) != null) && this.f55221m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0(View view, int i10, boolean z10) {
        if (!this.f55214f.h(view, i10, z10)) {
            H0(i10);
        } else {
            H0(2);
            this.f55219k.b(i10);
        }
    }

    private void N0() {
        V v10;
        WeakReference<V> weakReference = this.f55230v;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        j1.r1(v10, 262144);
        j1.r1(v10, 1048576);
        if (this.f55222n != 5) {
            z0(v10, a0.a.f21396z, 5);
        }
        if (this.f55222n != 3) {
            z0(v10, a0.a.f21394x, 3);
        }
    }

    private void O0(@n0 View view) {
        int i10 = this.f55222n == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    private int U(int i10, V v10) {
        int i11 = this.f55222n;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f55214f.f(v10);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f55214f.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f55222n);
    }

    private float V(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    private void W() {
        WeakReference<View> weakReference = this.f55231w;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f55231w = null;
    }

    private e0 X(final int i10) {
        return new e0() { // from class: com.google.android.material.sidesheet.i
            @Override // androidx.core.view.accessibility.e0
            public final boolean perform(View view, e0.a aVar) {
                return this.f55260a.v0(i10, view, aVar);
            }
        };
    }

    private void Y(@n0 Context context) {
        if (this.f55218j == null) {
            return;
        }
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(this.f55218j);
        this.f55216h = kVar;
        kVar.Z(context);
        ColorStateList colorStateList = this.f55217i;
        if (colorStateList != null) {
            this.f55216h.o0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
        this.f55216h.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(@n0 View view, int i10) {
        if (this.A.isEmpty()) {
            return;
        }
        float fB = this.f55214f.b(i10);
        Iterator<k> it = this.A.iterator();
        while (it.hasNext()) {
            it.next().b(view, fB);
        }
    }

    private void a0(View view) {
        if (j1.J(view) == null) {
            j1.E1(view, view.getResources().getString(C));
        }
    }

    @n0
    public static <V extends View> SideSheetBehavior<V> c0(@n0 V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behaviorF = ((CoordinatorLayout.f) layoutParams).f();
        if (behaviorF instanceof SideSheetBehavior) {
            return (SideSheetBehavior) behaviorF;
        }
        throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
    }

    private int d0(int i10, int i11, int i12, int i13) {
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

    private int g0() {
        return 0;
    }

    private boolean t0(@n0 MotionEvent motionEvent) {
        return I0() && V((float) this.f55234z, motionEvent.getX()) > ((float) this.f55224p.E());
    }

    private boolean u0(@n0 V v10) {
        ViewParent parent = v10.getParent();
        return parent != null && parent.isLayoutRequested() && j1.O0(v10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean v0(int i10, View view, e0.a aVar) {
        c(i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(int i10) {
        V v10 = this.f55230v.get();
        if (v10 != null) {
            M0(v10, i10, false);
        }
    }

    private void x0(@n0 CoordinatorLayout coordinatorLayout) {
        int i10;
        View viewFindViewById;
        if (this.f55231w != null || (i10 = this.f55232x) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f55231w = new WeakReference<>(viewFindViewById);
    }

    private void z0(V v10, a0.a aVar, int i10) {
        j1.u1(v10, aVar, null, X(i10));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void B(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            super.B(coordinatorLayout, v10, savedState.getSuperState());
        }
        int i10 = savedState.f55235b;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f55222n = i10;
        this.f55223o = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @n0
    public Parcelable C(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10) {
        return new SavedState(super.C(coordinatorLayout, v10), (SideSheetBehavior<?>) this);
    }

    public void C0(@p0 View view) {
        this.f55232x = -1;
        if (view == null) {
            W();
            return;
        }
        this.f55231w = new WeakReference<>(view);
        WeakReference<V> weakReference = this.f55230v;
        if (weakReference != null) {
            V v10 = weakReference.get();
            if (j1.U0(v10)) {
                v10.requestLayout();
            }
        }
    }

    public void D0(@d0 int i10) {
        this.f55232x = i10;
        W();
        WeakReference<V> weakReference = this.f55230v;
        if (weakReference != null) {
            V v10 = weakReference.get();
            if (i10 == -1 || !j1.U0(v10)) {
                return;
            }
            v10.requestLayout();
        }
    }

    public void E0(boolean z10) {
        this.f55221m = z10;
    }

    public void F0(float f10) {
        this.f55226r = f10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean H(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f55222n == 1 && actionMasked == 0) {
            return true;
        }
        if (I0()) {
            this.f55224p.M(motionEvent);
        }
        if (actionMasked == 0) {
            A0();
        }
        if (this.f55233y == null) {
            this.f55233y = VelocityTracker.obtain();
        }
        this.f55233y.addMovement(motionEvent);
        if (I0() && actionMasked == 2 && !this.f55225q && t0(motionEvent)) {
            this.f55224p.d(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f55225q;
    }

    void H0(int i10) {
        V v10;
        if (this.f55222n == i10) {
            return;
        }
        this.f55222n = i10;
        if (i10 == 3 || i10 == 5) {
            this.f55223o = i10;
        }
        WeakReference<V> weakReference = this.f55230v;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        O0(v10);
        Iterator<k> it = this.A.iterator();
        while (it.hasNext()) {
            it.next().a(v10, i10);
        }
        N0();
    }

    boolean J0(@n0 View view, float f10) {
        return this.f55214f.i(view, f10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean L0() {
        return true;
    }

    @Override // com.google.android.material.sidesheet.b
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void a(@n0 k kVar) {
        this.A.add(kVar);
    }

    public void b0() {
        c(3);
    }

    @Override // com.google.android.material.sidesheet.b
    public void c(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference<V> weakReference = this.f55230v;
        if (weakReference == null || weakReference.get() == null) {
            H0(i10);
        } else {
            B0(this.f55230v.get(), new Runnable() { // from class: com.google.android.material.sidesheet.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55258b.w0(i10);
                }
            });
        }
    }

    int e0() {
        return this.f55227s;
    }

    @p0
    public View f0() {
        WeakReference<View> weakReference = this.f55231w;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.material.sidesheet.b
    public int getState() {
        return this.f55222n;
    }

    public int h0() {
        return this.f55214f.d();
    }

    public float i0() {
        return this.f55226r;
    }

    float j0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void k(@n0 CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f55230v = null;
        this.f55224p = null;
    }

    int k0() {
        return this.f55229u;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int l0() {
        return this.f55223o;
    }

    int m0(int i10) {
        if (i10 == 3) {
            return h0();
        }
        if (i10 == 5) {
            return this.f55214f.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void n() {
        super.n();
        this.f55230v = null;
        this.f55224p = null;
    }

    int n0() {
        return this.f55228t;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean o(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 MotionEvent motionEvent) {
        androidx.customview.widget.d dVar;
        if (!K0(v10)) {
            this.f55225q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            A0();
        }
        if (this.f55233y == null) {
            this.f55233y = VelocityTracker.obtain();
        }
        this.f55233y.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f55234z = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f55225q) {
            this.f55225q = false;
            return false;
        }
        return (this.f55225q || (dVar = this.f55224p) == null || !dVar.W(motionEvent)) ? false : true;
    }

    int o0() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean p(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, int i10) {
        if (j1.U(coordinatorLayout) && !j1.U(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.f55230v == null) {
            this.f55230v = new WeakReference<>(v10);
            com.google.android.material.shape.k kVar = this.f55216h;
            if (kVar != null) {
                j1.I1(v10, kVar);
                com.google.android.material.shape.k kVar2 = this.f55216h;
                float fR = this.f55220l;
                if (fR == -1.0f) {
                    fR = j1.R(v10);
                }
                kVar2.n0(fR);
            } else {
                ColorStateList colorStateList = this.f55217i;
                if (colorStateList != null) {
                    j1.J1(v10, colorStateList);
                }
            }
            O0(v10);
            N0();
            if (j1.V(v10) == 0) {
                j1.R1(v10, 1);
            }
            a0(v10);
        }
        if (this.f55224p == null) {
            this.f55224p = androidx.customview.widget.d.q(coordinatorLayout, this.B);
        }
        int iF = this.f55214f.f(v10);
        coordinatorLayout.K(v10, i10);
        this.f55228t = coordinatorLayout.getWidth();
        this.f55227s = v10.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        this.f55229u = marginLayoutParams != null ? this.f55214f.a(marginLayoutParams) : 0;
        j1.e1(v10, U(iF, v10));
        x0(coordinatorLayout);
        for (k kVar3 : this.A) {
            if (kVar3 instanceof k) {
                kVar3.c(v10);
            }
        }
        return true;
    }

    @p0
    androidx.customview.widget.d p0() {
        return this.f55224p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean q(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(d0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), d0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    float q0() {
        VelocityTracker velocityTracker = this.f55233y;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f55215g);
        return this.f55233y.getXVelocity();
    }

    public void r0() {
        c(5);
    }

    public boolean s0() {
        return this.f55221m;
    }

    @Override // com.google.android.material.sidesheet.b
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public void b(@n0 k kVar) {
        this.A.remove(kVar);
    }
}
