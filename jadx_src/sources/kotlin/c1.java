package kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes5.dex */
@xh.h(name = "TuplesKt")
public final class c1 {
    @dl.d
    public static final <A, B> Pair<A, B> a(A a10, B b10) {
        return new Pair<>(a10, b10);
    }

    @dl.d
    public static final <T> List<T> b(@dl.d Pair<? extends T, ? extends T> pair) {
        kotlin.jvm.internal.f0.p(pair, "<this>");
        return CollectionsKt__CollectionsKt.L(pair.e(), pair.f());
    }

    @dl.d
    public static final <T> List<T> c(@dl.d Triple<? extends T, ? extends T, ? extends T> triple) {
        kotlin.jvm.internal.f0.p(triple, "<this>");
        return CollectionsKt__CollectionsKt.L(triple.f(), triple.g(), triple.h());
    }
}
