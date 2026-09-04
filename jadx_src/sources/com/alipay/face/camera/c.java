package com.alipay.face.camera;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: CameraData.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f38668p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f38669q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f38670r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f38671s = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f38672t = 4;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f38673u = 5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f38674v = 6;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f38675w = 50;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f38676x = 51;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f38677y = 5;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f38678z = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ByteBuffer f38679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f38680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f38681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f38682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ByteBuffer f38683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f38684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f38685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f38686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ByteBuffer f38687i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f38688j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f38689k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f38690l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f38691m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f38692n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f38693o;

    public c() {
    }

    public c(ByteBuffer byteBuffer, int i10, int i11, int i12, ByteBuffer byteBuffer2, int i13, int i14, int i15, int i16) {
        this(byteBuffer, i10, i11, i12, byteBuffer2, i13, i14, i15, i16, false);
    }

    public c(ByteBuffer byteBuffer, int i10, int i11, int i12, ByteBuffer byteBuffer2, int i13, int i14, int i15, int i16, boolean z10) {
        this(byteBuffer, i10, i11, i12, byteBuffer2, i13, i14, -1, null, 0, 0, -1, i15, i16, z10);
    }

    public c(ByteBuffer byteBuffer, int i10, int i11, int i12, ByteBuffer byteBuffer2, int i13, int i14, int i15, ByteBuffer byteBuffer3, int i16, int i17, int i18, int i19, int i20, boolean z10) {
        this.f38679a = byteBuffer;
        this.f38680b = i10;
        this.f38681c = i11;
        this.f38682d = i12;
        this.f38683e = byteBuffer2;
        this.f38684f = i13;
        this.f38685g = i14;
        this.f38686h = i15;
        this.f38687i = byteBuffer3;
        this.f38688j = i16;
        this.f38689k = i17;
        this.f38690l = i18;
        this.f38691m = i19;
        this.f38692n = i20;
        this.f38693o = z10;
    }

    public void A(int i10) {
        this.f38690l = i10;
    }

    public void B(int i10) {
        this.f38689k = i10;
    }

    public void C(int i10) {
        this.f38688j = i10;
    }

    public void D(boolean z10) {
        this.f38693o = z10;
    }

    public void E(int i10) {
        this.f38692n = i10;
    }

    public void F(int i10) {
        this.f38691m = i10;
    }

    public c a() {
        c cVar = new c();
        cVar.f38679a = ByteBuffer.allocateDirect(this.f38679a.capacity());
        this.f38679a.rewind();
        cVar.f38679a.put(this.f38679a);
        this.f38679a.rewind();
        cVar.f38679a.rewind();
        cVar.f38680b = this.f38680b;
        cVar.f38681c = this.f38681c;
        cVar.f38682d = this.f38682d;
        ByteBuffer byteBuffer = this.f38683e;
        if (byteBuffer != null) {
            cVar.f38683e = ByteBuffer.allocateDirect(byteBuffer.capacity());
            this.f38683e.rewind();
            cVar.f38683e.put(this.f38683e);
            this.f38683e.rewind();
            cVar.f38683e.rewind();
        } else {
            cVar.f38683e = null;
        }
        cVar.f38684f = this.f38684f;
        cVar.f38685g = this.f38685g;
        cVar.f38686h = this.f38686h;
        ByteBuffer byteBuffer2 = this.f38687i;
        if (byteBuffer2 != null) {
            cVar.f38687i = ByteBuffer.allocateDirect(byteBuffer2.capacity());
            this.f38687i.rewind();
            cVar.f38687i.put(this.f38687i);
            this.f38687i.rewind();
            cVar.f38687i.rewind();
        } else {
            cVar.f38687i = null;
        }
        cVar.f38688j = this.f38688j;
        cVar.f38689k = this.f38689k;
        cVar.f38690l = this.f38690l;
        cVar.f38691m = this.f38691m;
        cVar.f38692n = this.f38692n;
        cVar.f38693o = this.f38693o;
        return cVar;
    }

    public ByteBuffer b() {
        return this.f38679a;
    }

    public int c() {
        return this.f38682d;
    }

    public int d() {
        return this.f38681c;
    }

    public int e() {
        return this.f38680b;
    }

    public ByteBuffer f() {
        return this.f38683e;
    }

    public int g() {
        return this.f38686h;
    }

    public int h() {
        return this.f38685g;
    }

    public int i() {
        return this.f38684f;
    }

    public ByteBuffer j() {
        return this.f38687i;
    }

    public int k() {
        return this.f38690l;
    }

    public int l() {
        return this.f38689k;
    }

    public int m() {
        return this.f38688j;
    }

    public boolean n() {
        return this.f38693o;
    }

    public int o() {
        return this.f38692n;
    }

    public int p() {
        return this.f38691m;
    }

    public void q() {
        this.f38679a = null;
        this.f38683e = null;
        this.f38687i = null;
    }

    public void r(ByteBuffer byteBuffer) {
        this.f38679a = byteBuffer;
    }

    public void s(int i10) {
        this.f38682d = i10;
    }

    public void t(int i10) {
        this.f38681c = i10;
    }

    public String toString() {
        return "CameraData{, mColorWidth=" + this.f38680b + ", mColorHeight=" + this.f38681c + ", mColorFrameMode=" + this.f38682d + ", mDepthWidth=" + this.f38684f + ", mDepthHeight=" + this.f38685g + ", mPreviewWidth=" + this.f38691m + ", mPreviewHeight=" + this.f38692n + ", mMirror=" + this.f38693o + '}';
    }

    public void u(int i10) {
        this.f38680b = i10;
    }

    public void v(ByteBuffer byteBuffer) {
        this.f38683e = byteBuffer;
    }

    public void w(int i10) {
        this.f38686h = i10;
    }

    public void x(int i10) {
        this.f38685g = i10;
    }

    public void y(int i10) {
        this.f38684f = i10;
    }

    public void z(ByteBuffer byteBuffer) {
        this.f38687i = byteBuffer;
    }
}
