package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.b2;
import kotlin.collections.builders.SetBuilder;

/* JADX INFO: compiled from: SetsJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class c1 {
    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    public static final <E> Set<E> a(@dl.d Set<E> builder) {
        kotlin.jvm.internal.f0.p(builder, "builder");
        return ((SetBuilder) builder).b();
    }

    @kotlin.u0(version = "1.3")
    @kotlin.r0
    @sh.f
    private static final <E> Set<E> b(int i10, yh.l<? super Set<E>, b2> builderAction) {
        kotlin.jvm.internal.f0.p(builderAction, "builderAction");
        Set setE = e(i10);
        builderAction.invoke(setE);
        return a(setE);
    }

    @kotlin.u0(version = "1.3")
    @kotlin.r0
    @sh.f
    private static final <E> Set<E> c(yh.l<? super Set<E>, b2> builderAction) {
        kotlin.jvm.internal.f0.p(builderAction, "builderAction");
        Set setD = d();
        builderAction.invoke(setD);
        return a(setD);
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    public static final <E> Set<E> d() {
        return new SetBuilder();
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    public static final <E> Set<E> e(int i10) {
        return new SetBuilder(i10);
    }

    @dl.d
    public static final <T> Set<T> f(T t10) {
        Set<T> setSingleton = Collections.singleton(t10);
        kotlin.jvm.internal.f0.o(setSingleton, "singleton(element)");
        return setSingleton;
    }

    @dl.d
    public static final <T> TreeSet<T> g(@dl.d Comparator<? super T> comparator, @dl.d T... elements) {
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        kotlin.jvm.internal.f0.p(elements, "elements");
        return (TreeSet) ArraysKt___ArraysKt.Py(elements, new TreeSet(comparator));
    }

    @dl.d
    public static final <T> TreeSet<T> h(@dl.d T... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return (TreeSet) ArraysKt___ArraysKt.Py(elements, new TreeSet());
    }
}
