package com.google.android.play.core.splitinstall.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f56260a;

    public a(ByteBuffer byteBuffer) {
        this.f56260a = byteBuffer.slice();
    }

    @Override // com.google.android.play.core.splitinstall.internal.a0
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        ByteBuffer byteBufferSlice;
        synchronized (this.f56260a) {
            int i11 = (int) j10;
            this.f56260a.position(i11);
            this.f56260a.limit(i11 + i10);
            byteBufferSlice = this.f56260a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // com.google.android.play.core.splitinstall.internal.a0
    public final long zza() {
        return this.f56260a.capacity();
    }
}
