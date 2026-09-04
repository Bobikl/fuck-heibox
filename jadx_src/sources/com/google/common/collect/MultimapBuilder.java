package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class MultimapBuilder<K0, V0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f57678a = 8;

    public static final class ArrayListSupplier<V> implements com.google.common.base.c0<List<V>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f57679b;

        ArrayListSupplier(int i10) {
            this.f57679b = n.b(i10, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f57679b);
        }
    }

    public static final class EnumSetSupplier<V extends Enum<V>> implements com.google.common.base.c0<Set<V>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<V> f57680b;

        EnumSetSupplier(Class<V> cls) {
            this.f57680b = (Class) com.google.common.base.w.E(cls);
        }

        @Override // com.google.common.base.c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<V> get() {
            return EnumSet.noneOf(this.f57680b);
        }
    }

    public static final class HashSetSupplier<V> implements com.google.common.base.c0<Set<V>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f57681b;

        HashSetSupplier(int i10) {
            this.f57681b = n.b(i10, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<V> get() {
            return z1.e(this.f57681b);
        }
    }

    public static final class LinkedHashSetSupplier<V> implements com.google.common.base.c0<Set<V>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f57682b;

        LinkedHashSetSupplier(int i10) {
            this.f57682b = n.b(i10, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<V> get() {
            return z1.g(this.f57682b);
        }
    }

    public enum LinkedListSupplier implements com.google.common.base.c0<List<?>> {
        INSTANCE;

        public static <V> com.google.common.base.c0<List<V>> instance() {
            return INSTANCE;
        }

        @Override // com.google.common.base.c0
        public List<?> get() {
            return new LinkedList();
        }
    }

    public static final class TreeSetSupplier<V> implements com.google.common.base.c0<SortedSet<V>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Comparator<? super V> f57683b;

        TreeSetSupplier(Comparator<? super V> comparator) {
            this.f57683b = (Comparator) com.google.common.base.w.E(comparator);
        }

        @Override // com.google.common.base.c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SortedSet<V> get() {
            return new TreeSet(this.f57683b);
        }
    }

    public class a extends f<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f57684b;

        a(int i10) {
            this.f57684b = i10;
        }

        @Override // com.google.common.collect.MultimapBuilder.f
        <K, V> Map<K, Collection<V>> c() {
            return z1.d(this.f57684b);
        }
    }

    public class b extends f<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f57685b;

        b(int i10) {
            this.f57685b = i10;
        }

        @Override // com.google.common.collect.MultimapBuilder.f
        <K, V> Map<K, Collection<V>> c() {
            return z1.f(this.f57685b);
        }
    }

    public class c extends f<K0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f57686b;

        c(Comparator comparator) {
            this.f57686b = comparator;
        }

        @Override // com.google.common.collect.MultimapBuilder.f
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f57686b);
        }
    }

    public class d extends f<K0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f57687b;

        d(Class cls) {
            this.f57687b = cls;
        }

        @Override // com.google.common.collect.MultimapBuilder.f
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new EnumMap(this.f57687b);
        }
    }

    public static abstract class e<K0, V0> extends MultimapBuilder<K0, V0> {
        e() {
            super(null);
        }

        @Override // com.google.common.collect.MultimapBuilder
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public abstract <K extends K0, V extends V0> o1<K, V> a();

        @Override // com.google.common.collect.MultimapBuilder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public <K extends K0, V extends V0> o1<K, V> b(r1<? extends K, ? extends V> r1Var) {
            return (o1) super.b(r1Var);
        }
    }

    public static abstract class f<K0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f57688a = 2;

        public class a extends e<K0, Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f57689b;

            a(int i10) {
                this.f57689b = i10;
            }

            @Override // com.google.common.collect.MultimapBuilder.e, com.google.common.collect.MultimapBuilder
            /* JADX INFO: renamed from: j */
            public <K extends K0, V> o1<K, V> a() {
                return Multimaps.u(f.this.c(), new ArrayListSupplier(this.f57689b));
            }
        }

        public class b extends e<K0, Object> {
            b() {
            }

            @Override // com.google.common.collect.MultimapBuilder.e, com.google.common.collect.MultimapBuilder
            /* JADX INFO: renamed from: j */
            public <K extends K0, V> o1<K, V> a() {
                return Multimaps.u(f.this.c(), LinkedListSupplier.instance());
            }
        }

        public class c extends g<K0, Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f57692b;

            c(int i10) {
                this.f57692b = i10;
            }

            @Override // com.google.common.collect.MultimapBuilder.g, com.google.common.collect.MultimapBuilder
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public <K extends K0, V> i2<K, V> a() {
                return Multimaps.w(f.this.c(), new HashSetSupplier(this.f57692b));
            }
        }

        public class d extends g<K0, Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f57694b;

            d(int i10) {
                this.f57694b = i10;
            }

            @Override // com.google.common.collect.MultimapBuilder.g, com.google.common.collect.MultimapBuilder
            /* JADX INFO: renamed from: j */
            public <K extends K0, V> i2<K, V> a() {
                return Multimaps.w(f.this.c(), new LinkedHashSetSupplier(this.f57694b));
            }
        }

        public class e extends h<K0, V0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Comparator f57696b;

            e(Comparator comparator) {
                this.f57696b = comparator;
            }

            @Override // com.google.common.collect.MultimapBuilder.h, com.google.common.collect.MultimapBuilder.g
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public <K extends K0, V extends V0> t2<K, V> a() {
                return Multimaps.x(f.this.c(), new TreeSetSupplier(this.f57696b));
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.MultimapBuilder$f$f, reason: collision with other inner class name */
        public class C0450f extends g<K0, V0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Class f57698b;

            C0450f(Class cls) {
                this.f57698b = cls;
            }

            @Override // com.google.common.collect.MultimapBuilder.g, com.google.common.collect.MultimapBuilder
            /* JADX INFO: renamed from: j */
            public <K extends K0, V extends V0> i2<K, V> a() {
                return Multimaps.w(f.this.c(), new EnumSetSupplier(this.f57698b));
            }
        }

        f() {
        }

        public e<K0, Object> a() {
            return b(2);
        }

        public e<K0, Object> b(int i10) {
            n.b(i10, "expectedValuesPerKey");
            return new a(i10);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> c();

        public <V0 extends Enum<V0>> g<K0, V0> d(Class<V0> cls) {
            com.google.common.base.w.F(cls, "valueClass");
            return new C0450f(cls);
        }

        public g<K0, Object> e() {
            return f(2);
        }

        public g<K0, Object> f(int i10) {
            n.b(i10, "expectedValuesPerKey");
            return new c(i10);
        }

        public g<K0, Object> g() {
            return h(2);
        }

        public g<K0, Object> h(int i10) {
            n.b(i10, "expectedValuesPerKey");
            return new d(i10);
        }

        public e<K0, Object> i() {
            return new b();
        }

        public h<K0, Comparable> j() {
            return k(Ordering.z());
        }

        public <V0> h<K0, V0> k(Comparator<V0> comparator) {
            com.google.common.base.w.F(comparator, "comparator");
            return new e(comparator);
        }
    }

    public static abstract class g<K0, V0> extends MultimapBuilder<K0, V0> {
        g() {
            super(null);
        }

        @Override // com.google.common.collect.MultimapBuilder
        /* JADX INFO: renamed from: j */
        public abstract <K extends K0, V extends V0> i2<K, V> a();

        @Override // com.google.common.collect.MultimapBuilder
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public <K extends K0, V extends V0> i2<K, V> b(r1<? extends K, ? extends V> r1Var) {
            return (i2) super.b(r1Var);
        }
    }

    public static abstract class h<K0, V0> extends g<K0, V0> {
        h() {
        }

        @Override // com.google.common.collect.MultimapBuilder.g
        /* JADX INFO: renamed from: l */
        public abstract <K extends K0, V extends V0> t2<K, V> a();

        @Override // com.google.common.collect.MultimapBuilder.g
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public <K extends K0, V extends V0> t2<K, V> b(r1<? extends K, ? extends V> r1Var) {
            return (t2) super.b(r1Var);
        }
    }

    private MultimapBuilder() {
    }

    /* synthetic */ MultimapBuilder(a aVar) {
        this();
    }

    public static <K0 extends Enum<K0>> f<K0> c(Class<K0> cls) {
        com.google.common.base.w.E(cls);
        return new d(cls);
    }

    public static f<Object> d() {
        return e(8);
    }

    public static f<Object> e(int i10) {
        n.b(i10, "expectedKeys");
        return new a(i10);
    }

    public static f<Object> f() {
        return g(8);
    }

    public static f<Object> g(int i10) {
        n.b(i10, "expectedKeys");
        return new b(i10);
    }

    public static f<Comparable> h() {
        return i(Ordering.z());
    }

    public static <K0> f<K0> i(Comparator<K0> comparator) {
        com.google.common.base.w.E(comparator);
        return new c(comparator);
    }

    public abstract <K extends K0, V extends V0> r1<K, V> a();

    public <K extends K0, V extends V0> r1<K, V> b(r1<? extends K, ? extends V> r1Var) {
        r1<K, V> r1VarA = a();
        r1VarA.A(r1Var);
        return r1VarA;
    }
}
