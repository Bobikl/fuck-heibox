package kotlinx.serialization.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class y extends u1<double[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private double[] f130784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f130785b;

    public y(@dl.d double[] bufferWithData) {
        kotlin.jvm.internal.f0.p(bufferWithData, "bufferWithData");
        this.f130784a = bufferWithData;
        this.f130785b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.u1
    public void b(int i10) {
        double[] dArr = this.f130784a;
        if (dArr.length < i10) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, fi.u.u(i10, dArr.length * 2));
            kotlin.jvm.internal.f0.o(dArrCopyOf, "copyOf(...)");
            this.f130784a = dArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.u1
    public int d() {
        return this.f130785b;
    }

    public final void e(double d10) {
        u1.c(this, 0, 1, null);
        double[] dArr = this.f130784a;
        int iD = d();
        this.f130785b = iD + 1;
        dArr[iD] = d10;
    }

    @Override // kotlinx.serialization.internal.u1
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f130784a, d());
        kotlin.jvm.internal.f0.o(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }
}
