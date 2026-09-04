package com.mcxtzhang.swipemenulib;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;

/* JADX INFO: loaded from: classes13.dex */
public class SwipeMenuLayout extends ViewGroup {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f96207v = "zxt/SwipeMenuLayout";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static SwipeMenuLayout f96208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static boolean f96209x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f96210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f96211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f96212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f96213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f96214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f96215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f96216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PointF f96217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f96218j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PointF f96219k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f96220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private VelocityTracker f96221m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Log f96222n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f96223o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f96224p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f96225q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f96226r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ValueAnimator f96227s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ValueAnimator f96228t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f96229u;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SwipeMenuLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SwipeMenuLayout.this.f96229u = true;
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SwipeMenuLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SwipeMenuLayout.this.f96229u = false;
        }
    }

    public SwipeMenuLayout(Context context) {
        this(context, null);
    }

    public SwipeMenuLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeMenuLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f96217i = new PointF();
        this.f96218j = true;
        this.f96219k = new PointF();
        e(context, attributeSet, i10);
    }

    private void b(MotionEvent motionEvent) {
        if (this.f96221m == null) {
            this.f96221m = VelocityTracker.obtain();
        }
        this.f96221m.addMovement(motionEvent);
    }

    private void c() {
        ValueAnimator valueAnimator = this.f96228t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f96228t.cancel();
        }
        ValueAnimator valueAnimator2 = this.f96227s;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            return;
        }
        this.f96227s.cancel();
    }

    private void d(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                if (marginLayoutParams.height == -1) {
                    int i13 = marginLayoutParams.width;
                    marginLayoutParams.width = childAt.getMeasuredWidth();
                    measureChildWithMargins(childAt, i11, 0, iMakeMeasureSpec, 0);
                    marginLayoutParams.width = i13;
                }
            }
        }
    }

    private void e(Context context, AttributeSet attributeSet, int i10) {
        this.f96210b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f96211c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f96223o = true;
        this.f96224p = true;
        this.f96226r = true;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.f96206a, i10, 0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == R.styleable.SwipeMenuLayout_swipeEnable) {
                this.f96223o = typedArrayObtainStyledAttributes.getBoolean(index, true);
            } else if (index == R.styleable.SwipeMenuLayout_ios) {
                this.f96224p = typedArrayObtainStyledAttributes.getBoolean(index, true);
            } else if (index == R.styleable.SwipeMenuLayout_leftSwipe) {
                this.f96226r = typedArrayObtainStyledAttributes.getBoolean(index, true);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static SwipeMenuLayout getViewCache() {
        return f96208w;
    }

    private void j() {
        VelocityTracker velocityTracker = this.f96221m;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.f96221m.recycle();
            this.f96221m = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:53:0x00de  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float xVelocity;
        if (this.f96223o) {
            b(motionEvent);
            VelocityTracker velocityTracker = this.f96221m;
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f96220l = false;
                this.f96218j = true;
                this.f96225q = false;
                if (f96209x) {
                    return false;
                }
                f96209x = true;
                this.f96217i.set(motionEvent.getRawX(), motionEvent.getRawY());
                this.f96219k.set(motionEvent.getRawX(), motionEvent.getRawY());
                SwipeMenuLayout swipeMenuLayout = f96208w;
                if (swipeMenuLayout != null) {
                    if (swipeMenuLayout != this) {
                        swipeMenuLayout.m();
                        this.f96225q = this.f96224p;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f96212d = motionEvent.getPointerId(0);
            } else if (action == 1) {
                if (Math.abs(motionEvent.getRawX() - this.f96219k.x) > this.f96210b) {
                    this.f96220l = true;
                }
                if (!this.f96225q) {
                    velocityTracker.computeCurrentVelocity(1000, this.f96211c);
                    xVelocity = velocityTracker.getXVelocity(this.f96212d);
                    if (Math.abs(xVelocity) > 1000.0f) {
                        if (xVelocity < -1000.0f) {
                            if (this.f96226r) {
                                n();
                            } else {
                                m();
                            }
                        } else if (this.f96226r) {
                            m();
                        } else {
                            n();
                        }
                    } else if (Math.abs(getScrollX()) > this.f96215g) {
                        n();
                    } else {
                        m();
                    }
                }
                j();
                f96209x = false;
            } else if (action != 2) {
                if (action == 3) {
                    if (Math.abs(motionEvent.getRawX() - this.f96219k.x) > this.f96210b) {
                        this.f96220l = true;
                    }
                    if (!this.f96225q) {
                        velocityTracker.computeCurrentVelocity(1000, this.f96211c);
                        xVelocity = velocityTracker.getXVelocity(this.f96212d);
                        if (Math.abs(xVelocity) > 1000.0f) {
                            if (xVelocity < -1000.0f) {
                                if (this.f96226r) {
                                    n();
                                } else {
                                    m();
                                }
                            } else if (this.f96226r) {
                                m();
                            } else {
                                n();
                            }
                        } else if (Math.abs(getScrollX()) > this.f96215g) {
                            n();
                        } else {
                            m();
                        }
                    }
                    j();
                    f96209x = false;
                }
            } else if (!this.f96225q) {
                float rawX = this.f96217i.x - motionEvent.getRawX();
                if (Math.abs(rawX) > 10.0f || Math.abs(getScrollX()) > 10) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (Math.abs(rawX) > this.f96210b) {
                    this.f96218j = false;
                }
                scrollBy((int) rawX, 0);
                if (this.f96226r) {
                    if (getScrollX() < 0) {
                        scrollTo(0, 0);
                    }
                    int scrollX = getScrollX();
                    int i10 = this.f96214f;
                    if (scrollX > i10) {
                        scrollTo(i10, 0);
                    }
                } else {
                    int scrollX2 = getScrollX();
                    int i11 = this.f96214f;
                    if (scrollX2 < (-i11)) {
                        scrollTo(-i11, 0);
                    }
                    if (getScrollX() > 0) {
                        scrollTo(0, 0);
                    }
                }
                this.f96217i.set(motionEvent.getRawX(), motionEvent.getRawY());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean f() {
        return this.f96224p;
    }

    public boolean g() {
        return this.f96226r;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public boolean h() {
        return this.f96223o;
    }

    public void i() {
        if (this == f96208w) {
            c();
            f96208w.scrollTo(0, 0);
            f96208w = null;
        }
    }

    public SwipeMenuLayout k(boolean z10) {
        this.f96224p = z10;
        return this;
    }

    public SwipeMenuLayout l(boolean z10) {
        this.f96226r = z10;
        return this;
    }

    public void m() {
        f96208w = null;
        View view = this.f96216h;
        if (view != null) {
            view.setLongClickable(true);
        }
        c();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getScrollX(), 0);
        this.f96228t = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new c());
        this.f96228t.setInterpolator(new AccelerateInterpolator());
        this.f96228t.addListener(new d());
        this.f96228t.setDuration(300L).start();
    }

    public void n() {
        f96208w = this;
        View view = this.f96216h;
        if (view != null) {
            view.setLongClickable(false);
        }
        c();
        int[] iArr = new int[2];
        iArr[0] = getScrollX();
        iArr[1] = this.f96226r ? this.f96214f : -this.f96214f;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
        this.f96227s = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new a());
        this.f96227s.setInterpolator(new OvershootInterpolator());
        this.f96227s.addListener(new b());
        this.f96227s.setDuration(300L).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        SwipeMenuLayout swipeMenuLayout = f96208w;
        if (this == swipeMenuLayout) {
            swipeMenuLayout.m();
            f96208w = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f96223o) {
            int action = motionEvent.getAction();
            if (action == 1) {
                if (this.f96226r) {
                    if (getScrollX() > this.f96210b && motionEvent.getX() < getWidth() - getScrollX()) {
                        if (this.f96218j) {
                            m();
                        }
                        return true;
                    }
                } else if ((-getScrollX()) > this.f96210b && motionEvent.getX() > (-getScrollX())) {
                    if (this.f96218j) {
                        m();
                    }
                    return true;
                }
                if (this.f96220l) {
                    return true;
                }
            } else if (action == 2 && Math.abs(motionEvent.getRawX() - this.f96219k.x) > this.f96210b) {
                return true;
            }
            if (this.f96225q) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft() + 0;
        int paddingLeft2 = getPaddingLeft() + 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                if (i14 == 0 || this.f96226r) {
                    childAt.layout(paddingLeft, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft, getPaddingTop() + childAt.getMeasuredHeight());
                    int measuredWidth = childAt.getMeasuredWidth();
                    paddingLeft += measuredWidth;
                } else {
                    childAt.layout(paddingLeft2 - childAt.getMeasuredWidth(), getPaddingTop(), paddingLeft2, getPaddingTop() + childAt.getMeasuredHeight());
                    paddingLeft2 -= childAt.getMeasuredWidth();
                }
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setClickable(true);
        this.f96214f = 0;
        this.f96213e = 0;
        int childCount = getChildCount();
        boolean z10 = View.MeasureSpec.getMode(i11) != 1073741824;
        int measuredWidth = 0;
        boolean z11 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            childAt.setClickable(true);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                this.f96213e = Math.max(this.f96213e, childAt.getMeasuredHeight());
                if (z10 && marginLayoutParams.height == -1) {
                    z11 = true;
                }
                if (i12 > 0) {
                    this.f96214f += childAt.getMeasuredWidth();
                } else {
                    this.f96216h = childAt;
                    measuredWidth = childAt.getMeasuredWidth();
                }
            }
        }
        setMeasuredDimension(getPaddingLeft() + getPaddingRight() + measuredWidth, this.f96213e + getPaddingTop() + getPaddingBottom());
        this.f96215g = (this.f96214f * 4) / 10;
        if (z11) {
            d(childCount, i10);
        }
    }

    @Override // android.view.View
    public boolean performLongClick() {
        if (Math.abs(getScrollX()) > this.f96210b) {
            return false;
        }
        return super.performLongClick();
    }

    public void setSwipeEnable(boolean z10) {
        this.f96223o = z10;
    }
}
