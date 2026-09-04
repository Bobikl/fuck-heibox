package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.f0;
import yh.p;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.l<T, Comparable<?>> f124663b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(yh.l<? super T, ? extends Comparable<?>> lVar) {
            this.f124663b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            yh.l<T, Comparable<?>> lVar = this.f124663b;
            return g.l(lVar.invoke(t10), lVar.invoke(t11));
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f124664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.l<T, K> f124665c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Comparator<? super K> comparator, yh.l<? super T, ? extends K> lVar) {
            this.f124664b = comparator;
            this.f124665c = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Comparator<? super K> comparator = this.f124664b;
            yh.l<T, K> lVar = this.f124665c;
            return comparator.compare((Object) lVar.invoke(t10), (Object) lVar.invoke(t11));
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.l<T, Comparable<?>> f124666b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(yh.l<? super T, ? extends Comparable<?>> lVar) {
            this.f124666b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            yh.l<T, Comparable<?>> lVar = this.f124666b;
            return g.l(lVar.invoke(t11), lVar.invoke(t10));
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f124667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.l<T, K> f124668c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Comparator<? super K> comparator, yh.l<? super T, ? extends K> lVar) {
            this.f124667b = comparator;
            this.f124668c = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Comparator<? super K> comparator = this.f124667b;
            yh.l<T, K> lVar = this.f124668c;
            return comparator.compare((Object) lVar.invoke(t11), (Object) lVar.invoke(t10));
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class e<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f124669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.l<T, Comparable<?>> f124670c;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Comparator<T> comparator, yh.l<? super T, ? extends Comparable<?>> lVar) {
            this.f124669b = comparator;
            this.f124670c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f124669b.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            yh.l<T, Comparable<?>> lVar = this.f124670c;
            return g.l(lVar.invoke(t10), lVar.invoke(t11));
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class f<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f124671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f124672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yh.l<T, K> f124673d;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Comparator<T> comparator, Comparator<? super K> comparator2, yh.l<? super T, ? extends K> lVar) {
            this.f124671b = comparator;
            this.f124672c = comparator2;
            this.f124673d = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f124671b.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            Comparator<? super K> comparator = this.f124672c;
            yh.l<T, K> lVar = this.f124673d;
            return comparator.compare((Object) lVar.invoke(t10), (Object) lVar.invoke(t11));
        }
    }

    /* JADX INFO: renamed from: kotlin.comparisons.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class C1127g<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f124674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.l<T, Comparable<?>> f124675c;

        /* JADX WARN: Multi-variable type inference failed */
        public C1127g(Comparator<T> comparator, yh.l<? super T, ? extends Comparable<?>> lVar) {
            this.f124674b = comparator;
            this.f124675c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f124674b.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            yh.l<T, Comparable<?>> lVar = this.f124675c;
            return g.l(lVar.invoke(t11), lVar.invoke(t10));
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class h<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f124676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f124677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yh.l<T, K> f124678d;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Comparator<T> comparator, Comparator<? super K> comparator2, yh.l<? super T, ? extends K> lVar) {
            this.f124676b = comparator;
            this.f124677c = comparator2;
            this.f124678d = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f124676b.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            Comparator<? super K> comparator = this.f124677c;
            yh.l<T, K> lVar = this.f124678d;
            return comparator.compare((Object) lVar.invoke(t11), (Object) lVar.invoke(t10));
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class i<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f124679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<T, T, Integer> f124680c;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Comparator<T> comparator, p<? super T, ? super T, Integer> pVar) {
            this.f124679b = comparator;
            this.f124680c = pVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f124679b.compare(t10, t11);
            return iCompare != 0 ? iCompare : this.f124680c.invoke(t10, t11).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(Comparator this_then, Comparator comparator, Object obj, Object obj2) {
        f0.p(this_then, "$this_then");
        f0.p(comparator, "$comparator");
        int iCompare = this_then.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator.compare(obj, obj2);
    }

    @sh.f
    private static final <T, K> Comparator<T> B(Comparator<T> comparator, Comparator<? super K> comparator2, yh.l<? super T, ? extends K> selector) {
        f0.p(comparator, "<this>");
        f0.p(comparator2, "comparator");
        f0.p(selector, "selector");
        return new f(comparator, comparator2, selector);
    }

    @sh.f
    private static final <T> Comparator<T> C(Comparator<T> comparator, yh.l<? super T, ? extends Comparable<?>> selector) {
        f0.p(comparator, "<this>");
        f0.p(selector, "selector");
        return new e(comparator, selector);
    }

    @sh.f
    private static final <T, K> Comparator<T> D(Comparator<T> comparator, Comparator<? super K> comparator2, yh.l<? super T, ? extends K> selector) {
        f0.p(comparator, "<this>");
        f0.p(comparator2, "comparator");
        f0.p(selector, "selector");
        return new h(comparator, comparator2, selector);
    }

    @sh.f
    private static final <T> Comparator<T> E(Comparator<T> comparator, yh.l<? super T, ? extends Comparable<?>> selector) {
        f0.p(comparator, "<this>");
        f0.p(selector, "selector");
        return new C1127g(comparator, selector);
    }

    @sh.f
    private static final <T> Comparator<T> F(Comparator<T> comparator, p<? super T, ? super T, Integer> comparison) {
        f0.p(comparator, "<this>");
        f0.p(comparison, "comparison");
        return new i(comparator, comparison);
    }

    @dl.d
    public static final <T> Comparator<T> G(@dl.d final Comparator<T> comparator, @dl.d final Comparator<? super T> comparator2) {
        f0.p(comparator, "<this>");
        f0.p(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.H(comparator, comparator2, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int H(Comparator this_thenDescending, Comparator comparator, Object obj, Object obj2) {
        f0.p(this_thenDescending, "$this_thenDescending");
        f0.p(comparator, "$comparator");
        int iCompare = this_thenDescending.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator.compare(obj2, obj);
    }

    @sh.f
    private static final <T, K> Comparator<T> f(Comparator<? super K> comparator, yh.l<? super T, ? extends K> selector) {
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        return new b(comparator, selector);
    }

    @sh.f
    private static final <T> Comparator<T> g(yh.l<? super T, ? extends Comparable<?>> selector) {
        f0.p(selector, "selector");
        return new a(selector);
    }

    @dl.d
    public static final <T> Comparator<T> h(@dl.d final yh.l<? super T, ? extends Comparable<?>>... selectors) {
        f0.p(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: kotlin.comparisons.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return g.i(selectors, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(yh.l[] selectors, Object obj, Object obj2) {
        f0.p(selectors, "$selectors");
        return p(obj, obj2, selectors);
    }

    @sh.f
    private static final <T, K> Comparator<T> j(Comparator<? super K> comparator, yh.l<? super T, ? extends K> selector) {
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        return new d(comparator, selector);
    }

    @sh.f
    private static final <T> Comparator<T> k(yh.l<? super T, ? extends Comparable<?>> selector) {
        f0.p(selector, "selector");
        return new c(selector);
    }

    public static final <T extends Comparable<?>> int l(@dl.e T t10, @dl.e T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }

    @sh.f
    private static final <T, K> int m(T t10, T t11, Comparator<? super K> comparator, yh.l<? super T, ? extends K> selector) {
        f0.p(comparator, "comparator");
        f0.p(selector, "selector");
        return comparator.compare(selector.invoke(t10), selector.invoke(t11));
    }

    @sh.f
    private static final <T> int n(T t10, T t11, yh.l<? super T, ? extends Comparable<?>> selector) {
        f0.p(selector, "selector");
        return l(selector.invoke(t10), selector.invoke(t11));
    }

    public static final <T> int o(T t10, T t11, @dl.d yh.l<? super T, ? extends Comparable<?>>... selectors) {
        f0.p(selectors, "selectors");
        if (selectors.length > 0) {
            return p(t10, t11, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final <T> int p(T t10, T t11, yh.l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (yh.l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int iL = l(lVar.invoke(t10), lVar.invoke(t11));
            if (iL != 0) {
                return iL;
            }
        }
        return 0;
    }

    @dl.d
    public static final <T extends Comparable<? super T>> Comparator<T> q() {
        j jVar = j.f124681b;
        f0.n(jVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return jVar;
    }

    @sh.f
    private static final <T extends Comparable<? super T>> Comparator<T> r() {
        return s(q());
    }

    @dl.d
    public static final <T> Comparator<T> s(@dl.d final Comparator<? super T> comparator) {
        f0.p(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.t(comparator, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(Comparator comparator, Object obj, Object obj2) {
        f0.p(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    @sh.f
    private static final <T extends Comparable<? super T>> Comparator<T> u() {
        return v(q());
    }

    @dl.d
    public static final <T> Comparator<T> v(@dl.d final Comparator<? super T> comparator) {
        f0.p(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.w(comparator, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int w(Comparator comparator, Object obj, Object obj2) {
        f0.p(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    @dl.d
    public static final <T extends Comparable<? super T>> Comparator<T> x() {
        k kVar = k.f124682b;
        f0.n(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return kVar;
    }

    @dl.d
    public static final <T> Comparator<T> y(@dl.d Comparator<T> comparator) {
        f0.p(comparator, "<this>");
        if (comparator instanceof l) {
            return ((l) comparator).a();
        }
        Comparator<T> lVar = j.f124681b;
        if (f0.g(comparator, lVar)) {
            k kVar = k.f124682b;
            f0.n(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return kVar;
        }
        if (f0.g(comparator, k.f124682b)) {
            f0.n(lVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        } else {
            lVar = new l<>(comparator);
        }
        return lVar;
    }

    @dl.d
    public static final <T> Comparator<T> z(@dl.d final Comparator<T> comparator, @dl.d final Comparator<? super T> comparator2) {
        f0.p(comparator, "<this>");
        f0.p(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.A(comparator, comparator2, obj, obj2);
            }
        };
    }
}
