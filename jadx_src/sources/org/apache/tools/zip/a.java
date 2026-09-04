package org.apache.tools.zip;

import java.nio.charset.StandardCharsets;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: compiled from: AbstractUnicodeExtraField.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f137377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f137378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f137379d;

    protected a() {
    }

    protected a(String str, byte[] bArr) {
        this(str, bArr, 0, bArr.length);
    }

    protected a(String str, byte[] bArr, int i10, int i11) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i10, i11);
        this.f137377b = crc32.getValue();
        this.f137378c = str.getBytes(StandardCharsets.UTF_8);
    }

    private void h() {
        byte[] bArr = this.f137378c;
        if (bArr == null) {
            return;
        }
        byte[] bArr2 = new byte[bArr.length + 5];
        this.f137379d = bArr2;
        bArr2[0] = 1;
        System.arraycopy(y.b(this.f137377b), 0, this.f137379d, 1, 4);
        byte[] bArr3 = this.f137378c;
        System.arraycopy(bArr3, 0, this.f137379d, 5, bArr3.length);
    }

    @Override // org.apache.tools.zip.u
    public byte[] a() {
        if (this.f137379d == null) {
            h();
        }
        byte[] bArr = this.f137379d;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // org.apache.tools.zip.u
    public a0 c() {
        return f();
    }

    @Override // org.apache.tools.zip.u
    public byte[] e() {
        return a();
    }

    @Override // org.apache.tools.zip.u
    public a0 f() {
        if (this.f137379d == null) {
            h();
        }
        return new a0(this.f137379d.length);
    }

    @Override // org.apache.tools.zip.u
    public void g(byte[] bArr, int i10, int i11) throws ZipException {
        if (i11 < 5) {
            throw new ZipException("UniCode path extra data must have at least 5 bytes.");
        }
        byte b10 = bArr[i10];
        if (b10 != 1) {
            throw new ZipException("Unsupported version [" + ((int) b10) + "] for UniCode path extra data.");
        }
        this.f137377b = y.e(bArr, i10 + 1);
        int i12 = i11 - 5;
        byte[] bArr2 = new byte[i12];
        this.f137378c = bArr2;
        System.arraycopy(bArr, i10 + 5, bArr2, 0, i12);
        this.f137379d = null;
    }

    public long i() {
        return this.f137377b;
    }

    public byte[] j() {
        byte[] bArr = this.f137378c;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public void k(long j10) {
        this.f137377b = j10;
        this.f137379d = null;
    }

    public void l(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.f137378c = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        } else {
            this.f137378c = null;
        }
        this.f137379d = null;
    }
}
