package kotlin.reflect.jvm.internal.impl.utils;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w0;
import xh.m;

/* JADX INFO: compiled from: SmartSet.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e<T> extends AbstractSet<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final b f128306d = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private Object f128307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f128308c;

    /* JADX INFO: compiled from: SmartSet.kt */
    public static final class a<T> implements Iterator<T>, zh.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Iterator<T> f128309b;

        public a(@dl.d T[] array) {
            f0.p(array, "array");
            this.f128309b = h.a(array);
        }

        @Override // java.util.Iterator
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f128309b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f128309b.next();
        }
    }

    /* JADX INFO: compiled from: SmartSet.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }

        @dl.d
        @m
        public final <T> e<T> a() {
            return new e<>(null);
        }

        @dl.d
        @m
        public final <T> e<T> b(@dl.d Collection<? extends T> set) {
            f0.p(set, "set");
            e<T> eVar = new e<>(null);
            eVar.addAll(set);
            return eVar;
        }
    }

    /* JADX INFO: compiled from: SmartSet.kt */
    public static final class c<T> implements Iterator<T>, zh.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f128310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f128311c = true;

        public c(T t10) {
            this.f128310b = t10;
        }

        @Override // java.util.Iterator
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f128311c;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f128311c) {
                throw new NoSuchElementException();
            }
            this.f128311c = false;
            return this.f128310b;
        }
    }

    private e() {
    }

    public /* synthetic */ e(u uVar) {
        this();
    }

    @dl.d
    @m
    public static final <T> e<T> a() {
        return f128306d.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t10) {
        Object obj;
        if (size() == 0) {
            this.f128307b = t10;
        } else if (size() == 1) {
            if (f0.g(this.f128307b, t10)) {
                return false;
            }
            this.f128307b = new Object[]{this.f128307b, t10};
        } else if (size() < 5) {
            Object obj2 = this.f128307b;
            f0.n(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj2;
            if (ArraysKt___ArraysKt.T8(objArr, t10)) {
                return false;
            }
            if (size() == 4) {
                LinkedHashSet linkedHashSetO = d1.o(Arrays.copyOf(objArr, objArr.length));
                linkedHashSetO.add(t10);
                obj = linkedHashSetO;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
                f0.o(objArrCopyOf, "copyOf(this, newSize)");
                objArrCopyOf[objArrCopyOf.length - 1] = t10;
                obj = objArrCopyOf;
            }
            this.f128307b = obj;
        } else {
            Object obj3 = this.f128307b;
            f0.n(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!w0.o(obj3).add(t10)) {
                return false;
            }
        }
        e(size() + 1);
        return true;
    }

    public int b() {
        return this.f128308c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f128307b = null;
        e(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return f0.g(this.f128307b, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f128307b;
            f0.n(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return ArraysKt___ArraysKt.T8((Object[]) obj2, obj);
        }
        Object obj3 = this.f128307b;
        f0.n(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public void e(int i10) {
        this.f128308c = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @dl.d
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new c(this.f128307b);
        }
        if (size() < 5) {
            Object obj = this.f128307b;
            f0.n(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f128307b;
        f0.n(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return w0.o(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
