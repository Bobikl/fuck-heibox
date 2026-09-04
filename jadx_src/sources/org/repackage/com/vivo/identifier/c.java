package org.repackage.com.vivo.identifier;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;

/* JADX INFO: compiled from: IdentifierIdClient.java */
/* JADX INFO: loaded from: classes5.dex */
public class c {
    private static String A = null;
    private static volatile c B = null;
    private static volatile b C = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f138054a = "VMS_IDLG_SDK_Client";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f138055b = "content://com.vivo.vms.IdProvider/IdentifierId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f138056c = "persist.sys.identifierid.supported";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f138057d = "appid";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f138058e = "type";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f138059f = "OAID";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f138060g = "VAID";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f138061h = "AAID";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f138062i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f138063j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f138064k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f138065l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f138066m = 11;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f138067n = 2000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static Context f138068o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f138069p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static d f138070q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static d f138071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static d f138072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Object f138073t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static HandlerThread f138074u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static Handler f138075v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static String f138076w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static String f138077x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static String f138078y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static String f138079z;

    /* JADX INFO: compiled from: IdentifierIdClient.java */
    public static final class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 11) {
                Log.e("VMS_IDLG_SDK_Client", "message type valid");
                return;
            }
            String unused = c.f138076w = c.C.a(message.getData().getInt("type"), message.getData().getString("appid"));
            synchronized (c.f138073t) {
                c.f138073t.notify();
            }
        }
    }

    private c() {
    }

    public static String b(String str, String str2) {
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

    public static c c(Context context) {
        if (B == null) {
            synchronized (c.class) {
                f138068o = context.getApplicationContext();
                B = new c();
            }
        }
        if (C == null) {
            synchronized (c.class) {
                f138068o = context.getApplicationContext();
                o();
                C = new b(f138068o);
                l();
            }
        }
        return B;
    }

    private static void e(Context context, int i10, String str) {
        if (i10 == 0) {
            f138070q = new d(B, 0, null);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, f138070q);
            return;
        }
        if (i10 == 1) {
            f138071r = new d(B, 1, str);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, f138071r);
            return;
        }
        if (i10 != 2) {
            return;
        }
        f138072s = new d(B, 2, str);
        context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str), false, f138072s);
    }

    private void i(int i10, String str) {
        Message messageObtainMessage = f138075v.obtainMessage();
        messageObtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i10);
        if (i10 == 1 || i10 == 2) {
            bundle.putString("appid", str);
        }
        messageObtainMessage.setData(bundle);
        f138075v.sendMessage(messageObtainMessage);
    }

    public static void l() {
        f138069p = "1".equals(b("persist.sys.identifierid.supported", "0"));
    }

    private static void o() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        f138074u = handlerThread;
        handlerThread.start();
        f138075v = new a(f138074u.getLooper());
    }

    public String a(String str) {
        if (!f()) {
            return null;
        }
        String str2 = f138078y;
        if (str2 != null) {
            return str2;
        }
        d(1, str);
        if (f138071r == null && f138078y != null) {
            e(f138068o, 1, str);
        }
        return f138078y;
    }

    public void d(int i10, String str) {
        synchronized (f138073t) {
            i(i10, str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                f138073t.wait(2000L);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            if (SystemClock.uptimeMillis() - jUptimeMillis >= 2000) {
                Log.d("VMS_IDLG_SDK_Client", "query timeout");
            } else if (i10 == 0) {
                f138077x = f138076w;
                f138076w = null;
            } else if (i10 != 1) {
                if (i10 == 2) {
                    String str2 = f138076w;
                    if (str2 != null) {
                        f138079z = str2;
                        f138076w = null;
                    } else {
                        Log.e("VMS_IDLG_SDK_Client", "get aaid failed");
                    }
                } else if (i10 != 4) {
                }
                A = f138076w;
                f138076w = null;
            } else {
                String str3 = f138076w;
                if (str3 != null) {
                    f138078y = str3;
                    f138076w = null;
                } else {
                    Log.e("VMS_IDLG_SDK_Client", "get vaid failed");
                }
            }
        }
    }

    public boolean f() {
        return f138069p;
    }

    public String g() {
        if (!f()) {
            return null;
        }
        String str = f138077x;
        if (str != null) {
            return str;
        }
        d(0, null);
        if (f138070q == null) {
            e(f138068o, 0, null);
        }
        return f138077x;
    }

    public String h(String str) {
        if (!f()) {
            return null;
        }
        String str2 = f138079z;
        if (str2 != null) {
            return str2;
        }
        d(2, str);
        if (f138072s == null && f138079z != null) {
            e(f138068o, 2, str);
        }
        return f138079z;
    }

    public String j() {
        if (!f()) {
            return null;
        }
        d(4, null);
        return A;
    }
}
