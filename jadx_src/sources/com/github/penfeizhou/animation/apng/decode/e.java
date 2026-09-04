package com.github.penfeizhou.animation.apng.decode;

import java.io.IOException;

/* JADX INFO: compiled from: FCTLChunk.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f43209n = d.a("fcTL");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f43210o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f43211p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f43212q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final int f43213r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final int f43214s = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f43215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f43216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f43217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f43218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f43219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    short f43220j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    short f43221k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    byte f43222l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    byte f43223m;

    e() {
    }

    @Override // com.github.penfeizhou.animation.apng.decode.d
    void b(com.github.penfeizhou.animation.apng.io.a aVar) throws IOException {
        this.f43215e = aVar.e();
        this.f43216f = aVar.e();
        this.f43217g = aVar.e();
        this.f43218h = aVar.e();
        this.f43219i = aVar.e();
        this.f43220j = aVar.f();
        this.f43221k = aVar.f();
        this.f43222l = aVar.peek();
        this.f43223m = aVar.peek();
    }
}
