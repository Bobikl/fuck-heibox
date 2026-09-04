package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.f1;
import androidx.core.view.q0;
import androidx.core.view.s0;
import androidx.core.view.u0;
import androidx.core.view.w0;
import androidx.core.view.y0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements w0, s0, f1 {
    static final int C = 250;
    static final float D = 0.5f;
    private static final String E = "NestedScrollView";
    private static final int F = 250;
    private static final float G = 0.015f;
    private static final float H = 0.35f;
    private static final float J = 4.0f;
    private static final int K = -1;
    private float A;
    private c B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f21848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f21849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f21850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OverScroller f21851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @j1
    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public EdgeEffect f21852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @j1
    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public EdgeEffect f21853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f21857k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f21858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private VelocityTracker f21859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f21860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f21861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f21862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f21863q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f21864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f21865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int[] f21866t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int[] f21867u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f21868v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f21869w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private SavedState f21870x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final y0 f21871y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final u0 f21872z;
    private static final float I = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final a L = new a();
    private static final int[] M = {R.attr.fillViewport};

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f21873b;

        public class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f21873b = parcel.readInt();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @n0
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f21873b + z5.g.f141884d;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f21873b);
        }
    }

    public static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            androidx.core.view.accessibility.d0.N(accessibilityEvent, nestedScrollView.getScrollX());
            androidx.core.view.accessibility.d0.P(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.a0 a0Var) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            a0Var.b1(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            a0Var.M1(true);
            if (nestedScrollView.getScrollY() > 0) {
                a0Var.b(androidx.core.view.accessibility.a0.a.f21389s);
                a0Var.b(androidx.core.view.accessibility.a0.a.D);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                a0Var.b(androidx.core.view.accessibility.a0.a.f21388r);
                a0Var.b(androidx.core.view.accessibility.a0.a.F);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.V(0, iMax, true);
                    return true;
                }
                if (i10 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.V(0, iMin, true);
            return true;
        }
    }

    @androidx.annotation.w0(21)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
        void a(@n0 NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    public NestedScrollView(@n0 Context context) {
        this(context, null);
    }

    public NestedScrollView(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21850d = new Rect();
        this.f21855i = true;
        this.f21856j = false;
        this.f21857k = null;
        this.f21858l = false;
        this.f21861o = true;
        this.f21865s = -1;
        this.f21866t = new int[2];
        this.f21867u = new int[2];
        this.f21852f = i.a(context, attributeSet);
        this.f21853g = i.a(context, attributeSet);
        this.f21848b = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        t();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M, i10, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f21871y = new y0(this);
        this.f21872z = new u0(this);
        setNestedScrollingEnabled(true);
        androidx.core.view.j1.B1(this, L);
    }

    private boolean A(View view, int i10, int i11) {
        view.getDrawingRect(this.f21850d);
        offsetDescendantRectToMyCoords(view, this.f21850d);
        return this.f21850d.bottom + i10 >= getScrollY() && this.f21850d.top - i10 <= getScrollY() + i11;
    }

    private void B(int i10, int i11, @p0 int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f21872z.e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    private void C(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f21865s) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f21854h = (int) motionEvent.getY(i10);
            this.f21865s = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f21859m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void F() {
        VelocityTracker velocityTracker = this.f21859m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f21859m = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    private int H(int i10, float f10) {
        float fJ;
        int iRound;
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        float f11 = 0.0f;
        if (i.d(this.f21852f) == 0.0f) {
            if (i.d(this.f21853g) != 0.0f) {
                fJ = i.j(this.f21853g, height, 1.0f - width);
                if (i.d(this.f21853g) == 0.0f) {
                    this.f21853g.onRelease();
                }
            }
            iRound = Math.round(f11 * getHeight());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        fJ = -i.j(this.f21852f, -height, width);
        if (i.d(this.f21852f) == 0.0f) {
            this.f21852f.onRelease();
        }
        f11 = fJ;
        iRound = Math.round(f11 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    private void I(boolean z10) {
        if (z10) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.f21869w = getScrollY();
        androidx.core.view.j1.n1(this);
    }

    private boolean J(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View viewN = n(z11, i11, i12);
        if (viewN == null) {
            viewN = this;
        }
        if (i11 < scrollY || i12 > i13) {
            K(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        }
        if (viewN != findFocus()) {
            viewN.requestFocus(i10);
        }
        return z10;
    }

    private int K(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        if (i12 == 1) {
            startNestedScroll(2, i12);
        }
        boolean z11 = false;
        if (dispatchNestedPreScroll(0, i10, this.f21867u, this.f21866t, i12)) {
            i13 = i10 - this.f21867u[1];
            i14 = this.f21866t[1] + 0;
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z12 = c() && !z10;
        boolean z13 = D(0, i13, 0, scrollY, 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent(i12);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f21867u;
        iArr[1] = 0;
        dispatchNestedScroll(0, scrollY2, 0, i13 - scrollY2, this.f21866t, i12, iArr);
        int i15 = i14 + this.f21866t[1];
        int i16 = i13 - this.f21867u[1];
        int i17 = scrollY + i16;
        if (i17 < 0) {
            if (z12) {
                i.j(this.f21852f, (-i16) / getHeight(), i11 / getWidth());
                if (!this.f21853g.isFinished()) {
                    this.f21853g.onRelease();
                }
            }
        } else if (i17 > scrollRange && z12) {
            i.j(this.f21853g, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!this.f21852f.isFinished()) {
                this.f21852f.onRelease();
            }
        }
        if (this.f21852f.isFinished() && this.f21853g.isFinished()) {
            z11 = z13;
        } else {
            androidx.core.view.j1.n1(this);
        }
        if (z11 && i12 == 0) {
            this.f21859m.clear();
        }
        if (i12 == 1) {
            stopNestedScroll(i12);
            this.f21852f.onRelease();
            this.f21853g.onRelease();
        }
        return i15;
    }

    private void L(View view) {
        view.getDrawingRect(this.f21850d);
        offsetDescendantRectToMyCoords(view, this.f21850d);
        int iF = f(this.f21850d);
        if (iF != 0) {
            scrollBy(0, iF);
        }
    }

    private boolean M(Rect rect, boolean z10) {
        int iF = f(rect);
        boolean z11 = iF != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iF);
            } else {
                P(0, iF);
            }
        }
        return z11;
    }

    private boolean N(@n0 EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return q(-i10) < i.d(edgeEffect) * ((float) getHeight());
    }

    private void R(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f21849c > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f21851e.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            I(z10);
        } else {
            if (!this.f21851e.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f21849c = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean W(MotionEvent motionEvent) {
        boolean z10;
        if (i.d(this.f21852f) != 0.0f) {
            i.j(this.f21852f, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (i.d(this.f21853g) == 0.0f) {
            return z10;
        }
        i.j(this.f21853g, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f21851e.abortAnimation();
        stopNestedScroll(1);
    }

    private boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int e(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.A;
    }

    private void h(int i10) {
        if (i10 != 0) {
            if (this.f21861o) {
                P(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    private boolean i(int i10) {
        if (i.d(this.f21852f) != 0.0f) {
            if (N(this.f21852f, i10)) {
                this.f21852f.onAbsorb(i10);
            } else {
                o(-i10);
            }
        } else {
            if (i.d(this.f21853g) == 0.0f) {
                return false;
            }
            int i11 = -i10;
            if (N(this.f21853g, i11)) {
                this.f21853g.onAbsorb(i11);
            } else {
                o(i11);
            }
        }
        return true;
    }

    private void l() {
        this.f21865s = -1;
        this.f21858l = false;
        F();
        stopNestedScroll(0);
        this.f21852f.onRelease();
        this.f21853g.onRelease();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    private View n(boolean z10, int i10, int i11) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12 && z13) {
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else if (z13) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private float q(int i10) {
        double dLog = Math.log((Math.abs(i10) * H) / (this.f21848b * G));
        float f10 = I;
        return (float) (((double) (this.f21848b * G)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog));
    }

    private boolean r(int i10, int i11) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight();
    }

    private void s() {
        VelocityTracker velocityTracker = this.f21859m;
        if (velocityTracker == null) {
            this.f21859m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void t() {
        this.f21851e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f21862p = viewConfiguration.getScaledTouchSlop();
        this.f21863q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f21864r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void u() {
        if (this.f21859m == null) {
            this.f21859m = VelocityTracker.obtain();
        }
    }

    private void v(int i10, int i11) {
        this.f21854h = i10;
        this.f21865s = i11;
        startNestedScroll(2, 0);
    }

    private boolean x(View view) {
        return !A(view, 0, getHeight());
    }

    private static boolean z(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && z((View) parent, view2);
    }

    boolean D(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        int overScrollMode = getOverScrollMode();
        boolean z13 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z14 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        int i18 = i12 + i10;
        int i19 = !z15 ? 0 : i16;
        int i20 = i13 + i11;
        int i21 = !z16 ? 0 : i17;
        int i22 = -i19;
        int i23 = i19 + i14;
        int i24 = -i21;
        int i25 = i21 + i15;
        if (i18 > i23) {
            i18 = i23;
            z11 = true;
        } else if (i18 < i22) {
            z11 = true;
            i18 = i22;
        } else {
            z11 = false;
        }
        if (i20 > i25) {
            i20 = i25;
            z12 = true;
        } else if (i20 < i24) {
            z12 = true;
            i20 = i24;
        } else {
            z12 = false;
        }
        if (z12 && !hasNestedScrollingParent(1)) {
            this.f21851e.springBack(i18, i20, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i18, i20, z11, z12);
        return z11 || z12;
    }

    public boolean E(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f21850d.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f21850d;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f21850d.top = getScrollY() - height;
            Rect rect2 = this.f21850d;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f21850d;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return J(i10, i11, i12);
    }

    @Override // androidx.core.view.v0
    public void G(@n0 View view, int i10, int i11, int i12, int i13, int i14) {
        B(i13, i14, null);
    }

    @Override // androidx.core.view.v0
    public void O(@n0 View view, int i10, int i11, @n0 int[] iArr, int i12) {
        dispatchNestedPreScroll(i10, i11, iArr, null, i12);
    }

    public final void P(int i10, int i11) {
        R(i10, i11, 250, false);
    }

    public final void Q(int i10, int i11, int i12) {
        R(i10, i11, i12, false);
    }

    public final void S(int i10, int i11) {
        U(i10, i11, 250, false);
    }

    public final void T(int i10, int i11, int i12) {
        U(i10, i11, i12, false);
    }

    void U(int i10, int i11, int i12, boolean z10) {
        R(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    void V(int i10, int i11, boolean z10) {
        U(i10, i11, 250, z10);
    }

    @Override // android.view.ViewGroup
    public void addView(@n0 View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public boolean b(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !A(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            K(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f21850d);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f21850d);
            K(f(this.f21850d), 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && x(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View, androidx.core.view.f1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.f1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.f1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f21851e.isFinished()) {
            return;
        }
        this.f21851e.computeScrollOffset();
        int currY = this.f21851e.getCurrY();
        int iG = g(currY - this.f21869w);
        this.f21869w = currY;
        int[] iArr = this.f21867u;
        boolean z10 = false;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, iG, iArr, null, 1);
        int i10 = iG - this.f21867u[1];
        int scrollRange = getScrollRange();
        if (i10 != 0) {
            int scrollY = getScrollY();
            D(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i11 = i10 - scrollY2;
            int[] iArr2 = this.f21867u;
            iArr2[1] = 0;
            dispatchNestedScroll(0, scrollY2, 0, i11, this.f21866t, 1, iArr2);
            i10 = i11 - this.f21867u[1];
        }
        if (i10 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z10 = true;
            }
            if (z10) {
                if (i10 < 0) {
                    if (this.f21852f.isFinished()) {
                        this.f21852f.onAbsorb((int) this.f21851e.getCurrVelocity());
                    }
                } else if (this.f21853g.isFinished()) {
                    this.f21853g.onAbsorb((int) this.f21851e.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f21851e.isFinished()) {
            stopNestedScroll(1);
        } else {
            androidx.core.view.j1.n1(this);
        }
    }

    @Override // android.view.View, androidx.core.view.f1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.f1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.f1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m(keyEvent);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f21872z.a(f10, f11, z10);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f21872z.b(f10, f11);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedPreScroll(int i10, int i11, @p0 int[] iArr, @p0 int[] iArr2) {
        return dispatchNestedPreScroll(i10, i11, iArr, iArr2, 0);
    }

    @Override // androidx.core.view.r0
    public boolean dispatchNestedPreScroll(int i10, int i11, @p0 int[] iArr, @p0 int[] iArr2, int i12) {
        return this.f21872z.d(i10, i11, iArr, iArr2, i12);
    }

    @Override // androidx.core.view.s0
    public void dispatchNestedScroll(int i10, int i11, int i12, int i13, @p0 int[] iArr, int i14, @n0 int[] iArr2) {
        this.f21872z.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, @p0 int[] iArr) {
        return this.f21872z.f(i10, i11, i12, i13, iArr);
    }

    @Override // androidx.core.view.r0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, @p0 int[] iArr, int i14) {
        return this.f21872z.g(i10, i11, i12, i13, iArr, i14);
    }

    @Override // android.view.View
    public void draw(@n0 Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f21852f.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f21852f.setSize(width, height);
            if (this.f21852f.draw(canvas)) {
                androidx.core.view.j1.n1(this);
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f21853g.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = 0 + getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f21853g.setSize(width2, height2);
        if (this.f21853g.draw(canvas)) {
            androidx.core.view.j1.n1(this);
        }
        canvas.restoreToCount(iSave2);
    }

    protected int f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i11) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    int g(int i10) {
        int height = getHeight();
        if (i10 > 0 && i.d(this.f21852f) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * i.j(this.f21852f, ((-i10) * 4.0f) / height, 0.5f));
            if (iRound != i10) {
                this.f21852f.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || i.d(this.f21853g) == 0.0f) {
            return i10;
        }
        float f10 = height;
        int iRound2 = Math.round((f10 / 4.0f) * i.j(this.f21853g, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            this.f21853g.finish();
        }
        return i10 - iRound2;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup, androidx.core.view.x0
    public int getNestedScrollAxes() {
        return this.f21871y.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // androidx.core.view.w0
    public void h0(@n0 View view, int i10, int i11, int i12, int i13, int i14, @n0 int[] iArr) {
        B(i13, i14, iArr);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // androidx.core.view.r0
    public boolean hasNestedScrollingParent(int i10) {
        return this.f21872z.l(i10);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean isNestedScrollingEnabled() {
        return this.f21872z.m();
    }

    @Override // androidx.core.view.v0
    public void j(@n0 View view, @n0 View view2, int i10, int i11) {
        this.f21871y.c(view, view2, i10, i11);
        startNestedScroll(2, i11);
    }

    @Override // androidx.core.view.v0
    public boolean j0(@n0 View view, @n0 View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // androidx.core.view.v0
    public void k(@n0 View view, int i10) {
        this.f21871y.e(view, i10);
        stopNestedScroll(i10);
    }

    public boolean m(@n0 KeyEvent keyEvent) {
        this.f21850d.setEmpty();
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? b(33) : p(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? b(130) : p(130);
        }
        if (keyCode != 62) {
            return false;
        }
        E(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.view.ViewGroup
    protected void measureChild(@n0 View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void o(int i10) {
        if (getChildCount() > 0) {
            this.f21851e.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            I(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21856j = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(@n0 MotionEvent motionEvent) {
        int width;
        float axisValue;
        if (motionEvent.getAction() != 8 || this.f21858l) {
            return false;
        }
        if (q0.l(motionEvent, 2)) {
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if (q0.l(motionEvent, 4194304)) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            axisValue = axisValue2;
        } else {
            width = 0;
            axisValue = 0.0f;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        K(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, q0.l(motionEvent, 8194));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@n0 MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f21858l) {
            return true;
        }
        int i10 = action & 255;
        if (i10 == 0) {
            int y10 = (int) motionEvent.getY();
            if (r((int) motionEvent.getX(), y10)) {
                this.f21854h = y10;
                this.f21865s = motionEvent.getPointerId(0);
                s();
                this.f21859m.addMovement(motionEvent);
                this.f21851e.computeScrollOffset();
                if (!W(motionEvent) && this.f21851e.isFinished()) {
                    z10 = false;
                }
                this.f21858l = z10;
                startNestedScroll(2, 0);
            } else {
                if (!W(motionEvent) && this.f21851e.isFinished()) {
                    z10 = false;
                }
                this.f21858l = z10;
                F();
            }
        } else if (i10 == 1) {
            this.f21858l = false;
            this.f21865s = -1;
            F();
            if (this.f21851e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                androidx.core.view.j1.n1(this);
            }
            stopNestedScroll(0);
        } else if (i10 == 2) {
            int i11 = this.f21865s;
            if (i11 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                if (iFindPointerIndex == -1) {
                    Log.e(E, "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                } else {
                    int y11 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y11 - this.f21854h) > this.f21862p && (2 & getNestedScrollAxes()) == 0) {
                        this.f21858l = true;
                        this.f21854h = y11;
                        u();
                        this.f21859m.addMovement(motionEvent);
                        this.f21868v = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i10 == 3) {
            this.f21858l = false;
            this.f21865s = -1;
            F();
            if (this.f21851e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                androidx.core.view.j1.n1(this);
            }
            stopNestedScroll(0);
        } else if (i10 == 6) {
            C(motionEvent);
        }
        return this.f21858l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredHeight = 0;
        this.f21855i = false;
        View view = this.f21857k;
        if (view != null && z(view, this)) {
            L(this.f21857k);
        }
        this.f21857k = null;
        if (!this.f21856j) {
            if (this.f21870x != null) {
                scrollTo(getScrollX(), this.f21870x.f21873b);
                this.f21870x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iE = e(scrollY, paddingTop, measuredHeight);
            if (iE != scrollY) {
                scrollTo(getScrollX(), iE);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f21856j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f21860n && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedFling(@n0 View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        o((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedPreFling(@n0 View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedPreScroll(@n0 View view, int i10, int i11, @n0 int[] iArr) {
        O(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedScroll(@n0 View view, int i10, int i11, int i12, int i13) {
        B(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedScrollAccepted(@n0 View view, @n0 View view2, int i10) {
        j(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus == null || x(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f21870x = savedState;
        requestLayout();
    }

    @Override // android.view.View
    @n0
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f21873b = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        c cVar = this.B;
        if (cVar != null) {
            cVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !A(viewFindFocus, 0, i13)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f21850d);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f21850d);
        h(f(this.f21850d));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onStartNestedScroll(@n0 View view, @n0 View view2, int i10) {
        return j0(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onStopNestedScroll(@n0 View view) {
        k(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@n0 MotionEvent motionEvent) {
        ViewParent parent;
        u();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f21868v = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f21868v);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f21859m;
                velocityTracker.computeCurrentVelocity(1000, this.f21864r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f21865s);
                if (Math.abs(yVelocity) >= this.f21863q) {
                    if (!i(yVelocity)) {
                        int i10 = -yVelocity;
                        float f10 = i10;
                        if (!dispatchNestedPreFling(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            o(i10);
                        }
                    }
                } else if (this.f21851e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    androidx.core.view.j1.n1(this);
                }
                l();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f21865s);
                if (iFindPointerIndex == -1) {
                    Log.e(E, "Invalid pointerId=" + this.f21865s + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i11 = this.f21854h - y10;
                    int iH = i11 - H(i11, motionEvent.getX(iFindPointerIndex));
                    if (!this.f21858l && Math.abs(iH) > this.f21862p) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f21858l = true;
                        iH = iH > 0 ? iH - this.f21862p : iH + this.f21862p;
                    }
                    if (this.f21858l) {
                        int iK = K(iH, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f21854h = y10 - iK;
                        this.f21868v += iK;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f21858l && getChildCount() > 0 && this.f21851e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    androidx.core.view.j1.n1(this);
                }
                l();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f21854h = (int) motionEvent.getY(actionIndex);
                this.f21865s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                C(motionEvent);
                this.f21854h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f21865s));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f21858l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f21851e.isFinished()) {
                a();
            }
            v((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f21859m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public boolean p(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f21850d;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f21850d.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f21850d;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f21850d;
        return J(i10, rect3.top, rect3.bottom);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f21855i) {
            this.f21857k = view2;
        } else {
            L(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@n0 View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return M(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            F();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f21855i = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iE = e(i10, width, width2);
            int iE2 = e(i11, height, height2);
            if (iE == getScrollX() && iE2 == getScrollY()) {
                return;
            }
            super.scrollTo(iE, iE2);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f21860n) {
            this.f21860n = z10;
            requestLayout();
        }
    }

    @Override // android.view.View, androidx.core.view.t0
    public void setNestedScrollingEnabled(boolean z10) {
        this.f21872z.p(z10);
    }

    public void setOnScrollChangeListener(@p0 c cVar) {
        this.B = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f21861o = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean startNestedScroll(int i10) {
        return startNestedScroll(i10, 0);
    }

    @Override // androidx.core.view.r0
    public boolean startNestedScroll(int i10, int i11) {
        return this.f21872z.s(i10, i11);
    }

    @Override // android.view.View, androidx.core.view.t0
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // androidx.core.view.r0
    public void stopNestedScroll(int i10) {
        this.f21872z.u(i10);
    }

    public boolean w() {
        return this.f21860n;
    }

    public boolean y() {
        return this.f21861o;
    }
}
