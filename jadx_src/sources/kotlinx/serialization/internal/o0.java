package kotlinx.serialization.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class o0 extends u1<int[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private int[] f130735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f130736b;

    public o0(@dl.d int[] bufferWithData) {
        kotlin.jvm.internal.f0.p(bufferWithData, "bufferWithData");
        this.f130735a = bufferWithData;
        this.f130736b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.u1
    public void b(int i10) {
        int[] iArr = this.f130735a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, fi.u.u(i10, iArr.length * 2));
            kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(...)");
            this.f130735a = iArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.u1
    public int d() {
        return this.f130736b;
    }

    public final void e(int i10) {
        u1.c(this, 0, 1, null);
        int[] iArr = this.f130735a;
        int iD = d();
        this.f130736b = iD + 1;
        iArr[iD] = i10;
    }

    @Override // kotlinx.serialization.internal.u1
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f130735a, d());
        kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }
}
