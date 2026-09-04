package kotlinx.serialization.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
@kotlin.s
@kotlinx.serialization.d
public final class s2 extends u1<kotlin.s1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private long[] f130761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f130762b;

    private s2(long[] bufferWithData) {
        kotlin.jvm.internal.f0.p(bufferWithData, "bufferWithData");
        this.f130761a = bufferWithData;
        this.f130762b = kotlin.s1.v(bufferWithData);
        b(10);
    }

    public /* synthetic */ s2(long[] jArr, kotlin.jvm.internal.u uVar) {
        this(jArr);
    }

    @Override // kotlinx.serialization.internal.u1
    public /* bridge */ /* synthetic */ kotlin.s1 a() {
        return kotlin.s1.b(f());
    }

    @Override // kotlinx.serialization.internal.u1
    public void b(int i10) {
        if (kotlin.s1.v(this.f130761a) < i10) {
            long[] jArr = this.f130761a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, fi.u.u(i10, kotlin.s1.v(jArr) * 2));
            kotlin.jvm.internal.f0.o(jArrCopyOf, "copyOf(...)");
            this.f130761a = kotlin.s1.g(jArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.u1
    public int d() {
        return this.f130762b;
    }

    public final void e(long j10) {
        u1.c(this, 0, 1, null);
        long[] jArr = this.f130761a;
        int iD = d();
        this.f130762b = iD + 1;
        kotlin.s1.B(jArr, iD, j10);
    }

    @dl.d
    public long[] f() {
        long[] jArrCopyOf = Arrays.copyOf(this.f130761a, d());
        kotlin.jvm.internal.f0.o(jArrCopyOf, "copyOf(...)");
        return kotlin.s1.g(jArrCopyOf);
    }
}
