package com.alipay.apmobilesecuritysdk.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import com.alipay.apmobilesecuritysdk.d.e;
import com.alipay.apmobilesecuritysdk.e.b;
import com.alipay.apmobilesecuritysdk.e.c;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.max.hbutils.utils.w;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f38165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.alipay.apmobilesecuritysdk.b.a f38166b = com.alipay.apmobilesecuritysdk.b.a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38167c = 4;

    public a(Context context) {
        this.f38165a = context;
    }

    public static String a(Context context) {
        String strB = b(context);
        return e6.a.c(strB) ? h.f(context) : strB;
    }

    public static String a(Context context, String str) {
        try {
            b();
            String strA = i.a(str);
            if (!e6.a.c(strA)) {
                return strA;
            }
            String strA2 = g.a(context, str);
            i.a(str, strA2);
            return !e6.a.c(strA2) ? strA2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(w.f73604k);
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int iRandom = ((int) (Math.random() * 24.0d * 60.0d * 60.0d)) * 1;
        for (int i10 = 0; i10 < 3; i10++) {
            try {
                String[] strArrSplit = strArr[i10].split(" ");
                if (strArrSplit != null && strArrSplit.length == 2) {
                    Date date = new Date();
                    Date date2 = simpleDateFormat.parse(strArrSplit[0] + " 00:00:00");
                    Date date3 = simpleDateFormat.parse(strArrSplit[1] + " 23:59:59");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date3);
                    calendar.add(13, iRandom);
                    Date time = calendar.getTime();
                    if (date.after(date2) && date.before(time)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String b(Context context) {
        try {
            String strB = i.b();
            if (!e6.a.c(strB)) {
                return strB;
            }
            c cVarB = d.b(context);
            if (cVarB != null) {
                i.a(cVarB);
                String str = cVarB.f38175a;
                if (e6.a.f(str)) {
                    return str;
                }
            }
            b bVarB = com.alipay.apmobilesecuritysdk.e.a.b(context);
            if (bVarB == null) {
                return "";
            }
            i.a(bVarB);
            String str2 = bVarB.f38172a;
            return e6.a.f(str2) ? str2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private y4.c b(Map<String, String> map) {
        String str;
        String str2;
        String str3;
        b bVarB;
        b bVarC;
        String str4 = "";
        try {
            Context context = this.f38165a;
            y4.d dVar = new y4.d();
            String strB = e6.a.b(map, "appName", "");
            String strB2 = e6.a.b(map, "sessionId", "");
            String strB3 = e6.a.b(map, "rpcVersion", "");
            String strA = a(context, strB);
            String securityToken = UmidSdkWrapper.getSecurityToken(context);
            String strD = h.d(context);
            if (e6.a.f(strB2)) {
                dVar.f141582c = strB2;
            } else {
                dVar.f141582c = strA;
            }
            dVar.f141583d = securityToken;
            dVar.f141584e = strD;
            dVar.f141580a = "android";
            c cVarC = d.c(context);
            if (cVarC != null) {
                str2 = cVarC.f38175a;
                str = cVarC.f38177c;
            } else {
                str = "";
                str2 = str;
            }
            if (e6.a.c(str2) && (bVarC = com.alipay.apmobilesecuritysdk.e.a.c(context)) != null) {
                str2 = bVarC.f38172a;
                str = bVarC.f38174c;
            }
            c cVarB = d.b();
            if (cVarB != null) {
                str4 = cVarB.f38175a;
                str3 = cVarB.f38177c;
            } else {
                str3 = "";
            }
            if (e6.a.c(str4) && (bVarB = com.alipay.apmobilesecuritysdk.e.a.b()) != null) {
                str4 = bVarB.f38172a;
                str3 = bVarB.f38174c;
            }
            dVar.f141587h = str2;
            dVar.f141586g = str4;
            dVar.f141589j = strB3;
            if (e6.a.c(str2)) {
                dVar.f141581b = str4;
                str = str3;
            } else {
                dVar.f141581b = str2;
            }
            dVar.f141588i = str;
            dVar.f141585f = e.a(context, map);
            return u4.d.c(this.f38165a, this.f38166b.c()).a(dVar);
        } catch (Throwable th2) {
            th2.printStackTrace();
            com.alipay.apmobilesecuritysdk.c.a.a(th2);
            return null;
        }
    }

    public static void b() {
        try {
            String[] strArr = {"device_feature_file_name", "wallet_times", "wxcasxx_v3", "wxcasxx_v4", "wxxzyy_v1"};
            for (int i10 = 0; i10 < 5; i10++) {
                String str = strArr[i10];
                File file = new File(Environment.getExternalStorageDirectory(), ".SystemConfig/" + str);
                if (file.exists() && file.canWrite()) {
                    file.delete();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x01fd A[Catch: Exception -> 0x023a, TryCatch #0 {Exception -> 0x023a, blocks: (B:3:0x0006, B:5:0x0037, B:8:0x0040, B:37:0x00be, B:69:0x01e2, B:71:0x01fd, B:73:0x0203, B:75:0x0209, B:79:0x0212, B:81:0x0218, B:40:0x00d2, B:42:0x00ea, B:48:0x00f7, B:49:0x0107, B:51:0x010e, B:55:0x0120, B:57:0x0170, B:59:0x017a, B:61:0x0182, B:63:0x018f, B:65:0x0199, B:67:0x01a1, B:66:0x019d, B:60:0x017e, B:11:0x0055, B:13:0x0063, B:16:0x006e, B:18:0x0074, B:21:0x007f, B:24:0x0088, B:27:0x0095, B:30:0x00a2, B:33:0x00af), top: B:87:0x0006 }] */
    public final int a(Map<String, String> map) {
        boolean z10;
        int i10;
        String str;
        a5.a aVarC;
        Context context;
        NetworkInfo activeNetworkInfo;
        try {
            com.alipay.apmobilesecuritysdk.c.a.a(this.f38165a, e6.a.b(map, "tid", ""), e6.a.b(map, "utdid", ""), a(this.f38165a));
            String strB = e6.a.b(map, "appName", "");
            b();
            b(this.f38165a);
            a(this.f38165a, strB);
            i.a();
            boolean z11 = false;
            if (!a() && !com.alipay.apmobilesecuritysdk.common.a.a(this.f38165a)) {
                e.a();
                if (!(!e6.a.d(e.b(this.f38165a, map), i.c()))) {
                    String strB2 = e6.a.b(map, "tid", "");
                    String strB3 = e6.a.b(map, "utdid", "");
                    if ((!e6.a.f(strB2) || e6.a.d(strB2, i.d())) && ((!e6.a.f(strB3) || e6.a.d(strB3, i.e())) && i.a(this.f38165a, strB) && !e6.a.c(a(this.f38165a, strB)) && !e6.a.c(b(this.f38165a)))) {
                        z10 = false;
                    }
                }
                z10 = true;
            } else if (e6.a.c(a(this.f38165a, strB)) || e6.a.c(b(this.f38165a))) {
                z10 = true;
            } else {
                z10 = false;
            }
            Context context2 = this.f38165a;
            o4.c.f();
            h.b(context2, String.valueOf(o4.c.C()));
            if (z10) {
                new com.alipay.apmobilesecuritysdk.c.b();
                UmidSdkWrapper.startUmidTaskSync(this.f38165a, com.alipay.apmobilesecuritysdk.b.a.a().b());
                y4.c cVarB = b(map);
                int iC = cVarB != null ? cVarB.c() : 2;
                if (iC != 1) {
                    if (iC != 3) {
                        if (cVarB != null) {
                            str = "Server error, result:" + cVarB.f141565b;
                        } else {
                            str = "Server error, returned null";
                        }
                        com.alipay.apmobilesecuritysdk.c.a.a(str);
                        if (e6.a.c(a(this.f38165a, strB))) {
                            i10 = 4;
                        }
                    } else {
                        i10 = 1;
                    }
                    this.f38167c = i10;
                    aVarC = u4.d.c(this.f38165a, this.f38166b.c());
                    context = this.f38165a;
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
                        z11 = true;
                    }
                    if (z11 && h.c(context)) {
                        new s4.b(context.getFilesDir().getAbsolutePath() + "/log/ap", aVarC).b();
                    }
                    return this.f38167c;
                }
                h.a(this.f38165a, cVarB.b());
                h.d(this.f38165a, cVarB.a());
                h.e(this.f38165a, cVarB.f141575g);
                h.a(this.f38165a, cVarB.f141576h);
                h.f(this.f38165a, cVarB.f141577i);
                h.g(this.f38165a, cVarB.f141579k);
                i.c(e.b(this.f38165a, map));
                i.a(strB, cVarB.f141572d);
                i.b(cVarB.f141571c);
                i.d(cVarB.f141578j);
                String strB4 = e6.a.b(map, "tid", "");
                if (!e6.a.f(strB4) || e6.a.d(strB4, i.d())) {
                    strB4 = i.d();
                } else {
                    i.e(strB4);
                }
                i.e(strB4);
                String strB5 = e6.a.b(map, "utdid", "");
                if (!e6.a.f(strB5) || e6.a.d(strB5, i.e())) {
                    strB5 = i.e();
                } else {
                    i.f(strB5);
                }
                i.f(strB5);
                i.a();
                d.a(this.f38165a, i.g());
                d.a();
                com.alipay.apmobilesecuritysdk.e.a.a(this.f38165a, new b(i.b(), i.c(), i.f()));
                com.alipay.apmobilesecuritysdk.e.a.a();
                g.a(this.f38165a, strB, i.a(strB));
                g.a();
                h.a(this.f38165a, strB, System.currentTimeMillis());
            }
            i10 = 0;
            this.f38167c = i10;
            aVarC = u4.d.c(this.f38165a, this.f38166b.c());
            context = this.f38165a;
            ConnectivityManager connectivityManager2 = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager2 != null) {
            }
            if (activeNetworkInfo != null) {
                z11 = true;
            }
            if (z11) {
                new s4.b(context.getFilesDir().getAbsolutePath() + "/log/ap", aVarC).b();
            }
        } catch (Exception e10) {
            com.alipay.apmobilesecuritysdk.c.a.a(e10);
        }
        return this.f38167c;
    }
}
