package io.reactivex.subjects;

import androidx.compose.animation.core.s0;
import io.reactivex.g0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jh.e;
import jh.f;

/* JADX INFO: loaded from: classes5.dex */
public final class PublishSubject<T> extends c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final PublishDisposable[] f124088d = new PublishDisposable[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final PublishDisposable[] f124089e = new PublishDisposable[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<PublishDisposable<T>[]> f124090b = new AtomicReference<>(f124089e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Throwable f124091c;

    public static final class PublishDisposable<T> extends AtomicBoolean implements io.reactivex.disposables.b {
        private static final long serialVersionUID = 3562861878281475070L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g0<? super T> f124092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final PublishSubject<T> f124093c;

        PublishDisposable(g0<? super T> g0Var, PublishSubject<T> publishSubject) {
            this.f124092b = g0Var;
            this.f124093c = publishSubject;
        }

        public void a() {
            if (get()) {
                return;
            }
            this.f124092b.onComplete();
        }

        public void b(Throwable th2) {
            if (get()) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f124092b.onError(th2);
            }
        }

        public void c(T t10) {
            if (get()) {
                return;
            }
            this.f124092b.onNext(t10);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f124093c.o8(this);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get();
        }
    }

    PublishSubject() {
    }

    @e
    @jh.c
    public static <T> PublishSubject<T> n8() {
        return new PublishSubject<>();
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super T> g0Var) {
        PublishDisposable<T> publishDisposable = new PublishDisposable<>(g0Var, this);
        g0Var.onSubscribe(publishDisposable);
        if (m8(publishDisposable)) {
            if (publishDisposable.isDisposed()) {
                o8(publishDisposable);
            }
        } else {
            Throwable th2 = this.f124091c;
            if (th2 != null) {
                g0Var.onError(th2);
            } else {
                g0Var.onComplete();
            }
        }
    }

    @Override // io.reactivex.subjects.c
    @f
    public Throwable h8() {
        if (this.f124090b.get() == f124088d) {
            return this.f124091c;
        }
        return null;
    }

    @Override // io.reactivex.subjects.c
    public boolean i8() {
        return this.f124090b.get() == f124088d && this.f124091c == null;
    }

    @Override // io.reactivex.subjects.c
    public boolean j8() {
        return this.f124090b.get().length != 0;
    }

    @Override // io.reactivex.subjects.c
    public boolean k8() {
        return this.f124090b.get() == f124088d && this.f124091c != null;
    }

    boolean m8(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = this.f124090b.get();
            if (publishDisposableArr == f124088d) {
                return false;
            }
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!s0.a(this.f124090b, publishDisposableArr, publishDisposableArr2));
        return true;
    }

    void o8(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = this.f124090b.get();
            if (publishDisposableArr == f124088d || publishDisposableArr == f124089e) {
                return;
            }
            int length = publishDisposableArr.length;
            int i10 = -1;
            for (int i11 = 0; i11 < length; i11++) {
                if (publishDisposableArr[i11] == publishDisposable) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                publishDisposableArr2 = f124089e;
            } else {
                PublishDisposable[] publishDisposableArr3 = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i10);
                System.arraycopy(publishDisposableArr, i10 + 1, publishDisposableArr3, i10, (length - i10) - 1);
                publishDisposableArr2 = publishDisposableArr3;
            }
        } while (!s0.a(this.f124090b, publishDisposableArr, publishDisposableArr2));
    }

    @Override // io.reactivex.g0
    public void onComplete() {
        PublishDisposable<T>[] publishDisposableArr = this.f124090b.get();
        PublishDisposable<T>[] publishDisposableArr2 = f124088d;
        if (publishDisposableArr == publishDisposableArr2) {
            return;
        }
        for (PublishDisposable<T> publishDisposable : this.f124090b.getAndSet(publishDisposableArr2)) {
            publishDisposable.a();
        }
    }

    @Override // io.reactivex.g0
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishDisposable<T>[] publishDisposableArr = this.f124090b.get();
        PublishDisposable<T>[] publishDisposableArr2 = f124088d;
        if (publishDisposableArr == publishDisposableArr2) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f124091c = th2;
        for (PublishDisposable<T> publishDisposable : this.f124090b.getAndSet(publishDisposableArr2)) {
            publishDisposable.b(th2);
        }
    }

    @Override // io.reactivex.g0
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishDisposable<T> publishDisposable : this.f124090b.get()) {
            publishDisposable.c(t10);
        }
    }

    @Override // io.reactivex.g0
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (this.f124090b.get() == f124088d) {
            bVar.dispose();
        }
    }
}
