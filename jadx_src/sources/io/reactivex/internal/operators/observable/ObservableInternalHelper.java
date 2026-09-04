package io.reactivex.internal.operators.observable;

import io.reactivex.internal.functions.Functions;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableInternalHelper {

    public enum MapToInt implements kh.o<Object, Object> {
        INSTANCE;

        @Override // kh.o
        public Object apply(Object obj) throws Exception {
            return 0;
        }
    }

    public static final class a<T> implements Callable<io.reactivex.observables.a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.z<T> f122246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f122247c;

        a(io.reactivex.z<T> zVar, int i10) {
            this.f122246b = zVar;
            this.f122247c = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.observables.a<T> call() {
            return this.f122246b.E4(this.f122247c);
        }
    }

    public static final class b<T> implements Callable<io.reactivex.observables.a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.z<T> f122248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f122249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f122250d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final TimeUnit f122251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final io.reactivex.h0 f122252f;

        b(io.reactivex.z<T> zVar, int i10, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            this.f122248b = zVar;
            this.f122249c = i10;
            this.f122250d = j10;
            this.f122251e = timeUnit;
            this.f122252f = h0Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.observables.a<T> call() {
            return this.f122248b.G4(this.f122249c, this.f122250d, this.f122251e, this.f122252f);
        }
    }

    public static final class c<T, U> implements kh.o<T, io.reactivex.e0<U>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kh.o<? super T, ? extends Iterable<? extends U>> f122253b;

        c(kh.o<? super T, ? extends Iterable<? extends U>> oVar) {
            this.f122253b = oVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.e0<U> apply(T t10) throws Exception {
            return new m0((Iterable) io.reactivex.internal.functions.a.g(this.f122253b.apply(t10), "The mapper returned a null Iterable"));
        }
    }

    public static final class d<U, R, T> implements kh.o<U, R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kh.c<? super T, ? super U, ? extends R> f122254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final T f122255c;

        d(kh.c<? super T, ? super U, ? extends R> cVar, T t10) {
            this.f122254b = cVar;
            this.f122255c = t10;
        }

        @Override // kh.o
        public R apply(U u10) throws Exception {
            return this.f122254b.apply(this.f122255c, u10);
        }
    }

    public static final class e<T, R, U> implements kh.o<T, io.reactivex.e0<R>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kh.c<? super T, ? super U, ? extends R> f122256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kh.o<? super T, ? extends io.reactivex.e0<? extends U>> f122257c;

        e(kh.c<? super T, ? super U, ? extends R> cVar, kh.o<? super T, ? extends io.reactivex.e0<? extends U>> oVar) {
            this.f122256b = cVar;
            this.f122257c = oVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.e0<R> apply(T t10) throws Exception {
            return new x0((io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122257c.apply(t10), "The mapper returned a null ObservableSource"), new d(this.f122256b, t10));
        }
    }

    public static final class f<T, U> implements kh.o<T, io.reactivex.e0<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.o<? super T, ? extends io.reactivex.e0<U>> f122258b;

        f(kh.o<? super T, ? extends io.reactivex.e0<U>> oVar) {
            this.f122258b = oVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.e0<T> apply(T t10) throws Exception {
            return new p1((io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122258b.apply(t10), "The itemDelay returned a null ObservableSource"), 1L).z3(Functions.n(t10)).u1(t10);
        }
    }

    public static final class g<T> implements kh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<T> f122259b;

        g(io.reactivex.g0<T> g0Var) {
            this.f122259b = g0Var;
        }

        @Override // kh.a
        public void run() throws Exception {
            this.f122259b.onComplete();
        }
    }

    public static final class h<T> implements kh.g<Throwable> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<T> f122260b;

        h(io.reactivex.g0<T> g0Var) {
            this.f122260b = g0Var;
        }

        @Override // kh.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) throws Exception {
            this.f122260b.onError(th2);
        }
    }

    public static final class i<T> implements kh.g<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<T> f122261b;

        i(io.reactivex.g0<T> g0Var) {
            this.f122261b = g0Var;
        }

        @Override // kh.g
        public void accept(T t10) throws Exception {
            this.f122261b.onNext(t10);
        }
    }

    public static final class j<T> implements Callable<io.reactivex.observables.a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.z<T> f122262b;

        j(io.reactivex.z<T> zVar) {
            this.f122262b = zVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.observables.a<T> call() {
            return this.f122262b.D4();
        }
    }

    public static final class k<T, R> implements kh.o<io.reactivex.z<T>, io.reactivex.e0<R>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kh.o<? super io.reactivex.z<T>, ? extends io.reactivex.e0<R>> f122263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.reactivex.h0 f122264c;

        k(kh.o<? super io.reactivex.z<T>, ? extends io.reactivex.e0<R>> oVar, io.reactivex.h0 h0Var) {
            this.f122263b = oVar;
            this.f122264c = h0Var;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.e0<R> apply(io.reactivex.z<T> zVar) throws Exception {
            return io.reactivex.z.O7((io.reactivex.e0) io.reactivex.internal.functions.a.g(this.f122263b.apply(zVar), "The selector returned a null ObservableSource")).a4(this.f122264c);
        }
    }

    public static final class l<T, S> implements kh.c<S, io.reactivex.i<T>, S> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.b<S, io.reactivex.i<T>> f122265b;

        l(kh.b<S, io.reactivex.i<T>> bVar) {
            this.f122265b = bVar;
        }

        @Override // kh.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s10, io.reactivex.i<T> iVar) throws Exception {
            this.f122265b.accept(s10, iVar);
            return s10;
        }
    }

    public static final class m<T, S> implements kh.c<S, io.reactivex.i<T>, S> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kh.g<io.reactivex.i<T>> f122266b;

        m(kh.g<io.reactivex.i<T>> gVar) {
            this.f122266b = gVar;
        }

        @Override // kh.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s10, io.reactivex.i<T> iVar) throws Exception {
            this.f122266b.accept(iVar);
            return s10;
        }
    }

    public static final class n<T> implements Callable<io.reactivex.observables.a<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.z<T> f122267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f122268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TimeUnit f122269d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final io.reactivex.h0 f122270e;

        n(io.reactivex.z<T> zVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
            this.f122267b = zVar;
            this.f122268c = j10;
            this.f122269d = timeUnit;
            this.f122270e = h0Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.observables.a<T> call() {
            return this.f122267b.J4(this.f122268c, this.f122269d, this.f122270e);
        }
    }

    public static final class o<T, R> implements kh.o<List<io.reactivex.e0<? extends T>>, io.reactivex.e0<? extends R>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kh.o<? super Object[], ? extends R> f122271b;

        o(kh.o<? super Object[], ? extends R> oVar) {
            this.f122271b = oVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.e0<? extends R> apply(List<io.reactivex.e0<? extends T>> list) {
            return io.reactivex.z.c8(list, this.f122271b, false, io.reactivex.z.T());
        }
    }

    private ObservableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> kh.o<T, io.reactivex.e0<U>> a(kh.o<? super T, ? extends Iterable<? extends U>> oVar) {
        return new c(oVar);
    }

    public static <T, U, R> kh.o<T, io.reactivex.e0<R>> b(kh.o<? super T, ? extends io.reactivex.e0<? extends U>> oVar, kh.c<? super T, ? super U, ? extends R> cVar) {
        return new e(cVar, oVar);
    }

    public static <T, U> kh.o<T, io.reactivex.e0<T>> c(kh.o<? super T, ? extends io.reactivex.e0<U>> oVar) {
        return new f(oVar);
    }

    public static <T> kh.a d(io.reactivex.g0<T> g0Var) {
        return new g(g0Var);
    }

    public static <T> kh.g<Throwable> e(io.reactivex.g0<T> g0Var) {
        return new h(g0Var);
    }

    public static <T> kh.g<T> f(io.reactivex.g0<T> g0Var) {
        return new i(g0Var);
    }

    public static <T> Callable<io.reactivex.observables.a<T>> g(io.reactivex.z<T> zVar) {
        return new j(zVar);
    }

    public static <T> Callable<io.reactivex.observables.a<T>> h(io.reactivex.z<T> zVar, int i10) {
        return new a(zVar, i10);
    }

    public static <T> Callable<io.reactivex.observables.a<T>> i(io.reactivex.z<T> zVar, int i10, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        return new b(zVar, i10, j10, timeUnit, h0Var);
    }

    public static <T> Callable<io.reactivex.observables.a<T>> j(io.reactivex.z<T> zVar, long j10, TimeUnit timeUnit, io.reactivex.h0 h0Var) {
        return new n(zVar, j10, timeUnit, h0Var);
    }

    public static <T, R> kh.o<io.reactivex.z<T>, io.reactivex.e0<R>> k(kh.o<? super io.reactivex.z<T>, ? extends io.reactivex.e0<R>> oVar, io.reactivex.h0 h0Var) {
        return new k(oVar, h0Var);
    }

    public static <T, S> kh.c<S, io.reactivex.i<T>, S> l(kh.b<S, io.reactivex.i<T>> bVar) {
        return new l(bVar);
    }

    public static <T, S> kh.c<S, io.reactivex.i<T>, S> m(kh.g<io.reactivex.i<T>> gVar) {
        return new m(gVar);
    }

    public static <T, R> kh.o<List<io.reactivex.e0<? extends T>>, io.reactivex.e0<? extends R>> n(kh.o<? super Object[], ? extends R> oVar) {
        return new o(oVar);
    }
}
