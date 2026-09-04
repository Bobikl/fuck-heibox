package com.max.xiaoheihe.module.bbs;

import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.Arrays;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: StaticResourceManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nStaticResourceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticResourceManager.kt\ncom/max/xiaoheihe/module/bbs/StaticResourceManager\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,110:1\n49#2,4:111\n*S KotlinDebug\n*F\n+ 1 StaticResourceManager.kt\ncom/max/xiaoheihe/module/bbs/StaticResourceManager\n*L\n25#1:111,4\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class StaticResourceManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final StaticResourceManager f80064a = new StaticResourceManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f80065b = "StaticResourceManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final kotlinx.coroutines.l0 f80066c = new b(kotlinx.coroutines.l0.INSTANCE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f80067d = 8;

    /* JADX INFO: compiled from: StaticResourceManager.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 26838, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26839, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (result.getResult() != null) {
                String str = result.getKeyMap().get("url");
                String str2 = result.getKeyMap().get("version");
                if (com.max.hbcommon.utils.c.u(str) || com.max.hbcommon.utils.c.u(str2)) {
                    return;
                }
                StaticResourceManager staticResourceManager = StaticResourceManager.f80064a;
                kotlin.jvm.internal.f0.m(str);
                kotlin.jvm.internal.f0.m(str2);
                staticResourceManager.b(str, str2);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26840, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @t0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 StaticResourceManager.kt\ncom/max/xiaoheihe/module/bbs/StaticResourceManager\n*L\n1#1,110:1\n26#2,2:111\n*E\n"})
    public static final class b extends kotlin.coroutines.a implements kotlinx.coroutines.l0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        public b(kotlinx.coroutines.l0.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.l0
        public void C(@dl.d CoroutineContext coroutineContext, @dl.d Throwable th2) {
            if (PatchProxy.proxy(new Object[]{coroutineContext, th2}, this, changeQuickRedirect, false, 26841, new Class[]{CoroutineContext.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(StaticResourceManager.f80064a.f());
            sb2.append(", CoroutineExceptionHandler got ");
            sb2.append(th2);
            sb2.append(" with suppressed ");
            String string = Arrays.toString(th2.getSuppressed());
            kotlin.jvm.internal.f0.o(string, "toString(this)");
            sb2.append(string);
            aVar.q(sb2.toString());
        }
    }

    private StaticResourceManager() {
    }

    @dl.e
    public final Object a(@dl.d String str, @dl.d String str2, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, cVar}, this, changeQuickRedirect, false, 26816, new Class[]{String.class, String.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlinx.coroutines.i.h(e1.c(), new StaticResourceManager$downloadStaticAsset$2(str, str2, null), cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
    }

    public final void b(@dl.d String url, @dl.d String version) {
        if (PatchProxy.proxy(new Object[]{url, version}, this, changeQuickRedirect, false, 26813, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(url, "url");
        kotlin.jvm.internal.f0.p(version, "version");
        kotlinx.coroutines.k.f(kotlinx.coroutines.r0.a(e1.c()), f80066c, null, new StaticResourceManager$downloadStaticPak$1(url, version, null), 2, null);
    }

    @dl.d
    public final kotlinx.coroutines.l0 c() {
        return f80066c;
    }

    @dl.d
    public final String d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26814, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HeyBoxApplication.C().getFilesDir().toString());
        String str = File.separator;
        sb2.append(str);
        sb2.append("statics");
        sb2.append(str);
        return sb2.toString();
    }

    @dl.d
    public final String e(@dl.d String version) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{version}, this, changeQuickRedirect, false, 26815, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(version, "version");
        return d() + version + DynamicSoManager.f77249d;
    }

    @dl.d
    public final String f() {
        return f80065b;
    }

    public final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26812, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().W(com.max.hbcache.c.j(com.max.hbcache.c.f66155w0)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new a());
    }
}
