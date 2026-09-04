package com.xiaomi.push;

import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.max.hblogistics.bean.address.AdminRegionObj;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class cz {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private long f260a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f261a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f106938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f106939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f106940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f106941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f106942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String f106943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f106944i;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ArrayList<di> f262a = new ArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f106936a = 0.1d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f106945j = "s.mi1.cc";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f106937b = 86400000;

    public cz(String str) {
        this.f261a = "";
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        this.f260a = System.currentTimeMillis();
        this.f262a.add(new di(str, -1));
        this.f261a = dd.m239a();
        this.f263b = str;
    }

    private synchronized void c(String str) {
        Iterator<di> it = this.f262a.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f279a, str)) {
                it.remove();
            }
        }
    }

    public synchronized cz a(JSONObject jSONObject) {
        this.f261a = jSONObject.optString(h5.b.f119111k);
        this.f106937b = jSONObject.getLong(RemoteMessageConst.TTL);
        this.f106936a = jSONObject.getDouble("pct");
        this.f260a = jSONObject.getLong("ts");
        this.f106939d = jSONObject.optString(AdminRegionObj.TYPE_CITY);
        this.f106938c = jSONObject.optString("prv");
        this.f106942g = jSONObject.optString("cty");
        this.f106940e = jSONObject.optString("isp");
        this.f106941f = jSONObject.optString("ip");
        this.f263b = jSONObject.optString("host");
        this.f106943h = jSONObject.optString("xf");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(new di().a(jSONArray.getJSONObject(i10)));
        }
        return this;
    }

    public synchronized String a() {
        if (!TextUtils.isEmpty(this.f106944i)) {
            return this.f106944i;
        }
        if (TextUtils.isEmpty(this.f106940e)) {
            return "hardcode_isp";
        }
        String strA = bp.a(new String[]{this.f106940e, this.f106938c, this.f106939d, this.f106942g, this.f106941f}, lg.a.f131412e);
        this.f106944i = strA;
        return strA;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized ArrayList<String> m230a() {
        return a(false);
    }

    public ArrayList<String> a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the url is empty.");
        }
        URL url = new URL(str);
        if (!TextUtils.equals(url.getHost(), this.f263b)) {
            throw new IllegalArgumentException("the url is not supported by the fallback");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it = a(true).iterator();
        while (it.hasNext()) {
            db dbVarA = db.a(it.next(), url.getPort());
            arrayList.add(new URL(url.getProtocol(), dbVarA.m238a(), dbVarA.a(), url.getFile()).toString());
        }
        return arrayList;
    }

    public synchronized ArrayList<String> a(boolean z10) {
        ArrayList<String> arrayList;
        int size = this.f262a.size();
        di[] diVarArr = new di[size];
        this.f262a.toArray(diVarArr);
        Arrays.sort(diVarArr);
        arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < size; i10++) {
            di diVar = diVarArr[i10];
            if (z10) {
                arrayList.add(diVar.f279a);
            } else {
                int iIndexOf = diVar.f279a.indexOf(":");
                if (iIndexOf != -1) {
                    arrayList.add(diVar.f279a.substring(0, iIndexOf));
                } else {
                    arrayList.add(diVar.f279a);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized JSONObject m231a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put(h5.b.f119111k, this.f261a);
        jSONObject.put(RemoteMessageConst.TTL, this.f106937b);
        jSONObject.put("pct", this.f106936a);
        jSONObject.put("ts", this.f260a);
        jSONObject.put(AdminRegionObj.TYPE_CITY, this.f106939d);
        jSONObject.put("prv", this.f106938c);
        jSONObject.put("cty", this.f106942g);
        jSONObject.put("isp", this.f106940e);
        jSONObject.put("ip", this.f106941f);
        jSONObject.put("host", this.f263b);
        jSONObject.put("xf", this.f106943h);
        JSONArray jSONArray = new JSONArray();
        Iterator<di> it = this.f262a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().a());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    public void a(double d10) {
        this.f106936a = d10;
    }

    public void a(long j10) {
        if (j10 > 0) {
            this.f106937b = j10;
            return;
        }
        throw new IllegalArgumentException("the duration is invalid " + j10);
    }

    synchronized void a(di diVar) {
        c(diVar.f279a);
        this.f262a.add(diVar);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized void m232a(String str) {
        a(new di(str));
    }

    public void a(String str, int i10, long j10, long j11, Exception exc) {
        a(str, new cy(i10, j10, j11, exc));
    }

    public void a(String str, long j10, long j11) {
        try {
            b(new URL(str).getHost(), j10, j11);
        } catch (MalformedURLException unused) {
        }
    }

    public void a(String str, long j10, long j11, Exception exc) {
        try {
            b(new URL(str).getHost(), j10, j11, exc);
        } catch (MalformedURLException unused) {
        }
    }

    public synchronized void a(String str, cy cyVar) {
        for (di diVar : this.f262a) {
            if (TextUtils.equals(str, diVar.f279a)) {
                diVar.a(cyVar);
                break;
            }
        }
    }

    public synchronized void a(String[] strArr) {
        int i10;
        int size = this.f262a.size() - 1;
        while (true) {
            i10 = 0;
            if (size < 0) {
                break;
            }
            int length = strArr.length;
            while (i10 < length) {
                if (TextUtils.equals(this.f262a.get(size).f279a, strArr[i10])) {
                    this.f262a.remove(size);
                    break;
                }
                i10++;
            }
            size--;
        }
        Iterator<di> it = this.f262a.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            int i12 = it.next().f106956a;
            if (i12 > i11) {
                i11 = i12;
            }
        }
        while (i10 < strArr.length) {
            a(new di(strArr[i10], (strArr.length + i11) - i10));
            i10++;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m233a() {
        return TextUtils.equals(this.f261a, dd.m239a());
    }

    public boolean a(cz czVar) {
        return TextUtils.equals(this.f261a, czVar.f261a);
    }

    public void b(String str) {
        this.f106945j = str;
    }

    public void b(String str, long j10, long j11) {
        a(str, 0, j10, j11, null);
    }

    public void b(String str, long j10, long j11, Exception exc) {
        a(str, -1, j10, j11, exc);
    }

    public boolean b() {
        return System.currentTimeMillis() - this.f260a < this.f106937b;
    }

    boolean c() {
        long j10 = this.f106937b;
        if (864000000 >= j10) {
            j10 = 864000000;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = this.f260a;
        return jCurrentTimeMillis - j11 > j10 || (jCurrentTimeMillis - j11 > this.f106937b && this.f261a.startsWith("WIFI-"));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f261a);
        sb2.append("\n");
        sb2.append(a());
        for (di diVar : this.f262a) {
            sb2.append("\n");
            sb2.append(diVar.toString());
        }
        sb2.append("\n");
        return sb2.toString();
    }
}
