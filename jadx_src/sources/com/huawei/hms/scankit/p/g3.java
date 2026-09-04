package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: FinderPattern.java */
/* JADX INFO: loaded from: classes7.dex */
public final class g3 extends u6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f61855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f61856f;

    g3(float f10, float f11, float f12) {
        this(f10, f11, f12, 1);
    }

    private g3(float f10, float f11, float f12, int i10) {
        super(f10, f11);
        this.f61855e = f12;
        this.f61856f = i10;
    }

    @Override // com.huawei.hms.scankit.p.u6
    public int a() {
        return this.f61856f;
    }

    boolean b(float f10, float f11, float f12) {
        if (Math.abs(f11 - c()) > f10 || Math.abs(f12 - b()) > f10) {
            return false;
        }
        float fAbs = Math.abs(f10 - this.f61855e);
        return fAbs <= 1.0f || fAbs <= this.f61855e;
    }

    g3 c(float f10, float f11, float f12) {
        int i10 = this.f61856f;
        int i11 = i10 + 1;
        float fB = (i10 * b()) + f11;
        float f13 = i11;
        return new g3(fB / f13, ((this.f61856f * c()) + f10) / f13, ((this.f61856f * this.f61855e) + f12) / f13, i11);
    }

    public float e() {
        return this.f61855e;
    }
}
