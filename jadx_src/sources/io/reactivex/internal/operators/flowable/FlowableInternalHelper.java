package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.functions.Functions;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableInternalHelper {

    public enum RequestMax implements kh.g<org.reactivestreams.e> {
        INSTANCE;

        @Override // kh.g
        public void accept(org.reactivestreams.e eVar) throws Exception {
            eVar.request(Long.MAX_VALUE);
        }
    }

    public static final class a<T> implements Callable<io.reactivex.flowables.a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.j<T> f120314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f120315c;

        a(io.reactivex.j<T> jVar, int i10) {
            this.f120314b = jVar;
            this.f120315c = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.flowables.a<T> call() {
            return this.f120314b.g5(this.f120315c);
        }
    }

    public static final class b<T> implements Callable<io.reactivex.flowables.a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.j<T> f120316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f120317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f120318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final TimeUnit f120319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final io.reactivex.h0 f120320f;

        b(io.reactivex.j<T> jVar, int i10, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            this.f120316b = jVar;
            this.f120317c = i10;
            this.f120318d = j10;
            this.f120319e = timeUnit;
            this.f120320f = h0Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.flowables.a<T> call() {
            return this.f120316b.i5(this.f120317c, this.f120318d, this.f120319e, this.f120320f);
        }
    }

    public static final class c<T, U> implements kh.o<T, org.reactivestreams.c<U>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kh.o<? super T, ? extends Iterable<? extends U>> f120321b;

        c(kh.o<? super T, ? extends Iterable<? extends U>> oVar) {
            this.f120321b = oVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public org.reactivestreams.c<U> apply(T t10) throws Exception {
            return new FlowableFromIterable((Iterable) io.reactivex.internal.functions.a.g(this.f120321b.apply(t10), "The mapper returned a null Iterable"));
        }
    }

    public static final class d<U, R, T> implements kh.o<U, R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kh.c<? super T, ? super U, ? extends R> f120322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final T f120323c;

        d(kh.c<? super T, ? super U, ? extends R> cVar, T t10) {
            this.f120322b = cVar;
            this.f120323c = t10;
        }

        @Override // kh.o
        public R apply(U u10) throws Exception {
            return this.f120322b.apply(this.f120323c, u10);
        }
    }

    public static final class e<T, R, U> implements kh.o<T, org.reactivestreams.c<R>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kh.c<? super T, ? super U, ? extends R> f120324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kh.o<? super T, ? extends org.reactivestreams.c<? extends U>> f120325c;

        e(kh.c<? super T, ? super U, ? extends R> cVar, kh.o<? super T, ? extends org.reactivestreams.c<? extends U>> oVar) {
            this.f120324b = cVar;
            this.f120325c = oVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public org.reactivestreams.c<R> apply(T t10) throws Exception {
            return new q0((org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120325c.apply(t10), "The mapper returned a null Publisher"), new d(this.f120324b, t10));
        }
    }

    public static final class f<T, U> implements kh.o<T, org.reactivestreams.c<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.o<? super T, ? extends org.reactivestreams.c<U>> f120326b;

        f(kh.o<? super T, ? extends org.reactivestreams.c<U>> oVar) {
            this.f120326b = oVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public org.reactivestreams.c<T> apply(T t10) throws Exception {
            return new d1((org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120326b.apply(t10), "The itemDelay returned a null Publisher"), 1L).K3(Functions.n(t10)).A1(t10);
        }
    }

    public static final class g<T> implements Callable<io.reactivex.flowables.a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.j<T> f120327b;

        g(io.reactivex.j<T> jVar) {
            this.f120327b = jVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.flowables.a<T> call() {
            return this.f120327b.f5();
        }
    }

    public static final class h<T, R> implements kh.o<io.reactivex.j<T>, org.reactivestreams.c<R>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kh.o<? super io.reactivex.j<T>, ? extends org.reactivestreams.c<R>> f120328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.reactivex.h0 f120329c;

        h(kh.o<? super io.reactivex.j<T>, ? extends org.reactivestreams.c<R>> oVar, io.reactivex.h0 h0Var) {
            this.f120328b = oVar;
            this.f120329c = h0Var;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public org.reactivestreams.c<R> apply(io.reactivex.j<T> jVar) throws Exception {
            return io.reactivex.j.Y2((org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f120328b.apply(jVar), "The selector returned a null Publisher")).l4(this.f120329c);
        }
    }

    public static final class i<T, S> implements kh.c<S, io.reactivex.i<T>, S> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.b<S, io.reactivex.i<T>> f120330b;

        i(kh.b<S, io.reactivex.i<T>> bVar) {
            this.f120330b = bVar;
        }

        @Override // kh.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s10, io.reactivex.i<T> iVar) throws Exception {
            this.f120330b.accept(s10, iVar);
            return s10;
        }
    }

    public static final class j<T, S> implements kh.c<S, io.reactivex.i<T>, S> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.g<io.reactivex.i<T>> f120331b;

        j(kh.g<io.reactivex.i<T>> gVar) {
            this.f120331b = gVar;
        }

        @Override // kh.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s10, io.reactivex.i<T> iVar) throws Exception {
            this.f120331b.accept(iVar);
            return s10;
        }
    }

    public static final class k<T> implements kh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<T> f120332b;

        k(org.reactivestreams.d<T> dVar) {
            this.f120332b = dVar;
        }

        @Override // kh.a
        public void run() throws Exception {
            this.f120332b.onComplete();
        }
    }

    public static final class l<T> implements kh.g<Throwable> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<T> f120333b;

        l(org.reactivestreams.d<T> dVar) {
            this.f120333b = dVar;
        }

        @Override // kh.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) throws Exception {
            this.f120333b.onError(th2);
        }
    }

    public static final class m<T> implements kh.g<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<T> f120334b;

        m(org.reactivestreams.d<T> dVar) {
            this.f120334b = dVar;
        }

        @Override // kh.g
        public void accept(T t10) throws Exception {
            this.f120334b.onNext(t10);
        }
    }

    public static final class n<T> implements Callable<io.reactivex.flowables.a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.j<T> f120335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f120336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TimeUnit f120337d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final io.reactivex.h0 f120338e;

        n(io.reactivex.j<T> jVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            this.f120335b = jVar;
            this.f120336c = j10;
            this.f120337d = timeUnit;
            this.f120338e = h0Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.flowables.a<T> call() {
            return this.f120335b.l5(this.f120336c, this.f120337d, this.f120338e);
        }
    }

    public static final class o<T, R> implements kh.o<List<org.reactivestreams.c<? extends T>>, org.reactivestreams.c<? extends R>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kh.o<? super Object[], ? extends R> f120339b;

        o(kh.o<? super Object[], ? extends R> oVar) {
            this.f120339b = oVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public org.reactivestreams.c<? extends R> apply(List<org.reactivestreams.c<? extends T>> list) {
            return io.reactivex.j.H8(list, this.f120339b, false, io.reactivex.j.Y());
        }
    }

    private FlowableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> kh.o<T, org.reactivestreams.c<U>> a(kh.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return new c(oVar);
    }

    public static <T, U, R> kh.o<T, org.reactivestreams.c<R>> b(kh.o<? super T, ? extends org.reactivestreams.c<? extends U>> oVar, kh.c<? super T, ? super U, ? extends R> cVar) {
        return new e(cVar, oVar);
    }

    public static <T, U> kh.o<T, org.reactivestreams.c<T>> c(kh.o<? super T, ? extends org.reactivestreams.c<U>> oVar) {
        return new f(oVar);
    }

    public static <T> Callable<io.reactivex.flowables.a<T>> d(io.reactivex.j<T> jVar) {
        return new g(jVar);
    }

    public static <T> Callable<io.reactivex.flowables.a<T>> e(io.reactivex.j<T> jVar, int i10) {
        return new a(jVar, i10);
    }

    public static <T> Callable<io.reactivex.flowables.a<T>> f(io.reactivex.j<T> jVar, int i10, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        return new b(jVar, i10, j10, timeUnit, h0Var);
    }

    public static <T> Callable<io.reactivex.flowables.a<T>> g(io.reactivex.j<T> jVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        return new n(jVar, j10, timeUnit, h0Var);
    }

    public static <T, R> kh.o<io.reactivex.j<T>, org.reactivestreams.c<R>> h(kh.o<? super io.reactivex.j<T>, ? extends org.reactivestreams.c<R>> oVar, io.reactivex.h0 h0Var) {
        return new h(oVar, h0Var);
    }

    public static <T, S> kh.c<S, io.reactivex.i<T>, S> i(kh.b<S, io.reactivex.i<T>> bVar) {
        return new i(bVar);
    }

    public static <T, S> kh.c<S, io.reactivex.i<T>, S> j(kh.g<io.reactivex.i<T>> gVar) {
        return new j(gVar);
    }

    public static <T> kh.a k(org.reactivestreams.d<T> dVar) {
        return new k(dVar);
    }

    public static <T> kh.g<Throwable> l(org.reactivestreams.d<T> dVar) {
        return new l(dVar);
    }

    public static <T> kh.g<T> m(org.reactivestreams.d<T> dVar) {
        return new m(dVar);
    }

    public static <T, R> kh.o<List<org.reactivestreams.c<? extends T>>, org.reactivestreams.c<? extends R>> n(kh.o<? super Object[], ? extends R> oVar) {
        return new o(oVar);
    }
}
