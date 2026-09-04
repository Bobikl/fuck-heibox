package com.igexin.sdk.message;

/* JADX INFO: loaded from: classes6.dex */
public class SetTagCmdMessage extends GTCmdMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f64118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f64119b;

    public SetTagCmdMessage() {
    }

    public SetTagCmdMessage(String str, String str2, int i10) {
        super(i10);
        this.f64118a = str;
        this.f64119b = str2;
    }

    public String getCode() {
        return this.f64119b;
    }

    public String getSn() {
        return this.f64118a;
    }

    public void setCode(String str) {
        this.f64119b = str;
    }

    public void setSn(String str) {
        this.f64118a = str;
    }

    public String toString() {
        return "SetTagCmdMessage{sn='" + this.f64118a + "', code='" + this.f64119b + "'}";
    }
}
