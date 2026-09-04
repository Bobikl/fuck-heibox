package com.max.xiaoheihe.loader.dynamic_so;

import com.max.hbutils.core.BaseApplication;
import com.max.xiaoheihe.loader.bean.dynamic_so.DynamicSoInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.File;
import java.util.HashMap;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import xh.m;

/* JADX INFO: compiled from: DynamicSoManager.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DynamicSoManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    public static final String f77248c = "DynamicSoManager";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    public static final String f77249d = ".zip";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    public static final String f77250e = ".so";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private static DynamicSoManager f77252g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final q0 f77255a = r0.a(e1.c());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final a f77247b = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    @xh.e
    public static String f77251f = BaseApplication.a().getFilesDir().getAbsolutePath() + "/dynamic_so/";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    private static HashMap<String, DynamicSoInfoObj> f77253h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    private static HashMap<String, String> f77254i = new HashMap<>();

    /* JADX INFO: compiled from: DynamicSoManager.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @d
        public final HashMap<String, String> a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22070, new Class[0], HashMap.class);
            return patchProxyResultProxy.isSupported ? (HashMap) patchProxyResultProxy.result : DynamicSoManager.f77254i;
        }

        @d
        @m
        public final synchronized DynamicSoManager b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22072, new Class[0], DynamicSoManager.class);
            if (patchProxyResultProxy.isSupported) {
                return (DynamicSoManager) patchProxyResultProxy.result;
            }
            if (DynamicSoManager.f77252g == null) {
                DynamicSoManager.f77252g = new DynamicSoManager();
            }
            DynamicSoManager dynamicSoManager = DynamicSoManager.f77252g;
            f0.m(dynamicSoManager);
            return dynamicSoManager;
        }

        @d
        public final HashMap<String, DynamicSoInfoObj> c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22068, new Class[0], HashMap.class);
            return patchProxyResultProxy.isSupported ? (HashMap) patchProxyResultProxy.result : DynamicSoManager.f77253h;
        }

        @m
        public final boolean d(@e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22073, new Class[]{String.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (str == null) {
                return false;
            }
            String[] ALREADY_LOADED_DYNAMIC_SO_LIST = com.max.xiaoheihe.loader.dynamic_so.a.f77298d;
            f0.o(ALREADY_LOADED_DYNAMIC_SO_LIST, "ALREADY_LOADED_DYNAMIC_SO_LIST");
            if (ArraysKt___ArraysKt.T8(ALREADY_LOADED_DYNAMIC_SO_LIST, str)) {
                return true;
            }
            DynamicSoInfoObj dynamicSoInfoObj = DynamicSoManager.f77247b.c().get(str);
            return dynamicSoInfoObj != null && dynamicSoInfoObj.isLoad();
        }

        public final void e(@d HashMap<String, String> map) {
            if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 22071, new Class[]{HashMap.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(map, "<set-?>");
            DynamicSoManager.f77254i = map;
        }

        public final void f(@d HashMap<String, DynamicSoInfoObj> map) {
            if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 22069, new Class[]{HashMap.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(map, "<set-?>");
            DynamicSoManager.f77253h = map;
        }
    }

    public static /* synthetic */ void h(DynamicSoManager dynamicSoManager, DynamicSoInfoObj dynamicSoInfoObj, int i10, int i11, Object obj) {
        Object[] objArr = {dynamicSoManager, dynamicSoInfoObj, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 22063, new Class[]{DynamicSoManager.class, DynamicSoInfoObj.class, cls, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        dynamicSoManager.g(dynamicSoInfoObj, i10);
    }

    @d
    @m
    public static final synchronized DynamicSoManager i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 22066, new Class[0], DynamicSoManager.class);
        if (patchProxyResultProxy.isSupported) {
            return (DynamicSoManager) patchProxyResultProxy.result;
        }
        return f77247b.b();
    }

    @m
    public static final boolean k(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 22067, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f77247b.d(str);
    }

    public final void g(@e DynamicSoInfoObj dynamicSoInfoObj, int i10) {
        String key;
        String download_url;
        if (PatchProxy.proxy(new Object[]{dynamicSoInfoObj, new Integer(i10)}, this, changeQuickRedirect, false, 22062, new Class[]{DynamicSoInfoObj.class, Integer.TYPE}, Void.TYPE).isSupported || dynamicSoInfoObj == null || (key = dynamicSoInfoObj.getKey()) == null || (download_url = dynamicSoInfoObj.getDownload_url()) == null) {
            return;
        }
        if (f0.g(f77254i.get(key), download_url) && i10 == 0) {
            return;
        }
        f77254i.put(key, download_url);
        k.f(this.f77255a, null, null, new DynamicSoManager$downloadSo$1$1$1$1(key, download_url, this, dynamicSoInfoObj, i10, null), 3, null);
    }

    @d
    public final q0 j() {
        return this.f77255a;
    }

    public final void l(@e DynamicSoInfoObj dynamicSoInfoObj) {
        String key;
        if (PatchProxy.proxy(new Object[]{dynamicSoInfoObj}, this, changeQuickRedirect, false, 22061, new Class[]{DynamicSoInfoObj.class}, Void.TYPE).isSupported || dynamicSoInfoObj == null || (key = dynamicSoInfoObj.getKey()) == null) {
            return;
        }
        k.f(this.f77255a, null, null, new DynamicSoManager$loadDynamicSo$1$1$1(key, this, dynamicSoInfoObj, null), 3, null);
    }

    public final void m(@d String key, @d DynamicSoInfoObj soInfo, @d File file) {
        if (PatchProxy.proxy(new Object[]{key, soInfo, file}, this, changeQuickRedirect, false, 22065, new Class[]{String.class, DynamicSoInfoObj.class, File.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(key, "key");
        f0.p(soInfo, "soInfo");
        f0.p(file, "file");
        k.f(this.f77255a, null, null, new DynamicSoManager$loadSo$1(soInfo, file, key, this, null), 3, null);
    }

    public final void n(@d File file, @e DynamicSoInfoObj dynamicSoInfoObj) {
        if (PatchProxy.proxy(new Object[]{file, dynamicSoInfoObj}, this, changeQuickRedirect, false, 22064, new Class[]{File.class, DynamicSoInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(file, "file");
        if (!file.exists() || dynamicSoInfoObj == null) {
            return;
        }
        k.f(this.f77255a, null, null, new DynamicSoManager$unZipSo$1(file, this, dynamicSoInfoObj, null), 3, null);
    }
}
