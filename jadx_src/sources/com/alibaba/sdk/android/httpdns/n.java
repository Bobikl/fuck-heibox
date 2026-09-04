package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile n f37973a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f37974d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f37975e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f37976g = "https://";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f37977h = null;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public static boolean f37h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37978c;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private boolean f41e;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private int f40e = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private SharedPreferences f38a = null;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private long f42f = 0;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private long f44g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f37979f = 0;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private boolean f43f = false;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private boolean f45g = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f37980i = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Handler f39a = null;

    private n() {
    }

    public static n a() {
        if (f37973a == null) {
            synchronized (n.class) {
                if (f37973a == null) {
                    f37973a = new n();
                }
            }
        }
        return f37973a;
    }

    private void a(String str, long j10) {
        try {
            com.alibaba.sdk.android.httpdns.d.b bVarA = com.alibaba.sdk.android.httpdns.d.b.a();
            if (bVarA != null) {
                bVarA.a(str, j10, com.alibaba.sdk.android.httpdns.d.c.a());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        i.d("update server ips from StartIp schedule center.");
        this.f44g = System.currentTimeMillis();
        this.f40e = 0;
        this.f37979f = 0;
        this.f43f = false;
        this.f41e = true;
        this.f45g = true;
        f37h = false;
        m.a().a(f.f37958b.length - 1);
        c.a().submit(m.a());
        this.f39a = null;
    }

    private void d(Throwable th2) {
        try {
            com.alibaba.sdk.android.httpdns.d.b bVarA = com.alibaba.sdk.android.httpdns.d.b.a();
            if (bVarA != null) {
                int iA = com.alibaba.sdk.android.httpdns.d.c.a(th2);
                bVarA.a(m28d(), String.valueOf(iA), th2.getMessage(), com.alibaba.sdk.android.httpdns.d.c.a());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private String e() {
        return (this.f41e || this.f43f) ? f.f37958b[this.f37979f] : f.f32a[this.f40e];
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    private void m27e() {
        int i10 = this.f40e;
        this.f40e = i10 < f.f32a.length + (-1) ? i10 + 1 : 0;
    }

    private void f() {
        int i10 = this.f37979f;
        this.f37979f = i10 < f.f37958b.length + (-1) ? i10 + 1 : 0;
    }

    synchronized void a(Context context, String str) {
        try {
            if (!f37974d) {
                synchronized (n.class) {
                    if (!f37974d) {
                        setAccountId(str);
                        if (context != null) {
                            this.f38a = context.getSharedPreferences("httpdns_config_cache", 0);
                        }
                        this.f41e = this.f38a.getBoolean("httpdns_first_start", true);
                        f37977h = this.f38a.getString("httpdns_server_ips", null);
                        this.f37980i = this.f38a.getString("httpdns_region", null);
                        String str2 = f37977h;
                        if (str2 != null) {
                            f.a(str2.split(";"));
                        }
                        long j10 = this.f38a.getLong("schedule_center_last_request_time", 0L);
                        f37975e = j10;
                        if (j10 == 0 || System.currentTimeMillis() - f37975e >= 86400000) {
                            t.a().c(false);
                            c();
                        }
                        f37974d = true;
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    synchronized void a(o oVar, long j10) {
        try {
            a(m28d(), j10);
            this.f40e = 0;
            this.f37979f = 0;
            this.f43f = false;
            this.f45g = true;
            HttpDns.switchDnsService(oVar.isEnabled());
            if (a(oVar.b())) {
                i.d("StartIp Scheduler center update success    StartIp isFirstStart：" + this.f41e);
                f37h = true;
                this.f42f = System.currentTimeMillis();
                u.i();
                if (this.f41e) {
                    SharedPreferences.Editor editorEdit = this.f38a.edit();
                    editorEdit.putBoolean("httpdns_first_start", false);
                    editorEdit.commit();
                    this.f41e = false;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    synchronized boolean a(String[] strArr) {
        try {
            if (!f.a(strArr)) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            for (String str : strArr) {
                sb2.append(str);
                sb2.append(";");
            }
            sb2.deleteCharAt(sb2.length() - 1);
            SharedPreferences sharedPreferences = this.f38a;
            if (sharedPreferences == null) {
                return false;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("httpdns_server_ips", sb2.toString());
            editorEdit.putLong("schedule_center_last_request_time", System.currentTimeMillis());
            editorEdit.commit();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
        throw th;
    }

    synchronized void b(Context context, String str) {
        try {
            if (str.equals(this.f37980i)) {
                i.e("region should be different");
            } else {
                this.f37980i = str;
                if (System.currentTimeMillis() - this.f44g >= 300000) {
                    d();
                } else {
                    long jCurrentTimeMillis = 300000 - (System.currentTimeMillis() - this.f44g);
                    i.e("The call time should be greater than 5 minutes. SDK will initiate an update request after " + (jCurrentTimeMillis / 60000) + " minutes.");
                    if (this.f39a == null) {
                        Handler handler = new Handler();
                        this.f39a = handler;
                        handler.postDelayed(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.n.1
                            @Override // java.lang.Runnable
                            public void run() {
                                n.this.d();
                            }
                        }, jCurrentTimeMillis);
                    }
                }
                if (this.f38a == null) {
                    if (context == null) {
                        i.f("sp failed to save, does not affect the current settings");
                        return;
                    }
                    this.f38a = context.getSharedPreferences("httpdns_config_cache", 0);
                }
                SharedPreferences.Editor editorEdit = this.f38a.edit();
                editorEdit.putString("httpdns_region", this.f37980i);
                editorEdit.putBoolean("httpdns_first_start", true);
                editorEdit.putLong("schedule_center_last_request_time", 0L);
                editorEdit.commit();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    synchronized void c() {
        m mVarA;
        int length;
        if (System.currentTimeMillis() - this.f42f >= 300000) {
            i.d("update server ips from StartIp schedule center.");
            this.f40e = 0;
            this.f37979f = 0;
            this.f43f = false;
            this.f45g = true;
            f37h = false;
            if (this.f41e) {
                mVarA = m.a();
                length = f.f37958b.length;
            } else {
                mVarA = m.a();
                length = f.f32a.length;
            }
            mVarA.a(length - 1);
            c.a().submit(m.a());
        } else {
            i.d("update server ips from StartIp schedule center too often, give up. ");
            u.j();
        }
    }

    synchronized void c(Throwable th2) {
        try {
            f37h = false;
            d(th2);
            if (this.f41e) {
                f();
            } else {
                if (!this.f43f) {
                    m27e();
                }
                if (this.f40e == 0) {
                    this.f43f = true;
                    if (this.f45g) {
                        this.f45g = false;
                        this.f37979f = 0;
                        i.d("StartIp Scheduler center update from StartIp");
                        m.a().a(f.f37958b.length - 1);
                        c.a().submit(m.a());
                    } else {
                        f();
                        if (this.f37979f == 0) {
                            this.f42f = System.currentTimeMillis();
                            i.f("StartIp Scheduler center update failed");
                            u.j();
                        }
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    synchronized String m28d() {
        StringBuilder sb2;
        String str;
        try {
            sb2 = new StringBuilder();
            sb2.append(f37976g);
            sb2.append(e());
            sb2.append("/");
            String str2 = this.f37978c;
            if (str2 == null) {
                str2 = f.f37959c;
            }
            sb2.append(str2);
            sb2.append("/ss?platform=android&sdk_version=");
            sb2.append("1.3.2.3-no-bssid-ssid");
            sb2.append("&sid=");
            sb2.append(com.alibaba.sdk.android.httpdns.e.a.a().getSessionId());
            sb2.append("&net=");
            sb2.append(com.alibaba.sdk.android.httpdns.e.a.a().l());
            if (TextUtils.isEmpty(this.f37980i)) {
                str = "";
            } else {
                str = "&region=" + this.f37980i;
            }
            sb2.append(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
        return sb2.toString();
    }

    public void setAccountId(String str) {
        this.f37978c = str;
    }
}
