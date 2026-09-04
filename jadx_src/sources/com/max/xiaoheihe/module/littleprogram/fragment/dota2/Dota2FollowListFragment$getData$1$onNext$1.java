package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.game.dota2.Dota2TeammateListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.e8;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: Dota2FollowListFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2FollowListFragment$getData$1$onNext$1", f = "Dota2FollowListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Dota2FollowListFragment$getData$1$onNext$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f88930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Dota2FollowListFragment f88931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Result<Dota2TeammateListObj> f88932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Dota2FollowListFragment$getData$1$onNext$1(Dota2FollowListFragment dota2FollowListFragment, Result<Dota2TeammateListObj> result, kotlin.coroutines.c<? super Dota2FollowListFragment$getData$1$onNext$1> cVar) {
        super(2, cVar);
        this.f88931c = dota2FollowListFragment;
        this.f88932d = result;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 39024, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new Dota2FollowListFragment$getData$1$onNext$1(this.f88931c, this.f88932d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39026, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39025, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((Dota2FollowListFragment$getData$1$onNext$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39023, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f88930b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        Dota2FollowListFragment.P3(this.f88931c, this.f88932d.getResult());
        e8 e8Var = this.f88931c.f88918b;
        e8 e8Var2 = null;
        if (e8Var == null) {
            f0.S("binding");
            e8Var = null;
        }
        e8Var.f110062c.P();
        e8 e8Var3 = this.f88931c.f88918b;
        if (e8Var3 == null) {
            f0.S("binding");
            e8Var3 = null;
        }
        e8Var3.f110062c.w();
        e8 e8Var4 = this.f88931c.f88918b;
        if (e8Var4 == null) {
            f0.S("binding");
        } else {
            e8Var2 = e8Var4;
        }
        e8Var2.f110062c.setVisibility(0);
        return b2.f124493a;
    }
}
