package com.max.xiaoheihe.network;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.o;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.google.gson.JsonObject;
import com.max.hbcommon.network.eventlistener.HBNetEventListener;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.module.game.z1;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.IOException;
import java.net.URI;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.internal.http.HttpMethod;
import okhttp3.l;
import okhttp3.p;
import okhttp3.t;
import okhttp3.u;
import okhttp3.v;
import okhttp3.z;
import xh.m;

/* JADX INFO: compiled from: RawServiceGenerator.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nRawServiceGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawServiceGenerator.kt\ncom/max/xiaoheihe/network/RawServiceGenerator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,234:1\n1#2:235\n*E\n"})
@o(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private static z f94841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private static z f94842c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final f f94840a = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f94843d = 8;

    /* JADX INFO: compiled from: RawServiceGenerator.kt */
    public static final class a implements okhttp3.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f94844b;

        a(h hVar) {
            this.f94844b = hVar;
        }

        @Override // okhttp3.f
        public void onFailure(@dl.d okhttp3.e call, @dl.d IOException e10) {
            if (PatchProxy.proxy(new Object[]{call, e10}, this, changeQuickRedirect, false, 47663, new Class[]{okhttp3.e.class, IOException.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(call, "call");
            f0.p(e10, "e");
            com.max.hbcommon.utils.d.b("zzzzgifttest", "onFailure" + e10);
            e10.printStackTrace();
            h hVar = this.f94844b;
            if (hVar != null) {
                hVar.a(e10);
            }
        }

        @Override // okhttp3.f
        public void onResponse(@dl.d okhttp3.e call, @dl.d c0 response) throws IOException {
            if (PatchProxy.proxy(new Object[]{call, response}, this, changeQuickRedirect, false, 47664, new Class[]{okhttp3.e.class, c0.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(call, "call");
            f0.p(response, "response");
            try {
                try {
                    try {
                        if (call.getCanceled()) {
                            h hVar = this.f94844b;
                            if (hVar != null) {
                                hVar.a(new Exception("call.isCanceled()"));
                            }
                            try {
                                d0 d0VarQ = response.q();
                                if (d0VarQ != null) {
                                    d0VarQ.close();
                                    return;
                                }
                                return;
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                return;
                            }
                        }
                        Log.d("onResponse", String.valueOf(response));
                        d0 d0VarQ2 = response.q();
                        f0.m(d0VarQ2);
                        String strString = d0VarQ2.string();
                        JsonObject jsonObject = (JsonObject) k.a(strString, JsonObject.class);
                        if (jsonObject != null) {
                            h hVar2 = this.f94844b;
                            if (hVar2 != null) {
                                hVar2.b(jsonObject, null, response.getHeaders(), response.x());
                            }
                        } else {
                            h hVar3 = this.f94844b;
                            if (hVar3 != null) {
                                hVar3.b(null, strString, response.getHeaders(), response.x());
                            }
                        }
                        d0 d0VarQ3 = response.q();
                        if (d0VarQ3 != null) {
                            d0VarQ3.close();
                        }
                    } catch (Throwable th2) {
                        try {
                            d0 d0VarQ4 = response.q();
                            if (d0VarQ4 != null) {
                                d0VarQ4.close();
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        throw th2;
                    }
                } catch (Exception e12) {
                    com.max.hbcommon.utils.d.b("zzzzgifttest", "onResponse Exception==" + e12);
                    e12.printStackTrace();
                    h hVar4 = this.f94844b;
                    if (hVar4 != null) {
                        hVar4.a(e12);
                    }
                    d0 d0VarQ5 = response.q();
                    if (d0VarQ5 != null) {
                        d0VarQ5.close();
                    }
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: RawServiceGenerator.kt */
    public static final class b implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f94845a = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // okhttp3.u
        @dl.d
        public final c0 intercept(@dl.d u.a chain) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{chain}, this, changeQuickRedirect, false, 47665, new Class[]{u.a.class}, c0.class);
            if (patchProxyResultProxy.isSupported) {
                return (c0) patchProxyResultProxy.result;
            }
            f0.p(chain, "chain");
            a0 a0VarRequest = chain.request();
            return chain.proceed(a0VarRequest.n().D(a0VarRequest.q().H().h()).b());
        }
    }

    /* JADX INFO: compiled from: RawServiceGenerator.kt */
    public static final class c implements p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f94846a = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // okhttp3.p.c
        @dl.d
        public final p create(@dl.d okhttp3.e it) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 47666, new Class[]{okhttp3.e.class}, p.class);
            if (patchProxyResultProxy.isSupported) {
                return (p) patchProxyResultProxy.result;
            }
            f0.p(it, "it");
            return new HBNetEventListener();
        }
    }

    private f() {
    }

    @m
    public static final void a(@dl.d okhttp3.e call, @dl.e h hVar) {
        if (PatchProxy.proxy(new Object[]{call, hVar}, null, changeQuickRedirect, true, 47662, new Class[]{okhttp3.e.class, h.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(call, "call");
        call.enqueue(new a(hVar));
    }

    @dl.d
    @m
    public static final z b(@dl.d Context mContext, boolean z10, boolean z11) {
        Object[] objArr = {mContext, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 47656, new Class[]{Context.class, cls, cls}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        f0.p(mContext, "mContext");
        z1 z1Var = new z1(new ka.d(mContext));
        z1Var.d(z10);
        z.a aVarS = new z().e0().o(z1Var).t(z11).c(b.f94845a).s(c.f94846a);
        if (z11) {
            aVarS.d(new g());
        }
        return aVarS.f();
    }

    public static /* synthetic */ z c(Context context, boolean z10, boolean z11, int i10, Object obj) {
        Object[] objArr = {context, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 47657, new Class[]{Context.class, cls, cls, Integer.TYPE, Object.class}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        return b(context, z10, z11);
    }

    @dl.d
    @m
    public static final t d(@dl.d String url, @dl.d Map<String, String> querys) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{url, querys}, null, changeQuickRedirect, true, 47658, new Class[]{String.class, Map.class}, t.class);
        if (patchProxyResultProxy.isSupported) {
            return (t) patchProxyResultProxy.result;
        }
        f0.p(url, "url");
        f0.p(querys, "querys");
        URI uri = new URI(url);
        t.a aVar = new t.a();
        String scheme = uri.getScheme();
        f0.o(scheme, "requestUrl.scheme");
        t.a aVarM = aVar.M(scheme);
        String path = uri.getPath();
        f0.o(path, "requestUrl.path");
        t.a aVarL = aVarM.l(path);
        String host = uri.getHost();
        f0.o(host, "requestUrl.host");
        t.a aVarX = aVarL.x(host);
        if (uri.getPort() != -1) {
            aVarX.D(uri.getPort());
        }
        Map<String, String> ownQueryMap = l0.E(url);
        f0.o(ownQueryMap, "ownQueryMap");
        for (Map.Entry<String, String> entry : ownQueryMap.entrySet()) {
            String k10 = entry.getKey();
            String value = entry.getValue();
            f0.o(k10, "k");
            aVarX.c(k10, value);
        }
        for (Map.Entry<String, String> entry2 : querys.entrySet()) {
            aVarX.c(entry2.getKey(), entry2.getValue());
        }
        return aVarX.h();
    }

    @m
    private static final void e(z zVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{zVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 47655, new Class[]{z.class, Boolean.TYPE}, Void.TYPE).isSupported || zVar == null || !(zVar.getCookieJar() instanceof z1)) {
            return;
        }
        l cookieJar = zVar.getCookieJar();
        f0.n(cookieJar, "null cannot be cast to non-null type com.max.xiaoheihe.module.game.NormalCookieJarImpl");
        ((z1) cookieJar).d(z10);
    }

    @m
    private static final z f(Context context, boolean z10, boolean z11) {
        z zVar;
        Object[] objArr = {context, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 47654, new Class[]{Context.class, cls, cls}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        if (z11) {
            if (f94841b == null) {
                f94841b = b(context, z10, true);
            }
            zVar = f94841b;
            f0.m(zVar);
        } else {
            if (f94842c == null) {
                f94842c = b(context, z10, false);
            }
            zVar = f94842c;
            f0.m(zVar);
        }
        e(zVar, z10);
        return zVar;
    }

    @m
    public static final void g(@dl.d Context mContext, @dl.d String url, @dl.d Map<String, String> headers, @dl.d Map<String, String> querys, boolean z10, boolean z11, @dl.e h hVar) {
        t tVarL;
        Object[] objArr = {mContext, url, headers, querys, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 47659, new Class[]{Context.class, String.class, Map.class, Map.class, cls, cls, h.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mContext, "mContext");
        f0.p(url, "url");
        f0.p(headers, "headers");
        f0.p(querys, "querys");
        z zVarF = f(mContext, z10, z11);
        if (z10 && (tVarL = t.INSTANCE.l(url)) != null) {
            zVarF.getCookieJar().a(tVarL);
        }
        a0.a aVarG = new a0.a().g();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            aVarG.a(entry.getKey(), entry.getValue());
        }
        aVarG.D(d(url, querys));
        a(zVarF.a(aVarG.b()), hVar);
    }

    @m
    public static final void h(@dl.d Context mContext, @dl.d String url, @dl.e String str, @dl.e String str2, @dl.d Map<String, String> headers, @dl.e b0 b0Var, @dl.d Map<String, String> querys, boolean z10, boolean z11, @dl.e h hVar) {
        b0 b0VarB;
        t tVarL;
        Object[] objArr = {mContext, url, str, str2, headers, b0Var, querys, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 47661, new Class[]{Context.class, String.class, String.class, String.class, Map.class, b0.class, Map.class, cls, cls, h.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mContext, "mContext");
        f0.p(url, "url");
        f0.p(headers, "headers");
        f0.p(querys, "querys");
        if (str != null) {
            z zVarF = f(mContext, z10, z11);
            if (z10 && (tVarL = t.INSTANCE.l(url)) != null) {
                zVarF.getCookieJar().a(tVarL);
            }
            if (!HttpMethod.requiresRequestBody(str)) {
                b0VarB = null;
            } else if (b0Var == null) {
                b0VarB = str2 != null ? b0.INSTANCE.b("", v.INSTANCE.d(str2)) : b0.INSTANCE.b("", v.INSTANCE.d(FastJsonJsonView.DEFAULT_CONTENT_TYPE));
            } else {
                b0VarB = b0Var;
            }
            a0.a aVarP = new a0.a().p(str, b0VarB);
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                aVarP.a(entry.getKey(), entry.getValue());
            }
            aVarP.D(d(url, querys));
            a(zVarF.a(aVarP.b()), hVar);
        }
    }

    @m
    public static final void i(@dl.d Context mContext, @dl.d String url, @dl.e String str, @dl.d Map<String, String> headers, @dl.e b0 b0Var, @dl.d Map<String, String> querys, boolean z10, boolean z11, @dl.e h hVar) {
        Object[] objArr = {mContext, url, str, headers, b0Var, querys, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 47660, new Class[]{Context.class, String.class, String.class, Map.class, b0.class, Map.class, cls, cls, h.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mContext, "mContext");
        f0.p(url, "url");
        f0.p(headers, "headers");
        f0.p(querys, "querys");
        h(mContext, url, "POST", str, headers, b0Var, querys, z10, z11, hVar);
    }
}
