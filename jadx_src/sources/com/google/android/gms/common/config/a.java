package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import z8.d0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public abstract class a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f52402d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    protected final String f52403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    protected final Object f52404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private Object f52405c = null;

    protected a(@n0 String str, @n0 Object obj) {
        this.f52403a = str;
        this.f52404b = obj;
    }

    @v8.a
    public static boolean c() {
        synchronized (f52402d) {
        }
        return false;
    }

    @n0
    @v8.a
    public static a<Float> f(@n0 String str, @n0 Float f10) {
        return new e(str, f10);
    }

    @n0
    @v8.a
    public static a<Integer> g(@n0 String str, @n0 Integer num) {
        return new d(str, num);
    }

    @n0
    @v8.a
    public static a<Long> h(@n0 String str, @n0 Long l10) {
        return new c(str, l10);
    }

    @n0
    @v8.a
    public static a<String> i(@n0 String str, @n0 String str2) {
        return new f(str, str2);
    }

    @n0
    @v8.a
    public static a<Boolean> j(@n0 String str, boolean z10) {
        return new b(str, Boolean.valueOf(z10));
    }

    @n0
    @v8.a
    public final T a() {
        T t10 = (T) this.f52405c;
        if (t10 != null) {
            return t10;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        Object obj = f52402d;
        synchronized (obj) {
        }
        synchronized (obj) {
            try {
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th2;
            }
        }
        try {
            T t11 = (T) k(this.f52403a);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return t11;
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                T t12 = (T) k(this.f52403a);
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return t12;
            } catch (Throwable th3) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th3;
            }
        }
    }

    @n0
    @v8.a
    @Deprecated
    public final T b() {
        return a();
    }

    @v8.a
    @d0
    public void d(@n0 T t10) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.f52405c = t10;
        Object obj = f52402d;
        synchronized (obj) {
            synchronized (obj) {
            }
        }
    }

    @v8.a
    @d0
    public void e() {
        this.f52405c = null;
    }

    @n0
    protected abstract Object k(@n0 String str);
}
