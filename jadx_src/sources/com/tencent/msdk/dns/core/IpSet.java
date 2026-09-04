package com.tencent.msdk.dns.core;

import java.io.Serializable;
import java.util.Arrays;
import k.a;

/* JADX INFO: loaded from: classes4.dex */
public class IpSet implements Serializable {
    public static final IpSet EMPTY;
    private static final long serialVersionUID = 7854385648054627327L;
    public final String[] ips;
    public final String[] v4Ips;
    public final String[] v6Ips;

    static {
        String[] strArr = a.f124360a;
        EMPTY = new IpSet(strArr, strArr);
    }

    public IpSet(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("ips".concat(" can not be null"));
        }
        this.ips = strArr;
        this.v4Ips = null;
        this.v6Ips = null;
    }

    public IpSet(String[] strArr, String[] strArr2) {
        if (strArr == null) {
            throw new IllegalArgumentException("v4Ips".concat(" can not be null"));
        }
        if (strArr2 == null) {
            throw new IllegalArgumentException("v6Ips".concat(" can not be null"));
        }
        this.v4Ips = strArr;
        this.v6Ips = strArr2;
        this.ips = null;
    }

    public String toString() {
        return "IpSet{v4Ips=" + Arrays.toString(this.v4Ips) + ", v6Ips=" + Arrays.toString(this.v6Ips) + ", ips=" + Arrays.toString(this.ips) + '}';
    }
}
