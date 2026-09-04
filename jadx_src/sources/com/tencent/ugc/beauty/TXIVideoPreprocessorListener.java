package com.tencent.ugc.beauty;

/* JADX INFO: loaded from: classes4.dex */
public interface TXIVideoPreprocessorListener {
    void didProcessFrame(int i10, int i11, int i12, long j10);

    void didProcessFrame(byte[] bArr, int i10, int i11, int i12, long j10);

    int willAddWatermark(int i10, int i11, int i12);
}
