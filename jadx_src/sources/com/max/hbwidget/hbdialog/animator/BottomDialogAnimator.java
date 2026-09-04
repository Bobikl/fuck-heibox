package com.max.hbwidget.hbdialog.animator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: BottomDialogAnimator.kt */
/* JADX INFO: loaded from: classes2.dex */
@t0({"SMAP\nBottomDialogAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomDialogAnimator.kt\ncom/max/hbwidget/hbdialog/animator/BottomDialogAnimator\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,82:1\n94#2,14:83\n94#2,14:97\n*S KotlinDebug\n*F\n+ 1 BottomDialogAnimator.kt\ncom/max/hbwidget/hbdialog/animator/BottomDialogAnimator\n*L\n46#1:83,14\n65#1:97,14\n*E\n"})
public final class BottomDialogAnimator implements j {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final b f74375h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f74376i = 300;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final View f74377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private a f74378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f74379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f74380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private ValueAnimator f74381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private ValueAnimator f74382g;

    /* JADX INFO: compiled from: BottomDialogAnimator.kt */
    public interface a {
        void a(float f10);

        void b(float f10);
    }

    /* JADX INFO: compiled from: BottomDialogAnimator.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: Animator.kt */
    @t0({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 BottomDialogAnimator.kt\ncom/max/hbwidget/hbdialog/animator/BottomDialogAnimator\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n*L\n1#1,127:1\n98#2:128\n48#3:129\n47#3:131\n97#4:130\n*E\n"})
    public static final class c implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public c(BottomDialogAnimator bottomDialogAnimator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.l.f34559y6, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.l.f34537x6, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animator, "animator");
            BottomDialogAnimator.this.f74380e = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@dl.d Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.l.f34515w6, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.l.f34581z6, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animator, "animator");
            BottomDialogAnimator.this.f74380e = true;
        }
    }

    /* JADX INFO: compiled from: Animator.kt */
    @t0({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 BottomDialogAnimator.kt\ncom/max/hbwidget/hbdialog/animator/BottomDialogAnimator\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n*L\n1#1,127:1\n98#2:128\n68#3,3:129\n66#3:133\n97#4:132\n*E\n"})
    public static final class d implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.a f74385c;

        public d(yh.a aVar, BottomDialogAnimator bottomDialogAnimator) {
            this.f74385c = aVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@dl.d Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.l.C6, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.l.B6, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animator, "animator");
            BottomDialogAnimator.this.f74380e = false;
            this.f74385c.invoke();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@dl.d Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.l.A6, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@dl.d Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.l.D6, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animator, "animator");
            BottomDialogAnimator.this.f74380e = true;
        }
    }

    public BottomDialogAnimator(@dl.d View view) {
        f0.p(view, "view");
        this.f74377b = view;
        this.f74379d = Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(BottomDialogAnimator this$0, ValueAnimator animation) {
        if (PatchProxy.proxy(new Object[]{this$0, animation}, null, changeQuickRedirect, true, bb.c.l.f34471u6, new Class[]{BottomDialogAnimator.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        this$0.f74377b.setTranslationY(fFloatValue);
        float f10 = fFloatValue / this$0.f74379d;
        a aVar = this$0.f74378c;
        if (aVar != null) {
            aVar.a(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(BottomDialogAnimator this$0, ValueAnimator animation) {
        if (PatchProxy.proxy(new Object[]{this$0, animation}, null, changeQuickRedirect, true, bb.c.l.f34493v6, new Class[]{BottomDialogAnimator.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        this$0.f74377b.setTranslationY(fFloatValue);
        float f10 = fFloatValue / this$0.f74379d;
        a aVar = this$0.f74378c;
        if (aVar != null) {
            aVar.b(f10);
        }
    }

    public final void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34405r6, new Class[0], Void.TYPE).isSupported || this.f74380e) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f74379d, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbwidget.hbdialog.animator.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomDialogAnimator.g(this.f74387b, valueAnimator);
            }
        });
        f0.m(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new c(this));
        valueAnimatorOfFloat.start();
        this.f74381f = valueAnimatorOfFloat;
    }

    public final void h(@dl.d yh.a<b2> onEnd) {
        if (PatchProxy.proxy(new Object[]{onEnd}, this, changeQuickRedirect, false, bb.c.l.f34427s6, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(onEnd, "onEnd");
        if (this.f74380e) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.f74379d);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbwidget.hbdialog.animator.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomDialogAnimator.i(this.f74386b, valueAnimator);
            }
        });
        f0.m(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new d(onEnd, this));
        valueAnimatorOfFloat.start();
        this.f74382g = valueAnimatorOfFloat;
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void j(y yVar) {
        i.d(this, yVar);
    }

    public final boolean k() {
        return this.f74380e;
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void l(y yVar) {
        i.c(this, yVar);
    }

    public final void m(@dl.d a listener) {
        if (PatchProxy.proxy(new Object[]{listener}, this, changeQuickRedirect, false, bb.c.l.f34383q6, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(listener, "listener");
        this.f74378c = listener;
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void onDestroy(y yVar) {
        i.b(this, yVar);
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void onStart(y yVar) {
        i.e(this, yVar);
    }

    @Override // androidx.lifecycle.j
    public void onStop(@dl.d y owner) {
        if (PatchProxy.proxy(new Object[]{owner}, this, changeQuickRedirect, false, bb.c.l.f34449t6, new Class[]{y.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(owner, "owner");
        ValueAnimator valueAnimator = this.f74381f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f74382g;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f74380e = false;
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void q(y yVar) {
        i.a(this, yVar);
    }
}
