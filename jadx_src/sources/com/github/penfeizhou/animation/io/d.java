package com.github.penfeizhou.animation.io;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: FilterReader.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected e f43313b;

    public d(e eVar) {
        this.f43313b = eVar;
    }

    @Override // com.github.penfeizhou.animation.io.e
    public InputStream a() throws IOException {
        reset();
        return this.f43313b.a();
    }

    @Override // com.github.penfeizhou.animation.io.e
    public int available() throws IOException {
        return this.f43313b.available();
    }

    @Override // com.github.penfeizhou.animation.io.e
    public void close() throws IOException {
        this.f43313b.close();
    }

    @Override // com.github.penfeizhou.animation.io.e
    public byte peek() throws IOException {
        return this.f43313b.peek();
    }

    @Override // com.github.penfeizhou.animation.io.e
    public int position() {
        return this.f43313b.position();
    }

    @Override // com.github.penfeizhou.animation.io.e
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f43313b.read(bArr, i10, i11);
    }

    @Override // com.github.penfeizhou.animation.io.e
    public void reset() throws IOException {
        this.f43313b.reset();
    }

    @Override // com.github.penfeizhou.animation.io.e
    public long skip(long j10) throws IOException {
        return this.f43313b.skip(j10);
    }
}
