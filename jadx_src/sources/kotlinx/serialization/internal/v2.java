package kotlinx.serialization.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
@kotlin.s
@kotlinx.serialization.d
public final class v2 extends u1<kotlin.y1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private short[] f130774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f130775b;

    private v2(short[] bufferWithData) {
        kotlin.jvm.internal.f0.p(bufferWithData, "bufferWithData");
        this.f130774a = bufferWithData;
        this.f130775b = kotlin.y1.v(bufferWithData);
        b(10);
    }

    public /* synthetic */ v2(short[] sArr, kotlin.jvm.internal.u uVar) {
        this(sArr);
    }

    @Override // kotlinx.serialization.internal.u1
    public /* bridge */ /* synthetic */ kotlin.y1 a() {
        return kotlin.y1.b(f());
    }

    @Override // kotlinx.serialization.internal.u1
    public void b(int i10) {
        if (kotlin.y1.v(this.f130774a) < i10) {
            short[] sArr = this.f130774a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, fi.u.u(i10, kotlin.y1.v(sArr) * 2));
            kotlin.jvm.internal.f0.o(sArrCopyOf, "copyOf(...)");
            this.f130774a = kotlin.y1.g(sArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.u1
    public int d() {
        return this.f130775b;
    }

    public final void e(short s10) {
        u1.c(this, 0, 1, null);
        short[] sArr = this.f130774a;
        int iD = d();
        this.f130775b = iD + 1;
        kotlin.y1.B(sArr, iD, s10);
    }

    @dl.d
    public short[] f() {
        short[] sArrCopyOf = Arrays.copyOf(this.f130774a, d());
        kotlin.jvm.internal.f0.o(sArrCopyOf, "copyOf(...)");
        return kotlin.y1.g(sArrCopyOf);
    }
}
