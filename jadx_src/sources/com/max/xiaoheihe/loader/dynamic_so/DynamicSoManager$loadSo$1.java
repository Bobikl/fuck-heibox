package com.max.xiaoheihe.loader.dynamic_so;

import com.google.gson.JsonObject;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.s;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.loader.bean.dynamic_so.DynamicSoInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.File;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: DynamicSoManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@d(c = "com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager$loadSo$1", f = "DynamicSoManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DynamicSoManager$loadSo$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f77286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ DynamicSoInfoObj f77287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ File f77288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f77289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ DynamicSoManager f77290f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DynamicSoManager$loadSo$1(DynamicSoInfoObj dynamicSoInfoObj, File file, String str, DynamicSoManager dynamicSoManager, c<? super DynamicSoManager$loadSo$1> cVar) {
        super(2, cVar);
        this.f77287c = dynamicSoInfoObj;
        this.f77288d = file;
        this.f77289e = str;
        this.f77290f = dynamicSoManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 22093, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new DynamicSoManager$loadSo$1(this.f77287c, this.f77288d, this.f77289e, this.f77290f, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22095, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 22094, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((DynamicSoManager$loadSo$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22092, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        b.h();
        if (this.f77286b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("info", k.p(this.f77287c));
        com.max.hbcommon.analytics.d.d("4", lb.d.G5, null, jsonObject);
        if (f0.g(this.f77287c.getMd5(), s.b(this.f77288d))) {
            if (ff.b.f118841a.b(this.f77288d, DynamicSoManager.f77251f)) {
                DynamicSoManager.a aVar = DynamicSoManager.f77247b;
                aVar.c().put(this.f77289e, this.f77287c);
                DynamicSoInfoObj dynamicSoInfoObj = aVar.c().get(this.f77289e);
                if (dynamicSoInfoObj != null) {
                    dynamicSoInfoObj.setLoad(true);
                }
                com.max.hbcache.c.z(com.max.hbcache.c.F0 + this.f77289e, k.p(this.f77287c));
                g.f74531b.M("DynamicSoManager load success " + this.f77289e + ' ' + this.f77288d.getAbsolutePath());
            } else {
                z10 = false;
            }
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("success", kotlin.coroutines.jvm.internal.a.a(z10));
            jsonObject2.addProperty("info", k.p(this.f77287c));
            com.max.hbcommon.analytics.d.d("4", lb.d.H5, null, jsonObject2);
        } else {
            g.f74531b.v("DynamicSoManager MD5 error delete file and re download");
            this.f77288d.delete();
            DynamicSoManager.h(this.f77290f, this.f77287c, 0, 2, null);
        }
        return b2.f124493a;
    }
}
