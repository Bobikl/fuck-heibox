package com.google.android.exoplayer2.audio;

/* JADX INFO: compiled from: AuxEffectInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44349c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f44351b;

    public x(int i10, float f10) {
        this.f44350a = i10;
        this.f44351b = f10;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.f44350a == xVar.f44350a && Float.compare(xVar.f44351b, this.f44351b) == 0;
    }

    public int hashCode() {
        return ((bb.c.b.f30674h7 + this.f44350a) * 31) + Float.floatToIntBits(this.f44351b);
    }
}
