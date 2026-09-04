package androidx.concurrent.futures;

import androidx.annotation.RestrictTo;
import androidx.annotation.p0;

/* JADX INFO: compiled from: ResolvableFuture.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class b<V> extends AbstractResolvableFuture<V> {
    private b() {
    }

    public static <V> b<V> u() {
        return new b<>();
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean p(@p0 V v10) {
        return super.p(v10);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean q(Throwable th2) {
        return super.q(th2);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean r(com.google.common.util.concurrent.p0<? extends V> p0Var) {
        return super.r(p0Var);
    }
}
