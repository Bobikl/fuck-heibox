package com.heybox.imageviewer.widgets;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
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

/* JADX INFO: compiled from: BackgroundView.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class BackgroundView extends ConstraintLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final z J;
    private int K;

    @e
    private ValueAnimator L;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @i
    public BackgroundView(@d Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public BackgroundView(@d Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        this.J = b0.c(new yh.a<ArgbEvaluator>() { // from class: com.heybox.imageviewer.widgets.BackgroundView$argbEvaluator$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @d
            public final ArgbEvaluator a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 250, new Class[0], ArgbEvaluator.class);
                return patchProxyResultProxy.isSupported ? (ArgbEvaluator) patchProxyResultProxy.result : new ArgbEvaluator();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.ArgbEvaluator, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ ArgbEvaluator invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 251, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
    }

    public /* synthetic */ BackgroundView(Context context, AttributeSet attributeSet, int i10, u uVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(BackgroundView this$0, int i10, int i11, ValueAnimator valueAnimator) {
        Object[] objArr = {this$0, new Integer(i10), new Integer(i11), valueAnimator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.b.P1, new Class[]{BackgroundView.class, cls, cls, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.F(((Float) animatedValue).floatValue(), i10, i11);
    }

    private final ArgbEvaluator getArgbEvaluator() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 244, new Class[0], ArgbEvaluator.class);
        return patchProxyResultProxy.isSupported ? (ArgbEvaluator) patchProxyResultProxy.result : (ArgbEvaluator) this.J.getValue();
    }

    public final void D(final int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.b.L1, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(com.heybox.imageviewer.utils.a.f59777a.c());
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        final int i11 = this.K;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heybox.imageviewer.widgets.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BackgroundView.E(this.f59842b, i11, i10, valueAnimator);
            }
        });
        this.L = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public final void F(float f10, int i10, int i11) {
        Object[] objArr = {new Float(f10), new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.b.M1, new Class[]{Float.TYPE, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Object objEvaluate = getArgbEvaluator().evaluate(f10, Integer.valueOf(i10), Integer.valueOf(i11));
        f0.n(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
        setBackgroundColor(((Integer) objEvaluate).intValue());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.O1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 247, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setBackgroundColor(i10);
        this.K = i10;
    }
}
