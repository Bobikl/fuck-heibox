package com.airbnb.lottie.model.content;

/* JADX INFO: compiled from: GradientColor.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f37527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f37528b;

    public d(float[] fArr, int[] iArr) {
        this.f37527a = fArr;
        this.f37528b = iArr;
    }

    public int[] a() {
        return this.f37528b;
    }

    public float[] b() {
        return this.f37527a;
    }

    public int c() {
        return this.f37528b.length;
    }

    public void d(d dVar, d dVar2, float f10) {
        if (dVar.f37528b.length == dVar2.f37528b.length) {
            for (int i10 = 0; i10 < dVar.f37528b.length; i10++) {
                this.f37527a[i10] = com.airbnb.lottie.utils.i.k(dVar.f37527a[i10], dVar2.f37527a[i10], f10);
                this.f37528b[i10] = com.airbnb.lottie.utils.d.c(f10, dVar.f37528b[i10], dVar2.f37528b[i10]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f37528b.length + " vs " + dVar2.f37528b.length + ")");
    }
}
