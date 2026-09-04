package com.google.android.exoplayer2.decoder;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: compiled from: CryptoInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public byte[] f44500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public byte[] f44501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public int[] f44503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public int[] f44504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f44508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private final b f44509j;

    /* JADX INFO: compiled from: CryptoInfo.java */
    @w0(24)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f44510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaCodec$CryptoInfo$Pattern f44511b;

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f44510a = cryptoInfo;
            this.f44511b = new MediaCodec$CryptoInfo$Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f44511b.set(i10, i11);
            this.f44510a.setPattern(this.f44511b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f44508i = cryptoInfo;
        this.f44509j = u0.f51536a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f44508i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f44503d == null) {
            int[] iArr = new int[1];
            this.f44503d = iArr;
            this.f44508i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f44503d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f44505f = i10;
        this.f44503d = iArr;
        this.f44504e = iArr2;
        this.f44501b = bArr;
        this.f44500a = bArr2;
        this.f44502c = i11;
        this.f44506g = i12;
        this.f44507h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f44508i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (u0.f51536a >= 24) {
            ((b) com.google.android.exoplayer2.util.a.g(this.f44509j)).b(i12, i13);
        }
    }
}
