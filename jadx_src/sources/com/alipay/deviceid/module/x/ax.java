package com.alipay.deviceid.module.x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* JADX INFO: compiled from: HttpUrlRequest.java */
/* JADX INFO: loaded from: classes6.dex */
public final class ax extends bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f38264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    byte[] f38265b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f38268e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<Header> f38267d = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, String> f38269h = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f38266c = "application/x-www-form-urlencoded";

    public ax(String str) {
        this.f38264a = str;
    }

    public final String a(String str) {
        Map<String, String> map = this.f38269h;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final void a(String str, String str2) {
        if (this.f38269h == null) {
            this.f38269h = new HashMap();
        }
        this.f38269h.put(str, str2);
    }

    public final void a(Header header) {
        this.f38267d.add(header);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ax.class != obj.getClass()) {
            return false;
        }
        ax axVar = (ax) obj;
        byte[] bArr = this.f38265b;
        if (bArr == null) {
            if (axVar.f38265b != null) {
                return false;
            }
        } else if (!bArr.equals(axVar.f38265b)) {
            return false;
        }
        String str = this.f38264a;
        if (str == null) {
            if (axVar.f38264a != null) {
                return false;
            }
        } else if (!str.equals(axVar.f38264a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Map<String, String> map = this.f38269h;
        int iHashCode = ((map == null || !map.containsKey("id")) ? 1 : this.f38269h.get("id").hashCode() + 31) * 31;
        String str = this.f38264a;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return String.format("Url : %s,HttpHeader: %s", this.f38264a, this.f38267d);
    }
}
