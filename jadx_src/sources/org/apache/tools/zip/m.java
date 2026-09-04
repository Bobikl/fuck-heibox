package org.apache.tools.zip;

/* JADX INFO: compiled from: UnparseableExtraFieldData.java */
/* JADX INFO: loaded from: classes5.dex */
public final class m implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a0 f137421d = new a0(44225);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f137422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f137423c;

    @Override // org.apache.tools.zip.u
    public byte[] a() {
        byte[] bArr = this.f137423c;
        return bArr == null ? e() : b0.d(bArr);
    }

    @Override // org.apache.tools.zip.c
    public void b(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f137423c = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        if (this.f137422b == null) {
            g(bArr, i10, i11);
        }
    }

    @Override // org.apache.tools.zip.u
    public a0 c() {
        byte[] bArr = this.f137422b;
        return new a0(bArr == null ? 0 : bArr.length);
    }

    @Override // org.apache.tools.zip.u
    public a0 d() {
        return f137421d;
    }

    @Override // org.apache.tools.zip.u
    public byte[] e() {
        return b0.d(this.f137422b);
    }

    @Override // org.apache.tools.zip.u
    public a0 f() {
        byte[] bArr = this.f137423c;
        return bArr == null ? c() : new a0(bArr.length);
    }

    @Override // org.apache.tools.zip.u
    public void g(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f137422b = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }
}
