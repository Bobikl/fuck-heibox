package com.igexin.sdk.message;

/* JADX INFO: loaded from: classes6.dex */
public class GTTransmitMessage extends GTPushMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f64114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f64115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f64116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f64117d;

    public GTTransmitMessage() {
    }

    public GTTransmitMessage(String str, String str2, String str3, byte[] bArr) {
        this.f64114a = str;
        this.f64115b = str2;
        this.f64116c = str3;
        this.f64117d = bArr;
    }

    public String getMessageId() {
        return this.f64115b;
    }

    public byte[] getPayload() {
        return this.f64117d;
    }

    public String getPayloadId() {
        return this.f64116c;
    }

    public String getTaskId() {
        return this.f64114a;
    }

    public void setMessageId(String str) {
        this.f64115b = str;
    }

    public void setPayload(byte[] bArr) {
        this.f64117d = bArr;
    }

    public void setPayloadId(String str) {
        this.f64116c = str;
    }

    public void setTaskId(String str) {
        this.f64114a = str;
    }
}
