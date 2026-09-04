package com.max.xiaoheihe.module.webview.jdcache;

import androidx.compose.runtime.internal.o;
import com.max.hbcache.c;
import com.max.hbcommon.utils.f;
import com.max.hbutils.bean.Result;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.WebPackageObjV2;
import com.max.xiaoheihe.bean.WebPackageResultObj;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: JDCacheResourceManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nJDCacheResourceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDCacheResourceManager.kt\ncom/max/xiaoheihe/module/webview/jdcache/JDCacheResourceManager\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,177:1\n49#2,4:178\n*S KotlinDebug\n*F\n+ 1 JDCacheResourceManager.kt\ncom/max/xiaoheihe/module/webview/jdcache/JDCacheResourceManager\n*L\n33#1:178,4\n*E\n"})
@o(parameters = 0)
public final class JDCacheResourceManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final JDCacheResourceManager f94723a = new JDCacheResourceManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private static final String f94724b = "JDCacheResourceManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private static final String f94725c = "zip_retry_count";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private static final l0 f94726d = new b(l0.INSTANCE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f94727e = 8;

    /* JADX INFO: compiled from: JDCacheResourceManager.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<WebPackageResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 47634, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
        }

        public void onNext(@d Result<WebPackageResultObj> result) {
            ArrayList<WebPackageObjV2> list;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 47635, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (result.getResult() == null || result.getResult().getList() == null || (list = result.getResult().getList()) == null) {
                return;
            }
            for (WebPackageObjV2 webPackageObjV2 : list) {
                JDCacheResourceManager jDCacheResourceManager = JDCacheResourceManager.f94723a;
                String strG = jDCacheResourceManager.g(webPackageObjV2.getKey());
                g.a aVar = g.f74531b;
                aVar.q(jDCacheResourceManager.k() + ", localUrl == " + strG + "  packInfo==" + webPackageObjV2);
                if (!f0.g(strG, webPackageObjV2.getSource_url())) {
                    if (strG != null) {
                        String str = jDCacheResourceManager.i() + webPackageObjV2.getKey();
                        aVar.q(jDCacheResourceManager.k() + ", oldPath == " + str + "  ");
                        f.a(new File(str));
                    }
                    jDCacheResourceManager.d(webPackageObjV2.getSource_url(), webPackageObjV2.getKey());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 47636, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<WebPackageResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @t0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 JDCacheResourceManager.kt\ncom/max/xiaoheihe/module/webview/jdcache/JDCacheResourceManager\n*L\n1#1,110:1\n34#2,2:111\n*E\n"})
    public static final class b extends kotlin.coroutines.a implements l0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        public b(l0.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.l0
        public void C(@d CoroutineContext coroutineContext, @d Throwable th2) {
            if (PatchProxy.proxy(new Object[]{coroutineContext, th2}, this, changeQuickRedirect, false, 47637, new Class[]{CoroutineContext.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            g.a aVar = g.f74531b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(JDCacheResourceManager.f94723a.k());
            sb2.append(", CoroutineExceptionHandler got ");
            sb2.append(th2);
            sb2.append(" with suppressed ");
            String string = Arrays.toString(th2.getSuppressed());
            f0.o(string, "toString(this)");
            sb2.append(string);
            aVar.q(sb2.toString());
        }
    }

    private JDCacheResourceManager() {
    }

    public static final /* synthetic */ int a(JDCacheResourceManager jDCacheResourceManager, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jDCacheResourceManager, str}, null, changeQuickRedirect, true, 47610, new Class[]{JDCacheResourceManager.class, String.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : jDCacheResourceManager.f(str);
    }

    public static final /* synthetic */ void b(JDCacheResourceManager jDCacheResourceManager, String str, int i10) {
        if (PatchProxy.proxy(new Object[]{jDCacheResourceManager, str, new Integer(i10)}, null, changeQuickRedirect, true, 47611, new Class[]{JDCacheResourceManager.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        jDCacheResourceManager.n(str, i10);
    }

    private final int f(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47608, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return c.n(c.f66118e).getInt(str + f94725c, 0);
    }

    private final void n(String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 47609, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        c.n(c.f66118e).edit().putInt(str + f94725c, i10).apply();
    }

    @e
    public final Object c(@d String str, @d String str2, @d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, cVar}, this, changeQuickRedirect, false, 47604, new Class[]{String.class, String.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = i.h(e1.c(), new JDCacheResourceManager$downloadStaticAsset$2(str, str2, null), cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
    }

    public final void d(@d String url, @d String key) {
        if (PatchProxy.proxy(new Object[]{url, key}, this, changeQuickRedirect, false, 47601, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(url, "url");
        f0.p(key, "key");
        k.f(r0.a(e1.c()), f94726d, null, new JDCacheResourceManager$downloadWebPak$1(url, key, null), 2, null);
    }

    @d
    public final l0 e() {
        return f94726d;
    }

    @e
    public final String g(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47605, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : c.n(c.f66118e).getString(str, "");
    }

    @d
    public final String h() {
        return f94725c;
    }

    @d
    public final String i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47602, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HeyBoxApplication.C().getFilesDir().toString());
        String str = File.separator;
        sb2.append(str);
        sb2.append("jdcache");
        sb2.append(str);
        return sb2.toString();
    }

    @d
    public final String j(@d String key) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{key}, this, changeQuickRedirect, false, 47603, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(key, "key");
        return i() + key + DynamicSoManager.f77249d;
    }

    @d
    public final String k() {
        return f94724b;
    }

    public final void l(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47600, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().w0(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new a());
    }

    public final boolean m(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 47606, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        boolean zG = f0.g(g(str), str2);
        g.f74531b.M(f94724b + ", isPackNewest " + zG);
        return zG;
    }

    public final void o(@e String str, @e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 47607, new Class[]{String.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.v(str, str2)) {
            return;
        }
        c.n(c.f66118e).edit().putString(str, str2).apply();
    }
}
