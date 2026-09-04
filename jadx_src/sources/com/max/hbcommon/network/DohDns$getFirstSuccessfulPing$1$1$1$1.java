package com.max.hbcommon.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.w0;
import kotlinx.coroutines.y;

/* JADX INFO: compiled from: DohDns.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbcommon.network.DohDns$getFirstSuccessfulPing$1$1$1$1", f = "DohDns.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
public final class DohDns$getFirstSuccessfulPing$1$1$1$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f68040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ w0<String> f68041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ y<String> f68042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DohDns$getFirstSuccessfulPing$1$1$1$1(w0<String> w0Var, y<String> yVar, kotlin.coroutines.c<? super DohDns$getFirstSuccessfulPing$1$1$1$1> cVar) {
        super(2, cVar);
        this.f68041c = w0Var;
        this.f68042d = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.e.f32027tc, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new DohDns$getFirstSuccessfulPing$1$1$1$1(this.f68041c, this.f68042d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.e.f32061vc, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.e.f32044uc, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((DohDns$getFirstSuccessfulPing$1$1$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.e.f32010sc, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f68040b;
        try {
            if (i10 == 0) {
                t0.n(obj);
                w0<String> w0Var = this.f68041c;
                this.f68040b = 1;
                obj = w0Var.p(this);
                if (obj == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            String str = (String) obj;
            if (str != null && this.f68042d.isActive()) {
                this.f68042d.A(str);
            }
            com.max.heybox.hblog.g.f74531b.M("DohDns getFirstSuccessfulPing success " + str);
        } catch (Throwable th2) {
            com.max.heybox.hblog.g.f74531b.v("DohDns getFirstSuccessfulPing error " + th2.getMessage());
        }
        return b2.f124493a;
    }
}
