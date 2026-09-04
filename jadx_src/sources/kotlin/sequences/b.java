package kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b<T, K> extends kotlin.collections.a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Iterator<T> f128432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.l<T, K> f128433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final HashSet<K> f128434f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@dl.d Iterator<? extends T> source, @dl.d yh.l<? super T, ? extends K> keySelector) {
        f0.p(source, "source");
        f0.p(keySelector, "keySelector");
        this.f128432d = source;
        this.f128433e = keySelector;
        this.f128434f = new HashSet<>();
    }

    @Override // kotlin.collections.a
    protected void a() {
        while (this.f128432d.hasNext()) {
            T next = this.f128432d.next();
            if (this.f128434f.add(this.f128433e.invoke(next))) {
                c(next);
                return;
            }
        }
        b();
    }
}
