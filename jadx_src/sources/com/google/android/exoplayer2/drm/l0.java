package com.google.android.exoplayer2.drm;

import java.util.UUID;

/* JADX INFO: compiled from: LocalMediaDrmCallback.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f44729a;

    public l0(byte[] bArr) {
        this.f44729a = (byte[]) com.google.android.exoplayer2.util.a.g(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.m0
    public byte[] a(UUID uuid, b0.b bVar) {
        return this.f44729a;
    }

    @Override // com.google.android.exoplayer2.drm.m0
    public byte[] b(UUID uuid, b0.h hVar) {
        throw new UnsupportedOperationException();
    }
}
