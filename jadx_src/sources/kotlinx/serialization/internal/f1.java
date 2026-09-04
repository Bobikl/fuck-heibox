package kotlinx.serialization.internal;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/MutableSoftReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"})
public final class f1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @xh.e
    public volatile SoftReference<T> f130693a = new SoftReference<>(null);

    public final synchronized T a(@dl.d yh.a<? extends T> factory) {
        kotlin.jvm.internal.f0.p(factory, "factory");
        T t10 = this.f130693a.get();
        if (t10 != null) {
            return t10;
        }
        T tInvoke = factory.invoke();
        this.f130693a = new SoftReference<>(tInvoke);
        return tInvoke;
    }
}
