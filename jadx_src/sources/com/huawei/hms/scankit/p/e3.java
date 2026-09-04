package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: FinderPattern.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e3 extends u6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f61758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f61759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f61760g;

    e3(float f10, float f11, float f12, boolean z10) {
        this(f10, f11, f12, z10, 1);
    }

    public e3(float f10, float f11, float f12, boolean z10, int i10) {
        super(f10, f11, i10);
        this.f61758e = f12;
        this.f61759f = i10;
        this.f61760g = z10;
    }

    e3 a(float f10, float f11, float f12, boolean z10) {
        int i10 = this.f61759f;
        int i11 = i10 + 1;
        float fB = (i10 * b()) + f11;
        float f13 = i11;
        float f14 = fB / f13;
        float fC = ((this.f61759f * c()) + f10) / f13;
        float f15 = ((this.f61759f * this.f61758e) + f12) / f13;
        boolean z11 = this.f61760g;
        return new e3(f14, fC, f15, z11 ? z10 : z11, i11);
    }

    boolean b(float f10, float f11, float f12) {
        if (Math.abs(f11 - c()) > f10 || Math.abs(f12 - b()) > f10) {
            return false;
        }
        float fAbs = Math.abs(f10 - this.f61758e);
        return fAbs <= 1.0f || fAbs <= this.f61758e;
    }

    @Override // com.huawei.hms.scankit.p.u6
    public boolean d() {
        return this.f61760g;
    }

    public float e() {
        return this.f61758e;
    }
}
