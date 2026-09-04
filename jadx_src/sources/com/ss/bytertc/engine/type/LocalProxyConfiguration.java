package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public class LocalProxyConfiguration {
    public String localProxyIp;
    public String localProxyPassword;
    public int localProxyPort;
    public LocalProxyType localProxyType;
    public String localProxyUsername;

    public LocalProxyConfiguration(LocalProxyType localProxyType, String str, int i10, String str2, String str3) {
        this.localProxyType = localProxyType;
        this.localProxyIp = str;
        this.localProxyPort = i10;
        this.localProxyUsername = str2;
        this.localProxyPassword = str3;
    }
}
