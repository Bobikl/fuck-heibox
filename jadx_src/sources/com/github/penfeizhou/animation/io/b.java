package com.github.penfeizhou.animation.io;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: ByteBufferWriter.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ByteBuffer f43311a;

    public b() {
        f(10240);
    }

    @Override // com.github.penfeizhou.animation.io.g
    public void b(byte b10) {
        this.f43311a.put(b10);
    }

    @Override // com.github.penfeizhou.animation.io.g
    public void c(int i10) {
        this.f43311a.position(i10 + position());
    }

    @Override // com.github.penfeizhou.animation.io.g
    public void close() {
    }

    @Override // com.github.penfeizhou.animation.io.g
    public void e(byte[] bArr) {
        this.f43311a.put(bArr);
    }

    @Override // com.github.penfeizhou.animation.io.g
    public void f(int i10) {
        ByteBuffer byteBuffer = this.f43311a;
        if (byteBuffer == null || i10 > byteBuffer.capacity()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
            this.f43311a = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f43311a.clear();
    }

    @Override // com.github.penfeizhou.animation.io.g
    public byte[] k() {
        return this.f43311a.array();
    }

    @Override // com.github.penfeizhou.animation.io.g
    public int position() {
        return this.f43311a.position();
    }
}
