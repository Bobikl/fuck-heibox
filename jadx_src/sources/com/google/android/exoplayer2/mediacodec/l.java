package com.google.android.exoplayer2.mediacodec;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: IntArrayQueue.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f46781f = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46782a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46783b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46784c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f46785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f46786e;

    public l() {
        int[] iArr = new int[16];
        this.f46785d = iArr;
        this.f46786e = iArr.length - 1;
    }

    private void d() {
        int[] iArr = this.f46785d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i10 = this.f46782a;
        int i11 = length2 - i10;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.f46785d, 0, iArr2, i11, i10);
        this.f46782a = 0;
        this.f46783b = this.f46784c - 1;
        this.f46785d = iArr2;
        this.f46786e = iArr2.length - 1;
    }

    public void a(int i10) {
        if (this.f46784c == this.f46785d.length) {
            d();
        }
        int i11 = (this.f46783b + 1) & this.f46786e;
        this.f46783b = i11;
        this.f46785d[i11] = i10;
        this.f46784c++;
    }

    public int b() {
        return this.f46785d.length;
    }

    public void c() {
        this.f46782a = 0;
        this.f46783b = -1;
        this.f46784c = 0;
    }

    public boolean e() {
        return this.f46784c == 0;
    }

    public int f() {
        int i10 = this.f46784c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f46785d;
        int i11 = this.f46782a;
        int i12 = iArr[i11];
        this.f46782a = (i11 + 1) & this.f46786e;
        this.f46784c = i10 - 1;
        return i12;
    }

    public int g() {
        return this.f46784c;
    }
}
