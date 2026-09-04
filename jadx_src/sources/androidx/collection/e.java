package androidx.collection;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: ArraySet.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f3576a = 4;

    public static final <E> void a(@dl.d c<E> cVar, @dl.d c<? extends E> array) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        kotlin.jvm.internal.f0.p(array, "array");
        int i10 = array.i();
        cVar.b(cVar.i() + i10);
        if (cVar.i() != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                cVar.add(array.v(i11));
            }
            return;
        }
        if (i10 > 0) {
            kotlin.collections.m.j1(array.g(), cVar.g(), 0, 0, i10, 6, null);
            kotlin.collections.m.l1(array.e(), cVar.e(), 0, 0, i10, 6, null);
            if (cVar.i() != 0) {
                throw new ConcurrentModificationException();
            }
            cVar.u(i10);
        }
    }

    public static final <E> boolean b(@dl.d c<E> cVar, @dl.d Collection<? extends E> elements) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        cVar.b(cVar.i() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= cVar.add(it.next());
        }
        return zAdd;
    }

    public static final <E> boolean c(@dl.d c<E> cVar, E e10) {
        int i10;
        int iN;
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        int i11 = cVar.i();
        if (e10 == null) {
            iN = p(cVar);
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iN = n(cVar, e10, iHashCode);
        }
        if (iN >= 0) {
            return false;
        }
        int i12 = ~iN;
        if (i11 >= cVar.g().length) {
            int i13 = 4;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 >= 4) {
                i13 = 8;
            }
            int[] iArrG = cVar.g();
            Object[] objArrE = cVar.e();
            d(cVar, i13);
            if (i11 != cVar.i()) {
                throw new ConcurrentModificationException();
            }
            if (!(cVar.g().length == 0)) {
                kotlin.collections.m.j1(iArrG, cVar.g(), 0, 0, iArrG.length, 6, null);
                kotlin.collections.m.l1(objArrE, cVar.e(), 0, 0, objArrE.length, 6, null);
            }
        }
        if (i12 < i11) {
            int i14 = i12 + 1;
            kotlin.collections.m.a1(cVar.g(), cVar.g(), i14, i12, i11);
            kotlin.collections.m.c1(cVar.e(), cVar.e(), i14, i12, i11);
        }
        if (i11 != cVar.i() || i12 >= cVar.g().length) {
            throw new ConcurrentModificationException();
        }
        cVar.g()[i12] = i10;
        cVar.e()[i12] = e10;
        cVar.u(cVar.i() + 1);
        return true;
    }

    public static final <E> void d(@dl.d c<E> cVar, int i10) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        cVar.s(new int[i10]);
        cVar.o(new Object[i10]);
    }

    @dl.d
    public static final <T> c<T> e() {
        return new c<>(0, 1, null);
    }

    @dl.d
    public static final <T> c<T> f(@dl.d T... values) {
        kotlin.jvm.internal.f0.p(values, "values");
        c<T> cVar = new c<>(values.length);
        for (T t10 : values) {
            cVar.add(t10);
        }
        return cVar;
    }

    public static final <E> int g(@dl.d c<E> cVar, int i10) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        try {
            return i0.a.a(cVar.g(), cVar.i(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> void h(@dl.d c<E> cVar) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        if (cVar.i() != 0) {
            cVar.s(i0.a.f119206a);
            cVar.o(i0.a.f119208c);
            cVar.u(0);
        }
        if (cVar.i() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean i(@dl.d c<E> cVar, @dl.d Collection<? extends E> elements) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!cVar.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final <E> boolean j(@dl.d c<E> cVar, E e10) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        return cVar.indexOf(e10) >= 0;
    }

    public static final <E> void k(@dl.d c<E> cVar, int i10) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        int i11 = cVar.i();
        if (cVar.g().length < i10) {
            int[] iArrG = cVar.g();
            Object[] objArrE = cVar.e();
            d(cVar, i10);
            if (cVar.i() > 0) {
                kotlin.collections.m.j1(iArrG, cVar.g(), 0, 0, cVar.i(), 6, null);
                kotlin.collections.m.l1(objArrE, cVar.e(), 0, 0, cVar.i(), 6, null);
            }
        }
        if (cVar.i() != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean l(@dl.d c<E> cVar, @dl.e Object obj) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        if (cVar == obj) {
            return true;
        }
        if (!(obj instanceof Set) || cVar.size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = cVar.i();
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(cVar.v(i11))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final <E> int m(@dl.d c<E> cVar) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        int[] iArrG = cVar.g();
        int i10 = cVar.i();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArrG[i12];
        }
        return i11;
    }

    public static final <E> int n(@dl.d c<E> cVar, @dl.e Object obj, int i10) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        int i11 = cVar.i();
        if (i11 == 0) {
            return -1;
        }
        int iG = g(cVar, i10);
        if (iG < 0 || kotlin.jvm.internal.f0.g(obj, cVar.e()[iG])) {
            return iG;
        }
        int i12 = iG + 1;
        while (i12 < i11 && cVar.g()[i12] == i10) {
            if (kotlin.jvm.internal.f0.g(obj, cVar.e()[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iG - 1; i13 >= 0 && cVar.g()[i13] == i10; i13--) {
            if (kotlin.jvm.internal.f0.g(obj, cVar.e()[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    public static final <E> int o(@dl.d c<E> cVar, @dl.e Object obj) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        return obj == null ? p(cVar) : n(cVar, obj, obj.hashCode());
    }

    public static final <E> int p(@dl.d c<E> cVar) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        return n(cVar, null, 0);
    }

    public static final <E> boolean q(@dl.d c<E> cVar) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        return cVar.i() <= 0;
    }

    public static final <E> boolean r(@dl.d c<E> cVar, @dl.d c<? extends E> array) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        kotlin.jvm.internal.f0.p(array, "array");
        int i10 = array.i();
        int i11 = cVar.i();
        for (int i12 = 0; i12 < i10; i12++) {
            cVar.remove(array.v(i12));
        }
        return i11 != cVar.i();
    }

    public static final <E> boolean s(@dl.d c<E> cVar, @dl.d Collection<? extends E> elements) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= cVar.remove(it.next());
        }
        return zRemove;
    }

    public static final <E> E t(@dl.d c<E> cVar, int i10) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        int i11 = cVar.i();
        E e10 = (E) cVar.e()[i10];
        if (i11 <= 1) {
            cVar.clear();
        } else {
            int i12 = i11 - 1;
            if (cVar.g().length <= 8 || cVar.i() >= cVar.g().length / 3) {
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    int i14 = i12 + 1;
                    kotlin.collections.m.a1(cVar.g(), cVar.g(), i10, i13, i14);
                    kotlin.collections.m.c1(cVar.e(), cVar.e(), i10, i13, i14);
                }
                cVar.e()[i12] = null;
            } else {
                int i15 = cVar.i() > 8 ? cVar.i() + (cVar.i() >> 1) : 8;
                int[] iArrG = cVar.g();
                Object[] objArrE = cVar.e();
                d(cVar, i15);
                if (i10 > 0) {
                    kotlin.collections.m.j1(iArrG, cVar.g(), 0, 0, i10, 6, null);
                    kotlin.collections.m.l1(objArrE, cVar.e(), 0, 0, i10, 6, null);
                }
                if (i10 < i12) {
                    int i16 = i10 + 1;
                    int i17 = i12 + 1;
                    kotlin.collections.m.a1(iArrG, cVar.g(), i10, i16, i17);
                    kotlin.collections.m.c1(objArrE, cVar.e(), i10, i16, i17);
                }
            }
            if (i11 != cVar.i()) {
                throw new ConcurrentModificationException();
            }
            cVar.u(i12);
        }
        return e10;
    }

    public static final <E> boolean u(@dl.d c<E> cVar, E e10) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        int iIndexOf = cVar.indexOf(e10);
        if (iIndexOf < 0) {
            return false;
        }
        cVar.l(iIndexOf);
        return true;
    }

    public static final <E> boolean v(@dl.d c<E> cVar, @dl.d Collection<? extends E> elements) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        boolean z10 = false;
        for (int i10 = cVar.i() - 1; -1 < i10; i10--) {
            if (!CollectionsKt___CollectionsKt.R1(elements, cVar.e()[i10])) {
                cVar.l(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @dl.d
    public static final <E> String w(@dl.d c<E> cVar) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        if (cVar.isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(cVar.i() * 14);
        sb2.append('{');
        int i10 = cVar.i();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            E eV = cVar.v(i11);
            if (eV != cVar) {
                sb2.append(eV);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public static final <E> E x(@dl.d c<E> cVar, int i10) {
        kotlin.jvm.internal.f0.p(cVar, "<this>");
        return (E) cVar.e()[i10];
    }
}
