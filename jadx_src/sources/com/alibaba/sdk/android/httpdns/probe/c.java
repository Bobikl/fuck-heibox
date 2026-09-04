package com.alibaba.sdk.android.httpdns.probe;

/* JADX INFO: loaded from: classes6.dex */
public class c {
    private String hostName;
    private String[] ips;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f37995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f37996l;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f37997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f37998s;

    c(String str, String[] strArr, String str2, String str3, long j10, long j11) {
        this.hostName = str;
        this.ips = strArr;
        this.f37997r = str2;
        this.f37998s = str3;
        this.f37995k = j10;
        this.f37996l = j11;
    }

    public long c() {
        return this.f37995k;
    }

    public long d() {
        return this.f37996l;
    }

    public String getHostName() {
        return this.hostName;
    }

    public String[] getIps() {
        return this.ips;
    }

    public String j() {
        return this.f37997r;
    }

    public String k() {
        return this.f37998s;
    }
}
