package com.max.hbcustomview.swipebacklayout;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.core.view.j1;
import androidx.core.view.q0;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class ActivitySwipeBackLayout extends FrameLayout {
    private static final String G = "SwipeBackLayout";
    private static final int H = 255;
    private static final float I = 0.92f;
    private static final int J = 250;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = 4;
    public static final int N = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int A;
    private float B;
    private int C;
    private boolean D;
    private e E;
    private e F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f69518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f69519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Rect f69520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f69521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f69522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f69523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f69524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Activity f69525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference<Activity> f69526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f69527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f69528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f69529m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.customview.widget.d f69530n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f69531o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f69532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f69533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f69534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f69535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f69536t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f69537u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f69538v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f69539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f69540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f69541y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f69542z;

    public class a implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.ss, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            try {
                Thread.sleep(300L);
                ActivitySwipeBackLayout.this.f69521e.setScaleX(1.0f);
                ActivitySwipeBackLayout.this.f69521e.setScaleY(1.0f);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class b implements e {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcustomview.swipebacklayout.ActivitySwipeBackLayout.e
        public void a(View view, float f10, float f11) {
            Object[] objArr = {view, new Float(f10), new Float(f11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.ts, new Class[]{View.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            ActivitySwipeBackLayout.this.invalidate();
            ActivitySwipeBackLayout.this.f69523g = (f10 * 0.07999998f) + ActivitySwipeBackLayout.I;
            if (ActivitySwipeBackLayout.this.f69521e != null) {
                try {
                    ActivitySwipeBackLayout.this.f69521e.setScaleX(ActivitySwipeBackLayout.this.f69523g);
                    ActivitySwipeBackLayout.this.f69521e.setScaleY(ActivitySwipeBackLayout.this.f69523g);
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.max.hbcustomview.swipebacklayout.ActivitySwipeBackLayout.e
        public void b(View view, boolean z10) {
            if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.us, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (z10) {
                ActivitySwipeBackLayout.this.B();
                return;
            }
            ActivitySwipeBackLayout activitySwipeBackLayout = ActivitySwipeBackLayout.this;
            activitySwipeBackLayout.f69528l = false;
            if (activitySwipeBackLayout.f69525i != null) {
                ActivitySwipeBackLayout activitySwipeBackLayout2 = ActivitySwipeBackLayout.this;
                if (activitySwipeBackLayout2.f69527k) {
                    if (!activitySwipeBackLayout2.D) {
                        com.max.hbcustomview.swipebacklayout.e.g(ActivitySwipeBackLayout.this.f69525i);
                    }
                    ActivitySwipeBackLayout.this.f69527k = false;
                }
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public class d extends androidx.customview.widget.d.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        private d() {
        }

        /* synthetic */ d(ActivitySwipeBackLayout activitySwipeBackLayout, a aVar) {
            this();
        }

        @Override // androidx.customview.widget.d.c
        public int a(View view, int i10, int i11) {
            Object[] objArr = {view, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.ws, new Class[]{View.class, cls, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            ActivitySwipeBackLayout activitySwipeBackLayout = ActivitySwipeBackLayout.this;
            activitySwipeBackLayout.f69542z = activitySwipeBackLayout.getPaddingLeft();
            if (ActivitySwipeBackLayout.q(ActivitySwipeBackLayout.this)) {
                if (ActivitySwipeBackLayout.this.f69529m == 1 && !com.max.hbcustomview.swipebacklayout.e.c(ActivitySwipeBackLayout.this.f69532p, ActivitySwipeBackLayout.this.f69540x, ActivitySwipeBackLayout.this.f69541y, false)) {
                    ActivitySwipeBackLayout activitySwipeBackLayout2 = ActivitySwipeBackLayout.this;
                    activitySwipeBackLayout2.f69542z = Math.min(Math.max(i10, activitySwipeBackLayout2.getPaddingLeft()), ActivitySwipeBackLayout.this.f69533q);
                } else if (ActivitySwipeBackLayout.this.f69529m == 2 && !com.max.hbcustomview.swipebacklayout.e.b(ActivitySwipeBackLayout.this.f69532p, ActivitySwipeBackLayout.this.f69540x, ActivitySwipeBackLayout.this.f69541y, false)) {
                    ActivitySwipeBackLayout activitySwipeBackLayout3 = ActivitySwipeBackLayout.this;
                    activitySwipeBackLayout3.f69542z = Math.min(Math.max(i10, -activitySwipeBackLayout3.f69533q), ActivitySwipeBackLayout.this.getPaddingRight());
                }
            }
            return ActivitySwipeBackLayout.this.f69542z;
        }

        @Override // androidx.customview.widget.d.c
        public int b(View view, int i10, int i11) {
            Object[] objArr = {view, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.xs, new Class[]{View.class, cls, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            ActivitySwipeBackLayout activitySwipeBackLayout = ActivitySwipeBackLayout.this;
            activitySwipeBackLayout.A = activitySwipeBackLayout.getPaddingTop();
            if (ActivitySwipeBackLayout.q(ActivitySwipeBackLayout.this)) {
                if (ActivitySwipeBackLayout.this.f69529m == 4 && !com.max.hbcustomview.swipebacklayout.e.d(ActivitySwipeBackLayout.this.f69532p, ActivitySwipeBackLayout.this.f69540x, ActivitySwipeBackLayout.this.f69541y, false)) {
                    ActivitySwipeBackLayout activitySwipeBackLayout2 = ActivitySwipeBackLayout.this;
                    activitySwipeBackLayout2.A = Math.min(Math.max(i10, activitySwipeBackLayout2.getPaddingTop()), ActivitySwipeBackLayout.this.f69534r);
                } else if (ActivitySwipeBackLayout.this.f69529m == 8 && !com.max.hbcustomview.swipebacklayout.e.a(ActivitySwipeBackLayout.this.f69532p, ActivitySwipeBackLayout.this.f69540x, ActivitySwipeBackLayout.this.f69541y, false)) {
                    ActivitySwipeBackLayout activitySwipeBackLayout3 = ActivitySwipeBackLayout.this;
                    activitySwipeBackLayout3.A = Math.min(Math.max(i10, -activitySwipeBackLayout3.f69534r), ActivitySwipeBackLayout.this.getPaddingBottom());
                }
            }
            return ActivitySwipeBackLayout.this.A;
        }

        @Override // androidx.customview.widget.d.c
        public int d(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.Bs, new Class[]{View.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ActivitySwipeBackLayout.this.f69533q;
        }

        @Override // androidx.customview.widget.d.c
        public int e(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.Cs, new Class[]{View.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ActivitySwipeBackLayout.this.f69534r;
        }

        @Override // androidx.customview.widget.d.c
        public void h(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Ds, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.h(i10, i11);
            ActivitySwipeBackLayout.this.C = i10;
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.As, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.j(i10);
            if (i10 != 0 || ActivitySwipeBackLayout.this.E == null) {
                return;
            }
            if (ActivitySwipeBackLayout.this.f69537u == 0.0f) {
                ActivitySwipeBackLayout.this.E.b(ActivitySwipeBackLayout.this.f69531o, false);
            } else if (ActivitySwipeBackLayout.this.f69537u == 1.0f) {
                ActivitySwipeBackLayout.this.E.b(ActivitySwipeBackLayout.this.f69531o, true);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void k(View view, int i10, int i11, int i12, int i13) {
            Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.ys, new Class[]{View.class, cls, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.k(view, i10, i11, i12, i13);
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            int i14 = ActivitySwipeBackLayout.this.f69529m;
            if (i14 == 1 || i14 == 2) {
                ActivitySwipeBackLayout activitySwipeBackLayout = ActivitySwipeBackLayout.this;
                activitySwipeBackLayout.f69537u = (iAbs * 1.0f) / activitySwipeBackLayout.f69533q;
            } else if (i14 == 4 || i14 == 8) {
                ActivitySwipeBackLayout activitySwipeBackLayout2 = ActivitySwipeBackLayout.this;
                activitySwipeBackLayout2.f69537u = (iAbs2 * 1.0f) / activitySwipeBackLayout2.f69534r;
            }
            if (ActivitySwipeBackLayout.this.E != null) {
                e eVar = ActivitySwipeBackLayout.this.E;
                ActivitySwipeBackLayout activitySwipeBackLayout3 = ActivitySwipeBackLayout.this;
                eVar.a(activitySwipeBackLayout3.f69531o, activitySwipeBackLayout3.f69537u, ActivitySwipeBackLayout.this.f69536t);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void l(View view, float f10, float f11) {
            Object[] objArr = {view, new Float(f10), new Float(f11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.zs, new Class[]{View.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.l(view, f10, f11);
            ActivitySwipeBackLayout activitySwipeBackLayout = ActivitySwipeBackLayout.this;
            activitySwipeBackLayout.f69542z = activitySwipeBackLayout.A = 0;
            if (!ActivitySwipeBackLayout.q(ActivitySwipeBackLayout.this)) {
                ActivitySwipeBackLayout.this.C = -1;
                return;
            }
            ActivitySwipeBackLayout.this.C = -1;
            if (!(ActivitySwipeBackLayout.j(ActivitySwipeBackLayout.this, f10, f11) || ActivitySwipeBackLayout.this.f69537u >= ActivitySwipeBackLayout.this.f69536t)) {
                int i10 = ActivitySwipeBackLayout.this.f69529m;
                if (i10 == 1 || i10 == 2) {
                    ActivitySwipeBackLayout activitySwipeBackLayout2 = ActivitySwipeBackLayout.this;
                    activitySwipeBackLayout2.G(activitySwipeBackLayout2.getPaddingLeft());
                    return;
                } else {
                    if (i10 == 4 || i10 == 8) {
                        ActivitySwipeBackLayout activitySwipeBackLayout3 = ActivitySwipeBackLayout.this;
                        activitySwipeBackLayout3.H(activitySwipeBackLayout3.getPaddingTop());
                        return;
                    }
                    return;
                }
            }
            int i11 = ActivitySwipeBackLayout.this.f69529m;
            if (i11 == 1) {
                ActivitySwipeBackLayout activitySwipeBackLayout4 = ActivitySwipeBackLayout.this;
                activitySwipeBackLayout4.G(activitySwipeBackLayout4.f69533q);
                return;
            }
            if (i11 == 2) {
                ActivitySwipeBackLayout activitySwipeBackLayout5 = ActivitySwipeBackLayout.this;
                activitySwipeBackLayout5.G(-activitySwipeBackLayout5.f69533q);
            } else if (i11 == 4) {
                ActivitySwipeBackLayout activitySwipeBackLayout6 = ActivitySwipeBackLayout.this;
                activitySwipeBackLayout6.H(activitySwipeBackLayout6.f69534r);
            } else {
                if (i11 != 8) {
                    return;
                }
                ActivitySwipeBackLayout activitySwipeBackLayout7 = ActivitySwipeBackLayout.this;
                activitySwipeBackLayout7.H(-activitySwipeBackLayout7.f69534r);
            }
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(View view, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.vs, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (!ActivitySwipeBackLayout.this.getSwipeBackEnable()) {
                return false;
            }
            ActivitySwipeBackLayout activitySwipeBackLayout = ActivitySwipeBackLayout.this;
            activitySwipeBackLayout.f69528l = true;
            if (activitySwipeBackLayout.f69525i != null) {
                ActivitySwipeBackLayout activitySwipeBackLayout2 = ActivitySwipeBackLayout.this;
                if (!activitySwipeBackLayout2.f69527k) {
                    com.max.hbcustomview.swipebacklayout.e.h(activitySwipeBackLayout2.f69525i);
                    ActivitySwipeBackLayout.this.f69527k = true;
                }
            }
            return view == ActivitySwipeBackLayout.this.f69531o;
        }
    }

    public interface e {
        void a(View view, float f10, float f11);

        void b(View view, boolean z10);
    }

    public ActivitySwipeBackLayout(@n0 Context context) {
        this(context, null);
    }

    public ActivitySwipeBackLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivitySwipeBackLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f69519c = 1.0f;
        this.f69520d = new Rect();
        this.f69522f = true;
        this.f69524h = true;
        this.f69527k = true;
        this.f69528l = false;
        this.f69529m = 1;
        this.f69536t = 0.3f;
        this.f69537u = 0.0f;
        this.f69538v = 180;
        this.f69539w = false;
        this.f69542z = 0;
        this.A = 0;
        this.B = 2000.0f;
        this.C = -1;
        this.D = false;
        this.F = new b();
        setWillNotDraw(false);
        androidx.customview.widget.d dVarP = androidx.customview.widget.d.p(this, 1.0f, new d(this, null));
        this.f69530n = dVarP;
        dVarP.T(this.f69529m);
        this.f69535s = dVarP.E();
        setSwipeBackListener(this.F);
        C(context, attributeSet);
    }

    private void C(@n0 Context context, @p0 AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, bb.c.f.Zr, new Class[]{Context.class, AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f68653g3);
        setDirectionMode(typedArrayObtainStyledAttributes.getInt(R.styleable.SwipeBackLayout_directionMode, this.f69529m));
        setSwipeBackFactor(typedArrayObtainStyledAttributes.getFloat(R.styleable.SwipeBackLayout_swipeBackFactor, this.f69536t));
        setMaskAlpha(typedArrayObtainStyledAttributes.getInteger(R.styleable.SwipeBackLayout_maskAlpha, this.f69538v));
        this.f69539w = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SwipeBackLayout_isSwipeFromEdge, this.f69539w);
        setShadow(R.drawable.shadow_left_33x64);
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean E() {
        if (!this.f69539w) {
            return true;
        }
        int i10 = this.f69529m;
        if (i10 == 1) {
            return this.C == 1;
        }
        if (i10 == 2) {
            return this.C == 2;
        }
        if (i10 != 4) {
            return i10 != 8 || this.C == 8;
        }
        return this.C == 4;
    }

    static /* synthetic */ boolean j(ActivitySwipeBackLayout activitySwipeBackLayout, float f10, float f11) {
        Object[] objArr = {activitySwipeBackLayout, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.rs, new Class[]{ActivitySwipeBackLayout.class, cls, cls}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : activitySwipeBackLayout.x(f10, f11);
    }

    static /* synthetic */ boolean q(ActivitySwipeBackLayout activitySwipeBackLayout) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activitySwipeBackLayout}, null, changeQuickRedirect, true, bb.c.f.qs, new Class[]{ActivitySwipeBackLayout.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : activitySwipeBackLayout.E();
    }

    private boolean x(float f10, float f11) {
        int i10 = this.f69529m;
        if (i10 == 1) {
            return f10 > this.B;
        }
        if (i10 == 2) {
            return f10 < (-this.B);
        }
        if (i10 != 4) {
            return i10 == 8 && f11 < (-this.B);
        }
        return f11 > this.B;
    }

    private void z(Canvas canvas, View view) {
        if (PatchProxy.proxy(new Object[]{canvas, view}, this, changeQuickRedirect, false, bb.c.f.ps, new Class[]{Canvas.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        Rect rect = this.f69520d;
        view.getHitRect(rect);
        if (this.f69529m == 1) {
            Drawable drawable = this.f69518b;
            drawable.setBounds(rect.left - drawable.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
            this.f69518b.setAlpha((int) ((1.0f - this.f69537u) * 255.0f));
            this.f69518b.draw(canvas);
        }
    }

    public void A() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.es, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.f69529m;
        this.f69532p = com.max.hbcustomview.swipebacklayout.e.k(this, i10 == 4 || i10 == 8);
    }

    public void B() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.ms, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69522f = false;
        ((Activity) getContext()).finish();
        ((Activity) getContext()).overridePendingTransition(0, 0);
    }

    public boolean D() {
        return this.D;
    }

    public boolean F() {
        return this.f69539w;
    }

    public void G(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.js, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && this.f69530n.V(i10, getPaddingTop())) {
            j1.n1(this);
        }
    }

    public void H(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.ks, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && this.f69530n.V(getPaddingLeft(), i10)) {
            j1.n1(this);
        }
    }

    public void I() {
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.cs, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Log.e("zh", "startFinishAnim  SlideFinishManager.mSlideFinishLayoutList.size:: " + com.max.hbcustomview.swipebacklayout.c.a().f69587b.size());
        if (!this.f69522f || (view = this.f69521e) == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", I, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f69521e, "scaleY", I, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(250L).start();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.is, new Class[0], Void.TYPE).isSupported && this.f69530n.o(true)) {
            j1.n1(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{canvas, view, new Long(j10)}, this, changeQuickRedirect, false, bb.c.f.ns, new Class[]{Canvas.class, View.class, Long.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!getSwipeBackEnable()) {
            return super.drawChild(canvas, view, j10);
        }
        boolean z10 = view == this.f69531o;
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        if (this.f69519c > 0.0f && z10 && this.f69530n.F() != 0) {
            z(canvas, view);
        }
        return zDrawChild;
    }

    public float getAutoFinishedVelocityLimit() {
        return this.B;
    }

    public int getDirectionMode() {
        return this.f69529m;
    }

    public int getMaskAlpha() {
        return this.f69538v;
    }

    public boolean getSwipeBackEnable() {
        return this.f69524h;
    }

    public float getSwipeBackFactor() {
        return this.f69536t;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.fs, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
        if (getSwipeBackEnable()) {
            int i10 = this.f69538v;
            canvas.drawARGB(i10 - ((int) (i10 * this.f69537u)), 0, 0, 0);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View view;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.gs, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!getSwipeBackEnable()) {
            return false;
        }
        int iC = q0.c(motionEvent);
        if (iC == 0) {
            this.f69540x = motionEvent.getRawX();
            this.f69541y = motionEvent.getRawY();
        } else if (iC == 2 && (view = this.f69532p) != null && com.max.hbcustomview.swipebacklayout.e.e(view, this.f69540x, this.f69541y)) {
            float fAbs = Math.abs(motionEvent.getRawX() - this.f69540x);
            float fAbs2 = Math.abs(motionEvent.getRawY() - this.f69541y);
            int i10 = this.f69529m;
            if (i10 == 1 || i10 == 2) {
                if (fAbs2 > 0.0f && ((double) fAbs2) * 1.5d > fAbs) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
            } else if ((i10 == 4 || i10 == 8) && fAbs > 0.0f && ((double) fAbs) * 1.5d > fAbs2) {
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        boolean zW = this.f69530n.W(motionEvent);
        return zW ? zW : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.ds, new Class[]{Boolean.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            try {
                this.f69533q = getWidth();
                this.f69534r = getHeight();
            } catch (Exception unused) {
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            }
        }
        if (!getSwipeBackEnable()) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int paddingLeft = getPaddingLeft() + this.f69542z;
        int paddingTop = getPaddingTop() + this.A;
        this.f69531o.layout(paddingLeft, paddingTop, this.f69531o.getMeasuredWidth() + paddingLeft, this.f69531o.getMeasuredHeight() + paddingTop);
        A();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.hs, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!getSwipeBackEnable()) {
            return false;
        }
        this.f69530n.M(motionEvent);
        return true;
    }

    public void setApartAlpha(boolean z10) {
        this.D = z10;
    }

    public void setAutoFinishedVelocityLimit(float f10) {
        this.B = f10;
    }

    public void setDirectionMode(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.ls, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69529m = i10;
        this.f69530n.T(i10);
    }

    public void setEnableGesture(boolean z10) {
        this.f69524h = z10;
    }

    public void setMaskAlpha(@f0(from = 0, to = 255) int i10) {
        if (i10 > 255) {
            i10 = 255;
        } else if (i10 < 0) {
            i10 = 0;
        }
        this.f69538v = i10;
    }

    public void setShadow(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.os, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Drawable drawable = getResources().getDrawable(i10);
        if (this.f69529m == 1) {
            this.f69518b = drawable;
        }
        invalidate();
    }

    public void setSwipeBackFactor(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        if (f10 > 1.0f) {
            f10 = 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.f69536t = f10;
    }

    public void setSwipeBackListener(e eVar) {
        this.E = eVar;
    }

    public void setSwipeFromEdge(boolean z10) {
        this.f69539w = z10;
    }

    public void w(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.f.as, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{android.R.attr.windowBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(0);
        viewGroup2.setBackgroundResource(resourceId);
        viewGroup.removeView(viewGroup2);
        addView(viewGroup2);
        this.f69531o = viewGroup2;
        viewGroup.addView(this);
        this.f69525i = activity;
        ComponentCallbacks2 componentCallbacks2B = com.max.hbcustomview.swipebacklayout.c.a().b();
        if (componentCallbacks2B == null || !(componentCallbacks2B instanceof com.max.hbcustomview.swipebacklayout.b) || this.D) {
            return;
        }
        this.f69526j = new WeakReference<>(componentCallbacks2B);
        ActivitySwipeBackLayout activitySwipeBackLayoutF0 = ((com.max.hbcustomview.swipebacklayout.b) componentCallbacks2B).f0();
        if (activitySwipeBackLayoutF0 != null) {
            this.f69521e = activitySwipeBackLayoutF0.getChildAt(0);
        }
    }

    public void y() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.bs, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Log.e("zh", "bind  SlideFinishManager.mSlideFinishLayoutList.size:: " + com.max.hbcustomview.swipebacklayout.c.a().f69587b.size());
        if (!this.f69522f || this.f69521e == null) {
            return;
        }
        Log.e("zh", "bind  mPreviousChild != null ");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f69521e, "scaleX", 1.0f, I);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f69521e, "scaleY", 1.0f, I);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new a());
        animatorSet.setDuration(250L).start();
    }
}
