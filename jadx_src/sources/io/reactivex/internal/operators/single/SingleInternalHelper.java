package io.reactivex.internal.operators.single;

import io.reactivex.o0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleInternalHelper {

    public enum NoSuchElementCallable implements Callable<NoSuchElementException> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public NoSuchElementException call() throws Exception {
            return new NoSuchElementException();
        }
    }

    public enum ToFlowable implements kh.o<o0, org.reactivestreams.c> {
        INSTANCE;

        @Override // kh.o
        public org.reactivestreams.c apply(o0 o0Var) {
            return new SingleToFlowable(o0Var);
        }
    }

    public enum ToObservable implements kh.o<o0, io.reactivex.z> {
        INSTANCE;

        @Override // kh.o
        public io.reactivex.z apply(o0 o0Var) {
            return new SingleToObservable(o0Var);
        }
    }

    public static final class a<T> implements Iterable<io.reactivex.j<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterable<? extends o0<? extends T>> f123425b;

        a(Iterable<? extends o0<? extends T>> iterable) {
            this.f123425b = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<io.reactivex.j<T>> iterator() {
            return new b(this.f123425b.iterator());
        }
    }

    public static final class b<T> implements Iterator<io.reactivex.j<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator<? extends o0<? extends T>> f123426b;

        b(Iterator<? extends o0<? extends T>> it) {
            this.f123426b = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.j<T> next() {
            return new SingleToFlowable(this.f123426b.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f123426b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private SingleInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Callable<NoSuchElementException> a() {
        return NoSuchElementCallable.INSTANCE;
    }

    public static <T> Iterable<? extends io.reactivex.j<T>> b(Iterable<? extends o0<? extends T>> iterable) {
        return new a(iterable);
    }

    public static <T> kh.o<o0<? extends T>, org.reactivestreams.c<? extends T>> c() {
        return ToFlowable.INSTANCE;
    }

    public static <T> kh.o<o0<? extends T>, io.reactivex.z<? extends T>> d() {
        return ToObservable.INSTANCE;
    }
}
