package io.reactivex.subjects;

import androidx.compose.animation.core.s0;
import io.reactivex.g0;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import jh.e;
import jh.f;

/* JADX INFO: compiled from: BehaviorSubject.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a<T> extends c<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object[] f124141i = new Object[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final C1115a[] f124142j = new C1115a[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final C1115a[] f124143k = new C1115a[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<Object> f124144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<C1115a<T>[]> f124145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ReadWriteLock f124146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Lock f124147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Lock f124148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final AtomicReference<Throwable> f124149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f124150h;

    /* JADX INFO: renamed from: io.reactivex.subjects.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BehaviorSubject.java */
    public static final class C1115a<T> implements io.reactivex.disposables.b, io.reactivex.internal.util.a.InterfaceC1112a<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g0<? super T> f124151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final a<T> f124152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f124153d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f124154e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.internal.util.a<Object> f124155f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f124156g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f124157h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        long f124158i;

        C1115a(g0<? super T> g0Var, a<T> aVar) {
            this.f124151b = g0Var;
            this.f124152c = aVar;
        }

        void a() {
            if (this.f124157h) {
                return;
            }
            synchronized (this) {
                if (this.f124157h) {
                    return;
                }
                if (this.f124153d) {
                    return;
                }
                a<T> aVar = this.f124152c;
                Lock lock = aVar.f124147e;
                lock.lock();
                this.f124158i = aVar.f124150h;
                Object obj = aVar.f124144b.get();
                lock.unlock();
                this.f124154e = obj != null;
                this.f124153d = true;
                if (obj == null || test(obj)) {
                    return;
                }
                b();
            }
        }

        void b() {
            io.reactivex.internal.util.a<Object> aVar;
            while (!this.f124157h) {
                synchronized (this) {
                    aVar = this.f124155f;
                    if (aVar == null) {
                        this.f124154e = false;
                        return;
                    }
                    this.f124155f = null;
                }
                aVar.d(this);
            }
        }

        void c(Object obj, long j10) {
            if (this.f124157h) {
                return;
            }
            if (!this.f124156g) {
                synchronized (this) {
                    if (this.f124157h) {
                        return;
                    }
                    if (this.f124158i == j10) {
                        return;
                    }
                    if (this.f124154e) {
                        io.reactivex.internal.util.a<Object> aVar = this.f124155f;
                        if (aVar == null) {
                            aVar = new io.reactivex.internal.util.a<>(4);
                            this.f124155f = aVar;
                        }
                        aVar.c(obj);
                        return;
                    }
                    this.f124153d = true;
                    this.f124156g = true;
                }
            }
            test(obj);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f124157h) {
                return;
            }
            this.f124157h = true;
            this.f124152c.t8(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f124157h;
        }

        @Override // io.reactivex.internal.util.a.InterfaceC1112a, kh.r
        public boolean test(Object obj) {
            return this.f124157h || NotificationLite.accept(obj, this.f124151b);
        }
    }

    a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f124146d = reentrantReadWriteLock;
        this.f124147e = reentrantReadWriteLock.readLock();
        this.f124148f = reentrantReadWriteLock.writeLock();
        this.f124145c = new AtomicReference<>(f124142j);
        this.f124144b = new AtomicReference<>();
        this.f124149g = new AtomicReference<>();
    }

    a(T t10) {
        this();
        this.f124144b.lazySet(io.reactivex.internal.functions.a.g(t10, "defaultValue is null"));
    }

    @e
    @jh.c
    public static <T> a<T> n8() {
        return new a<>();
    }

    @e
    @jh.c
    public static <T> a<T> o8(T t10) {
        return new a<>(t10);
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super T> g0Var) {
        C1115a<T> c1115a = new C1115a<>(g0Var, this);
        g0Var.onSubscribe(c1115a);
        if (m8(c1115a)) {
            if (c1115a.f124157h) {
                t8(c1115a);
                return;
            } else {
                c1115a.a();
                return;
            }
        }
        Throwable th2 = this.f124149g.get();
        if (th2 == ExceptionHelper.f123860a) {
            g0Var.onComplete();
        } else {
            g0Var.onError(th2);
        }
    }

    @Override // io.reactivex.subjects.c
    @f
    public Throwable h8() {
        Object obj = this.f124144b.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Override // io.reactivex.subjects.c
    public boolean i8() {
        return NotificationLite.isComplete(this.f124144b.get());
    }

    @Override // io.reactivex.subjects.c
    public boolean j8() {
        return this.f124145c.get().length != 0;
    }

    @Override // io.reactivex.subjects.c
    public boolean k8() {
        return NotificationLite.isError(this.f124144b.get());
    }

    boolean m8(C1115a<T> c1115a) {
        C1115a<T>[] c1115aArr;
        C1115a[] c1115aArr2;
        do {
            c1115aArr = this.f124145c.get();
            if (c1115aArr == f124143k) {
                return false;
            }
            int length = c1115aArr.length;
            c1115aArr2 = new C1115a[length + 1];
            System.arraycopy(c1115aArr, 0, c1115aArr2, 0, length);
            c1115aArr2[length] = c1115a;
        } while (!s0.a(this.f124145c, c1115aArr, c1115aArr2));
        return true;
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        if (s0.a(this.f124149g, null, ExceptionHelper.f123860a)) {
            Object objComplete = NotificationLite.complete();
            for (C1115a<T> c1115a : w8(objComplete)) {
                c1115a.c(objComplete, this.f124150h);
            }
        }
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!s0.a(this.f124149g, null, th2)) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        Object objError = NotificationLite.error(th2);
        for (C1115a<T> c1115a : w8(objError)) {
            c1115a.c(objError, this.f124150h);
        }
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f124149g.get() != null) {
            return;
        }
        Object next = NotificationLite.next(t10);
        u8(next);
        for (C1115a<T> c1115a : this.f124145c.get()) {
            c1115a.c(next, this.f124150h);
        }
    }

    @Override // io.reactivex.g0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (this.f124149g.get() != null) {
            bVar.dispose();
        }
    }

    @f
    public T p8() {
        Object obj = this.f124144b.get();
        if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) NotificationLite.getValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public Object[] q8() {
        Object[] objArr = f124141i;
        Object[] objArrR8 = r8(objArr);
        return objArrR8 == objArr ? new Object[0] : objArrR8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public T[] r8(T[] tArr) {
        Object obj = this.f124144b.get();
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

    public boolean s8() {
        Object obj = this.f124144b.get();
        return (obj == null || NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? false : true;
    }

    void t8(C1115a<T> c1115a) {
        C1115a<T>[] c1115aArr;
        C1115a[] c1115aArr2;
        do {
            c1115aArr = this.f124145c.get();
            int length = c1115aArr.length;
            if (length == 0) {
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i11 < length; i11++) {
                if (c1115aArr[i11] == c1115a) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                c1115aArr2 = f124142j;
            } else {
                C1115a[] c1115aArr3 = new C1115a[length - 1];
                System.arraycopy(c1115aArr, 0, c1115aArr3, 0, i10);
                System.arraycopy(c1115aArr, i10 + 1, c1115aArr3, i10, (length - i10) - 1);
                c1115aArr2 = c1115aArr3;
            }
        } while (!s0.a(this.f124145c, c1115aArr, c1115aArr2));
    }

    void u8(Object obj) {
        this.f124148f.lock();
        this.f124150h++;
        this.f124144b.lazySet(obj);
        this.f124148f.unlock();
    }

    int v8() {
        return this.f124145c.get().length;
    }

    C1115a<T>[] w8(Object obj) {
        AtomicReference<C1115a<T>[]> atomicReference = this.f124145c;
        C1115a<T>[] c1115aArr = f124143k;
        C1115a<T>[] andSet = atomicReference.getAndSet(c1115aArr);
        if (andSet != c1115aArr) {
            u8(obj);
        }
        return andSet;
    }
}
