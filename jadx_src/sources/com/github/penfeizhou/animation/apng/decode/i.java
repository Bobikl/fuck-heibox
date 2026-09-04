package com.github.penfeizhou.animation.apng.decode;

import java.io.IOException;

/* JADX INFO: compiled from: IHDRChunk.java */
/* JADX INFO: loaded from: classes6.dex */
public class i extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f43228h = d.a("IHDR");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f43229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f43230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    byte[] f43231g = new byte[5];

    i() {
    }

    @Override // com.github.penfeizhou.animation.apng.decode.d
    void b(com.github.penfeizhou.animation.apng.io.a aVar) throws IOException {
        this.f43229e = aVar.e();
        this.f43230f = aVar.e();
        byte[] bArr = this.f43231g;
        aVar.read(bArr, 0, bArr.length);
    }
}
