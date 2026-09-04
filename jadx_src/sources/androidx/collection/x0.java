package androidx.collection;

import java.util.Arrays;

/* JADX INFO: compiled from: LongSparseArray.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nLongSparseArray.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n+ 2 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n1#1,255:1\n243#2:256\n256#2,6:257\n248#2,14:263\n267#2,8:277\n267#2,8:285\n278#2,9:293\n291#2,5:302\n299#2,8:307\n315#2,9:315\n349#2,12:324\n328#2,18:336\n363#2,26:354\n392#2,5:380\n400#2,5:385\n409#2,2:390\n328#2,18:392\n412#2:410\n416#2:411\n420#2,6:412\n328#2,18:418\n427#2:436\n432#2,6:437\n328#2,18:443\n441#2:461\n446#2,6:462\n328#2,18:468\n453#2,2:486\n458#2,2:488\n328#2,18:490\n461#2:508\n466#2,2:509\n328#2,18:511\n469#2,6:529\n479#2:535\n484#2:536\n489#2,8:537\n500#2,6:545\n328#2,18:551\n507#2,10:569\n520#2,21:579\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n*L\n93#1:256\n93#1:257,6\n100#1:263,14\n106#1:277,8\n111#1:285,8\n120#1:293,9\n125#1:302,5\n134#1:307,8\n145#1:315,9\n151#1:324,12\n151#1:336,18\n151#1:354,26\n157#1:380,5\n168#1:385,5\n173#1:390,2\n173#1:392,18\n173#1:410\n180#1:411\n192#1:412,6\n192#1:418,18\n192#1:436\n204#1:437,6\n204#1:443,18\n204#1:461\n212#1:462,6\n212#1:468,18\n212#1:486,2\n219#1:488,2\n219#1:490,18\n219#1:508\n228#1:509,2\n228#1:511,18\n228#1:529,6\n231#1:535\n234#1:536\n239#1:537,8\n245#1:545,6\n245#1:551,18\n245#1:569,10\n253#1:579,21\n*E\n"})
public class x0<E> implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @xh.e
    public /* synthetic */ boolean f3734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @xh.e
    public /* synthetic */ long[] f3735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @xh.e
    public /* synthetic */ Object[] f3736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @xh.e
    public /* synthetic */ int f3737e;

    @xh.i
    public x0() {
        this(0, 1, null);
    }

    @xh.i
    public x0(int i10) {
        if (i10 == 0) {
            this.f3735c = i0.a.f119207b;
            this.f3736d = i0.a.f119208c;
        } else {
            int iF = i0.a.f(i10);
            this.f3735c = new long[iF];
            this.f3736d = new Object[iF];
        }
    }

    public /* synthetic */ x0(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    public void a(long j10, E e10) {
        int i10 = this.f3737e;
        if (i10 != 0 && j10 <= this.f3735c[i10 - 1]) {
            m(j10, e10);
            return;
        }
        if (this.f3734b) {
            long[] jArr = this.f3735c;
            if (i10 >= jArr.length) {
                Object[] objArr = this.f3736d;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != y0.f3746a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f3734b = false;
                this.f3737e = i11;
            }
        }
        int i13 = this.f3737e;
        if (i13 >= this.f3735c.length) {
            int iF = i0.a.f(i13 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f3735c, iF);
            kotlin.jvm.internal.f0.o(jArrCopyOf, "copyOf(this, newSize)");
            this.f3735c = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3736d, iF);
            kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f3736d = objArrCopyOf;
        }
        this.f3735c[i13] = j10;
        this.f3736d[i13] = e10;
        this.f3737e = i13 + 1;
    }

    public void b() {
        int i10 = this.f3737e;
        Object[] objArr = this.f3736d;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f3737e = 0;
        this.f3734b = false;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public x0<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.f0.n(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        x0<E> x0Var = (x0) objClone;
        x0Var.f3735c = (long[]) this.f3735c.clone();
        x0Var.f3736d = (Object[]) this.f3736d.clone();
        return x0Var;
    }

    public boolean d(long j10) {
        return i(j10) >= 0;
    }

    public boolean e(E e10) {
        return j(e10) >= 0;
    }

    @kotlin.k(message = "Alias for `remove(key)`.", replaceWith = @kotlin.s0(expression = "remove(key)", imports = {}))
    public void f(long j10) {
        int iB = i0.a.b(this.f3735c, this.f3737e, j10);
        if (iB < 0 || this.f3736d[iB] == y0.f3746a) {
            return;
        }
        this.f3736d[iB] = y0.f3746a;
        this.f3734b = true;
    }

    @dl.e
    public E g(long j10) {
        int iB = i0.a.b(this.f3735c, this.f3737e, j10);
        if (iB < 0 || this.f3736d[iB] == y0.f3746a) {
            return null;
        }
        return (E) this.f3736d[iB];
    }

    public E h(long j10, E e10) {
        int iB = i0.a.b(this.f3735c, this.f3737e, j10);
        return (iB < 0 || this.f3736d[iB] == y0.f3746a) ? e10 : (E) this.f3736d[iB];
    }

    public int i(long j10) {
        if (this.f3734b) {
            int i10 = this.f3737e;
            long[] jArr = this.f3735c;
            Object[] objArr = this.f3736d;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != y0.f3746a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f3734b = false;
            this.f3737e = i11;
        }
        return i0.a.b(this.f3735c, this.f3737e, j10);
    }

    public int j(E e10) {
        if (this.f3734b) {
            int i10 = this.f3737e;
            long[] jArr = this.f3735c;
            Object[] objArr = this.f3736d;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != y0.f3746a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f3734b = false;
            this.f3737e = i11;
        }
        int i13 = this.f3737e;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f3736d[i14] == e10) {
                return i14;
            }
        }
        return -1;
    }

    public boolean k() {
        return v() == 0;
    }

    public long l(int i10) {
        if (!(i10 >= 0 && i10 < this.f3737e)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (this.f3734b) {
            int i11 = this.f3737e;
            long[] jArr = this.f3735c;
            Object[] objArr = this.f3736d;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != y0.f3746a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f3734b = false;
            this.f3737e = i12;
        }
        return this.f3735c[i10];
    }

    public void m(long j10, E e10) {
        int iB = i0.a.b(this.f3735c, this.f3737e, j10);
        if (iB >= 0) {
            this.f3736d[iB] = e10;
            return;
        }
        int i10 = ~iB;
        if (i10 < this.f3737e && this.f3736d[i10] == y0.f3746a) {
            this.f3735c[i10] = j10;
            this.f3736d[i10] = e10;
            return;
        }
        if (this.f3734b) {
            int i11 = this.f3737e;
            long[] jArr = this.f3735c;
            if (i11 >= jArr.length) {
                Object[] objArr = this.f3736d;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != y0.f3746a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f3734b = false;
                this.f3737e = i12;
                i10 = ~i0.a.b(this.f3735c, i12, j10);
            }
        }
        int i14 = this.f3737e;
        if (i14 >= this.f3735c.length) {
            int iF = i0.a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f3735c, iF);
            kotlin.jvm.internal.f0.o(jArrCopyOf, "copyOf(this, newSize)");
            this.f3735c = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3736d, iF);
            kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f3736d = objArrCopyOf;
        }
        int i15 = this.f3737e;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f3735c;
            int i16 = i10 + 1;
            kotlin.collections.m.b1(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.f3736d;
            kotlin.collections.m.c1(objArr2, objArr2, i16, i10, this.f3737e);
        }
        this.f3735c[i10] = j10;
        this.f3736d[i10] = e10;
        this.f3737e++;
    }

    public void n(@dl.d x0<? extends E> other) {
        kotlin.jvm.internal.f0.p(other, "other");
        int iV = other.v();
        for (int i10 = 0; i10 < iV; i10++) {
            m(other.l(i10), other.w(i10));
        }
    }

    @dl.e
    public E o(long j10, E e10) {
        E eG = g(j10);
        if (eG == null) {
            m(j10, e10);
        }
        return eG;
    }

    public void p(long j10) {
        int iB = i0.a.b(this.f3735c, this.f3737e, j10);
        if (iB < 0 || this.f3736d[iB] == y0.f3746a) {
            return;
        }
        this.f3736d[iB] = y0.f3746a;
        this.f3734b = true;
    }

    public boolean q(long j10, E e10) {
        int i10 = i(j10);
        if (i10 < 0 || !kotlin.jvm.internal.f0.g(e10, w(i10))) {
            return false;
        }
        r(i10);
        return true;
    }

    public void r(int i10) {
        if (this.f3736d[i10] != y0.f3746a) {
            this.f3736d[i10] = y0.f3746a;
            this.f3734b = true;
        }
    }

    @dl.e
    public E s(long j10, E e10) {
        int i10 = i(j10);
        if (i10 < 0) {
            return null;
        }
        Object[] objArr = this.f3736d;
        E e11 = (E) objArr[i10];
        objArr[i10] = e10;
        return e11;
    }

    public boolean t(long j10, E e10, E e11) {
        int i10 = i(j10);
        if (i10 < 0 || !kotlin.jvm.internal.f0.g(this.f3736d[i10], e10)) {
            return false;
        }
        this.f3736d[i10] = e11;
        return true;
    }

    @dl.d
    public String toString() {
        if (v() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f3737e * 28);
        sb2.append('{');
        int i10 = this.f3737e;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(l(i11));
            sb2.append(n5.a.f132013h);
            E eW = w(i11);
            if (eW != sb2) {
                sb2.append(eW);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public void u(int i10, E e10) {
        if (!(i10 >= 0 && i10 < this.f3737e)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (this.f3734b) {
            int i11 = this.f3737e;
            long[] jArr = this.f3735c;
            Object[] objArr = this.f3736d;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != y0.f3746a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f3734b = false;
            this.f3737e = i12;
        }
        this.f3736d[i10] = e10;
    }

    public int v() {
        if (this.f3734b) {
            int i10 = this.f3737e;
            long[] jArr = this.f3735c;
            Object[] objArr = this.f3736d;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != y0.f3746a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f3734b = false;
            this.f3737e = i11;
        }
        return this.f3737e;
    }

    public E w(int i10) {
        if (!(i10 >= 0 && i10 < this.f3737e)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (this.f3734b) {
            int i11 = this.f3737e;
            long[] jArr = this.f3735c;
            Object[] objArr = this.f3736d;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != y0.f3746a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f3734b = false;
            this.f3737e = i12;
        }
        return (E) this.f3736d[i10];
    }
}
