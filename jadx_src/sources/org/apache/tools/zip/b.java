package org.apache.tools.zip;

import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: compiled from: AsiExtraField.java */
/* JADX INFO: loaded from: classes5.dex */
public class b implements u, l, Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a0 f137383h = new a0(30062);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f137384i = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f137385b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f137386c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f137387d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f137388e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f137389f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CRC32 f137390g = new CRC32();

    @Override // org.apache.tools.zip.u
    public byte[] a() {
        return e();
    }

    @Override // org.apache.tools.zip.u
    public a0 c() {
        return new a0(i().getBytes().length + 14);
    }

    public Object clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f137390g = new CRC32();
            return bVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // org.apache.tools.zip.u
    public a0 d() {
        return f137383h;
    }

    @Override // org.apache.tools.zip.u
    public byte[] e() {
        int iC = c().c() - 4;
        byte[] bArr = new byte[iC];
        System.arraycopy(a0.b(j()), 0, bArr, 0, 2);
        byte[] bytes = i().getBytes();
        System.arraycopy(y.b(bytes.length), 0, bArr, 2, 4);
        System.arraycopy(a0.b(l()), 0, bArr, 6, 2);
        System.arraycopy(a0.b(h()), 0, bArr, 8, 2);
        System.arraycopy(bytes, 0, bArr, 10, bytes.length);
        this.f137390g.reset();
        this.f137390g.update(bArr);
        byte[] bArr2 = new byte[iC + 4];
        System.arraycopy(y.b(this.f137390g.getValue()), 0, bArr2, 0, 4);
        System.arraycopy(bArr, 0, bArr2, 4, iC);
        return bArr2;
    }

    @Override // org.apache.tools.zip.u
    public a0 f() {
        return c();
    }

    @Override // org.apache.tools.zip.u
    public void g(byte[] bArr, int i10, int i11) throws ZipException {
        long jE = y.e(bArr, i10);
        int i12 = i11 - 4;
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i10 + 4, bArr2, 0, i12);
        this.f137390g.reset();
        this.f137390g.update(bArr2);
        long value = this.f137390g.getValue();
        if (jE != value) {
            throw new ZipException("bad CRC checksum " + Long.toHexString(jE) + " instead of " + Long.toHexString(value));
        }
        int iE = a0.e(bArr2, 0);
        int iE2 = (int) y.e(bArr2, 2);
        byte[] bArr3 = new byte[iE2];
        this.f137386c = a0.e(bArr2, 6);
        this.f137387d = a0.e(bArr2, 8);
        if (iE2 == 0) {
            this.f137388e = "";
        } else {
            System.arraycopy(bArr2, 10, bArr3, 0, iE2);
            this.f137388e = new String(bArr3);
        }
        o((iE & 16384) != 0);
        r(iE);
    }

    public int h() {
        return this.f137387d;
    }

    public String i() {
        return this.f137388e;
    }

    public int j() {
        return this.f137385b;
    }

    protected int k(int i10) {
        int i11;
        if (n()) {
            i11 = l.C3;
        } else {
            i11 = m() ? 16384 : 32768;
        }
        return (i10 & 4095) | i11;
    }

    public int l() {
        return this.f137386c;
    }

    public boolean m() {
        return this.f137389f && !n();
    }

    public boolean n() {
        return !i().isEmpty();
    }

    public void o(boolean z10) {
        this.f137389f = z10;
        this.f137385b = k(this.f137385b);
    }

    public void p(int i10) {
        this.f137387d = i10;
    }

    public void q(String str) {
        this.f137388e = str;
        this.f137385b = k(this.f137385b);
    }

    public void r(int i10) {
        this.f137385b = k(i10);
    }

    public void s(int i10) {
        this.f137386c = i10;
    }
}
