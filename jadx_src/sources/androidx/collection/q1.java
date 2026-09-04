package androidx.collection;

import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: compiled from: LongList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n+ 2 LongList.kt\nandroidx/collection/LongList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13607#3,2:972\n1675#3,6:983\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
public final class q1 extends o0 {
    public q1() {
        this(0, 1, null);
    }

    public q1(int i10) {
        super(i10, null);
    }

    public /* synthetic */ q1(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public static /* synthetic */ void w0(q1 q1Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = q1Var.f3675b;
        }
        q1Var.v0(i10);
    }

    public final void W(@androidx.annotation.f0(from = 0) int i10, long j10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.f3675b) {
            z10 = true;
        }
        if (!z10) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f3675b);
        }
        d0(this.f3675b + 1);
        long[] jArr = this.f3674a;
        int i11 = this.f3675b;
        if (i10 != i11) {
            kotlin.collections.m.b1(jArr, jArr, i10 + 1, i10, i11);
        }
        jArr[i10] = j10;
        this.f3675b++;
    }

    public final boolean X(long j10) {
        d0(this.f3675b + 1);
        long[] jArr = this.f3674a;
        int i10 = this.f3675b;
        jArr[i10] = j10;
        this.f3675b = i10 + 1;
        return true;
    }

    public final boolean Y(@androidx.annotation.f0(from = 0) int i10, @dl.d o0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (!(i10 >= 0 && i10 <= this.f3675b)) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f3675b);
        }
        if (elements.B()) {
            return false;
        }
        d0(this.f3675b + elements.f3675b);
        long[] jArr = this.f3674a;
        int i11 = this.f3675b;
        if (i10 != i11) {
            kotlin.collections.m.b1(jArr, jArr, elements.f3675b + i10, i10, i11);
        }
        kotlin.collections.m.b1(elements.f3674a, jArr, i10, 0, elements.f3675b);
        this.f3675b += elements.f3675b;
        return true;
    }

    public final boolean Z(@androidx.annotation.f0(from = 0) int i10, @dl.d long[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (!(i10 >= 0 && i10 <= this.f3675b)) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f3675b);
        }
        if (elements.length == 0) {
            return false;
        }
        d0(this.f3675b + elements.length);
        long[] jArr = this.f3674a;
        int i11 = this.f3675b;
        if (i10 != i11) {
            kotlin.collections.m.b1(jArr, jArr, elements.length + i10, i10, i11);
        }
        kotlin.collections.m.k1(elements, jArr, i10, 0, 0, 12, null);
        this.f3675b += elements.length;
        return true;
    }

    public final boolean a0(@dl.d o0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return Y(this.f3675b, elements);
    }

    public final boolean b0(@dl.d long[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return Z(this.f3675b, elements);
    }

    public final void c0() {
        this.f3675b = 0;
    }

    public final void d0(int i10) {
        long[] jArr = this.f3674a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
            kotlin.jvm.internal.f0.o(jArrCopyOf, "copyOf(this, newSize)");
            this.f3674a = jArrCopyOf;
        }
    }

    public final int e0() {
        return this.f3674a.length;
    }

    public final void f0(long j10) {
        l0(j10);
    }

    public final void g0(@dl.d o0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        long[] jArr = elements.f3674a;
        int i10 = elements.f3675b;
        for (int i11 = 0; i11 < i10; i11++) {
            l0(jArr[i11]);
        }
    }

    public final void h0(@dl.d long[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        for (long j10 : elements) {
            l0(j10);
        }
    }

    public final void i0(long j10) {
        X(j10);
    }

    public final void j0(@dl.d o0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Y(this.f3675b, elements);
    }

    public final void k0(@dl.d long[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Z(this.f3675b, elements);
    }

    public final boolean l0(long j10) {
        int iY = y(j10);
        if (iY < 0) {
            return false;
        }
        o0(iY);
        return true;
    }

    public final boolean m0(@dl.d o0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3675b;
        int i11 = elements.f3675b - 1;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                l0(elements.s(i12));
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        return i10 != this.f3675b;
    }

    public final boolean n0(@dl.d long[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3675b;
        for (long j10 : elements) {
            l0(j10);
        }
        return i10 != this.f3675b;
    }

    public final long o0(@androidx.annotation.f0(from = 0) int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f3675b) {
            z10 = true;
        }
        if (!z10) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + (this.f3675b - 1));
        }
        long[] jArr = this.f3674a;
        long j10 = jArr[i10];
        int i11 = this.f3675b;
        if (i10 != i11 - 1) {
            kotlin.collections.m.b1(jArr, jArr, i10, i10 + 1, i11);
        }
        this.f3675b--;
        return j10;
    }

    public final void p0(@androidx.annotation.f0(from = 0) int i10, @androidx.annotation.f0(from = 0) int i11) {
        if (i10 >= 0 && i10 <= this.f3675b) {
            if (i11 >= 0 && i11 <= this.f3675b) {
                if (i11 < i10) {
                    throw new IllegalArgumentException("Start (" + i10 + ") is more than end (" + i11 + ')');
                }
                if (i11 != i10) {
                    int i12 = this.f3675b;
                    if (i11 < i12) {
                        long[] jArr = this.f3674a;
                        kotlin.collections.m.b1(jArr, jArr, i10, i11, i12);
                    }
                    this.f3675b -= i11 - i10;
                    return;
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException("Start (" + i10 + ") and end (" + i11 + ") must be in 0.." + this.f3675b);
    }

    public final boolean q0(@dl.d o0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3675b;
        long[] jArr = this.f3674a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.c(jArr[i11])) {
                o0(i11);
            }
        }
        return i10 != this.f3675b;
    }

    public final boolean r0(@dl.d long[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3675b;
        long[] jArr = this.f3674a;
        int i11 = i10 - 1;
        while (true) {
            int i12 = -1;
            if (-1 >= i11) {
                break;
            }
            long j10 = jArr[i11];
            int length = elements.length;
            for (int i13 = 0; i13 < length; i13++) {
                if (elements[i13] == j10) {
                    i12 = i13;
                    break;
                }
            }
            if (i12 < 0) {
                o0(i11);
            }
            i11--;
        }
        return i10 != this.f3675b;
    }

    public final long s0(@androidx.annotation.f0(from = 0) int i10, long j10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f3675b) {
            z10 = true;
        }
        if (z10) {
            long[] jArr = this.f3674a;
            long j11 = jArr[i10];
            jArr[i10] = j10;
            return j11;
        }
        throw new IndexOutOfBoundsException("set index " + i10 + " must be between 0 .. " + (this.f3675b - 1));
    }

    public final void t0() {
        kotlin.collections.m.s4(this.f3674a, 0, this.f3675b);
    }

    public final void u0() {
        ArraysKt___ArraysKt.cv(this.f3674a, 0, this.f3675b);
    }

    public final void v0(int i10) {
        int iMax = Math.max(i10, this.f3675b);
        long[] jArr = this.f3674a;
        if (jArr.length > iMax) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            kotlin.jvm.internal.f0.o(jArrCopyOf, "copyOf(this, newSize)");
            this.f3674a = jArrCopyOf;
        }
    }
}
