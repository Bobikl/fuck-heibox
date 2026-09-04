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
@d(c = "com.max.hbdatastore.HBPreferences$updateInt$2", f = "HBPreferences.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HBPreferences$updateInt$2 extends SuspendLambda implements p<MutablePreferences, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f69898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f69899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.p001datastore.preferences.core.a.C0158a<Integer> f69900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f69901e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HBPreferences$updateInt$2(androidx.p001datastore.preferences.core.a.C0158a<Integer> c0158a, int i10, c<? super HBPreferences$updateInt$2> cVar) {
        super(2, cVar);
        this.f69900d = c0158a;
        this.f69901e = i10;
    }

    @e
    public final Object a(@dl.d MutablePreferences mutablePreferences, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mutablePreferences, cVar}, this, changeQuickRedirect, false, bb.c.f.jB, new Class[]{MutablePreferences.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HBPreferences$updateInt$2) create(mutablePreferences, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.f.iB, new Class[]{Object.class, c.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        HBPreferences$updateInt$2 hBPreferences$updateInt$2 = new HBPreferences$updateInt$2(this.f69900d, this.f69901e, cVar);
        hBPreferences$updateInt$2.f69899c = obj;
        return hBPreferences$updateInt$2;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(MutablePreferences mutablePreferences, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mutablePreferences, cVar}, this, changeQuickRedirect, false, bb.c.f.kB, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(mutablePreferences, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.f.hB, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        b.h();
        if (this.f69898b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        ((MutablePreferences) this.f69899c).o(this.f69900d, kotlin.coroutines.jvm.internal.a.f(this.f69901e));
        return b2.f124493a;
    }
}
