package s5;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static String A = null;
    public static volatile c B = null;
    public static volatile b C = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f139296a = "VMS_IDLG_SDK_Client";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f139297b = "content://com.vivo.vms.IdProvider/IdentifierId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f139298c = "persist.sys.identifierid.supported";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f139299d = "appid";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f139300e = "type";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f139301f = "OAID";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f139302g = "VAID";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f139303h = "AAID";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f139304i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f139305j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f139306k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f139307l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f139308m = 11;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f139309n = 2000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Context f139310o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f139311p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static d f139312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static d f139313r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static d f139314s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Object f139315t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static HandlerThread f139316u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static Handler f139317v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static String f139318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static String f139319x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static String f139320y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static String f139321z;

    public static final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 11) {
                Log.e(c.f139296a, "message type valid");
                return;
            }
            String unused = c.f139318w = c.C.a(message.getData().getInt("type"), message.getData().getString("appid"));
            synchronized (c.f139315t) {
                c.f139315t.notify();
            }
        }
    }

    public static String c(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
            } catch (Exception e10) {
                e10.printStackTrace();
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static c d(Context context) {
        if (B == null) {
            synchronized (c.class) {
                f139310o = context.getApplicationContext();
                B = new c();
            }
        }
        if (C == null) {
            synchronized (c.class) {
                f139310o = context.getApplicationContext();
                o();
                C = new b(f139310o);
                n();
            }
        }
        return B;
    }

    public static void f(Context context, int i10, String str) {
        if (i10 == 0) {
            f139312q = new d(B, 0, null);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, f139312q);
            return;
        }
        if (i10 == 1) {
            f139313r = new d(B, 1, str);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, f139313r);
            return;
        }
        if (i10 != 2) {
            return;
        }
        f139314s = new d(B, 2, str);
        context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str), false, f139314s);
    }

    private void i(int i10, String str) {
        Message messageObtainMessage = f139317v.obtainMessage();
        messageObtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i10);
        if (i10 == 1 || i10 == 2) {
            bundle.putString("appid", str);
        }
        messageObtainMessage.setData(bundle);
        f139317v.sendMessage(messageObtainMessage);
    }

    public static void n() {
        f139311p = "1".equals(c(f139298c, "0"));
    }

    public static void o() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        f139316u = handlerThread;
        handlerThread.start();
        f139317v = new a(f139316u.getLooper());
    }

    public String a() {
        if (!k()) {
            return null;
        }
        String str = f139319x;
        if (str != null) {
            return str;
        }
        e(0, null);
        if (f139312q == null) {
            f(f139310o, 0, null);
        }
        return f139319x;
    }

    public String b(String str) {
        if (!k()) {
            return null;
        }
        String str2 = f139321z;
        if (str2 != null) {
            return str2;
        }
        e(2, str);
        if (f139314s == null && f139321z != null) {
            f(f139310o, 2, str);
        }
        return f139321z;
    }

    public void e(int i10, String str) {
        synchronized (f139315t) {
            i(i10, str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                f139315t.wait(2000L);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            if (SystemClock.uptimeMillis() - jUptimeMillis >= 2000) {
                Log.d(f139296a, "query timeout");
            } else if (i10 == 0) {
                f139319x = f139318w;
                f139318w = null;
            } else if (i10 != 1) {
                if (i10 == 2) {
                    String str2 = f139318w;
                    if (str2 != null) {
                        f139321z = str2;
                        f139318w = null;
                    } else {
                        Log.e(f139296a, "get aaid failed");
                    }
                } else if (i10 != 4) {
                }
                A = f139318w;
                f139318w = null;
            } else {
                String str3 = f139318w;
                if (str3 != null) {
                    f139320y = str3;
                    f139318w = null;
                } else {
                    Log.e(f139296a, "get vaid failed");
                }
            }
        }
    }

    public String g() {
        if (!k()) {
            return null;
        }
        e(4, null);
        return A;
    }

    public String h(String str) {
        if (!k()) {
            return null;
        }
        String str2 = f139320y;
        if (str2 != null) {
            return str2;
        }
        e(1, str);
        if (f139313r == null && f139320y != null) {
            f(f139310o, 1, str);
        }
        return f139320y;
    }

    public boolean k() {
        return f139311p;
    }
}
