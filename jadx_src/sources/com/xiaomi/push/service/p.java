package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.o0;
import com.taobao.accs.common.Constants;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.hh;
import com.xiaomi.push.il;
import com.xiaomi.push.ir;
import com.xiaomi.push.is;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile p f108015a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private long f1091a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final Context f1092a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final SharedPreferences f1093a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private final boolean f1099b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private final boolean f1100c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final AtomicInteger f1095a = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f1094a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private volatile boolean f1096a = false;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private String f1097b = null;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private final AtomicInteger f1098b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f108017c = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f1090a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f108016b = -1;

    public static class a {
        public static String a() {
            return "support_wifi_digest";
        }

        public static String a(String str) {
            return String.format("HB_%s", str);
        }

        public static String b() {
            return "record_support_wifi_digest_reported_time";
        }

        public static String b(String str) {
            return String.format("HB_dead_time_%s", str);
        }

        public static String c() {
            return "record_hb_count_start";
        }

        public static String d() {
            return "record_short_hb_count";
        }

        public static String e() {
            return "record_long_hb_count";
        }

        public static String f() {
            return "record_hb_change";
        }

        public static String g() {
            return "record_mobile_ptc";
        }

        public static String h() {
            return "record_wifi_ptc";
        }

        public static String i() {
            return "record_ptc_start";
        }

        public static String j() {
            return "keep_short_hb_effective_time";
        }
    }

    private p(Context context) {
        this.f1092a = context;
        this.f1100c = com.xiaomi.push.j.m521a(context);
        this.f1099b = az.a(context).a(is.IntelligentHeartbeatSwitchBoolean.a(), true);
        SharedPreferences sharedPreferences = context.getSharedPreferences("hb_record", 0);
        this.f1093a = sharedPreferences;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (sharedPreferences.getLong(a.c(), -1L) == -1) {
            sharedPreferences.edit().putLong(a.c(), jCurrentTimeMillis).apply();
        }
        long j10 = sharedPreferences.getLong(a.i(), -1L);
        this.f1091a = j10;
        if (j10 == -1) {
            this.f1091a = jCurrentTimeMillis;
            sharedPreferences.edit().putLong(a.i(), jCurrentTimeMillis).apply();
        }
    }

    private int a() {
        if (TextUtils.isEmpty(this.f1094a)) {
            return -1;
        }
        try {
            return this.f1093a.getInt(a.a(this.f1094a), -1);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static p a(Context context) {
        if (f108015a == null) {
            synchronized (p.class) {
                if (f108015a == null) {
                    f108015a = new p(context);
                }
            }
        }
        return f108015a;
    }

    private void a(String str, String str2, Map<String, String> map) {
        ir irVar = new ir();
        irVar.d(str);
        irVar.c("hb_name");
        irVar.a("hb_channel");
        irVar.a(1L);
        irVar.b(str2);
        irVar.a(false);
        irVar.b(System.currentTimeMillis());
        irVar.g(this.f1092a.getPackageName());
        irVar.e("com.xiaomi.xmsf");
        if (map == null) {
            map = new HashMap<>();
        }
        String str3 = null;
        u uVarM773a = v.m773a(this.f1092a);
        if (uVarM773a != null && !TextUtils.isEmpty(uVarM773a.f1114a)) {
            String[] strArrSplit = uVarM773a.f1114a.split("@");
            if (strArrSplit.length > 0) {
                str3 = strArrSplit[0];
            }
        }
        map.put("uuid", str3);
        map.put(Constants.KEY_MODEL, Build.MODEL);
        Context context = this.f1092a;
        map.put("avc", String.valueOf(com.xiaomi.push.g.a(context, context.getPackageName())));
        map.put("pvc", String.valueOf(BuildConfig.VERSION_CODE));
        map.put("cvc", String.valueOf(48));
        irVar.a(map);
        il ilVarA = il.a(this.f1092a);
        if (ilVarA != null) {
            ilVarA.a(irVar, this.f1092a.getPackageName());
        }
    }

    private void a(boolean z10) {
        if (m751c()) {
            int iIncrementAndGet = (z10 ? this.f1098b : this.f108017c).incrementAndGet();
            Object[] objArr = new Object[2];
            String str = com.meituan.robust.Constants.SHORT;
            objArr[0] = z10 ? com.meituan.robust.Constants.SHORT : com.meituan.robust.Constants.LONG;
            objArr[1] = Integer.valueOf(iIncrementAndGet);
            com.xiaomi.channel.commonutils.logger.b.b(String.format("[HB] %s ping interval count: %s", objArr));
            if (iIncrementAndGet >= 5) {
                String strD = z10 ? a.d() : a.e();
                int i10 = this.f1093a.getInt(strD, 0) + iIncrementAndGet;
                this.f1093a.edit().putInt(strD, i10).apply();
                Object[] objArr2 = new Object[2];
                if (!z10) {
                    str = com.meituan.robust.Constants.LONG;
                }
                objArr2[0] = str;
                objArr2[1] = Integer.valueOf(i10);
                com.xiaomi.channel.commonutils.logger.b.m62a(String.format("[HB] accumulate %s hb count(%s) and write to file. ", objArr2));
                if (z10) {
                    this.f1098b.set(0);
                } else {
                    this.f108017c.set(0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private boolean m750a() {
        return this.f1095a.get() >= Math.max(az.a(this.f1092a).a(is.IntelligentHeartbeatNATCountInt.a(), 5), 3);
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("W-") || str.startsWith("M-");
    }

    private void b(String str) {
        if ("WIFI-ID-UNKNOWN".equals(str)) {
            String str2 = this.f1094a;
            if (str2 == null || !str2.startsWith("W-")) {
                this.f1094a = null;
            }
        } else {
            this.f1094a = str;
        }
        int i10 = this.f1093a.getInt(a.a(this.f1094a), -1);
        long j10 = this.f1093a.getLong(a.b(this.f1094a), -1L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i10 != -1) {
            if (j10 == -1) {
                this.f1093a.edit().putLong(a.b(this.f1094a), jCurrentTimeMillis + d()).apply();
            } else if (jCurrentTimeMillis > j10) {
                this.f1093a.edit().remove(a.a(this.f1094a)).remove(a.b(this.f1094a)).apply();
            }
        }
        this.f1095a.getAndSet(0);
        if (TextUtils.isEmpty(this.f1094a) || a() != -1) {
            this.f1096a = false;
        } else {
            this.f1096a = true;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a(String.format("[HB] network changed, netid:%s, %s", this.f1094a, Boolean.valueOf(this.f1096a)));
    }

    private boolean b() {
        return (TextUtils.isEmpty(this.f1094a) || !this.f1094a.startsWith("M-") || az.a(this.f1092a).a(is.IntelligentHeartbeatUseInMobileNetworkBoolean.a(), false)) ? false : true;
    }

    private long c() {
        return this.f1093a.getLong(a.j(), -1L);
    }

    private void c(String str) {
        if (a(str)) {
            this.f1093a.edit().putInt(a.a(str), 235000).apply();
            this.f1093a.edit().putLong(a.b(this.f1094a), System.currentTimeMillis() + d()).apply();
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private boolean m751c() {
        return m752d() && az.a(this.f1092a).a(is.IntelligentHeartbeatDataCollectSwitchBoolean.a(), true) && com.xiaomi.push.m.China.name().equals(com.xiaomi.push.service.a.a(this.f1092a).a());
    }

    private long d() {
        return az.a(this.f1092a).a(is.ShortHeartbeatEffectivePeriodMsLong.a(), 777600000L);
    }

    private void d(String str) {
        String str2;
        String string;
        if (m751c() && !TextUtils.isEmpty(str)) {
            if (str.startsWith("W-")) {
                str2 = androidx.exifinterface.media.a.T4;
            } else if (!str.startsWith("M-")) {
                return;
            } else {
                str2 = "M";
            }
            String strValueOf = String.valueOf(235000);
            String strValueOf2 = String.valueOf(System.currentTimeMillis() / 1000);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(":::");
            sb2.append(str2);
            sb2.append(":::");
            sb2.append(strValueOf);
            sb2.append(":::");
            sb2.append(strValueOf2);
            String string2 = this.f1093a.getString(a.f(), null);
            if (TextUtils.isEmpty(string2)) {
                string = sb2.toString();
            } else {
                string = string2 + "###" + sb2.toString();
            }
            this.f1093a.edit().putString(a.f(), string).apply();
        }
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    private boolean m752d() {
        return this.f1100c && (this.f1099b || ((c() > System.currentTimeMillis() ? 1 : (c() == System.currentTimeMillis() ? 0 : -1)) >= 0));
    }

    private void e() {
        if (this.f1093a.getBoolean(a.a(), false)) {
            return;
        }
        this.f1093a.edit().putBoolean(a.a(), true).apply();
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    private boolean m753e() {
        long j10 = this.f1093a.getLong(a.c(), -1L);
        if (j10 == -1) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return j10 > jCurrentTimeMillis || jCurrentTimeMillis - j10 >= 259200000;
    }

    private void f() {
        String strG;
        int i10 = this.f1090a;
        if (i10 != 0) {
            strG = i10 != 1 ? null : a.h();
        } else {
            strG = a.g();
        }
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        if (this.f1093a.getLong(a.i(), -1L) == -1) {
            this.f1091a = System.currentTimeMillis();
            this.f1093a.edit().putLong(a.i(), this.f1091a).apply();
        }
        this.f1093a.edit().putInt(strG, this.f1093a.getInt(strG, 0) + 1).apply();
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    private boolean m754f() {
        if (this.f1091a == -1) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f1091a;
        return j10 > jCurrentTimeMillis || jCurrentTimeMillis - j10 >= 259200000;
    }

    private void g() {
        int i10;
        String[] strArrSplit;
        String[] strArrSplit2;
        if (m751c()) {
            String string = this.f1093a.getString(a.f(), null);
            char c10 = 1;
            char c11 = 0;
            if (!TextUtils.isEmpty(string) && (strArrSplit = string.split("###")) != null) {
                int i11 = 0;
                while (i11 < strArrSplit.length) {
                    if (!TextUtils.isEmpty(strArrSplit[i11]) && (strArrSplit2 = strArrSplit[i11].split(":::")) != null && strArrSplit2.length >= 4) {
                        String str = strArrSplit2[c11];
                        String str2 = strArrSplit2[c10];
                        String str3 = strArrSplit2[2];
                        String str4 = strArrSplit2[3];
                        HashMap map = new HashMap();
                        map.put(o0.I0, "change");
                        map.put(Constants.KEY_MODEL, Build.MODEL);
                        map.put("net_type", str2);
                        map.put("net_name", str);
                        map.put(com.umeng.analytics.pro.ak.aT, str3);
                        map.put("timestamp", str4);
                        a("category_hb_change", null, map);
                        com.xiaomi.channel.commonutils.logger.b.m62a("[HB] report hb changed events.");
                    }
                    i11++;
                    c10 = 1;
                    c11 = 0;
                }
                this.f1093a.edit().remove(a.f()).apply();
            }
            if (this.f1093a.getBoolean(a.a(), false)) {
                long j10 = this.f1093a.getLong(a.b(), 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - j10 > 1296000000) {
                    HashMap map2 = new HashMap();
                    map2.put(o0.I0, "support");
                    map2.put(Constants.KEY_MODEL, Build.MODEL);
                    map2.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
                    a("category_hb_change", null, map2);
                    com.xiaomi.channel.commonutils.logger.b.m62a("[HB] report support wifi digest events.");
                    this.f1093a.edit().putLong(a.b(), jCurrentTimeMillis).apply();
                }
            }
            if (m753e()) {
                int i12 = this.f1093a.getInt(a.d(), 0);
                int i13 = this.f1093a.getInt(a.e(), 0);
                if (i12 > 0 || i13 > 0) {
                    long j11 = this.f1093a.getLong(a.c(), -1L);
                    String strValueOf = String.valueOf(235000);
                    String strValueOf2 = String.valueOf(j11);
                    String strValueOf3 = String.valueOf(System.currentTimeMillis());
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(com.umeng.analytics.pro.ak.aT, strValueOf);
                        jSONObject.put("c_short", String.valueOf(i12));
                        jSONObject.put("c_long", String.valueOf(i13));
                        jSONObject.put("count", String.valueOf(i12 + i13));
                        jSONObject.put(com.umeng.analytics.pro.d.f104709p, strValueOf2);
                        jSONObject.put(com.umeng.analytics.pro.d.f104710q, strValueOf3);
                        String string2 = jSONObject.toString();
                        HashMap map3 = new HashMap();
                        map3.put(o0.I0, "long_and_short_hb_count");
                        a("category_hb_count", string2, map3);
                        com.xiaomi.channel.commonutils.logger.b.m62a("[HB] report short/long hb count events.");
                    } catch (Throwable unused) {
                    }
                }
                this.f1093a.edit().putInt(a.d(), 0).putInt(a.e(), 0).putLong(a.c(), System.currentTimeMillis()).apply();
            }
            if (m754f()) {
                String strValueOf4 = String.valueOf(this.f1091a);
                String strValueOf5 = String.valueOf(System.currentTimeMillis());
                int i14 = this.f1093a.getInt(a.g(), 0);
                if (i14 > 0) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("net_type", "M");
                        jSONObject2.put("ptc", i14);
                        jSONObject2.put(com.umeng.analytics.pro.d.f104709p, strValueOf4);
                        jSONObject2.put(com.umeng.analytics.pro.d.f104710q, strValueOf5);
                        String string3 = jSONObject2.toString();
                        HashMap map4 = new HashMap();
                        map4.put(o0.I0, "ptc_event");
                        a("category_lc_ptc", string3, map4);
                        com.xiaomi.channel.commonutils.logger.b.m62a("[HB] report ping timeout count events of mobile network.");
                        this.f1093a.edit().putInt(a.g(), 0).apply();
                    } catch (Throwable unused2) {
                        i10 = 0;
                        this.f1093a.edit().putInt(a.g(), 0).apply();
                    }
                }
                i10 = 0;
                int i15 = this.f1093a.getInt(a.h(), i10);
                if (i15 > 0) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("net_type", androidx.exifinterface.media.a.T4);
                        jSONObject3.put("ptc", i15);
                        jSONObject3.put(com.umeng.analytics.pro.d.f104709p, strValueOf4);
                        jSONObject3.put(com.umeng.analytics.pro.d.f104710q, strValueOf5);
                        String string4 = jSONObject3.toString();
                        HashMap map5 = new HashMap();
                        map5.put(o0.I0, "ptc_event");
                        a("category_lc_ptc", string4, map5);
                        com.xiaomi.channel.commonutils.logger.b.m62a("[HB] report ping timeout count events of wifi network.");
                    } catch (Throwable unused3) {
                    }
                    this.f1093a.edit().putInt(a.h(), 0).apply();
                }
                this.f1091a = System.currentTimeMillis();
                this.f1093a.edit().putLong(a.i(), this.f1091a).apply();
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public long m755a() {
        int iA;
        long jB = hh.b();
        if (this.f1100c && !b() && ((az.a(this.f1092a).a(is.IntelligentHeartbeatSwitchBoolean.a(), true) || c() >= System.currentTimeMillis()) && (iA = a()) != -1)) {
            jB = iA;
        }
        if (!TextUtils.isEmpty(this.f1094a) && !"WIFI-ID-UNKNOWN".equals(this.f1094a) && this.f1090a == 1) {
            a(jB < 300000);
        }
        this.f108016b = jB;
        com.xiaomi.channel.commonutils.logger.b.m62a("[HB] ping interval:" + jB);
        return jB;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m756a() {
    }

    public void a(int i10) {
        this.f1093a.edit().putLong(a.j(), System.currentTimeMillis() + ((long) (i10 * 1000))).apply();
    }

    public synchronized void a(com.xiaomi.push.bj bjVar) {
        if (m752d()) {
            String str = null;
            if (bjVar == null) {
                b(null);
                this.f1090a = -1;
            } else if (bjVar.a() == 0) {
                String strM184b = bjVar.m184b();
                if (!TextUtils.isEmpty(strM184b) && !"UNKNOWN".equalsIgnoreCase(strM184b)) {
                    str = "M-" + strM184b;
                }
                b(str);
                this.f1090a = 0;
            } else if (bjVar.a() == 1 || bjVar.a() == 6) {
                b("WIFI-ID-UNKNOWN");
                this.f1090a = 1;
            } else {
                b(null);
                this.f1090a = -1;
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized void m757a(String str) {
        if (!TextUtils.isEmpty(str)) {
            e();
        }
        if (m752d() && !TextUtils.isEmpty(str)) {
            b("W-" + str);
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public long m758b() {
        return this.f108016b;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m759b() {
        if (m752d()) {
            f();
            if (this.f1096a && !TextUtils.isEmpty(this.f1094a) && this.f1094a.equals(this.f1097b)) {
                this.f1095a.getAndIncrement();
                com.xiaomi.channel.commonutils.logger.b.m62a("[HB] ping timeout count:" + this.f1095a);
                if (m750a()) {
                    com.xiaomi.channel.commonutils.logger.b.m62a("[HB] change hb interval for net:" + this.f1094a);
                    c(this.f1094a);
                    this.f1096a = false;
                    this.f1095a.getAndSet(0);
                    d(this.f1094a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public void m760c() {
        if (m752d()) {
            this.f1097b = this.f1094a;
        }
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public void m761d() {
        if (m752d()) {
            g();
            if (this.f1096a) {
                this.f1095a.getAndSet(0);
            }
        }
    }
}
