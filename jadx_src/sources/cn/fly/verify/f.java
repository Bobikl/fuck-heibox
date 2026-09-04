package cn.fly.verify;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f36441a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static fn f36442b;

    private f() {
        try {
            f36442b = fn.a(FlyVerify.sdkTag);
            eb.a().a(FlyVerify.sdkTag, FlyVerify.SDK_VERSION_CODE);
        } catch (Throwable th2) {
            Log.d("[FlyVerify] ==>%s", "SLog init error", th2);
        }
    }

    public static f a() {
        if (f36441a == null) {
            synchronized (f.class) {
                if (f36441a == null) {
                    f36441a = new f();
                }
            }
        }
        return f36441a;
    }

    public void a(String str) {
        fn fnVar = f36442b;
        if (fnVar != null) {
            fnVar.a("[FlyVerify] ==>%s", str);
        }
    }

    public void a(String str, String str2) {
        fn fnVar = f36442b;
        if (fnVar != null) {
            fnVar.c(str, str2);
        }
    }

    public void a(Throwable th2) {
        fn fnVar = f36442b;
        if (fnVar != null) {
            fnVar.d("[FlyVerify] ==>%s", th2);
        }
    }

    public void a(Throwable th2, String str, String str2) {
        fn fnVar = f36442b;
        if (fnVar != null) {
            fnVar.a(th2, str, str2);
        }
    }

    public void a(Throwable th2, String str, String str2, String str3, String str4) {
    }

    public void b(String str, String str2) {
        fn fnVar = f36442b;
        if (fnVar != null) {
            fnVar.a(str, str2);
        }
    }

    public void b(Throwable th2) {
        fn fnVar = f36442b;
        if (fnVar != null) {
            fnVar.a("[FlyVerify] ==>%s", th2);
        }
    }

    public void b(Throwable th2, String str, String str2, String str3, String str4) {
    }

    public void c(String str, String str2) {
        fn fnVar = f36442b;
        if (fnVar != null) {
            fnVar.d(str, str2);
        }
    }

    public void c(Throwable th2) {
        fn fnVar = f36442b;
        if (fnVar != null) {
            fnVar.b("[FlyVerify] ==>%s", th2);
        }
    }
}
