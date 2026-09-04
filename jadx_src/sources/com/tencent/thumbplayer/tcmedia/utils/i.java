package com.tencent.thumbplayer.tcmedia.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class i extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f103153a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f103154b = "unknown";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f103155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f103156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f103157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<b> f103158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HandlerThread f103159g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static i f103160a = new i();
    }

    public interface b {
        void a(int i10, int i11, int i12, int i13);
    }

    private i() {
        this.f103158f = null;
        this.f103158f = new ArrayList<>();
    }

    public static i a() {
        return a.f103160a;
    }

    private synchronized void a(Context context, Handler handler) {
        if (context != null) {
            context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, handler);
        }
    }

    private boolean a(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            return networkInfo.isConnected() || networkInfo.isConnectedOrConnecting();
        }
        return false;
    }

    public static int b() {
        return f103155c;
    }

    private static int b(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            switch (networkInfo.getSubtype()) {
                case 0:
                    break;
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 2;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                default:
                    return 3;
                case 13:
                    return 4;
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051 A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:3:0x0002, B:6:0x000e, B:8:0x0020, B:10:0x0026, B:23:0x0048, B:31:0x005d, B:33:0x0067, B:34:0x006d, B:28:0x0051, B:29:0x0058, B:30:0x005b, B:11:0x0029, B:13:0x002f, B:14:0x0033, B:15:0x0036, B:17:0x003c, B:21:0x0045), top: B:37:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0058 A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:3:0x0002, B:6:0x000e, B:8:0x0020, B:10:0x0026, B:23:0x0048, B:31:0x005d, B:33:0x0067, B:34:0x006d, B:28:0x0051, B:29:0x0058, B:30:0x005b, B:11:0x0029, B:13:0x002f, B:14:0x0033, B:15:0x0036, B:17:0x003c, B:21:0x0045), top: B:37:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x005b A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:3:0x0002, B:6:0x000e, B:8:0x0020, B:10:0x0026, B:23:0x0048, B:31:0x005d, B:33:0x0067, B:34:0x006d, B:28:0x0051, B:29:0x0058, B:30:0x005b, B:11:0x0029, B:13:0x002f, B:14:0x0033, B:15:0x0036, B:17:0x003c, B:21:0x0045), top: B:37:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:3:0x0002, B:6:0x000e, B:8:0x0020, B:10:0x0026, B:23:0x0048, B:31:0x005d, B:33:0x0067, B:34:0x006d, B:28:0x0051, B:29:0x0058, B:30:0x005b, B:11:0x0029, B:13:0x002f, B:14:0x0033, B:15:0x0036, B:17:0x003c, B:21:0x0045), top: B:37:0x0002 }] */
    private void b(Context context) {
        ConnectivityManager connectivityManager;
        int i10;
        String strC;
        if (context != null) {
            try {
                connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            } catch (Exception unused) {
                return;
            }
        } else {
            connectivityManager = null;
        }
        if (connectivityManager != null) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (a(activeNetworkInfo)) {
                    f103153a = a(networkInfo) ? 3 : 2;
                }
                networkInfo = activeNetworkInfo;
                i10 = f103153a;
                if (i10 == 1) {
                    f103155c = 0;
                } else if (i10 == 2) {
                    f103155c = 1;
                } else if (i10 == 3) {
                    f103155c = b(networkInfo);
                }
                strC = c(networkInfo);
                f103154b = strC;
                if (f103156d == 0) {
                    f103156d = f103153a;
                    f103157e = strC;
                }
                f();
                e();
            }
            if (a(networkInfo)) {
                f103153a = 3;
            } else if (a(networkInfo2)) {
                f103153a = 2;
                networkInfo = networkInfo2;
            }
            i10 = f103153a;
            if (i10 == 1) {
                f103155c = 0;
            } else if (i10 == 2) {
                f103155c = 1;
            } else if (i10 == 3) {
                f103155c = b(networkInfo);
            }
            strC = c(networkInfo);
            f103154b = strC;
            if (f103156d == 0) {
                f103156d = f103153a;
                f103157e = strC;
            }
            f();
            e();
            f103153a = 1;
            networkInfo = activeNetworkInfo;
            i10 = f103153a;
            if (i10 == 1) {
                f103155c = 0;
            } else if (i10 == 2) {
                f103155c = 1;
            } else if (i10 == 3) {
                f103155c = b(networkInfo);
            }
            strC = c(networkInfo);
            f103154b = strC;
            if (f103156d == 0) {
                f103156d = f103153a;
                f103157e = strC;
            }
            f();
            e();
        }
    }

    public static int c() {
        return f103153a;
    }

    private String c(NetworkInfo networkInfo) {
        String str = "unknown";
        if (networkInfo != null && networkInfo.isConnected()) {
            int type = networkInfo.getType();
            if (type == 1) {
                str = "wifi";
            } else if (type == 9) {
                str = "ethernet";
            } else if (type == 0) {
                str = "mobilenet";
            }
            TPLogUtil.d("TPNetworkChangeMonitor", "getDetailNetworkType, typeDesc: ".concat(str));
        }
        return str;
    }

    private static boolean d() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    private synchronized void e() {
        boolean z10 = (f103153a == f103156d && TextUtils.equals(f103154b, f103157e)) ? false : true;
        TPLogUtil.i("TPNetworkChangeMonitor", "notifyIfNetChanged, isNetChanged: " + z10 + ",  mListeners:  " + this.f103158f);
        TPLogUtil.i("TPNetworkChangeMonitor", "onNetworkStatusChanged oldNetStatus: " + f103156d + ", netStatus: " + f103153a + ", mobileNetSubType" + f103155c);
        if (z10) {
            Iterator<b> it = this.f103158f.iterator();
            while (it.hasNext()) {
                it.next().a(f103156d, f103153a, 0, f103155c);
            }
            f103156d = f103153a;
            f103157e = f103154b;
        }
    }

    private void f() {
        TPLogUtil.d("TPNetworkChangeMonitor", "-->updateNetStatus(), mNetStatus=" + f103153a + "[wifi: 2, mobile: 3], lastNetStatus=" + f103156d + ", mDetailNetworkType=" + f103154b + ", mobileNetSubType=" + f103155c + "[2G:2 3G:3 4G:4], currentDetailNetType=" + f103154b + ", lastDetailNetType=" + f103157e);
    }

    public synchronized void a(Context context) {
        com.tencent.thumbplayer.tcmedia.utils.b.a(context, "context can not be null!");
        if (this.f103159g == null) {
            this.f103159g = o.a().b();
        }
        a(context, new Handler(this.f103159g.getLooper()));
    }

    public synchronized void a(b bVar) {
        ArrayList<b> arrayList = this.f103158f;
        if (arrayList != null && !arrayList.contains(bVar)) {
            this.f103158f.add(bVar);
        }
    }

    public synchronized void b(b bVar) {
        ArrayList<b> arrayList = this.f103158f;
        if (arrayList != null) {
            arrayList.remove(bVar);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        StringBuilder sb2 = new StringBuilder("onReceive broadcast action and update net status,onReceive broadcast in ");
        sb2.append(d() ? "main" : "work");
        sb2.append(" thread.");
        TPLogUtil.d("TPNetworkChangeMonitor", sb2.toString());
        b(context);
    }
}
