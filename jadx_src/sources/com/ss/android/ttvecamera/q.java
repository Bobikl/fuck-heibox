package com.ss.android.ttvecamera;

import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: compiled from: TELogUtils.java */
/* JADX INFO: loaded from: classes8.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f97820a = "VESDK-";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f97821b = "monitorInfo";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte f97822c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte f97823d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte f97824e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte f97825f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte f97826g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte f97827h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte f97828i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte f97829j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte f97830k = 7;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte f97831l = 15;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final byte f97832m = 31;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static byte f97833n = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile b f97834o = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final boolean f97835p = false;

    /* JADX INFO: compiled from: TELogUtils.java */
    public static class a implements b {
        a() {
        }

        @Override // com.ss.android.ttvecamera.q.b
        public void Log(byte b10, String str, String str2) {
            if (b10 == 16) {
                Log.v(str, str2);
                return;
            }
            if (b10 == 8) {
                Log.d(str, str2);
                return;
            }
            if (b10 == 4) {
                Log.i(str, str2);
                return;
            }
            if (b10 == 2) {
                Log.w(str, str2);
            } else if (b10 == 1) {
                Log.e(str, str2);
            } else {
                Log.d(str, str2);
            }
        }
    }

    /* JADX INFO: compiled from: TELogUtils.java */
    public interface b {
        void Log(byte b10, String str, String str2);
    }

    public static void a(Class<?> cls, String str) {
        if ((f97833n & 8) != 0) {
            f97834o.Log((byte) 8, f97820a + cls.getSimpleName(), str);
        }
    }

    public static void b(String str, String str2) {
        if ((f97833n & 8) != 0) {
            f97834o.Log((byte) 8, f97820a + str, str2);
        }
    }

    public static void c(Class<?> cls, String str) {
        if ((f97833n & 1) != 0) {
            f97834o.Log((byte) 1, f97820a + cls.getSimpleName(), str);
        }
    }

    public static void d(Class<?> cls, String str, Throwable th2) {
        if ((f97833n & 1) != 0) {
            String str2 = f97820a + cls.getSimpleName();
            f97834o.Log((byte) 1, str2, str + "\n***StackTrace***\n" + Log.getStackTraceString(th2));
        }
    }

    public static void e(String str, String str2) {
        if ((f97833n & 1) != 0) {
            f97834o.Log((byte) 1, f97820a + str, str2);
        }
    }

    public static void f(String str, String str2, Throwable th2) {
        if ((f97833n & 1) != 0) {
            String str3 = f97820a + str;
            f97834o.Log((byte) 1, str3, str2 + "\n***StackTrace***\n" + Log.getStackTraceString(th2));
        }
    }

    public static int g(byte b10) {
        if (b10 == 1) {
            return 6;
        }
        if (b10 == 3) {
            return 5;
        }
        if (b10 == 7) {
            return 4;
        }
        if (b10 != 15) {
            return b10 != 31 ? 0 : 2;
        }
        return 3;
    }

    public static byte h() {
        return f97833n;
    }

    public static byte i(int i10) {
        if (i10 == 2) {
            return (byte) 31;
        }
        if (i10 == 3) {
            return (byte) 15;
        }
        if (i10 == 4) {
            return (byte) 7;
        }
        if (i10 != 5) {
            return i10 != 6 ? (byte) 0 : (byte) 1;
        }
        return (byte) 3;
    }

    public static String j() {
        return Log.getStackTraceString(new Throwable());
    }

    public static void k(String str, String str2) {
        if ((f97833n & 4) != 0) {
            f97834o.Log((byte) 4, f97820a + str, str2);
        }
    }

    public static void l(String str, Object obj) {
        if ((f97833n & 8) != 0) {
            Log.d(f97821b, str + " = " + obj.toString());
        }
    }

    public static void m() {
        b("Debug", j());
    }

    public static void n(b bVar) {
        if (bVar != null) {
            f97834o = bVar;
        } else {
            f97834o = new a();
        }
    }

    public static void o(String str, byte b10) {
        if (str != null && str.length() > 0) {
            f97820a = str + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        f97833n = b10;
    }

    public static void p(String str, int i10) {
        o(str, i(i10));
    }

    public static void q(Class<?> cls, String str) {
        if ((f97833n & 16) != 0) {
            f97834o.Log((byte) 16, f97820a + cls.getSimpleName(), str);
        }
    }

    public static void r(String str, String str2) {
        if ((f97833n & 16) != 0) {
            f97834o.Log((byte) 16, f97820a + str, str2);
        }
    }

    public static void s(Class<?> cls, String str) {
        if ((f97833n & 2) != 0) {
            f97834o.Log((byte) 2, f97820a + cls.getSimpleName(), str);
        }
    }

    public static void t(Class<?> cls, String str, Throwable th2) {
        if ((f97833n & 2) != 0) {
            String str2 = f97820a + cls.getSimpleName();
            f97834o.Log((byte) 2, str2, str + "\n***StackTrace***\n" + Log.getStackTraceString(th2));
        }
    }

    public static void u(String str, String str2) {
        if ((f97833n & 2) != 0) {
            f97834o.Log((byte) 2, f97820a + str, str2);
        }
    }

    public static void v(String str, String str2, Throwable th2) {
        if ((f97833n & 2) != 0) {
            String str3 = f97820a + str;
            f97834o.Log((byte) 2, str3, str2 + "\n***StackTrace***\n" + Log.getStackTraceString(th2));
        }
    }
}
