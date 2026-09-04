package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: BlockingObservableMostRecent.java */
/* JADX INFO: loaded from: classes5.dex */
public final class c<T> implements Iterable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<T> f122812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final T f122813c;

    /* JADX INFO: compiled from: BlockingObservableMostRecent.java */
    public static final class a<T> extends io.reactivex.observers.a<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile Object f122814c;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BlockingObservableMostRecent.java */
        public final class C1100a implements Iterator<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Object f122815b;

            C1100a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Object obj = a.this.f122814c;
                this.f122815b = obj;
                return !NotificationLite.isComplete(obj);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f122815b == null) {
                        this.f122815b = a.this.f122814c;
                    }
                    if (NotificationLite.isComplete(this.f122815b)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.isError(this.f122815b)) {
                        throw ExceptionHelper.f(NotificationLite.getError(this.f122815b));
                    }
                    T t10 = (T) NotificationLite.getValue(this.f122815b);
                    this.f122815b = null;
                    return t10;
                } catch (Throwable th2) {
                    this.f122815b = null;
                    throw th2;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        a(T t10) {
            this.f122814c = NotificationLite.next(t10);
        }

        public a<T>.C1100a c() {
            return new C1100a();
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122814c = NotificationLite.complete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122814c = NotificationLite.error(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122814c = NotificationLite.next(t10);
        }
    }

    public c(io.reactivex.e0<T> e0Var, T t10) {
        this.f122812b = e0Var;
        this.f122813c = t10;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f122813c);
        this.f122812b.g(aVar);
        return aVar.c();
    }
}
