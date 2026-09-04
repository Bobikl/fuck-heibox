package kotlinx.serialization.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
@kotlin.s
@kotlinx.serialization.d
public final class p2 extends u1<kotlin.o1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private int[] f130742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f130743b;

    private p2(int[] bufferWithData) {
        kotlin.jvm.internal.f0.p(bufferWithData, "bufferWithData");
        this.f130742a = bufferWithData;
        this.f130743b = kotlin.o1.v(bufferWithData);
        b(10);
    }

    public /* synthetic */ p2(int[] iArr, kotlin.jvm.internal.u uVar) {
        this(iArr);
    }

    @Override // kotlinx.serialization.internal.u1
    public /* bridge */ /* synthetic */ kotlin.o1 a() {
        return kotlin.o1.b(f());
    }

    @Override // kotlinx.serialization.internal.u1
    public void b(int i10) {
        if (kotlin.o1.v(this.f130742a) < i10) {
            int[] iArr = this.f130742a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, fi.u.u(i10, kotlin.o1.v(iArr) * 2));
            kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(...)");
            this.f130742a = kotlin.o1.g(iArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.u1
    public int d() {
        return this.f130743b;
    }

    public final void e(int i10) {
        u1.c(this, 0, 1, null);
        int[] iArr = this.f130742a;
        int iD = d();
        this.f130743b = iD + 1;
        kotlin.o1.B(iArr, iD, i10);
    }

    @dl.d
    public int[] f() {
        int[] iArrCopyOf = Arrays.copyOf(this.f130742a, d());
        kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(...)");
        return kotlin.o1.g(iArrCopyOf);
    }
}
