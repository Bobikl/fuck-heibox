package kotlinx.serialization.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class g extends u1<boolean[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private boolean[] f130696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f130697b;

    public g(@dl.d boolean[] bufferWithData) {
        kotlin.jvm.internal.f0.p(bufferWithData, "bufferWithData");
        this.f130696a = bufferWithData;
        this.f130697b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.u1
    public void b(int i10) {
        boolean[] zArr = this.f130696a;
        if (zArr.length < i10) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, fi.u.u(i10, zArr.length * 2));
            kotlin.jvm.internal.f0.o(zArrCopyOf, "copyOf(...)");
            this.f130696a = zArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.u1
    public int d() {
        return this.f130697b;
    }

    public final void e(boolean z10) {
        u1.c(this, 0, 1, null);
        boolean[] zArr = this.f130696a;
        int iD = d();
        this.f130697b = iD + 1;
        zArr[iD] = z10;
    }

    @Override // kotlinx.serialization.internal.u1
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f130696a, d());
        kotlin.jvm.internal.f0.o(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }
}
