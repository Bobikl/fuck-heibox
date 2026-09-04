package com.alibaba.sdk.android.httpdns;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HTTPDNSResult {
    Map<String, String> extra;
    String host;
    String[] ips;

    HTTPDNSResult(String str, String[] strArr, Map<String, String> map) {
        this.host = str;
        this.ips = strArr;
        this.extra = map;
    }

    public Map<String, String> getExtras() {
        return this.extra;
    }

    public String getHost() {
        return this.host;
    }

    public String[] getIps() {
        return this.ips;
    }

    public String toString() {
        return "host:" + this.host + ", ips:" + Arrays.toString(this.ips) + ", extras:" + this.extra;
    }
}
