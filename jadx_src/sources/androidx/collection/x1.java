package androidx.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 ObjectList.kt\nandroidx/collection/ObjectList\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1618:1\n948#1,2:1641\n948#1,2:1652\n948#1,2:1656\n652#1:1659\n955#1,2:1662\n955#1,2:1669\n955#1,2:1691\n955#1,2:1701\n955#1,2:1704\n955#1,2:1708\n1864#2,3:1619\n1855#2:1651\n1856#2:1654\n1855#2:1703\n1856#2:1706\n267#3,4:1622\n237#3,7:1626\n248#3,3:1634\n251#3,2:1638\n272#3:1640\n273#3:1643\n254#3,6:1644\n274#3:1650\n267#3,4:1672\n237#3,7:1676\n248#3,3:1684\n251#3,2:1688\n272#3:1690\n273#3:1693\n254#3,6:1694\n274#3:1700\n1826#4:1633\n1688#4:1637\n1826#4:1683\n1688#4:1687\n1295#5:1655\n1296#5:1658\n1295#5:1707\n1296#5:1710\n80#6:1660\n305#6,4:1665\n310#6:1671\n75#6:1711\n75#6:1712\n75#6:1713\n75#6:1714\n75#6:1715\n75#6:1716\n75#6:1717\n75#6:1718\n13579#7:1661\n13580#7:1664\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n864#1:1641,2\n898#1:1652,2\n907#1:1656,2\n927#1:1659\n1050#1:1662,2\n1059#1:1669,2\n1068#1:1691,2\n1077#1:1701,2\n1086#1:1704,2\n1095#1:1708,2\n740#1:1619,3\n897#1:1651\n897#1:1654\n1085#1:1703\n1085#1:1706\n863#1:1622,4\n863#1:1626,7\n863#1:1634,3\n863#1:1638,2\n863#1:1640\n863#1:1643\n863#1:1644,6\n863#1:1650\n1067#1:1672,4\n1067#1:1676,7\n1067#1:1684,3\n1067#1:1688,2\n1067#1:1690\n1067#1:1693\n1067#1:1694,6\n1067#1:1700\n863#1:1633\n863#1:1637\n1067#1:1683\n1067#1:1687\n906#1:1655\n906#1:1658\n1094#1:1707\n1094#1:1710\n979#1:1660\n1058#1:1665,4\n1058#1:1671\n1105#1:1711\n1109#1:1712\n1159#1:1713\n1175#1:1714\n1191#1:1715\n1207#1:1716\n1223#1:1717\n1242#1:1718\n1049#1:1661\n1049#1:1664\n*E\n"})
public final class x1<E> extends ObjectList<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private b<E> f3738c;

    /* JADX INFO: compiled from: ObjectList.kt */
    public static final class a<T> implements ListIterator<T>, zh.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final List<T> f3739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3740c;

        public a(@dl.d List<T> list, int i10) {
            kotlin.jvm.internal.f0.p(list, "list");
            this.f3739b = list;
            this.f3740c = i10 - 1;
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            List<T> list = this.f3739b;
            int i10 = this.f3740c + 1;
            this.f3740c = i10;
            list.add(i10, t10);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f3740c < this.f3739b.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f3740c >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.f3739b;
            int i10 = this.f3740c + 1;
            this.f3740c = i10;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f3740c + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.f3739b;
            int i10 = this.f3740c;
            this.f3740c = i10 - 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f3740c;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f3739b.remove(this.f3740c);
            this.f3740c--;
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            this.f3739b.set(this.f3740c, t10);
        }
    }

    /* JADX INFO: compiled from: ObjectList.kt */
    public static final class b<T> implements List<T>, zh.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final x1<T> f3741b;

        public b(@dl.d x1<T> objectList) {
            kotlin.jvm.internal.f0.p(objectList, "objectList");
            this.f3741b = objectList;
        }

        public int a() {
            return this.f3741b.C();
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.f3741b.Y(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            return this.f3741b.Z(t10);
        }

        @Override // java.util.List
        public boolean addAll(int i10, @dl.d Collection<? extends T> elements) {
            kotlin.jvm.internal.f0.p(elements, "elements");
            return this.f3741b.b0(i10, elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@dl.d Collection<? extends T> elements) {
            kotlin.jvm.internal.f0.p(elements, "elements");
            return this.f3741b.f0(elements);
        }

        public T b(int i10) {
            d2.d(this, i10);
            return this.f3741b.I0(i10);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f3741b.k0();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f3741b.d(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@dl.d Collection<? extends Object> elements) {
            kotlin.jvm.internal.f0.p(elements, "elements");
            return this.f3741b.f(elements);
        }

        @Override // java.util.List
        public T get(int i10) {
            d2.d(this, i10);
            return this.f3741b.y(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f3741b.E(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f3741b.H();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @dl.d
        public Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f3741b.T(obj);
        }

        @Override // java.util.List
        @dl.d
        public ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        @dl.d
        public ListIterator<T> listIterator(int i10) {
            return new a(this, i10);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return b(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f3741b.B0(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@dl.d Collection<? extends Object> elements) {
            kotlin.jvm.internal.f0.p(elements, "elements");
            return this.f3741b.E0(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@dl.d Collection<? extends Object> elements) {
            kotlin.jvm.internal.f0.p(elements, "elements");
            return this.f3741b.N0(elements);
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            d2.d(this, i10);
            return this.f3741b.Q0(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        @dl.d
        public List<T> subList(int i10, int i11) {
            d2.e(this, i10, i11);
            return new c(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.t.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.f0.p(array, "array");
            return (T[]) kotlin.jvm.internal.t.b(this, array);
        }
    }

    /* JADX INFO: compiled from: ObjectList.kt */
    @kotlin.jvm.internal.t0({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n1855#2,2:1619\n1855#2,2:1621\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n*L\n1395#1:1619,2\n1477#1:1621,2\n*E\n"})
    public static final class c<T> implements List<T>, zh.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final List<T> f3742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f3744d;

        public c(@dl.d List<T> list, int i10, int i11) {
            kotlin.jvm.internal.f0.p(list, "list");
            this.f3742b = list;
            this.f3743c = i10;
            this.f3744d = i11;
        }

        public int a() {
            return this.f3744d - this.f3743c;
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.f3742b.add(i10 + this.f3743c, t10);
            this.f3744d++;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            List<T> list = this.f3742b;
            int i10 = this.f3744d;
            this.f3744d = i10 + 1;
            list.add(i10, t10);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i10, @dl.d Collection<? extends T> elements) {
            kotlin.jvm.internal.f0.p(elements, "elements");
            this.f3742b.addAll(i10 + this.f3743c, elements);
            this.f3744d += elements.size();
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@dl.d Collection<? extends T> elements) {
            kotlin.jvm.internal.f0.p(elements, "elements");
            this.f3742b.addAll(this.f3744d, elements);
            this.f3744d += elements.size();
            return elements.size() > 0;
        }

        public T b(int i10) {
            d2.d(this, i10);
            T tRemove = this.f3742b.remove(i10 + this.f3743c);
            this.f3744d--;
            return tRemove;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.f3744d - 1;
            int i11 = this.f3743c;
            if (i11 <= i10) {
                while (true) {
                    this.f3742b.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f3744d = this.f3743c;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.f3744d;
            for (int i11 = this.f3743c; i11 < i10; i11++) {
                if (kotlin.jvm.internal.f0.g(this.f3742b.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@dl.d Collection<? extends Object> elements) {
            kotlin.jvm.internal.f0.p(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i10) {
            d2.d(this, i10);
            return this.f3742b.get(i10 + this.f3743c);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f3744d;
            for (int i11 = this.f3743c; i11 < i10; i11++) {
                if (kotlin.jvm.internal.f0.g(this.f3742b.get(i11), obj)) {
                    return i11 - this.f3743c;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f3744d == this.f3743c;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @dl.d
        public Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f3744d - 1;
            int i11 = this.f3743c;
            if (i11 > i10) {
                return -1;
            }
            while (!kotlin.jvm.internal.f0.g(this.f3742b.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f3743c;
        }

        @Override // java.util.List
        @dl.d
        public ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        @dl.d
        public ListIterator<T> listIterator(int i10) {
            return new a(this, i10);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return b(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.f3744d;
            for (int i11 = this.f3743c; i11 < i10; i11++) {
                if (kotlin.jvm.internal.f0.g(this.f3742b.get(i11), obj)) {
                    this.f3742b.remove(i11);
                    this.f3744d--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@dl.d Collection<? extends Object> elements) {
            kotlin.jvm.internal.f0.p(elements, "elements");
            int i10 = this.f3744d;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f3744d;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@dl.d Collection<? extends Object> elements) {
            kotlin.jvm.internal.f0.p(elements, "elements");
            int i10 = this.f3744d;
            int i11 = i10 - 1;
            int i12 = this.f3743c;
            if (i12 <= i11) {
                while (true) {
                    if (!elements.contains(this.f3742b.get(i11))) {
                        this.f3742b.remove(i11);
                        this.f3744d--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f3744d;
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            d2.d(this, i10);
            return this.f3742b.set(i10 + this.f3743c, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        @dl.d
        public List<T> subList(int i10, int i11) {
            d2.e(this, i10, i11);
            return new c(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.t.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.f0.p(array, "array");
            return (T[]) kotlin.jvm.internal.t.b(this, array);
        }
    }

    public x1() {
        this(0, 1, null);
    }

    public x1(int i10) {
        super(i10, null);
    }

    public /* synthetic */ x1(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public static /* synthetic */ void S0(x1 x1Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = x1Var.f3485b;
        }
        x1Var.R0(i10);
    }

    public final void A0(@dl.d E[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (elements.length == 0) {
            return;
        }
        l0(this.f3485b + elements.length);
        kotlin.collections.m.l1(elements, this.f3484a, this.f3485b, 0, 0, 12, null);
        this.f3485b += elements.length;
    }

    public final boolean B0(E e10) {
        int iE = E(e10);
        if (iE < 0) {
            return false;
        }
        I0(iE);
        return true;
    }

    public final boolean C0(@dl.d ObjectList<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3485b;
        n0(elements);
        return i10 != this.f3485b;
    }

    public final boolean D0(@dl.d ScatterSet<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3485b;
        o0(elements);
        return i10 != this.f3485b;
    }

    public final boolean E0(@dl.d Iterable<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3485b;
        p0(elements);
        return i10 != this.f3485b;
    }

    public final boolean F0(@dl.d List<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3485b;
        r0(elements);
        return i10 != this.f3485b;
    }

    public final boolean G0(@dl.d kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3485b;
        s0(elements);
        return i10 != this.f3485b;
    }

    public final boolean H0(@dl.d E[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3485b;
        for (E e10 : elements) {
            B0(e10);
        }
        return i10 != this.f3485b;
    }

    public final E I0(@androidx.annotation.f0(from = 0) int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f3485b) {
            z10 = true;
        }
        if (!z10) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + (this.f3485b - 1));
        }
        Object[] objArr = this.f3484a;
        E e10 = (E) objArr[i10];
        int i11 = this.f3485b;
        if (i10 != i11 - 1) {
            kotlin.collections.m.c1(objArr, objArr, i10, i10 + 1, i11);
        }
        int i12 = this.f3485b - 1;
        this.f3485b = i12;
        objArr[i12] = null;
        return e10;
    }

    public final void J0(@dl.d yh.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int i10 = this.f3485b;
        Object[] objArr = this.f3484a;
        int i11 = 0;
        fi.l lVarW1 = fi.u.W1(0, i10);
        int iH = lVarW1.h();
        int i12 = lVarW1.i();
        if (iH <= i12) {
            while (true) {
                objArr[iH - i11] = objArr[iH];
                if (predicate.invoke(objArr[iH]).booleanValue()) {
                    i11++;
                }
                if (iH == i12) {
                    break;
                } else {
                    iH++;
                }
            }
        }
        kotlin.collections.m.n2(objArr, null, i10 - i11, i10);
        this.f3485b -= i11;
    }

    public final void K0(@androidx.annotation.f0(from = 0) int i10, @androidx.annotation.f0(from = 0) int i11) {
        if (i10 >= 0 && i10 <= this.f3485b) {
            if (i11 >= 0 && i11 <= this.f3485b) {
                if (i11 < i10) {
                    throw new IllegalArgumentException("Start (" + i10 + ") is more than end (" + i11 + ')');
                }
                if (i11 != i10) {
                    int i12 = this.f3485b;
                    if (i11 < i12) {
                        Object[] objArr = this.f3484a;
                        kotlin.collections.m.c1(objArr, objArr, i10, i11, i12);
                    }
                    int i13 = this.f3485b;
                    int i14 = i13 - (i11 - i10);
                    kotlin.collections.m.n2(this.f3484a, null, i14, i13);
                    this.f3485b = i14;
                    return;
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException("Start (" + i10 + ") and end (" + i11 + ") must be in 0.." + this.f3485b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean L0(@dl.d ObjectList<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3485b;
        Object[] objArr = this.f3484a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.d(objArr[i11])) {
                I0(i11);
            }
        }
        return i10 != this.f3485b;
    }

    public final boolean M0(@dl.d Iterable<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3485b;
        Object[] objArr = this.f3484a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!CollectionsKt___CollectionsKt.R1(elements, objArr[i11])) {
                I0(i11);
            }
        }
        return i10 != this.f3485b;
    }

    public final boolean N0(@dl.d Collection<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3485b;
        Object[] objArr = this.f3484a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.contains(objArr[i11])) {
                I0(i11);
            }
        }
        return i10 != this.f3485b;
    }

    public final boolean O0(@dl.d kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3485b;
        Object[] objArr = this.f3484a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!SequencesKt___SequencesKt.f0(elements, objArr[i11])) {
                I0(i11);
            }
        }
        return i10 != this.f3485b;
    }

    public final boolean P0(@dl.d E[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3485b;
        Object[] objArr = this.f3484a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (ArraysKt___ArraysKt.jg(elements, objArr[i11]) < 0) {
                I0(i11);
            }
        }
        return i10 != this.f3485b;
    }

    public final E Q0(@androidx.annotation.f0(from = 0) int i10, E e10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f3485b) {
            z10 = true;
        }
        if (z10) {
            Object[] objArr = this.f3484a;
            E e11 = (E) objArr[i10];
            objArr[i10] = e10;
            return e11;
        }
        throw new IndexOutOfBoundsException("set index " + i10 + " must be between 0 .. " + (this.f3485b - 1));
    }

    public final void R0(int i10) {
        int iMax = Math.max(i10, this.f3485b);
        Object[] objArr = this.f3484a;
        if (objArr.length > iMax) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, iMax);
            kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f3484a = objArrCopyOf;
        }
    }

    public final void Y(@androidx.annotation.f0(from = 0) int i10, E e10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.f3485b) {
            z10 = true;
        }
        if (!z10) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f3485b);
        }
        l0(this.f3485b + 1);
        Object[] objArr = this.f3484a;
        int i11 = this.f3485b;
        if (i10 != i11) {
            kotlin.collections.m.c1(objArr, objArr, i10 + 1, i10, i11);
        }
        objArr[i10] = e10;
        this.f3485b++;
    }

    public final boolean Z(E e10) {
        l0(this.f3485b + 1);
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        objArr[i10] = e10;
        this.f3485b = i10 + 1;
        return true;
    }

    public final boolean a0(@androidx.annotation.f0(from = 0) int i10, @dl.d ObjectList<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (!(i10 >= 0 && i10 <= this.f3485b)) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f3485b);
        }
        if (elements.H()) {
            return false;
        }
        l0(this.f3485b + elements.f3485b);
        Object[] objArr = this.f3484a;
        int i11 = this.f3485b;
        if (i10 != i11) {
            kotlin.collections.m.c1(objArr, objArr, elements.f3485b + i10, i10, i11);
        }
        kotlin.collections.m.c1(elements.f3484a, objArr, i10, 0, elements.f3485b);
        this.f3485b += elements.f3485b;
        return true;
    }

    public final boolean b0(@androidx.annotation.f0(from = 0) int i10, @dl.d Collection<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i11 = 0;
        if (!(i10 >= 0 && i10 <= this.f3485b)) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f3485b);
        }
        if (elements.isEmpty()) {
            return false;
        }
        l0(this.f3485b + elements.size());
        Object[] objArr = this.f3484a;
        if (i10 != this.f3485b) {
            kotlin.collections.m.c1(objArr, objArr, elements.size() + i10, i10, this.f3485b);
        }
        for (Object obj : elements) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            objArr[i11 + i10] = obj;
            i11 = i12;
        }
        this.f3485b += elements.size();
        return true;
    }

    @Override // androidx.collection.ObjectList
    @dl.d
    public List<E> c() {
        return j0();
    }

    public final boolean c0(@androidx.annotation.f0(from = 0) int i10, @dl.d E[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (!(i10 >= 0 && i10 <= this.f3485b)) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f3485b);
        }
        if (elements.length == 0) {
            return false;
        }
        l0(this.f3485b + elements.length);
        Object[] objArr = this.f3484a;
        int i11 = this.f3485b;
        if (i10 != i11) {
            kotlin.collections.m.c1(objArr, objArr, elements.length + i10, i10, i11);
        }
        kotlin.collections.m.l1(elements, objArr, i10, 0, 0, 12, null);
        this.f3485b += elements.length;
        return true;
    }

    public final boolean d0(@dl.d ObjectList<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3485b;
        u0(elements);
        return i10 != this.f3485b;
    }

    public final boolean e0(@dl.d ScatterSet<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3485b;
        v0(elements);
        return i10 != this.f3485b;
    }

    public final boolean f0(@dl.d Iterable<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3485b;
        w0(elements);
        return i10 != this.f3485b;
    }

    public final boolean g0(@dl.d List<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3485b;
        y0(elements);
        return i10 != this.f3485b;
    }

    public final boolean h0(@dl.d kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3485b;
        z0(elements);
        return i10 != this.f3485b;
    }

    public final boolean i0(@dl.d E[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int i10 = this.f3485b;
        A0(elements);
        return i10 != this.f3485b;
    }

    @dl.d
    public final List<E> j0() {
        b<E> bVar = this.f3738c;
        if (bVar != null) {
            return bVar;
        }
        b<E> bVar2 = new b<>(this);
        this.f3738c = bVar2;
        return bVar2;
    }

    public final void k0() {
        kotlin.collections.m.n2(this.f3484a, null, 0, this.f3485b);
        this.f3485b = 0;
    }

    public final void l0(int i10) {
        Object[] objArr = this.f3484a;
        if (objArr.length < i10) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i10, (objArr.length * 3) / 2));
            kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f3484a = objArrCopyOf;
        }
    }

    public final int m0() {
        return this.f3484a.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n0(@dl.d ObjectList<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Object[] objArr = elements.f3484a;
        int i10 = elements.f3485b;
        for (int i11 = 0; i11 < i10; i11++) {
            B0(objArr[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(@dl.d ScatterSet<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Object[] objArr = elements.f3527b;
        long[] jArr = elements.f3526a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        B0(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void p0(@dl.d Iterable<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            B0(it.next());
        }
    }

    public final void q0(E e10) {
        B0(e10);
    }

    public final void r0(@dl.d List<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int size = elements.size();
        for (int i10 = 0; i10 < size; i10++) {
            B0(elements.get(i10));
        }
    }

    public final void s0(@dl.d kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            B0(it.next());
        }
    }

    public final void t0(@dl.d E[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        for (E e10 : elements) {
            B0(e10);
        }
    }

    public final void u0(@dl.d ObjectList<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (elements.H()) {
            return;
        }
        l0(this.f3485b + elements.f3485b);
        kotlin.collections.m.c1(elements.f3484a, this.f3484a, this.f3485b, 0, elements.f3485b);
        this.f3485b += elements.f3485b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0(@dl.d ScatterSet<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (elements.r()) {
            return;
        }
        l0(this.f3485b + elements.q());
        Object[] objArr = elements.f3527b;
        long[] jArr = elements.f3526a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        Z(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void w0(@dl.d Iterable<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            Z(it.next());
        }
    }

    public final void x0(E e10) {
        Z(e10);
    }

    public final void y0(@dl.d List<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i10 = this.f3485b;
        l0(elements.size() + i10);
        Object[] objArr = this.f3484a;
        int size = elements.size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11 + i10] = elements.get(i11);
        }
        this.f3485b += elements.size();
    }

    public final void z0(@dl.d kotlin.sequences.m<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            Z(it.next());
        }
    }
}
