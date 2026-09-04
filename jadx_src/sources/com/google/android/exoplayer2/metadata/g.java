package com.google.android.exoplayer2.metadata;

import androidx.annotation.p0;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SimpleMetadataDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g implements b {
    @Override // com.google.android.exoplayer2.metadata.b
    @p0
    public final Metadata a(d dVar) {
        ByteBuffer byteBuffer = (ByteBuffer) com.google.android.exoplayer2.util.a.g(dVar.f44488e);
        com.google.android.exoplayer2.util.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dVar.j()) {
            return null;
        }
        return b(dVar, byteBuffer);
    }

    @p0
    protected abstract Metadata b(d dVar, ByteBuffer byteBuffer);
}
