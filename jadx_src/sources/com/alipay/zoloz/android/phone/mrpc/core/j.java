package com.alipay.zoloz.android.phone.mrpc.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* JADX INFO: compiled from: HttpUrlRequest.java */
/* JADX INFO: loaded from: classes6.dex */
public class j extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f39719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f39720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f39721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<Header> f39722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, String> f39723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39724h;

    public j(String str) {
        this.f39719c = str;
        this.f39722f = new ArrayList<>();
        this.f39723g = new HashMap();
        this.f39721e = "application/x-www-form-urlencoded";
    }

    public j(String str, byte[] bArr, ArrayList<Header> arrayList, HashMap<String, String> map) {
        this.f39719c = str;
        this.f39720d = bArr;
        this.f39722f = arrayList;
        this.f39723g = map;
        this.f39721e = "application/x-www-form-urlencoded";
    }

    public void e(Header header) {
        this.f39722f.add(header);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        byte[] bArr = this.f39720d;
        if (bArr == null) {
            if (jVar.f39720d != null) {
                return false;
            }
        } else if (!bArr.equals(jVar.f39720d)) {
            return false;
        }
        String str = this.f39719c;
        if (str == null) {
            if (jVar.f39719c != null) {
                return false;
            }
        } else if (!str.equals(jVar.f39719c)) {
            return false;
        }
        return true;
    }

    public void f(String str, String str2) {
        if (this.f39723g == null) {
            this.f39723g = new HashMap();
        }
        this.f39723g.put(str, str2);
    }

    public String g() {
        return this.f39721e;
    }

    public ArrayList<Header> h() {
        return this.f39722f;
    }

    public int hashCode() {
        Map<String, String> map = this.f39723g;
        int iHashCode = ((map == null || !map.containsKey("id")) ? 1 : this.f39723g.get("id").hashCode() + 31) * 31;
        String str = this.f39719c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String i() {
        return l() + Integer.toHexString(j().hashCode());
    }

    public byte[] j() {
        return this.f39720d;
    }

    public String k(String str) {
        Map<String, String> map = this.f39723g;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public String l() {
        return this.f39719c;
    }

    public boolean m() {
        return this.f39724h;
    }

    public void n(String str) {
        this.f39721e = str;
    }

    public void o(ArrayList<Header> arrayList) {
        this.f39722f = arrayList;
    }

    public void p(byte[] bArr) {
        this.f39720d = bArr;
    }

    public void q(boolean z10) {
        this.f39724h = z10;
    }

    public void r(Map<String, String> map) {
        this.f39723g = map;
    }

    public String s(String str) {
        this.f39719c = str;
        return str;
    }

    public String toString() {
        return String.format("Url : %s,HttpHeader: %s", l(), h());
    }
}
