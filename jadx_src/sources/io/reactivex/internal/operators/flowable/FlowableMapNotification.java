package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableMapNotification<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.o<? super T, ? extends R> f120383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.o<? super Throwable, ? extends R> f120384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Callable<? extends R> f120385f;

    public static final class MapNotificationSubscriber<T, R> extends SinglePostCompleteSubscriber<T, R> {
        private static final long serialVersionUID = 2757120512858778108L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final kh.o<? super T, ? extends R> f120386h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final kh.o<? super Throwable, ? extends R> f120387i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final Callable<? extends R> f120388j;

        MapNotificationSubscriber(org.reactivestreams.d<? super R> dVar, kh.o<? super T, ? extends R> oVar, kh.o<? super Throwable, ? extends R> oVar2, Callable<? extends R> callable) {
            super(dVar);
            this.f120386h = oVar;
            this.f120387i = oVar2;
            this.f120388j = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.d
        public void onComplete() {
            try {
                a(io.reactivex.internal.functions.a.g(this.f120388j.call(), "The onComplete publisher returned is null"));
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f123780b.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            try {
                a(io.reactivex.internal.functions.a.g(this.f120387i.apply(th2), "The onError publisher returned is null"));
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f123780b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            try {
                Object objG = io.reactivex.internal.functions.a.g(this.f120386h.apply(t10), "The onNext publisher returned is null");
                this.f123783e++;
                this.f123780b.onNext(objG);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f123780b.onError(th2);
            }
        }
    }

    public FlowableMapNotification(io.reactivex.j<T> jVar, kh.o<? super T, ? extends R> oVar, kh.o<? super Throwable, ? extends R> oVar2, Callable<? extends R> callable) {
        super(jVar);
        this.f120383d = oVar;
        this.f120384e = oVar2;
        this.f120385f = callable;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        this.f121039c.j6(new MapNotificationSubscriber(dVar, this.f120383d, this.f120384e, this.f120385f));
    }
}
