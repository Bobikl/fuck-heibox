package com.igexin.push.c;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.igexin.push.config.SDKUrlConfig;
import com.max.xiaoheihe.module.voice.HeyboxMicFragment;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f63392e = "DT_" + o.class.getName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long f63393a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f63400i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Map<String, k> f63394b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Map<String, j> f63395c = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f63397f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f63398g = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected a f63396d = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Comparator<Map.Entry<String, j>> f63399h = new p(this);

    public o(String str, String str2) {
        if (!SDKUrlConfig.hasMultipleXfr()) {
            a();
        } else {
            b(str);
            c(str2);
        }
    }

    private j a(JSONObject jSONObject) throws Exception {
        if (!jSONObject.has("domain")) {
            return null;
        }
        j jVar = new j();
        jVar.a(jSONObject.getString("domain"));
        if (jSONObject.has(HeyboxMicFragment.f93763y)) {
            jVar.a(jSONObject.getInt(HeyboxMicFragment.f93763y));
        }
        if (jSONObject.has("ip")) {
            jVar.b(jSONObject.getString("ip"));
        }
        if (jSONObject.has("consumeTime")) {
            jVar.a(jSONObject.getLong("consumeTime"));
        }
        if (jSONObject.has("detectSuccessTime")) {
            jVar.b(jSONObject.getLong("detectSuccessTime"));
        }
        if (jSONObject.has("isDomain")) {
            jVar.a(jSONObject.getBoolean("isDomain"));
        }
        return jVar;
    }

    private List<String> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(jSONArray.getJSONObject(i10).getString("domain"));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private void a() {
        this.f63393a = 0L;
        if (q()) {
            if (com.igexin.push.core.d.f63666ak != null) {
                com.igexin.push.core.b.i.a().b("null", true);
            }
        } else if (com.igexin.push.core.d.f63667al != null) {
            com.igexin.push.core.b.i.a().b("null", false);
        }
        List<String> listN = n();
        ArrayList arrayList = new ArrayList();
        for (String str : listN) {
            j jVar = new j(str, Integer.parseInt(com.igexin.a.a.b.e.a(str)[2]));
            if (listN.size() > 1) {
                a(jVar);
            }
            arrayList.add(jVar);
        }
        this.f63396d.b(arrayList);
        listN.clear();
    }

    private void a(j jVar) {
        k kVar = new k();
        kVar.a(b() == h.WIFI);
        kVar.a(c());
        kVar.a(jVar);
        synchronized (this.f63398g) {
            this.f63394b.put(jVar.a(), kVar);
        }
    }

    private void b(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            a();
            return;
        }
        JSONArray jSONArray = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            a();
            return;
        }
        if (jSONObject.has("lastDetectTime")) {
            try {
                this.f63393a = jSONObject.getLong("lastDetectTime");
            } catch (JSONException unused2) {
            }
        }
        if (Math.abs(System.currentTimeMillis() - this.f63393a) >= f.f63358a) {
            a();
            return;
        }
        if (jSONObject.has("list")) {
            try {
                jSONArray = jSONObject.getJSONArray("list");
            } catch (JSONException unused3) {
            }
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            a();
            return;
        }
        List<String> listA = a(jSONArray);
        if (listA.isEmpty()) {
            a();
            return;
        }
        List<String> listN = n();
        ArrayList arrayList = new ArrayList(listN);
        arrayList.retainAll(listA);
        if (arrayList.size() == listA.size()) {
            com.igexin.a.a.c.b.a(f63392e + " | db cache xfr == default, use cache", new Object[0]);
            b(jSONArray);
            return;
        }
        com.igexin.a.a.c.b.a(f63392e + " | db cache xfr != default, use default", new Object[0]);
        arrayList.clear();
        listN.clear();
        listA.clear();
        a();
    }

    private void b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                j jVarA = a(jSONObject);
                if (jVarA != null) {
                    this.f63395c.put(jVarA.a(), jVarA);
                } else {
                    try {
                        jVarA = d(jSONObject.getString("domain"));
                    } catch (Exception e10) {
                        com.igexin.a.a.c.b.a(f63392e + "|initWithCacheData exception " + e10.toString(), new Object[0]);
                        this.f63395c.clear();
                        a();
                        return;
                    }
                }
                if (jVarA != null) {
                    a(jVarA);
                    arrayList.add(jVarA);
                }
            } catch (Exception e11) {
                com.igexin.a.a.c.b.a(f63392e + "|initWithCacheData exception " + e11.toString(), new Object[0]);
                return;
            }
        }
        this.f63396d.b(arrayList);
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        if (jSONObject.has("loginFailedlCnt")) {
            try {
                this.f63396d.f63335c = jSONObject.getInt("loginFailedlCnt");
            } catch (JSONException unused2) {
            }
        }
        if (jSONObject.has("lastChange2BackupTime")) {
            try {
                this.f63396d.f63336d = jSONObject.getLong("lastChange2BackupTime");
            } catch (JSONException unused3) {
            }
        }
        if (jSONObject.has("lastOfflineTime")) {
            try {
                this.f63396d.f63337e = jSONObject.getLong("lastOfflineTime");
            } catch (JSONException unused4) {
            }
        }
        if (jSONObject.has("domainType")) {
            try {
                this.f63396d.f63333a = d.a(jSONObject.getInt("domainType"));
                if (this.f63396d.f63333a == d.BACKUP) {
                    this.f63396d.f63334b.set(true);
                }
            } catch (JSONException unused5) {
            }
        }
    }

    private j d(String str) {
        j jVar = new j();
        String[] strArrA = com.igexin.a.a.b.e.a(str);
        jVar.a(str);
        jVar.a(Integer.parseInt(strArrA[2]));
        return jVar;
    }

    private List<String> n() {
        return SDKUrlConfig.getDefaultXfrList();
    }

    private void o() {
        synchronized (this.f63397f) {
            this.f63395c.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        com.igexin.push.core.b.i iVarA;
        String string;
        boolean z10;
        this.f63393a = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f63398g) {
            try {
                jSONObject.put("lastDetectTime", this.f63393a);
                jSONObject.put("list", jSONArray);
                Iterator<Map.Entry<String, k>> it = this.f63394b.entrySet().iterator();
                while (it.hasNext()) {
                    JSONObject jSONObjectH = it.next().getValue().b().h();
                    if (jSONObjectH != null) {
                        jSONArray.put(jSONObjectH);
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (jSONObject.length() > 0) {
            if (q()) {
                iVarA = com.igexin.push.core.b.i.a();
                string = jSONObject.toString();
                z10 = true;
            } else {
                iVarA = com.igexin.push.core.b.i.a();
                string = jSONObject.toString();
                z10 = false;
            }
            iVarA.b(string, z10);
        }
    }

    private boolean q() {
        return b() == h.MOBILE;
    }

    protected k a(String str) {
        synchronized (this.f63398g) {
            for (Map.Entry<String, k> entry : this.f63394b.entrySet()) {
                if (entry.getKey().equals(str)) {
                    return entry.getValue();
                }
            }
            return null;
        }
    }

    public abstract h b();

    protected void b(j jVar) {
        synchronized (this.f63397f) {
            this.f63395c.put(jVar.a(), jVar);
        }
        this.f63396d.e();
    }

    public abstract r c();

    public void d() {
        if (!j()) {
            com.igexin.a.a.c.b.a(f63392e + "|startDetect detect = false, return !!!", new Object[0]);
            return;
        }
        com.igexin.a.a.c.b.a(f63392e + "|startDetect detect = true, start detect !!!", new Object[0]);
        h();
    }

    public void e() {
        synchronized (this.f63398g) {
            for (Map.Entry<String, k> entry : this.f63394b.entrySet()) {
                entry.getValue().a((r) null);
                entry.getValue().d();
            }
        }
    }

    public void f() {
        e();
        o();
        List<String> listN = n();
        synchronized (this.f63398g) {
            int size = this.f63394b.size();
            if (listN.size() < size) {
                int size2 = size - listN.size();
                Iterator<Map.Entry<String, k>> it = this.f63394b.entrySet().iterator();
                for (int i10 = 0; it.hasNext() && i10 < size2; i10++) {
                    it.next().getValue().e();
                    it.remove();
                }
            }
            ArrayList arrayList = new ArrayList(this.f63394b.values());
            this.f63394b.clear();
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < listN.size(); i11++) {
                j jVar = new j();
                String[] strArrA = com.igexin.a.a.b.e.a(listN.get(i11));
                jVar.a(listN.get(i11));
                jVar.a(Integer.parseInt(strArrA[2]));
                if (i11 < size) {
                    k kVar = (k) arrayList.get(i11);
                    kVar.a(jVar);
                    this.f63394b.put(jVar.a(), kVar);
                } else {
                    a(jVar);
                }
                arrayList2.add(jVar);
            }
            this.f63396d.b(arrayList2);
        }
    }

    public void g() {
        e();
        o();
        List<String> listN = n();
        synchronized (this.f63398g) {
            Iterator<Map.Entry<String, k>> it = this.f63394b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().e();
            }
            this.f63394b.clear();
            ArrayList arrayList = new ArrayList();
            j jVar = new j();
            String[] strArrA = com.igexin.a.a.b.e.a(listN.get(0));
            jVar.a(listN.get(0));
            jVar.a(Integer.parseInt(strArrA[2]));
            arrayList.add(jVar);
            this.f63396d.b(arrayList);
            arrayList.clear();
        }
    }

    public void h() {
        this.f63393a = System.currentTimeMillis();
        synchronized (this.f63398g) {
            for (Map.Entry<String, k> entry : this.f63394b.entrySet()) {
                entry.getValue().a(c());
                if (entry.getValue().b() != null) {
                    entry.getValue().b().b();
                }
                entry.getValue().c();
            }
        }
    }

    protected void i() {
        com.igexin.push.core.b.i.a().b("null", true);
        com.igexin.push.core.b.i.a().b("null", false);
    }

    protected boolean j() {
        long jAbs = Math.abs(System.currentTimeMillis() - this.f63393a);
        long j10 = f.f63358a;
        if (jAbs >= (2 * j10) - 3600) {
            com.igexin.a.a.c.b.a(f63392e + "|current time - last detect time > " + (j10 / 1000) + " s, detect = true", new Object[0]);
            m.f63387a.set(true);
            return true;
        }
        if (!m.f63387a.getAndSet(true)) {
            long jAbs2 = Math.abs(j10 - jAbs);
            m.c_().a(jAbs2);
            com.igexin.a.a.c.b.a(f63392e + "|set next detect time = " + jAbs2, new Object[0]);
        }
        return false;
    }

    protected synchronized void k() {
        this.f63396d.f();
    }

    public void l() {
        synchronized (o.class) {
            if (this.f63400i == null) {
                HandlerThread handlerThread = new HandlerThread("NetDetect-T");
                handlerThread.start();
                this.f63400i = new Handler(handlerThread.getLooper());
            }
        }
        this.f63400i.removeCallbacksAndMessages("detToken");
        this.f63400i.postAtTime(new q(this), "detToken", SystemClock.uptimeMillis() + 5000);
    }

    protected synchronized void m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("loginFailedlCnt", this.f63396d.f63335c);
            jSONObject.put("lastChange2BackupTime", this.f63396d.f63336d);
            jSONObject.put("lastOfflineTime", this.f63396d.f63337e);
            jSONObject.put("domainType", this.f63396d.f63333a.b());
        } catch (Exception unused) {
        }
        if (jSONObject.length() > 0) {
            if (q()) {
                com.igexin.push.core.b.i.a().a(jSONObject.toString(), true);
            } else {
                com.igexin.push.core.b.i.a().a(jSONObject.toString(), false);
            }
        }
    }
}
