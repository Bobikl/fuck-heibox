package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c<T, K> implements m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final m<T> f128435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<T, K> f128436b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@dl.d m<? extends T> source, @dl.d yh.l<? super T, ? extends K> keySelector) {
        f0.p(source, "source");
        f0.p(keySelector, "keySelector");
        this.f128435a = source;
        this.f128436b = keySelector;
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<T> iterator() {
        return new b(this.f128435a.iterator(), this.f128436b);
    }
}
