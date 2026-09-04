package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.util.u0;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class UnexpectedSampleTimestampException extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.chunk.n f48094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f48096d;

    public UnexpectedSampleTimestampException(com.google.android.exoplayer2.source.chunk.n nVar, long j10, long j11) {
        long jB1 = u0.B1(j11);
        long j12 = nVar.f47653g;
        long j13 = nVar.f47654h;
        StringBuilder sb2 = new StringBuilder(103);
        sb2.append("Unexpected sample timestamp: ");
        sb2.append(jB1);
        sb2.append(" in chunk [");
        sb2.append(j12);
        sb2.append(", ");
        sb2.append(j13);
        sb2.append("]");
        super(sb2.toString());
        this.f48094b = nVar;
        this.f48095c = j10;
        this.f48096d = j11;
    }
}
