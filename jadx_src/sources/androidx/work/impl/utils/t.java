package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;

/* JADX INFO: compiled from: PruneWorkRunnable.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class t implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.g0 f29377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.work.impl.o f29378c = new androidx.work.impl.o();

    public t(@n0 androidx.work.impl.g0 g0Var) {
        this.f29377b = g0Var;
    }

    @n0
    public androidx.work.q a() {
        return this.f29378c;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f29377b.P().X().c();
            this.f29378c.a(androidx.work.q.f29462a);
        } catch (Throwable th2) {
            this.f29378c.a(new androidx.work.q.b.a(th2));
        }
    }
}
