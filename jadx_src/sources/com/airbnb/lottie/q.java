package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: LottieTask.java */
/* JADX INFO: loaded from: classes6.dex */
public class q<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Executor f37812e = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<l<T>> f37813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<l<Throwable>> f37814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f37815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private volatile p<T> f37816d;

    /* JADX INFO: compiled from: LottieTask.java */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (q.this.f37816d == null) {
                return;
            }
            p pVar = q.this.f37816d;
            if (pVar.b() != null) {
                q.this.i(pVar.b());
            } else {
                q.this.g(pVar.a());
            }
        }
    }

    /* JADX INFO: compiled from: LottieTask.java */
    public class b extends FutureTask<p<T>> {
        b(Callable<p<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                q.this.l(get());
            } catch (InterruptedException | ExecutionException e10) {
                q.this.l(new p(e10));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public q(Callable<p<T>> callable) {
        this(callable, false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    q(Callable<p<T>> callable, boolean z10) {
        this.f37813a = new LinkedHashSet(1);
        this.f37814b = new LinkedHashSet(1);
        this.f37815c = new Handler(Looper.getMainLooper());
        this.f37816d = null;
        if (!z10) {
            f37812e.execute(new b(callable));
            return;
        }
        try {
            l(callable.call());
        } catch (Throwable th2) {
            l(new p<>(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void g(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f37814b);
        if (arrayList.isEmpty()) {
            com.airbnb.lottie.utils.f.f("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((l) it.next()).onResult(th2);
        }
    }

    private void h() {
        this.f37815c.post(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i(T t10) {
        Iterator it = new ArrayList(this.f37813a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onResult(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(@p0 p<T> pVar) {
        if (this.f37816d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f37816d = pVar;
        h();
    }

    public synchronized q<T> e(l<Throwable> lVar) {
        if (this.f37816d != null && this.f37816d.a() != null) {
            lVar.onResult(this.f37816d.a());
        }
        this.f37814b.add(lVar);
        return this;
    }

    public synchronized q<T> f(l<T> lVar) {
        if (this.f37816d != null && this.f37816d.b() != null) {
            lVar.onResult(this.f37816d.b());
        }
        this.f37813a.add(lVar);
        return this;
    }

    public synchronized q<T> j(l<Throwable> lVar) {
        this.f37814b.remove(lVar);
        return this;
    }

    public synchronized q<T> k(l<T> lVar) {
        this.f37813a.remove(lVar);
        return this;
    }
}
