package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: EmptySampleStream.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r implements d1 {
    @Override // com.google.android.exoplayer2.source.d1
    public void b() {
    }

    @Override // com.google.android.exoplayer2.source.d1
    public int c(b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i10) {
        decoderInputBuffer.m(4);
        return -4;
    }

    @Override // com.google.android.exoplayer2.source.d1
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.source.d1
    public int n(long j10) {
        return 0;
    }
}
