package com.jd.jdcache;

import android.content.Context;
import com.jd.jdcache.util.JDCacheLog;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: JDCacheSetting.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private static Context f64139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f64140c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private static JDCacheParamsProvider f64143f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final c f64138a = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f64141d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private static Class<? extends JDCacheParamsProvider> f64142e = JDCacheParamsProvider.class;

    private c() {
    }

    @e
    public final Context a() {
        return f64139b;
    }

    public final boolean b() {
        return f64140c;
    }

    public final boolean c() {
        return f64141d;
    }

    @e
    public final JDCacheParamsProvider d() {
        if (f64143f == null) {
            synchronized (this) {
                if (f64143f == null) {
                    try {
                        f64143f = f64142e.newInstance();
                    } catch (Throwable th2) {
                        JDCacheLog.INSTANCE.e("JDCacheSetting", "Error in creating global params", th2);
                    }
                }
                b2 b2Var = b2.f124493a;
            }
        }
        return f64143f;
    }

    public final void e(@e Context context) {
        f64139b = context;
    }

    public final void f(boolean z10) {
        f64140c = z10;
    }

    public final void g(boolean z10) {
        f64141d = z10;
    }

    public final void h(@d Class<? extends JDCacheParamsProvider> clazz) {
        f0.p(clazz, "clazz");
        f64143f = null;
        f64142e = clazz;
    }
}
