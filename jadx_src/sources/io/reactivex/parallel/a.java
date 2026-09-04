package io.reactivex.parallel;

import io.reactivex.annotations.BackpressureKind;
import io.reactivex.h0;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.parallel.ParallelCollect;
import io.reactivex.internal.operators.parallel.ParallelFromPublisher;
import io.reactivex.internal.operators.parallel.ParallelJoin;
import io.reactivex.internal.operators.parallel.ParallelReduce;
import io.reactivex.internal.operators.parallel.ParallelReduceFull;
import io.reactivex.internal.operators.parallel.ParallelRunOn;
import io.reactivex.internal.operators.parallel.ParallelSortedJoin;
import io.reactivex.internal.operators.parallel.f;
import io.reactivex.internal.operators.parallel.g;
import io.reactivex.internal.operators.parallel.h;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.ListAddBiConsumer;
import io.reactivex.internal.util.i;
import io.reactivex.j;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import jh.e;
import kh.o;
import kh.q;
import kh.r;
import org.reactivestreams.d;

/* JADX INFO: compiled from: ParallelFlowable.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a<T> {
    @e
    @jh.c
    public static <T> a<T> A(@e org.reactivestreams.c<? extends T> cVar, int i10, int i11) {
        io.reactivex.internal.functions.a.g(cVar, "source");
        io.reactivex.internal.functions.a.h(i10, "parallelism");
        io.reactivex.internal.functions.a.h(i11, "prefetch");
        return io.reactivex.plugins.a.V(new ParallelFromPublisher(cVar, i10, i11));
    }

    @e
    @jh.c
    public static <T> a<T> B(@e org.reactivestreams.c<T>... cVarArr) {
        if (cVarArr.length != 0) {
            return io.reactivex.plugins.a.V(new f(cVarArr));
        }
        throw new IllegalArgumentException("Zero publishers not supported");
    }

    @jh.c
    public static <T> a<T> y(@e org.reactivestreams.c<? extends T> cVar) {
        return A(cVar, Runtime.getRuntime().availableProcessors(), j.Y());
    }

    @jh.c
    public static <T> a<T> z(@e org.reactivestreams.c<? extends T> cVar, int i10) {
        return A(cVar, i10, j.Y());
    }

    @e
    @jh.c
    public final <R> a<R> C(@e o<? super T, ? extends R> oVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper");
        return io.reactivex.plugins.a.V(new g(this, oVar));
    }

    @e
    @jh.c
    public final <R> a<R> D(@e o<? super T, ? extends R> oVar, @e ParallelFailureHandling parallelFailureHandling) {
        io.reactivex.internal.functions.a.g(oVar, "mapper");
        io.reactivex.internal.functions.a.g(parallelFailureHandling, "errorHandler is null");
        return io.reactivex.plugins.a.V(new h(this, oVar, parallelFailureHandling));
    }

    @e
    @jh.c
    public final <R> a<R> E(@e o<? super T, ? extends R> oVar, @e kh.c<? super Long, ? super Throwable, ParallelFailureHandling> cVar) {
        io.reactivex.internal.functions.a.g(oVar, "mapper");
        io.reactivex.internal.functions.a.g(cVar, "errorHandler is null");
        return io.reactivex.plugins.a.V(new h(this, oVar, cVar));
    }

    public abstract int F();

    @e
    @jh.c
    public final j<T> G(@e kh.c<T, T, T> cVar) {
        io.reactivex.internal.functions.a.g(cVar, "reducer");
        return io.reactivex.plugins.a.P(new ParallelReduceFull(this, cVar));
    }

    @e
    @jh.c
    public final <R> a<R> H(@e Callable<R> callable, @e kh.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.a.g(callable, "initialSupplier");
        io.reactivex.internal.functions.a.g(cVar, "reducer");
        return io.reactivex.plugins.a.V(new ParallelReduce(this, callable, cVar));
    }

    @e
    @jh.c
    public final a<T> I(@e h0 h0Var) {
        return J(h0Var, j.Y());
    }

    @e
    @jh.c
    public final a<T> J(@e h0 h0Var, int i10) {
        io.reactivex.internal.functions.a.g(h0Var, "scheduler");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.V(new ParallelRunOn(this, h0Var, i10));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @jh.g("none")
    public final j<T> K() {
        return L(j.Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @e
    @jh.g("none")
    public final j<T> L(int i10) {
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.P(new ParallelJoin(this, i10, false));
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @e
    @jh.g("none")
    public final j<T> M() {
        return N(j.Y());
    }

    @jh.a(BackpressureKind.FULL)
    @jh.c
    @e
    @jh.g("none")
    public final j<T> N(int i10) {
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.P(new ParallelJoin(this, i10, true));
    }

    @e
    @jh.c
    public final j<T> O(@e Comparator<? super T> comparator) {
        return P(comparator, 16);
    }

    @e
    @jh.c
    public final j<T> P(@e Comparator<? super T> comparator, int i10) {
        io.reactivex.internal.functions.a.g(comparator, "comparator is null");
        io.reactivex.internal.functions.a.h(i10, "capacityHint");
        return io.reactivex.plugins.a.P(new ParallelSortedJoin(H(Functions.f((i10 / F()) + 1), ListAddBiConsumer.instance()).C(new io.reactivex.internal.util.o(comparator)), comparator));
    }

    public abstract void Q(@e d<? super T>[] dVarArr);

    @e
    @jh.c
    public final <U> U R(@e o<? super a<T>, U> oVar) {
        try {
            return (U) ((o) io.reactivex.internal.functions.a.g(oVar, "converter is null")).apply(this);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            throw ExceptionHelper.f(th2);
        }
    }

    @e
    @jh.c
    public final j<List<T>> S(@e Comparator<? super T> comparator) {
        return T(comparator, 16);
    }

    @e
    @jh.c
    public final j<List<T>> T(@e Comparator<? super T> comparator, int i10) {
        io.reactivex.internal.functions.a.g(comparator, "comparator is null");
        io.reactivex.internal.functions.a.h(i10, "capacityHint");
        return io.reactivex.plugins.a.P(H(Functions.f((i10 / F()) + 1), ListAddBiConsumer.instance()).C(new io.reactivex.internal.util.o(comparator)).G(new i(comparator)));
    }

    protected final boolean U(@e d<?>[] dVarArr) {
        int iF = F();
        if (dVarArr.length == iF) {
            return true;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("parallelism = " + iF + ", subscribers = " + dVarArr.length);
        int length = dVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            EmptySubscription.error(illegalArgumentException, dVarArr[i10]);
        }
        return false;
    }

    @e
    @jh.c
    public final <R> R a(@e b<T, R> bVar) {
        return (R) ((b) io.reactivex.internal.functions.a.g(bVar, "converter is null")).e(this);
    }

    @e
    @jh.c
    public final <C> a<C> b(@e Callable<? extends C> callable, @e kh.b<? super C, ? super T> bVar) {
        io.reactivex.internal.functions.a.g(callable, "collectionSupplier is null");
        io.reactivex.internal.functions.a.g(bVar, "collector is null");
        return io.reactivex.plugins.a.V(new ParallelCollect(this, callable, bVar));
    }

    @e
    @jh.c
    public final <U> a<U> c(@e c<T, U> cVar) {
        return io.reactivex.plugins.a.V(((c) io.reactivex.internal.functions.a.g(cVar, "composer is null")).e(this));
    }

    @e
    @jh.c
    public final <R> a<R> d(@e o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar) {
        return e(oVar, 2);
    }

    @e
    @jh.c
    public final <R> a<R> e(@e o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.a(this, oVar, i10, ErrorMode.IMMEDIATE));
    }

    @e
    @jh.c
    public final <R> a<R> f(@e o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, int i10, boolean z10) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "prefetch");
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.a(this, oVar, i10, z10 ? ErrorMode.END : ErrorMode.BOUNDARY));
    }

    @e
    @jh.c
    public final <R> a<R> g(@e o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, boolean z10) {
        return f(oVar, 2, z10);
    }

    @e
    @jh.c
    public final a<T> h(@e kh.g<? super T> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "onAfterNext is null");
        kh.g gVarH = Functions.h();
        kh.g gVarH2 = Functions.h();
        kh.a aVar = Functions.f119558c;
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.i(this, gVarH, gVar, gVarH2, aVar, aVar, Functions.h(), Functions.f119562g, aVar));
    }

    @e
    @jh.c
    public final a<T> i(@e kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "onAfterTerminate is null");
        kh.g gVarH = Functions.h();
        kh.g gVarH2 = Functions.h();
        kh.g gVarH3 = Functions.h();
        kh.a aVar2 = Functions.f119558c;
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.i(this, gVarH, gVarH2, gVarH3, aVar2, aVar, Functions.h(), Functions.f119562g, aVar2));
    }

    @e
    @jh.c
    public final a<T> j(@e kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "onCancel is null");
        kh.g gVarH = Functions.h();
        kh.g gVarH2 = Functions.h();
        kh.g gVarH3 = Functions.h();
        kh.a aVar2 = Functions.f119558c;
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.i(this, gVarH, gVarH2, gVarH3, aVar2, aVar2, Functions.h(), Functions.f119562g, aVar));
    }

    @e
    @jh.c
    public final a<T> k(@e kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "onComplete is null");
        kh.g gVarH = Functions.h();
        kh.g gVarH2 = Functions.h();
        kh.g gVarH3 = Functions.h();
        kh.a aVar2 = Functions.f119558c;
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.i(this, gVarH, gVarH2, gVarH3, aVar, aVar2, Functions.h(), Functions.f119562g, aVar2));
    }

    @e
    @jh.c
    public final a<T> l(@e kh.g<Throwable> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "onError is null");
        kh.g gVarH = Functions.h();
        kh.g gVarH2 = Functions.h();
        kh.a aVar = Functions.f119558c;
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.i(this, gVarH, gVarH2, gVar, aVar, aVar, Functions.h(), Functions.f119562g, aVar));
    }

    @e
    @jh.c
    public final a<T> m(@e kh.g<? super T> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "onNext is null");
        kh.g gVarH = Functions.h();
        kh.g gVarH2 = Functions.h();
        kh.a aVar = Functions.f119558c;
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.i(this, gVar, gVarH, gVarH2, aVar, aVar, Functions.h(), Functions.f119562g, aVar));
    }

    @e
    @jh.c
    public final a<T> n(@e kh.g<? super T> gVar, @e ParallelFailureHandling parallelFailureHandling) {
        io.reactivex.internal.functions.a.g(gVar, "onNext is null");
        io.reactivex.internal.functions.a.g(parallelFailureHandling, "errorHandler is null");
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.b(this, gVar, parallelFailureHandling));
    }

    @e
    @jh.c
    public final a<T> o(@e kh.g<? super T> gVar, @e kh.c<? super Long, ? super Throwable, ParallelFailureHandling> cVar) {
        io.reactivex.internal.functions.a.g(gVar, "onNext is null");
        io.reactivex.internal.functions.a.g(cVar, "errorHandler is null");
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.b(this, gVar, cVar));
    }

    @e
    @jh.c
    public final a<T> p(@e q qVar) {
        io.reactivex.internal.functions.a.g(qVar, "onRequest is null");
        kh.g gVarH = Functions.h();
        kh.g gVarH2 = Functions.h();
        kh.g gVarH3 = Functions.h();
        kh.a aVar = Functions.f119558c;
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.i(this, gVarH, gVarH2, gVarH3, aVar, aVar, Functions.h(), qVar, aVar));
    }

    @e
    @jh.c
    public final a<T> q(@e kh.g<? super org.reactivestreams.e> gVar) {
        io.reactivex.internal.functions.a.g(gVar, "onSubscribe is null");
        kh.g gVarH = Functions.h();
        kh.g gVarH2 = Functions.h();
        kh.g gVarH3 = Functions.h();
        kh.a aVar = Functions.f119558c;
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.i(this, gVarH, gVarH2, gVarH3, aVar, aVar, gVar, Functions.f119562g, aVar));
    }

    @jh.c
    public final a<T> r(@e r<? super T> rVar) {
        io.reactivex.internal.functions.a.g(rVar, "predicate");
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.c(this, rVar));
    }

    @jh.c
    public final a<T> s(@e r<? super T> rVar, @e ParallelFailureHandling parallelFailureHandling) {
        io.reactivex.internal.functions.a.g(rVar, "predicate");
        io.reactivex.internal.functions.a.g(parallelFailureHandling, "errorHandler is null");
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.d(this, rVar, parallelFailureHandling));
    }

    @jh.c
    public final a<T> t(@e r<? super T> rVar, @e kh.c<? super Long, ? super Throwable, ParallelFailureHandling> cVar) {
        io.reactivex.internal.functions.a.g(rVar, "predicate");
        io.reactivex.internal.functions.a.g(cVar, "errorHandler is null");
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.d(this, rVar, cVar));
    }

    @e
    @jh.c
    public final <R> a<R> u(@e o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar) {
        return x(oVar, false, Integer.MAX_VALUE, j.Y());
    }

    @e
    @jh.c
    public final <R> a<R> v(@e o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, boolean z10) {
        return x(oVar, z10, Integer.MAX_VALUE, j.Y());
    }

    @e
    @jh.c
    public final <R> a<R> w(@e o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, boolean z10, int i10) {
        return x(oVar, z10, i10, j.Y());
    }

    @e
    @jh.c
    public final <R> a<R> x(@e o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar, boolean z10, int i10, int i11) {
        io.reactivex.internal.functions.a.g(oVar, "mapper is null");
        io.reactivex.internal.functions.a.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.a.h(i11, "prefetch");
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.e(this, oVar, z10, i10, i11));
    }
}
