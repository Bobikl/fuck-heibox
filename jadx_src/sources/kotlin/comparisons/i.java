package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.f0;
import kotlin.u0;

/* JADX INFO: compiled from: _Comparisons.kt */
/* JADX INFO: loaded from: classes5.dex */
public class i extends h {
    @u0(version = "1.4")
    public static final <T> T A0(T t10, @dl.d T[] other, @dl.d Comparator<? super T> comparator) {
        f0.p(other, "other");
        f0.p(comparator, "comparator");
        for (T t11 : other) {
            if (comparator.compare(t10, t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @u0(version = "1.1")
    public static final <T> T B0(T t10, T t11, T t12, @dl.d Comparator<? super T> comparator) {
        f0.p(comparator, "comparator");
        return (T) C0(t10, C0(t11, t12, comparator), comparator);
    }

    @u0(version = "1.1")
    public static final <T> T C0(T t10, T t11, @dl.d Comparator<? super T> comparator) {
        f0.p(comparator, "comparator");
        return comparator.compare(t10, t11) <= 0 ? t10 : t11;
    }

    @u0(version = "1.4")
    public static final <T> T D0(T t10, @dl.d T[] other, @dl.d Comparator<? super T> comparator) {
        f0.p(other, "other");
        f0.p(comparator, "comparator");
        for (T t11 : other) {
            if (comparator.compare(t10, t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @u0(version = "1.1")
    public static final <T> T y0(T t10, T t11, T t12, @dl.d Comparator<? super T> comparator) {
        f0.p(comparator, "comparator");
        return (T) z0(t10, z0(t11, t12, comparator), comparator);
    }

    @u0(version = "1.1")
    public static final <T> T z0(T t10, T t11, @dl.d Comparator<? super T> comparator) {
        f0.p(comparator, "comparator");
        return comparator.compare(t10, t11) >= 0 ? t10 : t11;
    }
}
