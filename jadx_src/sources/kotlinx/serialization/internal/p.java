package kotlinx.serialization.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class p extends u1<char[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private char[] f130739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f130740b;

    public p(@dl.d char[] bufferWithData) {
        kotlin.jvm.internal.f0.p(bufferWithData, "bufferWithData");
        this.f130739a = bufferWithData;
        this.f130740b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.u1
    public void b(int i10) {
        char[] cArr = this.f130739a;
        if (cArr.length < i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, fi.u.u(i10, cArr.length * 2));
            kotlin.jvm.internal.f0.o(cArrCopyOf, "copyOf(...)");
            this.f130739a = cArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.u1
    public int d() {
        return this.f130740b;
    }

    public final void e(char c10) {
        u1.c(this, 0, 1, null);
        char[] cArr = this.f130739a;
        int iD = d();
        this.f130740b = iD + 1;
        cArr[iD] = c10;
    }

    @Override // kotlinx.serialization.internal.u1
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f130739a, d());
        kotlin.jvm.internal.f0.o(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }
}
