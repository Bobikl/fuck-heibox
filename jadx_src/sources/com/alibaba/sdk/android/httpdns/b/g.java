package com.alibaba.sdk.android.httpdns.b;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f37909i;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public long f37910id;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f37911o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f37912p;

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("[IpRecord] ");
        sb2.append("id:");
        sb2.append(this.f37910id);
        sb2.append("|");
        sb2.append("host_id:");
        sb2.append(this.f37909i);
        sb2.append("|");
        sb2.append("ip:");
        sb2.append(this.f37911o);
        sb2.append("|");
        sb2.append("ttl:");
        sb2.append(this.f37912p);
        sb2.append("|");
        return sb2.toString();
    }
}
