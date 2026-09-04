package com.max.hbcustomview.shinebuttonlib;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Random;

/* JADX INFO: loaded from: classes10.dex */
public class ShineView extends View {
    private static final String W = "ShineView";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static long f69410a0 = 25;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    static int[] f69411b0 = new int[10];
    public static ChangeQuickRedirect changeQuickRedirect;
    int A;
    float B;
    float C;
    float D;
    double E;
    float F;
    float G;
    boolean H;
    private float I;
    private Interpolator J;
    private Interpolator K;
    private Interpolator L;
    private com.max.hbcustomview.shinebuttonlib.a M;
    ValueAnimator N;
    ValueAnimator O;
    ValueAnimator P;
    ValueAnimator Q;
    ValueAnimator R;
    ValueAnimator S;
    AnimatorSet T;
    int U;
    private com.max.hbcustomview.shinebuttonlib.c V;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.max.hbcustomview.shinebuttonlib.b f69412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ValueAnimator f69413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ShineButton f69414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f69415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f69416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f69417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f69418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f69419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f69420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f69421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    long f69422l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    long f69423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f69424n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f69425o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f69426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f69427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f69428r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f69429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    RectF f69430t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    RectF f69431u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    RectF f69432v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Random f69433w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f69434x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f69435y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f69436z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.vq, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShineView.this.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ShineView shineView = ShineView.this;
            int i10 = shineView.f69427q;
            if (i10 == 0 || i10 <= 0) {
                Paint paint = shineView.f69415e;
                ShineView shineView2 = ShineView.this;
                paint.setStrokeWidth((shineView2.f69436z / 2) * (shineView2.f69424n - shineView2.F));
            } else {
                Paint paint2 = shineView.f69415e;
                ShineView shineView3 = ShineView.this;
                paint2.setStrokeWidth(shineView3.f69427q * (shineView3.f69424n - shineView3.F));
            }
            ShineView shineView4 = ShineView.this;
            RectF rectF = shineView4.f69431u;
            float f10 = shineView4.f69434x;
            float f11 = shineView4.f69436z / ((3.0f - shineView4.f69424n) + shineView4.I);
            ShineView shineView5 = ShineView.this;
            float f12 = f10 - (f11 * shineView5.F);
            float f13 = shineView5.f69435y;
            float f14 = shineView5.A / ((3.0f - shineView5.f69424n) + shineView5.I);
            ShineView shineView6 = ShineView.this;
            float f15 = f13 - (f14 * shineView6.F);
            float f16 = shineView6.f69434x;
            float f17 = shineView6.f69436z / ((3.0f - shineView6.f69424n) + shineView6.I);
            ShineView shineView7 = ShineView.this;
            rectF.set(f12, f15, f16 + (f17 * shineView7.F), shineView7.f69435y + ((shineView7.A / ((3.0f - shineView7.f69424n) + shineView7.I)) * ShineView.this.F));
            ShineView.this.invalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.uq, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShineView.this.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ShineView.this.invalidate();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.wq, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            float fA = ic.a.f119343a.a(ShineView.this.getContext(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
            ShineView shineView = ShineView.this;
            RectF rectF = shineView.f69430t;
            int i10 = shineView.f69434x;
            int i11 = shineView.f69435y;
            rectF.set(i10 - fA, i11 - fA, i10 + fA, i11 + fA);
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.xq, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShineView.this.f69417g.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.yq, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShineView.this.f69417g.setStrokeWidth(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class f implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.zq, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShineView.this.f69416f.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class g implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.Aq, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShineView.this.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
    }

    public class h implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.Bq, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShineView.this.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
    }

    public class i implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.Cq, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShineView.this.invalidate();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class j implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.Dq, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            ShineView shineView = ShineView.this;
            shineView.G = 0.0f;
            shineView.invalidate();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f69447a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f69448b = 1500;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f69449c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f69450d = 200;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f69451e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f69452f = 7;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f69453g = 20.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f69454h = 1.5f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f69455i = 20.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f69456j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f69457k = 0;

        k() {
            ShineView.f69411b0[0] = Color.parseColor("#FFFF99");
            ShineView.f69411b0[1] = Color.parseColor("#FFCCCC");
            ShineView.f69411b0[2] = Color.parseColor("#996699");
            ShineView.f69411b0[3] = Color.parseColor("#FF6666");
            ShineView.f69411b0[4] = Color.parseColor("#FFFF66");
            ShineView.f69411b0[5] = Color.parseColor("#F44336");
            ShineView.f69411b0[6] = Color.parseColor("#666666");
            ShineView.f69411b0[7] = Color.parseColor("#CCCC00");
            ShineView.f69411b0[8] = Color.parseColor("#666666");
            ShineView.f69411b0[9] = Color.parseColor("#999933");
        }
    }

    public ShineView(Context context) {
        super(context);
        this.f69418h = 10;
        int[] iArr = f69411b0;
        this.f69425o = iArr[0];
        this.f69426p = iArr[1];
        this.f69427q = 0;
        this.f69428r = false;
        this.f69429s = false;
        this.f69430t = new RectF();
        this.f69431u = new RectF();
        this.f69432v = new RectF();
        this.f69433w = new Random();
        this.G = 0.0f;
        this.H = false;
        this.I = 0.2f;
        this.U = 1;
    }

