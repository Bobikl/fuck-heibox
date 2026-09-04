package com.google.common.hash;

import com.google.common.base.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: AbstractByteHasher.java */
/* JADX INFO: loaded from: classes7.dex */
@h
@s9.a
public abstract class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f58557a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    a() {
    }

    private m p(int i10) {
        try {
            t(this.f58557a.array(), 0, i10);
            return this;
        } finally {
            q.a(this.f58557a);
        }
    }

    @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
    public m b(byte b10) {
        q(b10);
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
    public m c(int i10) {
        this.f58557a.putInt(i10);
        return p(4);
    }

    @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
    public m d(long j10) {
        this.f58557a.putLong(j10);
        return p(8);
    }

    @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
    public m e(byte[] bArr) {
        w.E(bArr);
        s(bArr);
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
    public m g(short s10) {
        this.f58557a.putShort(s10);
        return p(2);
    }

    @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
    public m i(char c10) {
        this.f58557a.putChar(c10);
        return p(2);
    }

    @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
    public m k(byte[] bArr, int i10, int i11) {
        w.f0(i10, i10 + i11, bArr.length);
        t(bArr, i10, i11);
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
    public m l(ByteBuffer byteBuffer) {
        r(byteBuffer);
        return this;
    }

    protected abstract void q(byte b10);

    protected void r(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            t(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            q.d(byteBuffer, byteBuffer.limit());
        } else {
            for (int iRemaining = byteBuffer.remaining(); iRemaining > 0; iRemaining--) {
                q(byteBuffer.get());
            }
        }
    }

    protected void s(byte[] bArr) {
        t(bArr, 0, bArr.length);
    }

    protected void t(byte[] bArr, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            q(bArr[i12]);
        }
    }
}
