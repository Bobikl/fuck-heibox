package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.upstream.u0;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: Aes128DataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public class a implements com.google.android.exoplayer2.upstream.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.o f48097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f48098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f48099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private CipherInputStream f48100e;

    public a(com.google.android.exoplayer2.upstream.o oVar, byte[] bArr, byte[] bArr2) {
        this.f48097b = oVar;
        this.f48098c = bArr;
        this.f48099d = bArr2;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public final long a(r rVar) throws IOException {
        try {
            Cipher cipherP = p();
            try {
                cipherP.init(2, new SecretKeySpec(this.f48098c, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(this.f48099d));
                com.google.android.exoplayer2.upstream.p pVar = new com.google.android.exoplayer2.upstream.p(this.f48097b, rVar);
                this.f48100e = new CipherInputStream(pVar, cipherP);
                pVar.c();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public final Map<String, List<String>> b() {
        return this.f48097b.b();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void close() throws IOException {
        if (this.f48100e != null) {
            this.f48100e = null;
            this.f48097b.close();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public final void e(u0 u0Var) {
        com.google.android.exoplayer2.util.a.g(u0Var);
        this.f48097b.e(u0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @p0
    public final Uri getUri() {
        return this.f48097b.getUri();
    }

    protected Cipher p() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        com.google.android.exoplayer2.util.a.g(this.f48100e);
        int i12 = this.f48100e.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }
}
