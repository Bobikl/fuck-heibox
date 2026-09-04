package com.google.common.collect;

import io.flutter.embedding.android.KeyboardMap;
import java.util.Arrays;

/* JADX INFO: compiled from: ObjectCountLinkedHashMap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public class w1<K> extends v1<K> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f58216r = -2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @o9.d
    transient long[] f58217o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private transient int f58218p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private transient int f58219q;

    w1() {
        this(3);
    }

    w1(int i10) {
        this(i10, 1.0f);
    }

    w1(int i10, float f10) {
        super(i10, f10);
    }

    w1(v1<K> v1Var) {
        o(v1Var.D(), 1.0f);
        int iF = v1Var.f();
        while (iF != -1) {
            v(v1Var.j(iF), v1Var.l(iF));
            iF = v1Var.t(iF);
        }
    }

    static <K> w1<K> F() {
        return new w1<>();
    }

    static <K> w1<K> G(int i10) {
        return new w1<>(i10);
    }

    private int H(int i10) {
        return (int) (this.f58217o[i10] >>> 32);
    }

    private int I(int i10) {
        return (int) this.f58217o[i10];
    }

    private void J(int i10, int i11) {
        long[] jArr = this.f58217o;
        jArr[i10] = (jArr[i10] & KeyboardMap.kValueMask) | (((long) i11) << 32);
    }

    private void K(int i10, int i11) {
        if (i10 == -2) {
            this.f58218p = i11;
        } else {
            L(i10, i11);
        }
        if (i11 == -2) {
            this.f58219q = i10;
        } else {
            J(i11, i10);
        }
    }

    private void L(int i10, int i11) {
        long[] jArr = this.f58217o;
        jArr[i10] = (jArr[i10] & (-4294967296L)) | (((long) i11) & KeyboardMap.kValueMask);
    }

    @Override // com.google.common.collect.v1
    public void a() {
        super.a();
        this.f58218p = -2;
        this.f58219q = -2;
    }

    @Override // com.google.common.collect.v1
    int f() {
        int i10 = this.f58218p;
        if (i10 == -2) {
            return -1;
        }
        return i10;
    }

    @Override // com.google.common.collect.v1
    void o(int i10, float f10) {
        super.o(i10, f10);
        this.f58218p = -2;
        this.f58219q = -2;
        long[] jArr = new long[i10];
        this.f58217o = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.v1
    void p(int i10, @x1 K k10, int i11, int i12) {
        super.p(i10, k10, i11, i12);
        K(this.f58219q, i10);
        K(i10, -2);
    }

    @Override // com.google.common.collect.v1
    void q(int i10) {
        int iD = D() - 1;
        K(H(i10), I(i10));
        if (i10 < iD) {
            K(H(iD), i10);
            K(i10, I(iD));
        }
        super.q(i10);
    }

    @Override // com.google.common.collect.v1
    int t(int i10) {
        int I = I(i10);
        if (I == -2) {
            return -1;
        }
        return I;
    }

    @Override // com.google.common.collect.v1
    int u(int i10, int i11) {
        return i10 == D() ? i11 : i10;
    }

    @Override // com.google.common.collect.v1
    void z(int i10) {
        super.z(i10);
        long[] jArr = this.f58217o;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        this.f58217o = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i10, -1L);
    }
}
