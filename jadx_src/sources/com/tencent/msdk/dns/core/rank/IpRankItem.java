package com.tencent.msdk.dns.core.rank;

import bb.c;

/* JADX INFO: loaded from: classes4.dex */
public class IpRankItem {
    private final String hostName;
    private final int port;

    public IpRankItem(String str) {
        this.hostName = str;
        this.port = c.k.f33991z3;
    }

    public IpRankItem(String str, int i10) {
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
