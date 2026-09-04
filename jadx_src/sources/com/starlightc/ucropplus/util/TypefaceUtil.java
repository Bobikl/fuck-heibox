package com.starlightc.ucropplus.util;

import android.content.Context;
import android.graphics.Typeface;
import com.max.hbcache.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TypefaceUtil.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class TypefaceUtil {

    @d
    public static final String SP_CACHED_TYPEFACE_PREFIX = "cached_typeface";
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static final TypefaceUtil INSTANCE = new TypefaceUtil();

    @d
    private static final ConcurrentHashMap<String, Typeface> typefaceMap = new ConcurrentHashMap<>();

    @d
    private static final ConcurrentHashMap<String, Typeface> remoteTFMap = new ConcurrentHashMap<>();

    private TypefaceUtil() {
    }

    private final Typeface getBuildInTypeface(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 50987, new Class[]{Context.class, String.class}, Typeface.class);
        if (patchProxyResultProxy.isSupported) {
            return (Typeface) patchProxyResultProxy.result;
        }
        ConcurrentHashMap<String, Typeface> concurrentHashMap = typefaceMap;
        Typeface typefaceCreateFromAsset = concurrentHashMap.get(str);
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str);
                concurrentHashMap.put(str, typefaceCreateFromAsset);
            } catch (Exception unused) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        if (typefaceCreateFromAsset != null) {
            return typefaceCreateFromAsset;
        }
        Typeface DEFAULT = Typeface.DEFAULT;
        f0.o(DEFAULT, "DEFAULT");
        return DEFAULT;
    }

    public static /* synthetic */ Typeface getTypeface$default(TypefaceUtil typefaceUtil, Context context, String str, String str2, boolean z10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{typefaceUtil, context, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 50986, new Class[]{TypefaceUtil.class, Context.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, Typeface.class);
        if (patchProxyResultProxy.isSupported) {
            return (Typeface) patchProxyResultProxy.result;
        }
        return typefaceUtil.getTypeface(context, str, str2, (i10 & 8) == 0 ? z10 ? 1 : 0 : false);
    }

    public final void addCachedTypeface(@d String name, @d String outPath) {
        if (PatchProxy.proxy(new Object[]{name, outPath}, this, changeQuickRedirect, false, 50990, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(name, "name");
        f0.p(outPath, "outPath");
        c.C(SP_CACHED_TYPEFACE_PREFIX + name, outPath);
        remoteTFMap.put(name, Typeface.createFromFile(outPath));
    }

    @e
    public final Typeface getCachedRemoteTypeface(@d String name) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{name}, this, changeQuickRedirect, false, 50989, new Class[]{String.class}, Typeface.class);
        if (patchProxyResultProxy.isSupported) {
            return (Typeface) patchProxyResultProxy.result;
        }
        f0.p(name, "name");
        ConcurrentHashMap<String, Typeface> concurrentHashMap = remoteTFMap;
        Typeface typeface = concurrentHashMap.get(name);
        if (typeface != null && !f0.g(typeface, Typeface.DEFAULT)) {
            return typeface;
        }
        String strO = c.o(SP_CACHED_TYPEFACE_PREFIX + name, null);
        if (strO == null) {
            return typeface;
        }
        Typeface typefaceCreateFromFile = Typeface.createFromFile(strO);
        concurrentHashMap.put(name, typefaceCreateFromFile);
        return typefaceCreateFromFile;
    }

    @d
    public final Typeface getTypeface(@d Context context, @e String str, @e String str2, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 50985, new Class[]{Context.class, String.class, String.class, Boolean.TYPE}, Typeface.class);
        if (patchProxyResultProxy.isSupported) {
            return (Typeface) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        if (str == null || str2 == null) {
            Typeface DEFAULT = Typeface.DEFAULT;
            f0.o(DEFAULT, "DEFAULT");
            return DEFAULT;
        }
        if (!z10) {
            return getBuildInTypeface(context, str);
        }
        Typeface cachedRemoteTypeface = getCachedRemoteTypeface(str2);
        if (cachedRemoteTypeface == null) {
            cachedRemoteTypeface = Typeface.DEFAULT;
        }
        f0.m(cachedRemoteTypeface);
        return cachedRemoteTypeface;
    }

    @d
    public final File getTypefaceDir(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 50984, new Class[]{Context.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        File file = new File(context.getFilesDir().getPath() + File.separator + "typefaces");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final boolean isRemoteTypefaceCached(@d String name) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{name}, this, changeQuickRedirect, false, 50988, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(name, "name");
        Typeface cachedRemoteTypeface = getCachedRemoteTypeface(name);
        return (cachedRemoteTypeface == null || f0.g(cachedRemoteTypeface, Typeface.DEFAULT)) ? false : true;
    }
}
