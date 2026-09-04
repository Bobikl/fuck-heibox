package s1;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: s1.f, reason: from toString */
/* JADX INFO: compiled from: Density.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Ls1/f;", "Ls1/e;", "", "b", "g", "density", "fontScale", RXScreenCaptureService.KEY_HEIGHT, "", "toString", "", "hashCode", "", "other", "", "equals", "F", "getDensity", "()F", "C1", "<init>", "(FF)V", "ui-unit_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class DensityImpl implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f139217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f139218c;

    public DensityImpl(float f10, float f11) {
        this.f139217b = f10;
        this.f139218c = f11;
    }

    public static /* synthetic */ DensityImpl i(DensityImpl densityImpl, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = densityImpl.getF139217b();
        }
        if ((i10 & 2) != 0) {
            f11 = densityImpl.getF139218c();
        }
        return densityImpl.h(f10, f11);
    }

    @Override // s1.e
    /* JADX INFO: renamed from: C1, reason: from getter */
    public float getF139218c() {
        return this.f139218c;
    }

    @Override // s1.e
    public /* synthetic */ float E(int i10) {
        return d.e(this, i10);
    }

    @Override // s1.e
    public /* synthetic */ float E1(float f10) {
        return d.h(this, f10);
    }

    @Override // s1.e
    public /* synthetic */ float F(float f10) {
        return d.d(this, f10);
    }

    @Override // s1.e
    public /* synthetic */ long J(long j10) {
        return d.j(this, j10);
    }

    @Override // s1.e
    public /* synthetic */ int J1(long j10) {
        return d.a(this, j10);
    }

    @Override // s1.e
    public /* synthetic */ long M(float f10) {
        return d.k(this, f10);
    }

    public final float b() {
        return getF139217b();
    }

    @Override // s1.e
    public /* synthetic */ int e1(float f10) {
        return d.b(this, f10);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DensityImpl)) {
            return false;
        }
        DensityImpl densityImpl = (DensityImpl) other;
        return f0.g(Float.valueOf(getF139217b()), Float.valueOf(densityImpl.getF139217b())) && f0.g(Float.valueOf(getF139218c()), Float.valueOf(densityImpl.getF139218c()));
    }

    public final float g() {
        return getF139218c();
    }

    @Override // s1.e
    /* JADX INFO: renamed from: getDensity, reason: from getter */
    public float getF139217b() {
        return this.f139217b;
    }

    @dl.d
    public final DensityImpl h(float density, float fontScale) {
        return new DensityImpl(density, fontScale);
    }

    @Override // s1.e
    public /* synthetic */ b1.i h0(DpRect dpRect) {
        return d.i(this, dpRect);
    }

    public int hashCode() {
        return (Float.floatToIntBits(getF139217b()) * 31) + Float.floatToIntBits(getF139218c());
    }

    @Override // s1.e
    public /* synthetic */ float k1(long j10) {
        return d.g(this, j10);
    }

    @Override // s1.e
    public /* synthetic */ long n(long j10) {
        return d.f(this, j10);
    }

    @Override // s1.e
    public /* synthetic */ float q(long j10) {
        return d.c(this, j10);
    }

    @Override // s1.e
    public /* synthetic */ long r(int i10) {
        return d.m(this, i10);
    }

    @Override // s1.e
    public /* synthetic */ long s(float f10) {
        return d.l(this, f10);
    }

    @dl.d
    public String toString() {
        return "DensityImpl(density=" + getF139217b() + ", fontScale=" + getF139218c() + ')';
    }
}
