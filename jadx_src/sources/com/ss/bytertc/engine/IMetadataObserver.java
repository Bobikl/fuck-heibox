package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes4.dex */
public interface IMetadataObserver {
    void onMetadataReceived(byte[] bArr, String str, long j10);

    byte[] onReadyToSendMetadata(long j10);
}
