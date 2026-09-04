package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.annotation.j1;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.t0;
import androidx.core.view.u0;
import androidx.core.view.x0;
import androidx.core.view.y0;
import androidx.core.widget.m;

/* JADX INFO: loaded from: classes6.dex */
public class SwipeRefreshLayout extends ViewGroup implements x0, t0 {
    private static final int G2 = 64;
    public static final int P = 0;
    public static final int Q = 1;
    public static final int R = -1;

    @j1
    static final int S = 40;

    @j1
    static final int T = 56;
    private static final int V = 255;
    private static final int W = 76;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final float f27514a0 = 2.0f;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f27515b0 = -1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final float f27516c0 = 0.5f;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final float f27517p1 = 0.8f;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f27518p2 = 200;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final int f27520x1 = 150;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f27521x2 = 200;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final int f27522y1 = 300;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final int f27523y2 = -328966;
    int A;
    int B;
    androidx.swiperefreshlayout.widget.a C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    private Animation H;
    boolean I;
    private int J;
    boolean K;
    private i L;
    private Animation.AnimationListener M;
    private final Animation N;
    private final Animation O;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f27524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j f27525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f27526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f27528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f27529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y0 f27530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u0 f27531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f27532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f27533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f27534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f27536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f27537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f27538p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f27539q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f27540r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f27541s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f27542t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final DecelerateInterpolator f27543u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    CircleImageView f27544v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f27545w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int f27546x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    float f27547y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected int f27548z;
    private static final String U = SwipeRefreshLayout.class.getSimpleName();

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int[] f27519p3 = {R.attr.enabled};

