package kotlinx.serialization.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class j extends u1<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private byte[] f130708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f130709b;

    public j(@dl.d byte[] bufferWithData) {
        kotlin.jvm.internal.f0.p(bufferWithData, "bufferWithData");
        this.f130708a = bufferWithData;
        this.f130709b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.u1
    public void b(int i10) {
        byte[] bArr = this.f130708a;
        if (bArr.length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, fi.u.u(i10, bArr.length * 2));
            kotlin.jvm.internal.f0.o(bArrCopyOf, "copyOf(...)");
            this.f130708a = bArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.u1
    public int d() {
        return this.f130709b;
    }

    public final void e(byte b10) {
        u1.c(this, 0, 1, null);
        byte[] bArr = this.f130708a;
        int iD = d();
        this.f130709b = iD + 1;
        bArr[iD] = b10;
    }

    @Override // kotlinx.serialization.internal.u1
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f130708a, d());
        kotlin.jvm.internal.f0.o(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}
