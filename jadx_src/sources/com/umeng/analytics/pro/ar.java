package com.umeng.analytics.pro;

/* JADX INFO: compiled from: ShortStack.java */
/* JADX INFO: loaded from: classes4.dex */
public class ar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short[] f104532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f104533b = -1;

    public ar(int i10) {
        this.f104532a = new short[i10];
    }

    private void d() {
        short[] sArr = this.f104532a;
        short[] sArr2 = new short[sArr.length * 2];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        this.f104532a = sArr2;
    }

    public short a() {
        short[] sArr = this.f104532a;
        int i10 = this.f104533b;
        this.f104533b = i10 - 1;
        return sArr[i10];
    }

    public void a(short s10) {
        if (this.f104532a.length == this.f104533b + 1) {
            d();
        }
        short[] sArr = this.f104532a;
        int i10 = this.f104533b + 1;
        this.f104533b = i10;
        sArr[i10] = s10;
    }

    public short b() {
        return this.f104532a[this.f104533b];
    }

    public void c() {
        this.f104533b = -1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<ShortStack vector:[");
        for (int i10 = 0; i10 < this.f104532a.length; i10++) {
            if (i10 != 0) {
                sb2.append(" ");
            }
            if (i10 == this.f104533b) {
                sb2.append(">>");
            }
            sb2.append((int) this.f104532a[i10]);
            if (i10 == this.f104533b) {
                sb2.append("<<");
            }
        }
        sb2.append("]>");
        return sb2.toString();
    }
}
