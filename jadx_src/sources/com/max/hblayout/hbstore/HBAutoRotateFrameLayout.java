package com.max.hblayout.hbstore;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;
import xh.i;

/* JADX INFO: compiled from: HBAutoRotateFrameLayout.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class HBAutoRotateFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final z f70793b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public HBAutoRotateFrameLayout(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public HBAutoRotateFrameLayout(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public HBAutoRotateFrameLayout(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f70793b = b0.c(new yh.a<AnimatorSet>() { // from class: com.max.hblayout.hbstore.HBAutoRotateFrameLayout$animatorSet$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @d
            public final AnimatorSet a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f32738af, new Class[0], AnimatorSet.class);
                return patchProxyResultProxy.isSupported ? (AnimatorSet) patchProxyResultProxy.result : HBAutoRotateFrameLayout.b(this.f70794b);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.AnimatorSet, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ AnimatorSet invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f32758bf, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
    }

    public /* synthetic */ HBAutoRotateFrameLayout(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final /* synthetic */ AnimatorSet b(HBAutoRotateFrameLayout hBAutoRotateFrameLayout) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBAutoRotateFrameLayout}, null, changeQuickRedirect, true, c.g.Ze, new Class[]{HBAutoRotateFrameLayout.class}, AnimatorSet.class);
        return patchProxyResultProxy.isSupported ? (AnimatorSet) patchProxyResultProxy.result : hBAutoRotateFrameLayout.c();
    }

    private final AnimatorSet c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.Ue, new Class[0], AnimatorSet.class);
        if (patchProxyResultProxy.isSupported) {
            return (AnimatorSet) patchProxyResultProxy.result;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1600L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hblayout.hbstore.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                HBAutoRotateFrameLayout.d(this.f70824b, valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorOfFloat);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(HBAutoRotateFrameLayout this$0, ValueAnimator animation) {
        if (PatchProxy.proxy(new Object[]{this$0, animation}, null, changeQuickRedirect, true, c.g.Ye, new Class[]{HBAutoRotateFrameLayout.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        double d10 = animatedFraction;
        float fE = 0.0f;
        if (d10 <= 0.21d) {
            fE = this$0.e(0.0f, -30.0f, animatedFraction / 0.21f);
        } else if (d10 <= 0.42d) {
            fE = this$0.e(-30.0f, 10.0f, (animatedFraction - 0.21f) / 0.21f);
        } else if (d10 <= 0.63d) {
            fE = this$0.e(10.0f, 0.0f, (animatedFraction - 0.42f) / 0.21f);
        }
        this$0.setRotation(fE);
    }

    private final float e(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    private final AnimatorSet getAnimatorSet() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.Te, new Class[0], AnimatorSet.class);
        return patchProxyResultProxy.isSupported ? (AnimatorSet) patchProxyResultProxy.result : (AnimatorSet) this.f70793b.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.Ve, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            getAnimatorSet().start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.We, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        getAnimatorSet().cancel();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@d View changedView, int i10) {
        if (PatchProxy.proxy(new Object[]{changedView, new Integer(i10)}, this, changeQuickRedirect, false, c.g.Xe, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        if (i10 == 0) {
            getAnimatorSet().start();
        } else {
            getAnimatorSet().cancel();
        }
    }
}
