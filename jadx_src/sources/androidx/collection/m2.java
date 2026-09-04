package androidx.collection;

import java.util.Arrays;

/* JADX INFO: compiled from: SparseArrayCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nSparseArrayCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,535:1\n244#1,6:536\n244#1,6:542\n353#1,40:548\n353#1,40:588\n459#1,9:628\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n255#1:536,6\n260#1:542,6\n397#1:548,40\n405#1:588,40\n477#1:628,9\n*E\n"})
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final Object f3664a = new Object();

    private static final <E, T extends E> T A(l2<E> l2Var, int i10, T t10) {
        T t11;
        int iA = i0.a.a(l2Var.f3650c, l2Var.f3652e, i10);
        return (iA < 0 || (t11 = (T) l2Var.f3651d[iA]) == f3664a) ? t10 : t11;
    }

    public static final <E> void c(@dl.d l2<E> l2Var, int i10, E e10) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        int i11 = l2Var.f3652e;
        if (i11 != 0 && i10 <= l2Var.f3650c[i11 - 1]) {
            l2Var.n(i10, e10);
            return;
        }
        if (l2Var.f3649b && i11 >= l2Var.f3650c.length) {
            z(l2Var);
        }
        int i12 = l2Var.f3652e;
        if (i12 >= l2Var.f3650c.length) {
            int iE = i0.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(l2Var.f3650c, iE);
            kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
            l2Var.f3650c = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(l2Var.f3651d, iE);
            kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
            l2Var.f3651d = objArrCopyOf;
        }
        l2Var.f3650c[i12] = i10;
        l2Var.f3651d[i12] = e10;
        l2Var.f3652e = i12 + 1;
    }

    public static final <E> void d(@dl.d l2<E> l2Var) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        int i10 = l2Var.f3652e;
        Object[] objArr = l2Var.f3651d;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        l2Var.f3652e = 0;
        l2Var.f3649b = false;
    }

    public static final <E> boolean e(@dl.d l2<E> l2Var, int i10) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        return l2Var.j(i10) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static final <E> boolean f(@dl.d l2<E> l2Var, E e10) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        if (l2Var.f3649b) {
            z(l2Var);
        }
        int i10 = l2Var.f3652e;
        int i11 = 0;
        while (i11 < i10) {
            if (l2Var.f3651d[i11] == e10) {
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

    @dl.e
    public static final <E> E g(@dl.d l2<E> l2Var, int i10) {
        E e10;
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        int iA = i0.a.a(l2Var.f3650c, l2Var.f3652e, i10);
        if (iA < 0 || (e10 = (E) l2Var.f3651d[iA]) == f3664a) {
            return null;
        }
        return e10;
    }

    public static final <E> E h(@dl.d l2<E> l2Var, int i10, E e10) {
        E e11;
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        int iA = i0.a.a(l2Var.f3650c, l2Var.f3652e, i10);
        return (iA < 0 || (e11 = (E) l2Var.f3651d[iA]) == f3664a) ? e10 : e11;
    }

    public static final <E> int i(@dl.d l2<E> l2Var, int i10) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        if (l2Var.f3649b) {
            z(l2Var);
        }
        return i0.a.a(l2Var.f3650c, l2Var.f3652e, i10);
    }

    public static final <E> int j(@dl.d l2<E> l2Var, E e10) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        if (l2Var.f3649b) {
            z(l2Var);
        }
        int i10 = l2Var.f3652e;
        for (int i11 = 0; i11 < i10; i11++) {
            if (l2Var.f3651d[i11] == e10) {
                return i11;
            }
        }
        return -1;
    }

    public static final <E> boolean k(@dl.d l2<E> l2Var) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        return l2Var.x() == 0;
    }

    public static final <E> int l(@dl.d l2<E> l2Var, int i10) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        if (l2Var.f3649b) {
            z(l2Var);
        }
        return l2Var.f3650c[i10];
    }

    public static final <E> void m(@dl.d l2<E> l2Var, int i10, E e10) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        int iA = i0.a.a(l2Var.f3650c, l2Var.f3652e, i10);
        if (iA >= 0) {
            l2Var.f3651d[iA] = e10;
            return;
        }
        int i11 = ~iA;
        if (i11 < l2Var.f3652e && l2Var.f3651d[i11] == f3664a) {
            l2Var.f3650c[i11] = i10;
            l2Var.f3651d[i11] = e10;
            return;
        }
        if (l2Var.f3649b && l2Var.f3652e >= l2Var.f3650c.length) {
            z(l2Var);
            i11 = ~i0.a.a(l2Var.f3650c, l2Var.f3652e, i10);
        }
        int i12 = l2Var.f3652e;
        if (i12 >= l2Var.f3650c.length) {
            int iE = i0.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(l2Var.f3650c, iE);
            kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
            l2Var.f3650c = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(l2Var.f3651d, iE);
            kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
            l2Var.f3651d = objArrCopyOf;
        }
        int i13 = l2Var.f3652e;
        if (i13 - i11 != 0) {
            int[] iArr = l2Var.f3650c;
            int i14 = i11 + 1;
            kotlin.collections.m.a1(iArr, iArr, i14, i11, i13);
            Object[] objArr = l2Var.f3651d;
            kotlin.collections.m.c1(objArr, objArr, i14, i11, l2Var.f3652e);
        }
        l2Var.f3650c[i11] = i10;
        l2Var.f3651d[i11] = e10;
        l2Var.f3652e++;
    }

    public static final <E> void n(@dl.d l2<E> l2Var, @dl.d l2<? extends E> other) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        kotlin.jvm.internal.f0.p(other, "other");
        int iX = other.x();
        for (int i10 = 0; i10 < iX; i10++) {
            int iM = other.m(i10);
            E eY = other.y(i10);
            int iA = i0.a.a(l2Var.f3650c, l2Var.f3652e, iM);
            if (iA >= 0) {
                l2Var.f3651d[iA] = eY;
            } else {
                int i11 = ~iA;
                if (i11 >= l2Var.f3652e || l2Var.f3651d[i11] != f3664a) {
                    if (l2Var.f3649b && l2Var.f3652e >= l2Var.f3650c.length) {
                        z(l2Var);
                        i11 = ~i0.a.a(l2Var.f3650c, l2Var.f3652e, iM);
                    }
                    int i12 = l2Var.f3652e;
                    if (i12 >= l2Var.f3650c.length) {
                        int iE = i0.a.e(i12 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(l2Var.f3650c, iE);
                        kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
                        l2Var.f3650c = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(l2Var.f3651d, iE);
                        kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
                        l2Var.f3651d = objArrCopyOf;
                    }
                    int i13 = l2Var.f3652e;
                    if (i13 - i11 != 0) {
                        int[] iArr = l2Var.f3650c;
                        int i14 = i11 + 1;
                        kotlin.collections.m.a1(iArr, iArr, i14, i11, i13);
                        Object[] objArr = l2Var.f3651d;
                        kotlin.collections.m.c1(objArr, objArr, i14, i11, l2Var.f3652e);
                    }
                    l2Var.f3650c[i11] = iM;
                    l2Var.f3651d[i11] = eY;
                    l2Var.f3652e++;
                } else {
                    l2Var.f3650c[i11] = iM;
                    l2Var.f3651d[i11] = eY;
                }
            }
        }
    }

    @dl.e
    public static final <E> E o(@dl.d l2<E> l2Var, int i10, E e10) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        E e11 = (E) g(l2Var, i10);
        if (e11 == null) {
            int iA = i0.a.a(l2Var.f3650c, l2Var.f3652e, i10);
            if (iA >= 0) {
                l2Var.f3651d[iA] = e10;
            } else {
                int i11 = ~iA;
                if (i11 >= l2Var.f3652e || l2Var.f3651d[i11] != f3664a) {
                    if (l2Var.f3649b && l2Var.f3652e >= l2Var.f3650c.length) {
                        z(l2Var);
                        i11 = ~i0.a.a(l2Var.f3650c, l2Var.f3652e, i10);
                    }
                    int i12 = l2Var.f3652e;
                    if (i12 >= l2Var.f3650c.length) {
                        int iE = i0.a.e(i12 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(l2Var.f3650c, iE);
                        kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
                        l2Var.f3650c = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(l2Var.f3651d, iE);
                        kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
                        l2Var.f3651d = objArrCopyOf;
                    }
                    int i13 = l2Var.f3652e;
                    if (i13 - i11 != 0) {
                        int[] iArr = l2Var.f3650c;
                        int i14 = i11 + 1;
                        kotlin.collections.m.a1(iArr, iArr, i14, i11, i13);
                        Object[] objArr = l2Var.f3651d;
                        kotlin.collections.m.c1(objArr, objArr, i14, i11, l2Var.f3652e);
                    }
                    l2Var.f3650c[i11] = i10;
                    l2Var.f3651d[i11] = e10;
                    l2Var.f3652e++;
                } else {
                    l2Var.f3650c[i11] = i10;
                    l2Var.f3651d[i11] = e10;
                }
            }
        }
        return e11;
    }

    public static final <E> void p(@dl.d l2<E> l2Var, int i10) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        int iA = i0.a.a(l2Var.f3650c, l2Var.f3652e, i10);
        if (iA >= 0) {
            Object[] objArr = l2Var.f3651d;
            Object obj = objArr[iA];
            Object obj2 = f3664a;
            if (obj != obj2) {
                objArr[iA] = obj2;
                l2Var.f3649b = true;
            }
        }
    }

    public static final <E> boolean q(@dl.d l2<E> l2Var, int i10, @dl.e Object obj) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        int iJ = l2Var.j(i10);
        if (iJ < 0 || !kotlin.jvm.internal.f0.g(obj, l2Var.y(iJ))) {
            return false;
        }
        l2Var.s(iJ);
        return true;
    }

    public static final <E> void r(@dl.d l2<E> l2Var, int i10) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        if (l2Var.f3651d[i10] != f3664a) {
            l2Var.f3651d[i10] = f3664a;
            l2Var.f3649b = true;
        }
    }

    public static final <E> void s(@dl.d l2<E> l2Var, int i10, int i11) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        int iMin = Math.min(i11, i10 + i11);
        while (i10 < iMin) {
            l2Var.s(i10);
            i10++;
        }
    }

    @dl.e
    public static final <E> E t(@dl.d l2<E> l2Var, int i10, E e10) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        int iJ = l2Var.j(i10);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = l2Var.f3651d;
        E e11 = (E) objArr[iJ];
        objArr[iJ] = e10;
        return e11;
    }

    public static final <E> boolean u(@dl.d l2<E> l2Var, int i10, E e10, E e11) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        int iJ = l2Var.j(i10);
        if (iJ < 0 || !kotlin.jvm.internal.f0.g(l2Var.f3651d[iJ], e10)) {
            return false;
        }
        l2Var.f3651d[iJ] = e11;
        return true;
    }

    public static final <E> void v(@dl.d l2<E> l2Var, int i10, E e10) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        if (l2Var.f3649b) {
            z(l2Var);
        }
        l2Var.f3651d[i10] = e10;
    }

    public static final <E> int w(@dl.d l2<E> l2Var) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        if (l2Var.f3649b) {
            z(l2Var);
        }
        return l2Var.f3652e;
    }

    @dl.d
    public static final <E> String x(@dl.d l2<E> l2Var) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        if (l2Var.x() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(l2Var.f3652e * 28);
        sb2.append('{');
        int i10 = l2Var.f3652e;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(l2Var.m(i11));
            sb2.append(n5.a.f132013h);
            E eY = l2Var.y(i11);
            if (eY != l2Var) {
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

    public static final <E> E y(@dl.d l2<E> l2Var, int i10) {
        kotlin.jvm.internal.f0.p(l2Var, "<this>");
        if (l2Var.f3649b) {
            z(l2Var);
        }
        return (E) l2Var.f3651d[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void z(l2<E> l2Var) {
        int i10 = l2Var.f3652e;
        int[] iArr = l2Var.f3650c;
        Object[] objArr = l2Var.f3651d;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f3664a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        l2Var.f3649b = false;
        l2Var.f3652e = i11;
    }
}
