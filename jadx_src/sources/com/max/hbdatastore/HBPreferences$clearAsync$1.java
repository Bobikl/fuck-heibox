package com.max.hbdatastore;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: HBPreferences.kt */
/* JADX INFO: loaded from: classes10.dex */
@d(c = "com.max.hbdatastore.HBPreferences$clearAsync$1", f = "HBPreferences.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
public final class HBPreferences$clearAsync$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f69816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> f69817c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HBPreferences$clearAsync$1(androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, c<? super HBPreferences$clearAsync$1> cVar) {
        super(2, cVar);
        this.f69817c = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.f.sA, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new HBPreferences$clearAsync$1(this.f69817c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.uA, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.tA, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HBPreferences$clearAsync$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.f.rA, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f69816b;
        if (i10 == 0) {
            t0.n(obj);
            HBPreferences hBPreferences = HBPreferences.f69810a;
            androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar = this.f69817c;
            this.f69816b = 1;
            if (hBPreferences.n(dVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
