package androidx.core.graphics;

import android.graphics.PointF;

/* JADX INFO: compiled from: PathSegment.java */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f20754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f20755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PointF f20756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f20757d;

    public n0(@androidx.annotation.n0 PointF pointF, float f10, @androidx.annotation.n0 PointF pointF2, float f11) {
        this.f20754a = (PointF) androidx.core.util.o.m(pointF, "start == null");
        this.f20755b = f10;
        this.f20756c = (PointF) androidx.core.util.o.m(pointF2, "end == null");
        this.f20757d = f11;
    }

    @androidx.annotation.n0
    public PointF a() {
        return this.f20756c;
    }

    public float b() {
        return this.f20757d;
    }

    @androidx.annotation.n0
    public PointF c() {
        return this.f20754a;
    }

    public float d() {
        return this.f20755b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Float.compare(this.f20755b, n0Var.f20755b) == 0 && Float.compare(this.f20757d, n0Var.f20757d) == 0 && this.f20754a.equals(n0Var.f20754a) && this.f20756c.equals(n0Var.f20756c);
    }

    public int hashCode() {
        int iHashCode = this.f20754a.hashCode() * 31;
        float f10 = this.f20755b;
        int iFloatToIntBits = (((iHashCode + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31) + this.f20756c.hashCode()) * 31;
        float f11 = this.f20757d;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    public String toString() {
        return "PathSegment{start=" + this.f20754a + ", startFraction=" + this.f20755b + ", end=" + this.f20756c + ", endFraction=" + this.f20757d + '}';
    }
}
