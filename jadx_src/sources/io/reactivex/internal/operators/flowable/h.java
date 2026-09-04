package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.subscribers.BlockingSubscriber;
import io.reactivex.internal.subscribers.BoundedSubscriber;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: FlowableBlockingSubscribe.java */
/* JADX INFO: loaded from: classes12.dex */
public final class h {
    private h() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> void a(org.reactivestreams.c<? extends T> cVar) {
        io.reactivex.internal.util.d dVar = new io.reactivex.internal.util.d();
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(Functions.h(), dVar, dVar, Functions.f119567l);
        cVar.g(lambdaSubscriber);
        io.reactivex.internal.util.c.a(dVar, lambdaSubscriber);
        Throwable th2 = dVar.f123869b;
        if (th2 != null) {
            throw ExceptionHelper.f(th2);
        }
    }

    public static <T> void b(org.reactivestreams.c<? extends T> cVar, kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar) {
        io.reactivex.internal.functions.a.g(gVar, "onNext is null");
        io.reactivex.internal.functions.a.g(gVar2, "onError is null");
        io.reactivex.internal.functions.a.g(aVar, "onComplete is null");
        d(cVar, new LambdaSubscriber(gVar, gVar2, aVar, Functions.f119567l));
    }

    public static <T> void c(org.reactivestreams.c<? extends T> cVar, kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar, int i10) {
        io.reactivex.internal.functions.a.g(gVar, "onNext is null");
        io.reactivex.internal.functions.a.g(gVar2, "onError is null");
        io.reactivex.internal.functions.a.g(aVar, "onComplete is null");
        io.reactivex.internal.functions.a.h(i10, "number > 0 required");
        d(cVar, new BoundedSubscriber(gVar, gVar2, aVar, Functions.d(i10), i10));
    }

    public static <T> void d(org.reactivestreams.c<? extends T> cVar, org.reactivestreams.d<? super T> dVar) {
        Object objPoll;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingSubscriber blockingSubscriber = new BlockingSubscriber(linkedBlockingQueue);
        cVar.g(blockingSubscriber);
        do {
            try {
                if (blockingSubscriber.a()) {
                    return;
                }
                objPoll = linkedBlockingQueue.poll();
                if (objPoll == null) {
                    if (blockingSubscriber.a()) {
                        return;
                    }
                    io.reactivex.internal.util.c.b();
                    objPoll = linkedBlockingQueue.take();
                }
                if (blockingSubscriber.a() || objPoll == BlockingSubscriber.f123752c) {
                    return;
                }
            } catch (InterruptedException e10) {
                blockingSubscriber.cancel();
                dVar.onError(e10);
                return;
            }
        } while (!NotificationLite.acceptFull(objPoll, dVar));
    }
}
