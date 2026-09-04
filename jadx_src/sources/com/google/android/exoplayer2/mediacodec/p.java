package com.google.android.exoplayer2.mediacodec;

import java.util.List;

/* JADX INFO: compiled from: MediaCodecSelector.java */
/* JADX INFO: loaded from: classes7.dex */
public interface p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f46808a = new p() { // from class: com.google.android.exoplayer2.mediacodec.o
        @Override // com.google.android.exoplayer2.mediacodec.p
        public final List a(String str, boolean z10, boolean z11) {
            return MediaCodecUtil.s(str, z10, z11);
        }
    };

    List<n> a(String str, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException;
}
