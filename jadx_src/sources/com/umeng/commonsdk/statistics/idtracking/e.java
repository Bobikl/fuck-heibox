package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.aw;
import com.umeng.analytics.pro.bc;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: IdTracker.java */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f105351a = 86400000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e f105352b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f105353c = "umeng_it.cache";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Object f105354j = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f105355d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f105357f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f105360i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.umeng.commonsdk.statistics.proto.c f105356e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Set<com.umeng.commonsdk.statistics.idtracking.a> f105359h = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f105358g = 86400000;

    /* JADX INFO: compiled from: IdTracker.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f105361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Set<String> f105362b = new HashSet();

        public a(Context context) {
            this.f105361a = context;
        }

        public synchronized void a() {
            if (!this.f105362b.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                Iterator<String> it = this.f105362b.iterator();
                while (it.hasNext()) {
                    sb2.append(it.next());
                    sb2.append(',');
                }
                sb2.deleteCharAt(sb2.length() - 1);
                PreferenceWrapper.getDefault(this.f105361a).edit().putString("invld_id", sb2.toString()).commit();
            }
        }

        public synchronized boolean a(String str) {
            return !this.f105362b.contains(str);
        }

        public synchronized void b() {
            String[] strArrSplit;
            String string = PreferenceWrapper.getDefault(this.f105361a).getString("invld_id", null);
            if (!TextUtils.isEmpty(string) && (strArrSplit = string.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) != null) {
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f105362b.add(str);
                    }
                }
            }
        }

        public synchronized void b(String str) {
            this.f105362b.add(str);
        }

        public void c(String str) {
            this.f105362b.remove(str);
        }
    }

    e(Context context) {
        this.f105360i = null;
        this.f105355d = new File(context.getFilesDir(), f105353c);
        a aVar = new a(context);
        this.f105360i = aVar;
        aVar.b();
    }

    public static synchronized e a(Context context) {
        if (f105352b == null) {
            e eVar = new e(context);
            f105352b = eVar;
            eVar.a(new f(context));
            f105352b.a(new b(context));
            f105352b.a(new j(context));
            f105352b.a(new d(context));
            f105352b.a(new c(context));
            f105352b.a(new g(context));
            f105352b.a(new i());
            if (FieldManager.allow(com.umeng.commonsdk.utils.b.G)) {
                f105352b.a(new h(context));
            }
            f105352b.f();
        }
        return f105352b;
    }

    public static synchronized void a() {
        e eVar = f105352b;
        if (eVar != null) {
            eVar.e();
            f105352b = null;
        }
    }

    private void a(com.umeng.commonsdk.statistics.proto.c cVar) {
        Map<String, com.umeng.commonsdk.statistics.proto.b> map;
        if (cVar == null || (map = cVar.f105447a) == null) {
            return;
        }
        if (map.containsKey("mac") && !FieldManager.allow(com.umeng.commonsdk.utils.b.f105525h)) {
            cVar.f105447a.remove("mac");
        }
        if (cVar.f105447a.containsKey("imei") && !FieldManager.allow(com.umeng.commonsdk.utils.b.f105524g)) {
            cVar.f105447a.remove("imei");
        }
        if (cVar.f105447a.containsKey(SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID) && !FieldManager.allow(com.umeng.commonsdk.utils.b.f105526i)) {
            cVar.f105447a.remove(SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID);
        }
        if (cVar.f105447a.containsKey("serial") && !FieldManager.allow(com.umeng.commonsdk.utils.b.f105527j)) {
            cVar.f105447a.remove("serial");
        }
        if (cVar.f105447a.containsKey("idfa") && !FieldManager.allow(com.umeng.commonsdk.utils.b.f105540w)) {
            cVar.f105447a.remove("idfa");
        }
        if (!cVar.f105447a.containsKey("oaid") || FieldManager.allow(com.umeng.commonsdk.utils.b.G)) {
            return;
        }
        cVar.f105447a.remove("oaid");
    }

    private boolean a(com.umeng.commonsdk.statistics.idtracking.a aVar) {
        if (this.f105360i.a(aVar.b())) {
            return this.f105359h.add(aVar);
        }
        if (!AnalyticsConstants.UM_DEBUG) {
            return false;
        }
        MLog.w("invalid domain: " + aVar.b());
        return false;
    }

    private void b(com.umeng.commonsdk.statistics.proto.c cVar) {
        byte[] bArrA;
        synchronized (f105354j) {
            if (cVar != null) {
                try {
                    synchronized (this) {
                        a(cVar);
                        bArrA = new bc().a(cVar);
                    }
                    if (bArrA != null) {
                        HelperUtils.writeFile(this.f105355d, bArrA);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private synchronized void h() {
        com.umeng.commonsdk.statistics.proto.c cVar = new com.umeng.commonsdk.statistics.proto.c();
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.f105359h) {
            if (aVar.c()) {
                if (aVar.d() != null) {
                    map.put(aVar.b(), aVar.d());
                }
                if (aVar.e() != null && !aVar.e().isEmpty()) {
                    arrayList.addAll(aVar.e());
                }
            }
        }
        cVar.a(arrayList);
        cVar.a(map);
        synchronized (this) {
            this.f105356e = cVar;
        }
    }

    private com.umeng.commonsdk.statistics.proto.c i() {
        Throwable th2;
        FileInputStream fileInputStream;
        synchronized (f105354j) {
            if (!this.f105355d.exists()) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(this.f105355d);
                try {
                    try {
                        byte[] streamToByteArray = HelperUtils.readStreamToByteArray(fileInputStream);
                        com.umeng.commonsdk.statistics.proto.c cVar = new com.umeng.commonsdk.statistics.proto.c();
                        new aw().a(cVar, streamToByteArray);
                        HelperUtils.safeClose(fileInputStream);
                        return cVar;
                    } catch (Exception e10) {
                        e = e10;
                        e.printStackTrace();
                        HelperUtils.safeClose(fileInputStream);
                        return null;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    HelperUtils.safeClose(fileInputStream);
                    throw th2;
                }
            } catch (Exception e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th4) {
                th2 = th4;
                fileInputStream = null;
                HelperUtils.safeClose(fileInputStream);
                throw th2;
            }
        }
    }

    public void a(long j10) {
        this.f105358g = j10;
    }

    public synchronized void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f105357f >= this.f105358g) {
            boolean z10 = false;
            for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.f105359h) {
                if (aVar.c() && aVar.a()) {
                    z10 = true;
                    if (!aVar.c()) {
                        this.f105360i.b(aVar.b());
                    }
                }
            }
            if (z10) {
                h();
                this.f105360i.a();
                g();
            }
            this.f105357f = jCurrentTimeMillis;
        }
    }

    public synchronized com.umeng.commonsdk.statistics.proto.c c() {
        return this.f105356e;
    }

    public String d() {
        return null;
    }

    public synchronized void e() {
        if (f105352b == null) {
            return;
        }
        boolean z10 = false;
        for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.f105359h) {
            if (aVar.c() && aVar.e() != null && !aVar.e().isEmpty()) {
                aVar.a((List<com.umeng.commonsdk.statistics.proto.a>) null);
                z10 = true;
            }
        }
        if (z10) {
            this.f105356e.b(false);
            g();
        }
    }

    public synchronized void f() {
        com.umeng.commonsdk.statistics.proto.c cVarI = i();
        if (cVarI == null) {
            return;
        }
        a(cVarI);
        ArrayList arrayList = new ArrayList(this.f105359h.size());
        synchronized (this) {
            this.f105356e = cVarI;
            for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.f105359h) {
                aVar.a(this.f105356e);
                if (!aVar.c()) {
                    arrayList.add(aVar);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f105359h.remove((com.umeng.commonsdk.statistics.idtracking.a) it.next());
            }
            h();
        }
    }

    public synchronized void g() {
        com.umeng.commonsdk.statistics.proto.c cVar = this.f105356e;
        if (cVar != null) {
            b(cVar);
        }
    }
}
