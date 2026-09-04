package com.google.android.exoplayer2.source.rtsp;

import java.io.IOException;

/* JADX INFO: compiled from: UdpDataSourceRtpDataChannelFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p0 implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48904a;

    public p0(long j10) {
        this.f48904a = j10;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.d.a
    public d.a a() {
        return new n0(this.f48904a);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.d.a
    public d b(int i10) throws IOException {
        o0 o0Var = new o0(this.f48904a);
        o0 o0Var2 = new o0(this.f48904a);
        try {
            o0Var.a(l.a(0));
            int localPort = o0Var.getLocalPort();
            boolean z10 = localPort % 2 == 0;
            o0Var2.a(l.a(z10 ? localPort + 1 : localPort - 1));
            if (z10) {
                o0Var.p(o0Var2);
                return o0Var;
            }
            o0Var2.p(o0Var);
            return o0Var2;
        } catch (IOException e10) {
            com.google.android.exoplayer2.upstream.q.a(o0Var);
            com.google.android.exoplayer2.upstream.q.a(o0Var2);
            throw e10;
        }
    }
}
