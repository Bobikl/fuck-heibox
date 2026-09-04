package kotlinx.serialization.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class f2 extends u1<short[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private short[] f130694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f130695b;

    public f2(@dl.d short[] bufferWithData) {
        kotlin.jvm.internal.f0.p(bufferWithData, "bufferWithData");
        this.f130694a = bufferWithData;
        this.f130695b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.u1
    public void b(int i10) {
        short[] sArr = this.f130694a;
        if (sArr.length < i10) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, fi.u.u(i10, sArr.length * 2));
            kotlin.jvm.internal.f0.o(sArrCopyOf, "copyOf(...)");
            this.f130694a = sArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.u1
    public int d() {
        return this.f130695b;
    }

    public final void e(short s10) {
        u1.c(this, 0, 1, null);
        short[] sArr = this.f130694a;
        int iD = d();
        this.f130695b = iD + 1;
        sArr[iD] = s10;
    }

    @Override // kotlinx.serialization.internal.u1
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f130694a, d());
        kotlin.jvm.internal.f0.o(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }
}
