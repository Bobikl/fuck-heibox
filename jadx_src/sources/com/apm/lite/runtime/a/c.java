package com.apm.lite.runtime.a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.lite.AttachUserData;
import com.apm.lite.CrashType;
import com.apm.lite.ICommonParams;
import com.apm.lite.k.v;
import com.apm.lite.k.w;
import com.igexin.sdk.PushConsts;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected CrashType f40156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f40157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ICommonParams f40158c = com.apm.lite.e.a().e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected b f40159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected d f40160e;

    public interface a {
        com.apm.lite.d.a a(int i10, com.apm.lite.d.a aVar, boolean z10);

        void a(Throwable th2);

        com.apm.lite.d.a b(int i10, com.apm.lite.d.a aVar);
    }

    c(CrashType crashType, Context context, b bVar, d dVar) {
        this.f40156a = crashType;
        this.f40157b = context;
        this.f40159d = bVar;
        this.f40160e = dVar;
    }

    private void o(com.apm.lite.d.a aVar) {
        List<AttachUserData> listA = com.apm.lite.e.f().a(this.f40156a);
        HashMap map = new HashMap();
        JSONObject jSONObjectOptJSONObject = aVar.G().optJSONObject("custom");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            aVar.j("custom", jSONObjectOptJSONObject);
        }
        if (listA != null) {
            for (int i10 = 0; i10 < listA.size(); i10++) {
                try {
                    AttachUserData attachUserData = listA.get(i10);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    com.apm.lite.d.a.m(jSONObjectOptJSONObject, attachUserData.getUserData(this.f40156a));
                    map.put("custom_cost_" + attachUserData.getClass().getName() + lg.a.f131412e + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
                } catch (Throwable th2) {
                    com.apm.lite.d.a.l(jSONObjectOptJSONObject, th2);
                }
            }
        }
        try {
            jSONObjectOptJSONObject.put("fd_count", com.apm.lite.k.h.a());
        } catch (Throwable unused) {
        }
        List<AttachUserData> listD = com.apm.lite.e.f().d(this.f40156a);
        if (listD != null) {
            JSONObject jSONObjectOptJSONObject2 = aVar.G().optJSONObject("custom_long");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
                aVar.j("custom_long", jSONObjectOptJSONObject2);
            }
            for (int i11 = 0; i11 < listD.size(); i11++) {
                try {
                    AttachUserData attachUserData2 = listD.get(i11);
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    com.apm.lite.d.a.m(jSONObjectOptJSONObject2, attachUserData2.getUserData(this.f40156a));
                    map.put("custom_cost_" + attachUserData2.getClass().getName() + lg.a.f131412e + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis2));
                } catch (Throwable th3) {
                    com.apm.lite.d.a.l(jSONObjectOptJSONObject2, th3);
                }
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            jSONObjectOptJSONObject.put((String) entry.getKey(), entry.getValue());
        }
    }

    public com.apm.lite.d.a a(int i10, com.apm.lite.d.a aVar) {
        if (aVar == null) {
            aVar = new com.apm.lite.d.a();
        }
        if (i10 == 0) {
            f(aVar);
        } else if (i10 == 1) {
            g(aVar);
            o(aVar);
        } else if (i10 == 2) {
            k(aVar);
        } else if (i10 == 4) {
            l(aVar);
        } else if (i10 == 5) {
            i(aVar);
        }
        return aVar;
    }

    public com.apm.lite.d.a b(com.apm.lite.d.a aVar) {
        return aVar;
    }

    public com.apm.lite.d.a c(com.apm.lite.d.a aVar, a aVar2, boolean z10) {
        if (aVar == null) {
            aVar = new com.apm.lite.d.a();
        }
        com.apm.lite.d.a aVarB = aVar;
        for (int i10 = 0; i10 < e(); i10++) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (aVar2 != null) {
                try {
                    aVarB = aVar2.b(i10, aVarB);
                } catch (Throwable th2) {
                    aVar2.a(th2);
                }
            }
            try {
                aVarB = a(i10, aVarB);
            } catch (Throwable th3) {
                if (aVar2 != null) {
                    aVar2.a(th3);
                }
            }
            if (aVar2 != null) {
                try {
                    boolean z11 = true;
                    if (i10 != e() - 1) {
                        z11 = false;
                    }
                    aVarB = aVar2.a(i10, aVarB, z11);
                } catch (Throwable th4) {
                    aVar2.a(th4);
                }
                if (z10) {
                    if (i10 != 0) {
                        aVar.y(aVarB.G());
                    } else {
                        aVar = aVarB;
                    }
                    aVarB = new com.apm.lite.d.a();
                }
            }
            aVar.q("step_cost_" + i10, String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
        }
        return b(aVar);
    }

    protected boolean d() {
        return false;
    }

    public int e() {
        return 6;
    }

    public com.apm.lite.d.a f(com.apm.lite.d.a aVar) {
        aVar.a(com.apm.lite.e.v(), com.apm.lite.e.w());
        if (com.apm.lite.e.s()) {
            aVar.j("is_mp", 1);
        }
        try {
            aVar.h(this.f40158c.getPluginInfo());
        } catch (Throwable th2) {
            try {
                HashMap map = new HashMap();
                map.put("Fetch info failed:\n" + v.b(th2), 0);
                aVar.h(map);
            } catch (Throwable unused) {
            }
        }
        aVar.r(com.apm.lite.e.u());
        aVar.j("process_name", com.apm.lite.k.a.m(com.apm.lite.e.m()));
        return aVar;
    }

    public com.apm.lite.d.a g(com.apm.lite.d.a aVar) {
        b bVar;
        if (!com.apm.lite.k.a.k(com.apm.lite.e.m())) {
            aVar.j("remote_process", 1);
        }
        aVar.j(PushConsts.KEY_SERVICE_PIT, Integer.valueOf(Process.myPid()));
        aVar.b(com.apm.lite.e.p());
        if (h() && (bVar = this.f40159d) != null) {
            aVar.d(bVar);
        }
        try {
            aVar.g(this.f40158c.getPatchInfo());
        } catch (Throwable th2) {
            try {
                aVar.g(Arrays.asList("Fetch info failed:\n" + v.b(th2)));
            } catch (Throwable unused) {
            }
        }
        String strQ = com.apm.lite.e.q();
        if (strQ != null) {
            aVar.j("business", strQ);
        }
        aVar.j("is_background", Boolean.valueOf(!com.apm.lite.k.a.h(this.f40157b)));
        return aVar;
    }

    protected boolean h() {
        return true;
    }

    public com.apm.lite.d.a i(com.apm.lite.d.a aVar) {
        if (j()) {
            aVar.s(w.b(this.f40157b));
        }
        return aVar;
    }

    protected boolean j() {
        return true;
    }

    public com.apm.lite.d.a k(com.apm.lite.d.a aVar) {
        d dVar = this.f40160e;
        aVar.j(ak.Z, Integer.valueOf(dVar == null ? 0 : dVar.a()));
        aVar.w(com.apm.lite.e.f().b());
        return aVar;
    }

    public com.apm.lite.d.a l(com.apm.lite.d.a aVar) {
        if (d()) {
            n(aVar);
        }
        return aVar;
    }

    void m(com.apm.lite.d.a aVar) {
    }

    protected void n(com.apm.lite.d.a aVar) {
    }
}
