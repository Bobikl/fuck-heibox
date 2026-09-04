package com.tencent.beacon.e;

import android.content.Context;
import android.util.Base64;
import java.util.Date;

/* JADX INFO: compiled from: StrategyHolder.java */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile g f99022a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f99025d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f99023b = "sid";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f99026e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f99027f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f99028g = bb.c.k.A3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f99029h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f99030i = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f99024c = com.tencent.beacon.a.c.c.d().c();

    private g() {
        com.tencent.beacon.a.b.a.a().a(new e(this));
    }

    public static g b() {
        if (f99022a == null) {
            synchronized (g.class) {
                if (f99022a == null) {
                    f99022a = new g();
                }
            }
        }
        return f99022a;
    }

    public synchronized String a() {
        return this.f99030i;
    }

    public synchronized void a(Context context) {
        com.tencent.beacon.a.d.a aVarA = com.tencent.beacon.a.d.a.a();
        String string = aVarA.getString("sid_value", "");
        if (aVarA.getLong("sid_mt", 0L) > new Date().getTime() / 1000) {
            a(string);
        }
        a(context, com.tencent.beacon.base.util.b.b());
    }

    synchronized void a(Context context, String str) {
        this.f99030i = str;
        byte[] bArrA = com.tencent.beacon.base.net.c.c.a(context, str);
        if (bArrA != null) {
            this.f99029h = Base64.encodeToString(bArrA, 2);
        }
    }

    public void a(c cVar) {
        this.f99025d = cVar;
    }

    public synchronized void a(String str) {
        this.f99026e = str;
    }

    public synchronized void a(String str, String str2) {
        com.tencent.beacon.base.util.c.a("[net] -> update local sid|time[%s|%s].", str, str2);
        this.f99026e = str;
        com.tencent.beacon.a.b.a.a().a(new f(this, str2, str));
    }

    public synchronized String c() {
        return this.f99026e;
    }

    public synchronized String d() {
        return this.f99029h;
    }
}
