package com.google.android.exoplayer2.source.rtsp;

/* JADX INFO: compiled from: TransferRtpDataChannelFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n0 implements d.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f48895b = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48896a;

    public n0(long j10) {
        this.f48896a = j10;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.d.a
    public /* synthetic */ d.a a() {
        return c.a(this);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.d.a
    public d b(int i10) {
        m0 m0Var = new m0(this.f48896a);
        m0Var.a(l.a(i10 * 2));
        return m0Var;
    }
}
