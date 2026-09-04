package kotlinx.serialization.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
@kotlin.s
@kotlinx.serialization.d
public final class m2 extends u1<kotlin.k1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private byte[] f130729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f130730b;

    private m2(byte[] bufferWithData) {
        kotlin.jvm.internal.f0.p(bufferWithData, "bufferWithData");
        this.f130729a = bufferWithData;
        this.f130730b = kotlin.k1.v(bufferWithData);
        b(10);
    }

    public /* synthetic */ m2(byte[] bArr, kotlin.jvm.internal.u uVar) {
        this(bArr);
    }

    @Override // kotlinx.serialization.internal.u1
    public /* bridge */ /* synthetic */ kotlin.k1 a() {
        return kotlin.k1.b(f());
    }

    @Override // kotlinx.serialization.internal.u1
    public void b(int i10) {
        if (kotlin.k1.v(this.f130729a) < i10) {
            byte[] bArr = this.f130729a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, fi.u.u(i10, kotlin.k1.v(bArr) * 2));
            kotlin.jvm.internal.f0.o(bArrCopyOf, "copyOf(...)");
            this.f130729a = kotlin.k1.g(bArrCopyOf);
        }
    }

    @Override // kotlinx.serialization.internal.u1
    public int d() {
        return this.f130730b;
    }

    public final void e(byte b10) {
        u1.c(this, 0, 1, null);
        byte[] bArr = this.f130729a;
        int iD = d();
        this.f130730b = iD + 1;
        kotlin.k1.B(bArr, iD, b10);
    }

    @dl.d
    public byte[] f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f130729a, d());
        kotlin.jvm.internal.f0.o(bArrCopyOf, "copyOf(...)");
        return kotlin.k1.g(bArrCopyOf);
    }
}
