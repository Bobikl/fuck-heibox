package com.umeng.message.proguard;

/* JADX INFO: loaded from: classes4.dex */
public abstract class at {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected byte[] f105753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f105754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f105755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f105756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f105757f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f105760i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final byte f105752a = 61;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f105758g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f105759h = 4;

    protected at() {
    }

    private int a(byte[] bArr, int i10) {
        byte[] bArr2 = this.f105753b;
        if (bArr2 == null) {
            return this.f105755d ? -1 : 0;
        }
        int iMin = Math.min(bArr2 != null ? this.f105754c - this.f105760i : 0, i10);
        System.arraycopy(this.f105753b, this.f105760i, bArr, 0, iMin);
        int i11 = this.f105760i + iMin;
        this.f105760i = i11;
        if (i11 >= this.f105754c) {
            this.f105753b = null;
        }
        return iMin;
    }

    private void a() {
        this.f105753b = null;
        this.f105754c = 0;
        this.f105760i = 0;
        this.f105756e = 0;
        this.f105757f = 0;
        this.f105755d = false;
    }

    protected final void a(int i10) {
        byte[] bArr = this.f105753b;
        if (bArr == null || bArr.length < this.f105754c + i10) {
            if (bArr == null) {
                this.f105753b = new byte[8192];
                this.f105754c = 0;
                this.f105760i = 0;
            } else {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f105753b = bArr2;
            }
        }
    }

    abstract void a(byte[] bArr, int i10, int i11);

    abstract void b(byte[] bArr, int i10, int i11);

    public byte[] b(String str) {
        return e(str.getBytes());
    }

    public long c(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f105758g;
        return ((long) (((length + i10) - 1) / i10)) * ((long) this.f105759h);
    }

    public byte[] d(byte[] bArr) {
        a();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a(bArr, 0, bArr.length);
        a(bArr, 0, -1);
        int i10 = this.f105754c - this.f105760i;
        byte[] bArr2 = new byte[i10];
        a(bArr2, i10);
        return bArr2;
    }

    public byte[] e(byte[] bArr) {
        a();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        b(bArr, 0, bArr.length);
        b(bArr, 0, -1);
        int i10 = this.f105754c;
        byte[] bArr2 = new byte[i10];
        a(bArr2, i10);
        return bArr2;
    }
}
