package com.tencent.qimei.q;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: Reporter.java */
/* JADX INFO: loaded from: classes4.dex */
public class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile j f101343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f101344b;

    public static synchronized j a() {
        if (f101343a == null) {
            synchronized (j.class) {
                if (f101343a == null) {
                    f101343a = new j();
                }
            }
        }
        return f101343a;
    }

    public a a(String str, Object obj) {
        return new e().a(str, obj);
    }

    public void a(Context context) {
        this.f101344b = context;
    }

    public final void a(String str, Map<String, Object> map, String str2, String str3) {
        f fVarA = f.a();
        com.tencent.qimei.e.b.b(fVarA.a(com.tencent.qimei.v.d.a(str3).z(), str), fVarA.a(map, str2, str3, com.tencent.qimei.o.d.a(str3).a()), new i(this));
    }

    public void b(String str, Map<String, Object> map, String str2, String str3) {
        if (com.tencent.qimei.v.d.a(str3).x() && com.tencent.qimei.d.a.g()) {
            com.tencent.qimei.c.a.a().a(new h(this, str, map, str2, str3));
        }
    }
}
