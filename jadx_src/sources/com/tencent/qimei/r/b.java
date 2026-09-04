package com.tencent.qimei.r;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.qimei.sdk.Qimei;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: HidBuilder.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, b> f101347a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f101349c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f101350d;

    public b(String str) {
        this.f101348b = str;
    }

    public static synchronized b a(String str) {
        b bVar;
        Map<String, b> map = f101347a;
        bVar = map.get(str);
        if (bVar == null) {
            bVar = new b(str);
            map.put(str, bVar);
        }
        return bVar;
    }

    public final void a() {
        com.tencent.qimei.c.a.a().a(this.f101349c * 1000, this);
    }

    public void a(Context context) {
        this.f101350d = context;
    }

    public final boolean a(String str, String str2) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || "null".equals(str) || str.length() != 32;
    }

    public final void b() {
        Qimei qimeiC = p.c(this.f101348b);
        if (qimeiC == null || qimeiC.isEmpty()) {
            com.tencent.qimei.n.a.c("HidBuilder", "qimei is null", new Object[0]);
            return;
        }
        com.tencent.qimei.y.d dVarG = com.tencent.qimei.y.m.e() ? g() : null;
        if (dVarG == null) {
            dVarG = f();
        }
        if (dVarG == null) {
            com.tencent.qimei.n.a.c("HidBuilder", "jsRet is null", new Object[0]);
            return;
        }
        String strD = dVarG.d();
        String strB = dVarG.b();
        String strA = dVarG.a();
        String strC = dVarG.c();
        if (a(strA, strC)) {
            com.tencent.qimei.n.a.c("HidBuilder", "hid is invail, len = %d", Integer.valueOf(strA.length()));
        } else if (!b(strA)) {
            com.tencent.qimei.n.a.c("HidBuilder", "hid same and in 24h", new Object[0]);
        } else {
            d(strA);
            com.tencent.qimei.q.d.a(this.f101348b, strD, strB, strA, strC);
        }
    }

    public final boolean b(String str) {
        return d() || !c(str);
    }

    public final boolean c() {
        int iC = com.tencent.qimei.v.d.a(this.f101348b).c();
        this.f101349c = iC;
        return iC == 0;
    }

    public final boolean c(String str) {
        return str.equals(com.tencent.qimei.k.f.b(this.f101348b).d("hi"));
    }

    public final void d(String str) {
        com.tencent.qimei.k.f.b(this.f101348b).b("hi", str);
        com.tencent.qimei.k.f.b(this.f101348b).a("h_s_t", System.currentTimeMillis());
    }

    public final boolean d() {
        return com.tencent.qimei.l.c.a(com.tencent.qimei.k.f.b(this.f101348b).c("h_s_t"));
    }

    public void e() {
        if (this.f101350d == null) {
            com.tencent.qimei.n.a.b("mContext is null", new Object[0]);
            return;
        }
        if (c()) {
            com.tencent.qimei.n.a.c("HidBuilder", "hid close", new Object[0]);
            return;
        }
        com.tencent.qimei.n.a.c("HidBuilder", "JsTime:" + this.f101349c, new Object[0]);
        com.tencent.qimei.c.a.a().a(this);
    }

    public final com.tencent.qimei.y.d f() {
        com.tencent.qimei.y.i iVar = new com.tencent.qimei.y.i();
        iVar.b(this.f101350d);
        iVar.a();
        com.tencent.qimei.n.a.c("HidBuilder", "systemWebview", new Object[0]);
        return iVar.c();
    }

    public final com.tencent.qimei.y.d g() {
        com.tencent.qimei.y.m mVar = new com.tencent.qimei.y.m();
        mVar.b(this.f101350d);
        mVar.b();
        com.tencent.qimei.n.a.c("HidBuilder", "x5Webview", new Object[0]);
        return mVar.d();
    }

    @Override // java.lang.Runnable
    public void run() {
        b();
        a();
    }
}
