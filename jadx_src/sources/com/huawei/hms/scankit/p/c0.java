package com.huawei.hms.scankit.p;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: compiled from: ByteMatrix.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[][] f61606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f61607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f61608c;

    public c0(int i10, int i11) {
        this.f61606a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.f61607b = i10;
        this.f61608c = i11;
    }

    public byte a(int i10, int i11) {
        try {
            if (w7.a(this.f61606a, i11) && w7.a(this.f61606a[i11], i10)) {
                return this.f61606a[i11][i10];
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }

    public void a(byte b10) {
        for (byte[] bArr : this.f61606a) {
            Arrays.fill(bArr, b10);
        }
    }

    public void a(int i10, int i11, int i12) {
        try {
            if (!w7.a(this.f61606a, i11) || !w7.a(this.f61606a[i11], i10)) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f61606a[i11][i10] = (byte) i12;
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }

    public void a(int i10, int i11, boolean z10) {
        try {
            if (!w7.a(this.f61606a, i11) || !w7.a(this.f61606a[i11], i10)) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f61606a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }

    public byte[][] a() {
        return this.f61606a;
    }

    public int b() {
        return this.f61608c;
    }

    public int c() {
        return this.f61607b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f61607b * 2 * this.f61608c) + 2);
        for (int i10 = 0; i10 < this.f61608c; i10++) {
            byte[] bArr = this.f61606a[i10];
            for (int i11 = 0; i11 < this.f61607b; i11++) {
                byte b10 = bArr[i11];
                if (b10 == 0) {
                    sb2.append(" 0");
                } else if (b10 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
