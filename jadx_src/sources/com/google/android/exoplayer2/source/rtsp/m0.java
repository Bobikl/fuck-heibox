package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.util.u0;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: TransferRtpDataChannel.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m0 extends com.google.android.exoplayer2.upstream.f implements d, y.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f48858j = "RTP/AVP/TCP;unicast;interleaved=%d-%d";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LinkedBlockingQueue<byte[]> f48859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f48860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f48861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f48862i;

    public m0(long j10) {
        super(true);
        this.f48860g = j10;
        this.f48859f = new LinkedBlockingQueue<>();
        this.f48861h = new byte[0];
        this.f48862i = -1;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(r rVar) {
        this.f48862i = rVar.f51194a.getPort();
        return -1L;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void close() {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.d
    public String d() {
        com.google.android.exoplayer2.util.a.i(this.f48862i != -1);
        return u0.H(f48858j, Integer.valueOf(this.f48862i), Integer.valueOf(this.f48862i + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.d
    public int getLocalPort() {
        return this.f48862i;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @androidx.annotation.p0
    public Uri getUri() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.y.b
    public void p(byte[] bArr) {
        this.f48859f.add(bArr);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.d
    public y.b r() {
        return this;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int iMin = Math.min(i11, this.f48861h.length);
        System.arraycopy(this.f48861h, 0, bArr, i10, iMin);
        int i12 = iMin + 0;
        byte[] bArr2 = this.f48861h;
        this.f48861h = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (i12 == i11) {
            return i12;
        }
        try {
            byte[] bArrPoll = this.f48859f.poll(this.f48860g, TimeUnit.MILLISECONDS);
            if (bArrPoll == null) {
                return -1;
            }
            int iMin2 = Math.min(i11 - i12, bArrPoll.length);
            System.arraycopy(bArrPoll, 0, bArr, i10 + i12, iMin2);
            if (iMin2 < bArrPoll.length) {
                this.f48861h = Arrays.copyOfRange(bArrPoll, iMin2, bArrPoll.length);
            }
            return i12 + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }
}
