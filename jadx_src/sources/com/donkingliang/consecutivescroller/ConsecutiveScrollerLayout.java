package com.donkingliang.consecutivescroller;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.f1;
import androidx.core.view.j1;
import androidx.core.view.r0;
import androidx.core.view.u0;
import androidx.core.view.v0;
import androidx.core.view.y0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ConsecutiveScrollerLayout extends ViewGroup implements f1, v0, r0 {
    private static final int J3 = 0;
    private static final int K3 = 1;
    private static final int L3 = 2;
    private static final int M3 = 1000;
    public static final int N3 = 0;
    public static final int O3 = 1;
    public static final int P3 = 2;
    static final Interpolator Q3 = new a();
    private final int[] A;
    private boolean B;
    private int C;
    protected h D;
    private int E;
    private y0 F;
    private u0 G;
    private boolean G2;
    private boolean G3;
    private final int[] H;
    private final int[] I;
    private View J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private EdgeEffect P;
    private EdgeEffect Q;
    private int R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private View f42299a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42300b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final List<View> f42301b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f42302c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final List<View> f42303c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float f42304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f42308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f42309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected Interpolator f42310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected ValueAnimator f42311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected Runnable f42312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected Handler f42313m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42314n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f42315o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private OverScroller f42316p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f42317p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private i f42318p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f42319p3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private VelocityTracker f42320q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private VelocityTracker f42321r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f42322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f42323t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f42324u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f42325v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f42326w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f42327x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private final List<View> f42328x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private g f42329x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f42330y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f42331y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private int f42332y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private HashMap<Integer, Float> f42333z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f42334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f42335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f42336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f42337d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f42338e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f42339f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Align f42340g;

        public enum Align {
            LEFT(1),
            RIGHT(2),
            CENTER(3);

            int value;

            Align(int i10) {
                this.value = i10;
            }

            static Align get(int i10) {
                if (i10 == 1) {
                    return LEFT;
                }
                if (i10 != 2) {
                    return i10 != 3 ? LEFT : CENTER;
                }
                return RIGHT;
            }
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f42334a = true;
            this.f42335b = true;
            this.f42336c = false;
            this.f42337d = false;
            this.f42338e = false;
            this.f42339f = -1;
            this.f42340g = Align.LEFT;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f42334a = true;
            this.f42335b = true;
            this.f42336c = false;
            this.f42337d = false;
            this.f42338e = false;
            this.f42339f = -1;
            this.f42340g = Align.LEFT;
            TypedArray typedArrayObtainStyledAttributes = null;
            try {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f42379t);
                    this.f42334a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ConsecutiveScrollerLayout_Layout_layout_isConsecutive, true);
                    this.f42335b = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ConsecutiveScrollerLayout_Layout_layout_isNestedScroll, true);
                    this.f42336c = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ConsecutiveScrollerLayout_Layout_layout_isSticky, false);
                    this.f42337d = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ConsecutiveScrollerLayout_Layout_layout_isTriggerScroll, false);
                    this.f42338e = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ConsecutiveScrollerLayout_Layout_layout_isSink, false);
                    this.f42340g = Align.get(typedArrayObtainStyledAttributes.getInt(R.styleable.ConsecutiveScrollerLayout_Layout_layout_align, 1));
                    this.f42339f = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ConsecutiveScrollerLayout_Layout_layout_scrollChild, -1);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    if (typedArrayObtainStyledAttributes == null) {
                        return;
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                if (typedArrayObtainStyledAttributes != null) {
                    typedArrayObtainStyledAttributes.recycle();
                }
                throw th2;
            }
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f42334a = true;
            this.f42335b = true;
            this.f42336c = false;
            this.f42337d = false;
            this.f42338e = false;
            this.f42339f = -1;
            this.f42340g = Align.LEFT;
        }
    }

    public static final class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                ConsecutiveScrollerLayout consecutiveScrollerLayout = ConsecutiveScrollerLayout.this;
                consecutiveScrollerLayout.f42311k = null;
                consecutiveScrollerLayout.m(false, false);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView f42342b;

        c(RecyclerView recyclerView) {
            this.f42342b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.donkingliang.consecutivescroller.f.y(this.f42342b);
        }
    }

    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConsecutiveScrollerLayout.this.l(false, true);
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f42345a;

        static {
            int[] iArr = new int[LayoutParams.Align.values().length];
            f42345a = iArr;
            try {
                iArr[LayoutParams.Align.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42345a[LayoutParams.Align.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42345a[LayoutParams.Align.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f42348d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f42351g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f42346b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f42347c = 10;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f42350f = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f42349e = AnimationUtils.currentAnimationTimeMillis();

        f(float f10, int i10) {
            this.f42351g = f10;
            this.f42348d = i10;
            ConsecutiveScrollerLayout.this.f42313m.postDelayed(this, this.f42347c);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ConsecutiveScrollerLayout.this.f42312l == this) {
                double d10 = this.f42351g;
                int i10 = this.f42346b + 1;
                this.f42346b = i10;
                this.f42351g = (float) (d10 * Math.pow(0.8500000238418579d, i10 * 2));
                long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float f10 = this.f42351g * (((jCurrentAnimationTimeMillis - this.f42349e) * 1.0f) / 1000.0f);
                if (Math.abs(f10) < 1.0f) {
                    ConsecutiveScrollerLayout consecutiveScrollerLayout = ConsecutiveScrollerLayout.this;
                    consecutiveScrollerLayout.f42312l = null;
                    int scrollY = consecutiveScrollerLayout.getScrollY();
                    int iMin = Math.min(Math.max((int) com.donkingliang.consecutivescroller.g.b(Math.abs(scrollY - this.f42348d)), 30), 100) * 10;
                    ConsecutiveScrollerLayout consecutiveScrollerLayout2 = ConsecutiveScrollerLayout.this;
                    consecutiveScrollerLayout2.f(scrollY, this.f42348d, 0, consecutiveScrollerLayout2.f42310j, iMin);
                    return;
                }
                this.f42349e = jCurrentAnimationTimeMillis;
                this.f42350f += f10;
                int scrollY2 = ConsecutiveScrollerLayout.this.getScrollY();
                ConsecutiveScrollerLayout.this.d0(this.f42350f);
                if (scrollY2 != ConsecutiveScrollerLayout.this.f42314n) {
                    ConsecutiveScrollerLayout consecutiveScrollerLayout3 = ConsecutiveScrollerLayout.this;
                    consecutiveScrollerLayout3.p0(consecutiveScrollerLayout3.f42314n, scrollY2);
                }
                ConsecutiveScrollerLayout.this.f42313m.postDelayed(this, this.f42347c);
            }
        }
    }

    public interface g {
        void a(@n0 List<View> list);
    }

    public interface h {
        void a(View view, int i10, int i11, int i12);
    }

    public interface i {
        void a(@p0 View view, @p0 View view2);
    }

    public ConsecutiveScrollerLayout(Context context) {
        this(context, null);
    }

    public ConsecutiveScrollerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConsecutiveScrollerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42304d = 0.5f;
        this.f42308h = 300;
        this.f42313m = new Handler(Looper.getMainLooper());
        this.f42333z = new HashMap<>();
        this.A = new int[2];
        this.B = false;
        this.C = 0;
        this.E = -1;
        this.H = new int[2];
        this.I = new int[2];
        this.L = -1;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.V = 0;
        this.W = 0;
        this.f42301b0 = new ArrayList();
        this.f42303c0 = new ArrayList();
        this.f42317p1 = 0;
        this.f42328x1 = new ArrayList();
        this.f42331y1 = 0;
        this.f42332y2 = 0;
        this.G2 = false;
        this.f42319p3 = false;
        this.G3 = false;
        this.f42300b = getClass().getName();
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f42378s);
            int i11 = R.styleable.ConsecutiveScrollerLayout_overDragMode;
            if (typedArrayObtainStyledAttributes.hasValue(i11)) {
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(i11, false);
                this.f42305e = z10;
                if (z10) {
                    int iA = com.donkingliang.consecutivescroller.g.a(180.0f);
                    this.f42307g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ConsecutiveScrollerLayout_overDragMaxDistanceOfTop, iA);
                    this.f42306f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ConsecutiveScrollerLayout_overDragMaxDistanceOfBottom, iA);
                }
            }
            this.S = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ConsecutiveScrollerLayout_isPermanent, false);
            this.T = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ConsecutiveScrollerLayout_disableChildHorizontalScroll, false);
            this.W = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ConsecutiveScrollerLayout_stickyOffset, 0);
            this.U = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ConsecutiveScrollerLayout_autoAdjustHeightAtBottomView, false);
            this.V = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ConsecutiveScrollerLayout_adjustHeightOffset, 0);
            typedArrayObtainStyledAttributes.recycle();
            this.f42316p = new OverScroller(getContext(), Q3);
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f42323t = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f42324u = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f42325v = ViewConfiguration.getTouchSlop();
            setWillNotDraw(false);
            setVerticalScrollBarEnabled(true);
            this.F = new y0(this);
            this.G = new u0(this);
            setNestedScrollingEnabled(true);
            setChildrenDrawingOrderEnabled(true);
            setMotionEventSplittingEnabled(false);
            this.f42310j = new com.donkingliang.consecutivescroller.e(com.donkingliang.consecutivescroller.e.f42390b);
        } catch (Throwable th2) {
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
            throw th2;
        }
    }

    private void A0() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (!a0(childAt) || Z(childAt)) {
                arrayList.add(childAt);
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (a0(childAt2) && !Z(childAt2)) {
                arrayList.add(childAt2);
            }
        }
        this.f42328x1.clear();
        this.f42328x1.addAll(arrayList);
    }

    private void B0(View view, View view2) {
        i iVar = this.f42318p2;
        if (iVar != null) {
            iVar.a(view, view2);
        }
    }

    private int C(View view) {
        if (this.U && view == getChildAt(getChildCount() - 1)) {
            return getAdjustHeight();
        }
        return 0;
    }

    private void C0(View view, int i10) {
        view.setY(getStickyY() - i10);
        view.setClickable(true);
    }

    private int D(View view, int i10, int i11, int i12) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i13 = e.f42345a[layoutParams.f42340g.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? i11 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + i11 + ((((((i10 - view.getMeasuredWidth()) - i11) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - i12) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) / 2);
        }
        return ((i10 - view.getMeasuredWidth()) - i12) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    private int E(View view) {
        int measuredWidth = view.getMeasuredWidth();
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    private int H(List<View> list, int i10) {
        int measuredHeight = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            View view = list.get(i11);
            if (!Z(view)) {
                measuredHeight += view.getMeasuredHeight();
            }
        }
        return measuredHeight;
    }

    private View I(int i10, int i11) {
        for (View view : getNonGoneChildren()) {
            if (com.donkingliang.consecutivescroller.f.w(view, i10, i11)) {
                return view;
            }
        }
        return null;
    }

    private int J(int i10) {
        int childCount = getChildCount();
        int iF = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8 && com.donkingliang.consecutivescroller.f.t(childAt)) {
                iF += com.donkingliang.consecutivescroller.f.f(childAt);
            }
            i10++;
        }
        return iF;
    }

    private void K() {
        if (this.f42321r == null) {
            this.f42321r = VelocityTracker.obtain();
        }
    }

    private void L() {
        VelocityTracker velocityTracker = this.f42321r;
        if (velocityTracker == null) {
            this.f42321r = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void M() {
        VelocityTracker velocityTracker = this.f42320q;
        if (velocityTracker == null) {
            this.f42320q = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void N() {
        if (this.f42320q == null) {
            this.f42320q = VelocityTracker.obtain();
        }
    }

    private boolean T(int i10, int i11) {
        View viewI = I(i10, i11);
        if (viewI != null) {
            return com.donkingliang.consecutivescroller.f.t(viewI);
        }
        return false;
    }

    private boolean U(MotionEvent motionEvent) {
        int iFindPointerIndex = motionEvent.findPointerIndex(this.E);
        if (iFindPointerIndex < 0 || iFindPointerIndex >= motionEvent.getPointerCount()) {
            return true;
        }
        return T(com.donkingliang.consecutivescroller.f.j(this, motionEvent, iFindPointerIndex), com.donkingliang.consecutivescroller.f.k(this, motionEvent, iFindPointerIndex));
    }

    private boolean V() {
        if (this.f42303c0.size() != this.f42301b0.size()) {
            return false;
        }
        int size = this.f42303c0.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f42303c0.get(i10) != this.f42301b0.get(i10)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int iComputeVerticalScrollOffset = computeVerticalScrollOffset();
        u0(iIntValue);
        int iComputeVerticalScrollOffset2 = computeVerticalScrollOffset();
        this.f42314n = iComputeVerticalScrollOffset2;
        if (iComputeVerticalScrollOffset != iComputeVerticalScrollOffset2) {
            p0(iComputeVerticalScrollOffset2, iComputeVerticalScrollOffset);
        }
    }

    private int c0(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            i11 = size;
        } else if (mode == Integer.MIN_VALUE) {
            i11 = Math.min(i11, size);
        }
        return View.resolveSizeAndState(Math.max(i11, getSuggestedMinimumWidth()), i10, 0);
    }

    private void e0(int i10, int i11) {
        int i12 = this.f42314n;
        r(i10);
        int i13 = this.f42314n - i12;
        this.G.g(0, i13, 0, i10 - i13, null, i11);
    }

    private void g0(List<View> list) {
        g gVar = this.f42329x2;
        if (gVar != null) {
            gVar.a(list);
        }
    }

    private int getAdjustHeight() {
        List<View> stickyChildren = getStickyChildren();
        int measuredHeight = this.V;
        int size = stickyChildren.size();
        if (this.S) {
            for (int i10 = 0; i10 < size; i10++) {
                View view = stickyChildren.get(i10);
                if (!Z(view)) {
                    measuredHeight += view.getMeasuredHeight();
                }
            }
            return measuredHeight;
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            View view2 = stickyChildren.get(i11);
            if (!Z(view2)) {
                return measuredHeight + view2.getMeasuredHeight();
            }
        }
        return measuredHeight;
    }

    private View getBottomView() {
        List<View> effectiveChildren = getEffectiveChildren();
        if (effectiveChildren.isEmpty()) {
            return null;
        }
        return effectiveChildren.get(effectiveChildren.size() - 1);
    }

    private List<View> getEffectiveChildren() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8 && childAt.getHeight() > 0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    private List<View> getNonGoneChildren() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    private int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, computeVerticalScrollRange() - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    private List<View> getStickyChildren() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8 && a0(childAt)) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    private int getStickyY() {
        return getScrollY() + getPaddingTop() + this.W;
    }

    private boolean h() {
        return (Y() && X() && !this.f42305e) ? false : true;
    }

    private void i0(List<View> list) {
        this.f42303c0.clear();
        for (int i10 = 0; i10 < list.size(); i10++) {
            View view = list.get(i10);
            int iH = H(list, i10);
            if (view.getTop() <= getStickyY() + iH) {
                view.setY(getStickyY() + iH);
                view.setClickable(true);
                this.f42303c0.add(view);
            }
        }
        if (V()) {
            return;
        }
        this.f42301b0.clear();
        this.f42301b0.addAll(this.f42303c0);
        this.f42303c0.clear();
        g0(this.f42301b0);
    }

    private void k0() {
        VelocityTracker velocityTracker = this.f42321r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f42321r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(boolean z10, boolean z11) {
        int i10 = this.f42314n;
        View view = this.J;
        if (view == null || !z10) {
            u0(getScrollY());
        } else if (indexOfChild(view) != -1) {
            u0(this.J.getTop() + this.K);
        }
        m(true, z11);
        if (i10 != this.f42314n && this.J != w()) {
            scrollTo(0, i10);
        }
        this.J = null;
        this.K = 0;
        m0();
        o0();
    }

    private void l0() {
        VelocityTracker velocityTracker = this.f42320q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f42320q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void m(boolean z10, boolean z11) {
        int iComputeVerticalScrollOffset;
        if (z11 || (!this.B && this.f42316p.isFinished() && this.L == -1)) {
            int iComputeVerticalScrollOffset2 = computeVerticalScrollOffset();
            View viewW = w();
            if (viewW == null) {
                return;
            }
            int iIndexOfChild = indexOfChild(viewW);
            if (z10) {
                while (true) {
                    int iL = com.donkingliang.consecutivescroller.f.l(viewW);
                    int top = viewW.getTop() - getScrollY();
                    if (iL <= 0 || top >= 0) {
                        break;
                    }
                    int iMin = Math.min(iL, -top);
                    u0(getScrollY() - iMin);
                    q0(viewW, iMin);
                }
            }
            for (int i10 = 0; i10 < iIndexOfChild; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && com.donkingliang.consecutivescroller.f.t(childAt)) {
                    View viewM = com.donkingliang.consecutivescroller.f.m(childAt);
                    if (viewM instanceof com.donkingliang.consecutivescroller.c) {
                        List<View> scrolledViews = ((com.donkingliang.consecutivescroller.c) viewM).getScrolledViews();
                        if (scrolledViews != null && !scrolledViews.isEmpty()) {
                            int size = scrolledViews.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                r0(scrolledViews.get(i11));
                            }
                        }
                    } else {
                        r0(viewM);
                    }
                }
            }
            while (true) {
                iIndexOfChild++;
                if (iIndexOfChild >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(iIndexOfChild);
                if (childAt2.getVisibility() != 8 && com.donkingliang.consecutivescroller.f.t(childAt2) && (iIndexOfChild != getChildCount() - 1 || childAt2.getHeight() >= getHeight() || getScrollY() < this.f42315o)) {
                    View viewM2 = com.donkingliang.consecutivescroller.f.m(childAt2);
                    if (viewM2 instanceof com.donkingliang.consecutivescroller.c) {
                        List<View> scrolledViews2 = ((com.donkingliang.consecutivescroller.c) viewM2).getScrolledViews();
                        if (scrolledViews2 != null && !scrolledViews2.isEmpty()) {
                            int size2 = scrolledViews2.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                s0(scrolledViews2.get(i12));
                            }
                        }
                    } else {
                        s0(viewM2);
                    }
                }
            }
            p();
            if (z10 && iComputeVerticalScrollOffset2 != (iComputeVerticalScrollOffset = computeVerticalScrollOffset())) {
                p0(iComputeVerticalScrollOffset, iComputeVerticalScrollOffset2);
            }
            o0();
        }
    }

    private void m0() {
        Iterator<View> it = getNonGoneChildren().iterator();
        while (it.hasNext()) {
            it.next().setTranslationY(0.0f);
        }
    }

    private void n() {
        View view = this.f42299a0;
        if (view != null) {
            this.f42299a0 = null;
            B0(view, null);
        }
    }

    private void n0() {
        View viewW = w();
        this.J = viewW;
        if (viewW != null) {
            this.K = getScrollY() - this.J.getTop();
        }
    }

    private void o() {
        if (this.f42301b0.isEmpty()) {
            return;
        }
        this.f42301b0.clear();
        g0(this.f42301b0);
    }

    private void o0() {
        View view;
        View view2;
        List<View> stickyChildren = getStickyChildren();
        if (stickyChildren.isEmpty()) {
            n();
            o();
            return;
        }
        int size = stickyChildren.size();
        int iMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            stickyChildren.get(i10).setTranslationY(0.0f);
        }
        if (this.S) {
            n();
            i0(stickyChildren);
            return;
        }
        o();
        int i11 = size - 1;
        int i12 = i11;
        while (true) {
            view = null;
            if (i12 < 0) {
                view2 = null;
                break;
            }
            View view3 = stickyChildren.get(i12);
            int scrollY = getScrollY();
            if ((scrollY < 0 && view3.getTop() + scrollY <= getStickyY()) || view3.getTop() <= getStickyY()) {
                view2 = i12 != i11 ? stickyChildren.get(i12 + 1) : null;
                view = view3;
                break;
            }
            i12--;
        }
        View view4 = this.f42299a0;
        if (view != null) {
            if (view2 != null && !Z(view)) {
                iMax = Math.max(0, view.getHeight() - (view2.getTop() - getStickyY()));
            }
            C0(view, iMax);
        }
        if (view4 != view) {
            this.f42299a0 = view;
            B0(view4, view);
        }
    }

    private void p() {
        this.f42314n = computeVerticalScrollOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(int i10, int i11) {
        h hVar = this.D;
        if (hVar != null) {
            hVar.a(this, i10, i11, this.f42332y2);
        }
    }

    private void q(View view) {
        view.setVerticalScrollBarEnabled(false);
        view.setHorizontalScrollBarEnabled(false);
        view.setOverScrollMode(2);
        j1.Y1(view, false);
    }

    private void q0(View view, int i10) {
        View viewP = com.donkingliang.consecutivescroller.f.p(view);
        if (viewP instanceof AbsListView) {
            ((AbsListView) viewP).scrollListBy(i10);
            return;
        }
        boolean zX = viewP instanceof RecyclerView ? com.donkingliang.consecutivescroller.f.x((RecyclerView) viewP) : false;
        viewP.scrollBy(0, i10);
        if (zX) {
            RecyclerView recyclerView = (RecyclerView) viewP;
            recyclerView.postDelayed(new c(recyclerView), 0L);
        }
    }

    private void r(int i10) {
        if (i10 > 0) {
            x0(i10);
        } else if (i10 < 0) {
            t0(i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0123  */
    /* JADX WARN: Code duplicated, block: B:59:0x0127  */
    private void t0(int i10) {
        int iJ;
        int top;
        int i11;
        int iMax;
        int iComputeVerticalScrollOffset = computeVerticalScrollOffset();
        do {
            int i12 = this.L;
            int i13 = 0;
            if (i12 != -1) {
                View childAt = getChildAt(i12);
                top = (childAt.getTop() - this.N) - C(childAt);
                iJ = J(this.L);
                if (this.O >= 1000 || getScrollY() + getPaddingTop() + iJ <= top || Y()) {
                    this.L = -1;
                    this.M = 0;
                    this.N = 0;
                    this.O = 0;
                    setScrollState(0);
                    break;
                }
            } else {
                iJ = 0;
                top = 0;
            }
            int scrollY = getScrollY();
            if (!Y() && scrollY <= (i11 = this.f42315o) && scrollY >= 0) {
                View viewX = scrollY < i11 ? x() : getBottomView();
                if (viewX != null) {
                    awakenScrollBars();
                    int iO = com.donkingliang.consecutivescroller.f.o(viewX);
                    if (iO < 0) {
                        iMax = Math.max(i10, iO);
                        if (this.L != -1) {
                            iMax = Math.max(iMax, top - ((getScrollY() + getPaddingTop()) + iJ));
                        }
                        q0(viewX, iMax);
                    } else {
                        int iMax2 = Math.max(Math.max(i10, ((viewX.getTop() + getPaddingBottom()) - scrollY) - getHeight()), -scrollY);
                        int iMax3 = this.L != -1 ? Math.max(iMax2, top - ((getScrollY() + getPaddingTop()) + iJ)) : iMax2;
                        u0(scrollY + iMax3);
                        iMax = iMax3;
                    }
                    this.f42314n += iMax;
                    i10 -= iMax;
                    i13 = iMax;
                }
            } else if (this.B) {
                int i14 = this.f42315o;
                int i15 = scrollY - i14;
                if (scrollY <= i14 || Math.abs(i10) <= i15) {
                    dispatchNestedScroll(0, 0, 0, i10, this.H, 0);
                    int i16 = i10 + this.H[1];
                    if (i16 != 0) {
                        d0(i16);
                    }
                    i10 = 0;
                } else {
                    i13 = -i15;
                    i10 -= i13;
                    d0(i13);
                }
            } else if (!this.f42316p.isFinished()) {
                int finalY = this.f42316p.getFinalY();
                int i17 = this.f42315o;
                if (finalY < i17 && scrollY > i17) {
                    if (this.f42311k != null) {
                        P(0);
                    }
                    int i18 = this.f42315o - scrollY;
                    if (i10 < i18) {
                        i13 = i10 - i18;
                        i10 = i18;
                    }
                    this.f42314n += i10;
                    u0(scrollY + i10);
                    int i19 = i13;
                    i13 = i10;
                    i10 = i19;
                } else if (scrollY > this.f42315o) {
                    this.f42316p.forceFinished(true);
                }
            } else if (scrollY > this.f42315o) {
                this.f42316p.forceFinished(true);
            }
            if (i13 >= 0) {
                break;
            }
        } while (i10 < 0);
        int iComputeVerticalScrollOffset2 = computeVerticalScrollOffset();
        if (iComputeVerticalScrollOffset != iComputeVerticalScrollOffset2) {
            p0(iComputeVerticalScrollOffset2, iComputeVerticalScrollOffset);
        }
    }

    private void u() {
        EdgeEffect edgeEffect = this.P;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.Q.onRelease();
        }
    }

    private void u0(int i10) {
        if (i10 >= 0 || Math.abs(i10) <= Math.abs(this.f42307g)) {
            int i11 = this.f42315o;
            if (i10 > i11 && i10 > i11 + Math.abs(this.f42306f)) {
                int i12 = this.f42306f;
                i10 = i12 <= 0 ? this.f42315o : this.f42315o + i12;
            }
        } else {
            int i13 = this.f42307g;
            i10 = i13 <= 0 ? 0 : -i13;
        }
        super.scrollTo(0, i10);
    }

    private void v() {
        if (getOverScrollMode() == 2) {
            this.P = null;
            this.Q = null;
        } else if (this.P == null) {
            Context context = getContext();
            this.P = new EdgeEffect(context);
            this.Q = new EdgeEffect(context);
        }
    }

    private void x0(int i10) {
        int iJ;
        int top;
        int iMin;
        int iComputeVerticalScrollOffset = computeVerticalScrollOffset();
        do {
            int i11 = this.L;
            int iAbs = 0;
            if (i11 != -1) {
                View childAt = getChildAt(i11);
                top = (childAt.getTop() - this.N) - C(childAt);
                iJ = this.N < 0 ? J(this.L) : 0;
                if (this.O >= 1000 || getScrollY() + getPaddingTop() + iJ >= top || X()) {
                    this.L = -1;
                    this.M = 0;
                    this.N = 0;
                    this.O = 0;
                    setScrollState(0);
                    break;
                }
            } else {
                iJ = 0;
                top = 0;
            }
            int scrollY = getScrollY();
            if (!X() && scrollY >= 0) {
                View viewW = getScrollY() < this.f42315o ? w() : getBottomView();
                if (viewW != null) {
                    awakenScrollBars();
                    int iL = com.donkingliang.consecutivescroller.f.l(viewW);
                    if (iL > 0) {
                        iMin = Math.min(i10, iL);
                        if (this.L != -1) {
                            iMin = Math.min(iMin, top - ((getScrollY() + getPaddingTop()) + iJ));
                        }
                        q0(viewW, iMin);
                    } else {
                        int iMin2 = Math.min(i10, (viewW.getBottom() - getPaddingTop()) - getScrollY());
                        int iMin3 = this.L != -1 ? Math.min(iMin2, top - ((getScrollY() + getPaddingTop()) + iJ)) : iMin2;
                        u0(scrollY + iMin3);
                        iMin = iMin3;
                    }
                    this.f42314n += iMin;
                    i10 -= iMin;
                    iAbs = iMin;
                }
            } else if (this.B) {
                if (scrollY >= 0 || i10 <= Math.abs(scrollY)) {
                    dispatchNestedScroll(0, 0, 0, i10, this.H, 0);
                    if (this.H[1] == 0 && this.f42305e && this.f42306f >= 0) {
                        d0(i10);
                    }
                    i10 = 0;
                } else {
                    iAbs = i10 - Math.abs(scrollY);
                    i10 -= iAbs;
                    d0(iAbs);
                }
            } else if (!this.f42316p.isFinished() && this.f42316p.getFinalY() > 0 && scrollY < 0) {
                if (this.f42311k != null) {
                    P(0);
                }
                if (i10 > Math.abs(scrollY)) {
                    int iAbs2 = i10 - Math.abs(scrollY);
                    iAbs = i10 - iAbs2;
                    i10 = iAbs2;
                }
                this.f42314n += i10;
                u0(scrollY + i10);
                int i12 = iAbs;
                iAbs = i10;
                i10 = i12;
            } else if (scrollY < 0) {
                this.f42316p.forceFinished(true);
            }
            if (iAbs <= 0) {
                break;
            }
        } while (i10 > 0);
        int iComputeVerticalScrollOffset2 = computeVerticalScrollOffset();
        if (iComputeVerticalScrollOffset != iComputeVerticalScrollOffset2) {
            p0(iComputeVerticalScrollOffset2, iComputeVerticalScrollOffset);
        }
    }

    private void y(int i10) {
        if (Math.abs(i10) > this.f42324u) {
            float f10 = i10;
            if (dispatchNestedPreFling(0.0f, f10)) {
                return;
            }
            dispatchNestedFling(0.0f, f10, (i10 < 0 && !Y()) || (i10 > 0 && !X()));
            this.f42316p.fling(0, this.f42314n, 1, i10, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            startNestedScroll(2, 1);
            setScrollState(2);
            this.R = this.f42314n;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void D0() {
        if (this.f42316p.isFinished()) {
            return;
        }
        this.f42316p.abortAnimation();
        stopNestedScroll(1);
        if (this.L == -1) {
            setScrollState(0);
        }
    }

    public boolean E0(View view) {
        boolean z10 = this.S;
        return (!z10 && this.f42299a0 == view) || (z10 && this.f42301b0.contains(view));
    }

    int F(View view) {
        return this.f42328x1.indexOf(view);
    }

    @Override // androidx.core.view.v0
    public void G(@n0 View view, int i10, int i11, int i12, int i13, int i14) {
        e0(i13, i14);
    }

    @Override // androidx.core.view.v0
    public void O(@n0 View view, int i10, int i11, @n0 int[] iArr, int i12) {
        dispatchNestedPreScroll(i10, i11, iArr, null, i12);
    }

    protected boolean P(int i10) {
        if (i10 == 0) {
            ValueAnimator valueAnimator = this.f42311k;
            if (valueAnimator != null) {
                valueAnimator.setDuration(0L);
                this.f42311k.cancel();
                this.f42311k = null;
            }
            this.f42312l = null;
        }
        return this.f42311k != null;
    }

    public boolean Q() {
        return this.U;
    }

    public boolean R() {
        return this.T;
    }

    public boolean S() {
        return this.f42305e || this.f42307g > 0 || this.f42306f > 0;
    }

    public boolean W() {
        return this.S;
    }

    public boolean X() {
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        if (size <= 0) {
            return true;
        }
        boolean z10 = getScrollY() >= this.f42315o && !com.donkingliang.consecutivescroller.f.d(effectiveChildren.get(effectiveChildren.size() - 1), 1);
        if (z10) {
            for (int i10 = size - 1; i10 >= 0; i10--) {
                View view = effectiveChildren.get(i10);
                if (com.donkingliang.consecutivescroller.f.t(view) && com.donkingliang.consecutivescroller.f.d(view, 1)) {
                    return false;
                }
            }
        }
        return z10;
    }

    public boolean Y() {
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        if (size <= 0) {
            return true;
        }
        boolean z10 = getScrollY() <= 0 && !com.donkingliang.consecutivescroller.f.d(effectiveChildren.get(0), -1);
        if (z10) {
            for (int i10 = size - 1; i10 >= 0; i10--) {
                View view = effectiveChildren.get(i10);
                if (com.donkingliang.consecutivescroller.f.t(view) && com.donkingliang.consecutivescroller.f.d(view, -1)) {
                    return false;
                }
            }
        }
        return z10;
    }

    public boolean Z(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            return ((LayoutParams) layoutParams).f42338e;
        }
        return false;
    }

    public boolean a0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            return ((LayoutParams) layoutParams).f42336c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        List<View> scrolledViews;
        if (layoutParams instanceof LayoutParams) {
            com.donkingliang.consecutivescroller.d.a((LayoutParams) layoutParams);
        }
        super.addView(view, i10, layoutParams);
        if (com.donkingliang.consecutivescroller.f.t(view)) {
            View viewM = com.donkingliang.consecutivescroller.f.m(view);
            q(viewM);
            if ((viewM instanceof com.donkingliang.consecutivescroller.c) && (scrolledViews = ((com.donkingliang.consecutivescroller.c) viewM).getScrolledViews()) != null && !scrolledViews.isEmpty()) {
                int size = scrolledViews.size();
                for (int i11 = 0; i11 < size; i11++) {
                    q(scrolledViews.get(i11));
                }
            }
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipToPadding(false);
        }
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return i10 > 0 ? !X() : !Y();
    }

    @Override // android.view.View, androidx.core.view.f1
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.f1
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.f1
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        int i10;
        if (this.L != -1 && (i10 = this.M) != 0) {
            if (i10 > 0 && i10 < 200) {
                this.M = i10 + 5;
            }
            int i11 = this.M;
            if (i11 < 0 && i11 > -200) {
                this.M = i11 - 5;
            }
            r(this.M);
            this.O++;
            invalidate();
            return;
        }
        if (this.f42316p.computeScrollOffset()) {
            int currY = this.f42316p.getCurrY();
            int i12 = currY - this.R;
            this.R = currY;
            int[] iArr = this.I;
            iArr[1] = 0;
            dispatchNestedPreScroll(0, i12, iArr, null, 1);
            int i13 = i12 - this.I[1];
            int i14 = this.f42314n;
            r(i13);
            int i15 = this.f42314n - i14;
            int i16 = i13 - i15;
            if ((i16 < 0 && Y()) || (i16 > 0 && X())) {
                dispatchNestedScroll(0, i15, 0, i16, this.H, 1);
                i16 += this.H[1];
            }
            if ((i16 < 0 && Y()) || (i16 > 0 && X())) {
                if (this.f42305e) {
                    g(this.f42316p.getFinalY() > 0 ? this.f42316p.getCurrVelocity() : -this.f42316p.getCurrVelocity());
                    this.f42316p.forceFinished(true);
                } else {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) {
                        v();
                        if (i16 < 0) {
                            if (this.P.isFinished()) {
                                this.P.onAbsorb((int) this.f42316p.getCurrVelocity());
                            }
                        } else if (this.Q.isFinished()) {
                            this.Q.onAbsorb((int) this.f42316p.getCurrVelocity());
                        }
                    }
                    D0();
                }
            }
            invalidate();
        }
        if (this.f42332y2 == 2 && this.f42316p.isFinished()) {
            stopNestedScroll(1);
            m(false, false);
            setScrollState(0);
        }
    }

    @Override // android.view.View, androidx.core.view.f1
    public int computeVerticalScrollExtent() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    @Override // android.view.View, androidx.core.view.f1
    public int computeVerticalScrollOffset() {
        int scrollY = getScrollY();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = nonGoneChildren.get(i10);
            if (com.donkingliang.consecutivescroller.f.t(view)) {
                scrollY += com.donkingliang.consecutivescroller.f.f(view);
            }
        }
        return scrollY;
    }

    @Override // android.view.View, androidx.core.view.f1
    public int computeVerticalScrollRange() {
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int iG = 0;
        for (int i10 = 0; i10 < size; i10++) {
            View view = nonGoneChildren.get(i10);
            if (com.donkingliang.consecutivescroller.f.t(view) && com.donkingliang.consecutivescroller.f.c(view)) {
                View viewP = com.donkingliang.consecutivescroller.f.p(view);
                iG += com.donkingliang.consecutivescroller.f.g(viewP) + viewP.getPaddingTop() + viewP.getPaddingBottom();
            } else {
                int height = view.getHeight();
                iG += height;
            }
        }
        return iG;
    }

    protected void d0(float f10) {
        double dMin;
        double dMax = Math.max(this.f42302c / 2, getHeight());
        if (f10 > 0.0f) {
            double d10 = this.f42306f;
            double dMax2 = Math.max(0.0f, this.f42304d * f10);
            double d11 = -dMax2;
            if (dMax == 0.0d) {
                dMax = 1.0d;
            }
            dMin = Math.min(d10 * (1.0d - Math.pow(100.0d, d11 / dMax)), dMax2);
        } else {
            double d12 = this.f42306f;
            double d13 = -Math.min(0.0f, this.f42304d * f10);
            double d14 = -d13;
            if (dMax == 0.0d) {
                dMax = 1.0d;
            }
            dMin = -Math.min(d12 * (1.0d - Math.pow(100.0d, d14 / dMax)), d13);
        }
        int i10 = (int) dMin;
        if (Math.abs(f10) >= 1.0f && i10 == 0) {
            i10 = (int) f10;
        }
        int scrollY = getScrollY() + i10;
        this.f42314n += i10;
        u0(scrollY);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.G.a(f10, f11, z10);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.G.b(f10, f11);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i10, i11, iArr, iArr2, 0);
    }

    @Override // androidx.core.view.r0
    public boolean dispatchNestedPreScroll(int i10, int i11, @p0 int[] iArr, @p0 int[] iArr2, int i12) {
        return this.G.d(i10, i11, iArr, iArr2, i12);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.G.f(i10, i11, i12, i13, iArr);
    }

    @Override // androidx.core.view.r0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, @p0 int[] iArr, int i14) {
        return this.G.g(i10, i11, i12, i13, iArr, i14);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f7  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int iFindPointerIndex;
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (this.C == 2 && (i10 = this.E) != -1 && this.f42333z.get(Integer.valueOf(i10)) != null) {
            int iFindPointerIndex2 = motionEvent.findPointerIndex(this.E);
            if (iFindPointerIndex2 < 0 || iFindPointerIndex2 >= motionEvent.getPointerCount()) {
                return false;
            }
            motionEvent.offsetLocation(0.0f, this.f42333z.get(Integer.valueOf(this.E)).floatValue() - motionEvent.getY(iFindPointerIndex2));
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEventObtain.getActionMasked() == 0) {
            this.f42331y1 = 0;
        }
        motionEventObtain.offsetLocation(0.0f, this.f42331y1);
        P(motionEventObtain.getAction());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f42309i = 0;
            this.G3 = this.f42332y2 == 2;
            D0();
            this.B = true;
            m(false, false);
            this.C = 0;
            int pointerId = motionEvent.getPointerId(actionIndex);
            this.E = pointerId;
            this.f42333z.put(Integer.valueOf(pointerId), Float.valueOf(motionEvent.getY(actionIndex)));
            this.f42330y = (int) motionEvent.getY(actionIndex);
            this.f42327x = (int) motionEvent.getX(actionIndex);
            L();
            this.f42321r.addMovement(motionEventObtain);
            startNestedScroll(2, 0);
            this.A[0] = com.donkingliang.consecutivescroller.f.j(this, motionEvent, actionIndex);
            this.A[1] = com.donkingliang.consecutivescroller.f.k(this, motionEvent, actionIndex);
            int[] iArr = this.A;
            this.f42319p3 = T(iArr[0], iArr[1]);
            int[] iArr2 = this.A;
            this.G2 = com.donkingliang.consecutivescroller.f.v(this, iArr2[0], iArr2[1]);
        } else if (actionMasked == 1) {
            velocityTracker = this.f42321r;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEventObtain);
                this.f42321r.computeCurrentVelocity(1000, this.f42323t);
                int yVelocity = (int) this.f42321r.getYVelocity();
                this.f42309i = yVelocity;
                int i11 = this.f42323t;
                this.f42322s = Math.max(-i11, Math.min(yVelocity, i11));
                k0();
                int iJ = com.donkingliang.consecutivescroller.f.j(this, motionEvent, actionIndex);
                int iK = com.donkingliang.consecutivescroller.f.k(this, motionEvent, actionIndex);
                boolean zC = com.donkingliang.consecutivescroller.f.c(I(iJ, iK));
                boolean zU = com.donkingliang.consecutivescroller.f.u(this, iJ, iK);
                if (this.C != 1 && zC && Math.abs(yVelocity) >= this.f42324u && !zU) {
                    motionEvent.setAction(3);
                }
                if (this.C != 1 && !com.donkingliang.consecutivescroller.f.s(this) && U(motionEvent) && Math.abs(yVelocity) >= this.f42324u && (this.C == 0 || !zU)) {
                    y(-this.f42322s);
                }
            }
            this.f42330y = 0;
            this.f42327x = 0;
            this.B = false;
            int[] iArr3 = this.A;
            iArr3[0] = 0;
            iArr3[1] = 0;
            this.G2 = false;
            this.f42319p3 = false;
            f0();
        } else if (actionMasked == 2) {
            int iFindPointerIndex3 = motionEvent.findPointerIndex(this.E);
            if (iFindPointerIndex3 < 0 || iFindPointerIndex3 >= motionEvent.getPointerCount()) {
                return false;
            }
            K();
            this.f42321r.addMovement(motionEventObtain);
            int y10 = ((int) motionEvent.getY(iFindPointerIndex3)) - this.f42330y;
            int x10 = ((int) motionEvent.getX(iFindPointerIndex3)) - this.f42327x;
            if (this.C == 0 && (this.f42319p3 || U(motionEvent))) {
                if (this.T) {
                    if (Math.abs(y10) >= this.f42325v) {
                        this.C = 1;
                    }
                } else if (Math.abs(x10) > Math.abs(y10)) {
                    if (Math.abs(x10) >= this.f42325v) {
                        this.C = 2;
                        int i12 = this.E;
                        if (i12 != -1 && this.f42333z.get(Integer.valueOf(i12)) != null && (iFindPointerIndex = motionEvent.findPointerIndex(this.E)) >= 0 && iFindPointerIndex3 < motionEvent.getPointerCount()) {
                            motionEvent.offsetLocation(0.0f, this.f42333z.get(Integer.valueOf(this.E)).floatValue() - motionEvent.getY(iFindPointerIndex));
                        }
                    }
                } else if (Math.abs(y10) >= this.f42325v) {
                    this.C = 1;
                }
                if (this.C == 0) {
                    return true;
                }
            }
            this.f42330y = (int) motionEvent.getY(iFindPointerIndex3);
            this.f42327x = (int) motionEvent.getX(iFindPointerIndex3);
        } else if (actionMasked == 3) {
            velocityTracker = this.f42321r;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEventObtain);
                this.f42321r.computeCurrentVelocity(1000, this.f42323t);
                int yVelocity2 = (int) this.f42321r.getYVelocity();
                this.f42309i = yVelocity2;
                int i13 = this.f42323t;
                this.f42322s = Math.max(-i13, Math.min(yVelocity2, i13));
                k0();
                int iJ2 = com.donkingliang.consecutivescroller.f.j(this, motionEvent, actionIndex);
                int iK2 = com.donkingliang.consecutivescroller.f.k(this, motionEvent, actionIndex);
                boolean zC2 = com.donkingliang.consecutivescroller.f.c(I(iJ2, iK2));
                boolean zU2 = com.donkingliang.consecutivescroller.f.u(this, iJ2, iK2);
                if (this.C != 1) {
                    motionEvent.setAction(3);
                }
                if (this.C != 1) {
                    y(-this.f42322s);
                }
            }
            this.f42330y = 0;
            this.f42327x = 0;
            this.B = false;
            int[] iArr4 = this.A;
            iArr4[0] = 0;
            iArr4[1] = 0;
            this.G2 = false;
            this.f42319p3 = false;
            f0();
        } else if (actionMasked == 5) {
            int pointerId2 = motionEvent.getPointerId(actionIndex);
            this.E = pointerId2;
            this.f42333z.put(Integer.valueOf(pointerId2), Float.valueOf(motionEvent.getY(actionIndex)));
            this.f42330y = (int) motionEvent.getY(actionIndex);
            this.f42327x = (int) motionEvent.getX(actionIndex);
            requestDisallowInterceptTouchEvent(false);
            this.A[0] = com.donkingliang.consecutivescroller.f.j(this, motionEvent, actionIndex);
            this.A[1] = com.donkingliang.consecutivescroller.f.k(this, motionEvent, actionIndex);
            int[] iArr5 = this.A;
            this.f42319p3 = T(iArr5[0], iArr5[1]);
            int[] iArr6 = this.A;
            this.G2 = com.donkingliang.consecutivescroller.f.v(this, iArr6[0], iArr6[1]);
            K();
            this.f42321r.addMovement(motionEventObtain);
        } else if (actionMasked == 6) {
            this.f42333z.remove(Integer.valueOf(motionEvent.getPointerId(actionIndex)));
            if (this.E == motionEvent.getPointerId(actionIndex)) {
                int i14 = actionIndex == 0 ? 1 : 0;
                int pointerId3 = motionEvent.getPointerId(i14);
                this.E = pointerId3;
                this.f42333z.put(Integer.valueOf(pointerId3), Float.valueOf(motionEvent.getY(i14)));
                this.f42330y = (int) motionEvent.getY(i14);
                this.f42327x = (int) motionEvent.getX(i14);
                this.A[0] = com.donkingliang.consecutivescroller.f.j(this, motionEvent, i14);
                this.A[1] = com.donkingliang.consecutivescroller.f.k(this, motionEvent, i14);
                int[] iArr7 = this.A;
                this.f42319p3 = T(iArr7[0], iArr7[1]);
                int[] iArr8 = this.A;
                this.G2 = com.donkingliang.consecutivescroller.f.v(this, iArr8[0], iArr8[1]);
            }
            K();
            this.f42321r.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 1 || actionMasked2 == 3) {
            this.C = 0;
            this.f42322s = 0;
            this.f42333z.clear();
            this.E = -1;
            if (this.f42316p.isFinished()) {
                setScrollState(0);
            }
        }
        return zDispatchTouchEvent;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        int paddingTop;
        super.draw(canvas);
        if (this.f42317p1 != getScrollY()) {
            this.f42317p1 = getScrollY();
            o0();
        }
        if (this.P != null) {
            int scrollY = getScrollY();
            int paddingLeft2 = 0;
            if (!this.P.isFinished()) {
                int iSave = canvas.save();
                int width = getWidth();
                int height = getHeight();
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    paddingTop = getPaddingTop() + scrollY;
                } else {
                    paddingTop = scrollY;
                }
                canvas.translate(paddingLeft, paddingTop);
                this.P.setSize(width, height);
                if (this.P.draw(canvas)) {
                    j1.n1(this);
                }
                canvas.restoreToCount(iSave);
            }
            if (this.Q.isFinished()) {
                return;
            }
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int paddingBottom = scrollY + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                paddingLeft2 = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                paddingBottom -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, paddingBottom);
            canvas.rotate(180.0f, width2, 0.0f);
            this.Q.setSize(width2, height2);
            if (this.Q.draw(canvas)) {
                j1.n1(this);
            }
            canvas.restoreToCount(iSave2);
        }
    }

    protected ValueAnimator f(int i10, int i11, int i12, Interpolator interpolator, int i13) {
        if (i10 == i11) {
            return null;
        }
        ValueAnimator valueAnimator = this.f42311k;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            this.f42311k.cancel();
            this.f42311k = null;
        }
        this.f42312l = null;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i11);
        this.f42311k = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(i13);
        this.f42311k.setInterpolator(interpolator);
        this.f42311k.addListener(new b());
        this.f42311k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.donkingliang.consecutivescroller.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f42389b.b0(valueAnimator2);
            }
        });
        this.f42311k.setStartDelay(i12);
        this.f42311k.start();
        return this.f42311k;
    }

    protected void f0() {
        int scrollY = getScrollY();
        if (scrollY < 0) {
            if (this.f42311k == null) {
                f(scrollY, 0, 0, this.f42310j, this.f42308h);
            }
        } else {
            int i10 = this.f42315o;
            if (scrollY <= i10 || this.f42311k != null) {
                return;
            }
            f(scrollY, i10, 0, this.f42310j, this.f42308h);
        }
    }

    protected void g(float f10) {
        if (this.f42311k == null) {
            if (f10 < 0.0f && this.f42307g > 0) {
                this.f42312l = new f(f10, 0);
            } else {
                if (f10 <= 0.0f || this.f42306f <= 0) {
                    return;
                }
                this.f42312l = new f(f10, this.f42315o);
            }
        }
    }

    public int getAdjustHeightOffset() {
        return this.V;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        int iIndexOfChild;
        return (this.f42328x1.size() <= i11 || (iIndexOfChild = indexOfChild(this.f42328x1.get(i11))) == -1) ? super.getChildDrawingOrder(i10, i11) : iIndexOfChild;
    }

    public View getCurrentStickyView() {
        return this.f42299a0;
    }

    public List<View> getCurrentStickyViews() {
        return this.f42301b0;
    }

    @Override // android.view.ViewGroup, androidx.core.view.x0
    public int getNestedScrollAxes() {
        return this.F.a();
    }

    public g getOnPermanentStickyChangeListener() {
        return this.f42329x2;
    }

    public i getOnStickyChangeListener() {
        return this.f42318p2;
    }

    public h getOnVerticalScrollChangeListener() {
        return this.D;
    }

    public int getOwnScrollY() {
        return computeVerticalScrollOffset();
    }

    public int getScrollState() {
        return this.f42332y2;
    }

    public int getStickyOffset() {
        return this.W;
    }

    @Override // androidx.core.view.r0
    public boolean hasNestedScrollingParent(int i10) {
        return this.G.l(i10);
    }

    public void i() {
        postDelayed(new d(), 20L);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean isNestedScrollingEnabled() {
        return this.G.m();
    }

    @Override // androidx.core.view.v0
    public void j(@n0 View view, @n0 View view2, int i10, int i11) {
        this.F.c(view, view2, i10, i11);
        m(false, false);
        startNestedScroll(2, i11);
        P(0);
    }

    @Override // androidx.core.view.v0
    public boolean j0(@n0 View view, @n0 View view2, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return (layoutParams instanceof LayoutParams ? ((LayoutParams) layoutParams).f42335b : false) && (i10 & 2) != 0;
    }

    @Override // androidx.core.view.v0
    public void k(@n0 View view, int i10) {
        this.F.e(view, i10);
        stopNestedScroll(i10);
        f0();
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        com.donkingliang.consecutivescroller.d.a((LayoutParams) view.getLayoutParams());
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001f  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            M();
            this.f42320q.addMovement(motionEvent);
        } else if (actionMasked == 1) {
            stopNestedScroll(0);
            if (this.G3 && this.C == 0) {
                return true;
            }
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                stopNestedScroll(0);
                if (this.G3) {
                    return true;
                }
            }
        } else if (this.C != 2 && (this.f42319p3 || U(motionEvent))) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f42302c = getResources().getDisplayMetrics().heightPixels;
        this.f42315o = 0;
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int measuredWidth = getMeasuredWidth();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i14 = 0;
        while (i14 < size) {
            View view = nonGoneChildren.get(i14);
            int measuredHeight = view.getMeasuredHeight() + paddingTop;
            int iD = D(view, measuredWidth, paddingLeft, paddingRight);
            view.layout(iD, paddingTop, view.getMeasuredWidth() + iD, measuredHeight);
            this.f42315o += view.getHeight();
            i14++;
            paddingTop = measuredHeight;
        }
        int measuredHeight2 = this.f42315o - ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        this.f42315o = measuredHeight2;
        if (measuredHeight2 < 0) {
            this.f42315o = 0;
        }
        l(z10, false);
        A0();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        n0();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int iMax = 0;
        int measuredHeight = 0;
        for (int i12 = 0; i12 < size; i12++) {
            View view = nonGoneChildren.get(i12);
            measureChildWithMargins(view, i10, 0, i11, C(view));
            iMax = Math.max(iMax, E(view));
            measuredHeight += view.getMeasuredHeight();
        }
        setMeasuredDimension(c0(i10, iMax + getPaddingLeft() + getPaddingRight()), c0(i11, measuredHeight + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedFling(@n0 View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        y((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedPreFling(@n0 View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        O(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        e0(i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        j(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return j0(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onStopNestedScroll(View view) {
        k(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01c2  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int i10;
        if (com.donkingliang.consecutivescroller.f.s(this) || this.G2) {
            return super.onTouchEvent(motionEvent);
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        boolean z10 = false;
        if (motionEvent.getActionMasked() == 0) {
            this.f42331y1 = 0;
        }
        motionEventObtain.offsetLocation(0.0f, this.f42331y1);
        int iFindPointerIndex = motionEvent.findPointerIndex(this.E);
        if (iFindPointerIndex < 0 || iFindPointerIndex >= motionEvent.getPointerCount()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                u();
                this.f42326w = 0;
                VelocityTracker velocityTracker2 = this.f42320q;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEventObtain);
                    this.f42320q.computeCurrentVelocity(1000, this.f42323t);
                    int yVelocity = (int) this.f42320q.getYVelocity();
                    int i11 = this.f42323t;
                    int iMax = Math.max(-i11, Math.min(yVelocity, i11));
                    if (iMax == 0 && (i10 = this.f42322s) != 0) {
                        iMax = i10;
                    }
                    y(-iMax);
                    l0();
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    u();
                    this.f42326w = 0;
                    l0();
                    setScrollState(0);
                } else if (actionMasked == 5 || actionMasked == 6) {
                }
            } else {
                if (this.f42326w == 0) {
                    this.f42326w = (int) motionEvent.getY(iFindPointerIndex);
                    return true;
                }
                this.I[1] = 0;
                int y10 = (int) motionEvent.getY(iFindPointerIndex);
                int i12 = this.f42326w - y10;
                this.f42326w = y10;
                if (dispatchNestedPreScroll(0, i12, this.I, this.H, 0)) {
                    i12 -= this.I[1];
                    motionEvent.offsetLocation(0.0f, this.H[1]);
                    int i13 = this.f42331y1;
                    int i14 = this.H[1];
                    this.f42331y1 = i13 + i14;
                    this.f42326w -= i14;
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int i15 = this.f42314n;
                if (this.f42332y2 != 1) {
                    if (h() && Math.abs(i12) > 0) {
                        setScrollState(1);
                    }
                }
                if (this.f42332y2 == 1) {
                    r(i12);
                }
                int i16 = this.f42314n - i15;
                if (i16 != 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int i17 = i12 - i16;
                if (dispatchNestedScroll(0, i16, 0, i17, this.H, 0)) {
                    int i18 = this.H[1];
                    i17 += i18;
                    this.f42326w -= i18;
                    this.f42331y1 += i18;
                    motionEvent.offsetLocation(0.0f, i18);
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int scrollRange = getScrollRange();
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z10 = true;
                }
                if (z10) {
                    v();
                    int i19 = i15 + i17;
                    if (i19 < 0 && this.f42307g <= 0) {
                        androidx.core.widget.i.g(this.P, i17 / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                        if (!this.Q.isFinished()) {
                            this.Q.onRelease();
                        }
                    } else if (i19 > scrollRange && this.f42306f <= 0) {
                        androidx.core.widget.i.g(this.Q, i17 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                        if (!this.P.isFinished()) {
                            this.P.onRelease();
                        }
                    }
                    EdgeEffect edgeEffect = this.P;
                    if (edgeEffect != null && (!edgeEffect.isFinished() || !this.Q.isFinished())) {
                        j1.n1(this);
                    }
                }
            }
            velocityTracker = this.f42320q;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEventObtain);
            }
            motionEventObtain.recycle();
            return true;
        }
        startNestedScroll(2, 0);
        this.f42326w = (int) motionEvent.getY(iFindPointerIndex);
        velocityTracker = this.f42320q;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    void r0(View view) {
        int iF;
        do {
            iF = 0;
            int iL = com.donkingliang.consecutivescroller.f.l(view);
            if (iL > 0) {
                int iF2 = com.donkingliang.consecutivescroller.f.f(view);
                q0(view, iL);
                iF = iF2 - com.donkingliang.consecutivescroller.f.f(view);
            }
        } while (iF != 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    public void s(boolean z10) {
        this.f42305e = z10;
        if (!z10) {
            this.f42307g = 0;
            this.f42306f = 0;
            return;
        }
        int iA = com.donkingliang.consecutivescroller.g.a(180.0f);
        if (this.f42307g <= 0) {
            this.f42307g = iA;
        }
        if (this.f42306f <= 0) {
            this.f42306f = iA;
        }
    }

    void s0(View view) {
        int iF;
        do {
            iF = 0;
            int iO = com.donkingliang.consecutivescroller.f.o(view);
            if (iO < 0) {
                int iF2 = com.donkingliang.consecutivescroller.f.f(view);
                q0(view, iO);
                iF = iF2 - com.donkingliang.consecutivescroller.f.f(view);
            }
        } while (iF != 0);
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        scrollTo(0, this.f42314n + i11);
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        r(i11 - this.f42314n);
    }

    public void setAdjustHeightOffset(int i10) {
        if (this.V != i10) {
            this.V = i10;
            requestLayout();
        }
    }

    public void setAutoAdjustHeightAtBottomView(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            requestLayout();
        }
    }

    public void setDisableChildHorizontalScroll(boolean z10) {
        this.T = z10;
    }

    @Override // android.view.View, androidx.core.view.t0
    public void setNestedScrollingEnabled(boolean z10) {
        this.G.p(z10);
    }

    public void setOnPermanentStickyChangeListener(g gVar) {
        this.f42329x2 = gVar;
    }

    @Override // android.view.View
    @Deprecated
    public void setOnScrollChangeListener(View.OnScrollChangeListener onScrollChangeListener) {
    }

    public void setOnStickyChangeListener(i iVar) {
        this.f42318p2 = iVar;
    }

    public void setOnVerticalScrollChangeListener(h hVar) {
        this.D = hVar;
    }

    public void setOverDragMaxDistanceOfBottom(int i10) {
        if (S()) {
            this.f42306f = i10;
        } else {
            t(true, this.f42307g, i10);
        }
    }

    public void setOverDragMaxDistanceOfTop(int i10) {
        if (S()) {
            this.f42307g = i10;
        } else {
            t(true, i10, this.f42306f);
        }
    }

    public void setOverDragRate(float f10) {
        this.f42304d = f10;
    }

    public void setPermanent(boolean z10) {
        if (this.S != z10) {
            this.S = z10;
            if (this.U) {
                requestLayout();
            } else {
                o0();
            }
        }
    }

    void setScrollState(int i10) {
        if (i10 == this.f42332y2) {
            return;
        }
        this.f42332y2 = i10;
        int iComputeVerticalScrollOffset = computeVerticalScrollOffset();
        p0(iComputeVerticalScrollOffset, iComputeVerticalScrollOffset);
    }

    public void setStickyOffset(int i10) {
        if (this.W != i10) {
            this.W = i10;
            o0();
        }
    }

    @Override // androidx.core.view.r0
    public boolean startNestedScroll(int i10, int i11) {
        return this.G.s(i10, i11);
    }

    @Override // android.view.View, androidx.core.view.t0
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // androidx.core.view.r0
    public void stopNestedScroll(int i10) {
        this.G.u(i10);
    }

    public void t(boolean z10, int i10, int i11) {
        this.f42305e = z10;
        if (z10) {
            this.f42307g = i10;
            this.f42306f = i11;
        } else {
            this.f42307g = 0;
            this.f42306f = 0;
        }
    }

    public void v0(View view) {
        w0(view, 0);
    }

    public View w() {
        int scrollY = getScrollY() + getPaddingTop();
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = effectiveChildren.get(i10);
            if (view.getTop() <= scrollY && view.getBottom() > scrollY) {
                return view;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    public void w0(View view, int i10) {
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild != -1) {
            int top = (view.getTop() - i10) - C(view);
            byte b10 = 0;
            if (i10 < 0) {
                int iJ = J(iIndexOfChild);
                if (getScrollY() + getPaddingTop() + iJ > top) {
                    b10 = -1;
                } else if (getScrollY() + getPaddingTop() + iJ < top) {
                    b10 = 1;
                }
            } else if (getScrollY() + getPaddingTop() > top) {
                b10 = -1;
            } else if (getScrollY() + getPaddingTop() < top) {
                b10 = 1;
            } else if (com.donkingliang.consecutivescroller.f.d(view, -1)) {
                b10 = -1;
            }
            if (b10 != 0) {
                this.L = iIndexOfChild;
                D0();
                this.N = i10;
                setScrollState(2);
                do {
                    if (b10 < 0) {
                        r(-200);
                    } else {
                        r(200);
                    }
                    this.O++;
                } while (this.L != -1);
            }
        }
    }

    public View x() {
        int height = (getHeight() - getPaddingBottom()) + getScrollY();
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = effectiveChildren.get(i10);
            if (view.getTop() < height && view.getBottom() >= height) {
                return view;
            }
        }
        return null;
    }

    public void y0(View view) {
        z0(view, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    public void z0(View view, int i10) {
        int iIndexOfChild = indexOfChild(view);
        byte b10 = -1;
        if (iIndexOfChild != -1) {
            int top = (view.getTop() - i10) - C(view);
            if (i10 < 0) {
                int iJ = J(iIndexOfChild);
                if (getScrollY() + getPaddingTop() + iJ <= top) {
                    if (getScrollY() + getPaddingTop() + iJ < top) {
                        b10 = 1;
                    } else {
                        b10 = 0;
                    }
                }
            } else if (getScrollY() + getPaddingTop() <= top) {
                if (getScrollY() + getPaddingTop() < top) {
                    b10 = 1;
                } else if (!com.donkingliang.consecutivescroller.f.d(view, -1)) {
                    b10 = 0;
                }
            }
            if (b10 != 0) {
                this.L = iIndexOfChild;
                D0();
                this.N = i10;
                setScrollState(2);
                if (b10 < 0) {
                    this.M = -50;
                } else {
                    this.M = 50;
                }
                invalidate();
            }
        }
    }
}
