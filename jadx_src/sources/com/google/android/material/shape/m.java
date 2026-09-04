package com.google.android.material.shape;

import androidx.annotation.n0;

/* JADX INFO: compiled from: OffsetEdgeTreatment.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f55121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f55122c;

    public m(@n0 h hVar, float f10) {
        this.f55121b = hVar;
        this.f55122c = f10;
    }

    @Override // com.google.android.material.shape.h
    boolean a() {
        return this.f55121b.a();
    }

    @Override // com.google.android.material.shape.h
    public void b(float f10, float f11, float f12, @n0 r rVar) {
        this.f55121b.b(f10, f11 - this.f55122c, f12, rVar);
    }
}