    public class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f27526d) {
                swipeRefreshLayout.n();
                return;
            }
            swipeRefreshLayout.C.setAlpha(255);
            SwipeRefreshLayout.this.C.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.I && (jVar = swipeRefreshLayout2.f27525c) != null) {
                jVar.a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f27536n = swipeRefreshLayout3.f27544v.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f10);
        }
    }

    public class c extends Animation {
        c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
        }
    }

    public class d extends Animation {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27553c;

        d(int i10, int i11) {
            this.f27552b = i10;
            this.f27553c = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            androidx.swiperefreshlayout.widget.a aVar = SwipeRefreshLayout.this.C;
            int i10 = this.f27552b;
            aVar.setAlpha((int) (i10 + ((this.f27553c - i10) * f10)));
        }
    }

    public class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f27541s) {
                return;
            }
            swipeRefreshLayout.t(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.K ? swipeRefreshLayout.A - Math.abs(swipeRefreshLayout.f27548z) : swipeRefreshLayout.A;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i10 = swipeRefreshLayout2.f27546x;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i10 + ((int) ((iAbs - i10) * f10))) - swipeRefreshLayout2.f27544v.getTop());
            SwipeRefreshLayout.this.C.u(1.0f - f10);
        }
    }

    public class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.l(f10);
        }
    }

    public class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f11 = swipeRefreshLayout.f27547y;
            swipeRefreshLayout.setAnimationProgress(f11 + ((-f11) * f10));
            SwipeRefreshLayout.this.l(f10);
        }
    }

    public interface i {
        boolean a(@n0 SwipeRefreshLayout swipeRefreshLayout, @p0 View view);
    }

    public interface j {
        void a();
    }

    public SwipeRefreshLayout(@n0 Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27526d = false;
        this.f27528f = -1.0f;
        this.f27532j = new int[2];
        this.f27533k = new int[2];
        this.f27540r = -1;
        this.f27545w = -1;
        this.M = new a();
        this.N = new f();
        this.O = new g();
        this.f27527e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f27535m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f27543u = new DecelerateInterpolator(f27514a0);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.J = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.A = i10;
        this.f27528f = i10;
        this.f27530h = new y0(this);
        this.f27531i = new u0(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.J;
        this.f27536n = i11;
        this.f27548z = i11;
        l(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f27519p3);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a(int i10, Animation.AnimationListener animationListener) {
        this.f27546x = i10;
        this.N.reset();
        this.N.setDuration(200L);
        this.N.setInterpolator(this.f27543u);
        if (animationListener != null) {
            this.f27544v.setAnimationListener(animationListener);
        }
        this.f27544v.clearAnimation();
        this.f27544v.startAnimation(this.N);
    }

    private void b(int i10, Animation.AnimationListener animationListener) {
        if (this.f27541s) {
            u(i10, animationListener);
            return;
        }
        this.f27546x = i10;
        this.O.reset();
        this.O.setDuration(200L);
        this.O.setInterpolator(this.f27543u);
        if (animationListener != null) {
            this.f27544v.setAnimationListener(animationListener);
        }
        this.f27544v.clearAnimation();
        this.f27544v.startAnimation(this.O);
    }

    private void d() {
        this.f27544v = new CircleImageView(getContext(), f27523y2);
        androidx.swiperefreshlayout.widget.a aVar = new androidx.swiperefreshlayout.widget.a(getContext());
        this.C = aVar;
        aVar.E(1);
        this.f27544v.setImageDrawable(this.C);
        this.f27544v.setVisibility(8);
        addView(this.f27544v);
    }

    private void e() {
        if (this.f27524b == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f27544v)) {
                    this.f27524b = childAt;
                    return;
                }
            }
        }
    }

    private void f(float f10) {
        if (f10 > this.f27528f) {
            o(true, true);
            return;
        }
        this.f27526d = false;
        this.C.B(0.0f, 0.0f);
        b(this.f27536n, this.f27541s ? null : new e());
        this.C.t(false);
    }

    private boolean g(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void i(float f10) {
        this.C.t(true);
        float fMin = Math.min(1.0f, Math.abs(f10 / this.f27528f));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.f27528f;
        int i10 = this.B;
        if (i10 <= 0) {
            i10 = this.K ? this.A - this.f27548z : this.A;
        }
        float f11 = i10;
        double dMax = Math.max(0.0f, Math.min(fAbs, f11 * f27514a0) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * f27514a0;
        int i11 = this.f27548z + ((int) ((f11 * fMin) + (f11 * fPow * f27514a0)));
        if (this.f27544v.getVisibility() != 0) {
            this.f27544v.setVisibility(0);
        }
        if (!this.f27541s) {
            this.f27544v.setScaleX(1.0f);
            this.f27544v.setScaleY(1.0f);
        }
        if (this.f27541s) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f27528f));
        }
        if (f10 < this.f27528f) {
            if (this.C.getAlpha() > 76 && !g(this.F)) {
                s();
            }
        } else if (this.C.getAlpha() < 255 && !g(this.G)) {
            r();
        }
        this.C.B(0.0f, Math.min(f27517p1, fMax * f27517p1));
        this.C.u(Math.min(1.0f, fMax));
        this.C.y((((fMax * 0.4f) - 0.25f) + (fPow * f27514a0)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f27536n);
    }

    private void m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f27540r) {
            this.f27540r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void o(boolean z10, boolean z11) {
        if (this.f27526d != z10) {
            this.I = z11;
            e();
            this.f27526d = z10;
            if (z10) {
                a(this.f27536n, this.M);
            } else {
                t(this.M);
            }
        }
    }

    private Animation p(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.f27544v.setAnimationListener(null);
        this.f27544v.clearAnimation();
        this.f27544v.startAnimation(dVar);
        return dVar;
    }

    private void q(float f10) {
        float f11 = this.f27538p;
        float f12 = f10 - f11;
        int i10 = this.f27527e;
        if (f12 <= i10 || this.f27539q) {
            return;
        }
        this.f27537o = f11 + i10;
        this.f27539q = true;
        this.C.setAlpha(76);
    }

    private void r() {
        this.G = p(this.C.getAlpha(), 255);
    }

    private void s() {
        this.F = p(this.C.getAlpha(), 76);
    }

    private void setColorViewAlpha(int i10) {
        this.f27544v.getBackground().setAlpha(i10);
        this.C.setAlpha(i10);
    }

    private void u(int i10, Animation.AnimationListener animationListener) {
        this.f27546x = i10;
        this.f27547y = this.f27544v.getScaleX();
        h hVar = new h();
        this.H = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f27544v.setAnimationListener(animationListener);
        }
        this.f27544v.clearAnimation();
        this.f27544v.startAnimation(this.H);
    }

    private void v(Animation.AnimationListener animationListener) {
        this.f27544v.setVisibility(0);
        this.C.setAlpha(255);
        b bVar = new b();
        this.D = bVar;
        bVar.setDuration(this.f27535m);
        if (animationListener != null) {
            this.f27544v.setAnimationListener(animationListener);
        }
        this.f27544v.clearAnimation();
        this.f27544v.startAnimation(this.D);
    }

    public boolean c() {
        i iVar = this.L;
        if (iVar != null) {
            return iVar.a(this, this.f27524b);
        }
        View view = this.f27524b;
        return view instanceof ListView ? m.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f27531i.a(f10, f11, z10);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f27531i.b(f10, f11);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f27531i.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f27531i.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f27545w;
        if (i12 < 0) {
            return i11;
        }
        if (i11 == i10 - 1) {
            return i12;
        }
        return i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup, androidx.core.view.x0
    public int getNestedScrollAxes() {
        return this.f27530h.a();
    }

    public int getProgressCircleDiameter() {
        return this.J;
    }

    public int getProgressViewEndOffset() {
        return this.A;
    }

    public int getProgressViewStartOffset() {
        return this.f27548z;
    }

    public boolean h() {
        return this.f27526d;
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean hasNestedScrollingParent() {
        return this.f27531i.k();
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean isNestedScrollingEnabled() {
        return this.f27531i.m();
    }

    void l(float f10) {
        int i10 = this.f27546x;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.f27548z - i10) * f10))) - this.f27544v.getTop());
    }

    void n() {
        this.f27544v.clearAnimation();
        this.C.stop();
        this.f27544v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f27541s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f27548z - this.f27536n);
        }
        this.f27536n = this.f27544v.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f27542t && actionMasked == 0) {
            this.f27542t = false;
        }
        if (!isEnabled() || this.f27542t || c() || this.f27526d || this.f27534l) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f27548z - this.f27544v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f27540r = pointerId;
            this.f27539q = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f27538p = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f27539q = false;
            this.f27540r = -1;
        } else if (actionMasked == 2) {
            int i10 = this.f27540r;
            if (i10 == -1) {
                Log.e(U, "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i10);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            q(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked == 3) {
            this.f27539q = false;
            this.f27540r = -1;
        } else if (actionMasked == 6) {
            m(motionEvent);
        }
        return this.f27539q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f27524b == null) {
            e();
        }
        View view = this.f27524b;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f27544v.getMeasuredWidth();
        int measuredHeight2 = this.f27544v.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f27536n;
        this.f27544v.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f27524b == null) {
            e();
        }
        View view = this.f27524b;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f27544v.measure(View.MeasureSpec.makeMeasureSpec(this.J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.J, 1073741824));
        this.f27545w = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f27544v) {
                this.f27545w = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f27529g;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = i11 - ((int) f10);
                    this.f27529g = 0.0f;
                } else {
                    this.f27529g = f10 - f11;
                    iArr[1] = i11;
                }
                i(this.f27529g);
            }
        }
        if (this.K && i11 > 0 && this.f27529g == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f27544v.setVisibility(8);
        }
        int[] iArr2 = this.f27532j;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        dispatchNestedScroll(i10, i11, i12, i13, this.f27533k);
        int i14 = i13 + this.f27533k[1];
        if (i14 >= 0 || c()) {
            return;
        }
        float fAbs = this.f27529g + Math.abs(i14);
        this.f27529g = fAbs;
        i(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f27530h.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f27529g = 0.0f;
        this.f27534l = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f27542t || this.f27526d || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onStopNestedScroll(View view) {
        this.f27530h.d(view);
        this.f27534l = false;
        float f10 = this.f27529g;
        if (f10 > 0.0f) {
            f(f10);
            this.f27529g = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f27542t && actionMasked == 0) {
            this.f27542t = false;
        }
        if (!isEnabled() || this.f27542t || c() || this.f27526d || this.f27534l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f27540r = motionEvent.getPointerId(0);
            this.f27539q = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f27540r);
                if (iFindPointerIndex < 0) {
                    Log.e(U, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f27539q) {
                    float y10 = (motionEvent.getY(iFindPointerIndex) - this.f27537o) * 0.5f;
                    this.f27539q = false;
                    f(y10);
                }
                this.f27540r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f27540r);
                if (iFindPointerIndex2 < 0) {
                    Log.e(U, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y11 = motionEvent.getY(iFindPointerIndex2);
                q(y11);
                if (this.f27539q) {
                    float f10 = (y11 - this.f27537o) * 0.5f;
                    if (f10 <= 0.0f) {
                        return false;
                    }
                    i(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(U, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f27540r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    m(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        View view = this.f27524b;
        if (view == null || androidx.core.view.j1.W0(view)) {
            super.requestDisallowInterceptTouchEvent(z10);
        }
    }

    void setAnimationProgress(float f10) {
        this.f27544v.setScaleX(f10);
        this.f27544v.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(@n int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@l int... iArr) {
        e();
        this.C.x(iArr);
    }

    public void setColorSchemeResources(@n int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = androidx.core.content.d.f(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f27528f = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        n();
    }

    @Override // android.view.View, androidx.core.view.t0
    public void setNestedScrollingEnabled(boolean z10) {
        this.f27531i.p(z10);
    }

    public void setOnChildScrollUpCallback(@p0 i iVar) {
        this.L = iVar;
    }

    public void setOnRefreshListener(@p0 j jVar) {
        this.f27525c = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(@l int i10) {
        this.f27544v.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(@n int i10) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.d.f(getContext(), i10));
    }

    public void setProgressViewEndTarget(boolean z10, int i10) {
        this.A = i10;
        this.f27541s = z10;
        this.f27544v.invalidate();
    }

    public void setProgressViewOffset(boolean z10, int i10, int i11) {
        this.f27541s = z10;
        this.f27548z = i10;
        this.A = i11;
        this.K = true;
        n();
        this.f27526d = false;
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.f27526d == z10) {
            o(z10, false);
            return;
        }
        this.f27526d = z10;
        setTargetOffsetTopAndBottom((!this.K ? this.A + this.f27548z : this.A) - this.f27536n);
        this.I = false;
        v(this.M);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.J = (int) (displayMetrics.density * 40.0f);
            }
            this.f27544v.setImageDrawable(null);
            this.C.E(i10);
            this.f27544v.setImageDrawable(this.C);
        }
    }

    public void setSlingshotDistance(@androidx.annotation.t0 int i10) {
        this.B = i10;
    }

    void setTargetOffsetTopAndBottom(int i10) {
        this.f27544v.bringToFront();
        androidx.core.view.j1.f1(this.f27544v, i10);
        this.f27536n = this.f27544v.getTop();
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean startNestedScroll(int i10) {
        return this.f27531i.r(i10);
    }

    @Override // android.view.View, androidx.core.view.t0
    public void stopNestedScroll() {
        this.f27531i.t();
    }

    void t(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.E = cVar;
        cVar.setDuration(150L);
        this.f27544v.setAnimationListener(animationListener);
        this.f27544v.clearAnimation();
        this.f27544v.startAnimation(this.E);
    }
}
