package io.reactivex.processors;

import androidx.compose.animation.core.s0;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import jh.c;
import jh.e;
import jh.f;
import org.reactivestreams.d;

/* JADX INFO: loaded from: classes5.dex */
public final class AsyncProcessor<T> extends a<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final AsyncSubscription[] f123949f = new AsyncSubscription[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final AsyncSubscription[] f123950g = new AsyncSubscription[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<AsyncSubscription<T>[]> f123951c = new AtomicReference<>(f123949f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Throwable f123952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    T f123953e;

    public static final class AsyncSubscription<T> extends DeferredScalarSubscription<T> {
        private static final long serialVersionUID = 5629876084736248016L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final AsyncProcessor<T> f123954l;

        AsyncSubscription(d<? super T> dVar, AsyncProcessor<T> asyncProcessor) {
            super(dVar);
            this.f123954l = asyncProcessor;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.e
        public void cancel() {
            if (super.f()) {
                this.f123954l.X8(this);
            }
        }

        void onComplete() {
            if (d()) {
                return;
            }
            this.f123845b.onComplete();
        }

        void onError(Throwable th2) {
            if (d()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f123845b.onError(th2);
            }
        }
    }

    AsyncProcessor() {
    }

    @e
    @c
    public static <T> AsyncProcessor<T> S8() {
        return new AsyncProcessor<>();
    }

    @Override // io.reactivex.processors.a
    @f
    public Throwable M8() {
        if (this.f123951c.get() == f123950g) {
            return this.f123952d;
        }
        return null;
    }

    @Override // io.reactivex.processors.a
    public boolean N8() {
        return this.f123951c.get() == f123950g && this.f123952d == null;
    }

    @Override // io.reactivex.processors.a
    public boolean O8() {
        return this.f123951c.get().length != 0;
    }

    @Override // io.reactivex.processors.a
    public boolean P8() {
        return this.f123951c.get() == f123950g && this.f123952d != null;
    }

    boolean R8(AsyncSubscription<T> asyncSubscription) {
        AsyncSubscription<T>[] asyncSubscriptionArr;
        AsyncSubscription[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = this.f123951c.get();
            if (asyncSubscriptionArr == f123950g) {
                return false;
            }
            int length = asyncSubscriptionArr.length;
            asyncSubscriptionArr2 = new AsyncSubscription[length + 1];
            System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr2, 0, length);
            asyncSubscriptionArr2[length] = asyncSubscription;
        } while (!s0.a(this.f123951c, asyncSubscriptionArr, asyncSubscriptionArr2));
        return true;
    }

    @f
    public T T8() {
        if (this.f123951c.get() == f123950g) {
            return this.f123953e;
        }
        return null;
    }

    @Deprecated
    public Object[] U8() {
        T tT8 = T8();
        return tT8 != null ? new Object[]{tT8} : new Object[0];
    }

    @Deprecated
    public T[] V8(T[] tArr) {
        T tT8 = T8();
        if (tT8 == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 1);
        }
        tArr[0] = tT8;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    public boolean W8() {
        return this.f123951c.get() == f123950g && this.f123953e != null;
    }

    void X8(AsyncSubscription<T> asyncSubscription) {
        AsyncSubscription<T>[] asyncSubscriptionArr;
        AsyncSubscription[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = this.f123951c.get();
            int length = asyncSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i11 < length; i11++) {
                if (asyncSubscriptionArr[i11] == asyncSubscription) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                asyncSubscriptionArr2 = f123949f;
            } else {
                AsyncSubscription[] asyncSubscriptionArr3 = new AsyncSubscription[length - 1];
                System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr3, 0, i10);
                System.arraycopy(asyncSubscriptionArr, i10 + 1, asyncSubscriptionArr3, i10, (length - i10) - 1);
                asyncSubscriptionArr2 = asyncSubscriptionArr3;
            }
        } while (!s0.a(this.f123951c, asyncSubscriptionArr, asyncSubscriptionArr2));
    }

    @Override // io.reactivex.j
    protected void k6(d<? super T> dVar) {
        AsyncSubscription<T> asyncSubscription = new AsyncSubscription<>(dVar, this);
        dVar.onSubscribe(asyncSubscription);
        if (R8(asyncSubscription)) {
            if (asyncSubscription.d()) {
                X8(asyncSubscription);
                return;
            }
            return;
        }
        Throwable th2 = this.f123952d;
        if (th2 != null) {
            dVar.onError(th2);
            return;
        }
        T t10 = this.f123953e;
        if (t10 != null) {
            asyncSubscription.c(t10);
        } else {
            asyncSubscription.onComplete();
        }
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        AsyncSubscription<T>[] asyncSubscriptionArr = this.f123951c.get();
        AsyncSubscription<T>[] asyncSubscriptionArr2 = f123950g;
        if (asyncSubscriptionArr == asyncSubscriptionArr2) {
            return;
        }
        T t10 = this.f123953e;
        AsyncSubscription<T>[] andSet = this.f123951c.getAndSet(asyncSubscriptionArr2);
        int i10 = 0;
        if (t10 == null) {
            int length = andSet.length;
            while (i10 < length) {
                andSet[i10].onComplete();
                i10++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i10 < length2) {
            andSet[i10].c(t10);
            i10++;
        }
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AsyncSubscription<T>[] asyncSubscriptionArr = this.f123951c.get();
        AsyncSubscription<T>[] asyncSubscriptionArr2 = f123950g;
        if (asyncSubscriptionArr == asyncSubscriptionArr2) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f123953e = null;
        this.f123952d = th2;
        for (AsyncSubscription<T> asyncSubscription : this.f123951c.getAndSet(asyncSubscriptionArr2)) {
            asyncSubscription.onError(th2);
        }
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f123951c.get() == f123950g) {
            return;
        }
        this.f123953e = t10;
    }

    @Override // org.reactivestreams.d
    public void onSubscribe(org.reactivestreams.e eVar) {
        if (this.f123951c.get() == f123950g) {
            eVar.cancel();
        } else {
            eVar.request(Long.MAX_VALUE);
        }
    }
}
