package com.max.hbdatastore;

import androidx.p001datastore.preferences.core.MutablePreferences;
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
import yh.p;

/* JADX INFO: compiled from: HBPreferences.kt */
/* JADX INFO: loaded from: classes10.dex */
@d(c = "com.max.hbdatastore.HBPreferences$updateLong$2", f = "HBPreferences.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HBPreferences$updateLong$2 extends SuspendLambda implements p<MutablePreferences, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f69902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f69903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.p001datastore.preferences.core.a.C0158a<Long> f69904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f69905e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HBPreferences$updateLong$2(androidx.p001datastore.preferences.core.a.C0158a<Long> c0158a, long j10, c<? super HBPreferences$updateLong$2> cVar) {
        super(2, cVar);
        this.f69904d = c0158a;
        this.f69905e = j10;
    }

    @e
    public final Object a(@dl.d MutablePreferences mutablePreferences, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mutablePreferences, cVar}, this, changeQuickRedirect, false, bb.c.f.nB, new Class[]{MutablePreferences.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HBPreferences$updateLong$2) create(mutablePreferences, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.f.mB, new Class[]{Object.class, c.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        HBPreferences$updateLong$2 hBPreferences$updateLong$2 = new HBPreferences$updateLong$2(this.f69904d, this.f69905e, cVar);
        hBPreferences$updateLong$2.f69903c = obj;
        return hBPreferences$updateLong$2;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(MutablePreferences mutablePreferences, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mutablePreferences, cVar}, this, changeQuickRedirect, false, bb.c.f.oB, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(mutablePreferences, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.f.lB, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        b.h();
        if (this.f69902b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        ((MutablePreferences) this.f69903c).o(this.f69904d, kotlin.coroutines.jvm.internal.a.g(this.f69905e));
        return b2.f124493a;
    }
}
