package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Elf32Header.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends c.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f f43045m;

    public d(boolean z10, f fVar) throws IOException {
        this.f43029a = z10;
        this.f43045m = fVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f43030b = fVar.f(byteBufferAllocate, 16L);
        this.f43031c = fVar.k(byteBufferAllocate, 28L);
        this.f43032d = fVar.k(byteBufferAllocate, 32L);
        this.f43033e = fVar.f(byteBufferAllocate, 42L);
        this.f43034f = fVar.f(byteBufferAllocate, 44L);
        this.f43035g = fVar.f(byteBufferAllocate, 46L);
        this.f43036h = fVar.f(byteBufferAllocate, 48L);
        this.f43037i = fVar.f(byteBufferAllocate, 50L);
    }

    @Override // com.getkeepsafe.relinker.elf.c.b
    public c.a a(long j10, int i10) throws IOException {
        return new a(this.f43045m, this, j10, i10);
    }

    @Override // com.getkeepsafe.relinker.elf.c.b
    public c.AbstractC0364c b(long j10) throws IOException {
        return new g(this.f43045m, this, j10);
    }

    @Override // com.getkeepsafe.relinker.elf.c.b
    public c.d c(int i10) throws IOException {
        return new i(this.f43045m, this, i10);
    }
}
