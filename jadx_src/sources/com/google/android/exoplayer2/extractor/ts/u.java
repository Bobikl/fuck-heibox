package com.google.android.exoplayer2.extractor.ts;

import java.util.Arrays;

/* JADX INFO: compiled from: NalUnitTargetBuffer.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f46148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f46150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46151e;

    public u(int i10, int i11) {
        this.f46147a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f46150d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f46148b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f46150d;
            int length = bArr2.length;
            int i13 = this.f46151e;
            if (length < i13 + i12) {
                this.f46150d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f46150d, this.f46151e, i12);
            this.f46151e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f46148b) {
            return false;
        }
        this.f46151e -= i10;
        this.f46148b = false;
        this.f46149c = true;
        return true;
    }

    public boolean c() {
        return this.f46149c;
    }

    public void d() {
        this.f46148b = false;
        this.f46149c = false;
    }

    public void e(int i10) {
        com.google.android.exoplayer2.util.a.i(!this.f46148b);
        boolean z10 = i10 == this.f46147a;
        this.f46148b = z10;
        if (z10) {
            this.f46151e = 3;
            this.f46149c = false;
        }
    }
}
