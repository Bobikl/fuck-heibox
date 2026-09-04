package com.tencent.qimei.r;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.qimei.sdk.Qimei;
import com.tencent.qimei.sdk.QimeiSDK;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: QimeiQueryTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, j> f101397a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Random f101398b = new Random(System.currentTimeMillis());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f101402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f101403g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f101405i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AtomicInteger f101399c = new AtomicInteger();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f101400d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AtomicBoolean f101401e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f101404h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f101406j = new a(3, new f(this));

    /* JADX INFO: compiled from: QimeiQueryTask.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f101407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC0981a f101408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AtomicInteger f101409c = new AtomicInteger();

        /* JADX INFO: renamed from: com.tencent.qimei.r.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: QimeiQueryTask.java */
        public interface InterfaceC0981a {
            void a();
        }

        public a(int i10, InterfaceC0981a interfaceC0981a) {
            this.f101407a = i10;
            this.f101408b = interfaceC0981a;
        }

        public boolean a() {
            return this.f101409c.get() >= this.f101407a - 1;
        }

        public boolean b() {
            this.f101409c.getAndIncrement();
            boolean z10 = this.f101409c.get() >= this.f101407a;
            if (z10) {
                c();
                InterfaceC0981a interfaceC0981a = this.f101408b;
                if (interfaceC0981a != null) {
                    interfaceC0981a.a();
                }
            }
            return z10;
        }

        public void c() {
            this.f101409c.set(0);
        }
    }

    public j(String str) {
        this.f101405i = "";
        this.f101405i = str;
    }

    public static synchronized j a(String str) {
        j jVar;
        Map<String, j> map = f101397a;
        jVar = map.get(str);
        if (jVar == null) {
            jVar = new j(str);
            map.put(str, jVar);
        }
        return jVar;
    }

    public final String a(String str, String str2) {
        return com.tencent.qimei.a.a.c(e.b.KEY_DATA.a(str2, new e.b[0]), str);
    }

    public final void a(Qimei qimei, Qimei qimei2, boolean z10) {
        if (qimei == null || qimei.isEmpty()) {
            return;
        }
        String strA = qimei.a();
        String strB = qimei.b();
        if (strA == null || strB == null) {
            return;
        }
        if (strA.isEmpty() || !strB.isEmpty()) {
            String strA2 = qimei2.a();
            String strB2 = qimei2.b();
            if (strA2.isEmpty() || !strB2.isEmpty()) {
                if (strA.equals(strA2) && strB.equals(strB2)) {
                    return;
                }
                com.tencent.qimei.q.c.a(this.f101405i, strA, strB, strA2, strB2, z10);
            }
        }
    }

    public final void a(String str, int i10, String str2) {
        com.tencent.qimei.n.a.a(QimeiSDK.TAG, 1, "onFailure msg: %s,%d,%s. Waiting next query.", str, Integer.valueOf(i10), str2);
        if (this.f101406j.a()) {
            com.tencent.qimei.q.c.a(this.f101405i, str, i10, str2);
        }
        g();
    }

    public boolean a() {
        return d() <= com.tencent.qimei.v.d.a(this.f101405i).y();
    }

    public void b() {
        this.f101401e.set(false);
    }

    public final void b(String str) {
        Qimei qimeiC = d.a(this.f101405i).c();
        if (qimeiC == null || qimeiC.isEmpty()) {
            com.tencent.qimei.q.c.a(this.f101405i, str);
        }
    }

    public final void b(String str, String str2) {
        String strB = com.tencent.qimei.g.b.KEY_CODE.a(str).b(this.f101405i);
        if (!strB.equals("0")) {
            g();
            return;
        }
        String strA = a(str2, str);
        com.tencent.qimei.n.a.b("QIMEI", "(appKey: %s)Qimei响应 data解密: %s", this.f101405i, strA);
        if (strA == null || strA.isEmpty()) {
            com.tencent.qimei.q.c.b(this.f101405i, str2, str);
            g();
            return;
        }
        d dVarA = d.a(this.f101405i);
        Qimei qimeiC = dVarA.c();
        dVarA.b(strA);
        a(qimeiC, dVarA.c(), dVarA.b());
        b(strB);
        Qimei qimeiC2 = dVarA.c();
        if (qimeiC2 != null && !qimeiC2.isEmpty()) {
            f();
            p.a(this.f101405i, strA);
            dVarA.a(this.f101400d);
        }
        b();
    }

    public final String c() {
        return this.f101404h ? com.tencent.qimei.v.d.a(this.f101405i).s() : "";
    }

    public int d() {
        return f101398b.nextInt(101);
    }

    public boolean e() {
        return this.f101401e.get();
    }

    public final void f() {
        com.tencent.qimei.c.a.a().a(new i(this));
    }

    public final void g() {
        com.tencent.qimei.n.a.b("QIMEI", "Qimei请求失败(appKey: %s)", this.f101405i);
        b();
        if (this.f101404h) {
            this.f101404h = false;
        } else {
            if (this.f101406j.b()) {
                return;
            }
            com.tencent.qimei.c.a.a().a(10000L, this);
        }
    }

    public final void h() {
        com.tencent.qimei.c.a.a().a(300L, new h(this));
    }

    public final void i() {
        if (!a()) {
            com.tencent.qimei.n.a.b("上报", "Qimei性能上报被抽样拦截～", new Object[0]);
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j10 = jUptimeMillis - this.f101403g;
        long j11 = jUptimeMillis - this.f101402f;
        long j12 = com.tencent.qimei.d.d.l().f101230d;
        com.tencent.qimei.q.c.a(this.f101405i, j10, j11, j12);
        com.tencent.qimei.n.a.b("QIMEI", "Qimei性能上报(appKey: %s), %d %d %d", this.f101405i, Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j12));
    }

    @Override // java.lang.Runnable
    @SuppressLint({"MissingPermission"})
    public void run() {
        if (e()) {
            com.tencent.qimei.n.a.b("QIMEI", "QIMEI正在请求中，取消该次请求(appKey: %s)", this.f101405i);
            return;
        }
        this.f101401e.set(true);
        com.tencent.qimei.n.a.b("QIMEI", "开始执行QIMEI请求任务(appKey: %s)", this.f101405i);
        if (!com.tencent.qimei.j.a.b()) {
            com.tencent.qimei.n.a.b("QIMEI", "没有网络，取消QIMEI请求(appKey: %s)", this.f101405i);
            b();
            return;
        }
        if (!com.tencent.qimei.d.a.g()) {
            h();
            b();
            return;
        }
        this.f101402f = SystemClock.uptimeMillis();
        e eVarA = e.a();
        String strA = com.tencent.qimei.l.a.a();
        String strA2 = eVarA.a(com.tencent.qimei.v.d.a(this.f101405i).z(), c());
        Qimei qimeiC = d.a(this.f101405i).c();
        this.f101400d = System.currentTimeMillis();
        String strA3 = eVarA.a(strA, this.f101405i, qimeiC, this.f101400d, p.b(this.f101405i));
        if (TextUtils.isEmpty(strA3)) {
            com.tencent.qimei.n.a.b("QIMEI", "获取请求参数错误，取消QIMEI请求(appKey: %s)", this.f101405i);
            b();
        } else {
            this.f101403g = SystemClock.uptimeMillis();
            com.tencent.qimei.e.b.b(strA2, strA3, new g(this, strA));
            com.tencent.qimei.n.a.b("QIMEI", "开始请求Qimei(appKey: %s), url: %s", this.f101405i, strA2);
        }
    }
}
