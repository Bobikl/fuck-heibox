package com.apm.lite.j;

import com.apm.lite.k.p;
import com.apm.lite.k.q;
import com.apm.lite.runtime.m;
import com.apm.lite.runtime.r;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Runnable f39973a = new RunnableC0309a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f39974b = 0;

    /* JADX INFO: renamed from: com.apm.lite.j.a$a, reason: collision with other inner class name */
    public static final class RunnableC0309a implements Runnable {
        RunnableC0309a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r rVarB;
            Runnable runnable;
            long j10;
            m.b().j(a.f39973a);
            if (p.c(com.apm.lite.e.m())) {
                a.g();
            }
            if (a.f39974b > 0) {
                if (com.apm.lite.k.a.k(com.apm.lite.e.m())) {
                    rVarB = m.b();
                    runnable = a.f39973a;
                    j10 = 15000;
                } else {
                    rVarB = m.b();
                    runnable = a.f39973a;
                    j10 = 60000;
                }
                rVarB.f(runnable, j10);
            }
        }
    }

    public static void a() {
        f39974b = 40;
        m.b().e(f39973a);
    }

    public static void b() {
        if (!j.e()) {
            j.f();
        }
        if (p.c(com.apm.lite.e.m()) && j.d(false)) {
            g();
        }
    }

    private static byte[] f() {
        try {
            return e.l(com.apm.lite.e.o().getConfigUrl(), null, com.apm.lite.d.b.c().toString().getBytes());
        } catch (Throwable th2) {
            q.f(th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void g() {
        int i10 = f39974b;
        if (i10 > 0) {
            f39974b = i10 - 1;
        }
        q.a("try fetchApmConfig");
        if (com.apm.lite.k.a.k(com.apm.lite.e.m())) {
            JSONArray jSONArrayOptJSONArray = null;
            try {
                byte[] bArrF = f();
                if (bArrF != null) {
                    jSONArrayOptJSONArray = new JSONObject(new String(bArrF)).optJSONArray("data");
                }
            } catch (Throwable th2) {
                q.e("npth", th2);
            }
            q.a("after fetchApmConfig net " + jSONArrayOptJSONArray);
            if (jSONArrayOptJSONArray != null) {
                com.apm.lite.runtime.a.f(jSONArrayOptJSONArray, true);
                f39974b = 0;
            } else {
                f39974b -= 10;
            }
        } else {
            j.f();
            if (j.c()) {
                f39974b = 0;
            }
        }
    }
}
