package com.tencent.qimei.r;

import android.content.Context;
import androidx.annotation.n0;
import com.tencent.qimei.sdk.Qimei;
import java.util.Calendar;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: QimeiUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: compiled from: QimeiUtil.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f101426a = 23;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f101427b = 50;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f101428c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f101429d = 10;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f101430e = 60;
    }

    public static int a(String str) {
        return d.a(str).a();
    }

    public static void a() {
        if (com.tencent.qimei.d.a.g()) {
            com.tencent.qimei.m.b.b().a("");
        }
    }

    public static void a(long j10, String str) {
        com.tencent.qimei.k.f.b(str).a("q_s_t", j10);
    }

    public static void a(String str, a aVar) {
        int i10;
        int i11 = aVar.f101426a;
        int i12 = aVar.f101428c;
        if (i11 > i12) {
            i10 = (1440 - ((i11 * 60) + aVar.f101427b)) + (i12 * 60) + aVar.f101429d;
        } else {
            i10 = i11 < i12 ? ((i12 * 60) + aVar.f101429d) - ((i11 * 60) + aVar.f101427b) : aVar.f101429d - aVar.f101427b;
        }
        int i13 = i10 * 60 * 1000;
        int iIdentityHashCode = System.identityHashCode(new Object());
        int iNextInt = new Random(iIdentityHashCode).nextInt(aVar.f101430e * 60 * 1000);
        int i14 = i13 + iNextInt + 1;
        d.a(str).a(i14);
        com.tencent.qimei.n.a.a("seed:%d,random_delay_minu:%d(%d,%d)", Integer.valueOf(iIdentityHashCode), Integer.valueOf(i14), Integer.valueOf(i13), Integer.valueOf(iNextInt));
    }

    public static synchronized void a(String str, String str2) {
        if (com.tencent.qimei.d.a.g()) {
            JSONObject jSONObjectF = f(str);
            try {
                jSONObjectF.put(str, str2);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            String string = jSONObjectF.toString();
            com.tencent.qimei.m.b.b().a(string);
            a(System.currentTimeMillis(), str);
            com.tencent.qimei.n.a.b("QIMEI", "Qimei成功更新到本地: %s (appKey: %s)", string, str);
        }
    }

    public static boolean a(String str, Context context) {
        if (com.tencent.qimei.v.d.a(str).v()) {
            return com.tencent.qimei.d.a.b(context);
        }
        com.tencent.qimei.n.a.a("[AppInfo] current collect ProcessInfo be refused!", new Object[0]);
        return false;
    }

    public static String b(String str) {
        int iA = a(str);
        if (iA != 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("delay", String.valueOf(iA));
                return jSONObject.toString();
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return "";
    }

    public static boolean b(String str, Context context) {
        int i10 = Calendar.getInstance().get(11);
        int i11 = Calendar.getInstance().get(12);
        a aVar = new a();
        String strF = com.tencent.qimei.v.d.a(str).f();
        boolean z10 = false;
        if (strF.length() == 14) {
            try {
                aVar.f101426a = Integer.parseInt(strF.substring(0, 2));
                aVar.f101427b = Integer.parseInt(strF.substring(3, 5));
                aVar.f101428c = Integer.parseInt(strF.substring(6, 8));
                aVar.f101429d = Integer.parseInt(strF.substring(9, 11));
                aVar.f101430e = Integer.parseInt(strF.substring(12));
            } catch (Exception unused) {
                aVar = new a();
            }
        }
        if ((i10 == aVar.f101426a && i11 >= aVar.f101427b) || (i10 == aVar.f101428c && i11 <= aVar.f101429d)) {
            z10 = !a(str, context);
        }
        if (z10) {
            a(str, aVar);
        }
        return z10;
    }

    public static Qimei c(String str) {
        if (i(str)) {
            return null;
        }
        return d.a(str).c();
    }

    @n0
    public static String d(String str) {
        JSONObject jSONObjectF = f(str);
        com.tencent.qimei.n.a.b("SDK_INIT ｜ 本地加密", " 获取存储Qimei:%s ", jSONObjectF.toString());
        return jSONObjectF.optString(str);
    }

    public static String e(String str) {
        return com.tencent.qimei.m.b.b().a(new o(str));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    @n0
    public static JSONObject f(String str) {
        JSONObject jSONObject;
        String strE = e(str);
        if (strE != null) {
            try {
                if (strE.isEmpty()) {
                    jSONObject = null;
                } else {
                    jSONObject = new JSONObject(strE);
                }
            } catch (NullPointerException e10) {
                e10.printStackTrace();
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        } else {
            jSONObject = null;
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static String g(String str) {
        if (i(str)) {
            return null;
        }
        return d.a(str).d();
    }

    public static boolean h(String str) {
        long jC = com.tencent.qimei.k.f.b(str).c("q_s_t");
        return 0 != jC && com.tencent.qimei.d.a.b() > jC;
    }

    public static boolean i(String str) {
        return str == null || str.isEmpty() || com.tencent.qimei.u.d.b().F() == null;
    }

    public static boolean j(String str) {
        long jC = com.tencent.qimei.k.f.b(str).c("q_s_t");
        boolean zA = com.tencent.qimei.l.c.a(jC);
        if (zA) {
            com.tencent.qimei.n.a.b("SDK_INIT ｜ QIMEI", "距离上次请求Qimei超过24小时", new Object[0]);
        }
        com.tencent.qimei.n.a.a("[qimei] lastUpdateQimei time: " + jC + ", isOver24h: " + zA, new Object[0]);
        return zA;
    }

    public static boolean k(String str) {
        if (com.tencent.qimei.v.d.a(str).j()) {
            com.tencent.qimei.n.a.b("SDK_INIT ｜ QIMEI", "强制更新Qimei", new Object[0]);
            return true;
        }
        Qimei qimeiC = c(str);
        if (qimeiC != null && !qimeiC.isEmpty()) {
            return false;
        }
        com.tencent.qimei.n.a.b("SDK_INIT ｜ QIMEI", "Qimei为空，需要更新Qimei", new Object[0]);
        return true;
    }

    public static boolean l(String str) {
        return j(str) || com.tencent.qimei.d.a.c(str);
    }

    public static Qimei m(String str) {
        String strD = d(str);
        if (strD == null || strD.isEmpty()) {
            return null;
        }
        Qimei qimeiA = e.b.a(strD);
        qimeiA.setAppKey(str);
        return qimeiA;
    }
}
