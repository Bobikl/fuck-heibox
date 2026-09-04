package com.alibaba.sdk.android.httpdns.probe;

/* JADX INFO: loaded from: classes6.dex */
public class IPProbeItem {
    String hostName;
    int port;

    public IPProbeItem(String str, int i10) {
        this.hostName = str;
        this.port = i10;
    }

    public String getHostName() {
        return this.hostName;
    }

    public int getPort() {
        return this.port;
    }
}
