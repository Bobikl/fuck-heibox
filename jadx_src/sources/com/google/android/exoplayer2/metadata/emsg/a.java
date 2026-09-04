package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.d;
import com.google.android.exoplayer2.metadata.g;
import com.google.android.exoplayer2.util.e0;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: EventMessageDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends g {
    @Override // com.google.android.exoplayer2.metadata.g
    protected Metadata b(d dVar, ByteBuffer byteBuffer) {
        return new Metadata(c(new e0(byteBuffer.array(), byteBuffer.limit())));
    }

    public EventMessage c(e0 e0Var) {
        return new EventMessage((String) com.google.android.exoplayer2.util.a.g(e0Var.A()), (String) com.google.android.exoplayer2.util.a.g(e0Var.A()), e0Var.z(), e0Var.z(), Arrays.copyOfRange(e0Var.d(), e0Var.e(), e0Var.f()));
    }
}
