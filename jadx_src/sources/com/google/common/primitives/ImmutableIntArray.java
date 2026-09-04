package com.google.common.primitives;

import com.google.common.base.w;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import okhttp3.t;

/* JADX INFO: loaded from: classes7.dex */
@s9.j
@o9.a
@com.google.common.primitives.b
@o9.b
public final class ImmutableIntArray implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ImmutableIntArray f59035e = new ImmutableIntArray(new int[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f59036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f59037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f59038d;

    public static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableIntArray f59039b;

        private AsList(ImmutableIntArray immutableIntArray) {
            this.f59039b = immutableIntArray;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            return Integer.valueOf(this.f59039b.k(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof AsList) {
                return this.f59039b.equals(((AsList) obj).f59039b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i10 = this.f59039b.f59037c;
            for (Object obj2 : list) {
                if (obj2 instanceof Integer) {
                    int i11 = i10 + 1;
                    if (this.f59039b.f59036b[i10] == ((Integer) obj2).intValue()) {
                        i10 = i11;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f59039b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            if (obj instanceof Integer) {
                return this.f59039b.l(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            if (obj instanceof Integer) {
                return this.f59039b.o(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f59039b.p();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i10, int i11) {
            return this.f59039b.z(i10, i11).d();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f59039b.toString();
        }
    }

    @s9.a
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[] f59040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f59041b = 0;

        b(int i10) {
            this.f59040a = new int[i10];
        }

        private void g(int i10) {
            int i11 = this.f59041b + i10;
            int[] iArr = this.f59040a;
            if (i11 > iArr.length) {
                this.f59040a = Arrays.copyOf(iArr, h(iArr.length, i11));
            }
        }

        private static int h(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public b a(int i10) {
            g(1);
            int[] iArr = this.f59040a;
            int i11 = this.f59041b;
            iArr[i11] = i10;
            this.f59041b = i11 + 1;
            return this;
        }

        public b b(ImmutableIntArray immutableIntArray) {
            g(immutableIntArray.p());
            System.arraycopy(immutableIntArray.f59036b, immutableIntArray.f59037c, this.f59040a, this.f59041b, immutableIntArray.p());
            this.f59041b += immutableIntArray.p();
            return this;
        }

        public b c(Iterable<Integer> iterable) {
            if (iterable instanceof Collection) {
                return d((Collection) iterable);
            }
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next().intValue());
            }
            return this;
        }

        public b d(Collection<Integer> collection) {
            g(collection.size());
            for (Integer num : collection) {
                int[] iArr = this.f59040a;
                int i10 = this.f59041b;
                this.f59041b = i10 + 1;
                iArr[i10] = num.intValue();
            }
            return this;
        }

        public b e(int[] iArr) {
            g(iArr.length);
            System.arraycopy(iArr, 0, this.f59040a, this.f59041b, iArr.length);
            this.f59041b += iArr.length;
            return this;
        }

        @s9.b
        public ImmutableIntArray f() {
            return this.f59041b == 0 ? ImmutableIntArray.f59035e : new ImmutableIntArray(this.f59040a, 0, this.f59041b);
        }
    }

    private ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    private ImmutableIntArray(int[] iArr, int i10, int i11) {
        this.f59036b = iArr;
        this.f59037c = i10;
        this.f59038d = i11;
    }

    public static b e() {
        return new b(10);
    }

    public static b f(int i10) {
        w.k(i10 >= 0, "Invalid initialCapacity: %s", i10);
        return new b(i10);
    }

    public static ImmutableIntArray h(Iterable<Integer> iterable) {
        return iterable instanceof Collection ? i((Collection) iterable) : e().c(iterable).f();
    }

    public static ImmutableIntArray i(Collection<Integer> collection) {
        return collection.isEmpty() ? f59035e : new ImmutableIntArray(Ints.B(collection));
    }

    public static ImmutableIntArray j(int[] iArr) {
        return iArr.length == 0 ? f59035e : new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
    }

    private boolean n() {
        return this.f59037c > 0 || this.f59038d < this.f59036b.length;
    }

    public static ImmutableIntArray q() {
        return f59035e;
    }

    public static ImmutableIntArray r(int i10) {
        return new ImmutableIntArray(new int[]{i10});
    }

    public static ImmutableIntArray s(int i10, int i11) {
        return new ImmutableIntArray(new int[]{i10, i11});
    }

    public static ImmutableIntArray t(int i10, int i11, int i12) {
        return new ImmutableIntArray(new int[]{i10, i11, i12});
    }

    public static ImmutableIntArray u(int i10, int i11, int i12, int i13) {
        return new ImmutableIntArray(new int[]{i10, i11, i12, i13});
    }

    public static ImmutableIntArray v(int i10, int i11, int i12, int i13, int i14) {
        return new ImmutableIntArray(new int[]{i10, i11, i12, i13, i14});
    }

    public static ImmutableIntArray w(int i10, int i11, int i12, int i13, int i14, int i15) {
        return new ImmutableIntArray(new int[]{i10, i11, i12, i13, i14, i15});
    }

    public static ImmutableIntArray x(int i10, int... iArr) {
        w.e(iArr.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr2 = new int[iArr.length + 1];
        iArr2[0] = i10;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new ImmutableIntArray(iArr2);
    }

    public int[] A() {
        return Arrays.copyOfRange(this.f59036b, this.f59037c, this.f59038d);
    }

    public ImmutableIntArray B() {
        return n() ? new ImmutableIntArray(A()) : this;
    }

    Object C() {
        return B();
    }

    public List<Integer> d() {
        return new AsList();
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (p() != immutableIntArray.p()) {
            return false;
        }
        for (int i10 = 0; i10 < p(); i10++) {
            if (k(i10) != immutableIntArray.k(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean g(int i10) {
        return l(i10) >= 0;
    }

    public int hashCode() {
        int iL = 1;
        for (int i10 = this.f59037c; i10 < this.f59038d; i10++) {
            iL = (iL * 31) + Ints.l(this.f59036b[i10]);
        }
        return iL;
    }

    public int k(int i10) {
        w.C(i10, p());
        return this.f59036b[this.f59037c + i10];
    }

    public int l(int i10) {
        for (int i11 = this.f59037c; i11 < this.f59038d; i11++) {
            if (this.f59036b[i11] == i10) {
                return i11 - this.f59037c;
            }
        }
        return -1;
    }

    public boolean m() {
        return this.f59038d == this.f59037c;
    }

    public int o(int i10) {
        int i11;
        int i12 = this.f59038d;
        do {
            i12--;
            i11 = this.f59037c;
            if (i12 < i11) {
                return -1;
            }
        } while (this.f59036b[i12] != i10);
        return i12 - i11;
    }

    public int p() {
        return this.f59038d - this.f59037c;
    }

    public String toString() {
        if (m()) {
            return t.f132643o;
        }
        StringBuilder sb2 = new StringBuilder(p() * 5);
        sb2.append('[');
        sb2.append(this.f59036b[this.f59037c]);
        int i10 = this.f59037c;
        while (true) {
            i10++;
            if (i10 >= this.f59038d) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f59036b[i10]);
        }
    }

    Object y() {
        return m() ? f59035e : this;
    }

    public ImmutableIntArray z(int i10, int i11) {
        w.f0(i10, i11, p());
        if (i10 == i11) {
            return f59035e;
        }
        int[] iArr = this.f59036b;
        int i12 = this.f59037c;
        return new ImmutableIntArray(iArr, i10 + i12, i12 + i11);
    }
}
