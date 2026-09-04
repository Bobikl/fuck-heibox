package com.max.hbcommon.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: DohDns.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.network.DohDns$getFirstSuccessfulPing$1$1$deferredResults$1$1", f = "DohDns.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DohDns$getFirstSuccessfulPing$1$1$deferredResults$1$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super String>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f68043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ DohDns f68044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f68045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f68046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f68047f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DohDns$getFirstSuccessfulPing$1$1$deferredResults$1$1(DohDns dohDns, String str, int i10, int i11, kotlin.coroutines.c<? super DohDns$getFirstSuccessfulPing$1$1$deferredResults$1$1> cVar) {
        super(2, cVar);
        this.f68044c = dohDns;
        this.f68045d = str;
        this.f68046e = i10;
        this.f68047f = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.e.f32095xc, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new DohDns$getFirstSuccessfulPing$1$1$deferredResults$1$1(this.f68044c, this.f68045d, this.f68046e, this.f68047f, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super String> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.e.f32129zc, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super String> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.e.f32112yc, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((DohDns$getFirstSuccessfulPing$1$1$deferredResults$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.e.f32078wc, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f68043b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        if (this.f68044c.m(this.f68045d, this.f68046e, this.f68047f)) {
            return this.f68045d;
        }
        return null;
    }
}
