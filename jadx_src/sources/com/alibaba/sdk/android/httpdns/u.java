package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.mipush.sdk.Constants;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SharedPreferences f38022a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static a f52a = a.ENABLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f38023d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f38024e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile int f38025g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile int f38026h = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f38027l = false;

    public enum a {
        ENABLE,
        PRE_DISABLE,
        DISABLE
    }

    static synchronized String a(s sVar) {
        try {
            s sVar2 = s.QUERY_HOST;
            if (sVar != sVar2 && sVar != s.SNIFF_HOST) {
                return (sVar == s.QUERY_SCHEDULE_CENTER || sVar == s.SNIFF_SCHEDULE_CENTER) ? null : null;
            }
            if (f52a == a.ENABLE || f52a == a.PRE_DISABLE) {
                return f.f32a[f38025g];
            }
            if (sVar == sVar2) {
                return null;
            }
            return f.f32a[f38025g];
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    static synchronized void a(Context context) {
        if (!f38023d) {
            synchronized (u.class) {
                if (!f38023d) {
                    if (context != null) {
                        f38022a = context.getSharedPreferences("httpdns_config_cache", 0);
                    }
                    f38027l = f38022a.getBoolean("status", false);
                    f38025g = f38022a.getInt("activiate_ip_index", 0);
                    f38026h = f38025g;
                    f38024e = f38022a.getLong("disable_modified_time", 0L);
                    if (System.currentTimeMillis() - f38024e >= 86400000) {
                        d(false);
                    }
                    f52a = f38027l ? a.DISABLE : a.ENABLE;
                    f38023d = true;
                }
            }
        }
    }

    static synchronized void a(String str, String str2, long j10) {
        try {
            b(str, str2, j10);
            reportHttpDnsSuccess(str, 1);
            a aVar = f52a;
            a aVar2 = a.ENABLE;
            if (aVar != aVar2 && str2 != null && str2.equals(f.f32a[f38025g])) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f52a == a.DISABLE ? "Disable " : "Pre_disable ");
                sb2.append("mode finished. Enter enable mode.");
                i.f(sb2.toString());
                f52a = aVar2;
                d(false);
                t.a().g();
                f38026h = f38025g;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    static synchronized void a(String str, String str2, Throwable th2) {
        try {
            a(str2, th2);
            if (a(th2) && str2 != null && str2.equals(f.f32a[f38025g])) {
                h();
                if (f38026h == f38025g) {
                    t.a().c(false);
                    n.a().c();
                }
                if (f52a == a.ENABLE) {
                    f52a = a.PRE_DISABLE;
                    i.f("enter pre_disable mode");
                } else if (f52a == a.PRE_DISABLE) {
                    f52a = a.DISABLE;
                    i.f("enter disable mode");
                    d(true);
                    h(str);
                    t.a().g(str);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void a(String str, Throwable th2) {
        try {
            com.alibaba.sdk.android.httpdns.d.b bVarA = com.alibaba.sdk.android.httpdns.d.b.a();
            if (bVarA != null) {
                int iA = com.alibaba.sdk.android.httpdns.d.c.a(th2);
                bVarA.a(str, String.valueOf(iA), com.alibaba.sdk.android.httpdns.d.c.m21a(th2), com.alibaba.sdk.android.httpdns.d.c.a(), com.alibaba.sdk.android.httpdns.net64.a.a().i() ? 1 : 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static boolean a(Throwable th2) {
        if (th2 instanceof SocketTimeoutException) {
            return true;
        }
        if (th2 instanceof h) {
            h hVar = (h) th2;
            if (hVar.getErrorCode() == 403 && hVar.getMessage().equals("ServiceLevelDeny")) {
                return true;
            }
        }
        return false;
    }

    static void b(int i10) {
        if (f38022a == null || i10 < 0 || i10 >= f.f32a.length) {
            return;
        }
        f38025g = i10;
        SharedPreferences.Editor editorEdit = f38022a.edit();
        editorEdit.putInt("activiate_ip_index", i10);
        editorEdit.putLong("activiated_ip_index_modified_time", System.currentTimeMillis());
        editorEdit.commit();
    }

    private static void b(String str, String str2, long j10) {
        try {
            com.alibaba.sdk.android.httpdns.d.b bVarA = com.alibaba.sdk.android.httpdns.d.b.a();
            if (bVarA != null) {
                bVarA.b(str2, j10, com.alibaba.sdk.android.httpdns.d.c.a());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    static synchronized void d(boolean z10) {
        if (f38027l != z10) {
            f38027l = z10;
            SharedPreferences sharedPreferences = f38022a;
            if (sharedPreferences != null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean("status", f38027l);
                editorEdit.putLong("disable_modified_time", System.currentTimeMillis());
                editorEdit.commit();
            }
        }
    }

    static synchronized boolean e() {
        return f38027l;
    }

    private static void h() {
        f38025g = f38025g == f.f32a.length + (-1) ? 0 : f38025g + 1;
        b(f38025g);
    }

    private static void h(String str) {
        try {
            com.alibaba.sdk.android.httpdns.d.b bVarA = com.alibaba.sdk.android.httpdns.d.b.a();
            if (bVarA != null) {
                String strM28d = n.a().m28d();
                int length = f38025g;
                if (length == 0) {
                    length = f.f32a.length;
                }
                int i10 = length - 1;
                int length2 = i10 == 0 ? f.f32a.length - 1 : i10 - 1;
                if (i10 >= 0) {
                    String[] strArr = f.f32a;
                    if (i10 >= strArr.length || length2 < 0 || length2 >= strArr.length) {
                        return;
                    }
                    String str2 = strArr[i10];
                    bVarA.b(str, strM28d, strArr[length2] + Constants.ACCEPT_TIME_SEPARATOR_SP + str2);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    static void i() {
        b(0);
        f38026h = f38025g;
        t.a().c(true);
    }

    static void j() {
        t.a().c(true);
    }

    public static void reportHttpDnsSuccess(String str, int i10) {
        try {
            com.alibaba.sdk.android.httpdns.d.b bVarA = com.alibaba.sdk.android.httpdns.d.b.a();
            if (bVarA != null) {
                bVarA.a(str, i10, com.alibaba.sdk.android.httpdns.d.c.a(), com.alibaba.sdk.android.httpdns.b.b.m10a() ? 1 : 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
