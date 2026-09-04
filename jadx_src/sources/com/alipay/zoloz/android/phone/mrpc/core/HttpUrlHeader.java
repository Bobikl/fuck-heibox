package com.alipay.zoloz.android.phone.mrpc.core;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HttpUrlHeader implements Serializable {
    private static final long serialVersionUID = -6098125857367743614L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f39610b = new HashMap();

    public String a(String str) {
        return this.f39610b.get(str);
    }

    public Map<String, String> b() {
        return this.f39610b;
    }

    public void c(String str, String str2) {
        this.f39610b.put(str, str2);
    }

    public void d(Map<String, String> map) {
        this.f39610b = map;
    }
}
