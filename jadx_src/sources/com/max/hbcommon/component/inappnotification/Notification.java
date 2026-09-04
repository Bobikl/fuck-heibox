package com.max.hbcommon.component.inappnotification;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.max.hbcustomview.CubicBezierInterpolators;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Notification.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nNotification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Notification.kt\ncom/max/hbcommon/component/inappnotification/Notification\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,528:1\n1#2:529\n*E\n"})
@SuppressLint({"ViewConstructor"})
public final class Notification extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final q f67729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f67730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private View f67731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private r f67732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final Handler f67733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f67734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f67735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f67736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f67737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f67738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f67739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f67740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f67741n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f67742o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f67743p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f67744q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.e
    private VelocityTracker f67745r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private Direction f67746s;

    /* JADX INFO: compiled from: Notification.kt */
    @t0({"SMAP\nNotification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Notification.kt\ncom/max/hbcommon/component/inappnotification/Notification$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,528:1\n1#2:529\n*E\n"})
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final Context f67747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final q f67748b;

        public a(@dl.d Context context) {
            f0.p(context, "context");
            this.f67747a = context;
            this.f67748b = new q();
        }

        public static /* synthetic */ a h(a aVar, int i10, int i11, Object obj) {
            Object[] objArr = {aVar, new Integer(i10), new Integer(i11), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.e.f32066w0, new Class[]{a.class, cls, cls, Object.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            if ((i11 & 1) != 0) {
                i10 = 0;
            }
            return aVar.f(i10);
        }

        public static /* synthetic */ a j(a aVar, Context context, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, context, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.e.I0, new Class[]{a.class, Context.class, Integer.TYPE, Object.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                context = aVar.f67747a;
            }
            return aVar.i(context);
        }

        @dl.d
        public final a a(boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.e.F0, new Class[]{Boolean.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f67748b.l(z10);
            return this;
        }

        @dl.d
        public final a b(@dl.d Direction direction) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{direction}, this, changeQuickRedirect, false, bb.c.e.D0, new Class[]{Direction.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(direction, "direction");
            this.f67748b.m(direction);
            return this;
        }

        @dl.d
        public final Notification c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.G0, new Class[0], Notification.class);
            if (patchProxyResultProxy.isSupported) {
                return (Notification) patchProxyResultProxy.result;
            }
            if (this.f67748b.d() == null && this.f67748b.e() == 0) {
                throw new IllegalArgumentException("ContentView was not set");
            }
            return new Notification(this.f67747a, this.f67748b, null);
        }

        @dl.d
        public final a d(boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.e.C0, new Class[]{Boolean.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f67748b.o(z10);
            return this;
        }

        @dl.d
        public final Context e() {
            return this.f67747a;
        }

        public boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.e.L0, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && f0.g(this.f67747a, ((a) obj).f67747a);
        }

        @dl.d
        public final a f(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.e.f32049v0, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f67748b.p(null);
            this.f67748b.q(i10);
            return this;
        }

        @dl.d
        public final a g(@dl.e View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.e.f32032u0, new Class[]{View.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f67748b.p(view);
            this.f67748b.q(0);
            return this;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.K0, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f67747a.hashCode();
        }

        @dl.d
        public final a i(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.e.H0, new Class[]{Context.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            return new a(context);
        }

        @dl.d
        public final a k(long j10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.e.f32117z0, new Class[]{Long.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            q qVar = this.f67748b;
            if (j10 <= 0) {
                j10 = 150;
            }
            qVar.r(j10);
            return this;
        }

        @dl.d
        public final a l(long j10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.e.f32100y0, new Class[]{Long.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            q qVar = this.f67748b;
            if (j10 <= 0) {
                j10 = 100;
            }
            qVar.s(j10);
            return this;
        }

        @dl.d
        public final Context m() {
            return this.f67747a;
        }

        @dl.d
        public final a n(boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.e.E0, new Class[]{Boolean.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f67748b.n(z10);
            return this;
        }

        @dl.d
        public final a o(@dl.e r rVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{rVar}, this, changeQuickRedirect, false, bb.c.e.f32083x0, new Class[]{r.class}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f67748b.t(rVar);
            return this;
        }

        @dl.d
        public final a p(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 3600, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f67748b.u(i10);
            return this;
        }

        @dl.d
        public final a q(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.e.B0, new Class[]{Integer.TYPE}, a.class);
            if (patchProxyResultProxy.isSupported) {
                return (a) patchProxyResultProxy.result;
            }
            this.f67748b.v(i10);
            return this;
        }

        @dl.d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.J0, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "Builder(context=" + this.f67747a + ')';
        }
    }

    /* JADX INFO: compiled from: Notification.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67749a;

        static {
            int[] iArr = new int[Direction.valuesCustom().length];
            try {
                iArr[Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Direction.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f67749a = iArr;
        }
    }

    /* JADX INFO: compiled from: Notification.kt */
    public static final class c extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Notification f67751c;

        c(Notification notification) {
            this.f67751c = notification;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.e.N0, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            Notification.this.setAlpha(1.0f);
            this.f67751c.f67730c = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.e.M0, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            Notification.this.setAlpha(0.25f);
            Notification.this.setVisibility(0);
        }
    }

    @xh.i
    private Notification(Context context, q qVar) {
        super(context);
        this.f67729b = qVar;
        this.f67733f = new Handler(Looper.getMainLooper());
        this.f67736i = -1.0f;
        this.f67737j = -1.0f;
        this.f67746s = Direction.NONE;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f67742o = viewConfiguration.getScaledTouchSlop();
        this.f67743p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f67744q = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f67732e = qVar.h();
        H();
    }

    public /* synthetic */ Notification(Context context, q qVar, u uVar) {
        this(context, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(final Notification this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.e.f31913n0, new Class[]{Notification.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        if (this$0.f67730c) {
            return;
        }
        this$0.f67730c = true;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = this$0.animate();
        viewPropertyAnimatorAnimate.setDuration(this$0.f67729b.g());
        viewPropertyAnimatorAnimate.translationX(this$0.getWidth() * 0.6f);
        viewPropertyAnimatorAnimate.alpha(0.0f);
        viewPropertyAnimatorAnimate.setInterpolator(CubicBezierInterpolators.a(CubicBezierInterpolators.Type.EASE_OUT));
        viewPropertyAnimatorAnimate.withEndAction(new Runnable() { // from class: com.max.hbcommon.component.inappnotification.h
            @Override // java.lang.Runnable
            public final void run() {
                Notification.B(this.f67766b);
            }
        });
        viewPropertyAnimatorAnimate.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(Notification this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.e.f31896m0, new Class[]{Notification.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.s();
        this$0.f67730c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(final Notification this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.e.f31947p0, new Class[]{Notification.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        if (this$0.f67730c) {
            return;
        }
        this$0.f67730c = true;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = this$0.animate();
        viewPropertyAnimatorAnimate.setDuration(this$0.f67729b.g());
        viewPropertyAnimatorAnimate.translationY(this$0.getHeight() * (-0.6f));
        viewPropertyAnimatorAnimate.alpha(0.0f);
        viewPropertyAnimatorAnimate.setInterpolator(CubicBezierInterpolators.a(CubicBezierInterpolators.Type.EASE_OUT));
        viewPropertyAnimatorAnimate.withEndAction(new Runnable() { // from class: com.max.hbcommon.component.inappnotification.p
            @Override // java.lang.Runnable
            public final void run() {
                Notification.E(this.f67776b);
            }
        });
        viewPropertyAnimatorAnimate.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(Notification this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.e.f31930o0, new Class[]{Notification.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.s();
        this$0.f67730c = false;
    }

    private final boolean F(KeyEvent keyEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyEvent}, this, changeQuickRedirect, false, bb.c.e.W, new Class[]{KeyEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (keyEvent != null) {
            return keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 4;
        }
        return false;
    }

    private final void G() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.X, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67734g = false;
        this.f67735h = false;
        this.f67740m = 0.0f;
        this.f67741n = 0.0f;
        this.f67746s = Direction.NONE;
        VelocityTracker velocityTracker = this.f67745r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f67745r = null;
    }

    private final void H() {
        FrameLayout.LayoutParams layoutParams;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.U, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewD = this.f67729b.d();
        if (viewD == null) {
            viewD = LayoutInflater.from(getContext()).inflate(this.f67729b.e(), (ViewGroup) this, false);
        }
        this.f67731d = viewD;
        if (viewD != null) {
            if (viewD.getLayoutParams() == null) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            } else {
                ViewGroup.LayoutParams layoutParams2 = viewD.getLayoutParams();
                f0.n(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            }
            layoutParams.gravity = 17;
            addView(viewD, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(final Notification view, final Notification this$0) {
        if (PatchProxy.proxy(new Object[]{view, this$0}, null, changeQuickRedirect, true, bb.c.e.f31845j0, new Class[]{Notification.class, Notification.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "$view");
        f0.p(this$0, "this$0");
        view.setVisibility(4);
        try {
            WindowManager windowManagerJ = kb.c.j(this$0);
            windowManagerJ.addView(view, this$0.r());
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            windowManagerJ.updateViewLayout(view, (WindowManager.LayoutParams) layoutParams);
        } catch (Throwable th2) {
            try {
                Log.e("Notification", "windowManager() error " + th2.getMessage());
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                Context context = this$0.getContext();
                f0.n(context, "null cannot be cast to non-null type android.app.Activity");
                ViewGroup viewGroup = (ViewGroup) ((Activity) context).findViewById(R.id.content);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams2.gravity = 48;
                layoutParams2.topMargin = this$0.f67729b.j();
                layoutParams2.leftMargin = this$0.f67729b.i();
                view.setLayoutParams(layoutParams2);
                viewGroup.addView(view);
            } catch (Throwable th3) {
                Log.e("Notification", "decorView error " + th3.getMessage());
            }
        }
        if (this$0.f67730c) {
            return;
        }
        this$0.f67730c = true;
        final int iL = (this$0.f67729b.b() == Direction.LEFT || this$0.f67729b.b() == Direction.RIGHT) ? ViewUtils.L(this$0.getContext()) : ViewUtils.f(this$0.getContext(), 120.0f);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iL);
        valueAnimatorOfInt.setDuration(this$0.f67729b.f());
        valueAnimatorOfInt.setInterpolator(CubicBezierInterpolators.a(CubicBezierInterpolators.Type.EASE_OUT));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbcommon.component.inappnotification.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Notification.K(this.f67769b, iL, this$0, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(view.new c(this$0));
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(Notification view, int i10, Notification this$0, ValueAnimator it) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10), this$0, it}, null, changeQuickRedirect, true, bb.c.e.f31829i0, new Class[]{Notification.class, Integer.TYPE, Notification.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "$view");
        f0.p(this$0, "this$0");
        f0.p(it, "it");
        Object animatedValue = it.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        view.setAlpha((iIntValue * 1.0f) / i10);
        int i11 = b.f67749a[this$0.f67729b.b().ordinal()];
        if (i11 == 1) {
            view.scrollTo(i10 - iIntValue, 0);
            return;
        }
        if (i11 == 2) {
            view.scrollTo(iIntValue - i10, 0);
        } else if (i11 != 4) {
            view.scrollTo(0, i10 - iIntValue);
        } else {
            view.scrollTo(0, iIntValue - i10);
        }
    }

    private final void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31812h0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67733f.post(new Runnable() { // from class: com.max.hbcommon.component.inappnotification.n
            @Override // java.lang.Runnable
            public final void run() {
                Notification.o(this.f67774b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(final Notification this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.e.f32015t0, new Class[]{Notification.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        if (this$0.f67730c) {
            return;
        }
        this$0.f67730c = true;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = this$0.animate();
        viewPropertyAnimatorAnimate.setDuration(this$0.f67729b.g());
        viewPropertyAnimatorAnimate.translationX(0.0f);
        viewPropertyAnimatorAnimate.setInterpolator(CubicBezierInterpolators.a(CubicBezierInterpolators.Type.EASE_OUT));
        viewPropertyAnimatorAnimate.withEndAction(new Runnable() { // from class: com.max.hbcommon.component.inappnotification.j
            @Override // java.lang.Runnable
            public final void run() {
                Notification.p(this.f67768b);
            }
        });
        viewPropertyAnimatorAnimate.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Notification this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.e.f31998s0, new Class[]{Notification.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.f67730c = false;
    }

    private final int q(int i10) {
        return (i10 & 2071559655) | 256 | 134217728 | 1024 | 512 | 8 | 32;
    }

    private final WindowManager.LayoutParams r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.V, new Class[0], WindowManager.LayoutParams.class);
        if (patchProxyResultProxy.isSupported) {
            return (WindowManager.LayoutParams) patchProxyResultProxy.result;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.x = this.f67729b.i();
        layoutParams.y = this.f67729b.j();
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = (!this.f67729b.k() ? 48 : 80) | androidx.core.view.n.f21701b;
        layoutParams.type = 1000;
        layoutParams.format = -3;
        View viewD = this.f67729b.d();
        layoutParams.token = viewD != null ? viewD.getApplicationWindowToken() : null;
        layoutParams.flags = q(layoutParams.flags);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(final Notification this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.e.f31981r0, new Class[]{Notification.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        if (this$0.f67730c) {
            return;
        }
        this$0.f67730c = true;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = this$0.animate();
        viewPropertyAnimatorAnimate.setDuration(this$0.f67729b.g());
        viewPropertyAnimatorAnimate.translationY(this$0.getHeight() * 0.6f);
        viewPropertyAnimatorAnimate.alpha(0.0f);
        viewPropertyAnimatorAnimate.setInterpolator(CubicBezierInterpolators.a(CubicBezierInterpolators.Type.EASE_OUT));
        viewPropertyAnimatorAnimate.withEndAction(new Runnable() { // from class: com.max.hbcommon.component.inappnotification.o
            @Override // java.lang.Runnable
            public final void run() {
                Notification.v(this.f67775b);
            }
        });
        viewPropertyAnimatorAnimate.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(Notification this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.e.f31964q0, new Class[]{Notification.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.s();
        this$0.f67730c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(final Notification this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.e.f31879l0, new Class[]{Notification.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        if (this$0.f67730c) {
            return;
        }
        this$0.f67730c = true;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = this$0.animate();
        viewPropertyAnimatorAnimate.setDuration(this$0.f67729b.g());
        viewPropertyAnimatorAnimate.translationX(this$0.getWidth() * (-0.6f));
        viewPropertyAnimatorAnimate.alpha(0.0f);
        viewPropertyAnimatorAnimate.setInterpolator(CubicBezierInterpolators.a(CubicBezierInterpolators.Type.EASE_OUT));
        viewPropertyAnimatorAnimate.withEndAction(new Runnable() { // from class: com.max.hbcommon.component.inappnotification.g
            @Override // java.lang.Runnable
            public final void run() {
                Notification.y(this.f67765b);
            }
        });
        viewPropertyAnimatorAnimate.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(Notification this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, bb.c.e.f31862k0, new Class[]{Notification.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.s();
        this$0.f67730c = false;
    }

    public final void C() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31778f0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67733f.post(new Runnable() { // from class: com.max.hbcommon.component.inappnotification.m
            @Override // java.lang.Runnable
            public final void run() {
                Notification.D(this.f67773b);
            }
        });
    }

    public final void I() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31727c0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67733f.post(new Runnable() { // from class: com.max.hbcommon.component.inappnotification.e
            @Override // java.lang.Runnable
            public final void run() {
                Notification.J(this.f67762b, this);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@dl.e KeyEvent keyEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyEvent}, this, changeQuickRedirect, false, bb.c.e.Y, new Class[]{KeyEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!F(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        s();
        return true;
    }

    @dl.d
    public final q getInfo() {
        return this.f67729b;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@dl.e MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.e.Z, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!this.f67729b.c()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.f67730c) {
            return true;
        }
        if (motionEvent != null) {
            if (this.f67745r == null) {
                this.f67745r = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker = this.f67745r;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f67736i = motionEvent.getRawX();
                this.f67737j = motionEvent.getRawY();
                Log.d("onInterceptTouchEvent", "ACTION_DOWN");
            } else if (action == 1) {
                Log.d("onInterceptTouchEvent", "ACTION_UP");
                if (this.f67734g) {
                    return true;
                }
                VelocityTracker velocityTracker2 = this.f67745r;
                if (velocityTracker2 != null) {
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker2.computeCurrentVelocity(1000, this.f67744q);
                    this.f67740m = velocityTracker2.getXVelocity(pointerId);
                    this.f67741n = velocityTracker2.getYVelocity(pointerId);
                    float fAbs = Math.abs(this.f67740m);
                    float fAbs2 = Math.abs(this.f67741n);
                    int i10 = this.f67743p;
                    boolean z10 = (((float) i10) <= fAbs && fAbs <= ((float) this.f67744q)) || (((float) i10) <= fAbs2 && fAbs2 <= ((float) this.f67744q));
                    this.f67735h = z10;
                    if (z10) {
                        return true;
                    }
                }
            } else if (action == 2) {
                Log.d("onInterceptTouchEvent", "ACTION_MOVE");
                if (this.f67734g) {
                    return true;
                }
                this.f67738k = motionEvent.getRawX() - this.f67736i;
                this.f67739l = motionEvent.getRawY() - this.f67737j;
                this.f67736i = motionEvent.getRawX();
                this.f67737j = motionEvent.getRawY();
                if (Math.abs(this.f67738k) > Math.abs(this.f67739l)) {
                    if (Math.abs(this.f67738k) > this.f67742o) {
                        this.f67734g = true;
                        return true;
                    }
                } else if (Math.abs(this.f67739l) > this.f67742o) {
                    this.f67734g = true;
                    return true;
                }
            } else if (action == 3) {
                G();
                return false;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@dl.e MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.e.f31693a0, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!this.f67729b.c()) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f67730c) {
            return true;
        }
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action == 1) {
                Log.d("onTouchEvent", "ACTION_UP  isScrolling:" + this.f67734g + " isFling:" + this.f67735h);
                VelocityTracker velocityTracker = this.f67745r;
                if (velocityTracker != null) {
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, this.f67744q);
                    this.f67740m = velocityTracker.getXVelocity(pointerId);
                    this.f67741n = velocityTracker.getYVelocity(pointerId);
                    float fAbs = Math.abs(this.f67740m);
                    float fAbs2 = Math.abs(this.f67741n);
                    int i10 = this.f67743p;
                    this.f67735h = (((float) i10) <= fAbs && fAbs <= ((float) this.f67744q)) || (((float) i10) <= fAbs2 && fAbs2 <= ((float) this.f67744q));
                }
                if (this.f67734g) {
                    int i11 = b.f67749a[this.f67746s.ordinal()];
                    if (i11 == 1) {
                        w();
                    } else if (i11 == 2) {
                        z();
                    } else if (i11 == 3) {
                        C();
                    } else if (i11 == 4) {
                        n();
                    }
                    G();
                    return true;
                }
                if (this.f67735h) {
                    float fAbs3 = Math.abs(this.f67740m);
                    float fAbs4 = Math.abs(this.f67741n);
                    if (fAbs3 > fAbs4) {
                        if (this.f67740m > 0.0f) {
                            z();
                        } else {
                            w();
                        }
                        G();
                        return true;
                    }
                    if (this.f67743p <= fAbs4 && fAbs4 <= this.f67744q) {
                        if (fAbs4 < 0.0f) {
                            C();
                            G();
                            return true;
                        }
                        G();
                    }
                }
            } else {
                if (action == 2) {
                    Log.d("onTouchEvent", "ACTION_MOVE");
                    this.f67738k = motionEvent.getRawX() - this.f67736i;
                    this.f67739l = motionEvent.getRawY() - this.f67737j;
                    this.f67736i = motionEvent.getRawX();
                    this.f67737j = motionEvent.getRawY();
                    this.f67734g = true;
                    if (Math.abs(this.f67738k) > Math.abs(this.f67739l)) {
                        this.f67746s = this.f67738k < 0.0f ? Direction.LEFT : Direction.RIGHT;
                        return true;
                    }
                    this.f67746s = this.f67739l < 0.0f ? Direction.UP : Direction.DOWN;
                    if (getY() <= 0.0f) {
                        setY(getY() + this.f67739l);
                        setY(Math.min(0.0f, getY()));
                    }
                    return true;
                }
                if (action == 3 && this.f67734g) {
                    G();
                    return true;
                }
            }
        }
        return false;
    }

    public final void s() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31710b0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kb.c.f(kb.c.j(this), this);
        removeView(this.f67731d);
    }

    public final void t() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31795g0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67733f.post(new Runnable() { // from class: com.max.hbcommon.component.inappnotification.l
            @Override // java.lang.Runnable
            public final void run() {
                Notification.u(this.f67772b);
            }
        });
    }

    public final void w() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31744d0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67733f.post(new Runnable() { // from class: com.max.hbcommon.component.inappnotification.i
            @Override // java.lang.Runnable
            public final void run() {
                Notification.x(this.f67767b);
            }
        });
    }

    public final void z() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31761e0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67733f.post(new Runnable() { // from class: com.max.hbcommon.component.inappnotification.f
            @Override // java.lang.Runnable
            public final void run() {
                Notification.A(this.f67764b);
            }
        });
    }
}
