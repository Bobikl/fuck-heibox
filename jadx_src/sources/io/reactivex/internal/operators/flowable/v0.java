package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: FlowableScalarXMap.java */
/* JADX INFO: loaded from: classes12.dex */
public final class v0 {

    /* JADX INFO: compiled from: FlowableScalarXMap.java */
    public static final class a<T, R> extends io.reactivex.j<R> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final T f121345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> f121346d;

        a(T t10, kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar) {
            this.f121345c = t10;
            this.f121346d = oVar;
        }

        @Override // io.reactivex.j
        public void k6(org.reactivestreams.d<? super R> dVar) {
            try {
                org.reactivestreams.c cVar = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(this.f121346d.apply(this.f121345c), "The mapper returned a null Publisher");
                if (!(cVar instanceof Callable)) {
                    cVar.g(dVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) cVar).call();
                    if (objCall == null) {
                        EmptySubscription.complete(dVar);
                    } else {
                        dVar.onSubscribe(new ScalarSubscription(dVar, objCall));
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    EmptySubscription.error(th2, dVar);
                }
            } catch (Throwable th3) {
                EmptySubscription.error(th3, dVar);
            }
        }
    }

    private v0() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> io.reactivex.j<U> a(T t10, kh.o<? super T, ? extends org.reactivestreams.c<? extends U>> oVar) {
        return io.reactivex.plugins.a.P(new a(t10, oVar));
    }

    public static <T, R> boolean b(org.reactivestreams.c<T> cVar, org.reactivestreams.d<? super R> dVar, kh.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar) {
        if (!(cVar instanceof Callable)) {
            return false;
        }
        try {
            a.a.a.a.d.p.d.c.C0001c.a aVar = (Object) ((Callable) cVar).call();
            if (aVar == null) {
                EmptySubscription.complete(dVar);
                return true;
            }
            try {
                org.reactivestreams.c cVar2 = (org.reactivestreams.c) io.reactivex.internal.functions.a.g(oVar.apply(aVar), "The mapper returned a null Publisher");
                if (cVar2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) cVar2).call();
                        if (objCall == null) {
                            EmptySubscription.complete(dVar);
                            return true;
                        }
                        dVar.onSubscribe(new ScalarSubscription(dVar, objCall));
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        EmptySubscription.error(th2, dVar);
                        return true;
                    }
                } else {
                    cVar2.g(dVar);
                }
                return true;
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                EmptySubscription.error(th3, dVar);
                return true;
            }
        } catch (Throwable th4) {
            io.reactivex.exceptions.a.b(th4);
            EmptySubscription.error(th4, dVar);
            return true;
        }
    }
}
