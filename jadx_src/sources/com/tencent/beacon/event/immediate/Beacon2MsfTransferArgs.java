package com.tencent.beacon.event.immediate;

/* JADX INFO: loaded from: classes4.dex */
public class Beacon2MsfTransferArgs extends BeaconTransferArgs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f99129b;

    public Beacon2MsfTransferArgs(byte[] bArr) {
        super(bArr);
        this.f99129b = "trpc.Beacon.BeaconLogServerTRPC.blslongconnection";
    }

    @Override // com.tencent.beacon.event.immediate.BeaconTransferArgs
    public String getCommand() {
        return this.f99129b;
    }

    @Override // com.tencent.beacon.event.immediate.BeaconTransferArgs
    public void setCommand(String str) {
        this.f99129b = str;
    }
}
