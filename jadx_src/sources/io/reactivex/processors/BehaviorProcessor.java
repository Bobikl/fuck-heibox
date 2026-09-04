package io.reactivex.processors;

import androidx.compose.animation.core.s0;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import jh.c;
import jh.f;
import org.reactivestreams.d;
import org.reactivestreams.e;

/* JADX INFO: loaded from: classes5.dex */
public final class BehaviorProcessor<T> extends a<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final Object[] f123955j = new Object[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final BehaviorSubscription[] f123956k = new BehaviorSubscription[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final BehaviorSubscription[] f123957l = new BehaviorSubscription[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<BehaviorSubscription<T>[]> f123958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ReadWriteLock f123959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Lock f123960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Lock f123961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final AtomicReference<Object> f123962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final AtomicReference<Throwable> f123963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f123964i;

    public static final class BehaviorSubscription<T> extends AtomicLong implements e, io.reactivex.internal.util.a.InterfaceC1112a<Object> {
        private static final long serialVersionUID = 3293175281126227086L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d<? super T> f123965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final BehaviorProcessor<T> f123966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f123967d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f123968e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.internal.util.a<Object> f123969f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f123970g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f123971h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        long f123972i;

        BehaviorSubscription(d<? super T> dVar, BehaviorProcessor<T> behaviorProcessor) {
            this.f123965b = dVar;
            this.f123966c = behaviorProcessor;
        }

        void a() {
            if (this.f123971h) {
                return;
            }
            synchronized (this) {
                if (this.f123971h) {
                    return;
                }
                if (this.f123967d) {
                    return;
                }
                BehaviorProcessor<T> behaviorProcessor = this.f123966c;
                Lock lock = behaviorProcessor.f123960e;
                lock.lock();
                this.f123972i = behaviorProcessor.f123964i;
                Object obj = behaviorProcessor.f123962g.get();
                lock.unlock();
                this.f123968e = obj != null;
                this.f123967d = true;
                if (obj == null || test(obj)) {
                    return;
                }
                b();
            }
        }

        void b() {
            io.reactivex.internal.util.a<Object> aVar;
            while (!this.f123971h) {
                synchronized (this) {
                    aVar = this.f123969f;
                    if (aVar == null) {
                        this.f123968e = false;
                        return;
                    }
                    this.f123969f = null;
                }
                aVar.d(this);
            }
        }

        void c(Object obj, long j10) {
            if (this.f123971h) {
                return;
            }
            if (!this.f123970g) {
                synchronized (this) {
                    if (this.f123971h) {
                        return;
                    }
                    if (this.f123972i == j10) {
                        return;
                    }
                    if (this.f123968e) {
                        io.reactivex.internal.util.a<Object> aVar = this.f123969f;
                        if (aVar == null) {
                            aVar = new io.reactivex.internal.util.a<>(4);
                            this.f123969f = aVar;
                        }
                        aVar.c(obj);
                        return;
                    }
                    this.f123967d = true;
                    this.f123970g = true;
                }
            }
            test(obj);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            if (this.f123971h) {
                return;
            }
            this.f123971h = true;
            this.f123966c.Z8(this);
        }

        public boolean d() {
            return get() == 0;
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this, j10);
            }
        }

        @Override // io.reactivex.internal.util.a.InterfaceC1112a, kh.r
        public boolean test(Object obj) {
            if (this.f123971h) {
                return true;
            }
            if (NotificationLite.isComplete(obj)) {
                this.f123965b.onComplete();
                return true;
            }
            if (NotificationLite.isError(obj)) {
                this.f123965b.onError(NotificationLite.getError(obj));
                return true;
            }
            long j10 = get();
            if (j10 == 0) {
                cancel();
                this.f123965b.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
            this.f123965b.onNext((Object) NotificationLite.getValue(obj));
            if (j10 == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }

    BehaviorProcessor() {
        this.f123962g = new AtomicReference<>();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f123959d = reentrantReadWriteLock;
        this.f123960e = reentrantReadWriteLock.readLock();
        this.f123961f = reentrantReadWriteLock.writeLock();
        this.f123958c = new AtomicReference<>(f123956k);
        this.f123963h = new AtomicReference<>();
    }

    BehaviorProcessor(T t10) {
        this();
        this.f123962g.lazySet(io.reactivex.internal.functions.a.g(t10, "defaultValue is null"));
    }

    @jh.e
    @c
    public static <T> BehaviorProcessor<T> S8() {
        return new BehaviorProcessor<>();
    }

    @jh.e
    @c
    public static <T> BehaviorProcessor<T> T8(T t10) {
        io.reactivex.internal.functions.a.g(t10, "defaultValue is null");
        return new BehaviorProcessor<>(t10);
    }

    @Override // io.reactivex.processors.a
    @f
    public Throwable M8() {
        Object obj = this.f123962g.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Override // io.reactivex.processors.a
    public boolean N8() {
        return NotificationLite.isComplete(this.f123962g.get());
    }

    @Override // io.reactivex.processors.a
    public boolean O8() {
        return this.f123958c.get().length != 0;
    }

    @Override // io.reactivex.processors.a
    public boolean P8() {
        return NotificationLite.isError(this.f123962g.get());
    }

    boolean R8(BehaviorSubscription<T> behaviorSubscription) {
        BehaviorSubscription<T>[] behaviorSubscriptionArr;
        BehaviorSubscription[] behaviorSubscriptionArr2;
        do {
            behaviorSubscriptionArr = this.f123958c.get();
            if (behaviorSubscriptionArr == f123957l) {
                return false;
            }
            int length = behaviorSubscriptionArr.length;
            behaviorSubscriptionArr2 = new BehaviorSubscription[length + 1];
            System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr2, 0, length);
            behaviorSubscriptionArr2[length] = behaviorSubscription;
        } while (!s0.a(this.f123958c, behaviorSubscriptionArr, behaviorSubscriptionArr2));
        return true;
    }

    @f
    public T U8() {
        Object obj = this.f123962g.get();
        if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) NotificationLite.getValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public Object[] V8() {
        Object[] objArr = f123955j;
        Object[] objArrW8 = W8(objArr);
        return objArrW8 == objArr ? new Object[0] : objArrW8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public T[] W8(T[] tArr) {
        Object obj = this.f123962g.get();
        if (obj == null || NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            if (tArr.length != 0) {
                tArr[0] = 0;
            }
            return tArr;
        }
        Object value = NotificationLite.getValue(obj);
        if (tArr.length == 0) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
            tArr2[0] = value;
            return tArr2;
        }
        tArr[0] = value;
        if (tArr.length == 1) {
            return tArr;
        }
        tArr[1] = 0;
        return tArr;
    }

    public boolean X8() {
        Object obj = this.f123962g.get();
        return (obj == null || NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? false : true;
    }

    public boolean Y8(T t10) {
        if (t10 == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        BehaviorSubscription<T>[] behaviorSubscriptionArr = this.f123958c.get();
        for (BehaviorSubscription<T> behaviorSubscription : behaviorSubscriptionArr) {
            if (behaviorSubscription.d()) {
                return false;
            }
        }
        Object next = NotificationLite.next(t10);
        a9(next);
        for (BehaviorSubscription<T> behaviorSubscription2 : behaviorSubscriptionArr) {
            behaviorSubscription2.c(next, this.f123964i);
        }
        return true;
    }

    void Z8(BehaviorSubscription<T> behaviorSubscription) {
        BehaviorSubscription<T>[] behaviorSubscriptionArr;
        BehaviorSubscription[] behaviorSubscriptionArr2;
        do {
            behaviorSubscriptionArr = this.f123958c.get();
            int length = behaviorSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i11 < length; i11++) {
                if (behaviorSubscriptionArr[i11] == behaviorSubscription) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                behaviorSubscriptionArr2 = f123956k;
            } else {
                BehaviorSubscription[] behaviorSubscriptionArr3 = new BehaviorSubscription[length - 1];
                System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr3, 0, i10);
                System.arraycopy(behaviorSubscriptionArr, i10 + 1, behaviorSubscriptionArr3, i10, (length - i10) - 1);
                behaviorSubscriptionArr2 = behaviorSubscriptionArr3;
            }
        } while (!s0.a(this.f123958c, behaviorSubscriptionArr, behaviorSubscriptionArr2));
    }

    void a9(Object obj) {
        Lock lock = this.f123961f;
        lock.lock();
        this.f123964i++;
        this.f123962g.lazySet(obj);
        lock.unlock();
    }

    int b9() {
        return this.f123958c.get().length;
    }

    BehaviorSubscription<T>[] c9(Object obj) {
        BehaviorSubscription<T>[] andSet = this.f123958c.get();
        BehaviorSubscription<T>[] behaviorSubscriptionArr = f123957l;
        if (andSet != behaviorSubscriptionArr && (andSet = this.f123958c.getAndSet(behaviorSubscriptionArr)) != behaviorSubscriptionArr) {
            a9(obj);
        }
        return andSet;
    }

    @Override // io.reactivex.j
    protected void k6(d<? super T> dVar) {
        BehaviorSubscription<T> behaviorSubscription = new BehaviorSubscription<>(dVar, this);
        dVar.onSubscribe(behaviorSubscription);
        if (R8(behaviorSubscription)) {
            if (behaviorSubscription.f123971h) {
                Z8(behaviorSubscription);
                return;
            } else {
                behaviorSubscription.a();
                return;
            }
        }
        Throwable th2 = this.f123963h.get();
        if (th2 == ExceptionHelper.f123860a) {
            dVar.onComplete();
        } else {
            dVar.onError(th2);
        }
    }

    @Override // org.reactivestreams.d
    public void onComplete() {
        if (s0.a(this.f123963h, null, ExceptionHelper.f123860a)) {
            Object objComplete = NotificationLite.complete();
            for (BehaviorSubscription<T> behaviorSubscription : c9(objComplete)) {
                behaviorSubscription.c(objComplete, this.f123964i);
            }
        }
    }

    @Override // org.reactivestreams.d
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!s0.a(this.f123963h, null, th2)) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        Object objError = NotificationLite.error(th2);
        for (BehaviorSubscription<T> behaviorSubscription : c9(objError)) {
            behaviorSubscription.c(objError, this.f123964i);
        }
    }

    @Override // org.reactivestreams.d
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f123963h.get() != null) {
            return;
        }
        Object next = NotificationLite.next(t10);
        a9(next);
        for (BehaviorSubscription<T> behaviorSubscription : this.f123958c.get()) {
            behaviorSubscription.c(next, this.f123964i);
        }
    }

    @Override // org.reactivestreams.d
    public void onSubscribe(e eVar) {
        if (this.f123963h.get() != null) {
            eVar.cancel();
        } else {
            eVar.request(Long.MAX_VALUE);
        }
    }
}
