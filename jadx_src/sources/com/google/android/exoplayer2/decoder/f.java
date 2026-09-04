package com.google.android.exoplayer2.decoder;

import androidx.annotation.p0;
import com.google.android.exoplayer2.decoder.DecoderException;

/* JADX INFO: compiled from: Decoder.java */
/* JADX INFO: loaded from: classes7.dex */
public interface f<I, O, E extends DecoderException> {
    @p0
    I a() throws DecoderException;

    void c(I i10) throws DecoderException;

    @p0
    O dequeueOutputBuffer() throws DecoderException;

    void flush();

    String getName();

    void release();
}
