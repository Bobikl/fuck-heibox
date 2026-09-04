package com.tencent.msdk.dns.core;

import java.io.Serializable;
import k.g;
import k.g.c;

/* JADX INFO: loaded from: classes4.dex */
public final class LookupResult<Statistics extends g.c> implements Serializable {
    private static final long serialVersionUID = 5421285648054627327L;
    public final IpSet ipSet;
    public final Statistics stat;

    public LookupResult(IpSet ipSet, Statistics statistics) {
        if (ipSet == null) {
            throw new IllegalArgumentException("ipSet".concat(" can not be null"));
        }
        if (statistics == null) {
            throw new IllegalArgumentException("stat".concat(" can not be null"));
        }
        this.ipSet = ipSet;
        this.stat = statistics;
    }

    public LookupResult(String[] strArr, Statistics statistics) {
        if (strArr == null) {
            throw new IllegalArgumentException("ips".concat(" can not be null"));
        }
        if (statistics == null) {
            throw new IllegalArgumentException("stat".concat(" can not be null"));
        }
        this.ipSet = new IpSet(strArr);
        this.stat = statistics;
    }

    public String toString() {
        return "LookupResult{ipSet=" + this.ipSet + ", stat=" + this.stat + '}';
    }
}