    public ShineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69418h = 10;
        int[] iArr = f69411b0;
        this.f69425o = iArr[0];
        this.f69426p = iArr[1];
        this.f69427q = 0;
        this.f69428r = false;
        this.f69429s = false;
        this.f69430t = new RectF();
        this.f69431u = new RectF();
        this.f69432v = new RectF();
        this.f69433w = new Random();
        this.G = 0.0f;
        this.H = false;
        this.I = 0.2f;
        this.U = 1;
    }

    public ShineView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f69418h = 10;
        int[] iArr = f69411b0;
        this.f69425o = iArr[0];
        this.f69426p = iArr[1];
        this.f69427q = 0;
        this.f69428r = false;
        this.f69429s = false;
        this.f69430t = new RectF();
        this.f69431u = new RectF();
        this.f69432v = new RectF();
        this.f69433w = new Random();
        this.G = 0.0f;
        this.H = false;
        this.I = 0.2f;
        this.U = 1;
    }

    public ShineView(Context context, ShineButton shineButton, k kVar) {
        super(context);
        this.f69418h = 10;
        int[] iArr = f69411b0;
        this.f69425o = iArr[0];
        this.f69426p = iArr[1];
        this.f69427q = 0;
        this.f69428r = false;
        this.f69429s = false;
        this.f69430t = new RectF();
        this.f69431u = new RectF();
        this.f69432v = new RectF();
        this.f69433w = new Random();
        this.G = 0.0f;
        this.H = false;
        this.I = 0.2f;
        this.U = 1;
        g(kVar, shineButton);
        this.f69412b = new com.max.hbcustomview.shinebuttonlib.b(this.f69422l, this.f69424n, 150L);
        ValueAnimator.setFrameDelay(f69410a0);
        this.f69414d = shineButton;
        ic.a aVar = ic.a.f119343a;
        this.D = aVar.b(getContext(), 14);
        this.M = new com.max.hbcustomview.shinebuttonlib.a(0.4f);
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(0.42f, 0.0f, -0.13f, 1.0f, 1.0f, 1.0f);
        this.J = androidx.core.view.animation.b.c(path);
        Path path2 = new Path();
        path2.moveTo(0.0f, 0.0f);
        path2.cubicTo(0.25f, 0.1f, 0.25f, 1.0f, 1.0f, 1.0f);
        this.K = androidx.core.view.animation.b.c(path2);
        Path path3 = new Path();
        path3.moveTo(0.0f, 0.0f);
        path3.cubicTo(0.4f, 0.0f, -0.15f, 1.0f, 1.0f, 1.0f);
        this.L = androidx.core.view.animation.b.c(path3);
        Paint paint = new Paint();
        this.f69415e = paint;
        paint.setColor(this.f69426p);
        this.f69415e.setStrokeWidth(20.0f);
        this.f69415e.setStyle(Paint.Style.STROKE);
        this.f69415e.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f69416f = paint2;
        paint2.setColor(this.f69426p);
        this.f69416f.setStrokeWidth(10.0f);
        this.f69416f.setAntiAlias(true);
        this.f69416f.setStyle(Paint.Style.STROKE);
        this.f69416f.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint();
        this.f69417g = paint3;
        paint3.setColor(this.f69426p);
        this.f69417g.setStrokeWidth(4.0f);
        this.f69417g.setStyle(Paint.Style.STROKE);
        this.f69417g.setStrokeCap(Paint.Cap.ROUND);
        this.f69413c = ValueAnimator.ofFloat(14.0f, 3.0f);
        ValueAnimator.setFrameDelay(f69410a0);
        this.f69413c.setDuration(this.f69423m);
        this.f69413c.setInterpolator(this.M);
        this.f69413c.addUpdateListener(new b());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(13.0f, 35.0f);
        this.N = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(this.J);
        this.N.setDuration(this.U * 600);
        this.N.addUpdateListener(new c());
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 0);
        this.O = valueAnimatorOfInt;
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        this.O.setDuration(this.U * 120);
        this.O.setStartDelay(this.U * 240);
        this.O.addUpdateListener(new d());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(aVar.b(getContext(), 4), aVar.b(getContext(), 2));
        this.P = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setInterpolator(this.K);
        this.P.setDuration(this.U * 300);
        this.P.addUpdateListener(new e());
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(255, 0);
        this.Q = valueAnimatorOfInt2;
        valueAnimatorOfInt2.setInterpolator(this.L);
        this.Q.setDuration(this.U * 400);
        this.Q.setStartDelay(this.U * 100);
        this.Q.addUpdateListener(new f());
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(aVar.b(getContext(), 2), aVar.b(getContext(), 23));
        this.S = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setInterpolator(this.K);
        this.S.setDuration(this.U * 500);
        this.S.addUpdateListener(new g());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(aVar.b(getContext(), 14), aVar.b(getContext(), 3));
        this.R = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setInterpolator(this.M);
        this.R.setDuration(this.U * 600);
        this.R.setStartDelay(this.U * 75);
        this.R.addUpdateListener(new h());
        AnimatorSet animatorSet = new AnimatorSet();
        this.T = animatorSet;
        animatorSet.addListener(new i());
        this.T.playTogether(this.N, this.O, this.P, this.Q, this.R, this.S);
        this.f69413c.addListener(new j());
        if (shineButton != null) {
            h();
            this.f69412b.addListener(this.V);
        }
    }

    private Paint e(Paint paint) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{paint}, this, changeQuickRedirect, false, bb.c.f.qq, new Class[]{Paint.class}, Paint.class);
        if (patchProxyResultProxy.isSupported) {
            return (Paint) patchProxyResultProxy.result;
        }
        if (this.f69429s) {
            paint.setColor(f69411b0[this.f69433w.nextInt(this.f69418h - 1)]);
        }
        return paint;
    }

    private double f(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.rq, new Class[]{cls, cls}, Double.TYPE);
        return patchProxyResultProxy.isSupported ? ((Double) patchProxyResultProxy.result).doubleValue() : Math.sqrt((i10 * i10) + (i11 * i11));
    }

    private void g(k kVar, ShineButton shineButton) {
        if (PatchProxy.proxy(new Object[]{kVar, shineButton}, this, changeQuickRedirect, false, bb.c.f.sq, new Class[]{k.class, ShineButton.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69419i = kVar.f69452f;
        this.f69421k = kVar.f69453g;
        this.f69420j = kVar.f69455i;
        this.f69429s = kVar.f69451e;
        this.f69428r = kVar.f69447a;
        this.f69424n = kVar.f69454h;
        this.f69422l = kVar.f69448b;
        this.f69423m = kVar.f69450d;
        int i10 = kVar.f69456j;
        this.f69425o = i10;
        int i11 = kVar.f69449c;
        this.f69426p = i11;
        this.f69427q = kVar.f69457k;
        if (i10 == 0) {
            this.f69425o = f69411b0[6];
        }
        if (i11 == 0) {
            this.f69426p = shineButton.getColor();
        }
    }

    public void h() {
        ShineButton shineButton;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.nq, new Class[0], Void.TYPE).isSupported || (shineButton = this.f69414d) == null) {
            return;
        }
        this.V = new com.max.hbcustomview.shinebuttonlib.c(shineButton, this);
    }

    public void i(ShineButton shineButton) {
        if (PatchProxy.proxy(new Object[]{shineButton}, this, changeQuickRedirect, false, bb.c.f.oq, new Class[]{ShineButton.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69436z = shineButton.getWidth();
        int height = shineButton.getHeight();
        this.A = height;
        this.E = f(height, this.f69436z);
        if (shineButton.y()) {
            this.f69434x = shineButton.getCenterX();
            this.f69435y = shineButton.getCenterY();
        } else {
            int[] iArr = new int[2];
            shineButton.getLocationInWindow(iArr);
            this.f69434x = iArr[0] + (shineButton.getWidth() / 2);
            this.f69435y = iArr[1] + (shineButton.getHeight() / 2);
        }
        Log.d("showAnimation", "centerAnimX: " + this.f69434x);
        Log.d("showAnimation", "centerAnimY: " + this.f69435y);
        this.f69412b.addUpdateListener(new a());
        this.f69412b.b(this, this.f69434x, this.f69435y);
        this.f69413c.start();
        this.T.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.tq, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69412b.removeAllListeners();
        this.V = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.pq, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
        for (int i10 = 0; i10 < this.f69419i; i10++) {
            if (this.f69428r) {
                Paint paint = this.f69415e;
                int[] iArr = f69411b0;
                int iAbs = Math.abs((this.f69418h / 2) - i10);
                int i11 = this.f69418h;
                paint.setColor(iArr[iAbs >= i11 ? i11 - 1 : Math.abs((i11 / 2) - i10)]);
            }
            canvas.drawArc(this.f69430t, this.f69421k + ((360.0f / this.f69419i) * i10), 0.1f, false, e(this.f69417g));
        }
        for (int i12 = 0; i12 < this.f69419i; i12++) {
            if (this.f69428r) {
                Paint paint2 = this.f69415e;
                int[] iArr2 = f69411b0;
                int iAbs2 = Math.abs((this.f69418h / 2) - i12);
                int i13 = this.f69418h;
                paint2.setColor(iArr2[iAbs2 >= i13 ? i13 - 1 : Math.abs((i13 / 2) - i12)]);
            }
        }
        this.f69415e.setStrokeWidth(this.f69436z * this.G * (this.f69424n - this.I));
        if (this.C < ic.a.f119343a.b(getContext(), 10)) {
            this.B = this.C;
            this.f69416f.setStyle(Paint.Style.FILL);
        } else {
            this.B = this.C - (this.D / 2.0f);
            this.f69416f.setStyle(Paint.Style.STROKE);
        }
        this.f69416f.setStrokeWidth(this.D);
        canvas.drawCircle(this.f69434x, this.f69435y, this.B, this.f69416f);
        if (this.f69412b == null || this.H) {
            return;
        }
        this.H = true;
        i(this.f69414d);
    }
}
