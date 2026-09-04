package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l<T> implements Comparator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Comparator<T> f124683b;

    public l(@dl.d Comparator<T> comparator) {
        f0.p(comparator, "comparator");
        this.f124683b = comparator;
    }

    @dl.d
    public final Comparator<T> a() {
        return this.f124683b;
    }

    @Override // java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f124683b.compare(t11, t10);
    }

    @Override // java.util.Comparator
    @dl.d
    public final Comparator<T> reversed() {
        return this.f124683b;
    }
}
