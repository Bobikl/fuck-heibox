package com.alibaba.sdk.android.httpdns.d;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.utils.AlicloudTracker;
import com.alibaba.sdk.android.utils.AlicloudTrackerManager;
import com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f37921b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AlicloudTracker f37922a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private AlicloudTrackerManager f28a;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f37923q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f37924r = false;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private a f29b = new a();

    private b(Context context) {
        this.f37922a = null;
        this.f28a = null;
        if (context == null || !(context.getApplicationContext() instanceof Application)) {
            return;
        }
        AlicloudTrackerManager alicloudTrackerManager = AlicloudTrackerManager.getInstance((Application) context.getApplicationContext());
        this.f28a = alicloudTrackerManager;
        if (alicloudTrackerManager != null) {
            this.f37922a = alicloudTrackerManager.getTracker("httpdns", "1.3.2.3-no-bssid-ssid");
        }
    }

    public static b a() {
        return f37921b;
    }

    public static b a(Context context) {
        if (f37921b == null) {
            synchronized (b.class) {
                if (f37921b == null) {
                    f37921b = new b(context);
                }
            }
        }
        return f37921b;
    }

    public void a(String str, int i10, int i11, int i12) {
        String str2;
        if (!this.f37923q) {
            str2 = "report is disabled";
        } else {
            if (this.f37922a == null) {
                Log.e("HttpDns:ReportManager", "report http dns succes failed due to tacker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && ((i10 == 0 || i10 == 1) && ((i11 == 0 || i11 == 1) && (i12 == 0 || i12 == 1)))) {
                final HashMap map = new HashMap();
                map.put("host", str);
                map.put("success", String.valueOf(i10));
                map.put("ipv6", String.valueOf(i11));
                map.put("cacheOpen", String.valueOf(i12));
                this.f29b.b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.5
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            b.this.f37922a.sendCustomHit("perf_getip", map);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str2 = "report http dns success failed due to invalid params";
        }
        Log.e("HttpDns:ReportManager", str2);
    }

    public void a(String str, long j10, int i10) {
        String str2;
        if (!this.f37923q) {
            str2 = "report is disabled";
        } else {
            if (this.f37922a == null) {
                Log.e("HttpDns:ReportManager", "report sc request time cost failed due to tacker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && j10 > 0 && (i10 == 0 || i10 == 1)) {
                if (j10 > 30000) {
                    j10 = 30000;
                }
                final HashMap map = new HashMap();
                map.put("scAddr", str);
                map.put("cost", String.valueOf(j10));
                map.put("ipv6", String.valueOf(i10));
                this.f29b.b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            b.this.f37922a.sendCustomHit("perf_sc", map);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str2 = "report sc request time cost failed due to invalid params";
        }
        Log.e("HttpDns:ReportManager", str2);
    }

    public void a(String str, String str2, String str3) {
        String str4;
        if (!this.f37923q) {
            str4 = "report is disabled";
        } else {
            if (this.f37922a == null) {
                Log.e("HttpDns:ReportManager", "report sniffer failed due to tracker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                final HashMap map = new HashMap();
                map.put("host", str);
                map.put("scAddr", str2);
                map.put("srvAddr", str3);
                this.f29b.b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.8
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            b.this.f37922a.sendCustomHit("biz_sniffer", map);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str4 = "report sniffer failed due to missing params";
        }
        Log.e("HttpDns:ReportManager", str4);
    }

    public void a(String str, String str2, String str3, int i10) {
        String str4;
        if (!this.f37923q) {
            str4 = "report is disabled";
        } else {
            if (this.f37922a == null) {
                Log.e("HttpDns:ReportManager", "report error sc failed due to tacker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && (i10 == 0 || i10 == 1)) {
                final HashMap map = new HashMap();
                map.put("scAddr", str);
                map.put(i7.a.i.f119320o, str2);
                map.put("errMsg", str3);
                map.put("ipv6", String.valueOf(i10));
                this.f29b.b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.13
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            b.this.f37922a.sendCustomHit("err_sc", map);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str4 = "report error sc failed, due to invalid params";
        }
        Log.e("HttpDns:ReportManager", str4);
    }

    public void a(String str, String str2, String str3, int i10, int i11) {
        try {
            if (!this.f37923q) {
                Log.e("HttpDns:ReportManager", "report is disabled");
                return;
            }
            if (this.f37922a == null) {
                Log.e("HttpDns:ReportManager", "report error http dns request failed due to tacker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && ((i10 == 0 || i10 == 1) && (i11 == 0 || i11 == 1))) {
                final HashMap map = new HashMap();
                map.put("srvAddr", str);
                map.put(i7.a.i.f119320o, str2);
                map.put("errMsg", str3);
                map.put("ipv6", String.valueOf(i10));
                map.put("ipv6_srv", String.valueOf(i11));
                this.f29b.b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.14
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            b.this.f37922a.sendCustomHit("err_srv", map);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            Log.e("HttpDns:ReportManager", "report error http dns request failed, due to invalid params");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(String str, String str2, String str3, long j10, long j11, int i10) {
        String str4;
        if (!this.f37923q) {
            str4 = "report is disabled";
        } else {
            if (this.f37922a == null) {
                Log.e("HttpDns:ReportManager", "report ip selection failed due to tacker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && i10 > 0) {
                if (j10 > 5000) {
                    j10 = 5000;
                }
                if (j11 > 5000) {
                    j11 = 5000;
                }
                final HashMap map = new HashMap();
                map.put("host", str);
                map.put("defaultIp", str2);
                map.put("selectedIp", str3);
                map.put("defaultIpCost", String.valueOf(j10));
                map.put("selectedIpCost", String.valueOf(j11));
                map.put("ipCount", String.valueOf(i10));
                this.f29b.b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.7
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            b.this.f37922a.sendCustomHit("perf_ipselection", map);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str4 = "report ip selection failed due to invalid params";
        }
        Log.e("HttpDns:ReportManager", str4);
    }

    public boolean a(SDKMessageCallback sDKMessageCallback) {
        try {
            AlicloudTrackerManager alicloudTrackerManager = this.f28a;
            if (alicloudTrackerManager != null) {
                return alicloudTrackerManager.registerCrashDefend("httpdns", "1.3.2.3-no-bssid-ssid", 2, 7, sDKMessageCallback);
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public void b(String str, int i10, int i11, int i12) {
        String str2;
        if (!this.f37923q) {
            str2 = "report is disabled";
        } else {
            if (this.f37922a == null) {
                Log.e("HttpDns:ReportManager", "report http dns succes failed due to tacker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && ((i10 == 0 || i10 == 1) && ((i11 == 0 || i11 == 1) && (i12 == 0 || i12 == 1)))) {
                final HashMap map = new HashMap();
                map.put("host", str);
                map.put("success", String.valueOf(i10));
                map.put("ipv6", String.valueOf(i11));
                map.put("cacheOpen", String.valueOf(i12));
                this.f29b.b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.6
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            b.this.f37922a.sendCustomHit("perf_user_getip", map);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str2 = "report http dns success failed due to invalid params";
        }
        Log.e("HttpDns:ReportManager", str2);
    }

    public void b(String str, long j10, int i10) {
        String str2;
        if (!this.f37923q) {
            str2 = "report is disabled";
        } else {
            if (this.f37922a == null) {
                Log.e("HttpDns:ReportManager", "report http dns request time cost failed due to tacker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && j10 > 0 && (i10 == 0 || i10 == 1)) {
                if (j10 > 30000) {
                    j10 = 30000;
                }
                final HashMap map = new HashMap();
                map.put("srvAddr", str);
                map.put("cost", String.valueOf(j10));
                map.put("ipv6", String.valueOf(i10));
                this.f29b.b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.4
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            b.this.f37922a.sendCustomHit("perf_srv", map);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str2 = "report http dns request time cost failed due to invalid param";
        }
        Log.e("HttpDns:ReportManager", str2);
    }

    public void b(String str, String str2, String str3) {
        String str4;
        if (!this.f37923q) {
            str4 = "report is disabled";
        } else {
            if (this.f37922a == null) {
                Log.e("HttpDns:ReportManager", "report local disable failed due to tracker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                final HashMap map = new HashMap();
                map.put("host", str);
                map.put("scAddr", str2);
                map.put("srvAddr", str3);
                this.f29b.b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.9
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            b.this.f37922a.sendCustomHit("biz_local_disable", map);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str4 = "report local disable failed due to missing params";
        }
        Log.e("HttpDns:ReportManager", str4);
    }

    public void c(int i10) {
        String str;
        if (!this.f37923q) {
            str = "report is disabled";
        } else if (this.f37922a == null) {
            Log.e("HttpDns:ReportManager", "report cache failed due to tracker is null");
            return;
        } else {
            if (i10 == 0 || i10 == 1) {
                final HashMap map = new HashMap();
                map.put("enable", String.valueOf(i10));
                this.f29b.b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.10
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            b.this.f37922a.sendCustomHit("biz_cache", map);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str = "report cache failed, due to invalid param enable, enable can only be 0 or 1";
        }
        Log.e("HttpDns:ReportManager", str);
    }

    public void d(int i10) {
        String str;
        if (!this.f37923q) {
            str = "report is disabled";
        } else if (this.f37922a == null) {
            Log.e("HttpDns:ReportManager", "report set expired ip enabled failed due to tracker is null");
            return;
        } else {
            if (i10 == 0 || i10 == 1) {
                final HashMap map = new HashMap();
                map.put("enable", String.valueOf(i10));
                this.f29b.b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.11
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            b.this.f37922a.sendCustomHit("biz_expired_ip", map);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str = "report set expired ip enabled failed, due to invalid param enable, enable can only be 0 or 1";
        }
        Log.e("HttpDns:ReportManager", str);
    }

    public void e(int i10) {
        try {
            if (!this.f37923q) {
                Log.e("HttpDns:ReportManager", "report is disabled");
                return;
            }
            if (this.f37922a == null) {
                Log.e("HttpDns:ReportManager", "report ipv6 failed due to tracker is null");
                return;
            }
            if (i10 != 0 && i10 != 1) {
                Log.e("HttpDns:ReportManager", "report ipv6 failed, due to invalid param enable, enable can only be 0 or 1");
                return;
            }
            final HashMap map = new HashMap();
            map.put("enable", String.valueOf(i10));
            this.f29b.b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.12
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        b.this.f37922a.sendCustomHit("biz_ipv6_enable", map);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            });
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void e(boolean z10) {
        synchronized (b.class) {
            if (!this.f37924r) {
                this.f37923q = z10;
            }
        }
    }

    public void k() {
        synchronized (b.class) {
            this.f37924r = true;
            this.f37923q = false;
        }
    }

    public void k(String str) {
        String str2;
        if (!this.f37923q) {
            str2 = "report is disabled";
        } else if (this.f37922a == null) {
            Log.e("HttpDns:ReportManager", "report uncaught exception failed due to tacker is null");
            return;
        } else {
            if (!TextUtils.isEmpty(str)) {
                final HashMap map = new HashMap();
                map.put("exception", str);
                this.f29b.b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            b.this.f37922a.sendCustomHit("err_uncaught_exception", map);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str2 = "report uncaught exception failed due to exception msg is null";
        }
        Log.e("HttpDns:ReportManager", str2);
    }

    public void l() {
        if (!this.f37923q) {
            Log.e("HttpDns:ReportManager", "report is disabled");
        } else if (this.f37922a != null) {
            this.f29b.b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        b.this.f37922a.sendCustomHit("biz_active", null);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            });
        } else {
            Log.e("HttpDns:ReportManager", "report sdk start failed due to tracker is null");
        }
    }

    public void setAccountId(String str) {
        AlicloudTracker alicloudTracker = this.f37922a;
        if (alicloudTracker != null) {
            alicloudTracker.setGlobalProperty("accountId", str);
        } else {
            Log.e("HttpDns:ReportManager", "tracker null, set global properties failed");
        }
    }
}
