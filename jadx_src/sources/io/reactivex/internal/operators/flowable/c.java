package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: BlockingFlowableMostRecent.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c<T> implements Iterable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j<T> f121055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final T f121056c;

    /* JADX INFO: compiled from: BlockingFlowableMostRecent.java */
    public static final class a<T> extends io.reactivex.subscribers.a<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile Object f121057c;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BlockingFlowableMostRecent.java */
        public final class C1097a implements Iterator<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Object f121058b;

            C1097a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Object obj = a.this.f121057c;
                this.f121058b = obj;
                return !NotificationLite.isComplete(obj);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f121058b == null) {
                        this.f121058b = a.this.f121057c;
                    }
                    if (NotificationLite.isComplete(this.f121058b)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.isError(this.f121058b)) {
                        throw ExceptionHelper.f(NotificationLite.getError(this.f121058b));
                    }
                    T t10 = (T) NotificationLite.getValue(this.f121058b);
                    this.f121058b = null;
                    return t10;
                } catch (Throwable th2) {
                    this.f121058b = null;
                    throw th2;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        a(T t10) {
            this.f121057c = NotificationLite.next(t10);
        }

        public a<T>.C1097a d() {
            return new C1097a();
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f121057c = NotificationLite.complete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f121057c = NotificationLite.error(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f121057c = NotificationLite.next(t10);
        }
    }

    public c(io.reactivex.j<T> jVar, T t10) {
        this.f121055b = jVar;
        this.f121056c = t10;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f121056c);
        this.f121055b.j6(aVar);
        return aVar.d();
    }
}
