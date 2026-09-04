package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class EnumMultiset<E extends Enum<E>> extends d<E> implements Serializable {

    @o9.c
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Class<E> f57202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient E[] f57203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int[] f57204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient int f57205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient long f57206h;

    public class a extends EnumMultiset<E>.c<E> {
        a() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.EnumMultiset.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public E a(int i10) {
            return (E) EnumMultiset.this.f57203e[i10];
        }
    }

    public class b extends EnumMultiset<E>.c<s1.a<E>> {

        public class a extends Multisets.f<E> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f57209b;

            a(int i10) {
                this.f57209b = i10;
            }

            @Override // com.google.common.collect.s1.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public E a() {
                return (E) EnumMultiset.this.f57203e[this.f57209b];
            }

            @Override // com.google.common.collect.s1.a
            public int getCount() {
                return EnumMultiset.this.f57204f[this.f57209b];
            }
        }

        b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.EnumMultiset.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s1.a<E> a(int i10) {
            return new a(i10);
        }
    }

    public abstract class c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f57211b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f57212c = -1;

        c() {
        }

        abstract T a(int i10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.f57211b < EnumMultiset.this.f57203e.length) {
                int[] iArr = EnumMultiset.this.f57204f;
                int i10 = this.f57211b;
                if (iArr[i10] > 0) {
                    return true;
                }
                this.f57211b = i10 + 1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tA = a(this.f57211b);
            int i10 = this.f57211b;
            this.f57212c = i10;
            this.f57211b = i10 + 1;
            return tA;
        }

        @Override // java.util.Iterator
        public void remove() {
            n.e(this.f57212c >= 0);
            if (EnumMultiset.this.f57204f[this.f57212c] > 0) {
                EnumMultiset.l(EnumMultiset.this);
                EnumMultiset enumMultiset = EnumMultiset.this;
                EnumMultiset.m(enumMultiset, enumMultiset.f57204f[this.f57212c]);
                EnumMultiset.this.f57204f[this.f57212c] = 0;
            }
            this.f57212c = -1;
        }
    }

    private EnumMultiset(Class<E> cls) {
        this.f57202d = cls;
        com.google.common.base.w.d(cls.isEnum());
        E[] enumConstants = cls.getEnumConstants();
        this.f57203e = enumConstants;
        this.f57204f = new int[enumConstants.length];
    }

    static /* synthetic */ int l(EnumMultiset enumMultiset) {
        int i10 = enumMultiset.f57205g;
        enumMultiset.f57205g = i10 - 1;
        return i10;
    }

    static /* synthetic */ long m(EnumMultiset enumMultiset, long j10) {
        long j11 = enumMultiset.f57206h - j10;
        enumMultiset.f57206h = j11;
        return j11;
    }

    private void q(Object obj) {
        com.google.common.base.w.E(obj);
        if (v(obj)) {
            return;
        }
        String strValueOf = String.valueOf(this.f57202d);
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 21 + strValueOf2.length());
        sb2.append("Expected an ");
        sb2.append(strValueOf);
        sb2.append(" but got ");
        sb2.append(strValueOf2);
        throw new ClassCastException(sb2.toString());
    }

    public static <E extends Enum<E>> EnumMultiset<E> s(Class<E> cls) {
        return new EnumMultiset<>(cls);
    }

    public static <E extends Enum<E>> EnumMultiset<E> t(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        com.google.common.base.w.e(it.hasNext(), "EnumMultiset constructor passed empty Iterable");
        EnumMultiset<E> enumMultiset = new EnumMultiset<>(it.next().getDeclaringClass());
        l1.a(enumMultiset, iterable);
        return enumMultiset;
    }

    public static <E extends Enum<E>> EnumMultiset<E> u(Iterable<E> iterable, Class<E> cls) {
        EnumMultiset<E> enumMultisetS = s(cls);
        l1.a(enumMultisetS, iterable);
        return enumMultisetS;
    }

    private boolean v(@CheckForNull Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r10 = (Enum) obj;
        int iOrdinal = r10.ordinal();
        E[] eArr = this.f57203e;
        return iOrdinal < eArr.length && eArr[iOrdinal] == r10;
    }

    @o9.c
    private void w(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Class<E> cls = (Class) objectInputStream.readObject();
        this.f57202d = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.f57203e = enumConstants;
        this.f57204f = new int[enumConstants.length];
        g2.f(this, objectInputStream);
    }

    @o9.c
    private void y(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f57202d);
        g2.k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.s1
    public int E1(@CheckForNull Object obj) {
        if (obj == null || !v(obj)) {
            return 0;
        }
        return this.f57204f[((Enum) obj).ordinal()];
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    public /* bridge */ /* synthetic */ Set c() {
        return super.c();
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.f57204f, 0);
        this.f57206h = 0L;
        this.f57205g = 0;
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.d
    int e() {
        return this.f57205g;
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.d
    Iterator<E> g() {
        return new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d, com.google.common.collect.s1
    @s9.a
    public /* bridge */ /* synthetic */ boolean g0(@x1 Object obj, int i10, int i11) {
        return super.g0(obj, i10, i11);
    }

    @Override // com.google.common.collect.d
    Iterator<s1.a<E>> h() {
        return new b();
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.s1
    public Iterator<E> iterator() {
        return Multisets.n(this);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    @s9.a
    public int n1(@CheckForNull Object obj, int i10) {
        if (obj == null || !v(obj)) {
            return 0;
        }
        Enum r10 = (Enum) obj;
        n.b(i10, "occurrences");
        if (i10 == 0) {
            return E1(obj);
        }
        int iOrdinal = r10.ordinal();
        int[] iArr = this.f57204f;
        int i11 = iArr[iOrdinal];
        if (i11 == 0) {
            return 0;
        }
        if (i11 <= i10) {
            iArr[iOrdinal] = 0;
            this.f57205g--;
            this.f57206h -= (long) i11;
        } else {
            iArr[iOrdinal] = i11 - i10;
            this.f57206h -= (long) i10;
        }
        return i11;
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    @s9.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int c0(E e10, int i10) {
        q(e10);
        n.b(i10, "occurrences");
        if (i10 == 0) {
            return E1(e10);
        }
        int iOrdinal = e10.ordinal();
        int i11 = this.f57204f[iOrdinal];
        long j10 = i10;
        long j11 = ((long) i11) + j10;
        com.google.common.base.w.p(j11 <= 2147483647L, "too many occurrences: %s", j11);
        this.f57204f[iOrdinal] = (int) j11;
        if (i11 == 0) {
            this.f57205g++;
        }
        this.f57206h += j10;
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
    public int size() {
        return Ints.x(this.f57206h);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    @s9.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int I0(E e10, int i10) {
        q(e10);
        n.b(i10, "count");
        int iOrdinal = e10.ordinal();
        int[] iArr = this.f57204f;
        int i11 = iArr[iOrdinal];
        iArr[iOrdinal] = i10;
        this.f57206h += (long) (i10 - i11);
        if (i11 == 0 && i10 > 0) {
            this.f57205g++;
        } else if (i11 > 0 && i10 == 0) {
            this.f57205g--;
        }
        return i11;
    }
}
