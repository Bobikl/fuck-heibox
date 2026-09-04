package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n<T> extends o<T> implements Iterator<T>, kotlin.coroutines.c<b2>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f128475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private T f128476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private Iterator<? extends T> f128477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private kotlin.coroutines.c<? super b2> f128478e;

    private final Throwable g() {
        int i10 = this.f128475b;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f128475b);
    }

    private final T i() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // kotlin.sequences.o
    @dl.e
    public Object a(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        this.f128476c = t10;
        this.f128475b = 3;
        this.f128478e = cVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        if (objH == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
    }

    @Override // kotlin.sequences.o
    @dl.e
    public Object d(@dl.d Iterator<? extends T> it, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        if (!it.hasNext()) {
            return b2.f124493a;
        }
        this.f128477d = it;
        this.f128475b = 2;
        this.f128478e = cVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        if (objH == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
    }

    @Override // kotlin.coroutines.c
    @dl.d
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.f124694b;
    }

    @dl.e
    public final kotlin.coroutines.c<b2> h() {
        return this.f128478e;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f128475b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw g();
                }
                Iterator<? extends T> it = this.f128477d;
                f0.m(it);
                if (it.hasNext()) {
                    this.f128475b = 2;
                    return true;
                }
                this.f128477d = null;
            }
            this.f128475b = 5;
            kotlin.coroutines.c<? super b2> cVar = this.f128478e;
            f0.m(cVar);
            this.f128478e = null;
            Result.a aVar = Result.f124476c;
            cVar.resumeWith(Result.b(b2.f124493a));
        }
    }

    public final void n(@dl.e kotlin.coroutines.c<? super b2> cVar) {
        this.f128478e = cVar;
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i10 = this.f128475b;
        if (i10 == 0 || i10 == 1) {
            return i();
        }
        if (i10 == 2) {
            this.f128475b = 1;
            Iterator<? extends T> it = this.f128477d;
            f0.m(it);
            return it.next();
        }
        if (i10 != 3) {
            throw g();
        }
        this.f128475b = 0;
        T t10 = this.f128476c;
        this.f128476c = null;
        return t10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.c
    public void resumeWith(@dl.d Object obj) throws Throwable {
        t0.n(obj);
        this.f128475b = 4;
    }
}
