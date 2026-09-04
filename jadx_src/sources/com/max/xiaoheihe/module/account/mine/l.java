package com.max.xiaoheihe.module.account.mine;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.o;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.core.BaseApplication;
import com.max.xiaoheihe.bean.Resultx;
import com.max.xiaoheihe.bean.SteamNativeListObj;
import com.max.xiaoheihe.bean.account.steaminfo.SteamApiStateObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import io.reactivex.e0;
import io.reactivex.z;
import java.io.File;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.internal.f0;
import okhttp3.t;

/* JADX INFO: compiled from: SteamPoweredApiCache.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final l f79078a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f79079b = "steam_state_cache";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f79080c = 1800000;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final String f79081d = "403";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f79082e = 0;

    /* JADX INFO: compiled from: SteamPoweredApiCache.kt */
    public static final class a<T, R> implements kh.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a<T, R> f79083b = new a<>();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public final SteamApiResponse a(@dl.d Throwable it) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 25093, new Class[]{Throwable.class}, SteamApiResponse.class);
            if (patchProxyResultProxy.isSupported) {
                return (SteamApiResponse) patchProxyResultProxy.result;
            }
            f0.p(it, "it");
            return new SteamApiResponse(new SteamNativeListObj(), 0L, 2, null);
        }

        @Override // kh.o
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25094, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a((Throwable) obj);
        }
    }

    /* JADX INFO: compiled from: SteamPoweredApiCache.kt */
    public static final class b<T, R> implements kh.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b<T, R> f79084b = new b<>();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public final Resultx<SteamNativeListObj> a(@dl.d SteamApiResponse it) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 25095, new Class[]{SteamApiResponse.class}, Resultx.class);
            if (patchProxyResultProxy.isSupported) {
                return (Resultx) patchProxyResultProxy.result;
            }
            f0.p(it, "it");
            long jCurrentTimeMillis = System.currentTimeMillis();
            Resultx<SteamNativeListObj> resultx = new Resultx<>();
            if (jCurrentTimeMillis - it.e() < 1800000) {
                resultx.setResponse(it.f());
            }
            return resultx;
        }

        @Override // kh.o
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25096, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a((SteamApiResponse) obj);
        }
    }

    /* JADX INFO: compiled from: SteamPoweredApiCache.kt */
    public static final class c<T, R> implements kh.o {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z<Resultx<SteamNativeListObj>> f79085b;

        c(z<Resultx<SteamNativeListObj>> zVar) {
            this.f79085b = zVar;
        }

        public final e0<? extends Resultx<SteamNativeListObj>> a(@dl.d Resultx<SteamNativeListObj> it) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 25097, new Class[]{Resultx.class}, e0.class);
            if (patchProxyResultProxy.isSupported) {
                return (e0) patchProxyResultProxy.result;
            }
            f0.p(it, "it");
            SteamNativeListObj response = it.getResponse();
            if ((response != null ? response.getPlayers() : null) != null) {
                SteamNativeListObj response2 = it.getResponse();
                f0.m(response2);
                if (!response2.getPlayers().isEmpty()) {
                    com.max.heybox.hblog.g.f74531b.q("SteamPoweredApiCache, getSteamNativeListObj, use Cache " + it.getResponse());
                    return z.l3(it);
                }
            }
            com.max.heybox.hblog.g.f74531b.q("SteamPoweredApiCache, invalid cache = " + it.getResponse());
            return this.f79085b;
        }

        @Override // kh.o
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25098, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a((Resultx) obj);
        }
    }

    /* JADX INFO: compiled from: SteamPoweredApiCache.kt */
    public static final class d<T, R> implements kh.o {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f79086b;

        d(String str) {
            this.f79086b = str;
        }

        public final Resultx<SteamNativeListObj> a(@dl.d Resultx<SteamNativeListObj> it) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 25099, new Class[]{Resultx.class}, Resultx.class);
            if (patchProxyResultProxy.isSupported) {
                return (Resultx) patchProxyResultProxy.result;
            }
            f0.p(it, "it");
            com.max.heybox.hblog.g.f74531b.q("SteamPoweredApiCache, getSteamNativeList, use network " + it.getResponse());
            SteamApiResponse steamApiResponse = new SteamApiResponse(it.getResponse(), 0L, 2, null);
            steamApiResponse.g(System.currentTimeMillis());
            com.max.hbcache.b.i(l.f79079b, com.max.hbcache.b.e(this.f79086b), steamApiResponse);
            return it;
        }

        @Override // kh.o
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25100, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a((Resultx) obj);
        }
    }

    /* JADX INFO: compiled from: SteamPoweredApiCache.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<SteamApiStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.network.d<Result<SteamApiStateObj>> f79087b;

        e(com.max.hbcommon.network.d<Result<SteamApiStateObj>> dVar) {
            this.f79087b = dVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 25101, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            com.max.hbcommon.network.d<Result<SteamApiStateObj>> dVar = this.f79087b;
            if (dVar != null) {
                dVar.onError(e10);
            }
        }

        public void onNext(@dl.d Result<SteamApiStateObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25102, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            com.max.hbcommon.network.d<Result<SteamApiStateObj>> dVar = this.f79087b;
            if (dVar != null) {
                dVar.onNext(result);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25103, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamApiStateObj>) obj);
        }
    }

    private l() {
    }

    public static /* synthetic */ z d(l lVar, String str, boolean z10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{lVar, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 25089, new Class[]{l.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return lVar.c(str, z10);
    }

    public final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25090, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        File file = new File(BaseApplication.a().getCacheDir(), f79079b);
        if (file.exists()) {
            try {
                FilesKt__UtilsKt.V(file);
            } catch (Exception unused) {
            }
        }
    }

    @dl.d
    @xh.i
    public final z<Resultx<SteamNativeListObj>> b(@dl.d String url) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{url}, this, changeQuickRedirect, false, 25092, new Class[]{String.class}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        f0.p(url, "url");
        return d(this, url, false, 2, null);
    }

    @dl.d
    @xh.i
    public final z<Resultx<SteamNativeListObj>> c(@dl.d String url, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{url, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25088, new Class[]{String.class, Boolean.TYPE}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        f0.p(url, "url");
        String url2 = t.INSTANCE.h(url).H().J("key").h().getUrl();
        z<R> zVarZ3 = com.max.xiaoheihe.network.i.b(false).d6(url).z3(new d(url2));
        com.max.heybox.hblog.g.f74531b.q("SteamPoweredApiCache, getSteamNativeListObj key = " + url2);
        if (z10) {
            z<Resultx<SteamNativeListObj>> zVarI5 = zVarZ3.I5(io.reactivex.schedulers.b.d());
            f0.o(zVarI5, "network.subscribeOn(Schedulers.io())");
            return zVarI5;
        }
        z zVarD = com.max.hbcache.b.d(f79079b, com.max.hbcache.b.e(url2), new SteamApiResponse(new SteamNativeListObj(), 0L, 2, null), SteamApiResponse.class);
        f0.o(zVarD, "getCache(\n            ST…nse::class.java\n        )");
        z<Resultx<SteamNativeListObj>> zVarI6 = zVarD.g4(a.f79083b).z3(b.f79084b).k2(new c(zVarZ3)).I5(io.reactivex.schedulers.b.d());
        f0.o(zVarI6, "network = ServiceGenerat…scribeOn(Schedulers.io())");
        return zVarI6;
    }

    @SuppressLint({"AutoDispose"})
    public final void e(@dl.d io.reactivex.disposables.a comp, @dl.d String api_key, @dl.e String str, @dl.e com.max.hbcommon.network.d<Result<SteamApiStateObj>> dVar) {
        if (PatchProxy.proxy(new Object[]{comp, api_key, str, dVar}, this, changeQuickRedirect, false, 25091, new Class[]{io.reactivex.disposables.a.class, String.class, String.class, com.max.hbcommon.network.d.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(comp, "comp");
        f0.p(api_key, "api_key");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("api_key", api_key);
        jsonObject.addProperty("code", str);
        PostEncryptParamsObj postEncryptParamsObjU0 = com.max.xiaoheihe.utils.d.u0(com.max.hbutils.utils.k.p(jsonObject));
        comp.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().e8(postEncryptParamsObjU0.getData(), postEncryptParamsObjU0.getKey(), postEncryptParamsObjU0.getSid(), postEncryptParamsObjU0.getTime()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(dVar)));
    }
}
