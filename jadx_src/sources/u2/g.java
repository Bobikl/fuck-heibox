package u2;

import androidx.lifecycle.w0;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class g<T extends w0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Class<T> f140746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final l<a, T> f140747b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@dl.d Class<T> clazz, @dl.d l<? super a, ? extends T> initializer) {
        f0.p(clazz, "clazz");
        f0.p(initializer, "initializer");
        this.f140746a = clazz;
        this.f140747b = initializer;
    }

    @dl.d
    public final Class<T> a() {
        return this.f140746a;
    }

    @dl.d
    public final l<a, T> b() {
        return this.f140747b;
    }
}
