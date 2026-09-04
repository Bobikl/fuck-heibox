package cn.fly.verify;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<String, fn> f36584a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap<String, String> f36585b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36588e;

    public fn() {
        this.f36588e = false;
        this.f36586c = null;
        this.f36587d = -1;
    }

    private fn(String str, int i10) {
        this.f36588e = false;
        this.f36586c = str;
        this.f36587d = i10;
    }

    private int a(int i10, int i11, String str) {
        try {
            String str2 = Process.myPid() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Process.myTid() + "(" + Thread.currentThread().getName() + ") " + str;
            if (i11 == 1) {
                String str3 = this.f36586c;
                int i12 = this.f36587d;
                HashMap<String, String> map = f36585b;
                if (!map.isEmpty()) {
                    fn fnVar = null;
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (entry.getValue() != null && str.contains(entry.getValue())) {
                            fnVar = f36584a.get(entry.getKey());
                            break;
                        }
                    }
                    if (fnVar != null) {
                        str3 = fnVar.f36586c;
                        i12 = fnVar.f36587d;
                    }
                }
                eg.a().a(1, str3, i12, str2);
            }
            eg.a().a(i10, str2);
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Deprecated
    public static fn a(String str) {
        fn fnVar;
        HashMap<String, fn> map = f36584a;
        synchronized (map) {
            fnVar = map.get(str);
            if (fnVar == null) {
                fnVar = new fn(str, -1);
                f36585b.put(str, null);
                map.put(str, fnVar);
            }
        }
        return fnVar;
    }

    public static fn a(String str, int i10, String str2) {
        fn fnVar;
        HashMap<String, fn> map = f36584a;
        synchronized (map) {
            fnVar = map.get(str);
            if (fnVar == null) {
                fnVar = new fn(str, i10);
                f36585b.put(str, str2);
                map.put(str, fnVar);
            }
        }
        return fnVar;
    }

    private String e(Throwable th2) {
        try {
            return Log.getStackTraceString(th2);
        } catch (Throwable th3) {
            return th3 instanceof OutOfMemoryError ? bq.a("023YfkIgj@fm[jed^figdek6edgIfm0jHekej8f8fkjgeleleg") : th3.getMessage();
        }
    }

    private String f(Throwable th2) {
        try {
            String name = th2.getClass().getName();
            String strG = g(th2);
            String string = th2.getStackTrace().length > 0 ? th2.getStackTrace()[0].toString() : "";
            Throwable cause = th2;
            while (cause != null && cause.getCause() != null) {
                cause = cause.getCause();
            }
            if (cause == null || cause == th2) {
                return e(th2);
            }
            return name + ":" + strG + "\n" + string + "\n......\nCaused by:\n" + e(cause);
        } catch (Throwable unused) {
            return e(th2);
        }
    }

    private static String g(Throwable th2) {
        String message = th2.getMessage();
        if (TextUtils.isEmpty(message)) {
            return "";
        }
        if (message.length() <= 1000) {
            return message;
        }
        return message.substring(0, 1000) + "\n[Message over limit size:1000, cut!]";
    }

    public final int a(int i10, Object obj, Object... objArr) {
        String string = obj.toString();
        if (objArr.length > 0) {
            string = String.format(string, objArr);
        }
        return a(i10, 0, string);
    }

    public final int a(int i10, Throwable th2) {
        return a(i10, 0, e(th2));
    }

    public final int a(int i10, Throwable th2, Object obj, Object... objArr) {
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder();
        if (objArr.length > 0) {
            string = String.format(string, objArr);
        }
        sb2.append(string);
        sb2.append('\n');
        sb2.append(e(th2));
        return a(i10, 0, sb2.toString());
    }

    public final int a(Object obj, Object... objArr) {
        return a(3, obj, objArr);
    }

    public final int a(Throwable th2) {
        return a(3, th2);
    }

    public final int a(Throwable th2, Object obj, Object... objArr) {
        return a(3, th2, obj, objArr);
    }

    public final int b(Object obj, Object... objArr) {
        return a(5, obj, objArr);
    }

    public final int b(String str) {
        return a(5, str, new Object[0]);
    }

    public final int b(Throwable th2) {
        return a(5, th2);
    }

    public final int c(Object obj, Object... objArr) {
        return a(4, obj, objArr);
    }

    public final int c(Throwable th2) {
        return a(6, th2);
    }

    public final int d(Object obj, Object... objArr) {
        return a(6, obj, objArr);
    }

    public final void d(Throwable th2) {
        a(6, 1, f(th2));
    }
}
