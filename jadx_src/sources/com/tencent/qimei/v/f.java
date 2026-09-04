package com.tencent.qimei.v;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: StrategyController.java */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, f> f101451a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f101452b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f101453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f101454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f101455e = false;

    public f(String str) {
        this.f101453c = str;
        this.f101454d = new j(this, str);
    }

    public static synchronized f a(String str) {
        f fVar;
        Map<String, f> map = f101451a;
        fVar = map.get(str);
        if (fVar == null) {
            fVar = new f(str);
            map.put(str, fVar);
        }
        return fVar;
    }

    @SuppressLint({"MissingPermission"})
    public void a(Context context, k kVar) {
        this.f101454d.a(kVar);
        this.f101454d.c();
        com.tencent.qimei.n.a.b("QIMEI", "开始执行Strategy请求任务(appKey: %s)", this.f101453c);
        if (com.tencent.qimei.j.a.b()) {
            d();
        } else {
            com.tencent.qimei.n.a.b("QIMEI", "没有网络，取消Strategy请求(appKey: %s)", this.f101453c);
        }
        com.tencent.qimei.h.a.a(context, new e(this));
        com.tencent.qimei.n.a.b("SDK_INIT ｜ 策略", " 初始化完成 ", new Object[0]);
    }

    public void a(boolean z10) {
        synchronized (f101452b) {
            this.f101455e = z10;
        }
    }

    public boolean a() {
        boolean z10;
        synchronized (f101452b) {
            z10 = this.f101455e;
        }
        return z10;
    }

    public final boolean b() {
        return com.tencent.qimei.l.c.a(com.tencent.qimei.k.f.b(this.f101453c).c("s_s_t"));
    }

    public void c() {
        com.tencent.qimei.c.a.a().a(this.f101454d);
    }

    public final synchronized void d() {
        if (com.tencent.qimei.d.a.g()) {
            if (!b()) {
                this.f101454d.a();
                return;
            }
            com.tencent.qimei.n.a.b("SDK_INIT ｜ 策略", "距离上次请求Strategy超过24小时", new Object[0]);
            if (!this.f101454d.b()) {
                com.tencent.qimei.c.a.a().a(this.f101454d);
            }
        }
    }
}
