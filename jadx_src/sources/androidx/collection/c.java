package androidx.collection;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: ArraySet.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nArraySet.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n+ 2 ArraySet.kt\nandroidx/collection/ArraySetKt\n*L\n1#1,300:1\n304#2,10:301\n317#2,14:311\n334#2:325\n339#2:326\n345#2:327\n350#2:328\n355#2,61:329\n420#2,17:390\n440#2,6:407\n450#2,60:413\n518#2,9:473\n531#2,22:482\n557#2,7:504\n568#2,19:511\n591#2,6:530\n601#2,6:536\n611#2,5:542\n620#2,8:547\n*S KotlinDebug\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n*L\n98#1:301,10\n108#1:311,14\n118#1:325\n128#1:326\n138#1:327\n145#1:328\n157#1:329,61\n167#1:390,17\n177#1:407,6\n188#1:413,60\n197#1:473,9\n224#1:482,22\n231#1:504,7\n240#1:511,19\n267#1:530,6\n276#1:536,6\n286#1:542,5\n297#1:547,8\n*E\n"})
public final class c<E> implements Collection<E>, Set<E>, zh.b, zh.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private int[] f3564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private Object[] f3565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3566d;

    /* JADX INFO: compiled from: ArraySet.jvm.kt */
    public final class a extends w<E> {
        public a() {
            super(c.this.i());
        }

        @Override // androidx.collection.w
        protected E a(int i10) {
            return c.this.v(i10);
        }

        @Override // androidx.collection.w
        protected void b(int i10) {
            c.this.l(i10);
        }
    }

    @xh.i
    public c() {
        this(0, 1, null);
    }

    @xh.i
    public c(int i10) {
        this.f3564b = i0.a.f119206a;
        this.f3565c = i0.a.f119208c;
        if (i10 > 0) {
            e.d(this, i10);
        }
    }

    public /* synthetic */ c(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public c(@dl.e c<? extends E> cVar) {
        this(0);
        if (cVar != null) {
            a(cVar);
        }
    }

    public c(@dl.e Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@dl.e E[] eArr) {
        this(0);
        if (eArr != null) {
            Iterator itA = kotlin.jvm.internal.h.a(eArr);
            while (itA.hasNext()) {
                add(itA.next());
            }
        }
    }

    public final void a(@dl.d c<? extends E> array) {
        kotlin.jvm.internal.f0.p(array, "array");
        int i10 = array.i();
        b(i() + i10);
        if (i() != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                add(array.v(i11));
            }
            return;
        }
        if (i10 > 0) {
            kotlin.collections.m.j1(array.g(), g(), 0, 0, i10, 6, null);
            kotlin.collections.m.l1(array.e(), e(), 0, 0, i10, 6, null);
            if (i() != 0) {
                throw new ConcurrentModificationException();
            }
            u(i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int iN;
        int i11 = i();
        if (e10 == null) {
            iN = e.p(this);
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iN = e.n(this, e10, iHashCode);
        }
        if (iN >= 0) {
            return false;
        }
        int i12 = ~iN;
        if (i11 >= g().length) {
            int i13 = 4;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 >= 4) {
                i13 = 8;
            }
            int[] iArrG = g();
            Object[] objArrE = e();
            e.d(this, i13);
            if (i11 != i()) {
                throw new ConcurrentModificationException();
            }
            if (!(g().length == 0)) {
                kotlin.collections.m.j1(iArrG, g(), 0, 0, iArrG.length, 6, null);
                kotlin.collections.m.l1(objArrE, e(), 0, 0, objArrE.length, 6, null);
            }
        }
        if (i12 < i11) {
            int i14 = i12 + 1;
            kotlin.collections.m.a1(g(), g(), i14, i12, i11);
            kotlin.collections.m.c1(e(), e(), i14, i12, i11);
        }
        if (i11 != i() || i12 >= g().length) {
            throw new ConcurrentModificationException();
        }
        g()[i12] = i10;
        e()[i12] = e10;
        u(i() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@dl.d Collection<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        b(i() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void b(int i10) {
        int i11 = i();
        if (g().length < i10) {
            int[] iArrG = g();
            Object[] objArrE = e();
            e.d(this, i10);
            if (i() > 0) {
                kotlin.collections.m.j1(iArrG, g(), 0, 0, i(), 6, null);
                kotlin.collections.m.l1(objArrE, e(), 0, 0, i(), 6, null);
            }
        }
        if (i() != i11) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (i() != 0) {
            s(i0.a.f119206a);
            o(i0.a.f119208c);
            u(0);
        }
        if (i() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public final Object[] e() {
        return this.f3565c;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int i10 = i();
                for (int i11 = 0; i11 < i10; i11++) {
                    if (((Set) obj).contains(v(i11))) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @dl.d
    public final int[] g() {
        return this.f3564b;
    }

    public int h() {
        return this.f3566d;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrG = g();
        int i10 = i();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArrG[i12];
        }
        return i11;
    }

    public final int i() {
        return this.f3566d;
    }

    public final int indexOf(@dl.e Object obj) {
        return obj == null ? e.p(this) : e.n(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return i() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @dl.d
    public Iterator<E> iterator() {
        return new a();
    }

    public final boolean j(@dl.d c<? extends E> array) {
        kotlin.jvm.internal.f0.p(array, "array");
        int i10 = array.i();
        int i11 = i();
        for (int i12 = 0; i12 < i10; i12++) {
            remove(array.v(i12));
        }
        return i11 != i();
    }

    public final E l(int i10) {
        int i11 = i();
        E e10 = (E) e()[i10];
        if (i11 <= 1) {
            clear();
        } else {
            int i12 = i11 - 1;
            if (g().length <= 8 || i() >= g().length / 3) {
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    int i14 = i12 + 1;
                    kotlin.collections.m.a1(g(), g(), i10, i13, i14);
                    kotlin.collections.m.c1(e(), e(), i10, i13, i14);
                }
                e()[i12] = null;
            } else {
                int i15 = i() > 8 ? i() + (i() >> 1) : 8;
                int[] iArrG = g();
                Object[] objArrE = e();
                e.d(this, i15);
                if (i10 > 0) {
                    kotlin.collections.m.j1(iArrG, g(), 0, 0, i10, 6, null);
                    kotlin.collections.m.l1(objArrE, e(), 0, 0, i10, 6, null);
                }
                if (i10 < i12) {
                    int i16 = i10 + 1;
                    int i17 = i12 + 1;
                    kotlin.collections.m.a1(iArrG, g(), i10, i16, i17);
                    kotlin.collections.m.c1(objArrE, e(), i10, i16, i17);
                }
            }
            if (i11 != i()) {
                throw new ConcurrentModificationException();
            }
            u(i12);
        }
        return e10;
    }

    public final void o(@dl.d Object[] objArr) {
        kotlin.jvm.internal.f0.p(objArr, "<set-?>");
        this.f3565c = objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        l(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        boolean z10 = false;
        for (int i10 = i() - 1; -1 < i10; i10--) {
            if (!CollectionsKt___CollectionsKt.R1(elements, e()[i10])) {
                l(i10);
                z10 = true;
            }
        }
        return z10;
    }

    public final void s(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<set-?>");
        this.f3564b = iArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return h();
    }

    @Override // java.util.Collection, java.util.Set
    @dl.d
    public final Object[] toArray() {
        return kotlin.collections.m.M1(this.f3565c, 0, this.f3566d);
    }

    @Override // java.util.Collection, java.util.Set
    @dl.d
    public final <T> T[] toArray(@dl.d T[] array) {
        kotlin.jvm.internal.f0.p(array, "array");
        T[] result = (T[]) d.a(array, this.f3566d);
        kotlin.collections.m.c1(this.f3565c, result, 0, 0, this.f3566d);
        kotlin.jvm.internal.f0.o(result, "result");
        return result;
    }

    @dl.d
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i() * 14);
        sb2.append('{');
        int i10 = i();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            E eV = v(i11);
            if (eV != this) {
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

    public final void u(int i10) {
        this.f3566d = i10;
    }

    public final E v(int i10) {
        return (E) e()[i10];
    }
}
