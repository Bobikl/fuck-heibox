package com.tencent.beacon.event.immediate;

/* JADX INFO: loaded from: classes4.dex */
public class Beacon2WnsTransferArgs extends BeaconTransferArgs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f99130b;

    public Beacon2WnsTransferArgs(byte[] bArr) {
        super(bArr);
        this.f99130b = "bls.longconnection";
    }

    @Override // com.tencent.beacon.event.immediate.BeaconTransferArgs
    public String getCommand() {
        return this.f99130b;
    }

    @Override // com.tencent.beacon.event.immediate.BeaconTransferArgs
    public void setCommand(String str) {
        this.f99130b = str;
    }
}
