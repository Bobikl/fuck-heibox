package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.annotation.x;
import androidx.coordinatorlayout.R;
import androidx.core.util.j;
import androidx.core.util.n;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.v0;
import androidx.core.view.w0;
import androidx.core.view.y0;
import androidx.core.view.z0;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements v0, w0 {
    static final ThreadLocal<Map<String, Constructor<Behavior>>> A;
    static final int B = 0;
    static final int C = 1;
    static final int D = 2;
    static final Comparator<View> E;
    private static final n.a<Rect> F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final String f19773v = "CoordinatorLayout";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final String f19774w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f19775x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f19776y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final Class<?>[] f19777z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<View> f19778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a<View> f19779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<View> f19780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<View> f19781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f19782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f19783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f19784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19785i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19786j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f19787k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f19788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f19789m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private g f19790n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19791o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private n3 f19792p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f19793q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f19794r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f19795s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private z0 f19796t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final y0 f19797u;

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public static void I(@n0 View view, @p0 Object obj) {
            ((f) view.getLayoutParams()).f19818r = obj;
        }

        @p0
        public static Object h(@n0 View view) {
            return ((f) view.getLayoutParams()).f19818r;
        }

        public boolean A(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 Rect rect, boolean z10) {
            return false;
        }

        public void B(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 Parcelable parcelable) {
        }

        @p0
        public Parcelable C(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean D(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, @n0 View view2, int i10) {
            return false;
        }

        public boolean E(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, @n0 View view2, int i10, int i11) {
            if (i11 == 0) {
                return D(coordinatorLayout, v10, view, view2, i10);
            }
            return false;
        }

        @Deprecated
        public void F(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view) {
        }

        public void G(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, int i10) {
            if (i10 == 0) {
                F(coordinatorLayout, v10, view);
            }
        }

        public boolean H(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 MotionEvent motionEvent) {
            return false;
        }

        public boolean d(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10) {
            return g(coordinatorLayout, v10) > 0.0f;
        }

        public boolean e(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 Rect rect) {
            return false;
        }

        @l
        public int f(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10) {
            return j1.f21601t;
        }

        @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
        public float g(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10) {
            return 0.0f;
        }

        public boolean i(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view) {
            return false;
        }

        @n0
        public n3 j(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 n3 n3Var) {
            return n3Var;
        }

        public void k(@n0 f fVar) {
        }

        public boolean l(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view) {
            return false;
        }

        public void m(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view) {
        }

        public void n() {
        }

        public boolean o(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 MotionEvent motionEvent) {
            return false;
        }

        public boolean p(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, int i10) {
            return false;
        }

        public boolean q(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean r(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean s(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, float f10, float f11) {
            return false;
        }

        @Deprecated
        public void t(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, int i10, int i11, @n0 int[] iArr) {
        }

        public void u(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, int i10, int i11, @n0 int[] iArr, int i12) {
            if (i12 == 0) {
                t(coordinatorLayout, v10, view, i10, i11, iArr);
            }
        }

        @Deprecated
        public void v(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, int i10, int i11, int i12, int i13) {
        }

        @Deprecated
        public void w(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                v(coordinatorLayout, v10, view, i10, i11, i12, i13);
            }
        }

        public void x(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, int i10, int i11, int i12, int i13, int i14, @n0 int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            w(coordinatorLayout, v10, view, i10, i11, i12, i13, i14);
        }

        @Deprecated
        public void y(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, @n0 View view2, int i10) {
        }

        public void z(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, @n0 View view, @n0 View view2, int i10, int i11) {
            if (i11 == 0) {
                y(coordinatorLayout, v10, view, view2, i10);
            }
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        SparseArray<Parcelable> f19798b;

        public static final class a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f19798b = new SparseArray<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f19798b.append(iArr[i11], parcelableArray[i11]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f19798b;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f19798b.keyAt(i11);
                parcelableArr[i11] = this.f19798b.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    public class a implements z0 {
        a() {
        }

        @Override // androidx.core.view.z0
        public n3 a(View view, n3 n3Var) {
            return CoordinatorLayout.this.Z(n3Var);
        }
    }

    public interface b {
        @n0
        Behavior getBehavior();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface c {
        Class<? extends Behavior> value();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface d {
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f19795s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.J(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f19795s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Behavior f19801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f19802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19804d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19805e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f19806f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f19807g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f19808h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f19809i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f19810j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        View f19811k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        View f19812l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f19813m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f19814n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f19815o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f19816p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final Rect f19817q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f19818r;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f19802b = false;
            this.f19803c = 0;
            this.f19804d = 0;
            this.f19805e = -1;
            this.f19806f = -1;
            this.f19807g = 0;
            this.f19808h = 0;
            this.f19817q = new Rect();
        }

        f(@n0 Context context, @p0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f19802b = false;
            this.f19803c = 0;
            this.f19804d = 0;
            this.f19805e = -1;
            this.f19806f = -1;
            this.f19807g = 0;
            this.f19808h = 0;
            this.f19817q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f19768c);
            this.f19803c = typedArrayObtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f19806f = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f19804d = typedArrayObtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f19805e = typedArrayObtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f19807g = typedArrayObtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f19808h = typedArrayObtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i10 = R.styleable.CoordinatorLayout_Layout_layout_behavior;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i10);
            this.f19802b = zHasValue;
            if (zHasValue) {
                this.f19801a = CoordinatorLayout.M(context, attributeSet, typedArrayObtainStyledAttributes.getString(i10));
            }
            typedArrayObtainStyledAttributes.recycle();
            Behavior behavior = this.f19801a;
            if (behavior != null) {
                behavior.k(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f19802b = false;
            this.f19803c = 0;
            this.f19804d = 0;
            this.f19805e = -1;
            this.f19806f = -1;
            this.f19807g = 0;
            this.f19808h = 0;
            this.f19817q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f19802b = false;
            this.f19803c = 0;
            this.f19804d = 0;
            this.f19805e = -1;
            this.f19806f = -1;
            this.f19807g = 0;
            this.f19808h = 0;
            this.f19817q = new Rect();
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f19802b = false;
            this.f19803c = 0;
            this.f19804d = 0;
            this.f19805e = -1;
            this.f19806f = -1;
            this.f19807g = 0;
            this.f19808h = 0;
            this.f19817q = new Rect();
        }

        private void o(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f19806f);
            this.f19811k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f19812l = null;
                    this.f19811k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f19806f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f19812l = null;
                this.f19811k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f19812l = null;
                    this.f19811k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f19812l = viewFindViewById;
        }

        private boolean u(View view, int i10) {
            int iD = androidx.core.view.n.d(((f) view.getLayoutParams()).f19807g, i10);
            return iD != 0 && (androidx.core.view.n.d(this.f19808h, i10) & iD) == iD;
        }

        private boolean v(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f19811k.getId() != this.f19806f) {
                return false;
            }
            View view2 = this.f19811k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f19812l = null;
                    this.f19811k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f19812l = view2;
            return true;
        }

        boolean a() {
            return this.f19811k == null && this.f19806f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            Behavior behavior;
            return view2 == this.f19812l || u(view2, j1.Z(coordinatorLayout)) || ((behavior = this.f19801a) != null && behavior.i(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f19801a == null) {
                this.f19813m = false;
            }
            return this.f19813m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f19806f == -1) {
                this.f19812l = null;
                this.f19811k = null;
                return null;
            }
            if (this.f19811k == null || !v(view, coordinatorLayout)) {
                o(view, coordinatorLayout);
            }
            return this.f19811k;
        }

        @d0
        public int e() {
            return this.f19806f;
        }

        @p0
        public Behavior f() {
            return this.f19801a;
        }

        boolean g() {
            return this.f19816p;
        }

        Rect h() {
            return this.f19817q;
        }

        void i() {
            this.f19812l = null;
            this.f19811k = null;
        }

        boolean j(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f19813m;
            if (z10) {
                return true;
            }
            Behavior behavior = this.f19801a;
            boolean zD = (behavior != null ? behavior.d(coordinatorLayout, view) : false) | z10;
            this.f19813m = zD;
            return zD;
        }

        boolean k(int i10) {
            if (i10 == 0) {
                return this.f19814n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f19815o;
        }

        void l() {
            this.f19816p = false;
        }

        void m(int i10) {
            t(i10, false);
        }

        void n() {
            this.f19813m = false;
        }

        public void p(@d0 int i10) {
            i();
            this.f19806f = i10;
        }

        public void q(@p0 Behavior behavior) {
            Behavior behavior2 = this.f19801a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.n();
                }
                this.f19801a = behavior;
                this.f19818r = null;
                this.f19802b = true;
                if (behavior != null) {
                    behavior.k(this);
                }
            }
        }

        void r(boolean z10) {
            this.f19816p = z10;
        }

        void s(Rect rect) {
            this.f19817q.set(rect);
        }

        void t(int i10, boolean z10) {
            if (i10 == 0) {
                this.f19814n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f19815o = z10;
            }
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.J(0);
            return true;
        }
    }

    public static class h implements Comparator<View> {
        h() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fF0 = j1.F0(view);
            float fF1 = j1.F0(view2);
            if (fF0 > fF1) {
                return -1;
            }
            return fF0 < fF1 ? 1 : 0;
        }
    }

    static {
        Package r10 = CoordinatorLayout.class.getPackage();
        f19774w = r10 != null ? r10.getName() : null;
        E = new h();
        f19777z = new Class[]{Context.class, AttributeSet.class};
        A = new ThreadLocal<>();
        F = new n.c(12);
    }

    public CoordinatorLayout(@n0 Context context) {
        this(context, null);
    }

    public CoordinatorLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(@n0 Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        super(context, attributeSet, i10);
        this.f19778b = new ArrayList();
        this.f19779c = new androidx.coordinatorlayout.widget.a<>();
        this.f19780d = new ArrayList();
        this.f19781e = new ArrayList();
        this.f19783g = new int[2];
        this.f19784h = new int[2];
        this.f19797u = new y0(this);
        TypedArray typedArrayObtainStyledAttributes = i10 == 0 ? context.obtainStyledAttributes(attributeSet, R.styleable.f19767b, 0, R.style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, R.styleable.f19767b, i10, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, R.styleable.f19767b, attributeSet, typedArrayObtainStyledAttributes, 0, R.style.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, R.styleable.f19767b, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f19787k = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f19787k.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = this.f19787k;
                iArr[i11] = (int) (iArr[i11] * f10);
            }
        }
        this.f19794r = typedArrayObtainStyledAttributes.getDrawable(R.styleable.CoordinatorLayout_statusBarBackground);
        typedArrayObtainStyledAttributes.recycle();
        a0();
        super.setOnHierarchyChangeListener(new e());
        if (j1.V(this) == 0) {
            j1.R1(this, 1);
        }
    }

    private void A(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = E;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean B(View view) {
        return this.f19779c.j(view);
    }

    private void D(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect rectE = e();
        rectE.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f19792p != null && j1.U(this) && !j1.U(view)) {
            rectE.left += this.f19792p.p();
            rectE.top += this.f19792p.r();
            rectE.right -= this.f19792p.q();
            rectE.bottom -= this.f19792p.o();
        }
        Rect rectE2 = e();
        androidx.core.view.n.b(V(fVar.f19803c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectE, rectE2, i10);
        view.layout(rectE2.left, rectE2.top, rectE2.right, rectE2.bottom);
        R(rectE);
        R(rectE2);
    }

    private void E(View view, View view2, int i10) {
        Rect rectE = e();
        Rect rectE2 = e();
        try {
            u(view2, rectE);
            v(view, i10, rectE, rectE2);
            view.layout(rectE2.left, rectE2.top, rectE2.right, rectE2.bottom);
        } finally {
            R(rectE);
            R(rectE2);
        }
    }

    private void F(View view, int i10, int i11) {
        f fVar = (f) view.getLayoutParams();
        int iD = androidx.core.view.n.d(W(fVar.f19803c), i11);
        int i12 = iD & 7;
        int i13 = iD & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int iX = x(i10) - measuredWidth;
        int i14 = 0;
        if (i12 == 1) {
            iX += measuredWidth / 2;
        } else if (i12 == 5) {
            iX += measuredWidth;
        }
        if (i13 == 16) {
            i14 = 0 + (measuredHeight / 2);
        } else if (i13 == 80) {
            i14 = measuredHeight + 0;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iX, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void H(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (j1.U0(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            Behavior behaviorF = fVar.f();
            Rect rectE = e();
            Rect rectE2 = e();
            rectE2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (behaviorF == null || !behaviorF.e(this, view, rectE)) {
                rectE.set(rectE2);
            } else if (!rectE2.contains(rectE)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectE.toShortString() + " | Bounds:" + rectE2.toShortString());
            }
            R(rectE2);
            if (rectE.isEmpty()) {
                R(rectE);
                return;
            }
            int iD = androidx.core.view.n.d(fVar.f19808h, i10);
            boolean z12 = true;
            if ((iD & 48) != 48 || (i15 = (rectE.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f19810j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                Y(view, i16 - i15);
                z10 = true;
            }
            if ((iD & 80) == 80 && (height = ((getHeight() - rectE.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f19810j) < (i14 = rect.bottom)) {
                Y(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                Y(view, 0);
            }
            if ((iD & 3) != 3 || (i12 = (rectE.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f19809i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                X(view, i13 - i12);
                z11 = true;
            }
            if ((iD & 5) != 5 || (width = ((getWidth() - rectE.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f19809i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                X(view, width - i11);
            }
            if (!z12) {
                X(view, 0);
            }
            R(rectE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static Behavior M(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f19774w;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + lg.a.f131414g + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = A;
            Map<String, Constructor<Behavior>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<Behavior> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f19777z);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean N(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f19780d;
        A(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zO = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = list.get(i11);
            f fVar = (f) view.getLayoutParams();
            Behavior behaviorF = fVar.f();
            if (!(zO || z10) || actionMasked == 0) {
                if (!zO && behaviorF != null) {
                    if (i10 == 0) {
                        zO = behaviorF.o(this, view, motionEvent);
                    } else if (i10 == 1) {
                        zO = behaviorF.H(this, view, motionEvent);
                    }
                    if (zO) {
                        this.f19788l = view;
                    }
                }
                boolean zC = fVar.c();
                boolean zJ = fVar.j(this, view);
                z10 = zJ && !zC;
                if (zJ && !z10) {
                    break;
                }
            } else if (behaviorF != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    behaviorF.o(this, view, motionEventObtain);
                } else if (i10 == 1) {
                    behaviorF.H(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zO;
    }

    private void P() {
        this.f19778b.clear();
        this.f19779c.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVarZ = z(childAt);
            fVarZ.d(this, childAt);
            this.f19779c.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (fVarZ.b(this, childAt, childAt2)) {
                        if (!this.f19779c.d(childAt2)) {
                            this.f19779c.b(childAt2);
                        }
                        this.f19779c.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f19778b.addAll(this.f19779c.i());
        Collections.reverse(this.f19778b);
    }

    private static void R(@n0 Rect rect) {
        rect.setEmpty();
        F.b(rect);
    }

    private void T(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            Behavior behaviorF = ((f) childAt.getLayoutParams()).f();
            if (behaviorF != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    behaviorF.o(this, childAt, motionEventObtain);
                } else {
                    behaviorF.H(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).n();
        }
        this.f19788l = null;
        this.f19785i = false;
    }

    private static int U(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int V(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= androidx.core.view.n.f21701b;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    private static int W(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void X(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f19809i;
        if (i11 != i10) {
            j1.e1(view, i10 - i11);
            fVar.f19809i = i10;
        }
    }

    private void Y(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f19810j;
        if (i11 != i10) {
            j1.f1(view, i10 - i11);
            fVar.f19810j = i10;
        }
    }

    private void a0() {
        if (!j1.U(this)) {
            j1.a2(this, null);
            return;
        }
        if (this.f19796t == null) {
            this.f19796t = new a();
        }
        j1.a2(this, this.f19796t);
        setSystemUiVisibility(1280);
    }

    @n0
    private static Rect e() {
        Rect rectA = F.a();
        return rectA == null ? new Rect() : rectA;
    }

    private static int g(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    private void h(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    private n3 i(n3 n3Var) {
        Behavior behaviorF;
        if (n3Var.A()) {
            return n3Var;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (j1.U(childAt) && (behaviorF = ((f) childAt.getLayoutParams()).f()) != null) {
                n3Var = behaviorF.j(this, childAt, n3Var);
                if (n3Var.A()) {
                    break;
                }
            }
        }
        return n3Var;
    }

    private void w(View view, int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int iWidth;
        int iHeight;
        int iD = androidx.core.view.n.d(U(fVar.f19803c), i10);
        int iD2 = androidx.core.view.n.d(V(fVar.f19804d), i10);
        int i13 = iD & 7;
        int i14 = iD & 112;
        int i15 = iD2 & 7;
        int i16 = iD2 & 112;
        if (i15 != 1) {
            iWidth = i15 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i16 != 16) {
            iHeight = i16 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i13 == 1) {
            iWidth -= i11 / 2;
        } else if (i13 != 5) {
            iWidth -= i11;
        }
        if (i14 == 16) {
            iHeight -= i12 / 2;
        } else if (i14 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    private int x(int i10) {
        int[] iArr = this.f19787k;
        if (iArr == null) {
            Log.e(f19773v, "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e(f19773v, "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    public boolean C(@n0 View view, int i10, int i11) {
        Rect rectE = e();
        u(view, rectE);
        try {
            return rectE.contains(i10, i11);
        } finally {
            R(rectE);
        }
    }

    @Override // androidx.core.view.v0
    public void G(View view, int i10, int i11, int i12, int i13, int i14) {
        h0(view, i10, i11, i12, i13, 0, this.f19784h);
    }

    void I(View view, int i10) {
        Behavior behaviorF;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f19811k != null) {
            Rect rectE = e();
            Rect rectE2 = e();
            Rect rectE3 = e();
            u(fVar.f19811k, rectE);
            r(view, false, rectE2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            w(view, i10, rectE, rectE3, fVar, measuredWidth, measuredHeight);
            boolean z10 = (rectE3.left == rectE2.left && rectE3.top == rectE2.top) ? false : true;
            h(fVar, rectE3, measuredWidth, measuredHeight);
            int i11 = rectE3.left - rectE2.left;
            int i12 = rectE3.top - rectE2.top;
            if (i11 != 0) {
                j1.e1(view, i11);
            }
            if (i12 != 0) {
                j1.f1(view, i12);
            }
            if (z10 && (behaviorF = fVar.f()) != null) {
                behaviorF.l(this, view, fVar.f19811k);
            }
            R(rectE);
            R(rectE2);
            R(rectE3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    final void J(int i10) {
        int i11;
        Behavior behaviorF;
        boolean zL;
        int iZ = j1.Z(this);
        int size = this.f19778b.size();
        Rect rectE = e();
        Rect rectE2 = e();
        Rect rectE3 = e();
        for (int i12 = 0; i12 < size; i12++) {
            View view = this.f19778b.get(i12);
            f fVar = (f) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (fVar.f19812l == this.f19778b.get(i13)) {
                        I(view, iZ);
                    }
                }
                r(view, true, rectE2);
                if (fVar.f19807g != 0 && !rectE2.isEmpty()) {
                    int iD = androidx.core.view.n.d(fVar.f19807g, iZ);
                    int i14 = iD & 112;
                    if (i14 == 48) {
                        rectE.top = Math.max(rectE.top, rectE2.bottom);
                    } else if (i14 == 80) {
                        rectE.bottom = Math.max(rectE.bottom, getHeight() - rectE2.top);
                    }
                    int i15 = iD & 7;
                    if (i15 == 3) {
                        rectE.left = Math.max(rectE.left, rectE2.right);
                    } else if (i15 == 5) {
                        rectE.right = Math.max(rectE.right, getWidth() - rectE2.left);
                    }
                }
                if (fVar.f19808h != 0 && view.getVisibility() == 0) {
                    H(view, rectE, iZ);
                }
                if (i10 != 2) {
                    y(view, rectE3);
                    if (!rectE3.equals(rectE2)) {
                        Q(view, rectE2);
                        for (i11 = i12 + 1; i11 < size; i11++) {
                            View view2 = this.f19778b.get(i11);
                            f fVar2 = (f) view2.getLayoutParams();
                            behaviorF = fVar2.f();
                            if (behaviorF == null && behaviorF.i(this, view2, view)) {
                                if (i10 == 0 && fVar2.g()) {
                                    fVar2.l();
                                } else {
                                    if (i10 != 2) {
                                        zL = behaviorF.l(this, view2, view);
                                    } else {
                                        behaviorF.m(this, view2, view);
                                        zL = true;
                                    }
                                    if (i10 == 1) {
                                        fVar2.r(zL);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i11 < size) {
                        View view3 = this.f19778b.get(i11);
                        f fVar3 = (f) view3.getLayoutParams();
                        behaviorF = fVar3.f();
                        if (behaviorF == null) {
                        }
                    }
                }
            }
        }
        R(rectE);
        R(rectE2);
        R(rectE3);
    }

    public void K(@n0 View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f19811k;
        if (view2 != null) {
            E(view, view2, i10);
            return;
        }
        int i11 = fVar.f19805e;
        if (i11 >= 0) {
            F(view, i11, i10);
        } else {
            D(view, i10);
        }
    }

    public void L(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override // androidx.core.view.v0
    public void O(View view, int i10, int i11, int[] iArr, int i12) {
        Behavior behaviorF;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.k(i12) && (behaviorF = fVar.f()) != null) {
                    int[] iArr2 = this.f19783g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behaviorF.u(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f19783g;
                    iMax = i10 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f19783g;
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            J(1);
        }
    }

    void Q(View view, Rect rect) {
        ((f) view.getLayoutParams()).s(rect);
    }

    void S() {
        if (this.f19786j && this.f19790n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f19790n);
        }
        this.f19791o = false;
    }

    final n3 Z(n3 n3Var) {
        if (j.a(this.f19792p, n3Var)) {
            return n3Var;
        }
        this.f19792p = n3Var;
        boolean z10 = n3Var != null && n3Var.r() > 0;
        this.f19793q = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        n3 n3VarI = i(n3Var);
        requestLayout();
        return n3VarI;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        Behavior behavior = fVar.f19801a;
        if (behavior != null) {
            float fG = behavior.g(this, view);
            if (fG > 0.0f) {
                if (this.f19782f == null) {
                    this.f19782f = new Paint();
                }
                this.f19782f.setColor(fVar.f19801a.f(this, view));
                this.f19782f.setAlpha(g(Math.round(fG * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f19782f);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f19794r;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    void f() {
        if (this.f19786j) {
            if (this.f19790n == null) {
                this.f19790n = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f19790n);
        }
        this.f19791o = true;
    }

    @androidx.annotation.j1
    final List<View> getDependencySortedChildren() {
        P();
        return Collections.unmodifiableList(this.f19778b);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final n3 getLastWindowInsets() {
        return this.f19792p;
    }

    @Override // android.view.ViewGroup, androidx.core.view.x0
    public int getNestedScrollAxes() {
        return this.f19797u.a();
    }

    @p0
    public Drawable getStatusBarBackground() {
        return this.f19794r;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // androidx.core.view.w0
    public void h0(@n0 View view, int i10, int i11, int i12, int i13, int i14, @n0 int[] iArr) {
        Behavior behaviorF;
        boolean z10;
        int iMin;
        int childCount = getChildCount();
        boolean z11 = false;
        int iMax = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.k(i14) && (behaviorF = fVar.f()) != null) {
                    int[] iArr2 = this.f19783g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behaviorF.x(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f19783g;
                    iMax = i12 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i13 > 0) {
                        z10 = true;
                        iMin = Math.max(i15, this.f19783g[1]);
                    } else {
                        z10 = true;
                        iMin = Math.min(i15, this.f19783g[1]);
                    }
                    i15 = iMin;
                    z11 = z10;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i15;
        if (z11) {
            J(1);
        }
    }

    @Override // androidx.core.view.v0
    public void j(View view, View view2, int i10, int i11) {
        Behavior behaviorF;
        this.f19797u.c(view, view2, i10, i11);
        this.f19789m = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.k(i11) && (behaviorF = fVar.f()) != null) {
                behaviorF.z(this, childAt, view, view2, i10, i11);
            }
        }
    }

    @Override // androidx.core.view.v0
    public boolean j0(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                Behavior behaviorF = fVar.f();
                if (behaviorF != null) {
                    boolean zE = behaviorF.E(this, childAt, view, view2, i10, i11);
                    z10 |= zE;
                    fVar.t(i11, zE);
                } else {
                    fVar.t(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // androidx.core.view.v0
    public void k(View view, int i10) {
        this.f19797u.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.k(i10)) {
                Behavior behaviorF = fVar.f();
                if (behaviorF != null) {
                    behaviorF.G(this, childAt, view, i10);
                }
                fVar.m(i10);
                fVar.l();
            }
        }
        this.f19789m = null;
    }

    public void l(@n0 View view) {
        List listG = this.f19779c.g(view);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < listG.size(); i10++) {
            View view2 = (View) listG.get(i10);
            Behavior behaviorF = ((f) view2.getLayoutParams()).f();
            if (behaviorF != null) {
                behaviorF.l(this, view2, view);
            }
        }
    }

    public boolean m(@n0 View view, @n0 View view2) {
        boolean z10 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectE = e();
        r(view, view.getParent() != this, rectE);
        Rect rectE2 = e();
        r(view2, view2.getParent() != this, rectE2);
        try {
            if (rectE.left <= rectE2.right && rectE.top <= rectE2.bottom && rectE.right >= rectE2.left && rectE.bottom >= rectE2.top) {
                z10 = true;
            }
            return z10;
        } finally {
            R(rectE);
            R(rectE2);
        }
    }

    void n() {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (B(getChildAt(i10))) {
                z10 = true;
                break;
            }
        }
        if (z10 != this.f19791o) {
            if (z10) {
                f();
            } else {
                S();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T(false);
        if (this.f19791o) {
            if (this.f19790n == null) {
                this.f19790n = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f19790n);
        }
        if (this.f19792p == null && j1.U(this)) {
            j1.v1(this);
        }
        this.f19786j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        T(false);
        if (this.f19791o && this.f19790n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f19790n);
        }
        View view = this.f19789m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f19786j = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f19793q || this.f19794r == null) {
            return;
        }
        n3 n3Var = this.f19792p;
        int iR = n3Var != null ? n3Var.r() : 0;
        if (iR > 0) {
            this.f19794r.setBounds(0, 0, getWidth(), iR);
            this.f19794r.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            T(true);
        }
        boolean zN = N(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            T(true);
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Behavior behaviorF;
        int iZ = j1.Z(this);
        int size = this.f19778b.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f19778b.get(i14);
            if (view.getVisibility() != 8 && ((behaviorF = ((f) view.getLayoutParams()).f()) == null || !behaviorF.p(this, view, iZ))) {
                K(view, iZ);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:45:0x011d  */
    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        Behavior behaviorF;
        f fVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        P();
        n();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int iZ = j1.Z(this);
        boolean z10 = iZ == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i19 = paddingLeft + paddingRight;
        int i20 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z11 = this.f19792p != null && j1.U(this);
        int size3 = this.f19778b.size();
        int i21 = suggestedMinimumWidth;
        int i22 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i23 = 0;
        while (i23 < size3) {
            View view = this.f19778b.get(i23);
            if (view.getVisibility() == 8) {
                i17 = i23;
                i14 = size3;
                i15 = paddingLeft;
            } else {
                f fVar2 = (f) view.getLayoutParams();
                int i24 = fVar2.f19805e;
                if (i24 < 0 || mode == 0) {
                    i12 = iCombineMeasuredStates;
                } else {
                    int iX = x(i24);
                    int iD = androidx.core.view.n.d(W(fVar2.f19803c), iZ) & 7;
                    i12 = iCombineMeasuredStates;
                    if ((iD == 3 && !z10) || (iD == 5 && z10)) {
                        iMax = Math.max(0, (size - paddingRight) - iX);
                    } else if ((iD == 5 && !z10) || (iD == 3 && z10)) {
                        iMax = Math.max(0, iX - paddingLeft);
                    }
                    if (z11 || j1.U(view)) {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        int iP = this.f19792p.p() + this.f19792p.q();
                        int iR = this.f19792p.r() + this.f19792p.o();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iP, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iR, mode2);
                    }
                    behaviorF = fVar2.f();
                    if (behaviorF != null) {
                        fVar = fVar2;
                        i16 = i12;
                        i17 = i23;
                        i13 = i22;
                        i15 = paddingLeft;
                        i18 = i21;
                        i14 = size3;
                        if (!behaviorF.q(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                        }
                        f fVar3 = fVar;
                        int iMax2 = Math.max(i18, i19 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin + ((ViewGroup.MarginLayoutParams) fVar3).rightMargin);
                        int iMax3 = Math.max(i13, i20 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin + ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i16, view.getMeasuredState());
                        i21 = iMax2;
                        i22 = iMax3;
                    } else {
                        fVar = fVar2;
                        i13 = i22;
                        i14 = size3;
                        i15 = paddingLeft;
                        i16 = i12;
                        i17 = i23;
                        i18 = i21;
                    }
                    L(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    f fVar4 = fVar;
                    int iMax4 = Math.max(i18, i19 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin + ((ViewGroup.MarginLayoutParams) fVar4).rightMargin);
                    int iMax5 = Math.max(i13, i20 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin + ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i16, view.getMeasuredState());
                    i21 = iMax4;
                    i22 = iMax5;
                }
                iMax = 0;
                if (z11) {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                } else {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                }
                behaviorF = fVar2.f();
                if (behaviorF != null) {
                    fVar = fVar2;
                    i16 = i12;
                    i17 = i23;
                    i13 = i22;
                    i15 = paddingLeft;
                    i18 = i21;
                    i14 = size3;
                    if (!behaviorF.q(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                    }
                    f fVar5 = fVar;
                    int iMax6 = Math.max(i18, i19 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar5).leftMargin + ((ViewGroup.MarginLayoutParams) fVar5).rightMargin);
                    int iMax7 = Math.max(i13, i20 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar5).topMargin + ((ViewGroup.MarginLayoutParams) fVar5).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i16, view.getMeasuredState());
                    i21 = iMax6;
                    i22 = iMax7;
                } else {
                    fVar = fVar2;
                    i13 = i22;
                    i14 = size3;
                    i15 = paddingLeft;
                    i16 = i12;
                    i17 = i23;
                    i18 = i21;
                }
                L(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                f fVar6 = fVar;
                int iMax8 = Math.max(i18, i19 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar6).leftMargin + ((ViewGroup.MarginLayoutParams) fVar6).rightMargin);
                int iMax9 = Math.max(i13, i20 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar6).topMargin + ((ViewGroup.MarginLayoutParams) fVar6).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i16, view.getMeasuredState());
                i21 = iMax8;
                i22 = iMax9;
            }
            i23 = i17 + 1;
            paddingLeft = i15;
            size3 = i14;
        }
        int i25 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i21, i10, (-16777216) & i25), View.resolveSizeAndState(i22, i11, i25 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        Behavior behaviorF;
        int childCount = getChildCount();
        boolean zR = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.k(0) && (behaviorF = fVar.f()) != null) {
                    zR |= behaviorF.r(this, childAt, view, f10, f11, z10);
                }
            }
        }
        if (zR) {
            J(1);
        }
        return zR;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedPreFling(View view, float f10, float f11) {
        Behavior behaviorF;
        int childCount = getChildCount();
        boolean zS = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.k(0) && (behaviorF = fVar.f()) != null) {
                    zS |= behaviorF.s(this, childAt, view, f10, f11);
                }
            }
        }
        return zS;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        O(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        G(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        j(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.f19798b;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            Behavior behaviorF = z(childAt).f();
            if (id2 != -1 && behaviorF != null && (parcelable2 = sparseArray.get(id2)) != null) {
                behaviorF.B(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableC;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            Behavior behaviorF = ((f) childAt.getLayoutParams()).f();
            if (id2 != -1 && behaviorF != null && (parcelableC = behaviorF.C(this, childAt)) != null) {
                sparseArray.append(id2, parcelableC);
            }
        }
        savedState.f19798b = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return j0(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onStopNestedScroll(View view) {
        k(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r3
  0x002b: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zN;
        boolean zH;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f19788l == null) {
            zN = N(motionEvent, 1);
            if (!zN) {
                zH = false;
            }
            motionEventObtain = null;
            if (this.f19788l == null) {
                zH |= super.onTouchEvent(motionEvent);
            } else if (zN) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                T(false);
            }
            return zH;
        }
        zN = false;
        Behavior behaviorF = ((f) this.f19788l.getLayoutParams()).f();
        if (behaviorF != null) {
            zH = behaviorF.H(this, this.f19788l, motionEvent);
        } else {
            zH = false;
        }
        motionEventObtain = null;
        if (this.f19788l == null) {
            zH |= super.onTouchEvent(motionEvent);
        } else if (zN) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            T(false);
        } else {
            T(false);
        }
        return zH;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    void r(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            u(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        Behavior behaviorF = ((f) view.getLayoutParams()).f();
        if (behaviorF == null || !behaviorF.A(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f19785i) {
            return;
        }
        T(false);
        this.f19785i = true;
    }

    @n0
    public List<View> s(@n0 View view) {
        List<View> listH = this.f19779c.h(view);
        this.f19781e.clear();
        if (listH != null) {
            this.f19781e.addAll(listH);
        }
        return this.f19781e;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        a0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f19795s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@p0 Drawable drawable) {
        Drawable drawable2 = this.f19794r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f19794r = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f19794r.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.d.m(this.f19794r, j1.Z(this));
                this.f19794r.setVisible(getVisibility() == 0, false);
                this.f19794r.setCallback(this);
            }
            j1.n1(this);
        }
    }

    public void setStatusBarBackgroundColor(@l int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(@v int i10) {
        setStatusBarBackground(i10 != 0 ? androidx.core.content.d.i(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f19794r;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f19794r.setVisible(z10, false);
    }

    @n0
    public List<View> t(@n0 View view) {
        List listG = this.f19779c.g(view);
        this.f19781e.clear();
        if (listG != null) {
            this.f19781e.addAll(listG);
        }
        return this.f19781e;
    }

    void u(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void v(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        w(view, i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        h(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f19794r;
    }

    void y(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    f z(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f19802b) {
            if (view instanceof b) {
                Behavior behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e(f19773v, "Attached behavior class is null");
                }
                fVar.q(behavior);
                fVar.f19802b = true;
            } else {
                c cVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    cVar = (c) superclass.getAnnotation(c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        fVar.q(cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        Log.e(f19773v, "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
                fVar.f19802b = true;
            }
        }
        return fVar;
    }
}
