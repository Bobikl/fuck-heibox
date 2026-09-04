package androidx.concurrent.futures;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class CallbackToFutureAdapter {

    public static final class FutureGarbageCollectedException extends Throwable {
        FutureGarbageCollectedException(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c<T> f17250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.concurrent.futures.b<Void> f17251c = androidx.concurrent.futures.b.u();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f17252d;

        a() {
        }

        private void e() {
            this.f17249a = null;
            this.f17250b = null;
            this.f17251c = null;
        }

        public void a(@n0 Runnable runnable, @n0 Executor executor) {
            androidx.concurrent.futures.b<Void> bVar = this.f17251c;
            if (bVar != null) {
                bVar.V(runnable, executor);
            }
        }

        void b() {
            this.f17249a = null;
            this.f17250b = null;
            this.f17251c.p(null);
        }

        public boolean c(T t10) {
            this.f17252d = true;
            c<T> cVar = this.f17250b;
            boolean z10 = cVar != null && cVar.b(t10);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            this.f17252d = true;
            c<T> cVar = this.f17250b;
            boolean z10 = cVar != null && cVar.a(true);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean f(@n0 Throwable th2) {
            this.f17252d = true;
            c<T> cVar = this.f17250b;
            boolean z10 = cVar != null && cVar.c(th2);
            if (z10) {
                e();
            }
            return z10;
        }

        protected void finalize() {
            androidx.concurrent.futures.b<Void> bVar;
            c<T> cVar = this.f17250b;
            if (cVar != null && !cVar.isDone()) {
                cVar.c(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f17249a));
            }
            if (this.f17252d || (bVar = this.f17251c) == null) {
                return;
            }
            bVar.p(null);
        }
    }

    public interface b<T> {
        @p0
        Object a(@n0 a<T> aVar) throws Exception;
    }

    public static final class c<T> implements com.google.common.util.concurrent.p0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WeakReference<a<T>> f17253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AbstractResolvableFuture<T> f17254c = new a();

        public class a extends AbstractResolvableFuture<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            protected String m() {
                a<T> aVar = c.this.f17253b.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f17249a + "]";
            }
        }

        c(a<T> aVar) {
            this.f17253b = new WeakReference<>(aVar);
        }

        @Override // com.google.common.util.concurrent.p0
        public void V(@n0 Runnable runnable, @n0 Executor executor) {
            this.f17254c.V(runnable, executor);
        }

        boolean a(boolean z10) {
            return this.f17254c.cancel(z10);
        }

        boolean b(T t10) {
            return this.f17254c.p(t10);
        }

        boolean c(Throwable th2) {
            return this.f17254c.q(th2);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f17253b.get();
            boolean zCancel = this.f17254c.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws ExecutionException, InterruptedException {
            return this.f17254c.get();
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, @n0 TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f17254c.get(j10, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f17254c.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f17254c.isDone();
        }

        public String toString() {
            return this.f17254c.toString();
        }
    }

    private CallbackToFutureAdapter() {
    }

    @n0
    public static <T> com.google.common.util.concurrent.p0<T> a(@n0 b<T> bVar) {
        a<T> aVar = new a<>();
        c<T> cVar = new c<>(aVar);
        aVar.f17250b = cVar;
        aVar.f17249a = bVar.getClass();
        try {
            Object objA = bVar.a(aVar);
            if (objA != null) {
                aVar.f17249a = objA;
            }
        } catch (Exception e10) {
            cVar.c(e10);
        }
        return cVar;
    }
}
