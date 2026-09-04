package com.google.common.collect;

import com.google.common.base.Predicates;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public final class Multisets {

    public static class ImmutableEntry<E> extends f<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x1
        private final E f57724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f57725c;

        ImmutableEntry(@x1 E e10, int i10) {
            this.f57724b = e10;
            this.f57725c = i10;
            n.b(i10, "count");
        }

        @Override // com.google.common.collect.s1.a
        @x1
        public final E a() {
            return this.f57724b;
        }

        @CheckForNull
        public ImmutableEntry<E> b() {
            return null;
        }

        @Override // com.google.common.collect.s1.a
        public final int getCount() {
            return this.f57725c;
        }
    }

    public static class UnmodifiableMultiset<E> extends v0<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final s1<? extends E> f57726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        transient Set<E> f57727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        transient Set<s1.a<E>> f57728d;

        UnmodifiableMultiset(s1<? extends E> s1Var) {
            this.f57726b = s1Var;
        }

        @Override // com.google.common.collect.v0, com.google.common.collect.s1
        public int I0(@x1 E e10, int i10) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.v0, com.google.common.collect.h0
        public s1<E> H0() {
            return this.f57726b;
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Queue
        public boolean add(@x1 E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h0, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.v0, com.google.common.collect.s1
        public Set<E> c() {
            Set<E> set = this.f57727c;
            if (set != null) {
                return set;
            }
            Set<E> setM1 = m1();
            this.f57727c = setM1;
            return setM1;
        }

        @Override // com.google.common.collect.v0, com.google.common.collect.s1
        public int c0(@x1 E e10, int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.v0, com.google.common.collect.s1
        public Set<s1.a<E>> entrySet() {
            Set<s1.a<E>> set = this.f57728d;
            if (set != null) {
                return set;
            }
            Set<s1.a<E>> setUnmodifiableSet = Collections.unmodifiableSet(this.f57726b.entrySet());
            this.f57728d = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.v0, com.google.common.collect.s1
        public boolean g0(@x1 E e10, int i10, int i11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Iterators.f0(this.f57726b.iterator());
        }

        Set<E> m1() {
            return Collections.unmodifiableSet(this.f57726b.c());
        }

        @Override // com.google.common.collect.v0, com.google.common.collect.s1
        public int n1(@CheckForNull Object obj, int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class a<E> extends l<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s1 f57729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ s1 f57730e;

        /* JADX INFO: renamed from: com.google.common.collect.Multisets$a$a, reason: collision with other inner class name */
        public class C0455a extends AbstractIterator<s1.a<E>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f57731d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Iterator f57732e;

            C0455a(Iterator it, Iterator it2) {
                this.f57731d = it;
                this.f57732e = it2;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public s1.a<E> a() {
                if (this.f57731d.hasNext()) {
                    s1.a aVar = (s1.a) this.f57731d.next();
                    Object objA = aVar.a();
                    return Multisets.k(objA, Math.max(aVar.getCount(), a.this.f57730e.E1(objA)));
                }
                while (this.f57732e.hasNext()) {
                    s1.a aVar2 = (s1.a) this.f57732e.next();
                    Object objA2 = aVar2.a();
                    if (!a.this.f57729d.contains(objA2)) {
                        return Multisets.k(objA2, aVar2.getCount());
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s1 s1Var, s1 s1Var2) {
            super(null);
            this.f57729d = s1Var;
            this.f57730e = s1Var2;
        }

        @Override // com.google.common.collect.s1
        public int E1(@CheckForNull Object obj) {
            return Math.max(this.f57729d.E1(obj), this.f57730e.E1(obj));
        }

        @Override // com.google.common.collect.d
        Set<E> a() {
            return Sets.N(this.f57729d.c(), this.f57730e.c());
        }

        @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
        public boolean contains(@CheckForNull Object obj) {
            return this.f57729d.contains(obj) || this.f57730e.contains(obj);
        }

        @Override // com.google.common.collect.d
        Iterator<E> g() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.d
        Iterator<s1.a<E>> h() {
            return new C0455a(this.f57729d.entrySet().iterator(), this.f57730e.entrySet().iterator());
        }

        @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f57729d.isEmpty() && this.f57730e.isEmpty();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class b<E> extends l<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s1 f57734d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ s1 f57735e;

        public class a extends AbstractIterator<s1.a<E>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f57736d;

            a(Iterator it) {
                this.f57736d = it;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public s1.a<E> a() {
                while (this.f57736d.hasNext()) {
                    s1.a aVar = (s1.a) this.f57736d.next();
                    Object objA = aVar.a();
                    int iMin = Math.min(aVar.getCount(), b.this.f57735e.E1(objA));
                    if (iMin > 0) {
                        return Multisets.k(objA, iMin);
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s1 s1Var, s1 s1Var2) {
            super(null);
            this.f57734d = s1Var;
            this.f57735e = s1Var2;
        }

        @Override // com.google.common.collect.s1
        public int E1(@CheckForNull Object obj) {
            int iE1 = this.f57734d.E1(obj);
            if (iE1 == 0) {
                return 0;
            }
            return Math.min(iE1, this.f57735e.E1(obj));
        }

        @Override // com.google.common.collect.d
        Set<E> a() {
            return Sets.n(this.f57734d.c(), this.f57735e.c());
        }

        @Override // com.google.common.collect.d
        Iterator<E> g() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.d
        Iterator<s1.a<E>> h() {
            return new a(this.f57734d.entrySet().iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class c<E> extends l<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s1 f57738d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ s1 f57739e;

        public class a extends AbstractIterator<s1.a<E>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f57740d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Iterator f57741e;

            a(Iterator it, Iterator it2) {
                this.f57740d = it;
                this.f57741e = it2;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public s1.a<E> a() {
                if (this.f57740d.hasNext()) {
                    s1.a aVar = (s1.a) this.f57740d.next();
                    Object objA = aVar.a();
                    return Multisets.k(objA, aVar.getCount() + c.this.f57739e.E1(objA));
                }
                while (this.f57741e.hasNext()) {
                    s1.a aVar2 = (s1.a) this.f57741e.next();
                    Object objA2 = aVar2.a();
                    if (!c.this.f57738d.contains(objA2)) {
                        return Multisets.k(objA2, aVar2.getCount());
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(s1 s1Var, s1 s1Var2) {
            super(null);
            this.f57738d = s1Var;
            this.f57739e = s1Var2;
        }

        @Override // com.google.common.collect.s1
        public int E1(@CheckForNull Object obj) {
            return this.f57738d.E1(obj) + this.f57739e.E1(obj);
        }

        @Override // com.google.common.collect.d
        Set<E> a() {
            return Sets.N(this.f57738d.c(), this.f57739e.c());
        }

        @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
        public boolean contains(@CheckForNull Object obj) {
            return this.f57738d.contains(obj) || this.f57739e.contains(obj);
        }

        @Override // com.google.common.collect.d
        Iterator<E> g() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.d
        Iterator<s1.a<E>> h() {
            return new a(this.f57738d.entrySet().iterator(), this.f57739e.entrySet().iterator());
        }

        @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f57738d.isEmpty() && this.f57739e.isEmpty();
        }

        @Override // com.google.common.collect.Multisets.l, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
        public int size() {
            return com.google.common.math.f.t(this.f57738d.size(), this.f57739e.size());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class d<E> extends l<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s1 f57743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ s1 f57744e;

        public class a extends AbstractIterator<E> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f57745d;

            a(Iterator it) {
                this.f57745d = it;
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
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            protected E a() {
                while (this.f57745d.hasNext()) {
                    s1.a aVar = (s1.a) this.f57745d.next();
                    E e10 = (E) aVar.a();
                    if (aVar.getCount() > d.this.f57744e.E1(e10)) {
                        return e10;
                    }
                }
                return b();
            }
        }

        public class b extends AbstractIterator<s1.a<E>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f57747d;

            b(Iterator it) {
                this.f57747d = it;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public s1.a<E> a() {
                while (this.f57747d.hasNext()) {
                    s1.a aVar = (s1.a) this.f57747d.next();
                    Object objA = aVar.a();
                    int count = aVar.getCount() - d.this.f57744e.E1(objA);
                    if (count > 0) {
                        return Multisets.k(objA, count);
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(s1 s1Var, s1 s1Var2) {
            super(null);
            this.f57743d = s1Var;
            this.f57744e = s1Var2;
        }

        @Override // com.google.common.collect.s1
        public int E1(@CheckForNull Object obj) {
            int iE1 = this.f57743d.E1(obj);
            if (iE1 == 0) {
                return 0;
            }
            return Math.max(0, iE1 - this.f57744e.E1(obj));
        }

        @Override // com.google.common.collect.Multisets.l, com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multisets.l, com.google.common.collect.d
        int e() {
            return Iterators.Z(h());
        }

        @Override // com.google.common.collect.d
        Iterator<E> g() {
            return new a(this.f57743d.entrySet().iterator());
        }

        @Override // com.google.common.collect.d
        Iterator<s1.a<E>> h() {
            return new b(this.f57743d.entrySet().iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class e<E> extends w2<s1.a<E>, E> {
        e(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.w2
        @x1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public E a(s1.a<E> aVar) {
            return aVar.a();
        }
    }

    public static abstract class f<E> implements s1.a<E> {
        f() {
        }

        @Override // com.google.common.collect.s1.a
        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof s1.a)) {
                return false;
            }
            s1.a aVar = (s1.a) obj;
            return getCount() == aVar.getCount() && com.google.common.base.s.a(a(), aVar.a());
        }

        @Override // com.google.common.collect.s1.a
        public int hashCode() {
            E eA = a();
            return (eA == null ? 0 : eA.hashCode()) ^ getCount();
        }

        @Override // com.google.common.collect.s1.a
        public String toString() {
            String strValueOf = String.valueOf(a());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 14);
            sb2.append(strValueOf);
            sb2.append(" x ");
            sb2.append(count);
            return sb2.toString();
        }
    }

    public static final class g implements Comparator<s1.a<?>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final g f57749b = new g();

        private g() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(s1.a<?> aVar, s1.a<?> aVar2) {
            return aVar2.getCount() - aVar.getCount();
        }
    }

    public static abstract class h<E> extends Sets.j<E> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return h().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return h().containsAll(collection);
        }

        abstract s1<E> h();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return h().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract Iterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            return h().n1(obj, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h().entrySet().size();
        }
    }

    public static abstract class i<E> extends Sets.j<s1.a<E>> {
        i() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof s1.a)) {
                return false;
            }
            s1.a aVar = (s1.a) obj;
            return aVar.getCount() > 0 && h().E1(aVar.a()) == aVar.getCount();
        }

        abstract s1<E> h();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (obj instanceof s1.a) {
                s1.a aVar = (s1.a) obj;
                Object objA = aVar.a();
                int count = aVar.getCount();
                if (count != 0) {
                    return h().g0(objA, count, 0);
                }
            }
            return false;
        }
    }

    public static final class j<E> extends l<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final s1<E> f57750d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final com.google.common.base.x<? super E> f57751e;

        public class a implements com.google.common.base.x<s1.a<E>> {
            a() {
            }

            @Override // com.google.common.base.x
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean apply(s1.a<E> aVar) {
                return j.this.f57751e.apply(aVar.a());
            }
        }

        j(s1<E> s1Var, com.google.common.base.x<? super E> xVar) {
            super(null);
            this.f57750d = (s1) com.google.common.base.w.E(s1Var);
            this.f57751e = (com.google.common.base.x) com.google.common.base.w.E(xVar);
        }

        @Override // com.google.common.collect.s1
        public int E1(@CheckForNull Object obj) {
            int iE1 = this.f57750d.E1(obj);
            if (iE1 <= 0 || !this.f57751e.apply(obj)) {
                return 0;
            }
            return iE1;
        }

        @Override // com.google.common.collect.d
        Set<E> a() {
            return Sets.i(this.f57750d.c(), this.f57751e);
        }

        @Override // com.google.common.collect.d
        Set<s1.a<E>> b() {
            return Sets.i(this.f57750d.entrySet(), new a());
        }

        @Override // com.google.common.collect.d, com.google.common.collect.s1
        public int c0(@x1 E e10, int i10) {
            com.google.common.base.w.y(this.f57751e.apply(e10), "Element %s does not match predicate %s", e10, this.f57751e);
            return this.f57750d.c0(e10, i10);
        }

        @Override // com.google.common.collect.d
        Iterator<E> g() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.d
        Iterator<s1.a<E>> h() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.Multisets.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.s1
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b3<E> iterator() {
            return Iterators.x(this.f57750d.iterator(), this.f57751e);
        }

        @Override // com.google.common.collect.d, com.google.common.collect.s1
        public int n1(@CheckForNull Object obj, int i10) {
            n.b(i10, "occurrences");
            if (i10 == 0) {
                return E1(obj);
            }
            if (contains(obj)) {
                return this.f57750d.n1(obj, i10);
            }
            return 0;
        }
    }

    public static final class k<E> implements Iterator<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s1<E> f57753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Iterator<s1.a<E>> f57754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        private s1.a<E> f57755d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f57756e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f57757f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f57758g;

        k(s1<E> s1Var, Iterator<s1.a<E>> it) {
            this.f57753b = s1Var;
            this.f57754c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57756e > 0 || this.f57754c.hasNext();
        }

        @Override // java.util.Iterator
        @x1
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f57756e == 0) {
                s1.a<E> next = this.f57754c.next();
                this.f57755d = next;
                int count = next.getCount();
                this.f57756e = count;
                this.f57757f = count;
            }
            this.f57756e--;
            this.f57758g = true;
            s1.a<E> aVar = this.f57755d;
            Objects.requireNonNull(aVar);
            return aVar.a();
        }

        @Override // java.util.Iterator
        public void remove() {
            n.e(this.f57758g);
            if (this.f57757f == 1) {
                this.f57754c.remove();
            } else {
                s1<E> s1Var = this.f57753b;
                s1.a<E> aVar = this.f57755d;
                Objects.requireNonNull(aVar);
                s1Var.remove(aVar.a());
            }
            this.f57757f--;
            this.f57758g = false;
        }
    }

    public static abstract class l<E> extends com.google.common.collect.d<E> {
        private l() {
        }

        /* synthetic */ l(a aVar) {
            this();
        }

        @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c().clear();
        }

        @Override // com.google.common.collect.d
        int e() {
            return c().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.s1
        public Iterator<E> iterator() {
            return Multisets.n(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
        public int size() {
            return Multisets.o(this);
        }
    }

    private Multisets() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> s1<E> A(s1<? extends E> s1Var) {
        return ((s1Var instanceof UnmodifiableMultiset) || (s1Var instanceof ImmutableMultiset)) ? s1Var : new UnmodifiableMultiset((s1) com.google.common.base.w.E(s1Var));
    }

    @o9.a
    public static <E> o2<E> B(o2<E> o2Var) {
        return new UnmodifiableSortedMultiset((o2) com.google.common.base.w.E(o2Var));
    }

    private static <E> boolean a(s1<E> s1Var, AbstractMapBasedMultiset<? extends E> abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.i(s1Var);
        return true;
    }

    private static <E> boolean b(s1<E> s1Var, s1<? extends E> s1Var2) {
        if (s1Var2 instanceof AbstractMapBasedMultiset) {
            return a(s1Var, (AbstractMapBasedMultiset) s1Var2);
        }
        if (s1Var2.isEmpty()) {
            return false;
        }
        for (s1.a<? extends E> aVar : s1Var2.entrySet()) {
            s1Var.c0(aVar.a(), aVar.getCount());
        }
        return true;
    }

    static <E> boolean c(s1<E> s1Var, Collection<? extends E> collection) {
        com.google.common.base.w.E(s1Var);
        com.google.common.base.w.E(collection);
        if (collection instanceof s1) {
            return b(s1Var, d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.a(s1Var, collection.iterator());
    }

    static <T> s1<T> d(Iterable<T> iterable) {
        return (s1) iterable;
    }

    @s9.a
    public static boolean e(s1<?> s1Var, s1<?> s1Var2) {
        com.google.common.base.w.E(s1Var);
        com.google.common.base.w.E(s1Var2);
        for (s1.a<?> aVar : s1Var2.entrySet()) {
            if (s1Var.E1(aVar.a()) < aVar.getCount()) {
                return false;
            }
        }
        return true;
    }

    @o9.a
    public static <E> ImmutableMultiset<E> f(s1<E> s1Var) {
        s1.a[] aVarArr = (s1.a[]) s1Var.entrySet().toArray(new s1.a[0]);
        Arrays.sort(aVarArr, g.f57749b);
        return ImmutableMultiset.q(Arrays.asList(aVarArr));
    }

    @o9.a
    public static <E> s1<E> g(s1<E> s1Var, s1<?> s1Var2) {
        com.google.common.base.w.E(s1Var);
        com.google.common.base.w.E(s1Var2);
        return new d(s1Var, s1Var2);
    }

    static <E> Iterator<E> h(Iterator<s1.a<E>> it) {
        return new e(it);
    }

    static boolean i(s1<?> s1Var, @CheckForNull Object obj) {
        if (obj == s1Var) {
            return true;
        }
        if (obj instanceof s1) {
            s1 s1Var2 = (s1) obj;
            if (s1Var.size() == s1Var2.size() && s1Var.entrySet().size() == s1Var2.entrySet().size()) {
                for (s1.a aVar : s1Var2.entrySet()) {
                    if (s1Var.E1(aVar.a()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @o9.a
    public static <E> s1<E> j(s1<E> s1Var, com.google.common.base.x<? super E> xVar) {
        if (!(s1Var instanceof j)) {
            return new j(s1Var, xVar);
        }
        j jVar = (j) s1Var;
        return new j(jVar.f57750d, Predicates.d(jVar.f57751e, xVar));
    }

    public static <E> s1.a<E> k(@x1 E e10, int i10) {
        return new ImmutableEntry(e10, i10);
    }

    static int l(Iterable<?> iterable) {
        if (iterable instanceof s1) {
            return ((s1) iterable).c().size();
        }
        return 11;
    }

    public static <E> s1<E> m(s1<E> s1Var, s1<?> s1Var2) {
        com.google.common.base.w.E(s1Var);
        com.google.common.base.w.E(s1Var2);
        return new b(s1Var, s1Var2);
    }

    static <E> Iterator<E> n(s1<E> s1Var) {
        return new k(s1Var, s1Var.entrySet().iterator());
    }

    static int o(s1<?> s1Var) {
        Iterator<s1.a<?>> it = s1Var.entrySet().iterator();
        long count = 0;
        while (it.hasNext()) {
            count += (long) it.next().getCount();
        }
        return Ints.x(count);
    }

    static boolean p(s1<?> s1Var, Collection<?> collection) {
        if (collection instanceof s1) {
            collection = ((s1) collection).c();
        }
        return s1Var.c().removeAll(collection);
    }

    @s9.a
    public static boolean q(s1<?> s1Var, s1<?> s1Var2) {
        com.google.common.base.w.E(s1Var);
        com.google.common.base.w.E(s1Var2);
        Iterator<s1.a<?>> it = s1Var.entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            s1.a<?> next = it.next();
            int iE1 = s1Var2.E1(next.a());
            if (iE1 >= next.getCount()) {
                it.remove();
            } else if (iE1 > 0) {
                s1Var.n1(next.a(), iE1);
            }
            z10 = true;
        }
        return z10;
    }

    @s9.a
    public static boolean r(s1<?> s1Var, Iterable<?> iterable) {
        if (iterable instanceof s1) {
            return q(s1Var, (s1) iterable);
        }
        com.google.common.base.w.E(s1Var);
        com.google.common.base.w.E(iterable);
        boolean zRemove = false;
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            zRemove |= s1Var.remove(it.next());
        }
        return zRemove;
    }

    static boolean s(s1<?> s1Var, Collection<?> collection) {
        com.google.common.base.w.E(collection);
        if (collection instanceof s1) {
            collection = ((s1) collection).c();
        }
        return s1Var.c().retainAll(collection);
    }

    @s9.a
    public static boolean t(s1<?> s1Var, s1<?> s1Var2) {
        return u(s1Var, s1Var2);
    }

    private static <E> boolean u(s1<E> s1Var, s1<?> s1Var2) {
        com.google.common.base.w.E(s1Var);
        com.google.common.base.w.E(s1Var2);
        Iterator<s1.a<E>> it = s1Var.entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            s1.a<E> next = it.next();
            int iE1 = s1Var2.E1(next.a());
            if (iE1 == 0) {
                it.remove();
            } else if (iE1 < next.getCount()) {
                s1Var.I0(next.a(), iE1);
            }
            z10 = true;
        }
        return z10;
    }

    static <E> int v(s1<E> s1Var, @x1 E e10, int i10) {
        n.b(i10, "count");
        int iE1 = s1Var.E1(e10);
        int i11 = i10 - iE1;
        if (i11 > 0) {
            s1Var.c0(e10, i11);
        } else if (i11 < 0) {
            s1Var.n1(e10, -i11);
        }
        return iE1;
    }

    static <E> boolean w(s1<E> s1Var, @x1 E e10, int i10, int i11) {
        n.b(i10, "oldCount");
        n.b(i11, "newCount");
        if (s1Var.E1(e10) != i10) {
            return false;
        }
        s1Var.I0(e10, i11);
        return true;
    }

    @o9.a
    public static <E> s1<E> x(s1<? extends E> s1Var, s1<? extends E> s1Var2) {
        com.google.common.base.w.E(s1Var);
        com.google.common.base.w.E(s1Var2);
        return new c(s1Var, s1Var2);
    }

    @o9.a
    public static <E> s1<E> y(s1<? extends E> s1Var, s1<? extends E> s1Var2) {
        com.google.common.base.w.E(s1Var);
        com.google.common.base.w.E(s1Var2);
        return new a(s1Var, s1Var2);
    }

    @Deprecated
    public static <E> s1<E> z(ImmutableMultiset<E> immutableMultiset) {
        return (s1) com.google.common.base.w.E(immutableMultiset);
    }
}
