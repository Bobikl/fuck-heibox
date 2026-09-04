package com.max.xiaoheihe.module.littleprogram;

import android.animation.ValueAnimator;
import android.view.View;
import com.max.hbcustomview.CubicBezierInterpolators;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: MiniProgramV2Dialog.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.xiaoheihe.module.littleprogram.MiniProgramV2Dialog$expandScaleView$1", f = "MiniProgramV2Dialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MiniProgramV2Dialog$expandScaleView$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f88703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ MiniProgramV2Dialog f88704c;

    /* JADX INFO: compiled from: MiniProgramV2Dialog.kt */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MiniProgramV2Dialog f88705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f88706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f88707d;

        a(MiniProgramV2Dialog miniProgramV2Dialog, float f10, float f11) {
            this.f88705b = miniProgramV2Dialog;
            this.f88706c = f10;
            this.f88707d = f11;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator it) {
            float f10;
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 38691, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Object animatedValue = it.getAnimatedValue();
            f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            View viewI = this.f88705b.i();
            if (viewI != null) {
                float f11 = this.f88706c;
                float f12 = this.f88707d;
                MiniProgramV2Dialog miniProgramV2Dialog = this.f88705b;
                if (fFloatValue < f11) {
                    f10 = 0.0f;
                } else {
                    f10 = fFloatValue > f12 ? 1.0f : (fFloatValue - f11) / (f12 - f11);
                }
                viewI.setAlpha(f10);
                viewI.setScaleY(fFloatValue);
                viewI.setScaleX(fFloatValue);
                viewI.setTranslationY((-(1.0f - fFloatValue)) * miniProgramV2Dialog.l());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiniProgramV2Dialog$expandScaleView$1(MiniProgramV2Dialog miniProgramV2Dialog, kotlin.coroutines.c<? super MiniProgramV2Dialog$expandScaleView$1> cVar) {
        super(2, cVar);
        this.f88704c = miniProgramV2Dialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 38688, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new MiniProgramV2Dialog$expandScaleView$1(this.f88704c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38690, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38689, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((MiniProgramV2Dialog$expandScaleView$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38687, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f88703b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        View viewI = this.f88704c.i();
        if (viewI != null) {
            viewI.setPivotX(viewI.getMeasuredWidth() - ViewUtils.f(viewI.getContext(), 12.0f));
            viewI.setPivotY(0.0f);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.22f, 1.0f);
        MiniProgramV2Dialog miniProgramV2Dialog = this.f88704c;
        valueAnimatorOfFloat.setDuration(miniProgramV2Dialog.j());
        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolators.a(CubicBezierInterpolators.Type.EASE));
        valueAnimatorOfFloat.addUpdateListener(new a(miniProgramV2Dialog, 0.26666665f, 0.3333333f));
        valueAnimatorOfFloat.start();
        return b2.f124493a;
    }
}
