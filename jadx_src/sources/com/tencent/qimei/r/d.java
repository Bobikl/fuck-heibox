package com.tencent.qimei.r;

import android.text.TextUtils;
import com.tencent.qimei.sdk.Qimei;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: QimeiHolder.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, d> f101351a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Qimei f101353c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f101358h = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f101354d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f101355e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f101356f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f101357g = false;

    public d(String str) {
        this.f101352b = str;
        Qimei qimei = new Qimei();
        this.f101353c = qimei;
        qimei.setAppKey(str);
    }

    public static synchronized d a(String str) {
        d dVar;
        Map<String, d> map = f101351a;
        dVar = map.get(str);
        if (dVar == null) {
            dVar = new d(str);
            dVar.e();
            map.put(str, dVar);
        }
        return dVar;
    }

    public int a() {
        return this.f101356f;
    }

    public void a(int i10) {
        this.f101356f = i10;
    }

    public void a(long j10) {
        this.f101355e = j10;
        this.f101354d = g();
        com.tencent.qimei.k.f.b(this.f101352b).b(com.google.android.exoplayer2.text.ttml.d.f49795n, this.f101354d);
    }

    public void b(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        Qimei qimeiA = e.b.a(str);
        this.f101353c = qimeiA;
        qimeiA.setAppKey(this.f101352b);
    }

    public boolean b() {
        return this.f101357g;
    }

    public Qimei c() {
        return this.f101353c;
    }

    public String d() {
        if (this.f101355e == 0) {
            this.f101355e = System.currentTimeMillis();
        }
        if (TextUtils.isEmpty(this.f101354d)) {
            String strD = com.tencent.qimei.k.f.b(this.f101352b).d(com.google.android.exoplayer2.text.ttml.d.f49795n);
            this.f101354d = strD;
            if (TextUtils.isEmpty(strD)) {
                this.f101354d = g();
            }
        }
        return this.f101354d + this.f101355e;
    }

    public final void e() {
        if (this.f101358h) {
            return;
        }
        f();
        this.f101358h = true;
    }

    public final synchronized void f() {
        if (p.h(this.f101352b)) {
            com.tencent.qimei.q.c.a(this.f101352b, this.f101353c.a(), this.f101353c.b());
            p.a();
            return;
        }
        b(p.d(this.f101352b));
        String strA = this.f101353c.a();
        String strB = this.f101353c.b();
        if (TextUtils.isEmpty(strA) && TextUtils.isEmpty(strB)) {
            com.tencent.qimei.n.a.b("QIMEI", "Local qimei cache not found, try load from old version cache(appKey: %s)", this.f101352b);
            Qimei qimeiA = c.a();
            if (qimeiA == null) {
                com.tencent.qimei.n.a.b("QIMEI", "Local qimei cache failed(appKey: %s)", this.f101352b);
                return;
            } else {
                this.f101353c = qimeiA;
                this.f101357g = true;
            }
        }
        com.tencent.qimei.n.a.b("QIMEI", "(appKey: %s) Qimei load successfully from cache, detail: %s", this.f101352b, this.f101353c.toString());
    }

    public final String g() {
        String strB = com.tencent.qimei.o.d.a(this.f101352b).b();
        return strB == null ? "" : com.tencent.qimei.l.a.b(strB);
    }
}
