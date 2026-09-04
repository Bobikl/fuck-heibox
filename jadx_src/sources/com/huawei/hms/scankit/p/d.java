package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: AlignmentPattern.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d extends u6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f61660e;

    d(float f10, float f11, float f12) {
        super(f10, f11);
        this.f61660e = f12;
    }

    boolean b(float f10, float f11, float f12) {
        if (Math.abs(f11 - c()) > f10 || Math.abs(f12 - b()) > f10) {
            return false;
        }
        float fAbs = Math.abs(f10 - this.f61660e);
        return fAbs <= 1.0f || fAbs <= this.f61660e;
    }

    d c(float f10, float f11, float f12) {
        return new d((b() + f11) / 2.0f, (c() + f10) / 2.0f, (this.f61660e + f12) / 2.0f);
    }
}
