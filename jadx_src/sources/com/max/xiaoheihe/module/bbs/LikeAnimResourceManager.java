package com.max.xiaoheihe.module.bbs;

import com.jd.jdcache.util.CoroutineHelper;
import com.max.xiaoheihe.bean.bbs.SpLikeIconConfig;
import com.max.xiaoheihe.module.game.dota2.ImageCacheManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: LikeAnimResourceManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nLikeAnimResourceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LikeAnimResourceManager.kt\ncom/max/xiaoheihe/module/bbs/LikeAnimResourceManager\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,135:1\n49#2,4:136\n*S KotlinDebug\n*F\n+ 1 LikeAnimResourceManager.kt\ncom/max/xiaoheihe/module/bbs/LikeAnimResourceManager\n*L\n20#1:136,4\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class LikeAnimResourceManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private static HashMap<String, SpLikeIconConfig> f79966d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final LikeAnimResourceManager f79963a = new LikeAnimResourceManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f79964b = "LikeAnimResourceManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final String f79965c = "zip_retry_count";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final kotlinx.coroutines.l0 f79967e = new a(kotlinx.coroutines.l0.INSTANCE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f79968f = 8;

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @t0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 LikeAnimResourceManager.kt\ncom/max/xiaoheihe/module/bbs/LikeAnimResourceManager\n*L\n1#1,110:1\n21#2,2:111\n*E\n"})
    public static final class a extends kotlin.coroutines.a implements kotlinx.coroutines.l0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a(kotlinx.coroutines.l0.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.l0
        public void C(@dl.d CoroutineContext coroutineContext, @dl.d Throwable th2) {
            if (PatchProxy.proxy(new Object[]{coroutineContext, th2}, this, changeQuickRedirect, false, 26660, new Class[]{CoroutineContext.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(LikeAnimResourceManager.f79963a.k());
            sb2.append(", CoroutineExceptionHandler got ");
            sb2.append(th2);
            sb2.append(" with suppressed ");
            String string = Arrays.toString(th2.getSuppressed());
            kotlin.jvm.internal.f0.o(string, "toString(this)");
            sb2.append(string);
            aVar.q(sb2.toString());
        }
    }

    private LikeAnimResourceManager() {
    }

    @dl.e
    public final File a(@dl.d String key) {
        SpLikeIconConfig spLikeIconConfig;
        String like_after_detail;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{key}, this, changeQuickRedirect, false, 26653, new Class[]{String.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(key, "key");
        HashMap<String, SpLikeIconConfig> map = f79966d;
        if (map == null || (spLikeIconConfig = map.get(key)) == null || (like_after_detail = spLikeIconConfig.getLike_after_detail()) == null) {
            return null;
        }
        return new File(ImageCacheManager.f87355b.a() + File.separator + ImageCacheManager.f87360g, like_after_detail);
    }

    @dl.e
    public final String b(@dl.e String str) {
        HashMap<String, SpLikeIconConfig> map;
        SpLikeIconConfig spLikeIconConfig;
        String like_after_detail;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26654, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null || (map = f79966d) == null || (spLikeIconConfig = map.get(str)) == null || (like_after_detail = spLikeIconConfig.getLike_after_detail()) == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ImageCacheManager.f87355b.a());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(ImageCacheManager.f87360g);
        sb2.append(str2);
        sb2.append(like_after_detail);
        return sb2.toString();
    }

    @dl.e
    public final File c(@dl.d String key) {
        SpLikeIconConfig spLikeIconConfig;
        String like_before_detail;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{key}, this, changeQuickRedirect, false, 26651, new Class[]{String.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(key, "key");
        HashMap<String, SpLikeIconConfig> map = f79966d;
        if (map == null || (spLikeIconConfig = map.get(key)) == null || (like_before_detail = spLikeIconConfig.getLike_before_detail()) == null) {
            return null;
        }
        return new File(ImageCacheManager.f87355b.a() + File.separator + ImageCacheManager.f87360g, like_before_detail);
    }

    @dl.e
    public final String d(@dl.e String str) {
        HashMap<String, SpLikeIconConfig> map;
        SpLikeIconConfig spLikeIconConfig;
        String like_before_detail;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26652, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null || (map = f79966d) == null || (spLikeIconConfig = map.get(str)) == null || (like_before_detail = spLikeIconConfig.getLike_before_detail()) == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ImageCacheManager.f87355b.a());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(ImageCacheManager.f87360g);
        sb2.append(str2);
        sb2.append(like_before_detail);
        return sb2.toString();
    }

    @dl.d
    public final kotlinx.coroutines.l0 e() {
        return f79967e;
    }

    @dl.e
    public final File f(@dl.d String key) {
        SpLikeIconConfig spLikeIconConfig;
        String like_after_list;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{key}, this, changeQuickRedirect, false, 26650, new Class[]{String.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(key, "key");
        HashMap<String, SpLikeIconConfig> map = f79966d;
        if (map == null || (spLikeIconConfig = map.get(key)) == null || (like_after_list = spLikeIconConfig.getLike_after_list()) == null) {
            return null;
        }
        return new File(ImageCacheManager.f87355b.a() + File.separator + ImageCacheManager.f87360g, like_after_list);
    }

    @dl.e
    public final File g(@dl.d String key) {
        SpLikeIconConfig spLikeIconConfig;
        String like_before_list;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{key}, this, changeQuickRedirect, false, 26649, new Class[]{String.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(key, "key");
        HashMap<String, SpLikeIconConfig> map = f79966d;
        if (map == null || (spLikeIconConfig = map.get(key)) == null || (like_before_list = spLikeIconConfig.getLike_before_list()) == null) {
            return null;
        }
        return new File(ImageCacheManager.f87355b.a() + File.separator + ImageCacheManager.f87360g, like_before_list);
    }

    @dl.e
    public final File h(@dl.d String key) {
        SpLikeIconConfig spLikeIconConfig;
        String like_motion;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{key}, this, changeQuickRedirect, false, 26655, new Class[]{String.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(key, "key");
        HashMap<String, SpLikeIconConfig> map = f79966d;
        if (map == null || (spLikeIconConfig = map.get(key)) == null || (like_motion = spLikeIconConfig.getLike_motion()) == null) {
            return null;
        }
        return new File(ImageCacheManager.f87355b.a() + File.separator + ImageCacheManager.f87360g, like_motion);
    }

    @dl.d
    public final String i() {
        return f79965c;
    }

    @dl.e
    public final HashMap<String, SpLikeIconConfig> j() {
        return f79966d;
    }

    @dl.d
    public final String k() {
        return f79964b;
    }

    public final boolean l(@dl.d String key) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{key}, this, changeQuickRedirect, false, 26648, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        kotlin.jvm.internal.f0.p(key, "key");
        File fileG = g(key);
        File fileF = f(key);
        if (fileG != null && fileG.exists()) {
            if (fileF != null && fileF.exists()) {
                return true;
            }
        }
        return false;
    }

    public final boolean m(@dl.d String key) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{key}, this, changeQuickRedirect, false, 26647, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        kotlin.jvm.internal.f0.p(key, "key");
        File fileC = c(key);
        File fileA = a(key);
        if (fileC != null && fileC.exists()) {
            if (fileA != null && fileA.exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.io.File] */
    public final void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26646, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? file = new File(ImageCacheManager.f87355b.a() + File.separator + ImageCacheManager.f87360g, "mapping.json");
        objectRef.f124891b = file;
        if (file.exists()) {
            CoroutineHelper.launchCoroutine$default(CoroutineHelper.INSTANCE, this, null, new LikeAnimResourceManager$readCacheMap$1(objectRef, null), 1, null);
        }
    }

    public final void o(@dl.e HashMap<String, SpLikeIconConfig> map) {
        f79966d = map;
    }
}
