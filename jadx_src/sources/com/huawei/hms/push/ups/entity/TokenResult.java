package com.huawei.hms.push.ups.entity;

/* JADX INFO: loaded from: classes7.dex */
public class TokenResult extends CodeResult {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f61301c;

    public TokenResult() {
    }

    public TokenResult(int i10) {
        super(i10);
    }

    public TokenResult(int i10, String str) {
        super(i10, str);
    }

    public TokenResult(String str) {
        this.f61301c = str;
    }

    public String getToken() {
        return this.f61301c;
    }

    public void setToken(String str) {
        this.f61301c = str;
    }
}
