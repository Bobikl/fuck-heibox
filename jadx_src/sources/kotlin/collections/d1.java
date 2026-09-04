package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.b2;
import kotlin.e2;

/* JADX INFO: compiled from: Sets.kt */
/* JADX INFO: loaded from: classes5.dex */
public class d1 extends c1 {
    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <E> Set<E> i(int i10, @kotlin.b yh.l<? super Set<E>, b2> builderAction) {
        kotlin.jvm.internal.f0.p(builderAction, "builderAction");
        Set setE = c1.e(i10);
        builderAction.invoke(setE);
        return c1.a(setE);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136930u)
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final <E> Set<E> j(@kotlin.b yh.l<? super Set<E>, b2> builderAction) {
        kotlin.jvm.internal.f0.p(builderAction, "builderAction");
        Set setD = c1.d();
        builderAction.invoke(setD);
        return c1.a(setD);
    }

    @dl.d
    public static final <T> Set<T> k() {
        return EmptySet.f124541b;
    }

    @kotlin.u0(version = "1.1")
    @sh.f
    private static final <T> HashSet<T> l() {
        return new HashSet<>();
    }

    @dl.d
    public static final <T> HashSet<T> m(@dl.d T... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return (HashSet) ArraysKt___ArraysKt.Py(elements, new HashSet(r0.j(elements.length)));
    }

    @kotlin.u0(version = "1.1")
    @sh.f
    private static final <T> LinkedHashSet<T> n() {
        return new LinkedHashSet<>();
    }

    @dl.d
    public static final <T> LinkedHashSet<T> o(@dl.d T... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return (LinkedHashSet) ArraysKt___ArraysKt.Py(elements, new LinkedHashSet(r0.j(elements.length)));
    }

    @kotlin.u0(version = "1.1")
    @sh.f
    private static final <T> Set<T> p() {
        return new LinkedHashSet();
    }

    @dl.d
    public static final <T> Set<T> q(@dl.d T... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return (Set) ArraysKt___ArraysKt.Py(elements, new LinkedHashSet(r0.j(elements.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T> Set<T> r(@dl.d Set<? extends T> set) {
        kotlin.jvm.internal.f0.p(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : c1.f(set.iterator().next());
        }
        return k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @sh.f
    private static final <T> Set<T> s(Set<? extends T> set) {
        return set == 0 ? k() : set;
    }

    @sh.f
    private static final <T> Set<T> t() {
        return k();
    }

    @dl.d
    public static final <T> Set<T> u(@dl.d T... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return elements.length > 0 ? ArraysKt___ArraysKt.Mz(elements) : k();
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    public static final <T> Set<T> v(@dl.e T t10) {
        return t10 != null ? c1.f(t10) : k();
    }

    @kotlin.u0(version = "1.4")
    @dl.d
    public static final <T> Set<T> w(@dl.d T... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return (Set) ArraysKt___ArraysKt.vb(elements, new LinkedHashSet());
    }
}
