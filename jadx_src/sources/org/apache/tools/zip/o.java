package org.apache.tools.zip;

import java.util.zip.ZipException;

/* JADX INFO: compiled from: Zip64ExtendedInformationExtraField.java */
/* JADX INFO: loaded from: classes5.dex */
public class o implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f137428h = "Zip64 extended information must contain both size values in the local file header.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q f137430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q f137431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private q f137432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private y f137433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f137434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final a0 f137427g = new a0(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f137429i = new byte[0];

    public o() {
    }

    public o(q qVar, q qVar2) {
        this(qVar, qVar2, null, null);
    }

    public o(q qVar, q qVar2, q qVar3, y yVar) {
        this.f137430b = qVar;
        this.f137431c = qVar2;
        this.f137432d = qVar3;
        this.f137433e = yVar;
    }

    private int h(byte[] bArr) {
        int i10;
        q qVar = this.f137430b;
        if (qVar != null) {
            System.arraycopy(qVar.a(), 0, bArr, 0, 8);
            i10 = 8;
        } else {
            i10 = 0;
        }
        q qVar2 = this.f137431c;
        if (qVar2 == null) {
            return i10;
        }
        System.arraycopy(qVar2.a(), 0, bArr, i10, 8);
        return i10 + 8;
    }

    @Override // org.apache.tools.zip.u
    public byte[] a() {
        byte[] bArr = new byte[f().c()];
        int iH = h(bArr);
        q qVar = this.f137432d;
        if (qVar != null) {
            System.arraycopy(qVar.a(), 0, bArr, iH, 8);
            iH += 8;
        }
        y yVar = this.f137433e;
        if (yVar != null) {
            System.arraycopy(yVar.a(), 0, bArr, iH, 4);
        }
        return bArr;
    }

    @Override // org.apache.tools.zip.c
    public void b(byte[] bArr, int i10, int i11) throws ZipException {
        byte[] bArr2 = new byte[i11];
        this.f137434f = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        if (i11 >= 28) {
            g(bArr, i10, i11);
            return;
        }
        if (i11 != 24) {
            if (i11 % 8 == 4) {
                this.f137433e = new y(bArr, (i10 + i11) - 4);
            }
        } else {
            this.f137430b = new q(bArr, i10);
            int i12 = i10 + 8;
            this.f137431c = new q(bArr, i12);
            this.f137432d = new q(bArr, i12 + 8);
        }
    }

    @Override // org.apache.tools.zip.u
    public a0 c() {
        return new a0(this.f137430b != null ? 16 : 0);
    }

    @Override // org.apache.tools.zip.u
    public a0 d() {
        return f137427g;
    }

    @Override // org.apache.tools.zip.u
    public byte[] e() {
        q qVar = this.f137430b;
        if (qVar == null && this.f137431c == null) {
            return f137429i;
        }
        if (qVar == null || this.f137431c == null) {
            throw new IllegalArgumentException(f137428h);
        }
        byte[] bArr = new byte[16];
        h(bArr);
        return bArr;
    }

    @Override // org.apache.tools.zip.u
    public a0 f() {
        return new a0((this.f137430b != null ? 8 : 0) + (this.f137431c != null ? 8 : 0) + (this.f137432d == null ? 0 : 8) + (this.f137433e != null ? 4 : 0));
    }

    @Override // org.apache.tools.zip.u
    public void g(byte[] bArr, int i10, int i11) throws ZipException {
        if (i11 == 0) {
            return;
        }
        if (i11 < 16) {
            throw new ZipException(f137428h);
        }
        this.f137430b = new q(bArr, i10);
        int i12 = i10 + 8;
        this.f137431c = new q(bArr, i12);
        int i13 = i12 + 8;
        int i14 = i11 - 16;
        if (i14 >= 8) {
            this.f137432d = new q(bArr, i13);
            i13 += 8;
            i14 -= 8;
        }
        if (i14 >= 4) {
            this.f137433e = new y(bArr, i13);
        }
    }

    public q i() {
        return this.f137431c;
    }

    public y j() {
        return this.f137433e;
    }

    public q k() {
        return this.f137432d;
    }

    public q l() {
        return this.f137430b;
    }

    public void m(boolean z10, boolean z11, boolean z12, boolean z13) throws ZipException {
        byte[] bArr = this.f137434f;
        if (bArr != null) {
            int i10 = 0;
            int i11 = (z10 ? 8 : 0) + (z11 ? 8 : 0) + (z12 ? 8 : 0) + (z13 ? 4 : 0);
            if (bArr.length < i11) {
                throw new ZipException("central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length " + i11 + " but is " + this.f137434f.length);
            }
            if (z10) {
                this.f137430b = new q(this.f137434f, 0);
                i10 = 8;
            }
            if (z11) {
                this.f137431c = new q(this.f137434f, i10);
                i10 += 8;
            }
            if (z12) {
                this.f137432d = new q(this.f137434f, i10);
                i10 += 8;
            }
            if (z13) {
                this.f137433e = new y(this.f137434f, i10);
            }
        }
    }

    public void n(q qVar) {
        this.f137431c = qVar;
    }

    public void o(y yVar) {
        this.f137433e = yVar;
    }

    public void p(q qVar) {
        this.f137432d = qVar;
    }

    public void q(q qVar) {
        this.f137430b = qVar;
    }
}
