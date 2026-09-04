package com.jd.jdcache.service;

import com.jd.jdcache.JDCacheLoader;
import com.jd.jdcache.util.JDCacheLog;
import dl.d;
import dl.e;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;

/* JADX INFO: compiled from: JDCacheMaster.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nJDCacheMaster.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDCacheMaster.kt\ncom/jd/jdcache/service/JDCacheMaster\n+ 2 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n9#2,4:70\n9#2,4:74\n9#2,2:78\n12#2:81\n1#3:80\n*S KotlinDebug\n*F\n+ 1 JDCacheMaster.kt\ncom/jd/jdcache/service/JDCacheMaster\n*L\n48#1:70,4\n54#1:74,4\n64#1:78,2\n64#1:81\n*E\n"})
public final class JDCacheMaster {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final a f64182b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private static final String f64183c = "JDCacheMaster";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private static volatile JDCacheMaster f64184d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final z f64185a;

    /* JADX INFO: compiled from: JDCacheMaster.kt */
    @t0({"SMAP\nJDCacheMaster.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDCacheMaster.kt\ncom/jd/jdcache/service/JDCacheMaster$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @d
        public final JDCacheMaster a() {
            JDCacheMaster jDCacheMaster = JDCacheMaster.f64184d;
            if (jDCacheMaster == null) {
                synchronized (this) {
                    jDCacheMaster = JDCacheMaster.f64184d;
                    if (jDCacheMaster == null) {
                        jDCacheMaster = new JDCacheMaster(null);
                        a aVar = JDCacheMaster.f64182b;
                        JDCacheMaster.f64184d = jDCacheMaster;
                    }
                }
            }
            return jDCacheMaster;
        }
    }

    private JDCacheMaster() {
        this.f64185a = b0.c(new yh.a<ConcurrentHashMap<String, JDCacheLoader>>() { // from class: com.jd.jdcache.service.JDCacheMaster$loaderMap$2
            @Override // yh.a
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ConcurrentHashMap<String, JDCacheLoader> invoke() {
                return new ConcurrentHashMap<>();
            }
        });
    }

    public /* synthetic */ JDCacheMaster(u uVar) {
        this();
    }

    public static /* synthetic */ JDCacheLoader e(JDCacheMaster jDCacheMaster, String str, String[] strArr, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return jDCacheMaster.d(str, strArr, z10);
    }

    private final ConcurrentHashMap<String, JDCacheLoader> g() {
        return (ConcurrentHashMap) this.f64185a.getValue();
    }

    public final void c(@d JDCacheLoader loader) {
        f0.p(loader, "loader");
        JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
        if (jDCacheLog.getCanLog()) {
            jDCacheLog.d(f64183c, "Add new loader(id:" + loader.getKey() + ") for " + loader.getUrl());
        }
        g().put(loader.getKey(), loader);
    }

    @d
    public final JDCacheLoader d(@d String url, @e String[] strArr, boolean z10) {
        f0.p(url, "url");
        JDCacheLoader jDCacheLoader = new JDCacheLoader(url, strArr, String.valueOf(System.currentTimeMillis()), null, false, 24, null);
        jDCacheLoader.setPreloadHtml(z10);
        JDCacheLoader jDCacheLoaderInit = jDCacheLoader.init();
        JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
        if (jDCacheLog.getCanLog()) {
            jDCacheLog.d(f64183c, "Create new loader(id:" + jDCacheLoaderInit.getKey() + ") for " + jDCacheLoaderInit.getUrl());
        }
        g().put(jDCacheLoaderInit.getKey(), jDCacheLoaderInit);
        return jDCacheLoaderInit;
    }

    @e
    public final JDCacheLoader f(@d String loaderKey) {
        f0.p(loaderKey, "loaderKey");
        return g().get(loaderKey);
    }

    @e
    public final JDCacheLoader h(@d String loaderKey) {
        f0.p(loaderKey, "loaderKey");
        JDCacheLoader jDCacheLoaderRemove = g().remove(loaderKey);
        JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
        if (jDCacheLog.getCanLog() && jDCacheLoaderRemove != null) {
            jDCacheLog.d(f64183c, "Remove loader(id:" + jDCacheLoaderRemove.getKey() + ')');
        }
        return jDCacheLoaderRemove;
    }
}
