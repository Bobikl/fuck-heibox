package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: Dota2GameDetailFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2GameDetailFragment$getData$1$onNext$1", f = "Dota2GameDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Dota2GameDetailFragment$getData$1$onNext$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f88949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Dota2GameDetailFragment f88950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Result<GameOverviewListObj> f88951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Dota2GameDetailFragment$getData$1$onNext$1(Dota2GameDetailFragment dota2GameDetailFragment, Result<GameOverviewListObj> result, kotlin.coroutines.c<? super Dota2GameDetailFragment$getData$1$onNext$1> cVar) {
        super(2, cVar);
        this.f88950c = dota2GameDetailFragment;
        this.f88951d = result;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 39069, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new Dota2GameDetailFragment$getData$1$onNext$1(this.f88950c, this.f88951d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39071, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39070, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((Dota2GameDetailFragment$getData$1$onNext$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39068, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f88949b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        Dota2GameDetailFragment.b5(this.f88950c, this.f88951d.getResult());
        this.f88950c.h5().f110481c.P();
        this.f88950c.J4().f111334f.setVisibility(8);
        return b2.f124493a;
    }
}
