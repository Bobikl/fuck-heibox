package io.reactivex.internal.functions;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class Functions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final kh.o<Object, Object> f119556a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f119557b = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kh.a f119558c = new o();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final kh.g<Object> f119559d = new p();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kh.g<Throwable> f119560e = new t();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final kh.g<Throwable> f119561f = new f0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final kh.q f119562g = new q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final kh.r<Object> f119563h = new k0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final kh.r<Object> f119564i = new u();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final Callable<Object> f119565j = new e0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Comparator<Object> f119566k = new a0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final kh.g<org.reactivestreams.e> f119567l = new z();

    public enum HashSetCallable implements Callable<Set<Object>> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    public enum NaturalComparator implements Comparator<Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static final class a<T> implements kh.g<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.a f119568b;

        a(kh.a aVar) {
            this.f119568b = aVar;
        }

        @Override // kh.g
        public void accept(T t10) throws Exception {
            this.f119568b.run();
        }
    }

    public static final class a0 implements Comparator<Object> {
        a0() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static final class b<T1, T2, R> implements kh.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.c<? super T1, ? super T2, ? extends R> f119569b;

        b(kh.c<? super T1, ? super T2, ? extends R> cVar) {
            this.f119569b = cVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f119569b.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    public static final class b0<T> implements kh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.g<? super io.reactivex.y<T>> f119570b;

        b0(kh.g<? super io.reactivex.y<T>> gVar) {
            this.f119570b = gVar;
        }

        @Override // kh.a
        public void run() throws Exception {
            this.f119570b.accept(io.reactivex.y.a());
        }
    }

    public static final class c<T1, T2, T3, R> implements kh.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.h<T1, T2, T3, R> f119571b;

        c(kh.h<T1, T2, T3, R> hVar) {
            this.f119571b = hVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 3) {
                return this.f119571b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    public static final class c0<T> implements kh.g<Throwable> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.g<? super io.reactivex.y<T>> f119572b;

        c0(kh.g<? super io.reactivex.y<T>> gVar) {
            this.f119572b = gVar;
        }

        @Override // kh.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) throws Exception {
            this.f119572b.accept(io.reactivex.y.b(th2));
        }
    }

    public static final class d<T1, T2, T3, T4, R> implements kh.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.i<T1, T2, T3, T4, R> f119573b;

        d(kh.i<T1, T2, T3, T4, R> iVar) {
            this.f119573b = iVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
            }
            return this.f119573b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3]);
        }
    }

    public static final class d0<T> implements kh.g<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.g<? super io.reactivex.y<T>> f119574b;

        d0(kh.g<? super io.reactivex.y<T>> gVar) {
            this.f119574b = gVar;
        }

        @Override // kh.g
        public void accept(T t10) throws Exception {
            this.f119574b.accept(io.reactivex.y.c(t10));
        }
    }

    public static final class e<T1, T2, T3, T4, T5, R> implements kh.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kh.j<T1, T2, T3, T4, T5, R> f119575b;

        e(kh.j<T1, T2, T3, T4, T5, R> jVar) {
            this.f119575b = jVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
            }
            return this.f119575b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4]);
        }
    }

    public static final class e0 implements Callable<Object> {
        e0() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    public static final class f<T1, T2, T3, T4, T5, T6, R> implements kh.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.k<T1, T2, T3, T4, T5, T6, R> f119576b;

        f(kh.k<T1, T2, T3, T4, T5, T6, R> kVar) {
            this.f119576b = kVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 6) {
                throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
            }
            return this.f119576b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5]);
        }
    }

    public static final class f0 implements kh.g<Throwable> {
        f0() {
        }

        @Override // kh.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            io.reactivex.plugins.a.Y(new OnErrorNotImplementedException(th2));
        }
    }

    public static final class g<T1, T2, T3, T4, T5, T6, T7, R> implements kh.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.l<T1, T2, T3, T4, T5, T6, T7, R> f119577b;

        g(kh.l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
            this.f119577b = lVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
            }
            return this.f119577b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6]);
        }
    }

    public static final class g0<T> implements kh.o<T, io.reactivex.schedulers.d<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final TimeUnit f119578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.h0 f119579c;

        g0(TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            this.f119578b = timeUnit;
            this.f119579c = h0Var;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.schedulers.d<T> apply(T t10) throws Exception {
            return new io.reactivex.schedulers.d<>(t10, this.f119579c.d(this.f119578b), this.f119578b);
        }
    }

    public static final class h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements kh.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.m<T1, T2, T3, T4, T5, T6, T7, T8, R> f119580b;

        h(kh.m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
            this.f119580b = mVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 8) {
                throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
            }
            return this.f119580b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7]);
        }
    }

    public static final class h0<K, T> implements kh.b<Map<K, T>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final kh.o<? super T, ? extends K> f119581a;

        h0(kh.o<? super T, ? extends K> oVar) {
            this.f119581a = oVar;
        }

        @Override // kh.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, T> map, T t10) throws Exception {
            map.put(this.f119581a.apply(t10), t10);
        }
    }

    public static final class i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements kh.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f119582b;

        i(kh.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
            this.f119582b = nVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 9) {
                throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
            }
            return this.f119582b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7], (T9) objArr[8]);
        }
    }

    public static final class i0<K, V, T> implements kh.b<Map<K, V>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final kh.o<? super T, ? extends V> f119583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kh.o<? super T, ? extends K> f119584b;

        i0(kh.o<? super T, ? extends V> oVar, kh.o<? super T, ? extends K> oVar2) {
            this.f119583a = oVar;
            this.f119584b = oVar2;
        }

        @Override // kh.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, V> map, T t10) throws Exception {
            map.put(this.f119584b.apply(t10), this.f119583a.apply(t10));
        }
    }

    public static final class j<T> implements Callable<List<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f119585b;

        j(int i10) {
            this.f119585b = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> call() throws Exception {
            return new ArrayList(this.f119585b);
        }
    }

    public static final class j0<K, V, T> implements kh.b<Map<K, Collection<V>>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final kh.o<? super K, ? extends Collection<? super V>> f119586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kh.o<? super T, ? extends V> f119587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kh.o<? super T, ? extends K> f119588c;

        j0(kh.o<? super K, ? extends Collection<? super V>> oVar, kh.o<? super T, ? extends V> oVar2, kh.o<? super T, ? extends K> oVar3) {
            this.f119586a = oVar;
            this.f119587b = oVar2;
            this.f119588c = oVar3;
        }

        @Override // kh.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, Collection<V>> map, T t10) throws Exception {
            K kApply = this.f119588c.apply(t10);
            Collection<? super V> collectionApply = (Collection) map.get(kApply);
            if (collectionApply == null) {
                collectionApply = this.f119586a.apply(kApply);
                map.put(kApply, collectionApply);
            }
            collectionApply.add(this.f119587b.apply(t10));
        }
    }

    public static final class k<T> implements kh.r<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.e f119589b;

        k(kh.e eVar) {
            this.f119589b = eVar;
        }

        @Override // kh.r
        public boolean test(T t10) throws Exception {
            return !this.f119589b.a();
        }
    }

    public static final class k0 implements kh.r<Object> {
        k0() {
        }

        @Override // kh.r
        public boolean test(Object obj) {
            return true;
        }
    }

    public static class l implements kh.g<org.reactivestreams.e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f119590b;

        l(int i10) {
            this.f119590b = i10;
        }

        @Override // kh.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(org.reactivestreams.e eVar) throws Exception {
            eVar.request(this.f119590b);
        }
    }

    public static final class m<T, U> implements kh.o<T, U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<U> f119591b;

        m(Class<U> cls) {
            this.f119591b = cls;
        }

        @Override // kh.o
        public U apply(T t10) throws Exception {
            return this.f119591b.cast(t10);
        }
    }

    public static final class n<T, U> implements kh.r<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<U> f119592b;

        n(Class<U> cls) {
            this.f119592b = cls;
        }

        @Override // kh.r
        public boolean test(T t10) throws Exception {
            return this.f119592b.isInstance(t10);
        }
    }

    public static final class o implements kh.a {
        o() {
        }

        @Override // kh.a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    public static final class p implements kh.g<Object> {
        p() {
        }

        @Override // kh.g
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    public static final class q implements kh.q {
        q() {
        }

        @Override // kh.q
        public void accept(long j10) {
        }
    }

    public static final class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    public static final class s<T> implements kh.r<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T f119593b;

        s(T t10) {
            this.f119593b = t10;
        }

        @Override // kh.r
        public boolean test(T t10) throws Exception {
            return io.reactivex.internal.functions.a.c(t10, this.f119593b);
        }
    }

    public static final class t implements kh.g<Throwable> {
        t() {
        }

        @Override // kh.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            io.reactivex.plugins.a.Y(th2);
        }
    }

    public static final class u implements kh.r<Object> {
        u() {
        }

        @Override // kh.r
        public boolean test(Object obj) {
            return false;
        }
    }

    public static final class v implements kh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Future<?> f119594b;

        v(Future<?> future) {
            this.f119594b = future;
        }

        @Override // kh.a
        public void run() throws Exception {
            this.f119594b.get();
        }
    }

    public static final class w implements kh.o<Object, Object> {
        w() {
        }

        @Override // kh.o
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    public static final class x<T, U> implements Callable<U>, kh.o<T, U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final U f119595b;

        x(U u10) {
            this.f119595b = u10;
        }

        @Override // kh.o
        public U apply(T t10) throws Exception {
            return this.f119595b;
        }

        @Override // java.util.concurrent.Callable
        public U call() throws Exception {
            return this.f119595b;
        }
    }

    public static final class y<T> implements kh.o<List<T>, List<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Comparator<? super T> f119596b;

        y(Comparator<? super T> comparator) {
            this.f119596b = comparator;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> apply(List<T> list) {
            Collections.sort(list, this.f119596b);
            return list;
        }
    }

    public static final class z implements kh.g<org.reactivestreams.e> {
        z() {
        }

        @Override // kh.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(org.reactivestreams.e eVar) throws Exception {
            eVar.request(Long.MAX_VALUE);
        }
    }

    private Functions() {
        throw new IllegalStateException("No instances!");
    }

    public static <T1, T2, T3, T4, T5, R> kh.o<Object[], R> A(kh.j<T1, T2, T3, T4, T5, R> jVar) {
        io.reactivex.internal.functions.a.g(jVar, "f is null");
        return new e(jVar);
    }

    public static <T1, T2, T3, T4, T5, T6, R> kh.o<Object[], R> B(kh.k<T1, T2, T3, T4, T5, T6, R> kVar) {
        io.reactivex.internal.functions.a.g(kVar, "f is null");
        return new f(kVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> kh.o<Object[], R> C(kh.l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
        io.reactivex.internal.functions.a.g(lVar, "f is null");
        return new g(lVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> kh.o<Object[], R> D(kh.m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
        io.reactivex.internal.functions.a.g(mVar, "f is null");
        return new h(mVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> kh.o<Object[], R> E(kh.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
        io.reactivex.internal.functions.a.g(nVar, "f is null");
        return new i(nVar);
    }

    public static <T, K> kh.b<Map<K, T>, T> F(kh.o<? super T, ? extends K> oVar) {
        return new h0(oVar);
    }

    public static <T, K, V> kh.b<Map<K, V>, T> G(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2) {
        return new i0(oVar2, oVar);
    }

    public static <T, K, V> kh.b<Map<K, Collection<V>>, T> H(kh.o<? super T, ? extends K> oVar, kh.o<? super T, ? extends V> oVar2, kh.o<? super K, ? extends Collection<? super V>> oVar3) {
        return new j0(oVar3, oVar2, oVar);
    }

    public static <T> kh.g<T> a(kh.a aVar) {
        return new a(aVar);
    }

    public static <T> kh.r<T> b() {
        return (kh.r<T>) f119564i;
    }

    public static <T> kh.r<T> c() {
        return (kh.r<T>) f119563h;
    }

    public static <T> kh.g<T> d(int i10) {
        return new l(i10);
    }

    public static <T, U> kh.o<T, U> e(Class<U> cls) {
        return new m(cls);
    }

    public static <T> Callable<List<T>> f(int i10) {
        return new j(i10);
    }

    public static <T> Callable<Set<T>> g() {
        return HashSetCallable.INSTANCE;
    }

    public static <T> kh.g<T> h() {
        return (kh.g<T>) f119559d;
    }

    public static <T> kh.r<T> i(T t10) {
        return new s(t10);
    }

    public static kh.a j(Future<?> future) {
        return new v(future);
    }

    public static <T> kh.o<T, T> k() {
        return (kh.o<T, T>) f119556a;
    }

    public static <T, U> kh.r<T> l(Class<U> cls) {
        return new n(cls);
    }

    public static <T> Callable<T> m(T t10) {
        return new x(t10);
    }

    public static <T, U> kh.o<T, U> n(U u10) {
        return new x(u10);
    }

    public static <T> kh.o<List<T>, List<T>> o(Comparator<? super T> comparator) {
        return new y(comparator);
    }

    public static <T> Comparator<T> p() {
        return NaturalComparator.INSTANCE;
    }

    public static <T> Comparator<T> q() {
        return (Comparator<T>) f119566k;
    }

    public static <T> kh.a r(kh.g<? super io.reactivex.y<T>> gVar) {
        return new b0(gVar);
    }

    public static <T> kh.g<Throwable> s(kh.g<? super io.reactivex.y<T>> gVar) {
        return new c0(gVar);
    }

    public static <T> kh.g<T> t(kh.g<? super io.reactivex.y<T>> gVar) {
        return new d0(gVar);
    }

    public static <T> Callable<T> u() {
        return (Callable<T>) f119565j;
    }

    public static <T> kh.r<T> v(kh.e eVar) {
        return new k(eVar);
    }

    public static <T> kh.o<T, io.reactivex.schedulers.d<T>> w(TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        return new g0(timeUnit, h0Var);
    }

    public static <T1, T2, R> kh.o<Object[], R> x(kh.c<? super T1, ? super T2, ? extends R> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "f is null");
        return new b(cVar);
    }

    public static <T1, T2, T3, R> kh.o<Object[], R> y(kh.h<T1, T2, T3, R> hVar) {
        io.reactivex.internal.functions.a.g(hVar, "f is null");
        return new c(hVar);
    }

    public static <T1, T2, T3, T4, R> kh.o<Object[], R> z(kh.i<T1, T2, T3, T4, R> iVar) {
        io.reactivex.internal.functions.a.g(iVar, "f is null");
        return new d(iVar);
    }
}
