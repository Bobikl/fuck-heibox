package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.audio.o0;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.y;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: compiled from: OpusReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h extends i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f45651s = 1332770163;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f45652t = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f45653r;

    h() {
    }

    private long n(byte[] bArr) {
        int i10;
        int i11 = bArr[0] & 255;
        int i12 = i11 & 3;
        int i13 = 2;
        if (i12 == 0) {
            i13 = 1;
        } else if (i12 != 1 && i12 != 2) {
            i13 = bArr[1] & Utf8.REPLACEMENT_BYTE;
        }
        int i14 = i11 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i10 = 2500 << i15;
        } else if (i14 >= 12) {
            i10 = 10000 << (i15 & 1);
        } else {
            i10 = i15 == 3 ? 60000 : 10000 << i15;
        }
        return ((long) i13) * ((long) i10);
    }

    public static boolean o(e0 e0Var) {
        int iA = e0Var.a();
        byte[] bArr = f45652t;
        if (iA < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        e0Var.k(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.i
    protected long f(e0 e0Var) {
        return c(n(e0Var.d()));
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.i
    @mk.e(expression = {"#3.format"}, result = false)
    protected boolean i(e0 e0Var, long j10, i.b bVar) {
        if (this.f45653r) {
            com.google.android.exoplayer2.util.a.g(bVar.f45671a);
            boolean z10 = e0Var.o() == 1332770163;
            e0Var.S(0);
            return z10;
        }
        byte[] bArrCopyOf = Arrays.copyOf(e0Var.d(), e0Var.f());
        bVar.f45671a = new a2.b().e0(y.V).H(o0.c(bArrCopyOf)).f0(48000).T(o0.a(bArrCopyOf)).E();
        this.f45653r = true;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f45653r = false;
        }
    }
}
