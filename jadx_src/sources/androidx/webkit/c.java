package androidx.webkit;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ProxyController.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: compiled from: ProxyController.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f28337a = new androidx.webkit.internal.e();

        private a() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public c() {
    }

    @n0
    public static c b() {
        if (k0.a(k0.J)) {
            return a.f28337a;
        }
        throw new UnsupportedOperationException("Proxy override not supported");
    }

    public abstract void a(@n0 Executor executor, @n0 Runnable runnable);

    public abstract void c(@n0 b bVar, @n0 Executor executor, @n0 Runnable runnable);
}
