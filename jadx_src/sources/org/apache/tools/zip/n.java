package org.apache.tools.zip;

/* JADX INFO: compiled from: UnrecognizedExtraField.java */
/* JADX INFO: loaded from: classes5.dex */
public class n implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a0 f137424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f137425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f137426d;

    @Override // org.apache.tools.zip.u
    public byte[] a() {
        byte[] bArr = this.f137426d;
        return bArr != null ? b0.d(bArr) : e();
    }

    @Override // org.apache.tools.zip.c
    public void b(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        h(bArr2);
        if (this.f137425c == null) {
            j(bArr2);
        }
    }

    @Override // org.apache.tools.zip.u
    public a0 c() {
        return new a0(this.f137425c.length);
    }

    @Override // org.apache.tools.zip.u
    public a0 d() {
        return this.f137424b;
    }

    @Override // org.apache.tools.zip.u
    public byte[] e() {
        return b0.d(this.f137425c);
    }

    @Override // org.apache.tools.zip.u
    public a0 f() {
        byte[] bArr = this.f137426d;
        return bArr != null ? new a0(bArr.length) : c();
    }

    @Override // org.apache.tools.zip.u
    public void g(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        j(bArr2);
    }

    public void h(byte[] bArr) {
        this.f137426d = b0.d(bArr);
    }

    public void i(a0 a0Var) {
        this.f137424b = a0Var;
    }

    public void j(byte[] bArr) {
        this.f137425c = b0.d(bArr);
    }
}
