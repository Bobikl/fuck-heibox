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
@d(c = "com.max.hbdatastore.HBPreferences$updateBoolean$2", f = "HBPreferences.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HBPreferences$updateBoolean$2 extends SuspendLambda implements p<MutablePreferences, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f69886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f69887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.p001datastore.preferences.core.a.C0158a<Boolean> f69888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f69889e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HBPreferences$updateBoolean$2(androidx.p001datastore.preferences.core.a.C0158a<Boolean> c0158a, boolean z10, c<? super HBPreferences$updateBoolean$2> cVar) {
        super(2, cVar);
        this.f69888d = c0158a;
        this.f69889e = z10;
    }

    @e
    public final Object a(@dl.d MutablePreferences mutablePreferences, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mutablePreferences, cVar}, this, changeQuickRedirect, false, bb.c.f.XA, new Class[]{MutablePreferences.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HBPreferences$updateBoolean$2) create(mutablePreferences, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.f.WA, new Class[]{Object.class, c.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        HBPreferences$updateBoolean$2 hBPreferences$updateBoolean$2 = new HBPreferences$updateBoolean$2(this.f69888d, this.f69889e, cVar);
        hBPreferences$updateBoolean$2.f69887c = obj;
        return hBPreferences$updateBoolean$2;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(MutablePreferences mutablePreferences, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mutablePreferences, cVar}, this, changeQuickRedirect, false, bb.c.f.YA, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(mutablePreferences, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.f.VA, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        b.h();
        if (this.f69886b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        ((MutablePreferences) this.f69887c).o(this.f69888d, kotlin.coroutines.jvm.internal.a.a(this.f69889e));
        return b2.f124493a;
    }
}
