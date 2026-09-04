package com.alibaba.sdk.android.httpdns;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37961b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f37962e;

    g(int i10, String str) {
        this.f37961b = i10;
        this.f37962e = new JSONObject(str).getString("code");
    }

    public String b() {
        return this.f37962e;
    }

    public int getErrorCode() {
        return this.f37961b;
    }
}
