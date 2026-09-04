package com.max.xiaoheihe.max.helper;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.n0;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: EtTranslater.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f77302o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f77303p = 270;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f77304q = 70;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f77306b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f77309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InputMethodManager f77310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f77311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k f77312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View f77313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f77314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Context f77315k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f77305a = bb.c.b.M3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f77307c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f77308d = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View.OnClickListener f77316l = new f();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View.OnClickListener f77317m = new g();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View.OnTouchListener f77318n = new h();

    /* JADX INFO: renamed from: com.max.xiaoheihe.max.helper.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EtTranslater.java */
    public class C0632a implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0632a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 22156, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.f77307c = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: compiled from: EtTranslater.java */
    public class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f77320b;

        b(l lVar) {
            this.f77320b = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22155, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (a.this.f77312h != null) {
                a.this.f77312h.t0();
            }
            this.f77320b.a();
        }
    }

    /* JADX INFO: compiled from: EtTranslater.java */
    public class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22157, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            a.this.f77309e.setTranslationY(-a.this.f77306b);
        }
    }

    /* JADX INFO: compiled from: EtTranslater.java */
    public class d implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f77323a;

        d(boolean z10) {
            this.f77323a = z10;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 22159, new Class[]{Animation.class}, Void.TYPE).isSupported || this.f77323a) {
                return;
            }
            a.this.f77311g.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (!PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 22158, new Class[]{Animation.class}, Void.TYPE).isSupported && this.f77323a) {
                a.this.f77311g.setVisibility(0);
            }
        }
    }

    /* JADX INFO: compiled from: EtTranslater.java */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 22160, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.f77309e.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
            if (valueAnimator.getAnimatedFraction() != 1.0f || a.this.f77312h == null) {
                return;
            }
            a.this.f77312h.t0();
        }
    }

    /* JADX INFO: compiled from: EtTranslater.java */
    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22161, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!a.this.f77308d) {
                a.g(a.this, view);
                return;
            }
            if (a.this.f77312h != null) {
                a.this.f77312h.O();
            }
            a.f(a.this, view);
        }
    }

    /* JADX INFO: compiled from: EtTranslater.java */
    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22162, new Class[]{View.class}, Void.TYPE).isSupported || a.this.f77308d) {
                return;
            }
            if (a.this.f77312h != null) {
                a.this.f77312h.O();
            }
            a.g(a.this, view);
            a.h(a.this, view);
        }
    }

    /* JADX INFO: compiled from: EtTranslater.java */
    public class h implements View.OnTouchListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, 22163, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            view.requestFocus();
            return false;
        }
    }

    /* JADX INFO: compiled from: EtTranslater.java */
    public class i implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22164, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            a.this.f77309e.setTranslationY(-a.this.f77306b);
        }
    }

    /* JADX INFO: compiled from: EtTranslater.java */
    public class j implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f77330b;

        j(View view) {
            this.f77330b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 22166, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.f77307c = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 22165, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            a.i(a.this, this.f77330b);
            a.this.f77307c = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: compiled from: EtTranslater.java */
    public interface k {
        void O();

        void t0();
    }

    /* JADX INFO: compiled from: EtTranslater.java */
    public interface l {
        void a();
    }

    private Animator A(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22140, new Class[]{View.class}, Animator.class);
        if (patchProxyResultProxy.isSupported) {
            return (Animator) patchProxyResultProxy.result;
        }
        ValueAnimator valueAnimatorOfFloat = null;
        if (!this.f77307c && !f77302o) {
            this.f77307c = true;
            this.f77308d = true;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.f77306b);
            valueAnimatorOfFloat.setDuration(this.f77305a);
            valueAnimatorOfFloat.addListener(w(view));
            valueAnimatorOfFloat.addUpdateListener(x());
            if (this.f77311g != null) {
                this.f77311g.startAnimation(u(false));
            }
            if (this.f77314j != null) {
                this.f77314j.startAnimation(t(false));
            }
            valueAnimatorOfFloat.setInterpolator(r());
            valueAnimatorOfFloat.start();
        }
        return valueAnimatorOfFloat;
    }

    private void C(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22145, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f77310f.showSoftInput(view, 1);
    }

    static /* synthetic */ Animator f(a aVar, View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, view}, null, changeQuickRedirect, true, 22151, new Class[]{a.class, View.class}, Animator.class);
        return patchProxyResultProxy.isSupported ? (Animator) patchProxyResultProxy.result : aVar.z(view);
    }

    static /* synthetic */ void g(a aVar, View view) {
        if (PatchProxy.proxy(new Object[]{aVar, view}, null, changeQuickRedirect, true, 22152, new Class[]{a.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.y(view);
    }

    static /* synthetic */ Animator h(a aVar, View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, view}, null, changeQuickRedirect, true, 22153, new Class[]{a.class, View.class}, Animator.class);
        return patchProxyResultProxy.isSupported ? (Animator) patchProxyResultProxy.result : aVar.A(view);
    }

    static /* synthetic */ void i(a aVar, View view) {
        if (PatchProxy.proxy(new Object[]{aVar, view}, null, changeQuickRedirect, true, 22154, new Class[]{a.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        aVar.C(view);
    }

    private float p(Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, this, changeQuickRedirect, false, 22147, new Class[]{Context.class, Integer.TYPE}, Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : (i10 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static Interpolator q() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 22136, new Class[0], Interpolator.class);
        return patchProxyResultProxy.isSupported ? (Interpolator) patchProxyResultProxy.result : new AccelerateInterpolator();
    }

    public static Interpolator r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 22135, new Class[0], Interpolator.class);
        return patchProxyResultProxy.isSupported ? (Interpolator) patchProxyResultProxy.result : new DecelerateInterpolator();
    }

    private Animator.AnimatorListener s(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22150, new Class[]{View.class}, Animator.AnimatorListener.class);
        return patchProxyResultProxy.isSupported ? (Animator.AnimatorListener) patchProxyResultProxy.result : new C0632a();
    }

    private Animation t(boolean z10) {
        Interpolator interpolatorQ;
        float f10;
        float f11;
        int i10;
        int i11 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22141, new Class[]{Boolean.TYPE}, Animation.class);
        if (patchProxyResultProxy.isSupported) {
            return (Animation) patchProxyResultProxy.result;
        }
        AnimationSet animationSet = new AnimationSet(true);
        if (z10) {
            int i12 = -ViewUtils.f(this.f77315k, 70.0f);
            interpolatorQ = q();
            f10 = 1.0f;
            f11 = 0.8f;
            i11 = i12;
            i10 = 0;
        } else {
            i10 = -ViewUtils.f(this.f77315k, 70.0f);
            interpolatorQ = r();
            f11 = 1.0f;
            f10 = 0.8f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i11, i10);
        translateAnimation.setDuration(this.f77305a);
        translateAnimation.setFillAfter(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f11, f10, f11, f10, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(this.f77305a);
        scaleAnimation.setFillAfter(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setFillAfter(true);
        animationSet.setFillAfter(true);
        animationSet.setInterpolator(interpolatorQ);
        return animationSet;
    }

    @n0
    private Animation u(boolean z10) {
        AlphaAnimation alphaAnimation;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22142, new Class[]{Boolean.TYPE}, Animation.class);
        if (patchProxyResultProxy.isSupported) {
            return (Animation) patchProxyResultProxy.result;
        }
        if (z10) {
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(q());
        } else {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setInterpolator(r());
        }
        alphaAnimation.setDuration(this.f77305a);
        alphaAnimation.setAnimationListener(v(z10));
        alphaAnimation.setFillBefore(true);
        return alphaAnimation;
    }

    private Animation.AnimationListener v(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22143, new Class[]{Boolean.TYPE}, Animation.AnimationListener.class);
        return patchProxyResultProxy.isSupported ? (Animation.AnimationListener) patchProxyResultProxy.result : new d(z10);
    }

    private Animator.AnimatorListener w(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22149, new Class[]{View.class}, Animator.AnimatorListener.class);
        return patchProxyResultProxy.isSupported ? (Animator.AnimatorListener) patchProxyResultProxy.result : new j(view);
    }

    @TargetApi(12)
    private ValueAnimator.AnimatorUpdateListener x() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22144, new Class[0], ValueAnimator.AnimatorUpdateListener.class);
        return patchProxyResultProxy.isSupported ? (ValueAnimator.AnimatorUpdateListener) patchProxyResultProxy.result : new e();
    }

    private void y(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22146, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f77310f.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    private Animator z(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22148, new Class[]{View.class}, Animator.class);
        if (patchProxyResultProxy.isSupported) {
            return (Animator) patchProxyResultProxy.result;
        }
        ValueAnimator valueAnimatorOfFloat = null;
        if (!this.f77307c && !f77302o) {
            this.f77307c = true;
            this.f77308d = false;
            y(view);
            valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f77306b, 0.0f);
            valueAnimatorOfFloat.setDuration(this.f77305a);
            valueAnimatorOfFloat.addListener(s(view));
            valueAnimatorOfFloat.addUpdateListener(x());
            if (this.f77311g != null) {
                this.f77311g.startAnimation(u(true));
            }
            if (this.f77314j != null) {
                this.f77314j.startAnimation(t(true));
            }
            valueAnimatorOfFloat.setInterpolator(q());
            valueAnimatorOfFloat.start();
        }
        return valueAnimatorOfFloat;
    }

    public void B(Context context, int i10) {
        if (PatchProxy.proxy(new Object[]{context, new Integer(i10)}, this, changeQuickRedirect, false, 22138, new Class[]{Context.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f77306b = p(context, 270 - i10);
    }

    public void k(View view) {
        this.f77311g = view;
    }

    public void l(k kVar) {
        this.f77312h = kVar;
    }

    public void m(View view) {
        this.f77314j = view;
    }

    public a n(Context context, View view, View view2, EditText... editTextArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, view, view2, editTextArr}, this, changeQuickRedirect, false, 22137, new Class[]{Context.class, View.class, View.class, EditText[].class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        this.f77306b = p(context, 270);
        this.f77309e = view;
        this.f77315k = context;
        this.f77310f = (InputMethodManager) context.getSystemService("input_method");
        this.f77313i = view2;
        view2.setOnClickListener(this.f77316l);
        for (int i10 = 0; i10 < editTextArr.length; i10++) {
            editTextArr[i10].setOnClickListener(this.f77317m);
            editTextArr[i10].setOnTouchListener(this.f77318n);
        }
        return this;
    }

    public void o(l lVar) {
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 22139, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!this.f77308d) {
            if (lVar != null) {
                lVar.a();
            }
        } else {
            this.f77316l.onClick(this.f77313i);
            if (lVar != null) {
                new Handler().postDelayed(new b(lVar), this.f77305a);
            }
        }
    }
}
