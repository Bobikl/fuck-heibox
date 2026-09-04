package androidx.collection;

import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: compiled from: IntList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13600#3,2:972\n1663#3,6:983\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
public final class k1 extends c0 {
    public k1() {
        this(0, 1, null);
    }

    public k1(int i10) {
        super(i10, null);
    }

    public /* synthetic */ k1(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public static /* synthetic */ void w0(k1 k1Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = k1Var.f3569b;
        }
        k1Var.v0(i10);
    }

    public final void W(@androidx.annotation.f0(from = 0) int i10, int i11) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.f3569b) {
            z10 = true;
        }
        if (!z10) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f3569b);
        }
        d0(this.f3569b + 1);
        int[] iArr = this.f3568a;
        int i12 = this.f3569b;
        if (i10 != i12) {
            kotlin.collections.m.a1(iArr, iArr, i10 + 1, i10, i12);
        }
        iArr[i10] = i11;
        this.f3569b++;
    }

    public final boolean X(int i10) {
        d0(this.f3569b + 1);
        int[] iArr = this.f3568a;
        int i11 = this.f3569b;
        iArr[i11] = i10;
        this.f3569b = i11 + 1;
        return true;
    }

    public final boolean Y(@androidx.annotation.f0(from = 0) int i10, @dl.d c0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (!(i10 >= 0 && i10 <= this.f3569b)) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f3569b);
        }
        if (elements.B()) {
            return false;
        }
        d0(this.f3569b + elements.f3569b);
        int[] iArr = this.f3568a;
        int i11 = this.f3569b;
        if (i10 != i11) {
            kotlin.collections.m.a1(iArr, iArr, elements.f3569b + i10, i10, i11);
        }
        kotlin.collections.m.a1(elements.f3568a, iArr, i10, 0, elements.f3569b);
        this.f3569b += elements.f3569b;
        return true;
    }

    public final boolean Z(@androidx.annotation.f0(from = 0) int i10, @dl.d int[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (!(i10 >= 0 && i10 <= this.f3569b)) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f3569b);
        }
        if (elements.length == 0) {
            return false;
        }
        d0(this.f3569b + elements.length);
        int[] iArr = this.f3568a;
        int i11 = this.f3569b;
        if (i10 != i11) {
            kotlin.collections.m.a1(iArr, iArr, elements.length + i10, i10, i11);
        }
        kotlin.collections.m.j1(elements, iArr, i10, 0, 0, 12, null);
        this.f3569b += elements.length;
        return true;
    }

    public final boolean a0(@dl.d c0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return Y(this.f3569b, elements);
    }

    public final boolean b0(@dl.d int[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return Z(this.f3569b, elements);
    }

    public final void c0() {
        this.f3569b = 0;
    }

    public final void d0(int i10) {
        int[] iArr = this.f3568a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f3568a = iArrCopyOf;
        }
    }

    public final int e0() {
        return this.f3568a.length;
    }

    public final void f0(int i10) {
        l0(i10);
    }

    public final void g0(@dl.d c0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int[] iArr = elements.f3568a;
        int i10 = elements.f3569b;
        for (int i11 = 0; i11 < i10; i11++) {
            l0(iArr[i11]);
        }
    }

    public final void h0(@dl.d int[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        for (int i10 : elements) {
            l0(i10);
        }
    }

    public final void i0(int i10) {
        X(i10);
    }

    public final void j0(@dl.d c0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Y(this.f3569b, elements);
    }

    public final void k0(@dl.d int[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Z(this.f3569b, elements);
    }

    public final boolean l0(int i10) {
        int iY = y(i10);
        if (iY < 0) {
            return false;
        }
        o0(iY);
        return true;
    }

    public final boolean m0(@dl.d c0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3569b;
        int i11 = elements.f3569b - 1;
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
        return i10 != this.f3569b;
    }

    public final boolean n0(@dl.d int[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3569b;
        for (int i11 : elements) {
            l0(i11);
        }
        return i10 != this.f3569b;
    }

    public final int o0(@androidx.annotation.f0(from = 0) int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f3569b) {
            z10 = true;
        }
        if (!z10) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + (this.f3569b - 1));
        }
        int[] iArr = this.f3568a;
        int i11 = iArr[i10];
        int i12 = this.f3569b;
        if (i10 != i12 - 1) {
            kotlin.collections.m.a1(iArr, iArr, i10, i10 + 1, i12);
        }
        this.f3569b--;
        return i11;
    }

    public final void p0(@androidx.annotation.f0(from = 0) int i10, @androidx.annotation.f0(from = 0) int i11) {
        if (i10 >= 0 && i10 <= this.f3569b) {
            if (i11 >= 0 && i11 <= this.f3569b) {
                if (i11 < i10) {
                    throw new IllegalArgumentException("Start (" + i10 + ") is more than end (" + i11 + ')');
                }
                if (i11 != i10) {
                    int i12 = this.f3569b;
                    if (i11 < i12) {
                        int[] iArr = this.f3568a;
                        kotlin.collections.m.a1(iArr, iArr, i10, i11, i12);
                    }
                    this.f3569b -= i11 - i10;
                    return;
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException("Start (" + i10 + ") and end (" + i11 + ") must be in 0.." + this.f3569b);
    }

    public final boolean q0(@dl.d c0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3569b;
        int[] iArr = this.f3568a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.c(iArr[i11])) {
                o0(i11);
            }
        }
        return i10 != this.f3569b;
    }

    public final boolean r0(@dl.d int[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3569b;
        int[] iArr = this.f3568a;
        int i11 = i10 - 1;
        while (true) {
            int i12 = -1;
            if (-1 >= i11) {
                break;
            }
            int i13 = iArr[i11];
            int length = elements.length;
            for (int i14 = 0; i14 < length; i14++) {
                if (elements[i14] == i13) {
                    i12 = i14;
                    break;
                }
            }
            if (i12 < 0) {
                o0(i11);
            }
            i11--;
        }
        return i10 != this.f3569b;
    }

    public final int s0(@androidx.annotation.f0(from = 0) int i10, int i11) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f3569b) {
            z10 = true;
        }
        if (z10) {
            int[] iArr = this.f3568a;
            int i12 = iArr[i10];
            iArr[i10] = i11;
            return i12;
        }
        throw new IndexOutOfBoundsException("set index " + i10 + " must be between 0 .. " + (this.f3569b - 1));
    }

    public final void t0() {
        kotlin.collections.m.q4(this.f3568a, 0, this.f3569b);
    }

    public final void u0() {
        ArraysKt___ArraysKt.av(this.f3568a, 0, this.f3569b);
    }

    public final void v0(int i10) {
        int iMax = Math.max(i10, this.f3569b);
        int[] iArr = this.f3568a;
        if (iArr.length > iMax) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f3568a = iArrCopyOf;
        }
    }
}
