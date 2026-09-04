package com.tencent.beacon.event.immediate;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BeaconTransferArgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f99135a;

    public BeaconTransferArgs(byte[] bArr) {
        this.f99135a = bArr;
    }

    public abstract String getCommand();

    public byte[] getData() {
        return this.f99135a;
    }

    public abstract void setCommand(String str);

    public void setData(byte[] bArr) {
        this.f99135a = bArr;
    }
}
