package com.max.hbcommon.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.max.hbcommon.R;
import com.max.hbcustomview.CubicBezierInterpolators;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: RippleDotView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class RippleDotView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f67167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f67168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f67169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private AnimatorSet f67170e;

    /* JADX INFO: compiled from: RippleDotView.kt */
    public static final class a extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@dl.d Animator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.d.f31641xe, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(animation, "animation");
            AnimatorSet animatorSet = RippleDotView.this.f67170e;
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RippleDotView(@dl.d Context context) {
        this(context, null);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RippleDotView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RippleDotView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleDotView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        kotlin.jvm.internal.f0.p(context, "context");
        this.f67168c = ViewUtils.f(context, 11.0f);
        this.f67169d = ViewUtils.f(context, 5.0f);
        c();
    }

    private final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31487qe, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = new View(getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(com.max.hbcommon.utils.l.a(R.color.toast_background_color));
        view.setBackground(gradientDrawable);
        view.setAlpha(0.4f);
        int i10 = this.f67168c;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 17;
        addView(view, layoutParams);
        this.f67167b = new View(getContext());
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(com.max.hbcommon.utils.l.g("#99393D40"));
        View view2 = this.f67167b;
        View view3 = null;
        if (view2 == null) {
            kotlin.jvm.internal.f0.S("animMask");
            view2 = null;
        }
        view2.setBackground(gradientDrawable2);
        int i11 = this.f67169d;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i11, i11);
        layoutParams2.gravity = 17;
        View view4 = this.f67167b;
        if (view4 == null) {
            kotlin.jvm.internal.f0.S("animMask");
        } else {
            view3 = view4;
        }
        addView(view3, layoutParams2);
        View view5 = new View(getContext());
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(1);
        gradientDrawable3.setColor(com.max.hbcommon.utils.l.a(R.color.white));
        view5.setBackground(gradientDrawable3);
        int i12 = this.f67169d;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i12, i12);
        layoutParams3.gravity = 17;
        addView(view5, layoutParams3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(RippleDotView this$0, ValueAnimator animation) {
        if (PatchProxy.proxy(new Object[]{this$0, animation}, null, changeQuickRedirect, true, bb.c.d.f31619we, new Class[]{RippleDotView.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        View view = this$0.f67167b;
        View view2 = null;
        if (view == null) {
            kotlin.jvm.internal.f0.S("animMask");
            view = null;
        }
        float f10 = iIntValue;
        view.setScaleX(f10 / this$0.f67169d);
        View view3 = this$0.f67167b;
        if (view3 == null) {
            kotlin.jvm.internal.f0.S("animMask");
        } else {
            view2 = view3;
        }
        view2.setScaleY(f10 / this$0.f67169d);
    }

    public final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31531se, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f67169d, this.f67168c);
        CubicBezierInterpolators.Type type = CubicBezierInterpolators.Type.EASE;
        valueAnimatorOfInt.setInterpolator(CubicBezierInterpolators.a(type));
        valueAnimatorOfInt.setDuration(700L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbcommon.component.q0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                RippleDotView.e(this.f67822b, valueAnimator);
            }
        });
        View view = this.f67167b;
        if (view == null) {
            kotlin.jvm.internal.f0.S("animMask");
            view = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setStartDelay(400L);
        objectAnimatorOfFloat.setInterpolator(CubicBezierInterpolators.a(type));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f67170e = animatorSet;
        animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat);
        AnimatorSet animatorSet2 = this.f67170e;
        if (animatorSet2 != null) {
            animatorSet2.setStartDelay(1000L);
        }
        AnimatorSet animatorSet3 = this.f67170e;
        if (animatorSet3 != null) {
            animatorSet3.addListener(new a());
        }
        AnimatorSet animatorSet4 = this.f67170e;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
    }

    public final void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31553te, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        AnimatorSet animatorSet = this.f67170e;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f67170e;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31575ue, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31597ve, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        f();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31509re, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int i12 = this.f67168c;
        setMeasuredDimension(i12, i12);
        super.onMeasure(i10, i11);
    }
}
