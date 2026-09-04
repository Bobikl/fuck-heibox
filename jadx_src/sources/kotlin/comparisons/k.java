package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k implements Comparator<Comparable<? super Object>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final k f124682b = new k();

    private k() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@dl.d Comparable<Object> a10, @dl.d Comparable<Object> b10) {
        f0.p(a10, "a");
        f0.p(b10, "b");
        return b10.compareTo(a10);
    }

    @Override // java.util.Comparator
    @dl.d
    public final Comparator<Comparable<? super Object>> reversed() {
        return j.f124681b;
    }
}
