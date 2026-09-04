package com.igexin.push.c;

import android.text.TextUtils;
import com.igexin.push.config.SDKUrlConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f63332f = "DT_" + a.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f63335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected volatile long f63336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected volatile long f63337e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f63338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f63339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f63340i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private j f63341j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f63347p;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<e> f63342k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<j> f63343l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f63344m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f63345n = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile d f63333a = d.NORMAL;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f63346o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicBoolean f63334b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Comparator<j> f63348q = new b(this);

    /* JADX WARN: Code duplicated, block: B:24:0x0083 A[Catch: all -> 0x00b4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0021, B:7:0x0025, B:8:0x0029, B:26:0x00a5, B:15:0x003b, B:17:0x003f, B:18:0x0042, B:20:0x004b, B:21:0x0051, B:22:0x0076, B:24:0x0083, B:25:0x0088), top: B:32:0x0001 }] */
    private synchronized void a(d dVar) {
        StringBuilder sb2 = new StringBuilder();
        String str = f63332f;
        sb2.append(str);
        sb2.append("|set domain type = ");
        sb2.append(dVar);
        com.igexin.a.a.c.b.a(sb2.toString(), new Object[0]);
        if (com.igexin.push.config.l.f63428f) {
            if (this.f63333a != dVar) {
                a((List<e>) null);
            }
            int i10 = c.f63350a[dVar.ordinal()];
            if (i10 == 1) {
                this.f63338g = 0;
                SDKUrlConfig.setCmAddress(c(true));
                if (dVar == d.NORMAL) {
                    this.f63334b.set(false);
                }
                com.igexin.a.a.c.b.a(str + "|set domain type normal cm = " + SDKUrlConfig.getCmAddress(), new Object[0]);
            } else if (i10 == 2) {
                this.f63334b.set(true);
                if (this.f63333a != dVar) {
                    this.f63336d = System.currentTimeMillis();
                }
                SDKUrlConfig.setCmAddress(SDKUrlConfig.XFR_ADDRESS_BAK[0]);
                com.igexin.a.a.c.b.a(str + "|set domain type backup cm = " + SDKUrlConfig.getCmAddress(), new Object[0]);
            } else if (i10 == 3) {
                if (this.f63333a != dVar) {
                    this.f63346o = 0;
                }
                this.f63338g = 0;
                SDKUrlConfig.setCmAddress(c(true));
                if (dVar == d.NORMAL) {
                    this.f63334b.set(false);
                }
                com.igexin.a.a.c.b.a(str + "|set domain type normal cm = " + SDKUrlConfig.getCmAddress(), new Object[0]);
            }
            this.f63333a = dVar;
            i.a().f().m();
        }
    }

    private void a(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f63342k.add(new e().a(jSONArray.getJSONObject(i10)));
            }
            com.igexin.a.a.c.b.a(f63332f + "|get cm from cache, isWifi = " + this.f63347p + ", lastCmList = " + str, new Object[0]);
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a(f63332f + "|" + th2.toString(), new Object[0]);
        }
    }

    private String b(boolean z10) {
        try {
            synchronized (this.f63345n) {
                String str = this.f63347p ? com.igexin.push.core.d.ao : com.igexin.push.core.d.ap;
                if (this.f63342k.isEmpty() && TextUtils.isEmpty(str)) {
                    com.igexin.a.a.c.b.a(f63332f + "cm list size = 0", new Object[0]);
                    this.f63340i = 0;
                    this.f63339h = 0;
                    return null;
                }
                if (this.f63342k.isEmpty() && !TextUtils.isEmpty(str)) {
                    a(str);
                }
                StringBuilder sb2 = new StringBuilder();
                String str2 = f63332f;
                sb2.append(str2);
                sb2.append("cm try = ");
                sb2.append(this.f63340i);
                sb2.append(" times");
                com.igexin.a.a.c.b.a(sb2.toString(), new Object[0]);
                if (this.f63340i >= this.f63342k.size() * 1) {
                    com.igexin.a.a.c.b.a(str2 + "cm invalid", new Object[0]);
                    this.f63340i = 0;
                    this.f63339h = 0;
                    this.f63342k.clear();
                    return null;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator<e> it = this.f63342k.iterator();
                while (it.hasNext()) {
                    e next = it.next();
                    if (next.f63357b < jCurrentTimeMillis) {
                        com.igexin.a.a.c.b.a(f63332f + "|add[" + next.f63356a + "] outDate", new Object[0]);
                        it.remove();
                    }
                }
                d();
                if (this.f63342k.isEmpty()) {
                    return null;
                }
                if (z10) {
                    this.f63340i++;
                }
                int i10 = this.f63339h >= this.f63342k.size() ? 0 : this.f63339h;
                this.f63339h = i10;
                String str3 = this.f63342k.get(i10).f63356a;
                this.f63339h++;
                return str3;
            }
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a(f63332f + "|" + e10.toString(), new Object[0]);
            return null;
        }
    }

    private String c(boolean z10) {
        String strB;
        synchronized (this.f63344m) {
            int i10 = this.f63338g >= this.f63343l.size() ? 0 : this.f63338g;
            this.f63338g = i10;
            j jVar = this.f63343l.get(i10);
            this.f63341j = jVar;
            strB = jVar.b(z10);
        }
        return strB;
    }

    private void j() {
        d dVar;
        com.igexin.a.a.c.b.a(f63332f + "|before disconnect, type = " + this.f63333a, new Object[0]);
        int i10 = c.f63350a[this.f63333a.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 || System.currentTimeMillis() - this.f63336d <= com.igexin.push.config.l.f63436n) {
                return;
            } else {
                dVar = d.TRY_NORMAL;
            }
        } else if (System.currentTimeMillis() - this.f63337e <= 86400000 || this.f63335c <= com.igexin.push.config.l.f63438p) {
            return;
        } else {
            dVar = d.BACKUP;
        }
        a(dVar);
    }

    public void a(List<e> list) {
        synchronized (this.f63345n) {
            this.f63339h = 0;
            this.f63340i = 0;
            this.f63342k.clear();
            if (list != null) {
                this.f63342k.addAll(list);
                com.igexin.a.a.c.b.a(f63332f + "|set cm list: " + list.toString(), new Object[0]);
            }
            d();
        }
    }

    public void a(boolean z10) {
        this.f63347p = z10;
    }

    public boolean a() {
        boolean z10;
        try {
            z10 = true;
            boolean z11 = !com.igexin.push.core.c.a().i().h();
            String strB = b(z11);
            StringBuilder sb2 = new StringBuilder();
            String str = f63332f;
            sb2.append(str);
            sb2.append("|get from cm = ");
            sb2.append(strB);
            com.igexin.a.a.c.b.a(sb2.toString(), new Object[0]);
            if (strB == null) {
                if (com.igexin.push.config.l.f63428f && this.f63333a == d.BACKUP) {
                    int i10 = this.f63338g;
                    String[] strArr = SDKUrlConfig.XFR_ADDRESS_BAK;
                    if (i10 >= strArr.length) {
                        i10 = 0;
                    }
                    strB = strArr[i10];
                    this.f63338g = i10 + 1;
                } else {
                    j jVar = this.f63341j;
                    if (jVar != null && !jVar.f()) {
                        this.f63338g++;
                    }
                    strB = c(z11);
                }
                z10 = false;
            }
            try {
                if (!SDKUrlConfig.getCmAddress().equals(strB)) {
                    com.igexin.a.a.c.b.a(str + "|address changed : form [" + SDKUrlConfig.getCmAddress() + "] to [" + strB + "]", new Object[0]);
                }
                SDKUrlConfig.setCmAddress(strB);
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
                com.igexin.a.a.c.b.a(f63332f + "|switch address|" + e.toString(), new Object[0]);
            }
        } catch (Exception e11) {
            e = e11;
            z10 = false;
        }
        return z10;
    }

    public synchronized void b() {
        this.f63340i = 0;
        j jVar = this.f63341j;
        if (jVar != null) {
            jVar.g();
        }
    }

    public void b(List<j> list) {
        synchronized (this.f63344m) {
            this.f63343l.clear();
            this.f63343l.addAll(list);
            Collections.sort(this.f63343l, this.f63348q);
        }
    }

    public synchronized void c() {
        this.f63335c++;
        com.igexin.a.a.c.b.a(f63332f + "|loginFailedlCnt = " + this.f63335c, new Object[0]);
    }

    public void d() {
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.f63342k.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().a());
        }
        com.igexin.push.core.b.i.a().c(jSONArray.length() == 0 ? "null" : jSONArray.toString(), !this.f63347p);
    }

    public void e() {
        synchronized (this.f63344m) {
            this.f63338g = 0;
            Collections.sort(this.f63343l, this.f63348q);
        }
    }

    public void f() {
        com.igexin.a.a.c.b.a(f63332f + "|detect success, current type = " + this.f63333a, new Object[0]);
        if (this.f63333a == d.BACKUP) {
            a(d.TRY_NORMAL);
            com.igexin.push.core.c.a().i().a(true);
        }
    }

    public void g() {
        if (c.f63350a[this.f63333a.ordinal()] == 2 && System.currentTimeMillis() - this.f63336d > com.igexin.push.config.l.f63436n) {
            a(d.TRY_NORMAL);
        }
    }

    public void h() {
        if (this.f63333a != d.BACKUP) {
            this.f63335c = 0;
        }
        int i10 = c.f63350a[this.f63333a.ordinal()];
        if (i10 == 1) {
            this.f63337e = System.currentTimeMillis();
            i.a().f().m();
        } else if (i10 != 3) {
            return;
        } else {
            a(d.NORMAL);
        }
        this.f63334b.set(false);
    }

    public void i() {
        j();
        if (com.igexin.push.core.d.f63678l && this.f63333a != d.BACKUP) {
            this.f63337e = System.currentTimeMillis();
            i.a().f().m();
        }
        if (c.f63350a[this.f63333a.ordinal()] != 3) {
            return;
        }
        int i10 = this.f63346o + 1;
        this.f63346o = i10;
        if (i10 >= 10) {
            this.f63335c = 0;
            this.f63336d = System.currentTimeMillis();
            a(d.BACKUP);
        }
    }
}
