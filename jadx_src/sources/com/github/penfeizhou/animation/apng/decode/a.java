package com.github.penfeizhou.animation.apng.decode;

import java.io.IOException;

/* JADX INFO: compiled from: ACTLChunk.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f43186g = d.a("acTL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f43187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f43188f;

    a() {
    }

    @Override // com.github.penfeizhou.animation.apng.decode.d
    void b(com.github.penfeizhou.animation.apng.io.a aVar) throws IOException {
        this.f43187e = aVar.e();
        this.f43188f = aVar.e();
    }
}
