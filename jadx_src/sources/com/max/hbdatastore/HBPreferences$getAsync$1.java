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

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: HBPreferences.kt */
/* JADX INFO: loaded from: classes10.dex */
@d(c = "com.max.hbdatastore.HBPreferences$getAsync$1", f = "HBPreferences.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
public final class HBPreferences$getAsync$1<T> extends SuspendLambda implements p<q0, c<? super T>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f69818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> f69819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f69820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ T f69821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HBPreferences$getAsync$1(androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar, String str, T t10, c<? super HBPreferences$getAsync$1> cVar) {
        super(2, cVar);
        this.f69819c = dVar;
        this.f69820d = str;
        this.f69821e = t10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.f.wA, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new HBPreferences$getAsync$1(this.f69819c, this.f69820d, this.f69821e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, obj}, this, changeQuickRedirect, false, bb.c.f.yA, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke(q0Var, (c) obj);
    }

    @e
    public final Object invoke(@dl.d q0 q0Var, @e c<? super T> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.f.xA, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HBPreferences$getAsync$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.f.vA, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f69818b;
        if (i10 == 0) {
            t0.n(obj);
            HBPreferences hBPreferences = HBPreferences.f69810a;
            androidx.p001datastore.core.d<androidx.p001datastore.preferences.core.a> dVar = this.f69819c;
            String str = this.f69820d;
            T t10 = this.f69821e;
            this.f69818b = 1;
            obj = hBPreferences.r(dVar, str, t10, this);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return obj;
    }
}
