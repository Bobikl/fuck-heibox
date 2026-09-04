package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.d1;
import java.io.IOException;

/* JADX INFO: compiled from: HlsSampleStream.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n implements d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f48190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48191d = -1;

    public n(s sVar, int i10) {
        this.f48190c = sVar;
        this.f48189b = i10;
    }

    private boolean d() {
        int i10 = this.f48191d;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    public void a() {
        com.google.android.exoplayer2.util.a.a(this.f48191d == -1);
        this.f48191d = this.f48190c.z(this.f48189b);
    }

    @Override // com.google.android.exoplayer2.source.d1
    public void b() throws IOException {
        int i10 = this.f48191d;
        if (i10 == -2) {
            throw new SampleQueueMappingException(this.f48190c.o().c(this.f48189b).c(0).f43593m);
        }
        if (i10 == -1) {
            this.f48190c.V();
        } else if (i10 != -3) {
            this.f48190c.W(i10);
        }
    }

    @Override // com.google.android.exoplayer2.source.d1
    public int c(b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i10) {
        if (this.f48191d == -3) {
            decoderInputBuffer.e(4);
            return -4;
        }
        if (d()) {
            return this.f48190c.f0(this.f48191d, b2Var, decoderInputBuffer, i10);
        }
        return -3;
    }

    public void e() {
        if (this.f48191d != -1) {
            this.f48190c.q0(this.f48189b);
            this.f48191d = -1;
        }
    }

    @Override // com.google.android.exoplayer2.source.d1
    public boolean isReady() {
        return this.f48191d == -3 || (d() && this.f48190c.S(this.f48191d));
    }

    @Override // com.google.android.exoplayer2.source.d1
    public int n(long j10) {
        if (d()) {
            return this.f48190c.p0(this.f48191d, j10);
        }
        return 0;
    }
}
