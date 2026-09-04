package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: LuminanceSource.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f62225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62226b;

    protected p4(int i10, int i11) {
        this.f62225a = i10;
        this.f62226b = i11;
    }

    public final int a() {
        return this.f62226b;
    }

    public abstract p4 a(int i10, int i11, int i12, int i13);

    public abstract byte[] a(int i10, byte[] bArr);

    public abstract byte[] b();

    public final int c() {
        return this.f62225a;
    }

    public final String toString() {
        char c10;
        int i10 = this.f62225a;
        byte[] bArrA = new byte[i10];
        StringBuilder sb2 = new StringBuilder(this.f62226b * (i10 + 1));
        for (int i11 = 0; i11 < this.f62226b; i11++) {
            bArrA = a(i11, bArrA);
            for (int i12 = 0; i12 < this.f62225a; i12++) {
                int i13 = bArrA[i12] & 255;
                if (i13 < 64) {
                    c10 = '#';
                } else if (i13 < 128) {
                    c10 = '+';
                } else {
                    c10 = i13 < 192 ? lg.a.f131414g : ' ';
                }
                sb2.append(c10);
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
