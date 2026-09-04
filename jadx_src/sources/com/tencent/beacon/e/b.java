package com.tencent.beacon.e;

import com.google.android.exoplayer2.audio.q0;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* JADX INFO: compiled from: DefaultStrategy.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements com.tencent.beacon.a.a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f98986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f98987b = 48;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f98988c = 2000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f98989d = 48;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f98990e = 5000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f98991f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f98992g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Set<String> f98993h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Map<String, Float> f98994i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f98995j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f98996k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected boolean f98997l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected float f98998m = 1.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f98999n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected boolean f99000o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected boolean f99001p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected int f99002q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected long f99003r = 6400;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected int f99004s = 20;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected int f99005t = 300;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f99006u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected boolean f99007v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected boolean f99008w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int f99009x = 10000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected boolean f99010y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected boolean f99011z = true;
    protected boolean A = false;
    protected int B = 1;

    protected b() {
        com.tencent.beacon.a.a.b.a().a(8, this);
    }

    public static b a() {
        if (f98986a == null) {
            synchronized (b.class) {
                if (f98986a == null) {
                    f98986a = new b();
                }
            }
        }
        return f98986a;
    }

    private void b(Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.put("d_m", new HashMap(map));
        com.tencent.beacon.a.a.b.a().b(new com.tencent.beacon.a.a.c(2, map2));
    }

    @Override // com.tencent.beacon.a.a.d
    public void a(com.tencent.beacon.a.a.c cVar) {
        if (cVar.f98739a != 8) {
            return;
        }
        this.f99007v = cVar.f98740b.containsKey("u_c_a_e") ? ((Boolean) cVar.f98740b.get("u_c_a_e")).booleanValue() : this.f99007v;
        this.f99006u = cVar.f98740b.containsKey("u_c_b_e") ? ((Boolean) cVar.f98740b.get("u_c_b_e")).booleanValue() : this.f99006u;
        this.f99009x = cVar.f98740b.containsKey("u_c_d_s") ? ((Integer) cVar.f98740b.get("u_c_d_s")).intValue() : this.f99009x;
        this.f98991f = cVar.f98740b.containsKey("u_c_p_s") ? ((Boolean) cVar.f98740b.get("u_c_p_s")).booleanValue() : this.f98991f;
    }

    public synchronized void a(Map<String, String> map) {
        if (map != null) {
            try {
                b(map);
                try {
                    this.f98987b = com.tencent.beacon.base.util.b.a(map.get("realtimeUploadNum"), this.f98987b, 24, 100);
                    this.f98988c = com.tencent.beacon.base.util.b.a(map.get("realtimePollingTime"), this.f98988c, 1000, 10000);
                    this.f98990e = com.tencent.beacon.base.util.b.a(map.get("normalPollingTime"), this.f98990e, 2000, 60000);
                    this.f98989d = com.tencent.beacon.base.util.b.a(map.get("normalUploadNum"), this.f98989d, 24, 100);
                    this.f98992g = com.tencent.beacon.base.util.b.a(map.get("heartOnOff"), this.f98992g);
                    this.f98995j = com.tencent.beacon.base.util.b.a(map.get("tidyEF"), this.f98995j);
                    this.f98996k = com.tencent.beacon.base.util.b.a(map.get("lauEveSim"), this.f98996k);
                    this.f98997l = com.tencent.beacon.base.util.b.a(map.get("zeroPeakOnOff"), this.f98997l);
                    String str = map.get("zeroPeakRate");
                    if (str != null) {
                        String strTrim = str.trim();
                        if (strTrim.length() > 0) {
                            String[] strArrSplit = strTrim.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                            if (strArrSplit.length == 2) {
                                try {
                                    this.f98998m = Float.valueOf(strArrSplit[0]).floatValue() / Float.valueOf(strArrSplit[1]).floatValue();
                                } catch (Exception e10) {
                                    com.tencent.beacon.base.util.c.a(e10);
                                }
                            }
                        }
                    }
                    this.A = com.tencent.beacon.base.util.b.a(map.get("straOnOff"), this.A);
                    this.B = com.tencent.beacon.base.util.b.a(map.get("straDayMaxCount"), this.B, 1, Integer.MAX_VALUE);
                    this.f98999n = com.tencent.beacon.base.util.b.a(map.get("acceleEnable"), this.f98999n);
                    this.f99000o = com.tencent.beacon.base.util.b.a(map.get("gyroEnable"), this.f99000o);
                    this.f99001p = com.tencent.beacon.base.util.b.a(map.get("magneticEnable"), this.f99001p);
                    this.f99002q = com.tencent.beacon.base.util.b.a(map.get("gatherCount"), this.f99002q, 1, 50);
                    this.f99003r = com.tencent.beacon.base.util.b.a(map.get("gatherDur"), this.f99003r, 1000L, q0.f44202v);
                    this.f99004s = com.tencent.beacon.base.util.b.a(map.get("hertzCount"), this.f99004s, 20, 100);
                    this.f99005t = com.tencent.beacon.base.util.b.a(map.get("consuming"), this.f99005t, 60, 86400);
                    this.f99006u = com.tencent.beacon.base.util.b.a(map.get("bidEnable"), this.f99006u);
                    this.f99007v = com.tencent.beacon.base.util.b.a(map.get("auditEnable"), this.f99007v);
                    this.f99009x = com.tencent.beacon.base.util.b.a(map.get("maxDBCount"), this.f99009x, 10000, 100000);
                    com.tencent.beacon.base.net.c.b.c(map.get("eventUrl"));
                    com.tencent.beacon.base.net.c.b.e(map.get("strategyUrl"));
                } catch (Exception e11) {
                    com.tencent.beacon.base.util.c.a(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void a(Set<String> set) {
        this.f98993h = set;
    }

    public void a(boolean z10) {
        this.f99008w = z10;
    }

    public synchronized boolean a(String str) {
        boolean zContains;
        zContains = false;
        Set<String> set = this.f98993h;
        if (set != null && set.size() > 0) {
            zContains = this.f98993h.contains(str);
        }
        return zContains;
    }

    public int b() {
        return this.f99009x;
    }

    public synchronized void b(Set<String> set) {
        if (this.f98994i == null) {
            this.f98994i = new HashMap();
        }
        if (set == null) {
            return;
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            if (strArrSplit.length == 3) {
                try {
                    this.f98994i.put(strArrSplit[0].toLowerCase(), Float.valueOf(Float.valueOf(strArrSplit[1]).floatValue() / Float.valueOf(strArrSplit[2]).floatValue()));
                } catch (Exception e10) {
                    com.tencent.beacon.base.util.c.a(e10);
                }
            }
        }
    }

    public synchronized boolean b(String str) {
        Map<String, Float> map = this.f98994i;
        if (map != null && map.get(str.toLowerCase()) != null) {
            return new Random().nextInt(1000) + 1 <= ((int) (this.f98994i.get(str.toLowerCase()).floatValue() * 1000.0f));
        }
        return true;
    }

    public synchronized int c() {
        return this.B;
    }

    public boolean d() {
        return this.f99007v;
    }

    public boolean e() {
        return this.f99006u;
    }

    public synchronized boolean f() {
        return this.f98996k;
    }

    public boolean g() {
        return this.f98991f;
    }

    public boolean h() {
        return this.f99008w;
    }

    public synchronized boolean i() {
        return this.A;
    }
}
