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
public final class ImmutableLongArray implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ImmutableLongArray f59042e = new ImmutableLongArray(new long[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f59043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f59044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f59045d;

    public static class AsList extends AbstractList<Long> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableLongArray f59046b;

        private AsList(ImmutableLongArray immutableLongArray) {
            this.f59046b = immutableLongArray;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long get(int i10) {
            return Long.valueOf(this.f59046b.k(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof AsList) {
                return this.f59046b.equals(((AsList) obj).f59046b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i10 = this.f59046b.f59044c;
            for (Object obj2 : list) {
                if (obj2 instanceof Long) {
                    int i11 = i10 + 1;
                    if (this.f59046b.f59043b[i10] == ((Long) obj2).longValue()) {
                        i10 = i11;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f59046b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            if (obj instanceof Long) {
                return this.f59046b.l(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            if (obj instanceof Long) {
                return this.f59046b.o(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f59046b.p();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i10, int i11) {
            return this.f59046b.z(i10, i11).d();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f59046b.toString();
        }
    }

    @s9.a
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long[] f59047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f59048b = 0;

        b(int i10) {
            this.f59047a = new long[i10];
        }

        private void g(int i10) {
            int i11 = this.f59048b + i10;
            long[] jArr = this.f59047a;
            if (i11 > jArr.length) {
                this.f59047a = Arrays.copyOf(jArr, h(jArr.length, i11));
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

        public b a(long j10) {
            g(1);
            long[] jArr = this.f59047a;
            int i10 = this.f59048b;
            jArr[i10] = j10;
            this.f59048b = i10 + 1;
            return this;
        }

        public b b(ImmutableLongArray immutableLongArray) {
            g(immutableLongArray.p());
            System.arraycopy(immutableLongArray.f59043b, immutableLongArray.f59044c, this.f59047a, this.f59048b, immutableLongArray.p());
            this.f59048b += immutableLongArray.p();
            return this;
        }

        public b c(Iterable<Long> iterable) {
            if (iterable instanceof Collection) {
                return d((Collection) iterable);
            }
            Iterator<Long> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next().longValue());
            }
            return this;
        }

        public b d(Collection<Long> collection) {
            g(collection.size());
            for (Long l10 : collection) {
                long[] jArr = this.f59047a;
                int i10 = this.f59048b;
                this.f59048b = i10 + 1;
                jArr[i10] = l10.longValue();
            }
            return this;
        }

        public b e(long[] jArr) {
            g(jArr.length);
            System.arraycopy(jArr, 0, this.f59047a, this.f59048b, jArr.length);
            this.f59048b += jArr.length;
            return this;
        }

        @s9.b
        public ImmutableLongArray f() {
            return this.f59048b == 0 ? ImmutableLongArray.f59042e : new ImmutableLongArray(this.f59047a, 0, this.f59048b);
        }
    }

    private ImmutableLongArray(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    private ImmutableLongArray(long[] jArr, int i10, int i11) {
        this.f59043b = jArr;
        this.f59044c = i10;
        this.f59045d = i11;
    }

    public static b e() {
        return new b(10);
    }

    public static b f(int i10) {
        w.k(i10 >= 0, "Invalid initialCapacity: %s", i10);
        return new b(i10);
    }

    public static ImmutableLongArray h(Iterable<Long> iterable) {
        return iterable instanceof Collection ? i((Collection) iterable) : e().c(iterable).f();
    }

    public static ImmutableLongArray i(Collection<Long> collection) {
        return collection.isEmpty() ? f59042e : new ImmutableLongArray(Longs.z(collection));
    }

    public static ImmutableLongArray j(long[] jArr) {
        return jArr.length == 0 ? f59042e : new ImmutableLongArray(Arrays.copyOf(jArr, jArr.length));
    }

    private boolean n() {
        return this.f59044c > 0 || this.f59045d < this.f59043b.length;
    }

    public static ImmutableLongArray q() {
        return f59042e;
    }

    public static ImmutableLongArray r(long j10) {
        return new ImmutableLongArray(new long[]{j10});
    }

    public static ImmutableLongArray s(long j10, long j11) {
        return new ImmutableLongArray(new long[]{j10, j11});
    }

    public static ImmutableLongArray t(long j10, long j11, long j12) {
        return new ImmutableLongArray(new long[]{j10, j11, j12});
    }

    public static ImmutableLongArray u(long j10, long j11, long j12, long j13) {
        return new ImmutableLongArray(new long[]{j10, j11, j12, j13});
    }

    public static ImmutableLongArray v(long j10, long j11, long j12, long j13, long j14) {
        return new ImmutableLongArray(new long[]{j10, j11, j12, j13, j14});
    }

    public static ImmutableLongArray w(long j10, long j11, long j12, long j13, long j14, long j15) {
        return new ImmutableLongArray(new long[]{j10, j11, j12, j13, j14, j15});
    }

    public static ImmutableLongArray x(long j10, long... jArr) {
        w.e(jArr.length <= 2147483646, "the total number of elements must fit in an int");
        long[] jArr2 = new long[jArr.length + 1];
        jArr2[0] = j10;
        System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        return new ImmutableLongArray(jArr2);
    }

    public long[] A() {
        return Arrays.copyOfRange(this.f59043b, this.f59044c, this.f59045d);
    }

    public ImmutableLongArray B() {
        return n() ? new ImmutableLongArray(A()) : this;
    }

    Object C() {
        return B();
    }

    public List<Long> d() {
        return new AsList();
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableLongArray)) {
            return false;
        }
        ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
        if (p() != immutableLongArray.p()) {
            return false;
        }
        for (int i10 = 0; i10 < p(); i10++) {
            if (k(i10) != immutableLongArray.k(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean g(long j10) {
        return l(j10) >= 0;
    }

    public int hashCode() {
        int iK = 1;
        for (int i10 = this.f59044c; i10 < this.f59045d; i10++) {
            iK = (iK * 31) + Longs.k(this.f59043b[i10]);
        }
        return iK;
    }

    public long k(int i10) {
        w.C(i10, p());
        return this.f59043b[this.f59044c + i10];
    }

    public int l(long j10) {
        for (int i10 = this.f59044c; i10 < this.f59045d; i10++) {
            if (this.f59043b[i10] == j10) {
                return i10 - this.f59044c;
            }
        }
        return -1;
    }

    public boolean m() {
        return this.f59045d == this.f59044c;
    }

    public int o(long j10) {
        int i10;
        int i11 = this.f59045d;
        do {
            i11--;
            i10 = this.f59044c;
            if (i11 < i10) {
                return -1;
            }
        } while (this.f59043b[i11] != j10);
        return i11 - i10;
    }

    public int p() {
        return this.f59045d - this.f59044c;
    }

    public String toString() {
        if (m()) {
            return t.f132643o;
        }
        StringBuilder sb2 = new StringBuilder(p() * 5);
        sb2.append('[');
        sb2.append(this.f59043b[this.f59044c]);
        int i10 = this.f59044c;
        while (true) {
            i10++;
            if (i10 >= this.f59045d) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f59043b[i10]);
        }
    }

    Object y() {
        return m() ? f59042e : this;
    }

    public ImmutableLongArray z(int i10, int i11) {
        w.f0(i10, i11, p());
        if (i10 == i11) {
            return f59042e;
        }
        long[] jArr = this.f59043b;
        int i12 = this.f59044c;
        return new ImmutableLongArray(jArr, i10 + i12, i12 + i11);
    }
}
