package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.o8;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: Dota2TeammateListFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2TeammateListFragment$getData$1$onError$1", f = "Dota2TeammateListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Dota2TeammateListFragment$getData$1$onError$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f89084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Dota2TeammateListFragment f89085c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Dota2TeammateListFragment$getData$1$onError$1(Dota2TeammateListFragment dota2TeammateListFragment, kotlin.coroutines.c<? super Dota2TeammateListFragment$getData$1$onError$1> cVar) {
        super(2, cVar);
        this.f89085c = dota2TeammateListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 39354, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new Dota2TeammateListFragment$getData$1$onError$1(this.f89085c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39356, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 39355, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((Dota2TeammateListFragment$getData$1$onError$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39353, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f89084b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        o8 o8Var = this.f89085c.f89075b;
        if (o8Var == null) {
            f0.S("binding");
            o8Var = null;
        }
        o8Var.f114133c.P();
        o8 o8Var2 = this.f89085c.f89075b;
        if (o8Var2 == null) {
            f0.S("binding");
            o8Var2 = null;
        }
        o8Var2.f114133c.w();
        Dota2TeammateListFragment.O3(this.f89085c, null);
        return b2.f124493a;
    }
}
