package com.tencent.beacon.event.immediate;

/* JADX INFO: loaded from: classes4.dex */
public class BeaconTransferResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f99136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f99137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f99138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f99139d;

    public byte[] getBizBuffer() {
        return this.f99138c;
    }

    public int getBizCode() {
        return this.f99137b;
    }

    public String getBizMsg() {
        return this.f99139d;
    }

    public int getCode() {
        return this.f99136a;
    }

    public void setBizBuffer(byte[] bArr) {
        this.f99138c = bArr;
    }

    public void setBizCode(int i10) {
        this.f99137b = i10;
    }

    public void setBizMsg(String str) {
        this.f99139d = str;
    }

    public void setCode(int i10) {
        this.f99136a = i10;
    }

    public String toString() {
        return "BeaconTransferResult{returnCode=" + this.f99136a + ", bizReturnCode=" + this.f99137b + ", bizMsg='" + this.f99139d + "'}";
    }
}
