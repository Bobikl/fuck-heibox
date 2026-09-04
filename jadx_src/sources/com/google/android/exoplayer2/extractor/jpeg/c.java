package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.v;

/* JADX INFO: compiled from: StartOffsetExtractorInput.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f45071c;

    public c(l lVar, long j10) {
        super(lVar);
        com.google.android.exoplayer2.util.a.a(lVar.getPosition() >= j10);
        this.f45071c = j10;
    }

    @Override // com.google.android.exoplayer2.extractor.v, com.google.android.exoplayer2.extractor.l
    public long getLength() {
        return super.getLength() - this.f45071c;
    }

    @Override // com.google.android.exoplayer2.extractor.v, com.google.android.exoplayer2.extractor.l
    public long getPosition() {
        return super.getPosition() - this.f45071c;
    }

    @Override // com.google.android.exoplayer2.extractor.v, com.google.android.exoplayer2.extractor.l
    public <E extends Throwable> void i(long j10, E e10) throws Throwable {
        super.i(j10 + this.f45071c, e10);
    }

    @Override // com.google.android.exoplayer2.extractor.v, com.google.android.exoplayer2.extractor.l
    public long q() {
        return super.q() - this.f45071c;
    }
}
