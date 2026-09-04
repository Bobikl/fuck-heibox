package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.a
@o9.c
@u
public class TreeRangeSet<C extends Comparable<?>> extends f<C> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @o9.d
    final NavigableMap<Cut<C>, Range<C>> f58004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private transient Set<Range<C>> f58005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    private transient Set<Range<C>> f58006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @CheckForNull
    private transient c2<C> f58007e;

    public final class Complement extends TreeRangeSet<C> {
        Complement() {
            super(new c(TreeRangeSet.this.f58004b));
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f, com.google.common.collect.c2
        public boolean a(C c10) {
            return !TreeRangeSet.this.a(c10);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f, com.google.common.collect.c2
        public void b(Range<C> range) {
            TreeRangeSet.this.o(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.c2
        public c2<C> d() {
            return TreeRangeSet.this;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f, com.google.common.collect.c2
        public void o(Range<C> range) {
            TreeRangeSet.this.b(range);
        }
    }

    public final class SubRangeSet extends TreeRangeSet<C> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Range<C> f58009f;

        /* JADX WARN: Illegal instructions before constructor call */
        SubRangeSet(Range<C> range) {
            super(new e(Range.a(), range, TreeRangeSet.this.f58004b));
            this.f58009f = range;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f, com.google.common.collect.c2
        public boolean a(C c10) {
            return this.f58009f.i(c10) && TreeRangeSet.this.a(c10);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f, com.google.common.collect.c2
        public void b(Range<C> range) {
            if (range.t(this.f58009f)) {
                TreeRangeSet.this.b(range.s(this.f58009f));
            }
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f, com.google.common.collect.c2
        public void clear() {
            TreeRangeSet.this.b(this.f58009f);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f, com.google.common.collect.c2
        @CheckForNull
        public Range<C> h(C c10) {
            Range<C> rangeH;
            if (this.f58009f.i(c10) && (rangeH = TreeRangeSet.this.h(c10)) != null) {
                return rangeH.s(this.f58009f);
            }
            return null;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f, com.google.common.collect.c2
        public boolean i(Range<C> range) {
            Range rangeV;
            return (this.f58009f.u() || !this.f58009f.n(range) || (rangeV = TreeRangeSet.this.v(range)) == null || rangeV.s(this.f58009f).u()) ? false : true;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.c2
        public c2<C> k(Range<C> range) {
            if (range.n(this.f58009f)) {
                return this;
            }
            return range.t(this.f58009f) ? new SubRangeSet(this.f58009f.s(range)) : ImmutableRangeSet.E();
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.f, com.google.common.collect.c2
        public void o(Range<C> range) {
            com.google.common.base.w.y(this.f58009f.n(range), "Cannot add range %s to subRangeSet(%s)", range, this.f58009f);
            TreeRangeSet.this.o(range);
        }
    }

    public final class b extends h0<Range<C>> implements Set<Range<C>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Collection<Range<C>> f58011b;

        b(TreeRangeSet treeRangeSet, Collection<Range<C>> collection) {
            this.f58011b = collection;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.h0, com.google.common.collect.y0
        public Collection<Range<C>> H0() {
            return this.f58011b;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            return Sets.g(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.k(this);
        }
    }

    public static final class c<C extends Comparable<?>> extends com.google.common.collect.e<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NavigableMap<Cut<C>, Range<C>> f58012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final NavigableMap<Cut<C>, Range<C>> f58013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Range<Cut<C>> f58014d;

        public class a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Cut<C> f58015d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Cut f58016e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ y1 f58017f;

            a(Cut cut, y1 y1Var) {
                this.f58016e = cut;
                this.f58017f = y1Var;
                this.f58015d = cut;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                Range rangeK;
                if (c.this.f58014d.f57776c.k(this.f58015d) || this.f58015d == Cut.a()) {
                    return (Map.Entry) b();
                }
                if (this.f58017f.hasNext()) {
                    Range range = (Range) this.f58017f.next();
                    rangeK = Range.k(this.f58015d, range.f57775b);
                    this.f58015d = range.f57776c;
                } else {
                    rangeK = Range.k(this.f58015d, Cut.a());
                    this.f58015d = Cut.a();
                }
                return Maps.O(rangeK.f57775b, rangeK);
            }
        }

        public class b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Cut<C> f58019d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Cut f58020e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ y1 f58021f;

            b(Cut cut, y1 y1Var) {
                this.f58020e = cut;
                this.f58021f = y1Var;
                this.f58019d = cut;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                if (this.f58019d == Cut.c()) {
                    return (Map.Entry) b();
                }
                if (this.f58021f.hasNext()) {
                    Range range = (Range) this.f58021f.next();
                    Range rangeK = Range.k(range.f57776c, this.f58019d);
                    this.f58019d = range.f57775b;
                    if (c.this.f58014d.f57775b.k(rangeK.f57775b)) {
                        return Maps.O(rangeK.f57775b, rangeK);
                    }
                } else if (c.this.f58014d.f57775b.k(Cut.c())) {
                    Range rangeK2 = Range.k(Cut.c(), this.f58019d);
                    this.f58019d = Cut.c();
                    return Maps.O(Cut.c(), rangeK2);
                }
                return (Map.Entry) b();
            }
        }

        c(NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this(navigableMap, Range.a());
        }

        private c(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.f58012b = navigableMap;
            this.f58013c = new d(navigableMap);
            this.f58014d = range;
        }

        private NavigableMap<Cut<C>, Range<C>> g(Range<Cut<C>> range) {
            if (!this.f58014d.t(range)) {
                return ImmutableSortedMap.v0();
            }
            return new c(this.f58012b, range.s(this.f58014d));
        }

        @Override // com.google.common.collect.Maps.y
        Iterator<Map.Entry<Cut<C>, Range<C>>> a() {
            Collection<Range<C>> collectionValues;
            Cut cutC;
            if (this.f58014d.q()) {
                collectionValues = this.f58013c.tailMap((Cut) this.f58014d.y(), this.f58014d.x() == BoundType.CLOSED).values();
            } else {
                collectionValues = this.f58013c.values();
            }
            y1 y1VarT = Iterators.T(collectionValues.iterator());
            if (this.f58014d.i(Cut.c()) && (!y1VarT.hasNext() || ((Range) y1VarT.peek()).f57775b != Cut.c())) {
                cutC = Cut.c();
            } else {
                if (!y1VarT.hasNext()) {
                    return Iterators.u();
                }
                cutC = ((Range) y1VarT.next()).f57776c;
            }
            return new a(cutC, y1VarT);
        }

        @Override // com.google.common.collect.e
        Iterator<Map.Entry<Cut<C>, Range<C>>> b() {
            Cut<C> cutHigherKey;
            y1 y1VarT = Iterators.T(this.f58013c.headMap(this.f58014d.r() ? (Cut) this.f58014d.K() : Cut.a(), this.f58014d.r() && this.f58014d.J() == BoundType.CLOSED).descendingMap().values().iterator());
            if (y1VarT.hasNext()) {
                cutHigherKey = ((Range) y1VarT.peek()).f57776c == Cut.a() ? ((Range) y1VarT.next()).f57775b : this.f58012b.higherKey(((Range) y1VarT.peek()).f57776c);
            } else {
                if (!this.f58014d.i(Cut.c()) || this.f58012b.containsKey(Cut.c())) {
                    return Iterators.u();
                }
                cutHigherKey = this.f58012b.higherKey(Cut.c());
            }
            return new b((Cut) com.google.common.base.q.a(cutHigherKey, Cut.a()), y1VarT);
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.z();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.e, java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Range<C> get(@CheckForNull Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    Map.Entry<Cut<C>, Range<C>> entryFirstEntry = tailMap(cut, true).firstEntry();
                    if (entryFirstEntry != null && entryFirstEntry.getKey().equals(cut)) {
                        return entryFirstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z10) {
            return g(Range.H(cut, BoundType.forBoolean(z10)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z10, Cut<C> cut2, boolean z11) {
            return g(Range.B(cut, BoundType.forBoolean(z10), cut2, BoundType.forBoolean(z11)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z10) {
            return g(Range.l(cut, BoundType.forBoolean(z10)));
        }

        @Override // com.google.common.collect.Maps.y, java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.Z(a());
        }
    }

    @o9.d
    public static final class d<C extends Comparable<?>> extends com.google.common.collect.e<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NavigableMap<Cut<C>, Range<C>> f58023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Range<Cut<C>> f58024c;

        public class a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f58025d;

            a(Iterator it) {
                this.f58025d = it;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                if (!this.f58025d.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.f58025d.next();
                return d.this.f58024c.f57776c.k(range.f57776c) ? (Map.Entry) b() : Maps.O(range.f57776c, range);
            }
        }

        public class b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ y1 f58027d;

            b(y1 y1Var) {
                this.f58027d = y1Var;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                if (!this.f58027d.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.f58027d.next();
                return d.this.f58024c.f57775b.k(range.f57776c) ? Maps.O(range.f57776c, range) : (Map.Entry) b();
            }
        }

        d(NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this.f58023b = navigableMap;
            this.f58024c = Range.a();
        }

        private d(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.f58023b = navigableMap;
            this.f58024c = range;
        }

        private NavigableMap<Cut<C>, Range<C>> g(Range<Cut<C>> range) {
            return range.t(this.f58024c) ? new d(this.f58023b, range.s(this.f58024c)) : ImmutableSortedMap.v0();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.Maps.y
        Iterator<Map.Entry<Cut<C>, Range<C>>> a() {
            Map.Entry<Cut<C>, Range<C>> entryLowerEntry;
            Iterator<Range<C>> it;
            if (this.f58024c.q() && (entryLowerEntry = this.f58023b.lowerEntry((Cut) this.f58024c.y())) != null) {
                it = this.f58024c.f57775b.k(entryLowerEntry.getValue().f57776c) ? this.f58023b.tailMap(entryLowerEntry.getKey(), true).values().iterator() : this.f58023b.tailMap((Cut) this.f58024c.y(), true).values().iterator();
            } else {
                it = this.f58023b.values().iterator();
            }
            return new a(it);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.e
        Iterator<Map.Entry<Cut<C>, Range<C>>> b() {
            y1 y1VarT = Iterators.T((this.f58024c.r() ? this.f58023b.headMap((Cut) this.f58024c.K(), false).descendingMap().values() : this.f58023b.descendingMap().values()).iterator());
            if (y1VarT.hasNext() && this.f58024c.f57776c.k(((Range) y1VarT.peek()).f57776c)) {
                y1VarT.next();
            }
            return new b(y1VarT);
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.z();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.e, java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Range<C> get(@CheckForNull Object obj) {
            Map.Entry<Cut<C>, Range<C>> entryLowerEntry;
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    if (this.f58024c.i(cut) && (entryLowerEntry = this.f58023b.lowerEntry(cut)) != null && entryLowerEntry.getValue().f57776c.equals(cut)) {
                        return entryLowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z10) {
            return g(Range.H(cut, BoundType.forBoolean(z10)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z10, Cut<C> cut2, boolean z11) {
            return g(Range.B(cut, BoundType.forBoolean(z10), cut2, BoundType.forBoolean(z11)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z10) {
            return g(Range.l(cut, BoundType.forBoolean(z10)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            if (this.f58024c.equals(Range.a())) {
                return this.f58023b.isEmpty();
            }
            return !a().hasNext();
        }

        @Override // com.google.common.collect.Maps.y, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f58024c.equals(Range.a()) ? this.f58023b.size() : Iterators.Z(a());
        }
    }

    public static final class e<C extends Comparable<?>> extends com.google.common.collect.e<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Range<Cut<C>> f58029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Range<C> f58030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final NavigableMap<Cut<C>, Range<C>> f58031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final NavigableMap<Cut<C>, Range<C>> f58032e;

        public class a extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f58033d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Cut f58034e;

            a(Iterator it, Cut cut) {
                this.f58033d = it;
                this.f58034e = cut;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                if (!this.f58033d.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.f58033d.next();
                if (this.f58034e.k(range.f57775b)) {
                    return (Map.Entry) b();
                }
                Range rangeS = range.s(e.this.f58030c);
                return Maps.O(rangeS.f57775b, rangeS);
            }
        }

        public class b extends AbstractIterator<Map.Entry<Cut<C>, Range<C>>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f58036d;

            b(Iterator it) {
                this.f58036d = it;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Cut<C>, Range<C>> a() {
                if (!this.f58036d.hasNext()) {
                    return (Map.Entry) b();
                }
                Range range = (Range) this.f58036d.next();
                if (e.this.f58030c.f57775b.compareTo(range.f57776c) >= 0) {
                    return (Map.Entry) b();
                }
                Range rangeS = range.s(e.this.f58030c);
                return e.this.f58029b.i(rangeS.f57775b) ? Maps.O(rangeS.f57775b, rangeS) : (Map.Entry) b();
            }
        }

        private e(Range<Cut<C>> range, Range<C> range2, NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this.f58029b = (Range) com.google.common.base.w.E(range);
            this.f58030c = (Range) com.google.common.base.w.E(range2);
            this.f58031d = (NavigableMap) com.google.common.base.w.E(navigableMap);
            this.f58032e = new d(navigableMap);
        }

        private NavigableMap<Cut<C>, Range<C>> h(Range<Cut<C>> range) {
            return !range.t(this.f58029b) ? ImmutableSortedMap.v0() : new e(this.f58029b.s(range), this.f58030c, this.f58031d);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.Maps.y
        Iterator<Map.Entry<Cut<C>, Range<C>>> a() {
            Iterator<Range<C>> it;
            if (!this.f58030c.u() && !this.f58029b.f57776c.k(this.f58030c.f57775b)) {
                if (this.f58029b.f57775b.k(this.f58030c.f57775b)) {
                    it = this.f58032e.tailMap(this.f58030c.f57775b, false).values().iterator();
                } else {
                    it = this.f58031d.tailMap((Cut) this.f58029b.f57775b.i(), this.f58029b.x() == BoundType.CLOSED).values().iterator();
                }
                return new a(it, (Cut) Ordering.z().w(this.f58029b.f57776c, Cut.d(this.f58030c.f57776c)));
            }
            return Iterators.u();
        }

        @Override // com.google.common.collect.e
        Iterator<Map.Entry<Cut<C>, Range<C>>> b() {
            if (this.f58030c.u()) {
                return Iterators.u();
            }
            Cut cut = (Cut) Ordering.z().w(this.f58029b.f57776c, Cut.d(this.f58030c.f57776c));
            return new b(this.f58031d.headMap((Cut) cut.i(), cut.n() == BoundType.CLOSED).descendingMap().values().iterator());
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.z();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return get(obj) != null;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.e, java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Range<C> get(@CheckForNull Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    if (this.f58029b.i(cut) && cut.compareTo(this.f58030c.f57775b) >= 0 && cut.compareTo(this.f58030c.f57776c) < 0) {
                        if (cut.equals(this.f58030c.f57775b)) {
                            Range range = (Range) Maps.P0(this.f58031d.floorEntry(cut));
                            if (range != null && range.f57776c.compareTo(this.f58030c.f57775b) > 0) {
                                return range.s(this.f58030c);
                            }
                        } else {
                            Range<C> range2 = this.f58031d.get(cut);
                            if (range2 != null) {
                                return range2.s(this.f58030c);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z10) {
            return h(Range.H(cut, BoundType.forBoolean(z10)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z10, Cut<C> cut2, boolean z11) {
            return h(Range.B(cut, BoundType.forBoolean(z10), cut2, BoundType.forBoolean(z11)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z10) {
            return h(Range.l(cut, BoundType.forBoolean(z10)));
        }

        @Override // com.google.common.collect.Maps.y, java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.Z(a());
        }
    }

    private TreeRangeSet(NavigableMap<Cut<C>, Range<C>> navigableMap) {
        this.f58004b = navigableMap;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> s() {
        return new TreeRangeSet<>(new TreeMap());
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> t(c2<C> c2Var) {
        TreeRangeSet<C> treeRangeSetS = s();
        treeRangeSetS.q(c2Var);
        return treeRangeSetS;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> u(Iterable<Range<C>> iterable) {
        TreeRangeSet<C> treeRangeSetS = s();
        treeRangeSetS.p(iterable);
        return treeRangeSetS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public Range<C> v(Range<C> range) {
        com.google.common.base.w.E(range);
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.f58004b.floorEntry(range.f57775b);
        if (entryFloorEntry == null || !entryFloorEntry.getValue().n(range)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    private void w(Range<C> range) {
        if (range.u()) {
            this.f58004b.remove(range.f57775b);
        } else {
            this.f58004b.put(range.f57775b, range);
        }
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return super.a(comparable);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public void b(Range<C> range) {
        com.google.common.base.w.E(range);
        if (range.u()) {
            return;
        }
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.f58004b.lowerEntry(range.f57775b);
        if (entryLowerEntry != null) {
            Range<C> value = entryLowerEntry.getValue();
            if (value.f57776c.compareTo(range.f57775b) >= 0) {
                if (range.r() && value.f57776c.compareTo(range.f57776c) >= 0) {
                    w(Range.k(range.f57776c, value.f57776c));
                }
                w(Range.k(value.f57775b, range.f57775b));
            }
        }
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.f58004b.floorEntry(range.f57776c);
        if (entryFloorEntry != null) {
            Range<C> value2 = entryFloorEntry.getValue();
            if (range.r() && value2.f57776c.compareTo(range.f57776c) >= 0) {
                w(Range.k(range.f57776c, value2.f57776c));
            }
        }
        this.f58004b.subMap(range.f57775b, range.f57776c).clear();
    }

    @Override // com.google.common.collect.c2
    public Range<C> c() {
        Map.Entry<Cut<C>, Range<C>> entryFirstEntry = this.f58004b.firstEntry();
        Map.Entry<Cut<C>, Range<C>> entryLastEntry = this.f58004b.lastEntry();
        if (entryFirstEntry == null || entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return Range.k(entryFirstEntry.getValue().f57775b, entryLastEntry.getValue().f57776c);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.c2
    public c2<C> d() {
        c2<C> c2Var = this.f58007e;
        if (c2Var != null) {
            return c2Var;
        }
        Complement complement = new Complement();
        this.f58007e = complement;
        return complement;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public boolean e(Range<C> range) {
        com.google.common.base.w.E(range);
        Map.Entry<Cut<C>, Range<C>> entryCeilingEntry = this.f58004b.ceilingEntry(range.f57775b);
        if (entryCeilingEntry != null && entryCeilingEntry.getValue().t(range) && !entryCeilingEntry.getValue().s(range).u()) {
            return true;
        }
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.f58004b.lowerEntry(range.f57775b);
        return (entryLowerEntry == null || !entryLowerEntry.getValue().t(range) || entryLowerEntry.getValue().s(range).u()) ? false : true;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public /* bridge */ /* synthetic */ void f(Iterable iterable) {
        super.f(iterable);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public /* bridge */ /* synthetic */ boolean g(c2 c2Var) {
        return super.g(c2Var);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    @CheckForNull
    public Range<C> h(C c10) {
        com.google.common.base.w.E(c10);
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.f58004b.floorEntry(Cut.d(c10));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().i(c10)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public boolean i(Range<C> range) {
        com.google.common.base.w.E(range);
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.f58004b.floorEntry(range.f57775b);
        return entryFloorEntry != null && entryFloorEntry.getValue().n(range);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public /* bridge */ /* synthetic */ boolean j(Iterable iterable) {
        return super.j(iterable);
    }

    @Override // com.google.common.collect.c2
    public c2<C> k(Range<C> range) {
        return range.equals(Range.a()) ? this : new SubRangeSet(range);
    }

    @Override // com.google.common.collect.c2
    public Set<Range<C>> l() {
        Set<Range<C>> set = this.f58006d;
        if (set != null) {
            return set;
        }
        b bVar = new b(this, this.f58004b.descendingMap().values());
        this.f58006d = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.c2
    public Set<Range<C>> m() {
        Set<Range<C>> set = this.f58005c;
        if (set != null) {
            return set;
        }
        b bVar = new b(this, this.f58004b.values());
        this.f58005c = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public /* bridge */ /* synthetic */ void n(c2 c2Var) {
        super.n(c2Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public void o(Range<C> range) {
        com.google.common.base.w.E(range);
        if (range.u()) {
            return;
        }
        Cut<C> cut = range.f57775b;
        Cut<C> cut2 = range.f57776c;
        Map.Entry<Cut<C>, Range<C>> entryLowerEntry = this.f58004b.lowerEntry(cut);
        if (entryLowerEntry != null) {
            Range<C> value = entryLowerEntry.getValue();
            if (value.f57776c.compareTo(cut) >= 0) {
                if (value.f57776c.compareTo(cut2) >= 0) {
                    cut2 = value.f57776c;
                }
                cut = value.f57775b;
            }
        }
        Map.Entry<Cut<C>, Range<C>> entryFloorEntry = this.f58004b.floorEntry(cut2);
        if (entryFloorEntry != null) {
            Range<C> value2 = entryFloorEntry.getValue();
            if (value2.f57776c.compareTo(cut2) >= 0) {
                cut2 = value2.f57776c;
            }
        }
        this.f58004b.subMap(cut, cut2).clear();
        w(Range.k(cut, cut2));
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public /* bridge */ /* synthetic */ void p(Iterable iterable) {
        super.p(iterable);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.c2
    public /* bridge */ /* synthetic */ void q(c2 c2Var) {
        super.q(c2Var);
    }
}
