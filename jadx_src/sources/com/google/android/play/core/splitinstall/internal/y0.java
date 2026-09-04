package com.google.android.play.core.splitinstall.internal;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class y0 implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileChannel f56331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f56332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f56333c;

    public y0(FileChannel fileChannel, long j10, long j11) {
        this.f56331a = fileChannel;
        this.f56332b = j10;
        this.f56333c = j11;
    }

    @Override // com.google.android.play.core.splitinstall.internal.a0
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = this.f56331a.map(FileChannel.MapMode.READ_ONLY, this.f56332b + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.play.core.splitinstall.internal.a0
    public final long zza() {
        return this.f56333c;
    }
}
