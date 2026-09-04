package androidx.work.impl.utils.futures;

import androidx.annotation.RestrictTo;
import androidx.annotation.p0;

/* JADX INFO: compiled from: SettableFuture.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a<V> extends AbstractFuture<V> {
    private a() {
    }

    public static <V> a<V> u() {
        return new a<>();
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean p(@p0 V v10) {
        return super.p(v10);
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean q(Throwable th2) {
        return super.q(th2);
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean r(com.google.common.util.concurrent.p0<? extends V> p0Var) {
        return super.r(p0Var);
    }
}
