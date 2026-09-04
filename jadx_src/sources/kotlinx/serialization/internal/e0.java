package kotlinx.serialization.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class e0 extends u1<float[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private float[] f130687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f130688b;

    public e0(@dl.d float[] bufferWithData) {
        kotlin.jvm.internal.f0.p(bufferWithData, "bufferWithData");
        this.f130687a = bufferWithData;
        this.f130688b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.u1
    public void b(int i10) {
        float[] fArr = this.f130687a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, fi.u.u(i10, fArr.length * 2));
            kotlin.jvm.internal.f0.o(fArrCopyOf, "copyOf(...)");
            this.f130687a = fArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.u1
    public int d() {
        return this.f130688b;
    }

    public final void e(float f10) {
        u1.c(this, 0, 1, null);
        float[] fArr = this.f130687a;
        int iD = d();
        this.f130688b = iD + 1;
        fArr[iD] = f10;
    }

    @Override // kotlinx.serialization.internal.u1
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f130687a, d());
        kotlin.jvm.internal.f0.o(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }
}
