package com.scwang.smartrefresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.n;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.j1;
import androidx.core.view.u0;
import androidx.core.view.x0;
import androidx.core.view.y0;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;
import com.scwang.smartrefresh.layout.header.BezierRadarHeader;
import com.scwang.smartrefresh.layout.impl.RefreshFooterWrapper;
import com.scwang.smartrefresh.layout.impl.RefreshHeaderWrapper;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"RestrictedApi"})
public class SmartRefreshLayout extends ViewGroup implements ng.j, x0 {

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    protected static ng.a f96580l4;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    protected static ng.b f96581m4;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    protected static ng.c f96582n4;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    protected static ViewGroup.MarginLayoutParams f96583o4 = new ViewGroup.MarginLayoutParams(-1, -1);
    protected Interpolator A;
    protected int[] B;
    protected boolean C;
    protected boolean D;
    protected boolean E;
    protected boolean F;
    protected boolean G;
    protected u0 G2;
    protected int G3;
    protected boolean H;
    protected boolean I;
    protected boolean J;
    protected og.a J3;
    protected boolean K;
    protected int K3;
    protected boolean L;
    protected og.a L3;
    protected boolean M;
    protected int M3;
    protected boolean N;
    protected int N3;
    protected boolean O;
    protected float O3;
    protected boolean P;
    protected float P3;
    protected boolean Q;
    protected float Q3;
    protected boolean R;
    protected float R3;
    protected boolean S;
    protected ng.h S3;
    protected boolean T;
    protected ng.h T3;
    protected boolean U;
    protected ng.e U3;
    protected boolean V;
    protected Paint V3;
    protected boolean W;
    protected Handler W3;
    protected ng.i X3;
    protected RefreshState Y3;
    protected RefreshState Z3;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected boolean f96584a0;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    protected long f96585a4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f96586b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected boolean f96587b0;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    protected int f96588b4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f96589c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    protected pg.d f96590c0;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    protected int f96591c4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f96592d;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    protected boolean f96593d4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f96594e;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    protected boolean f96595e4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f96596f;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    protected boolean f96597f4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f96598g;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    protected boolean f96599g4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f96600h;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    protected boolean f96601h4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected float f96602i;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    protected MotionEvent f96603i4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected float f96604j;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    protected Runnable f96605j4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f96606k;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    protected ValueAnimator f96607k4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected float f96608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected float f96609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected char f96610n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected boolean f96611o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected boolean f96612p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    protected pg.b f96613p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    protected int f96614p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    protected y0 f96615p3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f96616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected int f96617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected int f96618s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected int f96619t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f96620u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected int f96621v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected int f96622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int f96623x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    protected pg.c f96624x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    protected boolean f96625x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected Scroller f96626y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    protected ng.k f96627y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    protected int[] f96628y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected VelocityTracker f96629z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f96630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public og.b f96631b;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f96630a = 0;
            this.f96631b = null;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f96630a = 0;
            this.f96631b = null;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f96578f);
            this.f96630a = typedArrayObtainStyledAttributes.getColor(R.styleable.SmartRefreshLayout_Layout_layout_srlBackgroundColor, this.f96630a);
            int i10 = R.styleable.SmartRefreshLayout_Layout_layout_srlSpinnerStyle;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                this.f96631b = og.b.f132315i[typedArrayObtainStyledAttributes.getInt(i10, og.b.f132310d.f132316a)];
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f96632a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f96632a = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96632a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f96632a[RefreshState.PullUpToLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f96632a[RefreshState.PullDownCanceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f96632a[RefreshState.PullUpCanceled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f96632a[RefreshState.ReleaseToRefresh.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f96632a[RefreshState.ReleaseToLoad.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f96632a[RefreshState.ReleaseToTwoLevel.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f96632a[RefreshState.RefreshReleased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f96632a[RefreshState.LoadReleased.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f96632a[RefreshState.Refreshing.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f96632a[RefreshState.Loading.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f96633b;

        b(boolean z10) {
            this.f96633b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout.this.setStateDirectLoading(this.f96633b);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f96635b;

        c(boolean z10) {
            this.f96635b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout.this.f96585a4 = System.currentTimeMillis();
                SmartRefreshLayout.this.A0(RefreshState.Refreshing);
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                pg.d dVar = smartRefreshLayout.f96590c0;
                if (dVar != null) {
                    if (this.f96635b) {
                        dVar.k(smartRefreshLayout);
                    }
                } else if (smartRefreshLayout.f96624x1 == null) {
                    smartRefreshLayout.A(3000);
                }
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                ng.h hVar = smartRefreshLayout2.S3;
                if (hVar != null) {
                    int i10 = smartRefreshLayout2.G3;
                    hVar.p(smartRefreshLayout2, i10, (int) (smartRefreshLayout2.O3 * i10));
                }
                SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                pg.c cVar = smartRefreshLayout3.f96624x1;
                if (cVar == null || !(smartRefreshLayout3.S3 instanceof ng.g)) {
                    return;
                }
                if (this.f96635b) {
                    cVar.k(smartRefreshLayout3);
                }
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                pg.c cVar2 = smartRefreshLayout4.f96624x1;
                ng.g gVar = (ng.g) smartRefreshLayout4.S3;
                int i11 = smartRefreshLayout4.G3;
                cVar2.l(gVar, i11, (int) (smartRefreshLayout4.O3 * i11));
            }
        }
    }

    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RefreshState refreshState;
            RefreshState refreshState2;
            if (animator == null || animator.getDuration() != 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                smartRefreshLayout.f96607k4 = null;
                if (smartRefreshLayout.f96589c == 0 && (refreshState = smartRefreshLayout.Y3) != (refreshState2 = RefreshState.None) && !refreshState.isOpening && !refreshState.isDragging) {
                    smartRefreshLayout.A0(refreshState2);
                    return;
                }
                RefreshState refreshState3 = smartRefreshLayout.Y3;
                if (refreshState3 != smartRefreshLayout.Z3) {
                    smartRefreshLayout.setViceState(refreshState3);
                }
            }
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f96607k4 != null) {
                smartRefreshLayout.X3.j(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
            }
        }
    }

    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            pg.b bVar = smartRefreshLayout.f96613p1;
            if (bVar != null) {
                bVar.f(smartRefreshLayout);
            } else if (smartRefreshLayout.f96624x1 == null) {
                smartRefreshLayout.p(2000);
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            pg.c cVar = smartRefreshLayout2.f96624x1;
            if (cVar != null) {
                cVar.f(smartRefreshLayout2);
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f96640b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f96641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f96642d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f96643e;

        g(int i10, Boolean bool, boolean z10) {
            this.f96641c = i10;
            this.f96642d = bool;
            this.f96643e = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = this.f96640b;
            if (i10 == 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                RefreshState refreshState = smartRefreshLayout.Y3;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && smartRefreshLayout.Z3 == RefreshState.Refreshing) {
                    smartRefreshLayout.Z3 = refreshState2;
                } else {
                    ValueAnimator valueAnimator = smartRefreshLayout.f96607k4;
                    if (valueAnimator != null && refreshState.isHeader && (refreshState.isDragging || refreshState == RefreshState.RefreshReleased)) {
                        valueAnimator.setDuration(0L);
                        SmartRefreshLayout.this.f96607k4.cancel();
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        smartRefreshLayout2.f96607k4 = null;
                        if (smartRefreshLayout2.X3.c(0) == null) {
                            SmartRefreshLayout.this.A0(refreshState2);
                        } else {
                            SmartRefreshLayout.this.A0(RefreshState.PullDownCanceled);
                        }
                    } else if (refreshState == RefreshState.Refreshing && smartRefreshLayout.S3 != null && smartRefreshLayout.U3 != null) {
                        this.f96640b = i10 + 1;
                        smartRefreshLayout.W3.postDelayed(this, this.f96641c);
                        SmartRefreshLayout.this.A0(RefreshState.RefreshFinish);
                        if (this.f96642d == Boolean.FALSE) {
                            SmartRefreshLayout.this.setNoMoreData(false);
                        }
                    }
                }
                if (this.f96642d == Boolean.TRUE) {
                    SmartRefreshLayout.this.setNoMoreData(true);
                    return;
                }
                return;
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int iG = smartRefreshLayout3.S3.g(smartRefreshLayout3, this.f96643e);
            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
            pg.c cVar = smartRefreshLayout4.f96624x1;
            if (cVar != null) {
                ng.h hVar = smartRefreshLayout4.S3;
                if (hVar instanceof ng.g) {
                    cVar.d((ng.g) hVar, this.f96643e);
                }
            }
            if (iG < Integer.MAX_VALUE) {
                SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                if (smartRefreshLayout5.f96611o || smartRefreshLayout5.f96625x2) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.f96611o) {
                        float f10 = smartRefreshLayout6.f96608l;
                        smartRefreshLayout6.f96604j = f10;
                        smartRefreshLayout6.f96594e = 0;
                        smartRefreshLayout6.f96611o = false;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout6.f96606k, (f10 + smartRefreshLayout6.f96589c) - (smartRefreshLayout6.f96586b * 2), 0));
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout7.f96606k, smartRefreshLayout7.f96608l + smartRefreshLayout7.f96589c, 0));
                    }
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (smartRefreshLayout8.f96625x2) {
                        smartRefreshLayout8.f96614p2 = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout8.f96606k, smartRefreshLayout8.f96608l, 0));
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        smartRefreshLayout9.f96625x2 = false;
                        smartRefreshLayout9.f96594e = 0;
                    }
                }
                SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                int i11 = smartRefreshLayout10.f96589c;
                if (i11 <= 0) {
                    if (i11 < 0) {
                        smartRefreshLayout10.u0(0, iG, smartRefreshLayout10.A, smartRefreshLayout10.f96598g);
                        return;
                    } else {
                        smartRefreshLayout10.X3.j(0, false);
                        SmartRefreshLayout.this.X3.f(RefreshState.None);
                        return;
                    }
                }
                ValueAnimator valueAnimatorU0 = smartRefreshLayout10.u0(0, iG, smartRefreshLayout10.A, smartRefreshLayout10.f96598g);
                SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListenerD = smartRefreshLayout11.P ? smartRefreshLayout11.U3.d(smartRefreshLayout11.f96589c) : null;
                if (valueAnimatorU0 == null || animatorUpdateListenerD == null) {
                    return;
                }
                valueAnimatorU0.addUpdateListener(animatorUpdateListenerD);
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f96645b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f96646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f96647d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f96648e;

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f96650b;

            /* JADX INFO: renamed from: com.scwang.smartrefresh.layout.SmartRefreshLayout$h$a$a, reason: collision with other inner class name */
            public class C0919a extends AnimatorListenerAdapter {
                C0919a() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (animator == null || animator.getDuration() != 0) {
                        h hVar = h.this;
                        SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                        smartRefreshLayout.f96599g4 = false;
                        if (hVar.f96647d) {
                            smartRefreshLayout.setNoMoreData(true);
                        }
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        if (smartRefreshLayout2.Y3 == RefreshState.LoadFinish) {
                            smartRefreshLayout2.A0(RefreshState.None);
                        }
                    }
                }
            }

            a(int i10) {
                this.f96650b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                ValueAnimator.AnimatorUpdateListener animatorUpdateListenerD;
                ValueAnimator valueAnimatorC;
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (!smartRefreshLayout.O || this.f96650b >= 0) {
                    animatorUpdateListenerD = null;
                } else {
                    animatorUpdateListenerD = smartRefreshLayout.U3.d(smartRefreshLayout.f96589c);
                    if (animatorUpdateListenerD != null) {
                        animatorUpdateListenerD.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
                    }
                }
                C0919a c0919a = new C0919a();
                h hVar = h.this;
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                int i10 = smartRefreshLayout2.f96589c;
                if (i10 > 0) {
                    valueAnimatorC = smartRefreshLayout2.X3.c(0);
                } else {
                    if (animatorUpdateListenerD != null || i10 == 0) {
                        ValueAnimator valueAnimator = smartRefreshLayout2.f96607k4;
                        if (valueAnimator != null) {
                            valueAnimator.setDuration(0L);
                            SmartRefreshLayout.this.f96607k4.cancel();
                            SmartRefreshLayout.this.f96607k4 = null;
                        }
                        SmartRefreshLayout.this.X3.j(0, false);
                        SmartRefreshLayout.this.X3.f(RefreshState.None);
                    } else if (hVar.f96647d && smartRefreshLayout2.I) {
                        int i11 = smartRefreshLayout2.K3;
                        if (i10 >= (-i11)) {
                            smartRefreshLayout2.A0(RefreshState.None);
                        } else {
                            valueAnimatorC = smartRefreshLayout2.X3.c(-i11);
                        }
                    } else {
                        valueAnimatorC = smartRefreshLayout2.X3.c(0);
                    }
                    valueAnimatorC = null;
                }
                if (valueAnimatorC != null) {
                    valueAnimatorC.addListener(c0919a);
                } else {
                    c0919a.onAnimationEnd(null);
                }
            }
        }

        h(int i10, boolean z10, boolean z11) {
            this.f96646c = i10;
            this.f96647d = z10;
            this.f96648e = z11;
        }

        /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            int i10 = this.f96645b;
            if (i10 == 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                RefreshState refreshState = smartRefreshLayout.Y3;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && smartRefreshLayout.Z3 == RefreshState.Loading) {
                    smartRefreshLayout.Z3 = refreshState2;
                } else {
                    ValueAnimator valueAnimator = smartRefreshLayout.f96607k4;
                    if (valueAnimator != null && ((refreshState.isDragging || refreshState == RefreshState.LoadReleased) && refreshState.isFooter)) {
                        valueAnimator.setDuration(0L);
                        SmartRefreshLayout.this.f96607k4.cancel();
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        smartRefreshLayout2.f96607k4 = null;
                        if (smartRefreshLayout2.X3.c(0) == null) {
                            SmartRefreshLayout.this.A0(refreshState2);
                        } else {
                            SmartRefreshLayout.this.A0(RefreshState.PullUpCanceled);
                        }
                    } else if (refreshState == RefreshState.Loading && smartRefreshLayout.T3 != null && smartRefreshLayout.U3 != null) {
                        this.f96645b = i10 + 1;
                        smartRefreshLayout.W3.postDelayed(this, this.f96646c);
                        SmartRefreshLayout.this.A0(RefreshState.LoadFinish);
                        return;
                    }
                }
                if (this.f96647d) {
                    SmartRefreshLayout.this.setNoMoreData(true);
                    return;
                }
                return;
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int iG = smartRefreshLayout3.T3.g(smartRefreshLayout3, this.f96648e);
            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
            pg.c cVar = smartRefreshLayout4.f96624x1;
            if (cVar != null) {
                ng.h hVar = smartRefreshLayout4.T3;
                if (hVar instanceof ng.f) {
                    cVar.c((ng.f) hVar, this.f96648e);
                }
            }
            if (iG < Integer.MAX_VALUE) {
                if (this.f96647d) {
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    z10 = smartRefreshLayout5.I && smartRefreshLayout5.f96589c < 0 && smartRefreshLayout5.U3.g();
                }
                SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                int i11 = smartRefreshLayout6.f96589c;
                int iMax = i11 - (z10 ? Math.max(i11, -smartRefreshLayout6.K3) : 0);
                SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                if (smartRefreshLayout7.f96611o || smartRefreshLayout7.f96625x2) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (smartRefreshLayout8.f96611o) {
                        float f10 = smartRefreshLayout8.f96608l;
                        smartRefreshLayout8.f96604j = f10;
                        smartRefreshLayout8.f96594e = smartRefreshLayout8.f96589c - iMax;
                        smartRefreshLayout8.f96611o = false;
                        float f11 = smartRefreshLayout8.H ? iMax : 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout8.f96606k, f10 + f11 + (smartRefreshLayout8.f96586b * 2), 0));
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout9.f96606k, smartRefreshLayout9.f96608l + f11, 0));
                    }
                    SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                    if (smartRefreshLayout10.f96625x2) {
                        smartRefreshLayout10.f96614p2 = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout10.f96606k, smartRefreshLayout10.f96608l, 0));
                        SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                        smartRefreshLayout11.f96625x2 = false;
                        smartRefreshLayout11.f96594e = 0;
                    }
                }
                SmartRefreshLayout.this.W3.postDelayed(new a(iMax), SmartRefreshLayout.this.f96589c < 0 ? iG : 0L);
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f96653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f96654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f96655d;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.f96607k4 == null || smartRefreshLayout.S3 == null) {
                    return;
                }
                smartRefreshLayout.X3.j(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
            }
        }

        public class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    smartRefreshLayout.f96607k4 = null;
                    if (smartRefreshLayout.S3 == null) {
                        smartRefreshLayout.X3.f(RefreshState.None);
                        return;
                    }
                    RefreshState refreshState = smartRefreshLayout.Y3;
                    RefreshState refreshState2 = RefreshState.ReleaseToRefresh;
                    if (refreshState != refreshState2) {
                        smartRefreshLayout.X3.f(refreshState2);
                    }
                    i iVar = i.this;
                    SmartRefreshLayout.this.setStateRefreshing(!iVar.f96655d);
                }
            }
        }

        i(float f10, int i10, boolean z10) {
            this.f96653b = f10;
            this.f96654c = i10;
            this.f96655d = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.Z3 != RefreshState.Refreshing) {
                return;
            }
            ValueAnimator valueAnimator = smartRefreshLayout.f96607k4;
            if (valueAnimator != null) {
                valueAnimator.setDuration(0L);
                SmartRefreshLayout.this.f96607k4.cancel();
                SmartRefreshLayout.this.f96607k4 = null;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            smartRefreshLayout2.f96606k = smartRefreshLayout2.getMeasuredWidth() / 2.0f;
            SmartRefreshLayout.this.X3.f(RefreshState.PullDownToRefresh);
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            smartRefreshLayout3.f96607k4 = ValueAnimator.ofInt(smartRefreshLayout3.f96589c, (int) (smartRefreshLayout3.G3 * this.f96653b));
            SmartRefreshLayout.this.f96607k4.setDuration(this.f96654c);
            SmartRefreshLayout.this.f96607k4.setInterpolator(new com.scwang.smartrefresh.layout.util.b(com.scwang.smartrefresh.layout.util.b.f96793b));
            SmartRefreshLayout.this.f96607k4.addUpdateListener(new a());
            SmartRefreshLayout.this.f96607k4.addListener(new b());
            SmartRefreshLayout.this.f96607k4.start();
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f96659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f96660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f96661d;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.f96607k4 == null || smartRefreshLayout.T3 == null) {
                    return;
                }
                smartRefreshLayout.X3.j(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
            }
        }

        public class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    smartRefreshLayout.f96607k4 = null;
                    if (smartRefreshLayout.T3 == null) {
                        smartRefreshLayout.X3.f(RefreshState.None);
                        return;
                    }
                    RefreshState refreshState = smartRefreshLayout.Y3;
                    RefreshState refreshState2 = RefreshState.ReleaseToLoad;
                    if (refreshState != refreshState2) {
                        smartRefreshLayout.X3.f(refreshState2);
                    }
                    j jVar = j.this;
                    SmartRefreshLayout.this.setStateLoading(!jVar.f96661d);
                }
            }
        }

        j(float f10, int i10, boolean z10) {
            this.f96659b = f10;
            this.f96660c = i10;
            this.f96661d = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.Z3 != RefreshState.Loading) {
                return;
            }
            ValueAnimator valueAnimator = smartRefreshLayout.f96607k4;
            if (valueAnimator != null) {
                valueAnimator.setDuration(0L);
                SmartRefreshLayout.this.f96607k4.cancel();
                SmartRefreshLayout.this.f96607k4 = null;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            smartRefreshLayout2.f96606k = smartRefreshLayout2.getMeasuredWidth() / 2.0f;
            SmartRefreshLayout.this.X3.f(RefreshState.PullUpToLoad);
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            smartRefreshLayout3.f96607k4 = ValueAnimator.ofInt(smartRefreshLayout3.f96589c, -((int) (smartRefreshLayout3.K3 * this.f96659b)));
            SmartRefreshLayout.this.f96607k4.setDuration(this.f96660c);
            SmartRefreshLayout.this.f96607k4.setInterpolator(new com.scwang.smartrefresh.layout.util.b(com.scwang.smartrefresh.layout.util.b.f96793b));
            SmartRefreshLayout.this.f96607k4.addUpdateListener(new a());
            SmartRefreshLayout.this.f96607k4.addListener(new b());
            SmartRefreshLayout.this.f96607k4.start();
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f96667d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f96670g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f96665b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f96666c = 10;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f96669f = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f96668e = AnimationUtils.currentAnimationTimeMillis();

        k(float f10, int i10) {
            this.f96670g = f10;
            this.f96667d = i10;
            SmartRefreshLayout.this.W3.postDelayed(this, this.f96666c);
            if (f10 > 0.0f) {
                SmartRefreshLayout.this.X3.f(RefreshState.PullDownToRefresh);
            } else {
                SmartRefreshLayout.this.X3.f(RefreshState.PullUpToLoad);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f96605j4 != this || smartRefreshLayout.Y3.isFinishing) {
                return;
            }
            if (Math.abs(smartRefreshLayout.f96589c) < Math.abs(this.f96667d)) {
                double d10 = this.f96670g;
                int i10 = this.f96665b + 1;
                this.f96665b = i10;
                this.f96670g = (float) (d10 * Math.pow(0.949999988079071d, i10 * 2));
            } else if (this.f96667d != 0) {
                double d11 = this.f96670g;
                int i11 = this.f96665b + 1;
                this.f96665b = i11;
                this.f96670g = (float) (d11 * Math.pow(0.44999998807907104d, i11 * 2));
            } else {
                double d12 = this.f96670g;
                int i12 = this.f96665b + 1;
                this.f96665b = i12;
                this.f96670g = (float) (d12 * Math.pow(0.8500000238418579d, i12 * 2));
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f10 = this.f96670g * (((jCurrentAnimationTimeMillis - this.f96668e) * 1.0f) / 1000.0f);
            if (Math.abs(f10) >= 1.0f) {
                this.f96668e = jCurrentAnimationTimeMillis;
                float f11 = this.f96669f + f10;
                this.f96669f = f11;
                SmartRefreshLayout.this.z0(f11);
                SmartRefreshLayout.this.W3.postDelayed(this, this.f96666c);
                return;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            RefreshState refreshState = smartRefreshLayout2.Z3;
            boolean z10 = refreshState.isDragging;
            if (z10 && refreshState.isHeader) {
                smartRefreshLayout2.X3.f(RefreshState.PullDownCanceled);
            } else if (z10 && refreshState.isFooter) {
                smartRefreshLayout2.X3.f(RefreshState.PullUpCanceled);
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            smartRefreshLayout3.f96605j4 = null;
            if (Math.abs(smartRefreshLayout3.f96589c) >= Math.abs(this.f96667d)) {
                int iMin = Math.min(Math.max((int) com.scwang.smartrefresh.layout.util.b.j(Math.abs(SmartRefreshLayout.this.f96589c - this.f96667d)), 30), 100) * 10;
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                smartRefreshLayout4.u0(this.f96667d, 0, smartRefreshLayout4.A, iMin);
            }
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f96672b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f96675e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f96673c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f96674d = 10;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f96676f = 0.98f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f96677g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f96678h = AnimationUtils.currentAnimationTimeMillis();

        l(float f10) {
            this.f96675e = f10;
            this.f96672b = SmartRefreshLayout.this.f96589c;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x004b  */
        /* JADX WARN: Code duplicated, block: B:33:0x0059  */
        /* JADX WARN: Code duplicated, block: B:36:0x0065  */
        /* JADX WARN: Code duplicated, block: B:40:0x0093  */
        /* JADX WARN: Code duplicated, block: B:48:0x00a3 A[LOOP:0: B:34:0x0061->B:48:0x00a3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:52:0x008b A[SYNTHETIC] */
        public Runnable a() {
            SmartRefreshLayout smartRefreshLayout;
            int i10;
            int i11;
            float fPow;
            int i12;
            float f10;
            RefreshState refreshState;
            RefreshState refreshState2;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            RefreshState refreshState3 = smartRefreshLayout2.Y3;
            if (refreshState3.isFinishing) {
                return null;
            }
            if (smartRefreshLayout2.f96589c != 0) {
                if (refreshState3.isOpening || (smartRefreshLayout2.U && smartRefreshLayout2.I && smartRefreshLayout2.V && smartRefreshLayout2.x0(smartRefreshLayout2.D))) {
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.Y3 == RefreshState.Loading || (smartRefreshLayout3.U && smartRefreshLayout3.I && smartRefreshLayout3.V && smartRefreshLayout3.x0(smartRefreshLayout3.D))) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        if (smartRefreshLayout4.f96589c >= (-smartRefreshLayout4.K3)) {
                            smartRefreshLayout = SmartRefreshLayout.this;
                            if (smartRefreshLayout.Y3 == RefreshState.Refreshing && smartRefreshLayout.f96589c > smartRefreshLayout.G3) {
                                i10 = 0;
                                i11 = SmartRefreshLayout.this.f96589c;
                                fPow = this.f96675e;
                                i12 = i11;
                                while (i11 * i12 > 0) {
                                    i10++;
                                    fPow = (float) (((double) fPow) * Math.pow(this.f96676f, (this.f96674d * i10) / 10.0f));
                                    f10 = ((this.f96674d * 1.0f) / 1000.0f) * fPow;
                                    if (Math.abs(f10) < 1.0f) {
                                        SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                                        refreshState = smartRefreshLayout5.Y3;
                                        if (!refreshState.isOpening && ((refreshState != (refreshState2 = RefreshState.Refreshing) || i12 <= smartRefreshLayout5.G3) && (refreshState == refreshState2 || i12 >= (-smartRefreshLayout5.K3)))) {
                                            break;
                                            break;
                                        }
                                        return null;
                                    }
                                    i12 = (int) (i12 + f10);
                                }
                            }
                        } else {
                            i10 = 0;
                            i11 = SmartRefreshLayout.this.f96589c;
                            fPow = this.f96675e;
                            i12 = i11;
                            while (i11 * i12 > 0) {
                                i10++;
                                fPow = (float) (((double) fPow) * Math.pow(this.f96676f, (this.f96674d * i10) / 10.0f));
                                f10 = ((this.f96674d * 1.0f) / 1000.0f) * fPow;
                                if (Math.abs(f10) < 1.0f) {
                                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                                    refreshState = smartRefreshLayout6.Y3;
                                    if (!refreshState.isOpening) {
                                    }
                                    return null;
                                }
                                i12 = (int) (i12 + f10);
                            }
                        }
                    } else {
                        smartRefreshLayout = SmartRefreshLayout.this;
                        if (smartRefreshLayout.Y3 == RefreshState.Refreshing) {
                            i10 = 0;
                            i11 = SmartRefreshLayout.this.f96589c;
                            fPow = this.f96675e;
                            i12 = i11;
                            while (i11 * i12 > 0) {
                                i10++;
                                fPow = (float) (((double) fPow) * Math.pow(this.f96676f, (this.f96674d * i10) / 10.0f));
                                f10 = ((this.f96674d * 1.0f) / 1000.0f) * fPow;
                                if (Math.abs(f10) < 1.0f) {
                                    SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                                    refreshState = smartRefreshLayout7.Y3;
                                    if (!refreshState.isOpening) {
                                    }
                                    return null;
                                }
                                i12 = (int) (i12 + f10);
                            }
                        }
                    }
                } else {
                    i10 = 0;
                    i11 = SmartRefreshLayout.this.f96589c;
                    fPow = this.f96675e;
                    i12 = i11;
                    while (i11 * i12 > 0) {
                        i10++;
                        fPow = (float) (((double) fPow) * Math.pow(this.f96676f, (this.f96674d * i10) / 10.0f));
                        f10 = ((this.f96674d * 1.0f) / 1000.0f) * fPow;
                        if (Math.abs(f10) < 1.0f) {
                            SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                            refreshState = smartRefreshLayout8.Y3;
                            if (!refreshState.isOpening) {
                            }
                            return null;
                        }
                        i12 = (int) (i12 + f10);
                    }
                }
            }
            this.f96677g = AnimationUtils.currentAnimationTimeMillis();
            SmartRefreshLayout.this.W3.postDelayed(this, this.f96674d);
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f96605j4 != this || smartRefreshLayout.Y3.isFinishing) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j10 = jCurrentAnimationTimeMillis - this.f96678h;
            float fPow = (float) (((double) this.f96675e) * Math.pow(this.f96676f, (jCurrentAnimationTimeMillis - this.f96677g) / (1000.0f / this.f96674d)));
            this.f96675e = fPow;
            float f10 = fPow * ((j10 * 1.0f) / 1000.0f);
            if (Math.abs(f10) <= 1.0f) {
                SmartRefreshLayout.this.f96605j4 = null;
                return;
            }
            this.f96678h = jCurrentAnimationTimeMillis;
            int i10 = (int) (this.f96672b + f10);
            this.f96672b = i10;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            if (smartRefreshLayout2.f96589c * i10 > 0) {
                smartRefreshLayout2.X3.j(i10, true);
                SmartRefreshLayout.this.W3.postDelayed(this, this.f96674d);
                return;
            }
            smartRefreshLayout2.f96605j4 = null;
            smartRefreshLayout2.X3.j(0, true);
            com.scwang.smartrefresh.layout.util.b.e(SmartRefreshLayout.this.U3.h(), (int) (-this.f96675e));
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            if (!smartRefreshLayout3.f96599g4 || f10 <= 0.0f) {
                return;
            }
            smartRefreshLayout3.f96599g4 = false;
        }
    }

    public class m implements ng.i {

        public class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout.this.X3.f(RefreshState.TwoLevel);
                }
            }
        }

        public m() {
        }

        @Override // ng.i
        public ng.i a(@n0 ng.h hVar, int i10) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.V3 == null && i10 != 0) {
                smartRefreshLayout.V3 = new Paint();
            }
            if (hVar.equals(SmartRefreshLayout.this.S3)) {
                SmartRefreshLayout.this.f96588b4 = i10;
            } else if (hVar.equals(SmartRefreshLayout.this.T3)) {
                SmartRefreshLayout.this.f96591c4 = i10;
            }
            return this;
        }

        @Override // ng.i
        public ng.i b(@n0 ng.h hVar) {
            if (hVar.equals(SmartRefreshLayout.this.S3)) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                og.a aVar = smartRefreshLayout.J3;
                if (aVar.f132309b) {
                    smartRefreshLayout.J3 = aVar.c();
                }
            } else if (hVar.equals(SmartRefreshLayout.this.T3)) {
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                og.a aVar2 = smartRefreshLayout2.L3;
                if (aVar2.f132309b) {
                    smartRefreshLayout2.L3 = aVar2.c();
                }
            }
            return this;
        }

        @Override // ng.i
        public ValueAnimator c(int i10) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            return smartRefreshLayout.u0(i10, 0, smartRefreshLayout.A, smartRefreshLayout.f96598g);
        }

        @Override // ng.i
        @n0
        public ng.j d() {
            return SmartRefreshLayout.this;
        }

        @Override // ng.i
        public ng.i e(@n0 ng.h hVar, boolean z10) {
            if (hVar.equals(SmartRefreshLayout.this.S3)) {
                SmartRefreshLayout.this.f96593d4 = z10;
            } else if (hVar.equals(SmartRefreshLayout.this.T3)) {
                SmartRefreshLayout.this.f96595e4 = z10;
            }
            return this;
        }

        @Override // ng.i
        public ng.i f(@n0 RefreshState refreshState) {
            switch (a.f96632a[refreshState.ordinal()]) {
                case 1:
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    RefreshState refreshState2 = smartRefreshLayout.Y3;
                    RefreshState refreshState3 = RefreshState.None;
                    if (refreshState2 != refreshState3 && smartRefreshLayout.f96589c == 0) {
                        smartRefreshLayout.A0(refreshState3);
                    } else if (smartRefreshLayout.f96589c != 0) {
                        c(0);
                    }
                    break;
                case 2:
                    SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout2.Y3.isOpening && smartRefreshLayout2.x0(smartRefreshLayout2.C)) {
                        SmartRefreshLayout.this.A0(RefreshState.PullDownToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownToRefresh);
                    }
                    break;
                case 3:
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.x0(smartRefreshLayout3.D)) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        RefreshState refreshState4 = smartRefreshLayout4.Y3;
                        if (!refreshState4.isOpening && !refreshState4.isFinishing && (!smartRefreshLayout4.U || !smartRefreshLayout4.I || !smartRefreshLayout4.V)) {
                            smartRefreshLayout4.A0(RefreshState.PullUpToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpToLoad);
                    break;
                case 4:
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout5.Y3.isOpening && smartRefreshLayout5.x0(smartRefreshLayout5.C)) {
                        SmartRefreshLayout.this.A0(RefreshState.PullDownCanceled);
                        f(RefreshState.None);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownCanceled);
                    }
                    break;
                case 5:
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.x0(smartRefreshLayout6.D)) {
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        if (!smartRefreshLayout7.Y3.isOpening && (!smartRefreshLayout7.U || !smartRefreshLayout7.I || !smartRefreshLayout7.V)) {
                            smartRefreshLayout7.A0(RefreshState.PullUpCanceled);
                            f(RefreshState.None);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpCanceled);
                    break;
                case 6:
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout8.Y3.isOpening && smartRefreshLayout8.x0(smartRefreshLayout8.C)) {
                        SmartRefreshLayout.this.A0(RefreshState.ReleaseToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToRefresh);
                    }
                    break;
                case 7:
                    SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                    if (smartRefreshLayout9.x0(smartRefreshLayout9.D)) {
                        SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                        RefreshState refreshState5 = smartRefreshLayout10.Y3;
                        if (!refreshState5.isOpening && !refreshState5.isFinishing && (!smartRefreshLayout10.U || !smartRefreshLayout10.I || !smartRefreshLayout10.V)) {
                            smartRefreshLayout10.A0(RefreshState.ReleaseToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToLoad);
                    break;
                case 8:
                    SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout11.Y3.isOpening && smartRefreshLayout11.x0(smartRefreshLayout11.C)) {
                        SmartRefreshLayout.this.A0(RefreshState.ReleaseToTwoLevel);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToTwoLevel);
                    }
                    break;
                case 9:
                    SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout12.Y3.isOpening && smartRefreshLayout12.x0(smartRefreshLayout12.C)) {
                        SmartRefreshLayout.this.A0(RefreshState.RefreshReleased);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.RefreshReleased);
                    }
                    break;
                case 10:
                    SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout13.Y3.isOpening && smartRefreshLayout13.x0(smartRefreshLayout13.D)) {
                        SmartRefreshLayout.this.A0(RefreshState.LoadReleased);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.LoadReleased);
                    }
                    break;
                case 11:
                    SmartRefreshLayout.this.setStateRefreshing(true);
                    break;
                case 12:
                    SmartRefreshLayout.this.setStateLoading(true);
                    break;
                default:
                    SmartRefreshLayout.this.A0(refreshState);
                    break;
            }
            return null;
        }

        @Override // ng.i
        public ng.i g() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.Y3 == RefreshState.TwoLevel) {
                smartRefreshLayout.X3.f(RefreshState.TwoLevelFinish);
                if (SmartRefreshLayout.this.f96589c == 0) {
                    j(0, false);
                    SmartRefreshLayout.this.A0(RefreshState.None);
                } else {
                    c(0).setDuration(SmartRefreshLayout.this.f96596f);
                }
            }
            return this;
        }

        @Override // ng.i
        public ng.i h(int i10) {
            SmartRefreshLayout.this.f96596f = i10;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0023  */
        @Override // ng.i
        public ng.i i(boolean z10) {
            if (z10) {
                a aVar = new a();
                ValueAnimator valueAnimatorC = c(SmartRefreshLayout.this.getMeasuredHeight());
                if (valueAnimatorC != null) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    if (valueAnimatorC == smartRefreshLayout.f96607k4) {
                        valueAnimatorC.setDuration(smartRefreshLayout.f96596f);
                        valueAnimatorC.addListener(aVar);
                    } else {
                        aVar.onAnimationEnd(null);
                    }
                } else {
                    aVar.onAnimationEnd(null);
                }
            } else if (c(0) == null) {
                SmartRefreshLayout.this.A0(RefreshState.None);
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:45:0x0099  */
        @Override // ng.i
        public ng.i j(int i10, boolean z10) {
            pg.c cVar;
            pg.c cVar2;
            int i11;
            boolean z11;
            ng.h hVar;
            ng.h hVar2;
            SmartRefreshLayout smartRefreshLayout;
            ng.h hVar3;
            ng.h hVar4;
            ng.h hVar5;
            ng.h hVar6;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            if (smartRefreshLayout2.f96589c == i10 && (((hVar5 = smartRefreshLayout2.S3) == null || !hVar5.j()) && ((hVar6 = SmartRefreshLayout.this.T3) == null || !hVar6.j()))) {
                return this;
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int i12 = smartRefreshLayout3.f96589c;
            smartRefreshLayout3.f96589c = i10;
            if (z10) {
                RefreshState refreshState = smartRefreshLayout3.Z3;
                if (refreshState.isDragging || refreshState.isOpening) {
                    if (i10 > smartRefreshLayout3.G3 * smartRefreshLayout3.Q3) {
                        if (smartRefreshLayout3.Y3 != RefreshState.ReleaseToTwoLevel) {
                            smartRefreshLayout3.X3.f(RefreshState.ReleaseToRefresh);
                        }
                    } else if ((-i10) > smartRefreshLayout3.K3 * smartRefreshLayout3.R3 && !smartRefreshLayout3.U) {
                        smartRefreshLayout3.X3.f(RefreshState.ReleaseToLoad);
                    } else if (i10 < 0 && !smartRefreshLayout3.U) {
                        smartRefreshLayout3.X3.f(RefreshState.PullUpToLoad);
                    } else if (i10 > 0) {
                        smartRefreshLayout3.X3.f(RefreshState.PullDownToRefresh);
                    }
                }
            }
            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
            if (smartRefreshLayout4.U3 != null) {
                if (i10 < 0 || (hVar4 = smartRefreshLayout4.S3) == null) {
                    i11 = 0;
                    z11 = false;
                } else if (smartRefreshLayout4.y0(smartRefreshLayout4.G, hVar4)) {
                    i11 = i10;
                    z11 = true;
                } else if (i12 < 0) {
                    z11 = true;
                    i11 = 0;
                } else {
                    i11 = 0;
                    z11 = false;
                }
                if (i10 <= 0 && (hVar3 = (smartRefreshLayout = SmartRefreshLayout.this).T3) != null) {
                    if (smartRefreshLayout.y0(smartRefreshLayout.H, hVar3)) {
                        i11 = i10;
                        z11 = true;
                    } else if (i12 > 0) {
                        z11 = true;
                        i11 = 0;
                    }
                }
                if (z11) {
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    smartRefreshLayout5.U3.f(i11, smartRefreshLayout5.f96619t, smartRefreshLayout5.f96620u);
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.U && smartRefreshLayout6.V && smartRefreshLayout6.I) {
                        ng.h hVar7 = smartRefreshLayout6.T3;
                        if ((hVar7 instanceof ng.f) && hVar7.getSpinnerStyle() == og.b.f132310d) {
                            SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                            if (smartRefreshLayout7.x0(smartRefreshLayout7.D)) {
                                SmartRefreshLayout.this.T3.getView().setTranslationY(Math.max(0, i11));
                            }
                        }
                    }
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    boolean z12 = (smartRefreshLayout8.E && (hVar2 = smartRefreshLayout8.S3) != null && hVar2.getSpinnerStyle() == og.b.f132312f) || SmartRefreshLayout.this.f96588b4 != 0;
                    SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                    boolean z13 = (smartRefreshLayout9.F && (hVar = smartRefreshLayout9.T3) != null && hVar.getSpinnerStyle() == og.b.f132312f) || SmartRefreshLayout.this.f96591c4 != 0;
                    if ((z12 && (i11 >= 0 || i12 > 0)) || (z13 && (i11 <= 0 || i12 < 0))) {
                        smartRefreshLayout3.invalidate();
                    }
                }
            }
            if ((i10 >= 0 || i12 > 0) && SmartRefreshLayout.this.S3 != null) {
                int iMax = Math.max(i10, 0);
                SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                int i13 = smartRefreshLayout10.G3;
                int i14 = (int) (i13 * smartRefreshLayout10.O3);
                float f10 = (iMax * 1.0f) / (i13 == 0 ? 1 : i13);
                if (smartRefreshLayout10.x0(smartRefreshLayout10.C) || (SmartRefreshLayout.this.Y3 == RefreshState.RefreshFinish && !z10)) {
                    SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                    if (i12 != smartRefreshLayout11.f96589c) {
                        if (smartRefreshLayout11.S3.getSpinnerStyle() == og.b.f132310d) {
                            SmartRefreshLayout.this.S3.getView().setTranslationY(SmartRefreshLayout.this.f96589c);
                            SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                            if (smartRefreshLayout12.f96588b4 != 0 && smartRefreshLayout12.V3 != null && !smartRefreshLayout12.y0(smartRefreshLayout12.G, smartRefreshLayout12.S3)) {
                                smartRefreshLayout3.invalidate();
                            }
                        } else if (SmartRefreshLayout.this.S3.getSpinnerStyle().f132318c) {
                            View view = SmartRefreshLayout.this.S3.getView();
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : SmartRefreshLayout.f96583o4;
                            view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((SmartRefreshLayout.this.f96589c - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                            int i15 = marginLayoutParams.leftMargin;
                            int i16 = marginLayoutParams.topMargin + SmartRefreshLayout.this.M3;
                            view.layout(i15, i16, view.getMeasuredWidth() + i15, view.getMeasuredHeight() + i16);
                        }
                        SmartRefreshLayout.this.S3.r(z10, f10, iMax, i13, i14);
                    }
                    if (z10 && SmartRefreshLayout.this.S3.j()) {
                        int i17 = (int) SmartRefreshLayout.this.f96606k;
                        int width = smartRefreshLayout3.getWidth();
                        SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                        smartRefreshLayout13.S3.h(smartRefreshLayout13.f96606k / (width == 0 ? 1 : width), i17, width);
                    }
                } else {
                    i14 = i14;
                }
                SmartRefreshLayout smartRefreshLayout14 = SmartRefreshLayout.this;
                if (i12 != smartRefreshLayout14.f96589c && (cVar = smartRefreshLayout14.f96624x1) != null) {
                    ng.h hVar8 = smartRefreshLayout14.S3;
                    if (hVar8 instanceof ng.g) {
                        cVar.m((ng.g) hVar8, z10, f10, iMax, i13, i14);
                    }
                }
            }
            if ((i10 <= 0 || i12 < 0) && SmartRefreshLayout.this.T3 != null) {
                int i18 = -Math.min(i10, 0);
                SmartRefreshLayout smartRefreshLayout15 = SmartRefreshLayout.this;
                int i19 = smartRefreshLayout15.K3;
                int i20 = (int) (i19 * smartRefreshLayout15.P3);
                float f11 = (i18 * 1.0f) / (i19 == 0 ? 1 : i19);
                if (smartRefreshLayout15.x0(smartRefreshLayout15.D) || (SmartRefreshLayout.this.Y3 == RefreshState.LoadFinish && !z10)) {
                    SmartRefreshLayout smartRefreshLayout16 = SmartRefreshLayout.this;
                    if (i12 != smartRefreshLayout16.f96589c) {
                        if (smartRefreshLayout16.T3.getSpinnerStyle() == og.b.f132310d) {
                            SmartRefreshLayout.this.T3.getView().setTranslationY(SmartRefreshLayout.this.f96589c);
                            SmartRefreshLayout smartRefreshLayout17 = SmartRefreshLayout.this;
                            if (smartRefreshLayout17.f96591c4 != 0 && smartRefreshLayout17.V3 != null && !smartRefreshLayout17.y0(smartRefreshLayout17.H, smartRefreshLayout17.T3)) {
                                smartRefreshLayout3.invalidate();
                            }
                        } else if (SmartRefreshLayout.this.T3.getSpinnerStyle().f132318c) {
                            View view2 = SmartRefreshLayout.this.T3.getView();
                            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : SmartRefreshLayout.f96583o4;
                            view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(((-SmartRefreshLayout.this.f96589c) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0), 1073741824));
                            int i21 = marginLayoutParams2.leftMargin;
                            int measuredHeight = (marginLayoutParams2.topMargin + smartRefreshLayout3.getMeasuredHeight()) - SmartRefreshLayout.this.N3;
                            view2.layout(i21, measuredHeight - view2.getMeasuredHeight(), view2.getMeasuredWidth() + i21, measuredHeight);
                        }
                        SmartRefreshLayout.this.T3.r(z10, f11, i18, i19, i20);
                    }
                    if (z10 && SmartRefreshLayout.this.T3.j()) {
                        int i22 = (int) SmartRefreshLayout.this.f96606k;
                        int width2 = smartRefreshLayout3.getWidth();
                        SmartRefreshLayout smartRefreshLayout18 = SmartRefreshLayout.this;
                        smartRefreshLayout18.T3.h(smartRefreshLayout18.f96606k / (width2 != 0 ? width2 : 1), i22, width2);
                    }
                }
                SmartRefreshLayout smartRefreshLayout19 = SmartRefreshLayout.this;
                if (i12 != smartRefreshLayout19.f96589c && (cVar2 = smartRefreshLayout19.f96624x1) != null) {
                    ng.h hVar9 = smartRefreshLayout19.T3;
                    if (hVar9 instanceof ng.f) {
                        cVar2.i((ng.f) hVar9, z10, f11, i18, i19, i20);
                    }
                }
            }
            return this;
        }

        @Override // ng.i
        @n0
        public ng.e k() {
            return SmartRefreshLayout.this.U3;
        }

        @Override // ng.i
        public ng.i l(@n0 ng.h hVar, boolean z10) {
            if (hVar.equals(SmartRefreshLayout.this.S3)) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (!smartRefreshLayout.f96584a0) {
                    smartRefreshLayout.f96584a0 = true;
                    smartRefreshLayout.G = z10;
                }
            } else if (hVar.equals(SmartRefreshLayout.this.T3)) {
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                if (!smartRefreshLayout2.f96587b0) {
                    smartRefreshLayout2.f96587b0 = true;
                    smartRefreshLayout2.H = z10;
                }
            }
            return this;
        }
    }

    public SmartRefreshLayout(Context context) {
        this(context, null);
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f96596f = 300;
        this.f96598g = 300;
        this.f96609m = 0.5f;
        this.f96610n = 'n';
        this.f96617r = -1;
        this.f96618s = -1;
        this.f96619t = -1;
        this.f96620u = -1;
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = true;
        this.N = false;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.f96584a0 = false;
        this.f96587b0 = false;
        this.f96628y2 = new int[2];
        this.G2 = new u0(this);
        this.f96615p3 = new y0(this);
        og.a aVar = og.a.f132295c;
        this.J3 = aVar;
        this.L3 = aVar;
        this.O3 = 2.5f;
        this.P3 = 2.5f;
        this.Q3 = 1.0f;
        this.R3 = 1.0f;
        this.X3 = new m();
        RefreshState refreshState = RefreshState.None;
        this.Y3 = refreshState;
        this.Z3 = refreshState;
        this.f96585a4 = 0L;
        this.f96588b4 = 0;
        this.f96591c4 = 0;
        this.f96599g4 = false;
        this.f96601h4 = false;
        this.f96603i4 = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.W3 = new Handler();
        this.f96626y = new Scroller(context);
        this.f96629z = VelocityTracker.obtain();
        this.f96600h = context.getResources().getDisplayMetrics().heightPixels;
        this.A = new com.scwang.smartrefresh.layout.util.b(com.scwang.smartrefresh.layout.util.b.f96793b);
        this.f96586b = viewConfiguration.getScaledTouchSlop();
        this.f96621v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f96622w = viewConfiguration.getScaledMaximumFlingVelocity();
        this.K3 = com.scwang.smartrefresh.layout.util.b.d(60.0f);
        this.G3 = com.scwang.smartrefresh.layout.util.b.d(100.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f96577e);
        if (!typedArrayObtainStyledAttributes.hasValue(R.styleable.SmartRefreshLayout_android_clipToPadding)) {
            super.setClipToPadding(false);
        }
        if (!typedArrayObtainStyledAttributes.hasValue(R.styleable.SmartRefreshLayout_android_clipChildren)) {
            super.setClipChildren(false);
        }
        ng.c cVar = f96582n4;
        if (cVar != null) {
            cVar.a(context, this);
        }
        this.f96609m = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlDragRate, this.f96609m);
        this.O3 = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlHeaderMaxDragRate, this.O3);
        this.P3 = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlFooterMaxDragRate, this.P3);
        this.Q3 = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlHeaderTriggerRate, this.Q3);
        this.R3 = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlFooterTriggerRate, this.R3);
        this.C = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableRefresh, this.C);
        this.f96598g = typedArrayObtainStyledAttributes.getInt(R.styleable.SmartRefreshLayout_srlReboundDuration, this.f96598g);
        int i10 = R.styleable.SmartRefreshLayout_srlEnableLoadMore;
        this.D = typedArrayObtainStyledAttributes.getBoolean(i10, this.D);
        int i11 = R.styleable.SmartRefreshLayout_srlHeaderHeight;
        this.G3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i11, this.G3);
        int i12 = R.styleable.SmartRefreshLayout_srlFooterHeight;
        this.K3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i12, this.K3);
        this.M3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.SmartRefreshLayout_srlHeaderInsetStart, this.M3);
        this.N3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.SmartRefreshLayout_srlFooterInsetStart, this.N3);
        this.S = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlDisableContentWhenRefresh, this.S);
        this.T = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlDisableContentWhenLoading, this.T);
        int i13 = R.styleable.SmartRefreshLayout_srlEnableHeaderTranslationContent;
        this.G = typedArrayObtainStyledAttributes.getBoolean(i13, this.G);
        int i14 = R.styleable.SmartRefreshLayout_srlEnableFooterTranslationContent;
        this.H = typedArrayObtainStyledAttributes.getBoolean(i14, this.H);
        this.J = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnablePreviewInEditMode, this.J);
        this.M = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableAutoLoadMore, this.M);
        this.K = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableOverScrollBounce, this.K);
        this.N = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnablePureScrollMode, this.N);
        this.O = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableScrollContentWhenLoaded, this.O);
        this.P = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableScrollContentWhenRefreshed, this.P);
        this.Q = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableLoadMoreWhenContentNotFull, this.Q);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableFooterFollowWhenLoadFinished, this.I);
        this.I = z10;
        this.I = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableFooterFollowWhenNoMoreData, z10);
        this.E = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableClipHeaderWhenFixedBehind, this.E);
        this.F = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableClipFooterWhenFixedBehind, this.F);
        this.L = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableOverScrollDrag, this.L);
        this.f96617r = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SmartRefreshLayout_srlFixedHeaderViewId, this.f96617r);
        this.f96618s = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SmartRefreshLayout_srlFixedFooterViewId, this.f96618s);
        this.f96619t = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SmartRefreshLayout_srlHeaderTranslationViewId, this.f96619t);
        this.f96620u = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SmartRefreshLayout_srlFooterTranslationViewId, this.f96620u);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableNestedScrolling, this.R);
        this.R = z11;
        this.G2.p(z11);
        this.W = this.W || typedArrayObtainStyledAttributes.hasValue(i10);
        this.f96584a0 = this.f96584a0 || typedArrayObtainStyledAttributes.hasValue(i13);
        this.f96587b0 = this.f96587b0 || typedArrayObtainStyledAttributes.hasValue(i14);
        this.J3 = typedArrayObtainStyledAttributes.hasValue(i11) ? og.a.f132301i : this.J3;
        this.L3 = typedArrayObtainStyledAttributes.hasValue(i12) ? og.a.f132301i : this.L3;
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.SmartRefreshLayout_srlAccentColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.SmartRefreshLayout_srlPrimaryColor, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.B = new int[]{color2, color};
            } else {
                this.B = new int[]{color2};
            }
        } else if (color != 0) {
            this.B = new int[]{0, color};
        }
        if (this.N && !this.W && !this.D) {
            this.D = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void setDefaultRefreshFooterCreator(@n0 ng.a aVar) {
        f96580l4 = aVar;
    }

    public static void setDefaultRefreshHeaderCreator(@n0 ng.b bVar) {
        f96581m4 = bVar;
    }

    public static void setDefaultRefreshInitializer(@n0 ng.c cVar) {
        f96582n4 = cVar;
    }

    @Override // ng.j
    public ng.j A(int i10) {
        return Z(i10, true, Boolean.FALSE);
    }

    protected void A0(RefreshState refreshState) {
        RefreshState refreshState2 = this.Y3;
        if (refreshState2 == refreshState) {
            if (this.Z3 != refreshState2) {
                this.Z3 = refreshState2;
                return;
            }
            return;
        }
        this.Y3 = refreshState;
        this.Z3 = refreshState;
        ng.h hVar = this.S3;
        ng.h hVar2 = this.T3;
        pg.c cVar = this.f96624x1;
        if (hVar != null) {
            hVar.q(this, refreshState2, refreshState);
        }
        if (hVar2 != null) {
            hVar2.q(this, refreshState2, refreshState);
        }
        if (cVar != null) {
            cVar.q(this, refreshState2, refreshState);
        }
        if (refreshState == RefreshState.LoadFinish) {
            this.f96599g4 = false;
        }
    }

    @Override // ng.j
    public ng.j B(@n0 View view, int i10, int i11) {
        ng.e eVar = this.U3;
        if (eVar != null) {
            super.removeView(eVar.getView());
        }
        if (i10 == 0) {
            i10 = -1;
        }
        if (i11 == 0) {
            i11 = -1;
        }
        LayoutParams layoutParams = new LayoutParams(i10, i11);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        super.addView(view, getChildCount(), layoutParams);
        this.U3 = new com.scwang.smartrefresh.layout.impl.a(view);
        if (this.f96597f4) {
            View viewFindViewById = findViewById(this.f96617r);
            View viewFindViewById2 = findViewById(this.f96618s);
            this.U3.b(this.f96627y1);
            this.U3.a(this.Q);
            this.U3.e(this.X3, viewFindViewById, viewFindViewById2);
        }
        ng.h hVar = this.S3;
        if (hVar != null && hVar.getSpinnerStyle().f132317b) {
            super.bringChildToFront(this.S3.getView());
        }
        ng.h hVar2 = this.T3;
        if (hVar2 != null && hVar2.getSpinnerStyle().f132317b) {
            super.bringChildToFront(this.T3.getView());
        }
        return this;
    }

    protected void B0() {
        RefreshState refreshState = this.Y3;
        if (refreshState == RefreshState.TwoLevel) {
            if (this.f96623x <= -1000 || this.f96589c <= getMeasuredHeight() / 2) {
                if (this.f96611o) {
                    this.X3.g();
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimatorC = this.X3.c(getMeasuredHeight());
                if (valueAnimatorC != null) {
                    valueAnimatorC.setDuration(this.f96596f);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState == refreshState2 || (this.I && this.U && this.V && this.f96589c < 0 && x0(this.D))) {
            int i10 = this.f96589c;
            int i11 = this.K3;
            if (i10 < (-i11)) {
                this.X3.c(-i11);
                return;
            } else {
                if (i10 > 0) {
                    this.X3.c(0);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState3 = this.Y3;
        RefreshState refreshState4 = RefreshState.Refreshing;
        if (refreshState3 == refreshState4) {
            int i12 = this.f96589c;
            int i13 = this.G3;
            if (i12 > i13) {
                this.X3.c(i13);
                return;
            } else {
                if (i12 < 0) {
                    this.X3.c(0);
                    return;
                }
                return;
            }
        }
        if (refreshState3 == RefreshState.PullDownToRefresh) {
            this.X3.f(RefreshState.PullDownCanceled);
            return;
        }
        if (refreshState3 == RefreshState.PullUpToLoad) {
            this.X3.f(RefreshState.PullUpCanceled);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToRefresh) {
            this.X3.f(refreshState4);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToLoad) {
            this.X3.f(refreshState2);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToTwoLevel) {
            this.X3.f(RefreshState.TwoLevelReleased);
            return;
        }
        if (refreshState3 == RefreshState.RefreshReleased) {
            if (this.f96607k4 == null) {
                this.X3.c(this.G3);
            }
        } else if (refreshState3 == RefreshState.LoadReleased) {
            if (this.f96607k4 == null) {
                this.X3.c(-this.K3);
            }
        } else if (this.f96589c != 0) {
            this.X3.c(0);
        }
    }

    @Override // ng.j
    public ng.j C() {
        return l0(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f96585a4))), 300) << 16, true, true);
    }

    protected boolean C0(float f10) {
        if (f10 == 0.0f) {
            f10 = this.f96623x;
        }
        if (Build.VERSION.SDK_INT > 27 && this.U3 != null) {
            getScaleY();
            View view = this.U3.getView();
            if (getScaleY() == -1.0f && view.getScaleY() == -1.0f) {
                f10 = -f10;
            }
        }
        if (Math.abs(f10) > this.f96621v) {
            int i10 = this.f96589c;
            if (i10 * f10 < 0.0f) {
                RefreshState refreshState = this.Y3;
                if (refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading || (i10 < 0 && this.U)) {
                    this.f96605j4 = new l(f10).a();
                    return true;
                }
                if (refreshState.isReleaseToOpening) {
                    return true;
                }
            }
            if ((f10 < 0.0f && ((this.K && (this.D || this.L)) || ((this.Y3 == RefreshState.Loading && i10 >= 0) || (this.M && x0(this.D))))) || (f10 > 0.0f && ((this.K && this.C) || this.L || (this.Y3 == RefreshState.Refreshing && this.f96589c <= 0)))) {
                this.f96601h4 = false;
                this.f96626y.fling(0, 0, 0, (int) (-f10), 0, 0, -2147483647, Integer.MAX_VALUE);
                this.f96626y.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    @Override // ng.j
    public ng.j D(@n0 ng.g gVar, int i10, int i11) {
        ng.h hVar;
        ng.h hVar2 = this.S3;
        if (hVar2 != null) {
            super.removeView(hVar2.getView());
        }
        this.S3 = gVar;
        this.f96588b4 = 0;
        this.f96593d4 = false;
        this.J3 = this.J3.c();
        if (this.S3 != null) {
            if (i10 == 0) {
                i10 = -1;
            }
            if (i11 == 0) {
                i11 = -2;
            }
            LayoutParams layoutParams = new LayoutParams(i10, i11);
            ViewGroup.LayoutParams layoutParams2 = gVar.getView().getLayoutParams();
            if (layoutParams2 instanceof LayoutParams) {
                layoutParams = (LayoutParams) layoutParams2;
            }
            if (this.S3.getSpinnerStyle().f132317b) {
                super.addView(this.S3.getView(), getChildCount(), layoutParams);
            } else {
                super.addView(this.S3.getView(), 0, layoutParams);
            }
            int[] iArr = this.B;
            if (iArr != null && (hVar = this.S3) != null) {
                hVar.setPrimaryColors(iArr);
            }
        }
        return this;
    }

    @Override // ng.j
    public ng.j E(float f10) {
        this.O3 = f10;
        ng.h hVar = this.S3;
        if (hVar == null || !this.f96597f4) {
            this.J3 = this.J3.c();
        } else {
            ng.i iVar = this.X3;
            int i10 = this.G3;
            hVar.b(iVar, i10, (int) (f10 * i10));
        }
        return this;
    }

    @Override // ng.j
    public boolean F() {
        int i10 = this.f96597f4 ? 0 : 400;
        int i11 = this.f96598g;
        float f10 = (this.O3 / 2.0f) + 0.5f;
        int i12 = this.G3;
        float f11 = f10 * i12 * 1.0f;
        if (i12 == 0) {
            i12 = 1;
        }
        return l(i10, i11, f11 / i12, false);
    }

    @Override // ng.j
    public ng.j H(@n0 ng.f fVar) {
        return N(fVar, 0, 0);
    }

    @Override // ng.j
    public ng.j I() {
        return Z(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f96585a4))), 300) << 16, true, Boolean.TRUE);
    }

    @Override // ng.j
    public ng.j J(@n0 Interpolator interpolator) {
        this.A = interpolator;
        return this;
    }

    @Override // ng.j
    public ng.j K(boolean z10) {
        this.T = z10;
        return this;
    }

    @Override // ng.j
    public boolean L() {
        int i10 = this.f96598g;
        int i11 = this.K3;
        float f10 = i11 * ((this.P3 / 2.0f) + 0.5f) * 1.0f;
        if (i11 == 0) {
            i11 = 1;
        }
        return g0(0, i10, f10 / i11, true);
    }

    @Override // ng.j
    public ng.j M(@n0 View view) {
        return B(view, 0, 0);
    }

    @Override // ng.j
    public ng.j N(@n0 ng.f fVar, int i10, int i11) {
        ng.h hVar;
        ng.h hVar2 = this.T3;
        if (hVar2 != null) {
            super.removeView(hVar2.getView());
        }
        this.T3 = fVar;
        this.f96599g4 = false;
        this.f96591c4 = 0;
        this.V = false;
        this.f96595e4 = false;
        this.L3 = this.L3.c();
        this.D = !this.W || this.D;
        if (this.T3 != null) {
            if (i10 == 0) {
                i10 = -1;
            }
            if (i11 == 0) {
                i11 = -2;
            }
            LayoutParams layoutParams = new LayoutParams(i10, i11);
            ViewGroup.LayoutParams layoutParams2 = fVar.getView().getLayoutParams();
            if (layoutParams2 instanceof LayoutParams) {
                layoutParams = (LayoutParams) layoutParams2;
            }
            if (this.T3.getSpinnerStyle().f132317b) {
                super.addView(this.T3.getView(), getChildCount(), layoutParams);
            } else {
                super.addView(this.T3.getView(), 0, layoutParams);
            }
            int[] iArr = this.B;
            if (iArr != null && (hVar = this.T3) != null) {
                hVar.setPrimaryColors(iArr);
            }
        }
        return this;
    }

    @Override // ng.j
    public ng.j P() {
        return y(true);
    }

    @Override // ng.j
    public ng.j Q(float f10) {
        this.N3 = com.scwang.smartrefresh.layout.util.b.d(f10);
        return this;
    }

    @Override // ng.j
    public ng.j R(float f10) {
        this.M3 = com.scwang.smartrefresh.layout.util.b.d(f10);
        return this;
    }

    @Override // ng.j
    public ng.j S(pg.d dVar) {
        this.f96590c0 = dVar;
        return this;
    }

    @Override // ng.j
    public boolean T() {
        int i10 = this.f96597f4 ? 0 : 400;
        int i11 = this.f96598g;
        float f10 = (this.O3 / 2.0f) + 0.5f;
        int i12 = this.G3;
        float f11 = f10 * i12 * 1.0f;
        if (i12 == 0) {
            i12 = 1;
        }
        return l(i10, i11, f11 / i12, true);
    }

    @Override // ng.j
    public ng.j U(boolean z10) {
        this.G = z10;
        this.f96584a0 = true;
        return this;
    }

    @Override // ng.j
    public ng.j V(boolean z10) {
        this.M = z10;
        return this;
    }

    @Override // ng.j
    public ng.j W(boolean z10) {
        this.F = z10;
        return this;
    }

    @Override // ng.j
    public ng.j X(boolean z10) {
        this.I = z10;
        return this;
    }

    @Override // ng.j
    public ng.j Y(float f10) {
        int iD = com.scwang.smartrefresh.layout.util.b.d(f10);
        if (iD == this.G3) {
            return this;
        }
        og.a aVar = this.J3;
        og.a aVar2 = og.a.f132304l;
        if (aVar.a(aVar2)) {
            this.G3 = iD;
            ng.h hVar = this.S3;
            if (hVar != null && this.f96597f4 && this.J3.f132309b) {
                og.b spinnerStyle = hVar.getSpinnerStyle();
                if (spinnerStyle != og.b.f132314h && !spinnerStyle.f132318c) {
                    View view = this.S3.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f96583o4;
                    view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((this.G3 - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                    int i10 = marginLayoutParams.leftMargin;
                    int i11 = (marginLayoutParams.topMargin + this.M3) - (spinnerStyle == og.b.f132310d ? this.G3 : 0);
                    view.layout(i10, i11, view.getMeasuredWidth() + i10, view.getMeasuredHeight() + i11);
                }
                this.J3 = aVar2;
                ng.h hVar2 = this.S3;
                ng.i iVar = this.X3;
                int i12 = this.G3;
                hVar2.b(iVar, i12, (int) (this.O3 * i12));
            } else {
                this.J3 = og.a.f132303k;
            }
        }
        return this;
    }

    @Override // ng.j
    public ng.j Z(int i10, boolean z10, Boolean bool) {
        int i11 = i10 >> 16;
        int i12 = (i10 << 16) >> 16;
        g gVar = new g(i11, bool, z10);
        if (i12 > 0) {
            this.W3.postDelayed(gVar, i12);
        } else {
            gVar.run();
        }
        return this;
    }

    @Override // ng.j
    public ng.j a(boolean z10) {
        this.Q = z10;
        ng.e eVar = this.U3;
        if (eVar != null) {
            eVar.a(z10);
        }
        return this;
    }

    @Override // ng.j
    public ng.j a0(pg.e eVar) {
        this.f96590c0 = eVar;
        this.f96613p1 = eVar;
        this.D = this.D || !(this.W || eVar == null);
        return this;
    }

    @Override // ng.j
    public ng.j b(ng.k kVar) {
        this.f96627y1 = kVar;
        ng.e eVar = this.U3;
        if (eVar != null) {
            eVar.b(kVar);
        }
        return this;
    }

    @Override // ng.j
    public ng.j b0(boolean z10) {
        this.W = true;
        this.D = z10;
        return this;
    }

    @Override // ng.j
    public ng.j c(boolean z10) {
        this.S = z10;
        return this;
    }

    @Override // ng.j
    @Deprecated
    public ng.j c0(boolean z10) {
        this.I = z10;
        return this;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f96626y.getCurrY();
        if (this.f96626y.computeScrollOffset()) {
            int finalY = this.f96626y.getFinalY();
            if ((finalY >= 0 || !((this.C || this.L) && this.U3.i())) && (finalY <= 0 || !((this.D || this.L) && this.U3.g()))) {
                this.f96601h4 = true;
                invalidate();
            } else {
                if (this.f96601h4) {
                    v0(finalY > 0 ? -this.f96626y.getCurrVelocity() : this.f96626y.getCurrVelocity());
                }
                this.f96626y.forceFinished(true);
            }
        }
    }

    @Override // ng.j
    public ng.j d(float f10) {
        this.R3 = f10;
        return this;
    }

    @Override // ng.j
    public ng.j d0(boolean z10) {
        this.K = z10;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0163  */
    /* JADX WARN: Code duplicated, block: B:123:0x0169  */
    /* JADX WARN: Code duplicated, block: B:132:0x0187  */
    /* JADX WARN: Code duplicated, block: B:134:0x018b  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:162:0x01de  */
    /* JADX WARN: Code duplicated, block: B:165:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:177:0x020b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0240  */
    /* JADX WARN: Code duplicated, block: B:186:0x024f  */
    /* JADX WARN: Code duplicated, block: B:193:0x026d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:194:0x026f  */
    /* JADX WARN: Code duplicated, block: B:201:0x028d  */
    /* JADX WARN: Code duplicated, block: B:204:0x0294 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:205:0x0296  */
    /* JADX WARN: Code duplicated, block: B:210:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:225:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:228:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:231:0x0311  */
    /* JADX WARN: Code duplicated, block: B:235:0x0319  */
    /* JADX WARN: Code duplicated, block: B:243:0x0359  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Code duplicated, block: B:97:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x010c  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00dc, code lost:
    
        if (r2.isFooter != false) goto L246;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smartrefresh.layout.SmartRefreshLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        Paint paint;
        Paint paint2;
        ng.e eVar = this.U3;
        View view2 = eVar != null ? eVar.getView() : null;
        ng.h hVar = this.S3;
        if (hVar != null && hVar.getView() == view) {
            if (!x0(this.C) || (!this.J && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMax = Math.max(view2.getTop() + view2.getPaddingTop() + this.f96589c, view.getTop());
                int i10 = this.f96588b4;
                if (i10 != 0 && (paint2 = this.V3) != null) {
                    paint2.setColor(i10);
                    if (this.S3.getSpinnerStyle().f132318c) {
                        iMax = view.getBottom();
                    } else if (this.S3.getSpinnerStyle() == og.b.f132310d) {
                        iMax = view.getBottom() + this.f96589c;
                    }
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), iMax, this.V3);
                }
                if ((this.E && this.S3.getSpinnerStyle() == og.b.f132312f) || this.S3.getSpinnerStyle().f132318c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), iMax);
                    boolean zDrawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return zDrawChild;
                }
            }
        }
        ng.h hVar2 = this.T3;
        if (hVar2 != null && hVar2.getView() == view) {
            if (!x0(this.D) || (!this.J && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMin = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.f96589c, view.getBottom());
                int i11 = this.f96591c4;
                if (i11 != 0 && (paint = this.V3) != null) {
                    paint.setColor(i11);
                    if (this.T3.getSpinnerStyle().f132318c) {
                        iMin = view.getTop();
                    } else if (this.T3.getSpinnerStyle() == og.b.f132310d) {
                        iMin = view.getTop() + this.f96589c;
                    }
                    canvas.drawRect(0.0f, iMin, getWidth(), view.getBottom(), this.V3);
                }
                if ((this.F && this.T3.getSpinnerStyle() == og.b.f132312f) || this.T3.getSpinnerStyle().f132318c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), iMin, view.getRight(), view.getBottom());
                    boolean zDrawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return zDrawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // ng.j
    public ng.j e(boolean z10) {
        this.H = z10;
        this.f96587b0 = true;
        return this;
    }

    @Override // ng.j
    public ng.j e0(float f10) {
        this.P3 = f10;
        ng.h hVar = this.T3;
        if (hVar == null || !this.f96597f4) {
            this.L3 = this.L3.c();
        } else {
            ng.i iVar = this.X3;
            int i10 = this.K3;
            hVar.b(iVar, i10, (int) (i10 * f10));
        }
        return this;
    }

    @Override // ng.j
    public ng.j f(float f10) {
        int iD = com.scwang.smartrefresh.layout.util.b.d(f10);
        if (iD == this.K3) {
            return this;
        }
        og.a aVar = this.L3;
        og.a aVar2 = og.a.f132304l;
        if (aVar.a(aVar2)) {
            this.K3 = iD;
            ng.h hVar = this.T3;
            if (hVar != null && this.f96597f4 && this.L3.f132309b) {
                og.b spinnerStyle = hVar.getSpinnerStyle();
                if (spinnerStyle != og.b.f132314h && !spinnerStyle.f132318c) {
                    View view = this.T3.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f96583o4;
                    view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((this.K3 - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                    int i10 = marginLayoutParams.leftMargin;
                    int measuredHeight = ((marginLayoutParams.topMargin + getMeasuredHeight()) - this.N3) - (spinnerStyle != og.b.f132310d ? this.K3 : 0);
                    view.layout(i10, measuredHeight, view.getMeasuredWidth() + i10, view.getMeasuredHeight() + measuredHeight);
                }
                this.L3 = aVar2;
                ng.h hVar2 = this.T3;
                ng.i iVar = this.X3;
                int i11 = this.K3;
                hVar2.b(iVar, i11, (int) (this.P3 * i11));
            } else {
                this.L3 = og.a.f132303k;
            }
        }
        return this;
    }

    @Override // ng.j
    public ng.j f0(pg.b bVar) {
        this.f96613p1 = bVar;
        this.D = this.D || !(this.W || bVar == null);
        return this;
    }

    @Override // ng.j
    public ng.j g(boolean z10) {
        this.L = z10;
        return this;
    }

    @Override // ng.j
    public boolean g0(int i10, int i11, float f10, boolean z10) {
        if (this.Y3 != RefreshState.None || !x0(this.D) || this.U) {
            return false;
        }
        j jVar = new j(f10, i11, z10);
        setViceState(RefreshState.Loading);
        if (i10 > 0) {
            this.W3.postDelayed(jVar, i10);
            return true;
        }
        jVar.run();
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // ng.j
    @n0
    public ViewGroup getLayout() {
        return this;
    }

    @Override // android.view.ViewGroup, androidx.core.view.x0
    public int getNestedScrollAxes() {
        return this.f96615p3.a();
    }

    @Override // ng.j
    @p0
    public ng.f getRefreshFooter() {
        ng.h hVar = this.T3;
        if (hVar instanceof ng.f) {
            return (ng.f) hVar;
        }
        return null;
    }

    @Override // ng.j
    @p0
    public ng.g getRefreshHeader() {
        ng.h hVar = this.S3;
        if (hVar instanceof ng.g) {
            return (ng.g) hVar;
        }
        return null;
    }

    @Override // ng.j
    @n0
    public RefreshState getState() {
        return this.Y3;
    }

    @Override // ng.j
    public ng.j h() {
        return setNoMoreData(false);
    }

    @Override // ng.j
    public ng.j i(boolean z10) {
        return l0(z10 ? Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f96585a4))), 300) << 16 : 0, z10, false);
    }

    @Override // ng.j
    public ng.j i0(boolean z10) {
        this.C = z10;
        return this;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.R && (this.L || this.C || this.D);
    }

    @Override // ng.j
    public ng.j k0(pg.c cVar) {
        this.f96624x1 = cVar;
        return this;
    }

    @Override // ng.j
    public boolean l(int i10, int i11, float f10, boolean z10) {
        if (this.Y3 != RefreshState.None || !x0(this.C)) {
            return false;
        }
        i iVar = new i(f10, i11, z10);
        setViceState(RefreshState.Refreshing);
        if (i10 > 0) {
            this.W3.postDelayed(iVar, i10);
            return true;
        }
        iVar.run();
        return true;
    }

    @Override // ng.j
    public ng.j l0(int i10, boolean z10, boolean z11) {
        int i11 = i10 >> 16;
        int i12 = (i10 << 16) >> 16;
        h hVar = new h(i11, z11, z10);
        if (i12 > 0) {
            this.W3.postDelayed(hVar, i12);
        } else {
            hVar.run();
        }
        return this;
    }

    @Override // ng.j
    public ng.j m(float f10) {
        this.Q3 = f10;
        return this;
    }

    @Override // ng.j
    public ng.j m0(@n0 ng.g gVar) {
        return D(gVar, 0, 0);
    }

    @Override // ng.j
    public ng.j n(boolean z10) {
        this.N = z10;
        return this;
    }

    @Override // ng.j
    public ng.j n0(float f10) {
        this.f96609m = f10;
        return this;
    }

    @Override // ng.j
    public ng.j o(@n int... iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = androidx.core.content.d.f(getContext(), iArr[i10]);
        }
        setPrimaryColors(iArr2);
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ng.h hVar;
        super.onAttachedToWindow();
        boolean z10 = true;
        this.f96597f4 = true;
        if (!isInEditMode()) {
            if (this.S3 == null) {
                ng.b bVar = f96581m4;
                if (bVar != null) {
                    m0(bVar.a(getContext(), this));
                } else {
                    m0(new BezierRadarHeader(getContext()));
                }
            }
            if (this.T3 == null) {
                ng.a aVar = f96580l4;
                if (aVar != null) {
                    H(aVar.a(getContext(), this));
                } else {
                    boolean z11 = this.D;
                    H(new BallPulseFooter(getContext()));
                    this.D = z11;
                }
            } else {
                if (!this.D && this.W) {
                    z10 = false;
                }
                this.D = z10;
            }
            if (this.U3 == null) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    ng.h hVar2 = this.S3;
                    if ((hVar2 == null || childAt != hVar2.getView()) && ((hVar = this.T3) == null || childAt != hVar.getView())) {
                        this.U3 = new com.scwang.smartrefresh.layout.impl.a(childAt);
                    }
                }
            }
            if (this.U3 == null) {
                int iD = com.scwang.smartrefresh.layout.util.b.d(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(R.string.srl_content_empty);
                super.addView(textView, 0, new LayoutParams(-1, -1));
                com.scwang.smartrefresh.layout.impl.a aVar2 = new com.scwang.smartrefresh.layout.impl.a(textView);
                this.U3 = aVar2;
                aVar2.getView().setPadding(iD, iD, iD, iD);
            }
            View viewFindViewById = findViewById(this.f96617r);
            View viewFindViewById2 = findViewById(this.f96618s);
            this.U3.b(this.f96627y1);
            this.U3.a(this.Q);
            this.U3.e(this.X3, viewFindViewById, viewFindViewById2);
            if (this.f96589c != 0) {
                A0(RefreshState.None);
                ng.e eVar = this.U3;
                this.f96589c = 0;
                eVar.f(0, this.f96619t, this.f96620u);
            }
        }
        int[] iArr = this.B;
        if (iArr != null) {
            ng.h hVar3 = this.S3;
            if (hVar3 != null) {
                hVar3.setPrimaryColors(iArr);
            }
            ng.h hVar4 = this.T3;
            if (hVar4 != null) {
                hVar4.setPrimaryColors(this.B);
            }
        }
        ng.e eVar2 = this.U3;
        if (eVar2 != null) {
            super.bringChildToFront(eVar2.getView());
        }
        ng.h hVar5 = this.S3;
        if (hVar5 != null && hVar5.getSpinnerStyle().f132317b) {
            super.bringChildToFront(this.S3.getView());
        }
        ng.h hVar6 = this.T3;
        if (hVar6 == null || !hVar6.getSpinnerStyle().f132317b) {
            return;
        }
        super.bringChildToFront(this.T3.getView());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f96597f4 = false;
        this.X3.j(0, true);
        A0(RefreshState.None);
        Handler handler = this.W3;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.W = true;
        this.f96605j4 = null;
        ValueAnimator valueAnimator = this.f96607k4;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f96607k4.removeAllUpdateListeners();
            this.f96607k4.setDuration(0L);
            this.f96607k4.cancel();
            this.f96607k4 = null;
        }
        this.f96599g4 = false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onFinishInflate() {
        int i10;
        int i11;
        super.onFinishInflate();
        int childCount = super.getChildCount();
        if (childCount > 3) {
            throw new RuntimeException("最多只支持3个子View，Most only support three sub view");
        }
        int i12 = -1;
        int i13 = 0;
        char c10 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = super.getChildAt(i13);
            if (com.scwang.smartrefresh.layout.util.b.f(childAt) && (c10 < 2 || i13 == 1)) {
                i12 = i13;
                c10 = 2;
            } else if (!(childAt instanceof ng.h) && c10 < 1) {
                c10 = i13 > 0 ? (char) 1 : (char) 0;
                i12 = i13;
            }
            i13++;
        }
        if (i12 >= 0) {
            this.U3 = new com.scwang.smartrefresh.layout.impl.a(super.getChildAt(i12));
            if (i12 == 1) {
                i11 = childCount != 3 ? -1 : 2;
                i10 = 0;
            } else if (childCount == 2) {
                i10 = -1;
                i11 = 1;
            } else {
                i10 = -1;
                i11 = -1;
            }
        } else {
            i10 = -1;
            i11 = -1;
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = super.getChildAt(i14);
            if (i14 == i10 || (i14 != i11 && i10 == -1 && this.S3 == null && (childAt2 instanceof ng.g))) {
                this.S3 = childAt2 instanceof ng.g ? (ng.g) childAt2 : new RefreshHeaderWrapper(childAt2);
            } else if (i14 == i11 || (i11 == -1 && (childAt2 instanceof ng.f))) {
                this.D = this.D || !this.W;
                this.T3 = childAt2 instanceof ng.f ? (ng.f) childAt2 : new RefreshFooterWrapper(childAt2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = super.getChildAt(i14);
            if (childAt.getVisibility() != 8 && childAt.getTag(R.string.srl_component_falsify) != childAt) {
                ng.e eVar = this.U3;
                if (eVar != null && eVar.getView() == childAt) {
                    boolean z11 = isInEditMode() && this.J && x0(this.C) && this.S3 != null;
                    View view = this.U3.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f96583o4;
                    int i15 = marginLayoutParams.leftMargin + paddingLeft;
                    int i16 = marginLayoutParams.topMargin + paddingTop;
                    int measuredWidth = view.getMeasuredWidth() + i15;
                    int measuredHeight = view.getMeasuredHeight() + i16;
                    if (z11 && y0(this.G, this.S3)) {
                        int i17 = this.G3;
                        i16 += i17;
                        measuredHeight += i17;
                    }
                    view.layout(i15, i16, measuredWidth, measuredHeight);
                }
                ng.h hVar = this.S3;
                if (hVar != null && hVar.getView() == childAt) {
                    boolean z12 = isInEditMode() && this.J && x0(this.C);
                    View view2 = this.S3.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : f96583o4;
                    int i18 = marginLayoutParams2.leftMargin;
                    int i19 = marginLayoutParams2.topMargin + this.M3;
                    int measuredWidth2 = view2.getMeasuredWidth() + i18;
                    int measuredHeight2 = view2.getMeasuredHeight() + i19;
                    if (!z12 && this.S3.getSpinnerStyle() == og.b.f132310d) {
                        int i20 = this.G3;
                        i19 -= i20;
                        measuredHeight2 -= i20;
                    }
                    view2.layout(i18, i19, measuredWidth2, measuredHeight2);
                }
                ng.h hVar2 = this.T3;
                if (hVar2 != null && hVar2.getView() == childAt) {
                    boolean z13 = isInEditMode() && this.J && x0(this.D);
                    View view3 = this.T3.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : f96583o4;
                    og.b spinnerStyle = this.T3.getSpinnerStyle();
                    int i21 = marginLayoutParams3.leftMargin;
                    int measuredHeight3 = (marginLayoutParams3.topMargin + getMeasuredHeight()) - this.N3;
                    if (this.U && this.V && this.I && this.U3 != null && this.T3.getSpinnerStyle() == og.b.f132310d && x0(this.D)) {
                        View view4 = this.U3.getView();
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        measuredHeight3 = view4.getMeasuredHeight() + paddingTop + paddingTop + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin : 0);
                    }
                    if (spinnerStyle == og.b.f132314h) {
                        measuredHeight3 = marginLayoutParams3.topMargin - this.N3;
                    } else {
                        if (z13 || spinnerStyle == og.b.f132313g || spinnerStyle == og.b.f132312f) {
                            iMax = this.K3;
                        } else if (spinnerStyle.f132318c && this.f96589c < 0) {
                            iMax = Math.max(x0(this.D) ? -this.f96589c : 0, 0);
                        }
                        measuredHeight3 -= iMax;
                    }
                    view3.layout(i21, measuredHeight3, view3.getMeasuredWidth() + i21, view3.getMeasuredHeight() + measuredHeight3);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x020c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0225  */
    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int iMax;
        og.a aVar;
        int i13;
        int i14;
        boolean z10 = isInEditMode() && this.J;
        int childCount = super.getChildCount();
        int measuredHeight = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = super.getChildAt(i15);
            if (childAt.getVisibility() != 8 && childAt.getTag(R.string.srl_component_falsify) != childAt) {
                ng.h hVar = this.S3;
                if (hVar != null && hVar.getView() == childAt) {
                    View view = this.S3.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f96583o4;
                    int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, layoutParams.width);
                    int iMax2 = this.G3;
                    og.a aVar2 = this.J3;
                    if (aVar2.f132308a < og.a.f132301i.f132308a) {
                        int i16 = layoutParams.height;
                        if (i16 > 0) {
                            int i17 = i16 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                            og.a aVar3 = og.a.f132299g;
                            if (aVar2.a(aVar3)) {
                                this.G3 = layoutParams.height + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                this.J3 = aVar3;
                            }
                            iMax2 = i17;
                        } else if (i16 == -2 && (this.S3.getSpinnerStyle() != og.b.f132314h || !this.J3.f132309b)) {
                            int iMax3 = Math.max((View.MeasureSpec.getSize(i11) - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0);
                            view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMax3, Integer.MIN_VALUE));
                            int measuredHeight2 = view.getMeasuredHeight();
                            if (measuredHeight2 > 0) {
                                if (measuredHeight2 != iMax3) {
                                    og.a aVar4 = this.J3;
                                    og.a aVar5 = og.a.f132297e;
                                    if (aVar4.a(aVar5)) {
                                        this.G3 = measuredHeight2 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                        this.J3 = aVar5;
                                    }
                                }
                                iMax2 = -1;
                            }
                        }
                    }
                    if (this.S3.getSpinnerStyle() == og.b.f132314h) {
                        iMax2 = View.MeasureSpec.getSize(i11);
                        i14 = -1;
                        i13 = 0;
                    } else {
                        if (!this.S3.getSpinnerStyle().f132318c || z10) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            iMax2 = Math.max(0, x0(this.C) ? this.f96589c : 0);
                        }
                        i14 = -1;
                    }
                    if (iMax2 != i14) {
                        view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((iMax2 - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, i13), 1073741824));
                    }
                    og.a aVar6 = this.J3;
                    if (!aVar6.f132309b) {
                        this.J3 = aVar6.b();
                        ng.h hVar2 = this.S3;
                        ng.i iVar = this.X3;
                        int i18 = this.G3;
                        hVar2.b(iVar, i18, (int) (this.O3 * i18));
                    }
                    if (z10 && x0(this.C)) {
                        measuredHeight += view.getMeasuredHeight();
                    }
                }
                ng.h hVar3 = this.T3;
                if (hVar3 == null || hVar3.getView() != childAt) {
                    i12 = 0;
                } else {
                    View view2 = this.T3.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : f96583o4;
                    int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin, layoutParams2.width);
                    int i19 = this.K3;
                    og.a aVar7 = this.L3;
                    if (aVar7.f132308a >= og.a.f132301i.f132308a) {
                        iMax = i19;
                    } else {
                        int i20 = layoutParams2.height;
                        if (i20 > 0) {
                            i19 = marginLayoutParams2.bottomMargin + i20 + marginLayoutParams2.topMargin;
                            og.a aVar8 = og.a.f132299g;
                            if (aVar7.a(aVar8)) {
                                this.K3 = layoutParams2.height + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                this.L3 = aVar8;
                            }
                        } else if (i20 == -2 && (this.T3.getSpinnerStyle() != og.b.f132314h || !this.L3.f132309b)) {
                            int iMax4 = Math.max((View.MeasureSpec.getSize(i11) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0);
                            view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(iMax4, Integer.MIN_VALUE));
                            int measuredHeight3 = view2.getMeasuredHeight();
                            if (measuredHeight3 > 0) {
                                if (measuredHeight3 != iMax4) {
                                    og.a aVar9 = this.L3;
                                    og.a aVar10 = og.a.f132297e;
                                    if (aVar9.a(aVar10)) {
                                        this.K3 = measuredHeight3 + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                        this.L3 = aVar10;
                                    }
                                }
                                iMax = -1;
                            }
                        }
                        iMax = i19;
                    }
                    if (this.T3.getSpinnerStyle() == og.b.f132314h) {
                        iMax = View.MeasureSpec.getSize(i11);
                    } else {
                        if (this.T3.getSpinnerStyle().f132318c && !z10) {
                            i12 = 0;
                            iMax = Math.max(0, x0(this.D) ? -this.f96589c : 0);
                        }
                        if (iMax != -1) {
                            view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((iMax - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, i12), 1073741824));
                        }
                        aVar = this.L3;
                        if (!aVar.f132309b) {
                            this.L3 = aVar.b();
                            ng.h hVar4 = this.T3;
                            ng.i iVar2 = this.X3;
                            int i21 = this.K3;
                            hVar4.b(iVar2, i21, (int) (this.P3 * i21));
                        }
                        if (z10 && x0(this.D)) {
                            measuredHeight += view2.getMeasuredHeight();
                        }
                    }
                    i12 = 0;
                    if (iMax != -1) {
                        view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((iMax - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, i12), 1073741824));
                    }
                    aVar = this.L3;
                    if (!aVar.f132309b) {
                        this.L3 = aVar.b();
                        ng.h hVar5 = this.T3;
                        ng.i iVar3 = this.X3;
                        int i22 = this.K3;
                        hVar5.b(iVar3, i22, (int) (this.P3 * i22));
                    }
                    if (z10) {
                        measuredHeight += view2.getMeasuredHeight();
                    }
                }
                ng.e eVar = this.U3;
                if (eVar != null && eVar.getView() == childAt) {
                    View view3 = this.U3.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : f96583o4;
                    view3.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin, layoutParams3.width), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin + ((!z10 || ((this.S3 == null || !x0(this.C) || !y0(this.G, this.S3)) ? i12 : 1) == 0) ? i12 : this.G3) + ((!z10 || ((this.T3 == null || !x0(this.D) || !y0(this.H, this.T3)) ? i12 : 1) == 0) ? i12 : this.K3), layoutParams3.height));
                    measuredHeight += view3.getMeasuredHeight();
                }
            }
        }
        super.setMeasuredDimension(View.resolveSize(super.getSuggestedMinimumWidth(), i10), View.resolveSize(measuredHeight, i11));
        this.f96606k = getMeasuredWidth() / 2.0f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedFling(@n0 View view, float f10, float f11, boolean z10) {
        return this.G2.a(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedPreFling(@n0 View view, float f10, float f11) {
        return (this.f96599g4 && f11 > 0.0f) || C0(-f11) || this.G2.b(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedPreScroll(@n0 View view, int i10, int i11, @n0 int[] iArr) {
        int i12 = this.f96614p2;
        int i13 = 0;
        if (i11 * i12 > 0) {
            if (Math.abs(i11) > Math.abs(this.f96614p2)) {
                int i14 = this.f96614p2;
                this.f96614p2 = 0;
                i13 = i14;
            } else {
                this.f96614p2 -= i11;
                i13 = i11;
            }
            z0(this.f96614p2);
        } else if (i11 > 0 && this.f96599g4) {
            int i15 = i12 - i11;
            this.f96614p2 = i15;
            z0(i15);
            i13 = i11;
        }
        this.G2.c(i10, i11 - i13, iArr, null);
        iArr[1] = iArr[1] + i13;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedScroll(@n0 View view, int i10, int i11, int i12, int i13) {
        ng.k kVar;
        ng.k kVar2;
        boolean zF = this.G2.f(i10, i11, i12, i13, this.f96628y2);
        int i14 = i13 + this.f96628y2[1];
        if ((i14 < 0 && ((this.C || this.L) && (this.f96614p2 != 0 || (kVar2 = this.f96627y1) == null || kVar2.b(this.U3.getView())))) || (i14 > 0 && ((this.D || this.L) && (this.f96614p2 != 0 || (kVar = this.f96627y1) == null || kVar.a(this.U3.getView()))))) {
            RefreshState refreshState = this.Z3;
            if (refreshState == RefreshState.None || refreshState.isOpening) {
                this.X3.f(i14 > 0 ? RefreshState.PullUpToLoad : RefreshState.PullDownToRefresh);
                if (!zF) {
                    ViewParent parent = getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            int i15 = this.f96614p2 - i14;
            this.f96614p2 = i15;
            z0(i15);
        }
        if (!this.f96599g4 || i11 >= 0) {
            return;
        }
        this.f96599g4 = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedScrollAccepted(@n0 View view, @n0 View view2, int i10) {
        this.f96615p3.b(view, view2, i10);
        this.G2.r(i10 & 2);
        this.f96614p2 = this.f96589c;
        this.f96625x2 = true;
        w0(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onStartNestedScroll(@n0 View view, @n0 View view2, int i10) {
        return (isEnabled() && isNestedScrollingEnabled() && (i10 & 2) != 0) && (this.L || this.C || this.D);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onStopNestedScroll(@n0 View view) {
        this.f96615p3.d(view);
        this.f96625x2 = false;
        this.f96614p2 = 0;
        B0();
        this.G2.t();
    }

    @Override // ng.j
    public ng.j p(int i10) {
        return l0(i10, true, false);
    }

    @Override // ng.j
    public ng.j q(boolean z10) {
        this.E = z10;
        return this;
    }

    @Override // ng.j
    public ng.j r(boolean z10) {
        this.O = z10;
        return this;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (j1.W0(this.U3.h())) {
            this.f96616q = z10;
            super.requestDisallowInterceptTouchEvent(z10);
        }
    }

    @Override // ng.j
    public boolean s() {
        int i10 = this.f96598g;
        int i11 = this.K3;
        float f10 = i11 * ((this.P3 / 2.0f) + 0.5f) * 1.0f;
        if (i11 == 0) {
            i11 = 1;
        }
        return g0(0, i10, f10 / i11, false);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.R = z10;
        this.G2.p(z10);
    }

    @Override // ng.j
    public ng.j setNoMoreData(boolean z10) {
        RefreshState refreshState = this.Y3;
        if (refreshState == RefreshState.Refreshing && z10) {
            I();
        } else if (refreshState == RefreshState.Loading && z10) {
            C();
        } else if (this.U != z10) {
            this.U = z10;
            ng.h hVar = this.T3;
            if (hVar instanceof ng.f) {
                if (((ng.f) hVar).setNoMoreData(z10)) {
                    this.V = true;
                    if (this.U && this.I && this.f96589c > 0 && this.T3.getSpinnerStyle() == og.b.f132310d && x0(this.D) && y0(this.C, this.S3)) {
                        this.T3.getView().setTranslationY(this.f96589c);
                    }
                } else {
                    this.V = false;
                    new RuntimeException("Footer:" + this.T3 + " NoMoreData is not supported.(不支持NoMoreData，请使用[ClassicsFooter]或者[自定义Footer并实现setNoMoreData方法且返回true])").printStackTrace();
                }
            }
        }
        return this;
    }

    @Override // ng.j
    public ng.j setPrimaryColors(@androidx.annotation.l int... iArr) {
        ng.h hVar = this.S3;
        if (hVar != null) {
            hVar.setPrimaryColors(iArr);
        }
        ng.h hVar2 = this.T3;
        if (hVar2 != null) {
            hVar2.setPrimaryColors(iArr);
        }
        this.B = iArr;
        return this;
    }

    protected void setStateDirectLoading(boolean z10) {
        RefreshState refreshState = this.Y3;
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState != refreshState2) {
            this.f96585a4 = System.currentTimeMillis();
            this.f96599g4 = true;
            A0(refreshState2);
            pg.b bVar = this.f96613p1;
            if (bVar != null) {
                if (z10) {
                    bVar.f(this);
                }
            } else if (this.f96624x1 == null) {
                p(2000);
            }
            ng.h hVar = this.T3;
            if (hVar != null) {
                int i10 = this.K3;
                hVar.p(this, i10, (int) (this.P3 * i10));
            }
            pg.c cVar = this.f96624x1;
            if (cVar == null || !(this.T3 instanceof ng.f)) {
                return;
            }
            if (z10) {
                cVar.f(this);
            }
            pg.c cVar2 = this.f96624x1;
            ng.f fVar = (ng.f) this.T3;
            int i11 = this.K3;
            cVar2.n(fVar, i11, (int) (this.P3 * i11));
        }
    }

    protected void setStateLoading(boolean z10) {
        b bVar = new b(z10);
        A0(RefreshState.LoadReleased);
        ValueAnimator valueAnimatorC = this.X3.c(-this.K3);
        if (valueAnimatorC != null) {
            valueAnimatorC.addListener(bVar);
        }
        ng.h hVar = this.T3;
        if (hVar != null) {
            int i10 = this.K3;
            hVar.o(this, i10, (int) (this.P3 * i10));
        }
        pg.c cVar = this.f96624x1;
        if (cVar != null) {
            ng.h hVar2 = this.T3;
            if (hVar2 instanceof ng.f) {
                int i11 = this.K3;
                cVar.a((ng.f) hVar2, i11, (int) (this.P3 * i11));
            }
        }
        if (valueAnimatorC == null) {
            bVar.onAnimationEnd(null);
        }
    }

    protected void setStateRefreshing(boolean z10) {
        c cVar = new c(z10);
        A0(RefreshState.RefreshReleased);
        ValueAnimator valueAnimatorC = this.X3.c(this.G3);
        if (valueAnimatorC != null) {
            valueAnimatorC.addListener(cVar);
        }
        ng.h hVar = this.S3;
        if (hVar != null) {
            int i10 = this.G3;
            hVar.o(this, i10, (int) (this.O3 * i10));
        }
        pg.c cVar2 = this.f96624x1;
        if (cVar2 != null) {
            ng.h hVar2 = this.S3;
            if (hVar2 instanceof ng.g) {
                int i11 = this.G3;
                cVar2.e((ng.g) hVar2, i11, (int) (this.O3 * i11));
            }
        }
        if (valueAnimatorC == null) {
            cVar.onAnimationEnd(null);
        }
    }

    protected void setViceState(RefreshState refreshState) {
        RefreshState refreshState2 = this.Y3;
        if (refreshState2.isDragging && refreshState2.isHeader != refreshState.isHeader) {
            A0(RefreshState.None);
        }
        if (this.Z3 != refreshState) {
            this.Z3 = refreshState;
        }
    }

    @Override // ng.j
    public ng.j t(boolean z10) {
        this.P = z10;
        return this;
    }

    @Override // ng.j
    public ng.j u(boolean z10) {
        setNestedScrollingEnabled(z10);
        return this;
    }

    protected ValueAnimator u0(int i10, int i11, Interpolator interpolator, int i12) {
        if (this.f96589c == i10) {
            return null;
        }
        ValueAnimator valueAnimator = this.f96607k4;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            this.f96607k4.cancel();
            this.f96607k4 = null;
        }
        this.f96605j4 = null;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f96589c, i10);
        this.f96607k4 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(i12);
        this.f96607k4.setInterpolator(interpolator);
        this.f96607k4.addListener(new d());
        this.f96607k4.addUpdateListener(new e());
        this.f96607k4.setStartDelay(i11);
        this.f96607k4.start();
        return this.f96607k4;
    }

    @Override // ng.j
    @Deprecated
    public boolean v(int i10) {
        int i11 = this.f96598g;
        float f10 = (this.O3 / 2.0f) + 0.5f;
        int i12 = this.G3;
        float f11 = f10 * i12 * 1.0f;
        if (i12 == 0) {
            i12 = 1;
        }
        return l(i10, i11, f11 / i12, false);
    }

    protected void v0(float f10) {
        RefreshState refreshState;
        if (this.f96607k4 == null) {
            if (f10 > 0.0f && ((refreshState = this.Y3) == RefreshState.Refreshing || refreshState == RefreshState.TwoLevel)) {
                this.f96605j4 = new k(f10, this.G3);
                return;
            }
            if (f10 < 0.0f && (this.Y3 == RefreshState.Loading || ((this.I && this.U && this.V && x0(this.D)) || (this.M && !this.U && x0(this.D) && this.Y3 != RefreshState.Refreshing)))) {
                this.f96605j4 = new k(f10, -this.K3);
            } else if (this.f96589c == 0 && this.K) {
                this.f96605j4 = new k(f10, 0);
            }
        }
    }

    @Override // ng.j
    public ng.j w() {
        return i(true);
    }

    protected boolean w0(int i10) {
        if (i10 == 0) {
            if (this.f96607k4 != null) {
                RefreshState refreshState = this.Y3;
                if (refreshState.isFinishing || refreshState == RefreshState.TwoLevelReleased || refreshState == RefreshState.RefreshReleased || refreshState == RefreshState.LoadReleased) {
                    return true;
                }
                if (refreshState == RefreshState.PullDownCanceled) {
                    this.X3.f(RefreshState.PullDownToRefresh);
                } else if (refreshState == RefreshState.PullUpCanceled) {
                    this.X3.f(RefreshState.PullUpToLoad);
                }
                this.f96607k4.setDuration(0L);
                this.f96607k4.cancel();
                this.f96607k4 = null;
            }
            this.f96605j4 = null;
        }
        return this.f96607k4 != null;
    }

    @Override // ng.j
    public ng.j x() {
        RefreshState refreshState;
        RefreshState refreshState2 = this.Y3;
        RefreshState refreshState3 = RefreshState.None;
        if (refreshState2 == refreshState3 && ((refreshState = this.Z3) == RefreshState.Refreshing || refreshState == RefreshState.Loading)) {
            this.Z3 = refreshState3;
        }
        if (refreshState2 == RefreshState.Refreshing) {
            P();
        } else if (refreshState2 == RefreshState.Loading) {
            w();
        } else if (this.X3.c(0) == null) {
            A0(refreshState3);
        } else if (this.Y3.isHeader) {
            A0(RefreshState.PullDownCanceled);
        } else {
            A0(RefreshState.PullUpCanceled);
        }
        return this;
    }

    protected boolean x0(boolean z10) {
        return z10 && !this.N;
    }

    @Override // ng.j
    public ng.j y(boolean z10) {
        return z10 ? Z(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f96585a4))), 300) << 16, true, Boolean.FALSE) : Z(0, false, null);
    }

    protected boolean y0(boolean z10, ng.h hVar) {
        return z10 || this.N || hVar == null || hVar.getSpinnerStyle() == og.b.f132312f;
    }

    @Override // ng.j
    public ng.j z(int i10) {
        this.f96598g = i10;
        return this;
    }

    protected void z0(float f10) {
        RefreshState refreshState;
        float f11 = (!this.f96625x2 || this.Q || f10 >= 0.0f || this.U3.g()) ? f10 : 0.0f;
        if (f11 > this.f96600h * 5 && getTag() == null) {
            float f12 = this.f96608l;
            int i10 = this.f96600h;
            if (f12 < i10 / 6.0f && this.f96606k < i10 / 16.0f) {
                Toast.makeText(getContext(), "你这么死拉，臣妾做不到啊！", 0).show();
                setTag("你这么死拉，臣妾做不到啊！");
            }
        }
        RefreshState refreshState2 = this.Y3;
        if (refreshState2 == RefreshState.TwoLevel && f11 > 0.0f) {
            this.X3.j(Math.min((int) f11, getMeasuredHeight()), true);
        } else if (refreshState2 == RefreshState.Refreshing && f11 >= 0.0f) {
            int i11 = this.G3;
            if (f11 < i11) {
                this.X3.j((int) f11, true);
            } else {
                double d10 = (this.O3 - 1.0f) * i11;
                int iMax = Math.max((this.f96600h * 4) / 3, getHeight());
                int i12 = this.G3;
                double d11 = iMax - i12;
                double dMax = Math.max(0.0f, (f11 - i12) * this.f96609m);
                double d12 = -dMax;
                if (d11 == 0.0d) {
                    d11 = 1.0d;
                }
                this.X3.j(((int) Math.min(d10 * (1.0d - Math.pow(100.0d, d12 / d11)), dMax)) + this.G3, true);
            }
        } else if (f11 < 0.0f && (refreshState2 == RefreshState.Loading || ((this.I && this.U && this.V && x0(this.D)) || (this.M && !this.U && x0(this.D))))) {
            int i13 = this.K3;
            if (f11 > (-i13)) {
                this.X3.j((int) f11, true);
            } else {
                double d13 = (this.P3 - 1.0f) * i13;
                int iMax2 = Math.max((this.f96600h * 4) / 3, getHeight());
                int i14 = this.K3;
                double d14 = iMax2 - i14;
                double d15 = -Math.min(0.0f, (i14 + f11) * this.f96609m);
                double d16 = -d15;
                if (d14 == 0.0d) {
                    d14 = 1.0d;
                }
                this.X3.j(((int) (-Math.min(d13 * (1.0d - Math.pow(100.0d, d16 / d14)), d15))) - this.K3, true);
            }
        } else if (f11 >= 0.0f) {
            double d17 = this.O3 * this.G3;
            double dMax2 = Math.max(this.f96600h / 2, getHeight());
            double dMax3 = Math.max(0.0f, this.f96609m * f11);
            double d18 = -dMax3;
            if (dMax2 == 0.0d) {
                dMax2 = 1.0d;
            }
            this.X3.j((int) Math.min(d17 * (1.0d - Math.pow(100.0d, d18 / dMax2)), dMax3), true);
        } else {
            double d19 = this.P3 * this.K3;
            double dMax4 = Math.max(this.f96600h / 2, getHeight());
            double d20 = -Math.min(0.0f, this.f96609m * f11);
            double d21 = -d20;
            if (dMax4 == 0.0d) {
                dMax4 = 1.0d;
            }
            this.X3.j((int) (-Math.min(d19 * (1.0d - Math.pow(100.0d, d21 / dMax4)), d20)), true);
        }
        if (!this.M || this.U || !x0(this.D) || f11 >= 0.0f || (refreshState = this.Y3) == RefreshState.Refreshing || refreshState == RefreshState.Loading || refreshState == RefreshState.LoadFinish) {
            return;
        }
        if (this.T) {
            this.f96605j4 = null;
            this.X3.c(-this.K3);
        }
        setStateDirectLoading(false);
        this.W3.postDelayed(new f(), this.f96598g);
    }
}
