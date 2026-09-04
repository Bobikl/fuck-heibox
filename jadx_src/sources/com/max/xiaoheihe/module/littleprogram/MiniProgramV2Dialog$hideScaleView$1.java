package com.max.xiaoheihe.module.littleprogram;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
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
@d(c = "com.max.xiaoheihe.module.littleprogram.MiniProgramV2Dialog$hideScaleView$1", f = "MiniProgramV2Dialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MiniProgramV2Dialog$hideScaleView$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f88708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ MiniProgramV2Dialog f88709c;

    /* JADX INFO: compiled from: MiniProgramV2Dialog.kt */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MiniProgramV2Dialog f88710b;

        a(MiniProgramV2Dialog miniProgramV2Dialog) {
            this.f88710b = miniProgramV2Dialog;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 38702, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Object animatedValue = it.getAnimatedValue();
            f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            View viewI = this.f88710b.i();
            if (viewI != null) {
                MiniProgramV2Dialog miniProgramV2Dialog = this.f88710b;
                viewI.setAlpha(fFloatValue);
                viewI.setScaleY(fFloatValue);
                viewI.setScaleX(fFloatValue);
                viewI.setTranslationY((-(1.0f - fFloatValue)) * miniProgramV2Dialog.l());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiniProgramV2Dialog$hideScaleView$1(MiniProgramV2Dialog miniProgramV2Dialog, kotlin.coroutines.c<? super MiniProgramV2Dialog$hideScaleView$1> cVar) {
        super(2, cVar);
        this.f88709c = miniProgramV2Dialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 38699, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new MiniProgramV2Dialog$hideScaleView$1(this.f88709c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38701, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 38700, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((MiniProgramV2Dialog$hideScaleView$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38698, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f88708b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        MiniProgramV2Dialog miniProgramV2Dialog = this.f88709c;
        valueAnimatorOfFloat.setDuration(miniProgramV2Dialog.e());
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new a(miniProgramV2Dialog));
        valueAnimatorOfFloat.start();
        return b2.f124493a;
    }
}
