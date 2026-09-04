package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.core.graphics.h0;
import androidx.core.view.accessibility.a0;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.customview.view.AbsSavedState;
import androidx.transition.ChangeBounds;
import androidx.transition.v;
import androidx.window.sidecar.m;
import androidx.window.sidecar.r;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class SlidingPaneLayout extends ViewGroup implements androidx.customview.widget.c {
    private static final String C = "SlidingPaneLayout";
    private static final int D = 400;
    private static final String E = "androidx.slidingpanelayout.widget.SlidingPaneLayout";
    public static final int F = 0;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 3;
    private static boolean J;
    private Field A;
    private boolean B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f27419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f27420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    View f27422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f27423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f27424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f27425j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f27426k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27427l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f27428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f27429n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<e> f27430o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private e f27431p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final androidx.customview.widget.d f27432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f27433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f27434s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f27435t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final ArrayList<c> f27436u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f27437v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    m f27438w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private FoldingFeatureObserver.a f27439x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private FoldingFeatureObserver f27440y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Method f27441z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int[] f27442e = {R.attr.layout_weight};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f27443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f27444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f27445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f27446d;

        public LayoutParams() {
            super(-1, -1);
            this.f27443a = 0.0f;
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f27443a = 0.0f;
        }

        public LayoutParams(@n0 Context context, @p0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f27443a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f27442e);
            this.f27443a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(@n0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f27443a = 0.0f;
        }

        public LayoutParams(@n0 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f27443a = 0.0f;
        }

        public LayoutParams(@n0 LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f27443a = 0.0f;
            this.f27443a = layoutParams.f27443a;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f27447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27448c;

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
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f27447b = parcel.readInt() != 0;
            this.f27448c = parcel.readInt();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f27447b ? 1 : 0);
            parcel.writeInt(this.f27448c);
        }
    }

    public static class TouchBlocker extends FrameLayout {
        TouchBlocker(View view) {
            super(view.getContext());
            addView(view);
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    public class a implements FoldingFeatureObserver.a {
        a() {
        }

        @Override // androidx.slidingpanelayout.widget.FoldingFeatureObserver.a
        public void a(@n0 m mVar) {
            SlidingPaneLayout.this.f27438w = mVar;
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.w0(300L);
            changeBounds.y0(androidx.core.view.animation.b.b(0.2f, 0.0f, 0.0f, 1.0f));
            v.b(SlidingPaneLayout.this, changeBounds);
            SlidingPaneLayout.this.requestLayout();
        }
    }

    public class b extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f27450a = new Rect();

        b() {
        }

        private void a(a0 a0Var, a0 a0Var2) {
            Rect rect = this.f27450a;
            a0Var2.t(rect);
            a0Var.X0(rect);
            a0Var.e2(a0Var2.G0());
            a0Var.D1(a0Var2.P());
            a0Var.b1(a0Var2.w());
            a0Var.f1(a0Var2.A());
            a0Var.l1(a0Var2.s0());
            a0Var.c1(a0Var2.n0());
            a0Var.n1(a0Var2.t0());
            a0Var.o1(a0Var2.u0());
            a0Var.T0(a0Var2.k0());
            a0Var.N1(a0Var2.C0());
            a0Var.y1(a0Var2.x0());
            a0Var.a(a0Var2.p());
            a0Var.B1(a0Var2.N());
        }

        public boolean b(View view) {
            return SlidingPaneLayout.this.m(view);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.E);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, a0 a0Var) {
            a0 a0VarK0 = a0.K0(a0Var);
            super.onInitializeAccessibilityNodeInfo(view, a0VarK0);
            a(a0Var, a0VarK0);
            a0VarK0.N0();
            a0Var.b1(SlidingPaneLayout.E);
            a0Var.P1(view);
            Object objL0 = j1.l0(view);
            if (objL0 instanceof View) {
                a0Var.F1((View) objL0);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i10);
                if (!b(childAt) && childAt.getVisibility() == 0) {
                    j1.R1(childAt, 1);
                    a0Var.c(childAt);
                }
            }
        }

        @Override // androidx.core.view.a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (b(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final View f27452b;

        c(View view) {
            this.f27452b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f27452b.getParent() == SlidingPaneLayout.this) {
                this.f27452b.setLayerType(0, null);
                SlidingPaneLayout.this.l(this.f27452b);
            }
            SlidingPaneLayout.this.f27436u.remove(this);
        }
    }

    public class d extends androidx.customview.widget.d.c {
        d() {
        }

        private boolean n() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f27426k || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (SlidingPaneLayout.this.isOpen() && SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            return SlidingPaneLayout.this.isOpen() || SlidingPaneLayout.this.getLockMode() != 2;
        }

        @Override // androidx.customview.widget.d.c
        public int a(View view, int i10, int i11) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f27422g.getLayoutParams();
            if (SlidingPaneLayout.this.n()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + SlidingPaneLayout.this.f27422g.getWidth());
                return Math.max(Math.min(i10, width), width - SlidingPaneLayout.this.f27425j);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i10, paddingLeft), SlidingPaneLayout.this.f27425j + paddingLeft);
        }

        @Override // androidx.customview.widget.d.c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public int d(View view) {
            return SlidingPaneLayout.this.f27425j;
        }

        @Override // androidx.customview.widget.d.c
        public void f(int i10, int i11) {
            if (n()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f27432q.d(slidingPaneLayout.f27422g, i11);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void h(int i10, int i11) {
            if (n()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f27432q.d(slidingPaneLayout.f27422g, i11);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void i(View view, int i10) {
            SlidingPaneLayout.this.v();
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i10) {
            if (SlidingPaneLayout.this.f27432q.F() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f27423h != 1.0f) {
                    slidingPaneLayout.g(slidingPaneLayout.f27422g);
                    SlidingPaneLayout.this.f27433r = true;
                } else {
                    slidingPaneLayout.A(slidingPaneLayout.f27422g);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.f(slidingPaneLayout2.f27422g);
                    SlidingPaneLayout.this.f27433r = false;
                }
            }
        }

        @Override // androidx.customview.widget.d.c
        public void k(View view, int i10, int i11, int i12, int i13) {
            SlidingPaneLayout.this.q(i10);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public void l(View view, float f10, float f11) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.n()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f10 < 0.0f || (f10 == 0.0f && SlidingPaneLayout.this.f27423h > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f27425j;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f27422g.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f10 > 0.0f || (f10 == 0.0f && SlidingPaneLayout.this.f27423h > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f27425j;
                }
            }
            SlidingPaneLayout.this.f27432q.V(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(View view, int i10) {
            if (n()) {
                return ((LayoutParams) view.getLayoutParams()).f27444b;
            }
            return false;
        }
    }

    public interface e {
        void a(@n0 View view);

        void b(@n0 View view);

        void c(@n0 View view, float f10);
    }

    public static class f implements e {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void a(@n0 View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void b(@n0 View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void c(@n0 View view, float f10) {
        }
    }

    static {
        J = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(@n0 Context context) {
        this(context, null);
    }

    public SlidingPaneLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27417b = 0;
        this.f27423h = 1.0f;
        this.f27430o = new CopyOnWriteArrayList();
        this.f27434s = true;
        this.f27435t = new Rect();
        this.f27436u = new ArrayList<>();
        this.f27439x = new a();
        float f10 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        j1.B1(this, new b());
        j1.R1(this, 1);
        androidx.customview.widget.d dVarP = androidx.customview.widget.d.p(this, 0.5f, new d());
        this.f27432q = dVarP;
        dVarP.U(f10 * 400.0f);
        setFoldingFeatureObserver(new FoldingFeatureObserver(r.a(context), androidx.core.content.d.l(context)));
    }

    private static boolean B(View view) {
        return view.isOpaque();
    }

    private boolean e(int i10) {
        if (!this.f27421f) {
            this.f27433r = false;
        }
        if (!this.f27434s && !y(1.0f, i10)) {
            return false;
        }
        this.f27433r = false;
        return true;
    }

    private h0 getSystemGestureInsets() {
        n3 n3VarO0;
        if (!J || (n3VarO0 = j1.o0(this)) == null) {
            return null;
        }
        return n3VarO0.n();
    }

    @p0
    private static Activity i(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private static Rect j(@n0 m mVar, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        Rect rect = new Rect(i10, iArr[1], view.getWidth() + i10, iArr[1] + view.getWidth());
        Rect rect2 = new Rect(mVar.getBounds());
        boolean zIntersect = rect2.intersect(rect);
        if ((rect2.width() == 0 && rect2.height() == 0) || !zIntersect) {
            return null;
        }
        rect2.offset(-iArr[0], -iArr[1]);
        return rect2;
    }

    private static int k(View view) {
        return view instanceof TouchBlocker ? j1.f0(((TouchBlocker) view).getChildAt(0)) : j1.f0(view);
    }

    private static int p(@n0 View view, int i10, int i11) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return ((ViewGroup.MarginLayoutParams) layoutParams).width == 0 && (layoutParams.f27443a > 0.0f ? 1 : (layoutParams.f27443a == 0.0f ? 0 : -1)) > 0 ? ViewGroup.getChildMeasureSpec(i10, i11, ((ViewGroup.MarginLayoutParams) layoutParams).height) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824);
    }

    private boolean s(int i10) {
        if (!this.f27421f) {
            this.f27433r = true;
        }
        if (!this.f27434s && !y(0.0f, i10)) {
            return false;
        }
        this.f27433r = true;
        return true;
    }

    private void setFoldingFeatureObserver(FoldingFeatureObserver foldingFeatureObserver) {
        this.f27440y = foldingFeatureObserver;
        foldingFeatureObserver.f(this.f27439x);
    }

    private void t(float f10) {
        boolean zN = n();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.f27422g) {
                float f11 = 1.0f - this.f27424i;
                int i11 = this.f27427l;
                this.f27424i = f10;
                int i12 = ((int) (f11 * i11)) - ((int) ((1.0f - f10) * i11));
                if (zN) {
                    i12 = -i12;
                }
                childAt.offsetLeftAndRight(i12);
            }
        }
    }

    private ArrayList<Rect> z() {
        Rect rectJ;
        m mVar = this.f27438w;
        if (mVar == null || !mVar.a() || this.f27438w.getBounds().left == 0 || this.f27438w.getBounds().top != 0 || (rectJ = j(this.f27438w, this)) == null) {
            return null;
        }
        Rect rect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rectJ.left), getHeight() - getPaddingBottom());
        int width = getWidth() - getPaddingRight();
        return new ArrayList<>(Arrays.asList(rect, new Rect(Math.min(width, rectJ.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
    }

    void A(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        View view2 = view;
        boolean zN = n();
        int width = zN ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zN ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !B(view)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount && (childAt = getChildAt(i10)) != view2) {
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zN ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zN ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i10++;
            view2 = view;
            zN = zN;
        }
    }

    public void a(@n0 e eVar) {
        this.f27430o.add(eVar);
    }

    @Override // android.view.ViewGroup
    public void addView(@n0 View view, int i10, @p0 ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new TouchBlocker(view), i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    protected boolean b(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && b(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z10) {
            if (view.canScrollHorizontally(n() ? i10 : -i10)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean c() {
        return this.f27421f;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.c
    public void close() {
        d();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f27432q.o(true)) {
            if (this.f27421f) {
                j1.n1(this);
            } else {
                this.f27432q.a();
            }
        }
    }

    public boolean d() {
        return e(0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int right;
        super.draw(canvas);
        Drawable drawable = n() ? this.f27420e : this.f27419d;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (n()) {
            right = childAt.getRight();
            i10 = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i11 = left - intrinsicWidth;
            i10 = left;
            right = i11;
        }
        drawable.setBounds(right, top, i10, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        if (n() ^ isOpen()) {
            this.f27432q.T(1);
            h0 systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                androidx.customview.widget.d dVar = this.f27432q;
                dVar.S(Math.max(dVar.A(), systemGestureInsets.f20742a));
            }
        } else {
            this.f27432q.T(2);
            h0 systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                androidx.customview.widget.d dVar2 = this.f27432q;
                dVar2.S(Math.max(dVar2.A(), systemGestureInsets2.f20744c));
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f27421f && !layoutParams.f27444b && this.f27422g != null) {
            canvas.getClipBounds(this.f27435t);
            if (n()) {
                Rect rect = this.f27435t;
                rect.left = Math.max(rect.left, this.f27422g.getRight());
            } else {
                Rect rect2 = this.f27435t;
                rect2.right = Math.min(rect2.right, this.f27422g.getLeft());
            }
            canvas.clipRect(this.f27435t);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    void f(@n0 View view) {
        Iterator<e> it = this.f27430o.iterator();
        while (it.hasNext()) {
            it.next().b(view);
        }
        sendAccessibilityEvent(32);
    }

    void g(@n0 View view) {
        Iterator<e> it = this.f27430o.iterator();
        while (it.hasNext()) {
            it.next().a(view);
        }
        sendAccessibilityEvent(32);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @l
    @Deprecated
    public int getCoveredFadeColor() {
        return this.f27418c;
    }

    public final int getLockMode() {
        return this.f27437v;
    }

    @t0
    public int getParallaxDistance() {
        return this.f27427l;
    }

    @l
    @Deprecated
    public int getSliderFadeColor() {
        return this.f27417b;
    }

    void h(@n0 View view) {
        Iterator<e> it = this.f27430o.iterator();
        while (it.hasNext()) {
            it.next().c(view, this.f27423h);
        }
    }

    @Override // androidx.customview.widget.c
    public boolean isOpen() {
        return !this.f27421f || this.f27423h == 0.0f;
    }

    void l(View view) {
        j1.V1(view, ((LayoutParams) view.getLayoutParams()).f27446d);
    }

    boolean m(View view) {
        if (view == null) {
            return false;
        }
        return this.f27421f && ((LayoutParams) view.getLayoutParams()).f27445c && this.f27423h > 0.0f;
    }

    boolean n() {
        return j1.Z(this) == 1;
    }

    public boolean o() {
        return this.f27421f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Activity activityI;
        super.onAttachedToWindow();
        this.f27434s = true;
        if (this.f27440y == null || (activityI = i(getContext())) == null) {
            return;
        }
        this.f27440y.e(activityI);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27434s = true;
        FoldingFeatureObserver foldingFeatureObserver = this.f27440y;
        if (foldingFeatureObserver != null) {
            foldingFeatureObserver.g();
        }
        int size = this.f27436u.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f27436u.get(i10).run();
        }
        this.f27436u.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f27421f && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f27433r = this.f27432q.L(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f27421f || (this.f27426k && actionMasked != 0)) {
            this.f27432q.c();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.f27432q.c();
            return false;
        }
        if (actionMasked == 0) {
            this.f27426k = false;
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f27428m = x10;
            this.f27429n = y10;
            if (this.f27432q.L(this.f27422g, (int) x10, (int) y10) && m(this.f27422g)) {
                z10 = true;
            }
            return this.f27432q.W(motionEvent) || z10;
        }
        if (actionMasked == 2) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            float fAbs = Math.abs(x11 - this.f27428m);
            float fAbs2 = Math.abs(y11 - this.f27429n);
            if (fAbs > this.f27432q.E() && fAbs2 > fAbs) {
                this.f27432q.c();
                this.f27426k = true;
                return false;
            }
        }
        z10 = false;
        if (this.f27432q.W(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean zN = n();
        int i19 = i12 - i10;
        int paddingRight = zN ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zN ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f27434s) {
            this.f27423h = (this.f27421f && this.f27433r) ? 0.0f : 1.0f;
        }
        int i20 = paddingRight;
        int i21 = 0;
        while (i21 < childCount) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() == 8) {
                i14 = i20;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f27444b) {
                    int i22 = i19 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i22) - i20) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.f27425j = iMin;
                    int i23 = zN ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.f27445c = ((i20 + i23) + iMin) + (measuredWidth / 2) > i22;
                    int i24 = (int) (iMin * this.f27423h);
                    this.f27423h = i24 / iMin;
                    i14 = i20 + i23 + i24;
                    i15 = 0;
                } else if (!this.f27421f || (i16 = this.f27427l) == 0) {
                    i14 = paddingRight;
                    i15 = 0;
                } else {
                    i15 = (int) ((1.0f - this.f27423h) * i16);
                    i14 = paddingRight;
                }
                if (zN) {
                    i18 = (i19 - i14) + i15;
                    i17 = i18 - measuredWidth;
                } else {
                    i17 = i14 - i15;
                    i18 = i17 + measuredWidth;
                }
                childAt.layout(i17, paddingTop, i18, childAt.getMeasuredHeight() + paddingTop);
                m mVar = this.f27438w;
                paddingRight += childAt.getWidth() + Math.abs((mVar != null && mVar.c() == m.b.f28640c && this.f27438w.a()) ? this.f27438w.getBounds().width() : 0);
            }
            i21++;
            i20 = i14;
        }
        if (this.f27434s) {
            if (this.f27421f && this.f27427l != 0) {
                t(this.f27423h);
            }
            A(this.f27422g);
        }
        this.f27434s = false;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0086 A[PHI: r15
  0x0086: PHI (r15v5 float) = (r15v1 float), (r15v6 float) binds: [B:19:0x007d, B:21:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int paddingTop;
        int iMin;
        int i12;
        int iMax;
        int iMakeMeasureSpec;
        int iMax2;
        int i13;
        int iMakeMeasureSpec2;
        int measuredHeight;
        boolean z10;
        int i14;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        ?? r10 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int iMax3 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e(C, "onMeasure: More than two child views are not supported.");
        }
        this.f27422g = null;
        int i15 = 0;
        boolean z11 = false;
        int i16 = iMax3;
        float f10 = 0.0f;
        while (true) {
            i12 = 8;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int i17 = size;
            if (childAt.getVisibility() == 8) {
                layoutParams.f27445c = r10;
            } else {
                float f11 = layoutParams.f27443a;
                if (f11 > 0.0f) {
                    f10 += f11;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width != 0) {
                        iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), (int) r10);
                        i13 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                        if (i13 == -2) {
                            if (mode == 0) {
                                i14 = mode;
                            } else {
                                i14 = Integer.MIN_VALUE;
                            }
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i14);
                        } else if (i13 == -1) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                        } else {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                        }
                        childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                        int measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                        if (measuredHeight > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                iMin = Math.min(measuredHeight, paddingTop);
                            } else if (mode2 == 0) {
                                iMin = measuredHeight;
                            }
                        }
                        i16 -= measuredWidth;
                        if (i15 != 0) {
                            if (i16 < 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            layoutParams.f27444b = z10;
                            z11 |= z10;
                            if (z10) {
                                this.f27422g = childAt;
                            }
                        }
                    }
                } else {
                    iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), (int) r10);
                    i13 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                    if (i13 == -2) {
                        if (mode == 0) {
                            i14 = mode;
                        } else {
                            i14 = Integer.MIN_VALUE;
                        }
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i14);
                    } else if (i13 == -1) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                    } else {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    }
                    childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight > iMin) {
                        if (mode2 == Integer.MIN_VALUE) {
                            iMin = Math.min(measuredHeight, paddingTop);
                        } else if (mode2 == 0) {
                            iMin = measuredHeight;
                        }
                    }
                    i16 -= measuredWidth2;
                    if (i15 != 0) {
                        if (i16 < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        layoutParams.f27444b = z10;
                        z11 |= z10;
                        if (z10) {
                            this.f27422g = childAt;
                        }
                    }
                }
            }
            i15++;
            size = i17;
            r10 = 0;
        }
        int i18 = size;
        int i19 = i16;
        if (z11 || f10 > 0.0f) {
            int i20 = 0;
            while (i20 < childCount) {
                View childAt2 = getChildAt(i20);
                if (childAt2.getVisibility() != i12) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    int measuredWidth3 = ((ViewGroup.MarginLayoutParams) layoutParams2).width == 0 && (layoutParams2.f27443a > 0.0f ? 1 : (layoutParams2.f27443a == 0.0f ? 0 : -1)) > 0 ? 0 : childAt2.getMeasuredWidth();
                    if (z11) {
                        iMax = iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (layoutParams2.f27443a > 0.0f) {
                        iMax = measuredWidth3 + ((int) ((layoutParams2.f27443a * Math.max(0, i19)) / f10));
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMax = measuredWidth3;
                        iMakeMeasureSpec = 0;
                    }
                    int iP = p(childAt2, i11, getPaddingTop() + getPaddingBottom());
                    if (measuredWidth3 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, iP);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                            }
                            iMin = measuredHeight2;
                        }
                    }
                }
                i20++;
                i12 = 8;
            }
        }
        ArrayList<Rect> arrayListZ = z();
        if (arrayListZ != null && !z11) {
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt3 = getChildAt(i21);
                if (childAt3.getVisibility() != 8) {
                    Rect rect = arrayListZ.get(i21);
                    LayoutParams layoutParams3 = (LayoutParams) childAt3.getLayoutParams();
                    int i22 = ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), iMakeMeasureSpec3);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1 || (k(childAt3) != 0 && rect.width() < k(childAt3))) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax3 - i22, 1073741824), iMakeMeasureSpec3);
                        if (i21 != 0) {
                            layoutParams3.f27444b = true;
                            this.f27422g = childAt3;
                            z11 = true;
                        }
                    } else {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), iMakeMeasureSpec3);
                    }
                }
            }
        }
        setMeasuredDimension(i18, iMin + getPaddingTop() + getPaddingBottom());
        this.f27421f = z11;
        if (this.f27432q.F() == 0 || z11) {
            return;
        }
        this.f27432q.a();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f27447b) {
            r();
        } else {
            d();
        }
        this.f27433r = savedState.f27447b;
        setLockMode(savedState.f27448c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f27447b = o() ? isOpen() : this.f27433r;
        savedState.f27448c = this.f27437v;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            this.f27434s = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27421f) {
            return super.onTouchEvent(motionEvent);
        }
        this.f27432q.M(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f27428m = x10;
            this.f27429n = y10;
        } else if (actionMasked == 1 && m(this.f27422g)) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            float f10 = x11 - this.f27428m;
            float f11 = y11 - this.f27429n;
            int iE = this.f27432q.E();
            if ((f10 * f10) + (f11 * f11) < iE * iE && this.f27432q.L(this.f27422g, (int) x11, (int) y11)) {
                e(0);
            }
        }
        return true;
    }

    @Override // androidx.customview.widget.c
    public void open() {
        r();
    }

    void q(int i10) {
        if (this.f27422g == null) {
            this.f27423h = 0.0f;
            return;
        }
        boolean zN = n();
        LayoutParams layoutParams = (LayoutParams) this.f27422g.getLayoutParams();
        int width = this.f27422g.getWidth();
        if (zN) {
            i10 = (getWidth() - i10) - width;
        }
        float paddingRight = (i10 - ((zN ? getPaddingRight() : getPaddingLeft()) + (zN ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / this.f27425j;
        this.f27423h = paddingRight;
        if (this.f27427l != 0) {
            t(paddingRight);
        }
        h(this.f27422g);
    }

    public boolean r() {
        return s(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@n0 View view) {
        if (view.getParent() instanceof TouchBlocker) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f27421f) {
            return;
        }
        this.f27433r = view == this.f27422g;
    }

    @Deprecated
    public void setCoveredFadeColor(@l int i10) {
        this.f27418c = i10;
    }

    public final void setLockMode(int i10) {
        this.f27437v = i10;
    }

    @Deprecated
    public void setPanelSlideListener(@p0 e eVar) {
        e eVar2 = this.f27431p;
        if (eVar2 != null) {
            u(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.f27431p = eVar;
    }

    public void setParallaxDistance(@t0 int i10) {
        this.f27427l = i10;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@p0 Drawable drawable) {
        this.f27419d = drawable;
    }

    public void setShadowDrawableRight(@p0 Drawable drawable) {
        this.f27420e = drawable;
    }

    @Deprecated
    public void setShadowResource(@androidx.annotation.v int i10) {
        setShadowDrawableLeft(getResources().getDrawable(i10));
    }

    public void setShadowResourceLeft(int i10) {
        setShadowDrawableLeft(androidx.core.content.d.i(getContext(), i10));
    }

    public void setShadowResourceRight(int i10) {
        setShadowDrawableRight(androidx.core.content.d.i(getContext(), i10));
    }

    @Deprecated
    public void setSliderFadeColor(@l int i10) {
        this.f27417b = i10;
    }

    public void u(@n0 e eVar) {
        this.f27430o.remove(eVar);
    }

    void v() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Deprecated
    public void w() {
        d();
    }

    @Deprecated
    public void x() {
        r();
    }

    boolean y(float f10, int i10) {
        int paddingLeft;
        if (!this.f27421f) {
            return false;
        }
        boolean zN = n();
        LayoutParams layoutParams = (LayoutParams) this.f27422g.getLayoutParams();
        if (zN) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + (f10 * this.f27425j)) + this.f27422g.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + (f10 * this.f27425j));
        }
        androidx.customview.widget.d dVar = this.f27432q;
        View view = this.f27422g;
        if (!dVar.X(view, paddingLeft, view.getTop())) {
            return false;
        }
        v();
        j1.n1(this);
        return true;
    }
}
