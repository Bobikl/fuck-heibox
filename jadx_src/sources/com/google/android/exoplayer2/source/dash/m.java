package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.d1;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;

/* JADX INFO: compiled from: EventSampleStream.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m implements d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a2 f47852b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f47854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f47855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.exoplayer2.source.dash.manifest.f f47856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f47857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f47858h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.metadata.emsg.b f47853c = new com.google.android.exoplayer2.metadata.emsg.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f47859i = com.google.android.exoplayer2.j.f46377b;

    public m(com.google.android.exoplayer2.source.dash.manifest.f fVar, a2 a2Var, boolean z10) {
        this.f47852b = a2Var;
        this.f47856f = fVar;
        this.f47854d = fVar.f47903b;
        e(fVar, z10);
    }

    public String a() {
        return this.f47856f.a();
    }

    @Override // com.google.android.exoplayer2.source.d1
    public void b() throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.d1
    public int c(b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i10) {
        int i11 = this.f47858h;
        boolean z10 = i11 == this.f47854d.length;
        if (z10 && !this.f47855e) {
            decoderInputBuffer.m(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f47857g) {
            b2Var.f44366b = this.f47852b;
            this.f47857g = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        this.f47858h = i11 + 1;
        byte[] bArrA = this.f47853c.a(this.f47856f.f47902a[i11]);
        decoderInputBuffer.o(bArrA.length);
        decoderInputBuffer.f44488e.put(bArrA);
        decoderInputBuffer.f44490g = this.f47854d[i11];
        decoderInputBuffer.m(1);
        return -4;
    }

    public void d(long j10) {
        int iF = u0.f(this.f47854d, j10, true, false);
        this.f47858h = iF;
        if (!(this.f47855e && iF == this.f47854d.length)) {
            j10 = com.google.android.exoplayer2.j.f46377b;
        }
        this.f47859i = j10;
    }

    public void e(com.google.android.exoplayer2.source.dash.manifest.f fVar, boolean z10) {
        int i10 = this.f47858h;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f47854d[i10 - 1];
        this.f47855e = z10;
        this.f47856f = fVar;
        long[] jArr = fVar.f47903b;
        this.f47854d = jArr;
        long j11 = this.f47859i;
        if (j11 != com.google.android.exoplayer2.j.f46377b) {
            d(j11);
        } else if (j10 != com.google.android.exoplayer2.j.f46377b) {
            this.f47858h = u0.f(jArr, j10, false, false);
        }
    }

    @Override // com.google.android.exoplayer2.source.d1
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.source.d1
    public int n(long j10) {
        int iMax = Math.max(this.f47858h, u0.f(this.f47854d, j10, true, false));
        int i10 = iMax - this.f47858h;
        this.f47858h = iMax;
        return i10;
    }
}
