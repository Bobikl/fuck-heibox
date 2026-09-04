package com.tencent.open.b;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.k;
import com.tencent.open.utils.l;
import com.tencent.open.utils.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f101034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f101035b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f101036c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f101037d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f101038e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f101039f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f101040g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f101041h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<Serializable> f101042i = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Serializable> f101043j = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Executor f101044k = l.b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f101045l;

    private b() {
    }

    public static synchronized b a() {
        if (f101034a == null) {
            f101034a = new b();
        }
        return f101034a;
    }

    private void a(final c cVar) {
        this.f101044k.execute(new Runnable() { // from class: com.tencent.open.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.f101042i.add(cVar);
                if (m.b(com.tencent.open.utils.g.a())) {
                    try {
                        b.this.d();
                        return;
                    } catch (Exception e10) {
                        SLog.e("AttaReporter", "Exception", e10);
                        return;
                    }
                }
                SLog.i("AttaReporter", "attaReport net disconnect, " + cVar);
            }
        });
    }

    private c b(String str, String str2, Object obj, Map<String, Object> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map2 = new HashMap();
        map2.put("attaid", "09400051119");
        map2.put("token", "9389887874");
        map2.put("time_appid_openid", jCurrentTimeMillis + lg.a.f131412e + this.f101035b + lg.a.f131412e + this.f101037d);
        map2.put("time", String.valueOf(jCurrentTimeMillis));
        map2.put("openid", this.f101037d);
        map2.put("appid", this.f101035b);
        map2.put("app_name", this.f101036c);
        map2.put(Constants.PARAM_APP_VER, this.f101038e);
        map2.put(Constants.PARAM_PKG_NAME, this.f101039f);
        map2.put("os", "AND");
        map2.put("os_ver", Build.VERSION.RELEASE);
        map2.put("sdk_ver", Constants.SDK_VERSION);
        map2.put(Constants.PARAM_MODEL_NAME, com.tencent.open.utils.f.a().c(com.tencent.open.utils.g.a()));
        map2.put("interface_name", str);
        map2.put("interface_data", str2);
        map2.put("interface_result", obj == null ? "" : obj.toString());
        map2.put("qq_install", this.f101040g);
        map2.put(Constants.PARAM_QQ_VER, this.f101041h);
        if (map != null && !map.isEmpty()) {
            Object obj2 = map.get("reserve1");
            map2.put("reserve1", obj2 == null ? "" : obj2.toString());
            Object obj3 = map.get("reserve2");
            map2.put("reserve2", obj3 == null ? "" : obj3.toString());
            Object obj4 = map.get("reserve3");
            map2.put("reserve3", obj4 == null ? "" : obj4.toString());
            Object obj5 = map.get("reserve4");
            map2.put("reserve4", obj5 != null ? obj5.toString() : "");
        }
        return new c((HashMap<String, String>) map2);
    }

    public static String b() {
        return a().f101035b;
    }

    private boolean b(c cVar) {
        int i10 = 0;
        do {
            i10++;
            try {
                SLog.i("AttaReporter", "doAttaReportItem post " + cVar);
                return com.tencent.open.a.f.a().b("https://h.trace.qq.com/kv", cVar.f101048a).d() == 200;
            } catch (Exception e10) {
                SLog.i("AttaReporter", "Exception", e10);
            }
        } while (i10 < 2);
        return false;
    }

    private void c() {
        while (!this.f101043j.isEmpty()) {
            c cVar = (c) this.f101043j.remove(0);
            cVar.f101048a.put("appid", this.f101035b);
            cVar.f101048a.put("app_name", this.f101036c);
            cVar.f101048a.put(Constants.PARAM_APP_VER, this.f101038e);
            cVar.f101048a.put(Constants.PARAM_PKG_NAME, this.f101039f);
            cVar.f101048a.put("qq_install", this.f101040g);
            cVar.f101048a.put(Constants.PARAM_QQ_VER, this.f101041h);
            cVar.f101048a.put("openid", this.f101037d);
            cVar.f101048a.put("time_appid_openid", cVar.f101048a.get("time") + lg.a.f131412e + this.f101035b + lg.a.f131412e + this.f101037d);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fixDirtyData--------------------------");
            sb2.append(cVar);
            SLog.i("AttaReporter", sb2.toString());
            this.f101042i.add(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        SLog.i("AttaReporter", "attaReportAtSubThread");
        if (!this.f101045l) {
            List<Serializable> listB = g.b("report_atta");
            this.f101045l = listB.isEmpty();
            this.f101042i.addAll(listB);
            Iterator<Serializable> it = listB.iterator();
            while (it.hasNext()) {
                SLog.i("AttaReporter", "attaReportAtSubThread from db = " + it.next());
            }
        }
        ArrayList arrayList = new ArrayList();
        while (!this.f101042i.isEmpty()) {
            c cVar = (c) this.f101042i.remove(0);
            if (!b(cVar)) {
                arrayList.add(cVar);
            }
        }
        if (arrayList.isEmpty()) {
            if (this.f101045l) {
                return;
            }
            SLog.i("AttaReporter", "attaReportAtSubThread clear db");
            g.a("report_atta");
            this.f101045l = true;
            return;
        }
        SLog.i("AttaReporter", "attaReportAtSubThread fail size=" + arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            SLog.i("AttaReporter", "attaReportAtSubThread fail cache to db, " + ((c) ((Serializable) it2.next())));
        }
        g.a("report_atta", arrayList);
        this.f101045l = false;
    }

    public void a(String str) {
        SLog.i("AttaReporter", "updateOpenId");
        if (str == null) {
            str = "";
        }
        this.f101037d = str;
    }

    public void a(String str, Context context) {
        SLog.i("AttaReporter", lg.a.f131415h);
        this.f101035b = str;
        this.f101036c = k.a(context);
        this.f101038e = m.d(context, com.tencent.open.utils.g.b());
        this.f101039f = com.tencent.open.utils.g.b();
        this.f101040g = k.b(context) ? "1" : "0";
        this.f101041h = m.c(context, "com.tencent.mobileqq");
        c();
        g.a();
    }

    public void a(String str, Object obj) {
        a(str, "", obj, null);
    }

    public void a(String str, String str2) {
        a(str, str2, null);
    }

    public void a(String str, String str2, Object obj, Map<String, Object> map) {
        c cVarB = b(str, str2, obj, map);
        if (!TextUtils.isEmpty(this.f101035b) && !TextUtils.isEmpty(this.f101036c) && com.tencent.open.utils.g.a() != null) {
            a(cVarB);
            return;
        }
        SLog.i("AttaReporter", "attaReport cancel appid=" + this.f101035b + ", mAppName=" + this.f101036c + ", context=" + com.tencent.open.utils.g.a() + ", " + cVarB);
        this.f101043j.add(cVarB);
    }

    public void a(String str, String str2, Map<String, Object> map) {
        a(str, str2, "", map);
    }
}
