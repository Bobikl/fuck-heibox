package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.collect.MapMakerInternalMap.i;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.c
public class MapMakerInternalMap<K, V, E extends i<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f57551k = 1073741824;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f57552l = 65536;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f57553m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f57554n = 63;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f57555o = 16;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final long f57556p = 60;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final x<Object, Object, e> f57557q = new a();
    private static final long serialVersionUID = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final transient int f57558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient int f57559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Segment<K, V, E, S>[] f57560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f57561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Equivalence<Object> f57562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final transient j<K, V, E, S> f57563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @CheckForNull
    transient Set<K> f57564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @CheckForNull
    transient Collection<V> f57565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @CheckForNull
    transient Set<Map.Entry<K, V>> f57566j;

    public static abstract class AbstractSerializationProxy<K, V> extends i0<K, V> implements Serializable {
        private static final long serialVersionUID = 3;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Strength f57567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Strength f57568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Equivalence<Object> f57569d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Equivalence<Object> f57570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f57571f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        transient ConcurrentMap<K, V> f57572g;

        AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i10, ConcurrentMap<K, V> concurrentMap) {
            this.f57567b = strength;
            this.f57568c = strength2;
            this.f57569d = equivalence;
            this.f57570e = equivalence2;
            this.f57571f = i10;
            this.f57572g = concurrentMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.i0, com.google.common.collect.s0
        /* JADX INFO: renamed from: V0 */
        public ConcurrentMap<K, V> H0() {
            return this.f57572g;
        }

        void W0(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                }
                this.f57572g.put((K) object, (V) objectInputStream.readObject());
            }
        }

        MapMaker X0(ObjectInputStream objectInputStream) throws IOException {
            return new MapMaker().g(objectInputStream.readInt()).j(this.f57567b).k(this.f57568c).h(this.f57569d).a(this.f57571f);
        }

        void Z0(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.f57572g.size());
            for (Map.Entry<K, V> entry : this.f57572g.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    public static abstract class Segment<K, V, E extends i<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @u9.g
        final MapMakerInternalMap<K, V, E, S> f57573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile int f57574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f57575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f57576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @CheckForNull
        volatile AtomicReferenceArray<E> f57577f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f57578g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicInteger f57579h = new AtomicInteger();

        Segment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i10, int i11) {
            this.f57573b = mapMakerInternalMap;
            this.f57578g = i11;
            t(x(i10));
        }

        static <K, V, E extends i<K, V, E>> boolean u(E e10) {
            return e10.getValue() == null;
        }

        void A() {
            if ((this.f57579h.incrementAndGet() & 63) == 0) {
                N();
            }
        }

        @t9.a("this")
        void B() {
            O();
        }

        V C(K k10, int i10, V v10, boolean z10) {
            lock();
            try {
                B();
                int i11 = this.f57574c + 1;
                if (i11 > this.f57576e) {
                    j();
                    i11 = this.f57574c + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f57577f;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (i next = e10; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f57573b.f57562f.d(k10, key)) {
                        V v11 = (V) next.getValue();
                        if (v11 == null) {
                            this.f57575d++;
                            R(next, v10);
                            this.f57574c = this.f57574c;
                            return null;
                        }
                        if (z10) {
                            return v11;
                        }
                        this.f57575d++;
                        R(next, v10);
                        return v11;
                    }
                }
                this.f57575d++;
                i iVarE = this.f57573b.f57563g.e(P(), k10, i10, e10);
                R(iVarE, v10);
                atomicReferenceArray.set(length, (E) iVarE);
                this.f57574c = i11;
                return null;
            } finally {
                unlock();
            }
        }

        @s9.a
        boolean D(E e10, int i10) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f57577f;
                int length = i10 & (atomicReferenceArray.length() - 1);
                E e11 = atomicReferenceArray.get(length);
                for (i next = e11; next != null; next = next.getNext()) {
                    if (next == e10) {
                        this.f57575d++;
                        i iVarI = I(e11, next);
                        int i11 = this.f57574c - 1;
                        atomicReferenceArray.set(length, (E) iVarI);
                        this.f57574c = i11;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        @s9.a
        boolean E(K k10, int i10, x<K, V, E> xVar) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f57577f;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (i next = e10; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f57573b.f57562f.d(k10, key)) {
                        if (((w) next).getValueReference() != xVar) {
                            return false;
                        }
                        this.f57575d++;
                        i iVarI = I(e10, next);
                        int i11 = this.f57574c - 1;
                        atomicReferenceArray.set(length, (E) iVarI);
                        this.f57574c = i11;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        @s9.a
        V F(Object obj, int i10) {
            lock();
            try {
                B();
                AtomicReferenceArray<E> atomicReferenceArray = this.f57577f;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (i next = e10; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f57573b.f57562f.d(obj, key)) {
                        V v10 = (V) next.getValue();
                        if (v10 == null && !u(next)) {
                            return null;
                        }
                        this.f57575d++;
                        i iVarI = I(e10, next);
                        int i11 = this.f57574c - 1;
                        atomicReferenceArray.set(length, (E) iVarI);
                        this.f57574c = i11;
                        return v10;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        boolean G(Object obj, int i10, Object obj2) {
            lock();
            try {
                B();
                AtomicReferenceArray<E> atomicReferenceArray = this.f57577f;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                i next = e10;
                while (true) {
                    boolean z10 = false;
                    if (next == null) {
                        return false;
                    }
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f57573b.f57562f.d(obj, key)) {
                        if (this.f57573b.w().d(obj2, next.getValue())) {
                            z10 = true;
                        } else if (!u(next)) {
                            return false;
                        }
                        this.f57575d++;
                        i iVarI = I(e10, next);
                        int i11 = this.f57574c - 1;
                        atomicReferenceArray.set(length, (E) iVarI);
                        this.f57574c = i11;
                        return z10;
                    }
                    next = next.getNext();
                }
            } finally {
                unlock();
            }
        }

        @t9.a("this")
        boolean H(E e10) {
            int hash = e10.getHash();
            AtomicReferenceArray<E> atomicReferenceArray = this.f57577f;
            int length = hash & (atomicReferenceArray.length() - 1);
            E e11 = atomicReferenceArray.get(length);
            for (i next = e11; next != null; next = next.getNext()) {
                if (next == e10) {
                    this.f57575d++;
                    i iVarI = I(e11, next);
                    int i10 = this.f57574c - 1;
                    atomicReferenceArray.set(length, (E) iVarI);
                    this.f57574c = i10;
                    return true;
                }
            }
            return false;
        }

        @t9.a("this")
        E I(E e10, E e11) {
            int i10 = this.f57574c;
            E e12 = (E) e11.getNext();
            while (e10 != e11) {
                i iVarF = f(e10, e12);
                if (iVarF != null) {
                    e12 = (E) iVarF;
                } else {
                    i10--;
                }
                e10 = (E) e10.getNext();
            }
            this.f57574c = i10;
            return e12;
        }

        E J(i<K, V, ?> iVar, i<K, V, ?> iVar2) {
            return (E) I(a(iVar), a(iVar2));
        }

        @s9.a
        boolean K(i<K, V, ?> iVar) {
            return H(a(iVar));
        }

        V L(K k10, int i10, V v10) {
            lock();
            try {
                B();
                AtomicReferenceArray<E> atomicReferenceArray = this.f57577f;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (i next = e10; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f57573b.f57562f.d(k10, key)) {
                        V v11 = (V) next.getValue();
                        if (v11 != null) {
                            this.f57575d++;
                            R(next, v10);
                            return v11;
                        }
                        if (u(next)) {
                            this.f57575d++;
                            i iVarI = I(e10, next);
                            int i11 = this.f57574c - 1;
                            atomicReferenceArray.set(length, (E) iVarI);
                            this.f57574c = i11;
                        }
                        return null;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        boolean M(K k10, int i10, V v10, V v11) {
            lock();
            try {
                B();
                AtomicReferenceArray<E> atomicReferenceArray = this.f57577f;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (i next = e10; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f57573b.f57562f.d(k10, key)) {
                        Object value = next.getValue();
                        if (value != null) {
                            if (!this.f57573b.w().d(v10, value)) {
                                return false;
                            }
                            this.f57575d++;
                            R(next, v11);
                            return true;
                        }
                        if (u(next)) {
                            this.f57575d++;
                            i iVarI = I(e10, next);
                            int i11 = this.f57574c - 1;
                            atomicReferenceArray.set(length, (E) iVarI);
                            this.f57574c = i11;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        void N() {
            O();
        }

        void O() {
            if (tryLock()) {
                try {
                    w();
                    this.f57579h.set(0);
                } finally {
                    unlock();
                }
            }
        }

        abstract S P();

        void Q(int i10, i<K, V, ?> iVar) {
            this.f57577f.set(i10, (E) a(iVar));
        }

        void R(E e10, V v10) {
            this.f57573b.f57563g.a(P(), e10, v10);
        }

        void S(i<K, V, ?> iVar, V v10) {
            this.f57573b.f57563g.a(P(), a(iVar), v10);
        }

        void T(i<K, V, ?> iVar, x<K, V, ? extends i<K, V, ?>> xVar) {
            throw new AssertionError();
        }

        void U() {
            if (tryLock()) {
                try {
                    w();
                } finally {
                    unlock();
                }
            }
        }

        abstract E a(i<K, V, ?> iVar);

        <T> void b(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        @s9.a
        boolean c(K k10, int i10, x<K, V, ? extends i<K, V, ?>> xVar) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f57577f;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (i next = e10; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i10 && key != null && this.f57573b.f57562f.d(k10, key)) {
                        if (((w) next).getValueReference() != xVar) {
                            return false;
                        }
                        atomicReferenceArray.set(length, (E) I(e10, next));
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        void clear() {
            if (this.f57574c != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f57577f;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    v();
                    this.f57579h.set(0);
                    this.f57575d++;
                    this.f57574c = 0;
                } finally {
                    unlock();
                }
            }
        }

        boolean d(Object obj, int i10) {
            try {
                boolean z10 = false;
                if (this.f57574c == 0) {
                    return false;
                }
                i iVarO = o(obj, i10);
                if (iVarO != null && iVarO.getValue() != null) {
                    z10 = true;
                }
                return z10;
            } finally {
                A();
            }
        }

        @o9.d
        boolean e(Object obj) {
            try {
                if (this.f57574c != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f57577f;
                    int length = atomicReferenceArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        for (E next = atomicReferenceArray.get(i10); next != null; next = next.getNext()) {
                            V vP = p(next);
                            if (vP != null && this.f57573b.w().d(obj, vP)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                A();
            }
        }

        E f(E e10, E e11) {
            return (E) this.f57573b.f57563g.c(P(), e10, e11);
        }

        E g(i<K, V, ?> iVar, @CheckForNull i<K, V, ?> iVar2) {
            return (E) this.f57573b.f57563g.c(P(), a(iVar), a(iVar2));
        }

        @t9.a("this")
        void h(ReferenceQueue<K> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f57573b.l((i) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        @t9.a("this")
        void i(ReferenceQueue<V> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f57573b.n((x) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        @t9.a("this")
        void j() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f57577f;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.f57574c;
            AtomicReferenceArray<E> atomicReferenceArrayX = x(length << 1);
            this.f57576e = (atomicReferenceArrayX.length() * 3) / 4;
            int length2 = atomicReferenceArrayX.length() - 1;
            for (int i11 = 0; i11 < length; i11++) {
                E next = atomicReferenceArray.get(i11);
                if (next != null) {
                    i next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayX.set(hash, next);
                    } else {
                        i iVar = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                iVar = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayX.set(hash, iVar);
                        while (next != iVar) {
                            int hash3 = next.getHash() & length2;
                            i iVarF = f(next, (i) atomicReferenceArrayX.get(hash3));
                            if (iVarF != null) {
                                atomicReferenceArrayX.set(hash3, iVarF);
                            } else {
                                i10--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.f57577f = atomicReferenceArrayX;
            this.f57574c = i10;
        }

        V k(Object obj, int i10) {
            try {
                i iVarO = o(obj, i10);
                if (iVarO == null) {
                    return null;
                }
                V v10 = (V) iVarO.getValue();
                if (v10 == null) {
                    U();
                }
                return v10;
            } finally {
                A();
            }
        }

        E l(Object obj, int i10) {
            if (this.f57574c == 0) {
                return null;
            }
            for (E e10 = (E) m(i10); e10 != null; e10 = (E) e10.getNext()) {
                if (e10.getHash() == i10) {
                    Object key = e10.getKey();
                    if (key == null) {
                        U();
                    } else if (this.f57573b.f57562f.d(obj, key)) {
                        return e10;
                    }
                }
            }
            return null;
        }

        E m(int i10) {
            AtomicReferenceArray<E> atomicReferenceArray = this.f57577f;
            return atomicReferenceArray.get(i10 & (atomicReferenceArray.length() - 1));
        }

        ReferenceQueue<K> n() {
            throw new AssertionError();
        }

        E o(Object obj, int i10) {
            return (E) l(obj, i10);
        }

        @CheckForNull
        V p(E e10) {
            if (e10.getKey() == null) {
                U();
                return null;
            }
            V v10 = (V) e10.getValue();
            if (v10 != null) {
                return v10;
            }
            U();
            return null;
        }

        @CheckForNull
        V q(i<K, V, ?> iVar) {
            return p(a(iVar));
        }

        ReferenceQueue<V> r() {
            throw new AssertionError();
        }

        x<K, V, E> s(i<K, V, ?> iVar) {
            throw new AssertionError();
        }

        void t(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f57576e = length;
            if (length == this.f57578g) {
                this.f57576e = length + 1;
            }
            this.f57577f = atomicReferenceArray;
        }

        void v() {
        }

        @t9.a("this")
        void w() {
        }

        AtomicReferenceArray<E> x(int i10) {
            return new AtomicReferenceArray<>(i10);
        }

        E y(K k10, int i10, @CheckForNull i<K, V, ?> iVar) {
            return (E) this.f57573b.f57563g.e(P(), k10, i10, a(iVar));
        }

        x<K, V, E> z(i<K, V, ?> iVar, V v10) {
            throw new AssertionError();
        }
    }

    public static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        SerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i10, ConcurrentMap<K, V> concurrentMap) {
            super(strength, strength2, equivalence, equivalence2, i10, concurrentMap);
        }

        private void a1(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f57572g = X0(objectInputStream).i();
            W0(objectInputStream);
        }

        private Object b1() {
            return this.f57572g;
        }

        private void c1(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            Z0(objectOutputStream);
        }
    }

    public enum Strength {
        STRONG { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            Equivalence<Object> defaultEquivalence() {
                return Equivalence.c();
            }
        },
        WEAK { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            Equivalence<Object> defaultEquivalence() {
                return Equivalence.g();
            }
        };

        /* synthetic */ Strength(a aVar) {
            this();
        }

        abstract Equivalence<Object> defaultEquivalence();
    }

    public static final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, n<K>, StrongKeyDummyValueSegment<K>> {
        StrongKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, n<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i10, int i11) {
            super(mapMakerInternalMap, i10, i11);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public n<K> a(i<K, MapMaker.Dummy, ?> iVar) {
            return (n) iVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public StrongKeyDummyValueSegment<K> P() {
            return this;
        }
    }

    public static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, o<K, V>, StrongKeyStrongValueSegment<K, V>> {
        StrongKeyStrongValueSegment(MapMakerInternalMap<K, V, o<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i10, int i11) {
            super(mapMakerInternalMap, i10, i11);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public o<K, V> a(i<K, V, ?> iVar) {
            return (o) iVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public StrongKeyStrongValueSegment<K, V> P() {
            return this;
        }
    }

    public static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, p<K, V>, StrongKeyWeakValueSegment<K, V>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ReferenceQueue<V> f57580i;

        StrongKeyWeakValueSegment(MapMakerInternalMap<K, V, p<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i10, int i11) {
            super(mapMakerInternalMap, i10, i11);
            this.f57580i = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void T(i<K, V, ?> iVar, x<K, V, ? extends i<K, V, ?>> xVar) {
            p<K, V> pVarA = a(iVar);
            x xVar2 = ((p) pVarA).f57604e;
            ((p) pVarA).f57604e = xVar;
            xVar2.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public p<K, V> a(i<K, V, ?> iVar) {
            return (p) iVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public StrongKeyWeakValueSegment<K, V> P() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        ReferenceQueue<V> r() {
            return this.f57580i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public x<K, V, p<K, V>> s(i<K, V, ?> iVar) {
            return a(iVar).getValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void v() {
            b(this.f57580i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void w() {
            i(this.f57580i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public x<K, V, p<K, V>> z(i<K, V, ?> iVar, V v10) {
            return new y(this.f57580i, v10, a(iVar));
        }
    }

    public static final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, t<K>, WeakKeyDummyValueSegment<K>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ReferenceQueue<K> f57581i;

        WeakKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, t<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i10, int i11) {
            super(mapMakerInternalMap, i10, i11);
            this.f57581i = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public t<K> a(i<K, MapMaker.Dummy, ?> iVar) {
            return (t) iVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public WeakKeyDummyValueSegment<K> P() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        ReferenceQueue<K> n() {
            return this.f57581i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void v() {
            b(this.f57581i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void w() {
            h(this.f57581i);
        }
    }

    public static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, u<K, V>, WeakKeyStrongValueSegment<K, V>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ReferenceQueue<K> f57582i;

        WeakKeyStrongValueSegment(MapMakerInternalMap<K, V, u<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i10, int i11) {
            super(mapMakerInternalMap, i10, i11);
            this.f57582i = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public u<K, V> a(i<K, V, ?> iVar) {
            return (u) iVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public WeakKeyStrongValueSegment<K, V> P() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        ReferenceQueue<K> n() {
            return this.f57582i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void v() {
            b(this.f57582i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void w() {
            h(this.f57582i);
        }
    }

    public static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, v<K, V>, WeakKeyWeakValueSegment<K, V>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ReferenceQueue<K> f57583i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final ReferenceQueue<V> f57584j;

        WeakKeyWeakValueSegment(MapMakerInternalMap<K, V, v<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i10, int i11) {
            super(mapMakerInternalMap, i10, i11);
            this.f57583i = new ReferenceQueue<>();
            this.f57584j = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void T(i<K, V, ?> iVar, x<K, V, ? extends i<K, V, ?>> xVar) {
            v<K, V> vVarA = a(iVar);
            x xVar2 = ((v) vVarA).f57610d;
            ((v) vVarA).f57610d = xVar;
            xVar2.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public v<K, V> a(i<K, V, ?> iVar) {
            return (v) iVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public WeakKeyWeakValueSegment<K, V> P() {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        ReferenceQueue<K> n() {
            return this.f57583i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        ReferenceQueue<V> r() {
            return this.f57584j;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public x<K, V, v<K, V>> s(i<K, V, ?> iVar) {
            return a(iVar).getValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void v() {
            b(this.f57583i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void w() {
            h(this.f57583i);
            i(this.f57584j);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public x<K, V, v<K, V>> z(i<K, V, ?> iVar, V v10) {
            return new y(this.f57584j, v10, a(iVar));
        }
    }

    public class a implements x<Object, Object, e> {
        a() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.x
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x<Object, Object, e> a(ReferenceQueue<Object> referenceQueue, e eVar) {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.x
        public void clear() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.x
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e c() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.x
        public Object get() {
            return null;
        }
    }

    public static abstract class b<K, V, E extends i<K, V, E>> implements i<K, V, E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final K f57585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f57586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        final E f57587d;

        b(K k10, int i10, @CheckForNull E e10) {
            this.f57585b = k10;
            this.f57586c = i10;
            this.f57587d = e10;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.i
        public int getHash() {
            return this.f57586c;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.i
        public K getKey() {
            return this.f57585b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.i
        public E getNext() {
            return this.f57587d;
        }
    }

    public static abstract class c<K, V, E extends i<K, V, E>> extends WeakReference<K> implements i<K, V, E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f57588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        final E f57589c;

        c(ReferenceQueue<K> referenceQueue, K k10, int i10, @CheckForNull E e10) {
            super(k10, referenceQueue);
            this.f57588b = i10;
            this.f57589c = e10;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.i
        public int getHash() {
            return this.f57588b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.i
        public K getKey() {
            return get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.i
        public E getNext() {
            return this.f57589c;
        }
    }

    public static final class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WeakReference<MapMakerInternalMap<?, ?, ?, ?>> f57590b;

        public d(MapMakerInternalMap<?, ?, ?, ?> mapMakerInternalMap) {
            this.f57590b = new WeakReference<>(mapMakerInternalMap);
        }

        @Override // java.lang.Runnable
        public void run() {
            MapMakerInternalMap<?, ?, ?, ?> mapMakerInternalMap = this.f57590b.get();
            if (mapMakerInternalMap == null) {
                throw new CancellationException();
            }
            for (Segment<?, ?, E, S> segment : mapMakerInternalMap.f57560d) {
                segment.N();
            }
        }
    }

    public static final class e implements i<Object, Object, e> {
        private e() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e getNext() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.i
        public int getHash() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.i
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.i
        public Object getValue() {
            throw new AssertionError();
        }
    }

    public final class f extends MapMakerInternalMap<K, V, E, S>.h<Map.Entry<K, V>> {
        f(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h, java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return c();
        }
    }

    public final class g extends m<Map.Entry<K, V>> {
        g() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = MapMakerInternalMap.this.get(key)) != null && MapMakerInternalMap.this.w().d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && MapMakerInternalMap.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    public abstract class h<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f57592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f57593c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        Segment<K, V, E, S> f57594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        AtomicReferenceArray<E> f57595e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @CheckForNull
        E f57596f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @CheckForNull
        MapMakerInternalMap<K, V, E, S>.z f57597g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @CheckForNull
        MapMakerInternalMap<K, V, E, S>.z f57598h;

        h() {
            this.f57592b = MapMakerInternalMap.this.f57560d.length - 1;
            a();
        }

        final void a() {
            this.f57597g = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i10 = this.f57592b;
                if (i10 < 0) {
                    return;
                }
                Segment<K, V, E, S>[] segmentArr = MapMakerInternalMap.this.f57560d;
                this.f57592b = i10 - 1;
                Segment<K, V, E, S> segment = segmentArr[i10];
                this.f57594d = segment;
                if (segment.f57574c != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f57594d.f57577f;
                    this.f57595e = atomicReferenceArray;
                    this.f57593c = atomicReferenceArray.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        boolean b(E e10) {
            boolean z10;
            try {
                Object key = e10.getKey();
                Object objG = MapMakerInternalMap.this.g(e10);
                if (objG != null) {
                    this.f57597g = new z(key, objG);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return z10;
            } finally {
                this.f57594d.A();
            }
        }

        MapMakerInternalMap<K, V, E, S>.z c() {
            MapMakerInternalMap<K, V, E, S>.z zVar = this.f57597g;
            if (zVar == null) {
                throw new NoSuchElementException();
            }
            this.f57598h = zVar;
            a();
            return this.f57598h;
        }

        boolean d() {
            E e10 = this.f57596f;
            if (e10 == null) {
                return false;
            }
            while (true) {
                this.f57596f = (E) e10.getNext();
                E e11 = this.f57596f;
                if (e11 == null) {
                    return false;
                }
                if (b(e11)) {
                    return true;
                }
                e10 = this.f57596f;
            }
        }

        boolean e() {
            while (true) {
                int i10 = this.f57593c;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f57595e;
                this.f57593c = i10 - 1;
                E e10 = atomicReferenceArray.get(i10);
                this.f57596f = e10;
                if (e10 != null && (b(e10) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57597g != null;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.collect.n.e(this.f57598h != null);
            MapMakerInternalMap.this.remove(this.f57598h.getKey());
            this.f57598h = null;
        }
    }

    public interface i<K, V, E extends i<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    public interface j<K, V, E extends i<K, V, E>, S extends Segment<K, V, E, S>> {
        void a(S s10, E e10, V v10);

        Strength b();

        E c(S s10, E e10, @CheckForNull E e11);

        Strength d();

        E e(S s10, K k10, int i10, @CheckForNull E e10);

        S f(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i10, int i11);
    }

    public final class k extends MapMakerInternalMap<K, V, E, S>.h<K> {
        k(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h, java.util.Iterator
        public K next() {
            return c().getKey();
        }
    }

    public final class l extends m<K> {
        l() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new k(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    public static abstract class m<E> extends AbstractSet<E> {
        private m() {
        }

        /* synthetic */ m(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return MapMakerInternalMap.u(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapMakerInternalMap.u(this).toArray(tArr);
        }
    }

    public static final class n<K> extends b<K, MapMaker.Dummy, n<K>> implements q<K, MapMaker.Dummy, n<K>> {

        public static final class a<K> implements j<K, MapMaker.Dummy, n<K>, StrongKeyDummyValueSegment<K>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?> f57601a = new a<>();

            a() {
            }

            static <K> a<K> h() {
                return (a<K>) f57601a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            public Strength b() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            public Strength d() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public n<K> c(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, n<K> nVar, @CheckForNull n<K> nVar2) {
                return nVar.b(nVar2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public n<K> e(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, K k10, int i10, @CheckForNull n<K> nVar) {
                return new n<>(k10, i10, nVar);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public StrongKeyDummyValueSegment<K> f(MapMakerInternalMap<K, MapMaker.Dummy, n<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i10, int i11) {
                return new StrongKeyDummyValueSegment<>(mapMakerInternalMap, i10, i11);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void a(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, n<K> nVar, MapMaker.Dummy dummy) {
            }
        }

        n(K k10, int i10, @CheckForNull n<K> nVar) {
            super(k10, i10, nVar);
        }

        n<K> b(n<K> nVar) {
            return new n<>(this.f57585b, this.f57586c, nVar);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }

        void d(MapMaker.Dummy dummy) {
        }
    }

    public static final class o<K, V> extends b<K, V, o<K, V>> implements q<K, V, o<K, V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        private volatile V f57602e;

        public static final class a<K, V> implements j<K, V, o<K, V>, StrongKeyStrongValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f57603a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) f57603a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            public Strength b() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            public Strength d() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public o<K, V> c(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, o<K, V> oVar, @CheckForNull o<K, V> oVar2) {
                return oVar.b(oVar2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public o<K, V> e(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, K k10, int i10, @CheckForNull o<K, V> oVar) {
                return new o<>(k10, i10, oVar);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public StrongKeyStrongValueSegment<K, V> f(MapMakerInternalMap<K, V, o<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i10, int i11) {
                return new StrongKeyStrongValueSegment<>(mapMakerInternalMap, i10, i11);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void a(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, o<K, V> oVar, V v10) {
                oVar.c(v10);
            }
        }

        o(K k10, int i10, @CheckForNull o<K, V> oVar) {
            super(k10, i10, oVar);
            this.f57602e = null;
        }

        o<K, V> b(o<K, V> oVar) {
            o<K, V> oVar2 = new o<>(this.f57585b, this.f57586c, oVar);
            oVar2.f57602e = this.f57602e;
            return oVar2;
        }

        void c(V v10) {
            this.f57602e = v10;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.i
        @CheckForNull
        public V getValue() {
            return this.f57602e;
        }
    }

    public static final class p<K, V> extends b<K, V, p<K, V>> implements w<K, V, p<K, V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile x<K, V, p<K, V>> f57604e;

        public static final class a<K, V> implements j<K, V, p<K, V>, StrongKeyWeakValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f57605a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) f57605a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            public Strength b() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            public Strength d() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public p<K, V> c(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, p<K, V> pVar, @CheckForNull p<K, V> pVar2) {
                if (Segment.u(pVar)) {
                    return null;
                }
                return pVar.d(((StrongKeyWeakValueSegment) strongKeyWeakValueSegment).f57580i, pVar2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public p<K, V> e(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, K k10, int i10, @CheckForNull p<K, V> pVar) {
                return new p<>(k10, i10, pVar);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public StrongKeyWeakValueSegment<K, V> f(MapMakerInternalMap<K, V, p<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i10, int i11) {
                return new StrongKeyWeakValueSegment<>(mapMakerInternalMap, i10, i11);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void a(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, p<K, V> pVar, V v10) {
                pVar.e(v10, ((StrongKeyWeakValueSegment) strongKeyWeakValueSegment).f57580i);
            }
        }

        p(K k10, int i10, @CheckForNull p<K, V> pVar) {
            super(k10, i10, pVar);
            this.f57604e = MapMakerInternalMap.v();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.w
        public void a() {
            this.f57604e.clear();
        }

        p<K, V> d(ReferenceQueue<V> referenceQueue, p<K, V> pVar) {
            p<K, V> pVar2 = new p<>(this.f57585b, this.f57586c, pVar);
            pVar2.f57604e = this.f57604e.a(referenceQueue, pVar2);
            return pVar2;
        }

        void e(V v10, ReferenceQueue<V> referenceQueue) {
            x<K, V, p<K, V>> xVar = this.f57604e;
            this.f57604e = new y(referenceQueue, v10, this);
            xVar.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.i
        public V getValue() {
            return this.f57604e.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.w
        public x<K, V, p<K, V>> getValueReference() {
            return this.f57604e;
        }
    }

    public interface q<K, V, E extends i<K, V, E>> extends i<K, V, E> {
    }

    public final class r extends MapMakerInternalMap<K, V, E, S>.h<V> {
        r(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.h, java.util.Iterator
        public V next() {
            return c().getValue();
        }
    }

    public final class s extends AbstractCollection<V> {
        s() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new r(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return MapMakerInternalMap.u(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapMakerInternalMap.u(this).toArray(tArr);
        }
    }

    public static final class t<K> extends c<K, MapMaker.Dummy, t<K>> implements q<K, MapMaker.Dummy, t<K>> {

        public static final class a<K> implements j<K, MapMaker.Dummy, t<K>, WeakKeyDummyValueSegment<K>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?> f57607a = new a<>();

            a() {
            }

            static <K> a<K> h() {
                return (a<K>) f57607a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            public Strength b() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            public Strength d() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public t<K> c(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, t<K> tVar, @CheckForNull t<K> tVar2) {
                if (tVar.getKey() == null) {
                    return null;
                }
                return tVar.b(((WeakKeyDummyValueSegment) weakKeyDummyValueSegment).f57581i, tVar2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public t<K> e(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, K k10, int i10, @CheckForNull t<K> tVar) {
                return new t<>(((WeakKeyDummyValueSegment) weakKeyDummyValueSegment).f57581i, k10, i10, tVar);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public WeakKeyDummyValueSegment<K> f(MapMakerInternalMap<K, MapMaker.Dummy, t<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i10, int i11) {
                return new WeakKeyDummyValueSegment<>(mapMakerInternalMap, i10, i11);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void a(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, t<K> tVar, MapMaker.Dummy dummy) {
            }
        }

        t(ReferenceQueue<K> referenceQueue, K k10, int i10, @CheckForNull t<K> tVar) {
            super(referenceQueue, k10, i10, tVar);
        }

        t<K> b(ReferenceQueue<K> referenceQueue, t<K> tVar) {
            return new t<>(referenceQueue, getKey(), this.f57588b, tVar);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }

        void d(MapMaker.Dummy dummy) {
        }
    }

    public static final class u<K, V> extends c<K, V, u<K, V>> implements q<K, V, u<K, V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        private volatile V f57608d;

        public static final class a<K, V> implements j<K, V, u<K, V>, WeakKeyStrongValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f57609a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) f57609a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            public Strength b() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            public Strength d() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public u<K, V> c(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, u<K, V> uVar, @CheckForNull u<K, V> uVar2) {
                if (uVar.getKey() == null) {
                    return null;
                }
                return uVar.b(((WeakKeyStrongValueSegment) weakKeyStrongValueSegment).f57582i, uVar2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public u<K, V> e(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, K k10, int i10, @CheckForNull u<K, V> uVar) {
                return new u<>(((WeakKeyStrongValueSegment) weakKeyStrongValueSegment).f57582i, k10, i10, uVar);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public WeakKeyStrongValueSegment<K, V> f(MapMakerInternalMap<K, V, u<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i10, int i11) {
                return new WeakKeyStrongValueSegment<>(mapMakerInternalMap, i10, i11);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void a(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, u<K, V> uVar, V v10) {
                uVar.c(v10);
            }
        }

        u(ReferenceQueue<K> referenceQueue, K k10, int i10, @CheckForNull u<K, V> uVar) {
            super(referenceQueue, k10, i10, uVar);
            this.f57608d = null;
        }

        u<K, V> b(ReferenceQueue<K> referenceQueue, u<K, V> uVar) {
            u<K, V> uVar2 = new u<>(referenceQueue, getKey(), this.f57588b, uVar);
            uVar2.c(this.f57608d);
            return uVar2;
        }

        void c(V v10) {
            this.f57608d = v10;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.i
        @CheckForNull
        public V getValue() {
            return this.f57608d;
        }
    }

    public static final class v<K, V> extends c<K, V, v<K, V>> implements w<K, V, v<K, V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile x<K, V, v<K, V>> f57610d;

        public static final class a<K, V> implements j<K, V, v<K, V>, WeakKeyWeakValueSegment<K, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f57611a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) f57611a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            public Strength b() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            public Strength d() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public v<K, V> c(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, v<K, V> vVar, @CheckForNull v<K, V> vVar2) {
                if (vVar.getKey() == null || Segment.u(vVar)) {
                    return null;
                }
                return vVar.d(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).f57583i, ((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).f57584j, vVar2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public v<K, V> e(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, K k10, int i10, @CheckForNull v<K, V> vVar) {
                return new v<>(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).f57583i, k10, i10, vVar);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public WeakKeyWeakValueSegment<K, V> f(MapMakerInternalMap<K, V, v<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i10, int i11) {
                return new WeakKeyWeakValueSegment<>(mapMakerInternalMap, i10, i11);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.j
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void a(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, v<K, V> vVar, V v10) {
                vVar.e(v10, ((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).f57584j);
            }
        }

        v(ReferenceQueue<K> referenceQueue, K k10, int i10, @CheckForNull v<K, V> vVar) {
            super(referenceQueue, k10, i10, vVar);
            this.f57610d = MapMakerInternalMap.v();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.w
        public void a() {
            this.f57610d.clear();
        }

        v<K, V> d(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, v<K, V> vVar) {
            v<K, V> vVar2 = new v<>(referenceQueue, getKey(), this.f57588b, vVar);
            vVar2.f57610d = this.f57610d.a(referenceQueue2, vVar2);
            return vVar2;
        }

        void e(V v10, ReferenceQueue<V> referenceQueue) {
            x<K, V, v<K, V>> xVar = this.f57610d;
            this.f57610d = new y(referenceQueue, v10, this);
            xVar.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.i
        public V getValue() {
            return this.f57610d.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.w
        public x<K, V, v<K, V>> getValueReference() {
            return this.f57610d;
        }
    }

    public interface w<K, V, E extends i<K, V, E>> extends i<K, V, E> {
        void a();

        x<K, V, E> getValueReference();
    }

    public interface x<K, V, E extends i<K, V, E>> {
        x<K, V, E> a(ReferenceQueue<V> referenceQueue, E e10);

        E c();

        void clear();

        @CheckForNull
        V get();
    }

    public static final class y<K, V, E extends i<K, V, E>> extends WeakReference<V> implements x<K, V, E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @u9.g
        final E f57612b;

        y(ReferenceQueue<V> referenceQueue, V v10, E e10) {
            super(v10, referenceQueue);
            this.f57612b = e10;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.x
        public x<K, V, E> a(ReferenceQueue<V> referenceQueue, E e10) {
            return new y(referenceQueue, get(), e10);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.x
        public E c() {
            return this.f57612b;
        }
    }

    public final class z extends com.google.common.collect.b<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final K f57613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        V f57614c;

        z(K k10, V v10) {
            this.f57613b = k10;
            this.f57614c = v10;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f57613b.equals(entry.getKey()) && this.f57614c.equals(entry.getValue());
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public K getKey() {
            return this.f57613b;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public V getValue() {
            return this.f57614c;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public int hashCode() {
            return this.f57613b.hashCode() ^ this.f57614c.hashCode();
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = (V) MapMakerInternalMap.this.put(this.f57613b, v10);
            this.f57614c = v10;
            return v11;
        }
    }

    private MapMakerInternalMap(MapMaker mapMaker, j<K, V, E, S> jVar) {
        this.f57561e = Math.min(mapMaker.b(), 65536);
        this.f57562f = mapMaker.d();
        this.f57563g = jVar;
        int iMin = Math.min(mapMaker.c(), 1073741824);
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 1;
        while (i13 < this.f57561e) {
            i12++;
            i13 <<= 1;
        }
        this.f57559c = 32 - i12;
        this.f57558b = i13 - 1;
        this.f57560d = k(i13);
        int i14 = iMin / i13;
        while (i11 < (i13 * i14 < iMin ? i14 + 1 : i14)) {
            i11 <<= 1;
        }
        while (true) {
            Segment<K, V, E, S>[] segmentArr = this.f57560d;
            if (i10 >= segmentArr.length) {
                return;
            }
            segmentArr[i10] = d(i11, -1);
            i10++;
        }
    }

    static <K, V> MapMakerInternalMap<K, V, ? extends i<K, V, ?>, ?> c(MapMaker mapMaker) {
        Strength strengthE = mapMaker.e();
        Strength strength = Strength.STRONG;
        if (strengthE == strength && mapMaker.f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, o.a.h());
        }
        if (mapMaker.e() == strength && mapMaker.f() == Strength.WEAK) {
            return new MapMakerInternalMap<>(mapMaker, p.a.h());
        }
        Strength strengthE2 = mapMaker.e();
        Strength strength2 = Strength.WEAK;
        if (strengthE2 == strength2 && mapMaker.f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, u.a.h());
        }
        if (mapMaker.e() == strength2 && mapMaker.f() == strength2) {
            return new MapMakerInternalMap<>(mapMaker, v.a.h());
        }
        throw new AssertionError();
    }

    static <K> MapMakerInternalMap<K, MapMaker.Dummy, ? extends i<K, MapMaker.Dummy, ?>, ?> e(MapMaker mapMaker) {
        Strength strengthE = mapMaker.e();
        Strength strength = Strength.STRONG;
        if (strengthE == strength && mapMaker.f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, n.a.h());
        }
        Strength strengthE2 = mapMaker.e();
        Strength strength2 = Strength.WEAK;
        if (strengthE2 == strength2 && mapMaker.f() == strength) {
            return new MapMakerInternalMap<>(mapMaker, t.a.h());
        }
        if (mapMaker.f() == strength2) {
            throw new IllegalArgumentException("Map cannot have both weak and dummy values");
        }
        throw new AssertionError();
    }

    static int p(int i10) {
        int i11 = i10 + ((i10 << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = i14 + (i14 << 2) + (i14 << 14);
        return i15 ^ (i15 >>> 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ArrayList<E> u(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterators.a(arrayList, collection.iterator());
        return arrayList;
    }

    static <K, V, E extends i<K, V, E>> x<K, V, E> v() {
        return (x<K, V, E>) f57557q;
    }

    @o9.d
    E b(E e10, E e11) {
        return (E) r(e10.getHash()).f(e10, e11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (Segment<K, V, E, S> segment : this.f57560d) {
            segment.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        int iH = h(obj);
        return r(iH).d(obj, iH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        Segment<K, V, E, S>[] segmentArr = this.f57560d;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            long j11 = 0;
            int length = segmentArr.length;
            for (?? r10 = z10; r10 < length; r10++) {
                Segment<K, V, E, S> segment = segmentArr[r10];
                int i11 = segment.f57574c;
                AtomicReferenceArray<E> atomicReferenceArray = segment.f57577f;
                for (?? r13 = z10; r13 < atomicReferenceArray.length(); r13++) {
                    for (E next = atomicReferenceArray.get(r13); next != null; next = next.getNext()) {
                        V vP = segment.p(next);
                        if (vP != null && w().d(obj, vP)) {
                            return true;
                        }
                    }
                }
                j11 += (long) segment.f57575d;
                z10 = false;
            }
            if (j11 == j10) {
                return false;
            }
            i10++;
            j10 = j11;
            z10 = false;
        }
        return z10;
    }

    Segment<K, V, E, S> d(int i10, int i11) {
        return this.f57563g.f(this, i10, i11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f57566j;
        if (set != null) {
            return set;
        }
        g gVar = new g();
        this.f57566j = gVar;
        return gVar;
    }

    E f(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int iH = h(obj);
        return (E) r(iH).l(obj, iH);
    }

    V g(E e10) {
        if (e10.getKey() == null) {
            return null;
        }
        return (V) e10.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int iH = h(obj);
        return r(iH).k(obj, iH);
    }

    int h(Object obj) {
        return p(this.f57562f.f(obj));
    }

    @o9.d
    boolean i(i<K, V, ?> iVar) {
        return r(iVar.getHash()).q(iVar) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment<K, V, E, S>[] segmentArr = this.f57560d;
        long j10 = 0;
        for (int i10 = 0; i10 < segmentArr.length; i10++) {
            if (segmentArr[i10].f57574c != 0) {
                return false;
            }
            j10 += (long) segmentArr[i10].f57575d;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < segmentArr.length; i11++) {
            if (segmentArr[i11].f57574c != 0) {
                return false;
            }
            j10 -= (long) segmentArr[i11].f57575d;
        }
        return j10 == 0;
    }

    @o9.d
    Strength j() {
        return this.f57563g.b();
    }

    final Segment<K, V, E, S>[] k(int i10) {
        return new Segment[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f57564h;
        if (set != null) {
            return set;
        }
        l lVar = new l();
        this.f57564h = lVar;
        return lVar;
    }

    void l(E e10) {
        int hash = e10.getHash();
        r(hash).D(e10, hash);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void n(x<K, V, E> xVar) {
        i iVarC = xVar.c();
        int hash = iVarC.getHash();
        r(hash).E(iVarC.getKey(), hash, xVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @s9.a
    public V put(K k10, V v10) {
        com.google.common.base.w.E(k10);
        com.google.common.base.w.E(v10);
        int iH = h(k10);
        return r(iH).C(k10, iH, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @s9.a
    public V putIfAbsent(K k10, V v10) {
        com.google.common.base.w.E(k10);
        com.google.common.base.w.E(v10);
        int iH = h(k10);
        return r(iH).C(k10, iH, v10, true);
    }

    Segment<K, V, E, S> r(int i10) {
        return this.f57560d[(i10 >>> this.f57559c) & this.f57558b];
    }

    @Override // java.util.AbstractMap, java.util.Map
    @s9.a
    public V remove(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int iH = h(obj);
        return r(iH).F(obj, iH);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @s9.a
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iH = h(obj);
        return r(iH).G(obj, iH, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @s9.a
    public V replace(K k10, V v10) {
        com.google.common.base.w.E(k10);
        com.google.common.base.w.E(v10);
        int iH = h(k10);
        return r(iH).L(k10, iH, v10);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @s9.a
    public boolean replace(K k10, @CheckForNull V v10, V v11) {
        com.google.common.base.w.E(k10);
        com.google.common.base.w.E(v11);
        if (v10 == null) {
            return false;
        }
        int iH = h(k10);
        return r(iH).M(k10, iH, v10, v11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j10 = 0;
        for (Segment<K, V, E, S> segment : this.f57560d) {
            j10 += (long) segment.f57574c;
        }
        return Ints.x(j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f57565i;
        if (collection != null) {
            return collection;
        }
        s sVar = new s();
        this.f57565i = sVar;
        return sVar;
    }

    @o9.d
    Equivalence<Object> w() {
        return this.f57563g.d().defaultEquivalence();
    }

    @o9.d
    Strength x() {
        return this.f57563g.d();
    }

    Object y() {
        return new SerializationProxy(this.f57563g.b(), this.f57563g.d(), this.f57562f, this.f57563g.d().defaultEquivalence(), this.f57561e, this);
    }
}
