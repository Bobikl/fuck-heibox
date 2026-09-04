package androidx.collection;

import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: compiled from: FloatList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n+ 2 FloatList.kt\nandroidx/collection/FloatList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13614#3,2:972\n1687#3,6:983\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
public final class e1 extends o {
    public e1() {
        this(0, 1, null);
    }

    public e1(int i10) {
        super(i10, null);
    }

    public /* synthetic */ e1(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public static /* synthetic */ void w0(e1 e1Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = e1Var.f3673b;
        }
        e1Var.v0(i10);
    }

    public final void W(@androidx.annotation.f0(from = 0) int i10, float f10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.f3673b) {
            z10 = true;
        }
        if (!z10) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f3673b);
        }
        d0(this.f3673b + 1);
        float[] fArr = this.f3672a;
        int i11 = this.f3673b;
        if (i10 != i11) {
            kotlin.collections.m.Z0(fArr, fArr, i10 + 1, i10, i11);
        }
        fArr[i10] = f10;
        this.f3673b++;
    }

    public final boolean X(float f10) {
        d0(this.f3673b + 1);
        float[] fArr = this.f3672a;
        int i10 = this.f3673b;
        fArr[i10] = f10;
        this.f3673b = i10 + 1;
        return true;
    }

    public final boolean Y(@androidx.annotation.f0(from = 0) int i10, @dl.d o elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (!(i10 >= 0 && i10 <= this.f3673b)) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f3673b);
        }
        if (elements.B()) {
            return false;
        }
        d0(this.f3673b + elements.f3673b);
        float[] fArr = this.f3672a;
        int i11 = this.f3673b;
        if (i10 != i11) {
            kotlin.collections.m.Z0(fArr, fArr, elements.f3673b + i10, i10, i11);
        }
        kotlin.collections.m.Z0(elements.f3672a, fArr, i10, 0, elements.f3673b);
        this.f3673b += elements.f3673b;
        return true;
    }

    public final boolean Z(@androidx.annotation.f0(from = 0) int i10, @dl.d float[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (!(i10 >= 0 && i10 <= this.f3673b)) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f3673b);
        }
        if (elements.length == 0) {
            return false;
        }
        d0(this.f3673b + elements.length);
        float[] fArr = this.f3672a;
        int i11 = this.f3673b;
        if (i10 != i11) {
            kotlin.collections.m.Z0(fArr, fArr, elements.length + i10, i10, i11);
        }
        kotlin.collections.m.i1(elements, fArr, i10, 0, 0, 12, null);
        this.f3673b += elements.length;
        return true;
    }

    public final boolean a0(@dl.d o elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return Y(this.f3673b, elements);
    }

    public final boolean b0(@dl.d float[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return Z(this.f3673b, elements);
    }

    public final void c0() {
        this.f3673b = 0;
    }

    public final void d0(int i10) {
        float[] fArr = this.f3672a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i10, (fArr.length * 3) / 2));
            kotlin.jvm.internal.f0.o(fArrCopyOf, "copyOf(this, newSize)");
            this.f3672a = fArrCopyOf;
        }
    }

    public final int e0() {
        return this.f3672a.length;
    }

    public final void f0(float f10) {
        l0(f10);
    }

    public final void g0(@dl.d o elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        float[] fArr = elements.f3672a;
        int i10 = elements.f3673b;
        for (int i11 = 0; i11 < i10; i11++) {
            l0(fArr[i11]);
        }
    }

    public final void h0(@dl.d float[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        for (float f10 : elements) {
            l0(f10);
        }
    }

    public final void i0(float f10) {
        X(f10);
    }

    public final void j0(@dl.d o elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Y(this.f3673b, elements);
    }

    public final void k0(@dl.d float[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Z(this.f3673b, elements);
    }

    public final boolean l0(float f10) {
        int iY = y(f10);
        if (iY < 0) {
            return false;
        }
        o0(iY);
        return true;
    }

    public final boolean m0(@dl.d o elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3673b;
        int i11 = elements.f3673b - 1;
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
        return i10 != this.f3673b;
    }

    public final boolean n0(@dl.d float[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3673b;
        for (float f10 : elements) {
            l0(f10);
        }
        return i10 != this.f3673b;
    }

    public final float o0(@androidx.annotation.f0(from = 0) int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f3673b) {
            z10 = true;
        }
        if (!z10) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + (this.f3673b - 1));
        }
        float[] fArr = this.f3672a;
        float f10 = fArr[i10];
        int i11 = this.f3673b;
        if (i10 != i11 - 1) {
            kotlin.collections.m.Z0(fArr, fArr, i10, i10 + 1, i11);
        }
        this.f3673b--;
        return f10;
    }

    public final void p0(@androidx.annotation.f0(from = 0) int i10, @androidx.annotation.f0(from = 0) int i11) {
        if (i10 >= 0 && i10 <= this.f3673b) {
            if (i11 >= 0 && i11 <= this.f3673b) {
                if (i11 < i10) {
                    throw new IllegalArgumentException("Start (" + i10 + ") is more than end (" + i11 + ')');
                }
                if (i11 != i10) {
                    int i12 = this.f3673b;
                    if (i11 < i12) {
                        float[] fArr = this.f3672a;
                        kotlin.collections.m.Z0(fArr, fArr, i10, i11, i12);
                    }
                    this.f3673b -= i11 - i10;
                    return;
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException("Start (" + i10 + ") and end (" + i11 + ") must be in 0.." + this.f3673b);
    }

    public final boolean q0(@dl.d o elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3673b;
        float[] fArr = this.f3672a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.c(fArr[i11])) {
                o0(i11);
            }
        }
        return i10 != this.f3673b;
    }

    public final boolean r0(@dl.d float[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3673b;
        float[] fArr = this.f3672a;
        int i11 = i10 - 1;
        while (true) {
            int i12 = -1;
            if (-1 >= i11) {
                break;
            }
            float f10 = fArr[i11];
            int length = elements.length;
            for (int i13 = 0; i13 < length; i13++) {
                if (elements[i13] == f10) {
                    i12 = i13;
                    break;
                }
            }
            if (i12 < 0) {
                o0(i11);
            }
            i11--;
        }
        return i10 != this.f3673b;
    }

    public final float s0(@androidx.annotation.f0(from = 0) int i10, float f10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f3673b) {
            z10 = true;
        }
        if (z10) {
            float[] fArr = this.f3672a;
            float f11 = fArr[i10];
            fArr[i10] = f10;
            return f11;
        }
        throw new IndexOutOfBoundsException("set index " + i10 + " must be between 0 .. " + (this.f3673b - 1));
    }

    public final void t0() {
        kotlin.collections.m.o4(this.f3672a, 0, this.f3673b);
    }

    public final void u0() {
        ArraysKt___ArraysKt.Yu(this.f3672a, 0, this.f3673b);
    }

    public final void v0(int i10) {
        int iMax = Math.max(i10, this.f3673b);
        float[] fArr = this.f3672a;
        if (fArr.length > iMax) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, iMax);
            kotlin.jvm.internal.f0.o(fArrCopyOf, "copyOf(this, newSize)");
            this.f3672a = fArrCopyOf;
        }
    }
}
