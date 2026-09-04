package com.igexin.push.d.c;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f63840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f63841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f63842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f63843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte f63844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f63845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f63846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f63847n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f63848o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f63849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f63850q;

    public int a() {
        int i10 = this.f63837d | this.f63840g | this.f63841h | this.f63842i;
        this.f63837d = i10;
        return i10;
    }

    public void a(byte b10) {
        this.f63837d = b10 & 255;
        this.f63840g = (byte) (b10 & 192);
        this.f63841h = (byte) (b10 & org.apache.tools.tar.c.F);
        this.f63842i = (byte) (b10 & 15);
    }

    public int b() {
        int i10 = this.f63839f | this.f63843j | this.f63844k | this.f63845l | this.f63846m;
        this.f63839f = i10;
        return i10;
    }
}
