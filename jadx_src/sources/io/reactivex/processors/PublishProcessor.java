package io.reactivex.processors;

import androidx.compose.animation.core.s0;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jh.c;
import jh.f;
import org.reactivestreams.d;
import org.reactivestreams.e;

/* JADX INFO: loaded from: classes5.dex */
public final class PublishProcessor<T> extends a<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final PublishSubscription[] f123990e = new PublishSubscription[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final PublishSubscription[] f123991f = new PublishSubscription[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<PublishSubscription<T>[]> f123992c = new AtomicReference<>(f123991f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Throwable f123993d;

    public static final class PublishSubscription<T> extends AtomicLong implements e {
        private static final long serialVersionUID = 3562861878281475070L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d<? super T> f123994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final PublishProcessor<T> f123995c;

        PublishSubscription(d<? super T> dVar, PublishProcessor<T> publishProcessor) {
            this.f123994b = dVar;
            this.f123995c = publishProcessor;
        }

        public boolean a() {
            return get() == Long.MIN_VALUE;
        }

        boolean b() {
            return get() == 0;
        }

        public void c() {
            if (get() != Long.MIN_VALUE) {
                this.f123994b.onComplete();
            }
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f123995c.U8(this);
            }
        }

        public void d(Throwable th2) {
            if (get() != Long.MIN_VALUE) {
                this.f123994b.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        public void e(T t10) {
            long j10 = get();
            if (j10 == Long.MIN_VALUE) {
                return;
            }
            if (j10 != 0) {
                this.f123994b.onNext(t10);
                io.reactivex.internal.util.b.f(this, 1L);
            } else {
                cancel();
                this.f123994b.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.b(this, j10);
            }
        }
    }

    PublishProcessor() {
    }

    @jh.e
    @c
    public static <T> PublishProcessor<T> S8() {
        return new PublishProcessor<>();
    }

    @Override // io.reactivex.processors.a
    @f
    public Throwable M8() {
        if (this.f123992c.get() == f123990e) {
            return this.f123993d;
        }
        return null;
    }

    @Override // io.reactivex.processors.a
    public boolean N8() {
        return this.f123992c.get() == f123990e && this.f123993d == null;
    }

    @Override // io.reactivex.processors.a
    public boolean O8() {
        return this.f123992c.get().length != 0;
    }

    @Override // io.reactivex.processors.a
    public boolean P8() {
        return this.f123992c.get() == f123990e && this.f123993d != null;
    }

    boolean R8(PublishSubscription<T> publishSubscription) {
        PublishSubscription<T>[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = this.f123992c.get();
            if (publishSubscriptionArr == f123990e) {
                return false;
            }
            int length = publishSubscriptionArr.length;
            publishSubscriptionArr2 = new PublishSubscription[length + 1];
            System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
            publishSubscriptionArr2[length] = publishSubscription;
        } while (!s0.a(this.f123992c, publishSubscriptionArr, publishSubscriptionArr2));
        return true;
    }

    public boolean T8(T t10) {
        if (t10 == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        PublishSubscription<T>[] publishSubscriptionArr = this.f123992c.get();
        for (PublishSubscription<T> publishSubscription : publishSubscriptionArr) {
            if (publishSubscription.b()) {
                return false;
            }
        }
        for (PublishSubscription<T> publishSubscription2 : publishSubscriptionArr) {
            publishSubscription2.e(t10);
        }
        return true;
    }

    void U8(PublishSubscription<T> publishSubscription) {
        PublishSubscription<T>[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = this.f123992c.get();
            if (publishSubscriptionArr == f123990e || publishSubscriptionArr == f123991f) {
                return;
            }
            int length = publishSubscriptionArr.length;
            int i10 = -1;
            for (int i11 = 0; i11 < length; i11++) {
                if (publishSubscriptionArr[i11] == publishSubscription) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                publishSubscriptionArr2 = f123991f;
            } else {
                PublishSubscription[] publishSubscriptionArr3 = new PublishSubscription[length - 1];
                System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr3, 0, i10);
                System.arraycopy(publishSubscriptionArr, i10 + 1, publishSubscriptionArr3, i10, (length - i10) - 1);
                publishSubscriptionArr2 = publishSubscriptionArr3;
            }
        } while (!s0.a(this.f123992c, publishSubscriptionArr, publishSubscriptionArr2));
    }

    @Override // io.reactivex.j
    protected void k6(d<? super T> dVar) {
        PublishSubscription<T> publishSubscription = new PublishSubscription<>(dVar, this);
        dVar.onSubscribe(publishSubscription);
        if (R8(publishSubscription)) {
            if (publishSubscription.a()) {
                U8(publishSubscription);
            }
        } else {
            Throwable th2 = this.f123993d;
            if (th2 != null) {
                dVar.onError(th2);
            } else {
                dVar.onComplete();
            }
        }
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        PublishSubscription<T>[] publishSubscriptionArr = this.f123992c.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = f123990e;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            return;
        }
        for (PublishSubscription<T> publishSubscription : this.f123992c.getAndSet(publishSubscriptionArr2)) {
            publishSubscription.c();
        }
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishSubscription<T>[] publishSubscriptionArr = this.f123992c.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = f123990e;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f123993d = th2;
        for (PublishSubscription<T> publishSubscription : this.f123992c.getAndSet(publishSubscriptionArr2)) {
            publishSubscription.d(th2);
        }
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishSubscription<T> publishSubscription : this.f123992c.get()) {
            publishSubscription.e(t10);
        }
    }

    @Override // org.reactivestreams.d
    public void onSubscribe(e eVar) {
        if (this.f123992c.get() == f123990e) {
            eVar.cancel();
        } else {
            eVar.request(Long.MAX_VALUE);
        }
    }
}
