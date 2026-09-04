package com.igexin.sdk.message;

/* JADX INFO: loaded from: classes6.dex */
public class UnBindAliasCmdMessage extends GTCmdMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f64120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f64121b;

    public UnBindAliasCmdMessage() {
    }

    public UnBindAliasCmdMessage(String str, String str2, int i10) {
        super(i10);
        this.f64120a = str;
        this.f64121b = str2;
    }

    public String getCode() {
        return this.f64121b;
    }

    public String getSn() {
        return this.f64120a;
    }

    public void setCode(String str) {
        this.f64121b = str;
    }

    public void setSn(String str) {
        this.f64120a = str;
    }

    public String toString() {
        return "UnBindAliasCmdMessage{sn='" + this.f64120a + "', code='" + this.f64121b + "'}";
    }
}
