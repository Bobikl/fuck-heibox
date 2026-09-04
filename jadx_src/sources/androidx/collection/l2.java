package androidx.collection;

import java.util.Arrays;

/* JADX INFO: compiled from: SparseArrayCompat.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nSparseArrayCompat.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n+ 2 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,273:1\n275#2,9:274\n288#2,5:283\n296#2,5:288\n304#2,8:293\n320#2,9:301\n353#2,40:310\n396#2,2:350\n353#2,47:352\n403#2,3:399\n353#2,40:402\n407#2:442\n412#2,4:443\n419#2:447\n423#2,4:448\n431#2,8:452\n443#2,5:460\n451#2,4:465\n459#2,9:469\n472#2:478\n477#2:479\n459#2,9:480\n482#2,8:489\n493#2,17:497\n513#2,21:514\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n*L\n130#1:274,9\n135#1:283,5\n144#1:288,5\n152#1:293,8\n163#1:301,9\n169#1:310,40\n176#1:350,2\n176#1:352,47\n186#1:399,3\n186#1:402,40\n186#1:442\n191#1:443,4\n205#1:447\n212#1:448,4\n218#1:452,8\n224#1:460,5\n234#1:465,4\n246#1:469,9\n249#1:478\n252#1:479\n252#1:480,9\n257#1:489,8\n263#1:497,17\n271#1:514,21\n*E\n"})
public class l2<E> implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @xh.e
    public /* synthetic */ boolean f3649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @xh.e
    public /* synthetic */ int[] f3650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @xh.e
    public /* synthetic */ Object[] f3651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @xh.e
    public /* synthetic */ int f3652e;

    @xh.i
    public l2() {
        this(0, 1, null);
    }

    @xh.i
    public l2(int i10) {
        if (i10 == 0) {
            this.f3650c = i0.a.f119206a;
            this.f3651d = i0.a.f119208c;
        } else {
            int iE = i0.a.e(i10);
            this.f3650c = new int[iE];
            this.f3651d = new Object[iE];
        }
    }

    public /* synthetic */ l2(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    public void a(int i10, E e10) {
        int i11 = this.f3652e;
        if (i11 != 0 && i10 <= this.f3650c[i11 - 1]) {
            n(i10, e10);
            return;
        }
        if (this.f3649b && i11 >= this.f3650c.length) {
            m2.z(this);
        }
        int i12 = this.f3652e;
        if (i12 >= this.f3650c.length) {
            int iE = i0.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f3650c, iE);
            kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f3650c = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3651d, iE);
            kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f3651d = objArrCopyOf;
        }
        this.f3650c[i12] = i10;
        this.f3651d[i12] = e10;
        this.f3652e = i12 + 1;
    }

    public void b() {
        int i10 = this.f3652e;
        Object[] objArr = this.f3651d;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f3652e = 0;
        this.f3649b = false;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public l2<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.f0.n(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        l2<E> l2Var = (l2) objClone;
        l2Var.f3650c = (int[]) this.f3650c.clone();
        l2Var.f3651d = (Object[]) this.f3651d.clone();
        return l2Var;
    }

    public boolean d(int i10) {
        return j(i10) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public boolean e(E e10) {
        if (this.f3649b) {
            m2.z(this);
        }
        int i10 = this.f3652e;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f3651d[i11] == e10) {
                if (i11 >= 0) {
                    return true;
                }
                return false;
            }
            i11++;
        }
        i11 = -1;
        if (i11 >= 0) {
            return true;
        }
        return false;
    }

    @kotlin.k(message = "Alias for remove(int).", replaceWith = @kotlin.s0(expression = "remove(key)", imports = {}))
    public void f(int i10) {
        q(i10);
    }

    @dl.e
    public E g(int i10) {
        return (E) m2.g(this, i10);
    }

    public E h(int i10, E e10) {
        return (E) m2.h(this, i10, e10);
    }

    @xh.h(name = "getIsEmpty")
    public final boolean i() {
        return l();
    }

    public int j(int i10) {
        if (this.f3649b) {
            m2.z(this);
        }
        return i0.a.a(this.f3650c, this.f3652e, i10);
    }

    public int k(E e10) {
        if (this.f3649b) {
            m2.z(this);
        }
        int i10 = this.f3652e;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f3651d[i11] == e10) {
                return i11;
            }
        }
        return -1;
    }

    public boolean l() {
        return x() == 0;
    }

    public int m(int i10) {
        if (this.f3649b) {
            m2.z(this);
        }
        return this.f3650c[i10];
    }

    public void n(int i10, E e10) {
        int iA = i0.a.a(this.f3650c, this.f3652e, i10);
        if (iA >= 0) {
            this.f3651d[iA] = e10;
            return;
        }
        int i11 = ~iA;
        if (i11 < this.f3652e && this.f3651d[i11] == m2.f3664a) {
            this.f3650c[i11] = i10;
            this.f3651d[i11] = e10;
            return;
        }
        if (this.f3649b && this.f3652e >= this.f3650c.length) {
            m2.z(this);
            i11 = ~i0.a.a(this.f3650c, this.f3652e, i10);
        }
        int i12 = this.f3652e;
        if (i12 >= this.f3650c.length) {
            int iE = i0.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f3650c, iE);
            kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f3650c = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3651d, iE);
            kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f3651d = objArrCopyOf;
        }
        int i13 = this.f3652e;
        if (i13 - i11 != 0) {
            int[] iArr = this.f3650c;
            int i14 = i11 + 1;
            kotlin.collections.m.a1(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.f3651d;
            kotlin.collections.m.c1(objArr, objArr, i14, i11, this.f3652e);
        }
        this.f3650c[i11] = i10;
        this.f3651d[i11] = e10;
        this.f3652e++;
    }

    public void o(@dl.d l2<? extends E> other) {
        kotlin.jvm.internal.f0.p(other, "other");
        int iX = other.x();
        for (int i10 = 0; i10 < iX; i10++) {
            int iM = other.m(i10);
            E eY = other.y(i10);
            int iA = i0.a.a(this.f3650c, this.f3652e, iM);
            if (iA >= 0) {
                this.f3651d[iA] = eY;
            } else {
                int i11 = ~iA;
                if (i11 >= this.f3652e || this.f3651d[i11] != m2.f3664a) {
                    if (this.f3649b && this.f3652e >= this.f3650c.length) {
                        m2.z(this);
                        i11 = ~i0.a.a(this.f3650c, this.f3652e, iM);
                    }
                    int i12 = this.f3652e;
                    if (i12 >= this.f3650c.length) {
                        int iE = i0.a.e(i12 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(this.f3650c, iE);
                        kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
                        this.f3650c = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(this.f3651d, iE);
                        kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
                        this.f3651d = objArrCopyOf;
                    }
                    int i13 = this.f3652e;
                    if (i13 - i11 != 0) {
                        int[] iArr = this.f3650c;
                        int i14 = i11 + 1;
                        kotlin.collections.m.a1(iArr, iArr, i14, i11, i13);
                        Object[] objArr = this.f3651d;
                        kotlin.collections.m.c1(objArr, objArr, i14, i11, this.f3652e);
                    }
                    this.f3650c[i11] = iM;
                    this.f3651d[i11] = eY;
                    this.f3652e++;
                } else {
                    this.f3650c[i11] = iM;
                    this.f3651d[i11] = eY;
                }
            }
        }
    }

    @dl.e
    public E p(int i10, E e10) {
        E e11 = (E) m2.g(this, i10);
        if (e11 == null) {
            int iA = i0.a.a(this.f3650c, this.f3652e, i10);
            if (iA >= 0) {
                this.f3651d[iA] = e10;
            } else {
                int i11 = ~iA;
                if (i11 >= this.f3652e || this.f3651d[i11] != m2.f3664a) {
                    if (this.f3649b && this.f3652e >= this.f3650c.length) {
                        m2.z(this);
                        i11 = ~i0.a.a(this.f3650c, this.f3652e, i10);
                    }
                    int i12 = this.f3652e;
                    if (i12 >= this.f3650c.length) {
                        int iE = i0.a.e(i12 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(this.f3650c, iE);
                        kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
                        this.f3650c = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(this.f3651d, iE);
                        kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
                        this.f3651d = objArrCopyOf;
                    }
                    int i13 = this.f3652e;
                    if (i13 - i11 != 0) {
                        int[] iArr = this.f3650c;
                        int i14 = i11 + 1;
                        kotlin.collections.m.a1(iArr, iArr, i14, i11, i13);
                        Object[] objArr = this.f3651d;
                        kotlin.collections.m.c1(objArr, objArr, i14, i11, this.f3652e);
                    }
                    this.f3650c[i11] = i10;
                    this.f3651d[i11] = e10;
                    this.f3652e++;
                } else {
                    this.f3650c[i11] = i10;
                    this.f3651d[i11] = e10;
                }
            }
        }
        return e11;
    }

    public void q(int i10) {
        m2.p(this, i10);
    }

    public boolean r(int i10, @dl.e Object obj) {
        int iJ = j(i10);
        if (iJ < 0 || !kotlin.jvm.internal.f0.g(obj, y(iJ))) {
            return false;
        }
        s(iJ);
        return true;
    }

    public void s(int i10) {
        if (this.f3651d[i10] != m2.f3664a) {
            this.f3651d[i10] = m2.f3664a;
            this.f3649b = true;
        }
    }

    public void t(int i10, int i11) {
        int iMin = Math.min(i11, i10 + i11);
        while (i10 < iMin) {
            s(i10);
            i10++;
        }
    }

    @dl.d
    public String toString() {
        if (x() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f3652e * 28);
        sb2.append('{');
        int i10 = this.f3652e;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(m(i11));
            sb2.append(n5.a.f132013h);
            E eY = y(i11);
            if (eY != this) {
                sb2.append(eY);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "buffer.toString()");
        return string;
    }

    @dl.e
    public E u(int i10, E e10) {
        int iJ = j(i10);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = this.f3651d;
        E e11 = (E) objArr[iJ];
        objArr[iJ] = e10;
        return e11;
    }

    public boolean v(int i10, E e10, E e11) {
        int iJ = j(i10);
        if (iJ < 0 || !kotlin.jvm.internal.f0.g(this.f3651d[iJ], e10)) {
            return false;
        }
        this.f3651d[iJ] = e11;
        return true;
    }

    public void w(int i10, E e10) {
        if (this.f3649b) {
            m2.z(this);
        }
        this.f3651d[i10] = e10;
    }

    public int x() {
        if (this.f3649b) {
            m2.z(this);
        }
        return this.f3652e;
    }

    public E y(int i10) {
        if (this.f3649b) {
            m2.z(this);
        }
        return (E) this.f3651d[i10];
    }
}
