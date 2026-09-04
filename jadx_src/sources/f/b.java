package f;

import android.util.Log;
import com.tencent.msdk.dns.base.log.ILogNode;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: DnsLog.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f118732a;

    static {
        int i10;
        int i11 = 7;
        int i12 = 6;
        while (true) {
            int i13 = i12;
            i10 = i11;
            i11 = i13;
            if (i11 < 2 || !Log.isLoggable("HTTPDNS", i11)) {
                break;
            } else {
                i12 = i11 - 1;
            }
        }
        f118732a = i10;
    }

    public static void a(int i10, Throwable th2, String str, Object... objArr) {
        try {
            if (i10 >= f118732a) {
                String str2 = String.format(Locale.US, str, objArr);
                Iterator<ILogNode> it = c.f118733a.iterator();
                while (it.hasNext()) {
                    it.next().println(i10, "HTTPDNS", str2, th2);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void b(String str, Object... objArr) {
        a(3, null, str, objArr);
    }

    public static void c(Throwable th2, String str, Object... objArr) {
        a(3, th2, str, objArr);
    }

    public static boolean d(int i10) {
        return i10 >= f118732a;
    }

    public static void e(String str, Object... objArr) {
        a(6, null, str, objArr);
    }

    public static void f(String str, Object... objArr) {
        a(2, null, str, objArr);
    }

    public static void g(String str, Object... objArr) {
        a(5, null, str, objArr);
    }
}
