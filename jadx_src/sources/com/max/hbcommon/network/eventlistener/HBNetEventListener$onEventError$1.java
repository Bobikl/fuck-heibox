package com.max.hbcommon.network.eventlistener;

import com.google.gson.JsonObject;
import com.max.hbcommon.utils.i;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.k;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.io.IOException;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.q0;
import okhttp3.e;
import yh.p;

/* JADX INFO: compiled from: HBNetEventListener.kt */
/* JADX INFO: loaded from: classes9.dex */
@d(c = "com.max.hbcommon.network.eventlistener.HBNetEventListener$onEventError$1", f = "HBNetEventListener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HBNetEventListener$onEventError$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f68085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f68086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ HBNetEventListener f68087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f68088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ IOException f68089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f68090g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HBNetEventListener$onEventError$1(e eVar, HBNetEventListener hBNetEventListener, int i10, IOException iOException, String str, c<? super HBNetEventListener$onEventError$1> cVar) {
        super(2, cVar);
        this.f68086c = eVar;
        this.f68087d = hBNetEventListener;
        this.f68088e = i10;
        this.f68089f = iOException;
        this.f68090g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@dl.e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.e.Sd, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new HBNetEventListener$onEventError$1(this.f68086c, this.f68087d, this.f68088e, this.f68089f, this.f68090g, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.e.Ud, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.e.Td, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((HBNetEventListener$onEventError$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.e.Rd, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f68085b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("url", this.f68086c.request().q().getUrl());
        jsonObject.addProperty("method", this.f68086c.request().m());
        jsonObject.addProperty("time", kotlin.coroutines.jvm.internal.a.f(this.f68087d.f68065e.getCallCoat()));
        jsonObject.addProperty("app_active", kotlin.coroutines.jvm.internal.a.a(ob.a.b().f()));
        jsonObject.addProperty(PushMessageHelper.ERROR_TYPE, kotlin.coroutines.jvm.internal.a.f(this.f68088e));
        jsonObject.addProperty("error_reason", this.f68089f.getMessage());
        jsonObject.addProperty("network_type", i.b(BaseApplication.a()));
        jsonObject.addProperty("status_code", kotlin.coroutines.jvm.internal.a.f(this.f68087d.f68065e.getResponseCode()));
        jsonObject.addProperty("ip", this.f68087d.f68065e.getIp());
        jsonObject.addProperty("exception_type", this.f68089f.getClass().getName());
        jsonObject.addProperty("monitor_data", k.p(this.f68087d.f68065e));
        com.max.hbcommon.analytics.d.d("3", lb.d.C5, null, jsonObject);
        g.f74531b.v("NetMonitor " + this.f68090g + ' ' + k.p(jsonObject));
        return b2.f124493a;
    }
}
