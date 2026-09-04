package com.alibaba.sdk.android.httpdns.b;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37904a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ArrayList<g> f20a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f37905b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public ArrayList<g> f21b;
    public String host;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public long f37906id;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f37907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f37908n;

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("[HostRecord] ");
        sb2.append("id:");
        sb2.append(this.f37906id);
        sb2.append("|");
        sb2.append("host:");
        sb2.append(this.host);
        sb2.append("|");
        sb2.append("sp:");
        sb2.append(this.f37907m);
        sb2.append("|");
        sb2.append("time:");
        sb2.append(this.f37908n);
        sb2.append("|");
        sb2.append("ips:");
        ArrayList<g> arrayList = this.f20a;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<g> it = this.f20a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
            }
        }
        sb2.append("|");
        sb2.append("ipsv6:");
        ArrayList<g> arrayList2 = this.f21b;
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator<g> it2 = this.f21b.iterator();
            while (it2.hasNext()) {
                sb2.append(it2.next());
            }
        }
        sb2.append("|");
        sb2.append("extra:");
        sb2.append(this.f37904a);
        sb2.append("|");
        sb2.append("cacheKey:");
        sb2.append(this.f37905b);
        sb2.append("|");
        return sb2.toString();
    }
}
