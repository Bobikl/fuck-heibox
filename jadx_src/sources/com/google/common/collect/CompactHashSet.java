package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public class CompactHashSet<E> extends AbstractSet<E> implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @o9.d
    static final double f57131g = 0.001d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f57132h = 9;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private transient Object f57133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private transient int[] f57134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    @o9.d
    transient Object[] f57135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f57136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f57137f;

    public class a implements Iterator<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f57138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f57139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f57140d = -1;

        a() {
            this.f57138b = CompactHashSet.this.f57136e;
            this.f57139c = CompactHashSet.this.u();
        }

        private void a() {
            if (CompactHashSet.this.f57136e != this.f57138b) {
                throw new ConcurrentModificationException();
            }
        }

        void b() {
            this.f57138b += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57139c >= 0;
        }

        @Override // java.util.Iterator
        @x1
        public E next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f57139c;
            this.f57140d = i10;
            E e10 = (E) CompactHashSet.this.s(i10);
            this.f57139c = CompactHashSet.this.v(this.f57139c);
            return e10;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            n.e(this.f57140d >= 0);
            b();
            CompactHashSet compactHashSet = CompactHashSet.this;
            compactHashSet.remove(compactHashSet.s(this.f57140d));
            this.f57139c = CompactHashSet.this.e(this.f57139c, this.f57140d);
            this.f57140d = -1;
        }
    }

    CompactHashSet() {
        y(3);
    }

    CompactHashSet(int i10) {
        y(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void F(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid size: ");
            sb2.append(i10);
            throw new InvalidObjectException(sb2.toString());
        }
        y(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            add(objectInputStream.readObject());
        }
    }

    private Object[] G() {
        Object[] objArr = this.f57135d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private int[] H() {
        int[] iArr = this.f57134c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private Object I() {
        Object obj = this.f57133b;
        Objects.requireNonNull(obj);
        return obj;
    }

    private void L(int i10) {
        int iMin;
        int length = H().length;
        if (i10 <= length || (iMin = Math.min(kotlinx.coroutines.internal.z.f130219j, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        J(iMin);
    }

    @s9.a
    private int N(int i10, int i11, int i12, int i13) {
        Object objA = p.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            p.i(objA, i12 & i14, i13 + 1);
        }
        Object objI = I();
        int[] iArrH = H();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = p.h(objI, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrH[i16];
                int iB = p.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = p.h(objA, i18);
                p.i(objA, i18, iH);
                iArrH[i16] = p.d(iB, iH2, i14);
                iH = p.c(i17, i10);
            }
        }
        this.f57133b = objA;
        S(i14);
        return i14;
    }

    private void Q(int i10, E e10) {
        G()[i10] = e10;
    }

    private void R(int i10, int i11) {
        H()[i10] = i11;
    }

    private void S(int i10) {
        this.f57136e = p.d(this.f57136e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    private void U(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public static <E> CompactHashSet<E> i() {
        return new CompactHashSet<>();
    }

    public static <E> CompactHashSet<E> j(Collection<? extends E> collection) {
        CompactHashSet<E> compactHashSetO = o(collection.size());
        compactHashSetO.addAll(collection);
        return compactHashSetO;
    }

    @SafeVarargs
    public static <E> CompactHashSet<E> l(E... eArr) {
        CompactHashSet<E> compactHashSetO = o(eArr.length);
        Collections.addAll(compactHashSetO, eArr);
        return compactHashSetO;
    }

    private Set<E> m(int i10) {
        return new LinkedHashSet(i10, 1.0f);
    }

    public static <E> CompactHashSet<E> o(int i10) {
        return new CompactHashSet<>(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E s(int i10) {
        return (E) G()[i10];
    }

    private int t(int i10) {
        return H()[i10];
    }

    private int w() {
        return (1 << (this.f57136e & 31)) - 1;
    }

    void A(int i10, @x1 E e10, int i11, int i12) {
        R(i10, p.d(i11, 0, i12));
        Q(i10, e10);
    }

    @o9.d
    boolean B() {
        return q() != null;
    }

    void D(int i10, int i11) {
        Object objI = I();
        int[] iArrH = H();
        Object[] objArrG = G();
        int size = size() - 1;
        if (i10 >= size) {
            objArrG[i10] = null;
            iArrH[i10] = 0;
            return;
        }
        Object obj = objArrG[size];
        objArrG[i10] = obj;
        objArrG[size] = null;
        iArrH[i10] = iArrH[size];
        iArrH[size] = 0;
        int iD = i1.d(obj) & i11;
        int iH = p.h(objI, iD);
        int i12 = size + 1;
        if (iH == i12) {
            p.i(objI, iD, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iH - 1;
            int i14 = iArrH[i13];
            int iC = p.c(i14, i11);
            if (iC == i12) {
                iArrH[i13] = p.d(i14, i10 + 1, i11);
                return;
            }
            iH = iC;
        }
    }

    @o9.d
    boolean E() {
        return this.f57133b == null;
    }

    void J(int i10) {
        this.f57134c = Arrays.copyOf(H(), i10);
        this.f57135d = Arrays.copyOf(G(), i10);
    }

    public void T() {
        if (E()) {
            return;
        }
        Set<E> setQ = q();
        if (setQ != null) {
            Set<E> setM = m(size());
            setM.addAll(setQ);
            this.f57133b = setM;
            return;
        }
        int i10 = this.f57137f;
        if (i10 < H().length) {
            J(i10);
        }
        int iJ = p.j(i10);
        int iW = w();
        if (iJ < iW) {
            N(iW, iJ, 0, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @s9.a
    public boolean add(@x1 E e10) {
        if (E()) {
            g();
        }
        Set<E> setQ = q();
        if (setQ != null) {
            return setQ.add(e10);
        }
        int[] iArrH = H();
        Object[] objArrG = G();
        int i10 = this.f57137f;
        int i11 = i10 + 1;
        int iD = i1.d(e10);
        int iW = w();
        int i12 = iD & iW;
        int iH = p.h(I(), i12);
        if (iH != 0) {
            int iB = p.b(iD, iW);
            int i13 = 0;
            while (true) {
                int i14 = iH - 1;
                int i15 = iArrH[i14];
                if (p.b(i15, iW) == iB && com.google.common.base.s.a(e10, objArrG[i14])) {
                    return false;
                }
                int iC = p.c(i15, iW);
                i13++;
                if (iC != 0) {
                    iH = iC;
                } else {
                    if (i13 >= 9) {
                        return h().add(e10);
                    }
                    if (i11 > iW) {
                        iW = N(iW, p.e(iW), iD, i10);
                    } else {
                        iArrH[i14] = p.d(i15, i11, iW);
                    }
                }
            }
        } else if (i11 > iW) {
            iW = N(iW, p.e(iW), iD, i10);
        } else {
            p.i(I(), i12, i11);
        }
        L(i11);
        A(i10, e10, iD, iW);
        this.f57137f = i11;
        x();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (E()) {
            return;
        }
        x();
        Set<E> setQ = q();
        if (setQ != null) {
            this.f57136e = Ints.g(size(), 3, kotlinx.coroutines.internal.z.f130219j);
            setQ.clear();
            this.f57133b = null;
            this.f57137f = 0;
            return;
        }
        Arrays.fill(G(), 0, this.f57137f, (Object) null);
        p.g(I());
        Arrays.fill(H(), 0, this.f57137f, 0);
        this.f57137f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (E()) {
            return false;
        }
        Set<E> setQ = q();
        if (setQ != null) {
            return setQ.contains(obj);
        }
        int iD = i1.d(obj);
        int iW = w();
        int iH = p.h(I(), iD & iW);
        if (iH == 0) {
            return false;
        }
        int iB = p.b(iD, iW);
        do {
            int i10 = iH - 1;
            int iT = t(i10);
            if (p.b(iT, iW) == iB && com.google.common.base.s.a(obj, s(i10))) {
                return true;
            }
            iH = p.c(iT, iW);
        } while (iH != 0);
        return false;
    }

    int e(int i10, int i11) {
        return i10 - 1;
    }

    @s9.a
    int g() {
        com.google.common.base.w.h0(E(), "Arrays already allocated");
        int i10 = this.f57136e;
        int iJ = p.j(i10);
        this.f57133b = p.a(iJ);
        S(iJ - 1);
        this.f57134c = new int[i10];
        this.f57135d = new Object[i10];
        return i10;
    }

    @s9.a
    @o9.d
    Set<E> h() {
        Set<E> setM = m(w() + 1);
        int iU = u();
        while (iU >= 0) {
            setM.add(s(iU));
            iU = v(iU);
        }
        this.f57133b = setM;
        this.f57134c = null;
        this.f57135d = null;
        x();
        return setM;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> setQ = q();
        return setQ != null ? setQ.iterator() : new a();
    }

    @CheckForNull
    @o9.d
    Set<E> q() {
        Object obj = this.f57133b;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @s9.a
    public boolean remove(@CheckForNull Object obj) {
        if (E()) {
            return false;
        }
        Set<E> setQ = q();
        if (setQ != null) {
            return setQ.remove(obj);
        }
        int iW = w();
        int iF = p.f(obj, null, iW, I(), H(), G(), null);
        if (iF == -1) {
            return false;
        }
        D(iF, iW);
        this.f57137f--;
        x();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> setQ = q();
        return setQ != null ? setQ.size() : this.f57137f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (E()) {
            return new Object[0];
        }
        Set<E> setQ = q();
        return setQ != null ? setQ.toArray() : Arrays.copyOf(G(), this.f57137f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @s9.a
    public <T> T[] toArray(T[] tArr) {
        if (!E()) {
            Set<E> setQ = q();
            return setQ != null ? (T[]) setQ.toArray(tArr) : (T[]) u1.n(G(), 0, this.f57137f, tArr);
        }
        if (tArr.length > 0) {
            tArr[0] = null;
        }
        return tArr;
    }

    int u() {
        return isEmpty() ? -1 : 0;
    }

    int v(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f57137f) {
            return i11;
        }
        return -1;
    }

    void x() {
        this.f57136e += 32;
    }

    void y(int i10) {
        com.google.common.base.w.e(i10 >= 0, "Expected size must be >= 0");
        this.f57136e = Ints.g(i10, 1, kotlinx.coroutines.internal.z.f130219j);
    }
}
