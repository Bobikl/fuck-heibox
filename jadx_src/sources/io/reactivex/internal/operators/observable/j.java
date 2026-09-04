package io.reactivex.internal.operators.observable;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.BlockingObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: ObservableBlockingSubscribe.java */
/* JADX INFO: loaded from: classes5.dex */
public final class j {
    private j() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> void a(io.reactivex.e0<? extends T> e0Var) {
        io.reactivex.internal.util.d dVar = new io.reactivex.internal.util.d();
        LambdaObserver lambdaObserver = new LambdaObserver(Functions.h(), dVar, dVar, Functions.h());
        e0Var.g(lambdaObserver);
        io.reactivex.internal.util.c.a(dVar, lambdaObserver);
        Throwable th2 = dVar.f123869b;
        if (th2 != null) {
            throw ExceptionHelper.f(th2);
        }
    }

    public static <T> void b(io.reactivex.e0<? extends T> e0Var, io.reactivex.g0<? super T> g0Var) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingObserver blockingObserver = new BlockingObserver(linkedBlockingQueue);
        g0Var.onSubscribe(blockingObserver);
        e0Var.g(blockingObserver);
        while (!blockingObserver.isDisposed()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e10) {
                    blockingObserver.dispose();
                    g0Var.onError(e10);
                    return;
                }
            }
            if (blockingObserver.isDisposed() || e0Var == BlockingObserver.f119599c || NotificationLite.acceptFull(objPoll, g0Var)) {
                return;
            }
        }
    }

    public static <T> void c(io.reactivex.e0<? extends T> e0Var, kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar) {
        io.reactivex.internal.functions.a.g(gVar, "onNext is null");
        io.reactivex.internal.functions.a.g(gVar2, "onError is null");
        io.reactivex.internal.functions.a.g(aVar, "onComplete is null");
        b(e0Var, new LambdaObserver(gVar, gVar2, aVar, Functions.h()));
    }
}
