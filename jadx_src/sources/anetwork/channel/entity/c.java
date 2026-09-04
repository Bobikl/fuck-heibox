package anetwork.channel.entity;

import android.text.TextUtils;
import anet.channel.request.BodyEntry;
import anet.channel.util.ALog;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class c implements s3.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    private URI f30203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    private URL f30204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30205c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<s3.a> f30207e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<s3.g> f30209g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f30213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f30214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f30215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f30216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map<String, String> f30217o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30206d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f30208f = "GET";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f30210h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f30211i = "utf-8";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BodyEntry f30212j = null;

    public c() {
    }

    public c(String str) {
        this.f30205c = str;
    }

    @Deprecated
    public c(URI uri) {
        this.f30203a = uri;
        this.f30205c = uri.toString();
    }

    @Deprecated
    public c(URL url) {
        this.f30204b = url;
        this.f30205c = url.toString();
    }

    @Override // s3.h
    public void A(int i10) {
        this.f30214l = i10;
    }

    @Override // s3.h
    public void B(String str) {
        this.f30208f = str;
    }

    @Override // s3.h
    public String C(String str) {
        Map<String, String> map = this.f30217o;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // s3.h
    public void D(int i10) {
        this.f30210h = i10;
    }

    @Deprecated
    public void E(URL url) {
        this.f30204b = url;
        this.f30205c = url.toString();
    }

    @Override // s3.h
    public String a() {
        return this.f30215m;
    }

    @Override // s3.h
    public void addHeader(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        if (this.f30207e == null) {
            this.f30207e = new ArrayList();
        }
        this.f30207e.add(new a(str, str2));
    }

    @Override // s3.h
    public List<s3.a> b() {
        return this.f30207e;
    }

    @Override // s3.h
    public void c(String str) {
        this.f30216n = str;
    }

    @Override // s3.h
    public void d(s3.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f30207e == null) {
            this.f30207e = new ArrayList();
        }
        int i10 = 0;
        int size = this.f30207e.size();
        while (i10 < size) {
            if (aVar.getName().equalsIgnoreCase(this.f30207e.get(i10).getName())) {
                this.f30207e.set(i10, aVar);
                break;
            }
            i10++;
        }
        if (i10 < this.f30207e.size()) {
            this.f30207e.add(aVar);
        }
    }

    @Override // s3.h
    public boolean e() {
        return this.f30206d;
    }

    @Override // s3.h
    public int f() {
        return this.f30210h;
    }

    @Override // s3.h
    public void g(List<s3.g> list) {
        this.f30209g = list;
    }

    @Override // s3.h
    public int getConnectTimeout() {
        return this.f30213k;
    }

    @Override // s3.h
    public s3.a[] getHeaders(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f30207e == null) {
            return null;
        }
        for (int i10 = 0; i10 < this.f30207e.size(); i10++) {
            if (this.f30207e.get(i10) != null && this.f30207e.get(i10).getName() != null && this.f30207e.get(i10).getName().equalsIgnoreCase(str)) {
                arrayList.add(this.f30207e.get(i10));
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        s3.a[] aVarArr = new s3.a[arrayList.size()];
        arrayList.toArray(aVarArr);
        return aVarArr;
    }

    @Override // s3.h
    public String getMethod() {
        return this.f30208f;
    }

    @Override // s3.h
    public List<s3.g> getParams() {
        return this.f30209g;
    }

    @Override // s3.h
    public int getReadTimeout() {
        return this.f30214l;
    }

    @Override // s3.h
    @Deprecated
    public URI getURI() {
        URI uri = this.f30203a;
        if (uri != null) {
            return uri;
        }
        if (this.f30205c != null) {
            try {
                this.f30203a = new URI(this.f30205c);
            } catch (Exception e10) {
                ALog.e("anet.RequestImpl", "uri error", this.f30216n, e10, new Object[0]);
            }
        }
        return this.f30203a;
    }

    @Override // s3.h
    @Deprecated
    public URL getURL() {
        URL url = this.f30204b;
        if (url != null) {
            return url;
        }
        if (this.f30205c != null) {
            try {
                this.f30204b = new URL(this.f30205c);
            } catch (Exception e10) {
                ALog.e("anet.RequestImpl", "url error", this.f30216n, e10, new Object[0]);
            }
        }
        return this.f30204b;
    }

    @Override // s3.h
    public String h() {
        return this.f30205c;
    }

    @Override // s3.h
    @Deprecated
    public s3.b i() {
        return null;
    }

    @Override // s3.h
    @Deprecated
    public boolean j() {
        return !"false".equals(C(w3.a.f140968d));
    }

    @Override // s3.h
    public BodyEntry k() {
        return this.f30212j;
    }

    @Override // s3.h
    public String l() {
        return this.f30216n;
    }

    @Override // s3.h
    @Deprecated
    public void m(URI uri) {
        this.f30203a = uri;
    }

    @Override // s3.h
    public void n(List<s3.a> list) {
        this.f30207e = list;
    }

    @Override // s3.h
    public void o(int i10) {
        this.f30213k = i10;
    }

    @Override // s3.h
    public void p(s3.a aVar) {
        List<s3.a> list = this.f30207e;
        if (list != null) {
            list.remove(aVar);
        }
    }

    @Override // s3.h
    public void q(String str) {
        this.f30211i = str;
    }

    @Override // s3.h
    public void r(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f30217o == null) {
            this.f30217o = new HashMap();
        }
        this.f30217o.put(str, str2);
    }

    @Override // s3.h
    public void s(s3.b bVar) {
        this.f30212j = new BodyHandlerEntry(bVar);
    }

    @Override // s3.h
    @Deprecated
    public void t(boolean z10) {
        r(w3.a.f140968d, z10 ? "true" : "false");
    }

    @Override // s3.h
    public void u(boolean z10) {
        this.f30206d = z10;
    }

    @Override // s3.h
    public Map<String, String> v() {
        return this.f30217o;
    }

    @Override // s3.h
    public void w(String str) {
        this.f30215m = str;
    }

    @Override // s3.h
    public void x(BodyEntry bodyEntry) {
        this.f30212j = bodyEntry;
    }

    @Override // s3.h
    @Deprecated
    public void y(int i10) {
        this.f30215m = String.valueOf(i10);
    }

    @Override // s3.h
    public String z() {
        return this.f30211i;
    }
}
