package com.alipay.android.phone.mrpc.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f38122c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f38126g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<Header> f38124e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, String> f38125f = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38123d = "application/x-www-form-urlencoded";

    public o(String str) {
        this.f38121b = str;
    }

    public final String a() {
        return this.f38121b;
    }

    public final void a(String str) {
        this.f38123d = str;
    }

    public final void a(String str, String str2) {
        if (this.f38125f == null) {
            this.f38125f = new HashMap();
        }
        this.f38125f.put(str, str2);
    }

    public final void a(Header header) {
        this.f38124e.add(header);
    }

    public final void a(boolean z10) {
        this.f38126g = z10;
    }

    public final void a(byte[] bArr) {
        this.f38122c = bArr;
    }

    public final String b(String str) {
        Map<String, String> map = this.f38125f;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final byte[] b() {
        return this.f38122c;
    }

    public final String c() {
        return this.f38123d;
    }

    public final ArrayList<Header> d() {
        return this.f38124e;
    }

    public final boolean e() {
        return this.f38126g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        byte[] bArr = this.f38122c;
        if (bArr == null) {
            if (oVar.f38122c != null) {
                return false;
            }
        } else if (!bArr.equals(oVar.f38122c)) {
            return false;
        }
        String str = this.f38121b;
        String str2 = oVar.f38121b;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Map<String, String> map = this.f38125f;
        int iHashCode = ((map == null || !map.containsKey("id")) ? 1 : this.f38125f.get("id").hashCode() + 31) * 31;
        String str = this.f38121b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return String.format("Url : %s,HttpHeader: %s", this.f38121b, this.f38124e);
    }
}
