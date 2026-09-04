package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import android.os.PersistableBundle;
import androidx.annotation.w0;
import com.google.android.exoplayer2.util.u0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DummyExoMediaDrm.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(18)
public final class z implements b0 {
    public static z k() {
        return new z();
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public void a() {
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public void b(@androidx.annotation.p0 b0.d dVar) {
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public void c(String str, byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public void closeSession(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public void d(@androidx.annotation.p0 b0.f fVar) {
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public void e(@androidx.annotation.p0 b0.e eVar) {
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public int f() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public com.google.android.exoplayer2.decoder.c g(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.b0
    @androidx.annotation.p0
    public PersistableBundle getMetrics() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public String getPropertyString(String str) {
        return "";
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public b0.h getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public boolean h(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public byte[] i(String str) {
        return u0.f51541f;
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public b0.b j(byte[] bArr, @androidx.annotation.p0 List<DrmInitData.SchemeData> list, int i10, @androidx.annotation.p0 HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public byte[] openSession() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.b0
    @androidx.annotation.p0
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public void release() {
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.b0
    public void setPropertyString(String str, String str2) {
    }
}
