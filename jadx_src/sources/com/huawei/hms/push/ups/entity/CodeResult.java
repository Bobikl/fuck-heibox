package com.huawei.hms.push.ups.entity;

/* JADX INFO: loaded from: classes7.dex */
public class CodeResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f61299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f61300b;

    public CodeResult() {
    }

    public CodeResult(int i10) {
        this.f61299a = i10;
    }

    public CodeResult(int i10, String str) {
        this.f61299a = i10;
        this.f61300b = str;
    }

    public String getReason() {
        return this.f61300b;
    }

    public int getReturnCode() {
        return this.f61299a;
    }

    public void setReason(String str) {
        this.f61300b = str;
    }

    public void setReturnCode(int i10) {
        this.f61299a = i10;
    }
}
