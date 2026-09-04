package kotlinx.serialization.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class a1 extends u1<long[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private long[] f130665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f130666b;

    public a1(@dl.d long[] bufferWithData) {
        kotlin.jvm.internal.f0.p(bufferWithData, "bufferWithData");
        this.f130665a = bufferWithData;
        this.f130666b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.u1
    public void b(int i10) {
        long[] jArr = this.f130665a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, fi.u.u(i10, jArr.length * 2));
            kotlin.jvm.internal.f0.o(jArrCopyOf, "copyOf(...)");
            this.f130665a = jArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.u1
    public int d() {
        return this.f130666b;
    }

    public final void e(long j10) {
        u1.c(this, 0, 1, null);
        long[] jArr = this.f130665a;
        int iD = d();
        this.f130666b = iD + 1;
        jArr[iD] = j10;
    }

    @Override // kotlinx.serialization.internal.u1
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f130665a, d());
        kotlin.jvm.internal.f0.o(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }
}
