package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: DataChunk.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class l extends f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f47693l = 16384;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f47694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f47695k;

    public l(com.google.android.exoplayer2.upstream.o oVar, com.google.android.exoplayer2.upstream.r rVar, int i10, a2 a2Var, int i11, @p0 Object obj, @p0 byte[] bArr) {
        super(oVar, rVar, i10, a2Var, i11, obj, com.google.android.exoplayer2.j.f46377b, com.google.android.exoplayer2.j.f46377b);
        this.f47694j = bArr == null ? u0.f51541f : bArr;
    }

    private void i(int i10) {
        byte[] bArr = this.f47694j;
        if (bArr.length < i10 + 16384) {
            this.f47694j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void a() throws IOException {
        try {
            this.f47655i.a(this.f47648b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f47695k) {
                i(i11);
                i10 = this.f47655i.read(this.f47694j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f47695k) {
                g(this.f47694j, i11);
            }
        } finally {
            com.google.android.exoplayer2.upstream.q.a(this.f47655i);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void c() {
        this.f47695k = true;
    }

    protected abstract void g(byte[] bArr, int i10) throws IOException;

    public byte[] h() {
        return this.f47694j;
    }
}
