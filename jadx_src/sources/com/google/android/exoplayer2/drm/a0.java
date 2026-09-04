package com.google.android.exoplayer2.drm;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: ErrorStateDrmSession.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements DrmSession {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final DrmSession.DrmSessionException f44673f;

    public a0(DrmSession.DrmSessionException drmSessionException) {
        this.f44673f = (DrmSession.DrmSessionException) com.google.android.exoplayer2.util.a.g(drmSessionException);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @androidx.annotation.p0
    public DrmSession.DrmSessionException q() {
        return this.f44673f;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void r(@androidx.annotation.p0 s.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean s() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @androidx.annotation.p0
    public com.google.android.exoplayer2.decoder.c t() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @androidx.annotation.p0
    public Map<String, String> u() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void v(@androidx.annotation.p0 s.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID w() {
        return com.google.android.exoplayer2.j.U1;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @androidx.annotation.p0
    public byte[] x() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean y(String str) {
        return false;
    }
}
