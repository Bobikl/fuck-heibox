package cn.fly.verify;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public class ex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ex f36436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private eu f36437b;

    private ex(Context context) {
        try {
            boolean zA = a();
            boolean zB = b();
            boolean zC = c();
            boolean zK = az.a().k();
            int i10 = fc.a(context).d().ak().targetSdkVersion;
            int i11 = Build.VERSION.SDK_INT;
            b("3xu: " + zB + ", 3xd: " + zA + ", dre: " + zK + ", obf: " + zC + ", tar: " + i10 + ", api: " + i11);
            if (i10 < 30 || i11 < 30) {
                b("2x");
                this.f36437b = new ey();
                return;
            }
            if (zB && !zC) {
                ew ewVar = new ew();
                if (ewVar.a(context)) {
                    b("3xu");
                    this.f36437b = ewVar;
                }
            }
            if (this.f36437b == null && zK && zA) {
                ev evVar = new ev();
                if (evVar.a(context)) {
                    b("3xd");
                    this.f36437b = evVar;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized ex a(Context context) {
        if (f36436a == null && context != null) {
            f36436a = new ex(context);
        }
        return f36436a;
    }

    public static void a(Throwable th2) {
        es.a().a(th2, "[HH] ", new Object[0]);
    }

    private boolean a() {
        return ((Integer) by.a(ec.a("0029bacd"), 0)).intValue() == 1;
    }

    public static void b(String str) {
        es.a().a("[HH] " + str, new Object[0]);
    }

    private boolean b() {
        return ((Integer) by.a(ec.a("002Gbedg"), 1)).intValue() == 1;
    }

    private boolean c() {
        return d();
    }

    private boolean d() {
        boolean zEquals = true;
        try {
            zEquals = true ^ ec.a("023ac>bjcdGeRcabjbb?dRbhbgcdcabjea2e6caei^dUbhbgcdca").equals(FlyVerify.class.getName());
        } catch (Throwable th2) {
            a(th2);
        }
        b("ck-cn: " + zEquals);
        return zEquals;
    }

    public <T> T a(Class cls, Object obj, String str, Class[] clsArr, Object[] objArr, T t10) throws Throwable {
        eu euVar = this.f36437b;
        return euVar != null ? (T) euVar.a(cls, obj, str, clsArr, objArr) : t10;
    }

    public <T> T a(String str) throws Throwable {
        eu euVar = this.f36437b;
        if (euVar != null) {
            return (T) euVar.a(str);
        }
        return null;
    }

    public <T> T a(String str, Object obj, String str2, Class[] clsArr, Object[] objArr, T t10) throws Throwable {
        eu euVar = this.f36437b;
        return euVar != null ? (T) euVar.a(str, obj, str2, clsArr, objArr) : t10;
    }

    public <T> T a(String str, String str2, Object obj, T t10) throws Throwable {
        eu euVar = this.f36437b;
        return euVar != null ? (T) euVar.a(str, str2, obj) : t10;
    }

    public <T> T a(String str, Class[] clsArr, Object[] objArr) throws Throwable {
        eu euVar = this.f36437b;
        if (euVar != null) {
            return (T) euVar.a(str, clsArr, objArr);
        }
        return null;
    }

    public boolean b(Context context) {
        return ev.b(context);
    }
}
