package com.max.xiaoheihe.module.webview;

import com.jd.jdcache.JDCacheLoader;
import com.jd.jdcache.JDCacheParamsProvider;
import com.jd.jdcache.entity.JDCacheDataSource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HBHybridGlobalParams.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class b extends JDCacheParamsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f94576a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94577b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final String f94578c = "epic_add_free";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final String f94579d = "epic_add_free_game";

    /* JADX INFO: compiled from: HBHybridGlobalParams.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    @Override // com.jd.jdcache.JDCacheParamsProvider
    @dl.e
    public String getUserAgent(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46866, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        com.max.hbcommon.utils.d.b("zzzzjdcache", "getUserAgent");
        return "Mozilla/5.0 AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.118 Safari/537.36 ApiMaxJia/1.0";
    }

    @Override // com.jd.jdcache.JDCacheParamsProvider
    public boolean showLog() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46867, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        com.max.hbcommon.utils.d.b("zzzzjdcache", "showLog");
        return true;
    }

    @Override // com.jd.jdcache.JDCacheParamsProvider
    @dl.e
    public JDCacheDataSource sourceWithUrl(@dl.d String key, @dl.e JDCacheLoader jDCacheLoader) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{key, jDCacheLoader}, this, changeQuickRedirect, false, 46868, new Class[]{String.class, JDCacheLoader.class}, JDCacheDataSource.class);
        if (patchProxyResultProxy.isSupported) {
            return (JDCacheDataSource) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(key, "key");
        return null;
    }
}
