package com.github.penfeizhou.animation.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteBufferReader.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteBuffer f43310b;

    public a(ByteBuffer byteBuffer) {
        this.f43310b = byteBuffer;
        byteBuffer.position(0);
    }

    @Override // com.github.penfeizhou.animation.io.e
    public InputStream a() throws IOException {
        return new ByteArrayInputStream(this.f43310b.array());
    }

    @Override // com.github.penfeizhou.animation.io.e
    public int available() throws IOException {
        return this.f43310b.limit() - this.f43310b.position();
    }

    @Override // com.github.penfeizhou.animation.io.e
    public void close() throws IOException {
    }

    @Override // com.github.penfeizhou.animation.io.e
    public byte peek() throws IOException {
        return this.f43310b.get();
    }

    @Override // com.github.penfeizhou.animation.io.e
    public int position() {
        return this.f43310b.position();
    }

    @Override // com.github.penfeizhou.animation.io.e
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f43310b.get(bArr, i10, i11);
        return i11;
    }

    @Override // com.github.penfeizhou.animation.io.e
    public void reset() throws IOException {
        this.f43310b.position(0);
    }

    @Override // com.github.penfeizhou.animation.io.e
    public long skip(long j10) throws IOException {
        ByteBuffer byteBuffer = this.f43310b;
        byteBuffer.position((int) (((long) byteBuffer.position()) + j10));
        return j10;
    }
}
