package org.apache.tools.zip;

/* JADX INFO: compiled from: ZipShort.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a0 implements Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f137380c = 65280;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f137381d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f137382b;

    public a0(int i10) {
        this.f137382b = i10;
    }

    public a0(byte[] bArr) {
        this(bArr, 0);
    }

    public a0(byte[] bArr, int i10) {
        this.f137382b = e(bArr, i10);
    }

    public static byte[] b(int i10) {
        return new byte[]{(byte) (i10 & 255), (byte) ((i10 & 65280) >> 8)};
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0);
    }

    public static int e(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] << 8) & 65280) + (bArr[i10] & 255);
    }

    public static void f(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 & 255);
        bArr[i11 + 1] = (byte) ((i10 & 65280) >> 8);
    }

    public byte[] a() {
        byte[] bArr = new byte[2];
        f(this.f137382b, bArr, 0);
        return bArr;
    }

    public int c() {
        return this.f137382b;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof a0) && this.f137382b == ((a0) obj).c();
    }

    public int hashCode() {
        return this.f137382b;
    }

    public String toString() {
        return "ZipShort value: " + this.f137382b;
    }
}
