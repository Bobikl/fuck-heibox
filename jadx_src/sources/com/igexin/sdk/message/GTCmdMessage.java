package com.igexin.sdk.message;

/* JADX INFO: loaded from: classes6.dex */
public class GTCmdMessage extends BaseMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f64106a;

    public GTCmdMessage() {
    }

    public GTCmdMessage(int i10) {
        this.f64106a = i10;
    }

    public int getAction() {
        return this.f64106a;
    }

    public void setAction(int i10) {
        this.f64106a = i10;
    }
}
