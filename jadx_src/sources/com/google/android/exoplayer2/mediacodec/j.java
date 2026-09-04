package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.audio.n0;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: C2Mp3TimestampTracker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f46770d = 529;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f46771e = "C2Mp3TimestampTracker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f46772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f46773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46774c;

    j() {
    }

    private long a(long j10) {
        return this.f46772a + Math.max(0L, ((this.f46773b - f46770d) * 1000000) / j10);
    }

    public long b(a2 a2Var) {
        return a(a2Var.A);
    }

    public void c() {
        this.f46772a = 0L;
        this.f46773b = 0L;
        this.f46774c = false;
    }

    public long d(a2 a2Var, DecoderInputBuffer decoderInputBuffer) {
        if (this.f46773b == 0) {
            this.f46772a = decoderInputBuffer.f44490g;
        }
        if (this.f46774c) {
            return decoderInputBuffer.f44490g;
        }
        ByteBuffer byteBuffer = (ByteBuffer) com.google.android.exoplayer2.util.a.g(decoderInputBuffer.f44488e);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & 255);
        }
        int iM = n0.m(i10);
        if (iM != -1) {
            long jA = a(a2Var.A);
            this.f46773b += (long) iM;
            return jA;
        }
        this.f46774c = true;
        this.f46773b = 0L;
        this.f46772a = decoderInputBuffer.f44490g;
        com.google.android.exoplayer2.util.u.m(f46771e, "MPEG audio header is invalid.");
        return decoderInputBuffer.f44490g;
    }
}
