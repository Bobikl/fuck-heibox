package com.igexin.sdk.message;

/* JADX INFO: loaded from: classes6.dex */
public class BindAliasCmdMessage extends GTCmdMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f64100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f64101b;

    public BindAliasCmdMessage() {
    }

    public BindAliasCmdMessage(String str, String str2, int i10) {
        super(i10);
        this.f64100a = str;
        this.f64101b = str2;
    }

    public String getCode() {
        return this.f64101b;
    }

    public String getSn() {
        return this.f64100a;
    }

    public void setCode(String str) {
        this.f64101b = str;
    }

    public void setSn(String str) {
        this.f64100a = str;
    }

    public String toString() {
        return "BindAliasCmdMessage{sn='" + this.f64100a + "', code='" + this.f64101b + "'}";
    }
}
