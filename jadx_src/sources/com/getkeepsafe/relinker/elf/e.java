package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Elf64Header.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends c.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f f43046m;

    public e(boolean z10, f fVar) throws IOException {
        this.f43029a = z10;
        this.f43046m = fVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f43030b = fVar.f(byteBufferAllocate, 16L);
        this.f43031c = fVar.g(byteBufferAllocate, 32L);
        this.f43032d = fVar.g(byteBufferAllocate, 40L);
        this.f43033e = fVar.f(byteBufferAllocate, 54L);
        this.f43034f = fVar.f(byteBufferAllocate, 56L);
        this.f43035g = fVar.f(byteBufferAllocate, 58L);
        this.f43036h = fVar.f(byteBufferAllocate, 60L);
        this.f43037i = fVar.f(byteBufferAllocate, 62L);
    }

    @Override // com.getkeepsafe.relinker.elf.c.b
    public c.a a(long j10, int i10) throws IOException {
        return new b(this.f43046m, this, j10, i10);
    }

    @Override // com.getkeepsafe.relinker.elf.c.b
    public c.AbstractC0364c b(long j10) throws IOException {
        return new h(this.f43046m, this, j10);
    }

    @Override // com.getkeepsafe.relinker.elf.c.b
    public c.d c(int i10) throws IOException {
        return new j(this.f43046m, this, i10);
    }
}
