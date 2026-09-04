package com.max.xiaoheihe.module.littleprogram.fragment.pubg;

import androidx.fragment.app.Fragment;
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

/* JADX INFO: compiled from: PUBGDetailV2Fragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGDetailV2Fragment$getData$1$onComplete$1", f = "PUBGDetailV2Fragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PUBGDetailV2Fragment$getData$1$onComplete$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f89213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ PUBGDetailV2Fragment f89214c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PUBGDetailV2Fragment$getData$1$onComplete$1(PUBGDetailV2Fragment pUBGDetailV2Fragment, kotlin.coroutines.c<? super PUBGDetailV2Fragment$getData$1$onComplete$1> cVar) {
        super(2, cVar);
        this.f89214c = pUBGDetailV2Fragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 39452, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new PUBGDetailV2Fragment$getData$1$onComplete$1(this.f89214c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39454, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39453, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PUBGDetailV2Fragment$getData$1$onComplete$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39451, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f89213b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        Fragment parentFragment = this.f89214c.getParentFragment();
        f0.n(parentFragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.littleprogram.fragment.dota2.GameOverviewBaseFragment");
        ((com.max.xiaoheihe.module.littleprogram.fragment.dota2.d) parentFragment).J4().f111334f.setVisibility(8);
        return b2.f124493a;
    }
}
