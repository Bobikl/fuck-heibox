package com.google.android.play.core.splitinstall.internal;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzg extends zzh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f56334c;

    public zzg(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f56334c = bArr;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzh, java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f56334c;
    }
}
