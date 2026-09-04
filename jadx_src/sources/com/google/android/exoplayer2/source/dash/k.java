package com.google.android.exoplayer2.source.dash;

/* JADX INFO: compiled from: DashWrappingSegmentIndex.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.extractor.e f47825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f47826c;

    public k(com.google.android.exoplayer2.extractor.e eVar, long j10) {
        this.f47825b = eVar;
        this.f47826c = j10;
    }

    @Override // com.google.android.exoplayer2.source.dash.i
    public long a(long j10, long j11) {
        return this.f47825b.f44867g[(int) j10];
    }

    @Override // com.google.android.exoplayer2.source.dash.i
    public long b(long j10, long j11) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.i
    public long c(long j10) {
        return this.f47825b.f44868h[(int) j10] - this.f47826c;
    }

    @Override // com.google.android.exoplayer2.source.dash.i
    public long d(long j10, long j11) {
        return com.google.android.exoplayer2.j.f46377b;
    }

    @Override // com.google.android.exoplayer2.source.dash.i
    public long e(long j10, long j11) {
        return this.f47825b.a(j10 + this.f47826c);
    }

    @Override // com.google.android.exoplayer2.source.dash.i
    public long f(long j10) {
        return this.f47825b.f44864d;
    }

    @Override // com.google.android.exoplayer2.source.dash.i
    public long g() {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.i
    public com.google.android.exoplayer2.source.dash.manifest.i h(long j10) {
        com.google.android.exoplayer2.extractor.e eVar = this.f47825b;
        int i10 = (int) j10;
        return new com.google.android.exoplayer2.source.dash.manifest.i(null, eVar.f44866f[i10], eVar.f44865e[i10]);
    }

    @Override // com.google.android.exoplayer2.source.dash.i
    public boolean i() {
        return true;
    }

    @Override // com.google.android.exoplayer2.source.dash.i
    public long j(long j10, long j11) {
        return this.f47825b.f44864d;
    }
}
