package com.jd.jdcache;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.lifecycle.y;
import com.jd.jdcache.match.ResourceMatcherManager;
import com.jd.jdcache.match.base.JDCacheResourceMatcher;
import com.jd.jdcache.match.impl.MapResourceMatcher;
import com.jd.jdcache.match.impl.PreloadHtmlMatcher;
import com.jd.jdcache.service.DelegateManager;
import com.jd.jdcache.service.JDCacheMaster;
import com.jd.jdcache.service.base.AbstractDelegate;
import com.jd.jdcache.service.impl.FileRepo;
import com.jd.jdcache.service.impl.net.NetConnection;
import com.jd.jdcache.util.JDCacheLog;
import dl.d;
import dl.e;
import java.util.LinkedList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: JDCache.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nJDCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDCache.kt\ncom/jd/jdcache/JDCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
@Keep
public final class JDCache {

    @d
    public static final JDCache INSTANCE = new JDCache();

    private JDCache() {
    }

    public static /* synthetic */ JDCacheLoader createDefaultLoader$default(JDCache jDCache, String str, String[] strArr, y yVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            yVar = null;
        }
        return jDCache.createDefaultLoader(str, strArr, yVar);
    }

    public static /* synthetic */ JDCacheLoader getAndBindLoader$default(JDCache jDCache, String str, y yVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            yVar = null;
        }
        return jDCache.getAndBindLoader(str, yVar);
    }

    public static /* synthetic */ void init$default(JDCache jDCache, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        jDCache.init(context, z10);
    }

    private final void initInternal(Context context) {
        c.f64138a.e(context);
        registerService(NetConnection.class);
        registerService(FileRepo.class);
        registerDefaultResourceMatcher(PreloadHtmlMatcher.class);
        registerDefaultResourceMatcher(MapResourceMatcher.class);
    }

    @e
    public final JDCacheLoader createDefaultLoader(@d y yVar, @e String str) {
        f0.p(yVar, "<this>");
        return createDefaultLoader(str, null, yVar);
    }

    @e
    public final JDCacheLoader createDefaultLoader(@e String str, @e String[] strArr, @e y yVar) {
        if (!c.f64138a.c()) {
            return null;
        }
        JDCacheLoader jDCacheLoaderE = str != null ? JDCacheMaster.e(JDCacheMaster.f64182b.a(), str, strArr, false, 4, null) : null;
        if (jDCacheLoaderE != null) {
            jDCacheLoaderE.setLifecycleOwner(yVar);
        }
        return jDCacheLoaderE;
    }

    @d
    public final LinkedList<JDCacheResourceMatcher> createDefaultResourceMatcherList() {
        return !c.f64138a.c() ? new LinkedList<>() : ResourceMatcherManager.f64144a.b(null);
    }

    public final void enable(boolean z10) {
        c.f64138a.g(z10);
    }

    @e
    public final JDCacheLoader getAndBindLoader(@d y yVar, @e String str) {
        f0.p(yVar, "<this>");
        return getAndBindLoader(str, yVar);
    }

    @e
    public final JDCacheLoader getAndBindLoader(@e String str, @e y yVar) {
        if (!c.f64138a.c()) {
            return null;
        }
        JDCacheLoader jDCacheLoaderF = str != null ? JDCacheMaster.f64182b.a().f(str) : null;
        if (jDCacheLoaderF != null) {
            jDCacheLoaderF.setLifecycleOwner(yVar);
        }
        return jDCacheLoaderF;
    }

    @e
    public final Context getContext() {
        return c.f64138a.a();
    }

    @e
    public final JDCacheParamsProvider getGlobalParams() {
        return c.f64138a.d();
    }

    @e
    public final JDCacheLoader getLoader(@e String str) {
        if (c.f64138a.c() && str != null) {
            return JDCacheMaster.f64182b.a().f(str);
        }
        return null;
    }

    @e
    public final <T extends AbstractDelegate> T getService(@d Class<T> delegateType) {
        f0.p(delegateType, "delegateType");
        if (c.f64138a.c()) {
            return (T) DelegateManager.f64178a.c(delegateType);
        }
        return null;
    }

    public final void init(@d Context context, boolean z10) {
        f0.p(context, "context");
        c.f64138a.f(z10);
        initInternal(context);
    }

    public final void registerDefaultResourceMatcher(@d Class<? extends JDCacheResourceMatcher> matcherClazz) {
        f0.p(matcherClazz, "matcherClazz");
        if (c.f64138a.c()) {
            ResourceMatcherManager.f64144a.e(matcherClazz);
        }
    }

    public final void registerService(@d Class<? extends AbstractDelegate> delegateClazz) {
        f0.p(delegateClazz, "delegateClazz");
        if (c.f64138a.c()) {
            DelegateManager.f64178a.a(delegateClazz);
        }
    }

    public final void removeLoader(@e String str) {
        JDCacheLoader jDCacheLoaderF;
        if (!c.f64138a.c() || str == null || (jDCacheLoaderF = JDCacheMaster.f64182b.a().f(str)) == null) {
            return;
        }
        jDCacheLoaderF.destroy();
    }

    public final void setGlobalParams(@d Class<? extends JDCacheParamsProvider> paramsProviderClazz) {
        f0.p(paramsProviderClazz, "paramsProviderClazz");
        c.f64138a.h(paramsProviderClazz);
    }

    public final void setLogger(@e JDCacheLogger jDCacheLogger) {
        JDCacheLog.INSTANCE.setMyLogger(jDCacheLogger);
    }

    public final void unregisterDefaultResourceMatcher(@d Class<? extends JDCacheResourceMatcher> matcherClazz) {
        f0.p(matcherClazz, "matcherClazz");
        if (c.f64138a.c()) {
            ResourceMatcherManager.f64144a.f(matcherClazz);
        }
    }
}
