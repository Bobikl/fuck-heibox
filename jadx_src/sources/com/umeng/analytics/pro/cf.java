package com.umeng.analytics.pro;

/* JADX INFO: compiled from: TMemoryInputTransport.java */
/* JADX INFO: loaded from: classes4.dex */
public final class cf extends cg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f104672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f104673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f104674c;

    public cf() {
    }

    public cf(byte[] bArr) {
        a(bArr);
    }

    public cf(byte[] bArr, int i10, int i11) {
        c(bArr, i10, i11);
    }

    @Override // com.umeng.analytics.pro.cg
    public int a(byte[] bArr, int i10, int i11) throws ch {
        int iH = h();
        if (i11 > iH) {
            i11 = iH;
        }
        if (i11 > 0) {
            System.arraycopy(this.f104672a, this.f104673b, bArr, i10, i11);
            a(i11);
        }
        return i11;
    }

    @Override // com.umeng.analytics.pro.cg
    public void a(int i10) {
        this.f104673b += i10;
    }

    public void a(byte[] bArr) {
        c(bArr, 0, bArr.length);
    }

    @Override // com.umeng.analytics.pro.cg
    public boolean a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.cg
    public void b() throws ch {
    }

    @Override // com.umeng.analytics.pro.cg
    public void b(byte[] bArr, int i10, int i11) throws ch {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.umeng.analytics.pro.cg
    public void c() {
    }

    public void c(byte[] bArr, int i10, int i11) {
        this.f104672a = bArr;
        this.f104673b = i10;
        this.f104674c = i10 + i11;
    }

    public void e() {
        this.f104672a = null;
    }

    @Override // com.umeng.analytics.pro.cg
    public byte[] f() {
        return this.f104672a;
    }

    @Override // com.umeng.analytics.pro.cg
    public int g() {
        return this.f104673b;
    }

    @Override // com.umeng.analytics.pro.cg
    public int h() {
        return this.f104674c - this.f104673b;
    }
}
