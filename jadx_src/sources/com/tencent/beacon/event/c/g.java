package com.tencent.beacon.event.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import androidx.annotation.n0;
import com.tencent.beacon.event.open.EventType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: LogIDGenerator.java */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, g> f99077a = new ConcurrentHashMap(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f99078b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Context f99089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f99090n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f99092p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f99096t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f99097u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f99098v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f99099w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f99100x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f99101y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private SharedPreferences f99102z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f99079c = "normal_log_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f99080d = "realtime_log_id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f99081e = "immediate_log_id";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f99082f = "normal_min_log_id";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f99083g = "normal_max_log_id";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f99084h = "realtime_min_log_id";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f99085i = "realtime_max_log_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f99086j = "immediate_min_log_id";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f99087k = "immediate_max_log_id";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f99088l = "on_date";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<String> f99091o = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AtomicLong f99093q = new AtomicLong(0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AtomicLong f99094r = new AtomicLong(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AtomicLong f99095s = new AtomicLong(0);
    private final Runnable A = new e(this);
    private boolean B = false;

    private g(Context context, String str) {
        this.f99089m = context;
        this.f99090n = str;
    }

    private long a(EventType eventType) {
        switch (f.f99076a[eventType.ordinal()]) {
            case 1:
            case 2:
                return this.f99093q.incrementAndGet();
            case 3:
            case 4:
                return this.f99094r.incrementAndGet();
            case 5:
            case 6:
                return this.f99095s.incrementAndGet();
            default:
                return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SharedPreferences a(Context context) {
        if (this.f99102z == null) {
            this.f99102z = context.getSharedPreferences("new_b_log_ID_" + com.tencent.beacon.a.c.b.c(context) + lg.a.f131412e + this.f99090n, 0);
        }
        return this.f99102z;
    }

    public static synchronized g a(Context context, @n0 String str) {
        g gVar;
        Map<String, g> map = f99077a;
        gVar = map.get(str);
        if (gVar == null) {
            gVar = new g(context, str);
            map.put(str, gVar);
        }
        return gVar;
    }

    private void a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (d()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f99092p);
            String str6 = "";
            sb2.append("");
            String string = sb2.toString();
            String strC = com.tencent.beacon.a.c.b.c(this.f99089m);
            String packageName = this.f99089m.getPackageName();
            if (this.f99096t == 0) {
                str = "";
            } else {
                str = (this.f99096t - 1) + "";
            }
            if (this.f99097u == 0) {
                str2 = "";
            } else {
                str2 = this.f99097u + "";
            }
            if (this.f99098v == 0) {
                str3 = "";
            } else {
                str3 = (this.f99098v - 1) + "";
            }
            if (this.f99099w == 0) {
                str4 = "";
            } else {
                str4 = this.f99099w + "";
            }
            if (this.f99100x == 0) {
                str5 = "";
            } else {
                str5 = (this.f99100x - 1) + "";
            }
            if (this.f99101y != 0) {
                str6 = this.f99101y + "";
            }
            com.tencent.beacon.a.b.f.e().a("701", "process_name=" + strC + "&real_logid_min=" + str + "&real_logid_max=" + str2 + "&normal_logid_min=" + str3 + "&normal_logid_max=" + str4 + "&immediate_logid_min=" + str5 + "&immediate_logid_max=" + str6 + "&logid_day=" + string.substring(0, string.length() - 3) + "&appkey=" + this.f99090n + "&bundleid=" + packageName);
            e();
        }
    }

    private void a(long j10, EventType eventType) {
        if (eventType == EventType.REALTIME || eventType == EventType.DT_REALTIME) {
            long j11 = this.f99097u;
            this.f99097u = j11 == 0 ? j10 : Math.max(j10, j11);
            long j12 = this.f99096t;
            if (j12 != 0) {
                j10 = Math.min(j10, j12);
            }
            this.f99096t = j10;
            return;
        }
        if (eventType == EventType.NORMAL || eventType == EventType.DT_NORMAL) {
            long j13 = this.f99099w;
            this.f99099w = j13 == 0 ? j10 : Math.max(j10, j13);
            long j14 = this.f99098v;
            if (j14 != 0) {
                j10 = Math.min(j10, j14);
            }
            this.f99098v = j10;
            return;
        }
        if (eventType == EventType.IMMEDIATE_MSF || eventType == EventType.IMMEDIATE_WNS) {
            long j15 = this.f99101y;
            this.f99101y = j15 == 0 ? j10 : Math.max(j10, j15);
            long j16 = this.f99100x;
            if (j16 != 0) {
                j10 = Math.min(j10, j16);
            }
            this.f99100x = j10;
        }
    }

    private void b() {
        f99078b = com.tencent.beacon.a.b.a.a().a(113);
        this.f99091o.add("rqd_model");
        this.f99091o.add("rqd_appresumed");
        c();
    }

    private void c() {
        SharedPreferences sharedPreferencesA = a(this.f99089m);
        this.f99092p = sharedPreferencesA.getLong("on_date", 0L);
        this.f99094r.set(sharedPreferencesA.getLong("realtime_log_id", 0L));
        this.f99093q.set(sharedPreferencesA.getLong("normal_log_id", 0L));
        this.f99096t = sharedPreferencesA.getLong("realtime_min_log_id", 0L);
        this.f99097u = sharedPreferencesA.getLong("realtime_max_log_id", 0L);
        this.f99098v = sharedPreferencesA.getLong("normal_min_log_id", 0L);
        this.f99099w = sharedPreferencesA.getLong("normal_max_log_id", 0L);
        this.f99100x = sharedPreferencesA.getLong("immediate_min_log_id", 0L);
        this.f99101y = sharedPreferencesA.getLong("immediate_max_log_id", 0L);
        com.tencent.beacon.base.util.c.a("[LogID " + this.f99090n + "]", " load LogID from sp, date: %s , realtime: %d, normal: %d, immediate: %d", Long.valueOf(this.f99092p), Long.valueOf(this.f99094r.get()), Long.valueOf(this.f99093q.get()), Long.valueOf(this.f99095s.get()));
    }

    private boolean d() {
        long jC = com.tencent.beacon.base.util.b.c();
        long j10 = this.f99092p;
        return (j10 == 0 || com.tencent.beacon.base.util.b.a(jC, j10)) ? false : true;
    }

    private void e() {
        this.f99096t = this.f99097u + 1;
        this.f99098v = this.f99099w + 1;
        this.f99100x = this.f99101y + 1;
    }

    public synchronized String a(String str, EventType eventType) {
        if (!this.B) {
            b();
            this.B = true;
        }
        if (this.f99091o.contains(str)) {
            return "";
        }
        long jA = a(eventType);
        a();
        this.f99092p = com.tencent.beacon.base.util.b.c();
        a(jA, eventType);
        com.tencent.beacon.base.util.c.a("[stat " + this.f99090n + "]", "type: %s, code: %s, logID: %s.", eventType, str, Long.valueOf(jA));
        f99078b.post(this.A);
        return jA + "";
    }
}
