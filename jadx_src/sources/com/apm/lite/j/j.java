package com.apm.lite.j;

import android.util.Log;
import androidx.core.app.o0;
import com.apm.lite.MonitorCrash;
import com.apm.lite.k.o;
import com.apm.lite.k.q;
import com.apm.lite.runtime.m;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static File f40038a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f40039b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f40040c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map<String, String> f40041d;

    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.f();
            if (j.d(false)) {
                com.apm.lite.j.a.a();
            }
        }
    }

    public static void a(String str) {
        if (f40041d == null) {
            f40041d = new HashMap();
        }
        f40041d.put(str, String.valueOf(System.currentTimeMillis()));
        MonitorCrash.reInitAppLog(str);
    }

    public static void b(boolean z10, JSONArray jSONArray) {
        try {
            com.apm.lite.k.i.l(new File(o.E(com.apm.lite.e.m()), "apmlite/configCrash/configFile"), jSONArray, false);
        } catch (IOException unused) {
        }
        try {
            com.apm.lite.k.i.k(j(), f40041d);
        } catch (Throwable unused2) {
        }
    }

    static boolean c() {
        return f40039b;
    }

    static boolean d(boolean z10) {
        File fileJ = j();
        try {
            Map<String, String> mapE = f40041d;
            if (mapE == null) {
                mapE = com.apm.lite.k.i.E(fileJ);
            }
            f40041d = mapE;
            if (mapE == null) {
                f40041d = new HashMap();
                return true;
            }
            if (mapE.size() < com.apm.lite.d.b.k()) {
                return true;
            }
            Iterator<String> it = com.apm.lite.d.b.l().iterator();
            while (it.hasNext()) {
                if (!f40041d.containsKey(it.next())) {
                    return true;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z11 = false;
            for (Map.Entry<String, String> entry : f40041d.entrySet()) {
                try {
                    long jLongValue = Long.decode(entry.getValue()).longValue();
                    if (com.apm.lite.runtime.e.d(entry.getKey())) {
                        if (jCurrentTimeMillis - jLongValue > com.apm.lite.runtime.e.g(entry.getKey())) {
                            z11 = true;
                        }
                    }
                } catch (Throwable th2) {
                    q.f(th2);
                }
            }
            q.a(z11 ? "config should be updated" : "config should not be updated");
            return z11;
        } catch (Throwable th3) {
            Log.e("npth", o0.N0, th3);
            return true;
        }
    }

    public static boolean e() {
        return f40040c;
    }

    public static void f() {
        if (f40039b) {
            return;
        }
        f40040c = true;
        File file = new File(o.E(com.apm.lite.e.m()), "apmlite/configCrash/configFile");
        if (file.exists()) {
            try {
                com.apm.lite.runtime.a.f(new JSONArray(com.apm.lite.k.i.y(file)), false);
                f40039b = true;
            } catch (Throwable unused) {
                com.apm.lite.runtime.a.f(null, false);
            }
        }
    }

    public static void g() {
        f();
        if (d(false)) {
            com.apm.lite.j.a.a();
        }
    }

    public static void h() {
        m.b().e(new a());
    }

    public static void i() {
        Map<String, String> map = f40041d;
        if (map != null) {
            map.clear();
        }
    }

    private static File j() {
        if (f40038a == null) {
            f40038a = new File(o.E(com.apm.lite.e.m()), "apmlite/configCrash/configInvalid");
        }
        return f40038a;
    }
}
