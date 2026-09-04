package com.igexin.push.c;

import com.igexin.push.config.SDKUrlConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63367a = "DT_" + i.class.getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static i f63368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static h f63369c;

    private i() {
        f63369c = com.igexin.push.util.a.c() ? h.WIFI : h.MOBILE;
    }

    public static synchronized i a() {
        if (f63368b == null) {
            f63368b = new i();
        }
        return f63368b;
    }

    public void b() {
        if (SDKUrlConfig.hasMultipleXfr()) {
            com.igexin.a.a.b.c.b().a(m.c_(), false, true);
            return;
        }
        com.igexin.a.a.c.b.a(f63367a + "|xfr len = 1, detect = false", new Object[0]);
    }

    public void c() {
        if (SDKUrlConfig.hasMultipleXfr()) {
            try {
                f().d();
            } catch (Throwable th2) {
                com.igexin.a.a.c.b.a(f63367a + "|" + th2.toString(), new Object[0]);
            }
        }
    }

    public a d() {
        return f().f63396d;
    }

    public void e() {
        if (SDKUrlConfig.hasMultipleXfr()) {
            try {
                s.a().i();
                s.a().f();
                n.a().f();
                o oVarF = f();
                if (oVarF != null) {
                    oVarF.h();
                    return;
                }
                return;
            } catch (Throwable th2) {
                com.igexin.a.a.c.b.a(f63367a + "|" + th2.toString(), new Object[0]);
                return;
            }
        }
        k.a();
        m.c_().h();
        try {
            n.a().f63396d.a((List<e>) null);
            s.a().f63396d.a((List<e>) null);
            s.a().g();
            n.a().g();
            s.a().i();
        } catch (Throwable th3) {
            com.igexin.a.a.c.b.a(f63367a + "|" + th3.toString(), new Object[0]);
        }
    }

    public synchronized o f() {
        o oVarA;
        o oVarA2;
        oVarA = com.igexin.push.util.a.c() ? s.a() : n.a();
        h hVarB = oVarA.b();
        if (hVarB != f63369c) {
            if (hVarB == h.WIFI) {
                oVarA2 = n.a();
            } else if (hVarB == h.MOBILE) {
                oVarA2 = s.a();
            }
            oVarA2.e();
        }
        f63369c = hVarB;
        return oVarA;
    }
}
