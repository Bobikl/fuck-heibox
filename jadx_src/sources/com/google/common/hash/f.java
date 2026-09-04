package com.google.common.hash;

import com.google.common.base.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: AbstractStreamingHasher.java */
/* JADX INFO: loaded from: classes7.dex */
@h
@s9.a
public abstract class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f58563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f58564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f58565c;

    protected f(int i10) {
        this(i10, i10);
    }

    protected f(int i10, int i11) {
        w.d(i11 % i10 == 0);
        this.f58563a = ByteBuffer.allocate(i11 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f58564b = i11;
        this.f58565c = i10;
    }

    private void q() {
        q.b(this.f58563a);
        while (this.f58563a.remaining() >= this.f58565c) {
            s(this.f58563a);
        }
        this.f58563a.compact();
    }

    private void r() {
        if (this.f58563a.remaining() < 8) {
            q();
        }
    }

    private m u(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.f58563a.remaining()) {
            this.f58563a.put(byteBuffer);
            r();
            return this;
        }
        int iPosition = this.f58564b - this.f58563a.position();
        for (int i10 = 0; i10 < iPosition; i10++) {
            this.f58563a.put(byteBuffer.get());
        }
        q();
        while (byteBuffer.remaining() >= this.f58565c) {
            s(byteBuffer);
        }
        this.f58563a.put(byteBuffer);
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
    public final m b(byte b10) {
        this.f58563a.put(b10);
        r();
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
    public final m c(int i10) {
        this.f58563a.putInt(i10);
        r();
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
    public final m d(long j10) {
        this.f58563a.putLong(j10);
        r();
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
    public final m g(short s10) {
        this.f58563a.putShort(s10);
        r();
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
    public final m i(char c10) {
        this.f58563a.putChar(c10);
        r();
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
    public final m k(byte[] bArr, int i10, int i11) {
        return u(ByteBuffer.wrap(bArr, i10, i11).order(ByteOrder.LITTLE_ENDIAN));
    }

    @Override // com.google.common.hash.d, com.google.common.hash.m, com.google.common.hash.u
    public final m l(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        try {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return u(byteBuffer);
        } finally {
            byteBuffer.order(byteOrderOrder);
        }
    }

    @Override // com.google.common.hash.m
    public final HashCode n() {
        q();
        q.b(this.f58563a);
        if (this.f58563a.remaining() > 0) {
            t(this.f58563a);
            ByteBuffer byteBuffer = this.f58563a;
            q.d(byteBuffer, byteBuffer.limit());
        }
        return p();
    }

    protected abstract HashCode p();

    protected abstract void s(ByteBuffer byteBuffer);

    protected void t(ByteBuffer byteBuffer) {
        q.d(byteBuffer, byteBuffer.limit());
        q.c(byteBuffer, this.f58565c + 7);
        while (true) {
            int iPosition = byteBuffer.position();
            int i10 = this.f58565c;
            if (iPosition >= i10) {
                q.c(byteBuffer, i10);
                q.b(byteBuffer);
                s(byteBuffer);
                return;
            }
            byteBuffer.putLong(0L);
        }
    }
}
