package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.util.u0;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: UdpDataSourceRtpDataChannel.java */
/* JADX INFO: loaded from: classes7.dex */
public final class o0 implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f48899d = "RTP/AVP;unicast;client_port=%d-%d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UdpDataSource f48900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private o0 f48901c;

    public o0(long j10) {
        this.f48900b = new UdpDataSource(2000, Ints.d(j10));
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(r rVar) throws IOException {
        return this.f48900b.a(rVar);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public /* synthetic */ Map b() {
        return com.google.android.exoplayer2.upstream.n.a(this);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void close() {
        this.f48900b.close();
        o0 o0Var = this.f48901c;
        if (o0Var != null) {
            o0Var.close();
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.d
    public String d() {
        int localPort = getLocalPort();
        com.google.android.exoplayer2.util.a.i(localPort != -1);
        return u0.H(f48899d, Integer.valueOf(localPort), Integer.valueOf(localPort + 1));
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void e(com.google.android.exoplayer2.upstream.u0 u0Var) {
        this.f48900b.e(u0Var);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.d
    public int getLocalPort() {
        int localPort = this.f48900b.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f48900b.getUri();
    }

    public void p(o0 o0Var) {
        com.google.android.exoplayer2.util.a.a(this != o0Var);
        this.f48901c = o0Var;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.d
    @androidx.annotation.p0
    public y.b r() {
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f48900b.read(bArr, i10, i11);
        } catch (UdpDataSource.UdpDataSourceException e10) {
            if (e10.f50858b == 2002) {
                return -1;
            }
            throw e10;
        }
    }
}
