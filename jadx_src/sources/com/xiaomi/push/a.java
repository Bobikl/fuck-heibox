package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f106807a = new a(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private volatile int f162a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final byte[] f163a;

    private a(byte[] bArr) {
        this.f163a = bArr;
    }

    public static a a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static a a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new a(bArr2);
    }

    public int a() {
        return this.f163a.length;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] m140a() {
        byte[] bArr = this.f163a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        byte[] bArr = this.f163a;
        int length = bArr.length;
        byte[] bArr2 = ((a) obj).f163a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = this.f162a;
        if (i10 == 0) {
            byte[] bArr = this.f163a;
            int length = bArr.length;
            for (byte b10 : bArr) {
                length = (length * 31) + b10;
            }
            i10 = length == 0 ? 1 : length;
            this.f162a = i10;
        }
        return i10;
    }
}
