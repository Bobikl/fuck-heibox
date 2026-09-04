package com.max.mediaselector.lib.magical;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.w0;
import androidx.viewpager2.widget.ViewPager2;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.utils.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes2.dex */
public class MagicalView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f75298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f75299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f75300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f75301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f75302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f75303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f75304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f75305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f75306j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f75307k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f75308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f75309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f75310n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f75311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f75312p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f75313q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final FrameLayout f75314r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final View f75315s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.max.mediaselector.lib.magical.b f75316t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f75317u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f75318v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f75319w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.max.mediaselector.lib.magical.c f75320x;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.m.f34853l2, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            MagicalView magicalView = MagicalView.this;
            MagicalView.r(magicalView, fFloatValue, magicalView.f75301e, MagicalView.this.f75307k, MagicalView.this.f75300d, MagicalView.this.f75310n, MagicalView.this.f75303g, MagicalView.this.f75308l, MagicalView.this.f75302f, MagicalView.this.f75309m);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.m.f34876m2, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            MagicalView.s(MagicalView.this);
        }
    }

    public class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34899n2, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            TransitionManager.beginDelayedTransition((ViewGroup) MagicalView.this.f75314r.getParent(), new TransitionSet().setDuration(250L).addTransition(new ChangeBounds()).addTransition(new ChangeTransform()).addTransition(new ChangeImageTransform()));
            MagicalView.d(MagicalView.this, true);
            MagicalView.this.f75314r.setTranslationX(0.0f);
            MagicalView.this.f75314r.setTranslationY(0.0f);
            MagicalView.this.f75316t.l(MagicalView.this.f75303g);
            MagicalView.this.f75316t.g(MagicalView.this.f75302f);
            MagicalView.this.f75316t.k(MagicalView.this.f75301e);
            MagicalView.this.f75316t.i(MagicalView.this.f75300d);
            MagicalView.f(MagicalView.this, true);
        }
    }

    public class d extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.m.f34922o2, new Class[]{Animator.class}, Void.TYPE).isSupported || MagicalView.this.f75320x == null) {
                return;
            }
            MagicalView.this.f75320x.c();
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.m.f34945p2, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            MagicalView.this.f75313q = true;
            MagicalView.this.f75298b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            MagicalView.this.f75315s.setAlpha(MagicalView.this.f75298b);
            if (MagicalView.this.f75320x != null) {
                MagicalView.this.f75320x.d(MagicalView.this.f75298b);
            }
        }
    }

    public class f extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f75326b;

        f(boolean z10) {
            this.f75326b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.m.f34968q2, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            MagicalView.this.f75313q = false;
            if (!this.f75326b || MagicalView.this.f75320x == null) {
                return;
            }
            MagicalView.this.f75320x.c();
        }
    }

    public MagicalView(Context context) {
        this(context, null);
    }

    public MagicalView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MagicalView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f75298b = 0.0f;
        this.f75299c = 250L;
        this.f75313q = false;
        this.f75317u = PictureSelectionConfig.c().K;
        this.f75306j = h.e(getContext());
        getScreenSize();
        View view = new View(context);
        this.f75315s = view;
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setAlpha(this.f75298b);
        addView(view);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f75314r = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f75316t = new com.max.mediaselector.lib.magical.b(frameLayout);
    }

    private void D() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.S1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75314r.getLocationOnScreen(new int[2]);
        this.f75310n = 0;
        int i10 = this.f75304h;
        int i11 = this.f75305i;
        float f10 = i10 / i11;
        int i12 = this.f75311o;
        int i13 = this.f75312p;
        if (f10 < i12 / i13) {
            this.f75308l = i10;
            int i14 = (int) (i10 * (i13 / i12));
            this.f75309m = i14;
            this.f75307k = (i11 - i14) / 2;
        } else {
            this.f75309m = i11;
            int i15 = (int) (i11 * (i12 / i13));
            this.f75308l = i15;
            this.f75307k = 0;
            this.f75310n = (i10 - i15) / 2;
        }
        this.f75316t.l(this.f75303g);
        this.f75316t.g(this.f75302f);
        this.f75316t.i(this.f75300d);
        this.f75316t.k(this.f75301e);
    }

    private void E() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.U1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75313q = false;
        z();
        com.max.mediaselector.lib.magical.c cVar = this.f75320x;
        if (cVar != null) {
            cVar.b(this, false);
        }
    }

    private void F(float f10, float f11, float f12, float f13) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Float(f13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.W1, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        H(true, 0.0f, 0.0f, f10, 0.0f, f11, 0.0f, f12, 0.0f, f13);
    }

    private void G(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Float(f13), new Float(f14), new Float(f15), new Float(f16), new Float(f17), new Float(f18)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.V1, new Class[]{cls, cls, cls, cls, cls, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        H(false, f10, f11, f12, f13, f14, f15, f16, f17, f18);
    }

    private void H(boolean z10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10), new Float(f11), new Float(f12), new Float(f13), new Float(f14), new Float(f15), new Float(f16), new Float(f17), new Float(f18)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.X1, new Class[]{Boolean.TYPE, cls, cls, cls, cls, cls, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.f75316t.l(f16);
            this.f75316t.g(f18);
            this.f75316t.i((int) f14);
            this.f75316t.k((int) f12);
            return;
        }
        this.f75316t.l(((f16 - f15) * f10) + f15);
        this.f75316t.g(f17 + ((f18 - f17) * f10));
        this.f75316t.i((int) (((f14 - f13) * f10) + f13));
        this.f75316t.k((int) (f11 + ((f12 - f11) * f10)));
    }

    static /* synthetic */ void d(MagicalView magicalView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{magicalView, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.f34807j2, new Class[]{MagicalView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        magicalView.w(z10);
    }

    static /* synthetic */ void f(MagicalView magicalView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{magicalView, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.f34830k2, new Class[]{MagicalView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        magicalView.y(z10);
    }

    private void getScreenSize() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.P1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75304h = h.f(getContext());
        if (this.f75317u) {
            this.f75305i = h.e(getContext());
        } else {
            this.f75305i = h.h(getContext());
        }
    }

    static /* synthetic */ void r(MagicalView magicalView, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        Object[] objArr = {magicalView, new Float(f10), new Float(f11), new Float(f12), new Float(f13), new Float(f14), new Float(f15), new Float(f16), new Float(f17), new Float(f18)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34761h2, new Class[]{MagicalView.class, cls, cls, cls, cls, cls, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        magicalView.G(f10, f11, f12, f13, f14, f15, f16, f17, f18);
    }

    static /* synthetic */ void s(MagicalView magicalView) {
        if (PatchProxy.proxy(new Object[]{magicalView}, null, changeQuickRedirect, true, bb.c.m.f34784i2, new Class[]{MagicalView.class}, Void.TYPE).isSupported) {
            return;
        }
        magicalView.E();
    }

    @w0(api = 21)
    private void u() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Z1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75314r.post(new c());
    }

    private void v() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34622b2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75314r.animate().alpha(0.0f).setDuration(250L).setListener(new d()).start();
        this.f75315s.animate().alpha(0.0f).setDuration(250L).start();
    }

    private void w(boolean z10) {
        if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.f34599a2, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && z10) {
            this.f75320x.a(true);
        }
    }

    private void x(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.T1, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.f75298b = 1.0f;
            this.f75315s.setAlpha(1.0f);
            F(this.f75307k, this.f75310n, this.f75308l, this.f75309m);
            E();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.addListener(new b());
        valueAnimatorOfFloat.setDuration(250L).start();
        y(false);
    }

    private void y(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.f34645c2, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f75298b, z10 ? 0.0f : 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new e());
        valueAnimatorOfFloat.addListener(new f(z10));
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.start();
    }

    private void z() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34692e2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.f75305i;
        this.f75309m = i10;
        this.f75308l = this.f75304h;
        this.f75307k = 0;
        this.f75316t.g(i10);
        this.f75316t.l(this.f75304h);
        this.f75316t.k(0);
        this.f75316t.i(0);
    }

    public void A(int i10, int i11, boolean z10) {
        int i12;
        int i13;
        Object[] objArr = {new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.Q1, new Class[]{cls, cls, Boolean.TYPE}, Void.TYPE).isSupported && !this.f75317u && (i12 = this.f75304h) <= (i13 = this.f75305i) && ((int) (i12 / (i10 / i11))) > i13) {
            this.f75305i = this.f75306j;
            if (z10) {
                this.f75316t.l(i12);
                this.f75316t.g(this.f75305i);
            }
        }
    }

    public void B() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.O1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getScreenSize();
        I(true);
    }

    public void C(int i10, int i11, boolean z10) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.R1, new Class[]{cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getScreenSize();
        J(i10, i11, z10);
    }

    public void I(boolean z10) {
        float f10;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.N1, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            f10 = 1.0f;
            this.f75298b = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f75298b = f10;
        this.f75315s.setAlpha(f10);
        setVisibility(0);
        D();
        x(z10);
    }

    public void J(int i10, int i11, boolean z10) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.M1, new Class[]{cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75311o = i10;
        this.f75312p = i11;
        this.f75300d = 0;
        this.f75301e = 0;
        this.f75303g = 0;
        this.f75302f = 0;
        setVisibility(0);
        D();
        F(this.f75307k, this.f75310n, this.f75308l, this.f75309m);
        if (z10) {
            this.f75298b = 1.0f;
            this.f75315s.setAlpha(1.0f);
        } else {
            this.f75298b = 0.0f;
            this.f75315s.setAlpha(0.0f);
            this.f75314r.setAlpha(0.0f);
            this.f75314r.animate().alpha(1.0f).setDuration(250L).start();
            this.f75315s.animate().alpha(1.0f).setDuration(250L).start();
        }
        E();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.m.f34738g2, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        View childAt = this.f75314r.getChildAt(0);
        ViewPager2 viewPager2 = childAt instanceof ViewPager2 ? (ViewPager2) childAt : null;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f75318v = (int) motionEvent.getX();
            this.f75319w = (int) motionEvent.getY();
            if (viewPager2 != null) {
                viewPager2.setUserInputEnabled(true);
            }
        } else if (action == 1) {
            if (viewPager2 != null) {
                viewPager2.setUserInputEnabled(true);
            }
        } else if (action == 2) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (Math.abs(x10 - this.f75318v) > Math.abs(y10 - this.f75319w)) {
                if (viewPager2 != null) {
                    viewPager2.setUserInputEnabled(true);
                }
            } else if (viewPager2 != null) {
                viewPager2.setUserInputEnabled(canScrollVertically(this.f75319w - y10));
            }
        } else if (action == 3) {
            if (viewPager2 != null) {
                viewPager2.setUserInputEnabled(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setBackgroundAlpha(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.f34715f2, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75298b = f10;
        this.f75315s.setAlpha(f10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.L1, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75315s.setBackgroundColor(i10);
    }

    public void setMagicalContent(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.f34669d2, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75314r.addView(view);
    }

    public void setOnMojitoViewCallback(com.max.mediaselector.lib.magical.c cVar) {
        this.f75320x = cVar;
    }

    public void setViewParams(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f75311o = i14;
        this.f75312p = i15;
        this.f75300d = i10;
        this.f75301e = i11;
        this.f75303g = i12;
        this.f75302f = i13;
    }

    public void t() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Y1, new Class[0], Void.TYPE).isSupported || this.f75313q) {
            return;
        }
        if (this.f75303g == 0 || this.f75302f == 0) {
            v();
            return;
        }
        com.max.mediaselector.lib.magical.c cVar = this.f75320x;
        if (cVar != null) {
            cVar.e();
        }
        w(false);
        u();
    }
}
