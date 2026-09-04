package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.b3;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.a
@s9.f("Call forGraph or forTree, passing a lambda or a Graph with the desired edges (built with GraphBuilder)")
@t
public abstract class Traverser<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c1<N> f58327a;

    public enum InsertionOrder {
        FRONT { // from class: com.google.common.graph.Traverser.InsertionOrder.1
            @Override // com.google.common.graph.Traverser.InsertionOrder
            <T> void insertInto(Deque<T> deque, T t10) {
                deque.addFirst(t10);
            }
        },
        BACK { // from class: com.google.common.graph.Traverser.InsertionOrder.2
            @Override // com.google.common.graph.Traverser.InsertionOrder
            <T> void insertInto(Deque<T> deque, T t10) {
                deque.addLast(t10);
            }
        };

        /* synthetic */ InsertionOrder(a aVar) {
            this();
        }

        abstract <T> void insertInto(Deque<T> deque, T t10);
    }

    public class a extends Traverser<N> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1 f58328b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c1 c1Var, c1 c1Var2) {
            super(c1Var, null);
            this.f58328b = c1Var2;
        }

        @Override // com.google.common.graph.Traverser
        f<N> i() {
            return f.b(this.f58328b);
        }
    }

    public class b extends Traverser<N> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1 f58329b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c1 c1Var, c1 c1Var2) {
            super(c1Var, null);
            this.f58329b = c1Var2;
        }

        @Override // com.google.common.graph.Traverser
        f<N> i() {
            return f.c(this.f58329b);
        }
    }

    public class c implements Iterable<N> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImmutableSet f58330b;

        c(ImmutableSet immutableSet) {
            this.f58330b = immutableSet;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return Traverser.this.i().a(this.f58330b.iterator());
        }
    }

    public class d implements Iterable<N> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImmutableSet f58332b;

        d(ImmutableSet immutableSet) {
            this.f58332b = immutableSet;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return Traverser.this.i().e(this.f58332b.iterator());
        }
    }

    public class e implements Iterable<N> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImmutableSet f58334b;

        e(ImmutableSet immutableSet) {
            this.f58334b = immutableSet;
        }

        @Override // java.lang.Iterable
        public Iterator<N> iterator() {
            return Traverser.this.i().d(this.f58334b.iterator());
        }
    }

    public static abstract class f<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c1<N> f58336a;

        public class a extends f<N> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Set f58337b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c1 c1Var, Set set) {
                super(c1Var);
                this.f58337b = set;
            }

            @Override // com.google.common.graph.Traverser.f
            @CheckForNull
            N g(Deque<Iterator<? extends N>> deque) {
                Iterator<? extends N> first = deque.getFirst();
                while (first.hasNext()) {
                    N next = first.next();
                    Objects.requireNonNull(next);
                    if (this.f58337b.add(next)) {
                        return next;
                    }
                }
                deque.removeFirst();
                return null;
            }
        }

        public class b extends f<N> {
            b(c1 c1Var) {
                super(c1Var);
            }

            @Override // com.google.common.graph.Traverser.f
            @CheckForNull
            N g(Deque<Iterator<? extends N>> deque) {
                Iterator<? extends N> first = deque.getFirst();
                if (first.hasNext()) {
                    return (N) com.google.common.base.w.E(first.next());
                }
                deque.removeFirst();
                return null;
            }
        }

        public class c extends AbstractIterator<N> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Deque f58338d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ InsertionOrder f58339e;

            c(Deque deque, InsertionOrder insertionOrder) {
                this.f58338d = deque;
                this.f58339e = insertionOrder;
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
            protected N a() {
                do {
                    N n10 = (N) f.this.g(this.f58338d);
                    if (n10 != null) {
                        Iterator<? extends N> it = f.this.f58336a.a(n10).iterator();
                        if (it.hasNext()) {
                            this.f58339e.insertInto(this.f58338d, it);
                        }
                        return n10;
                    }
                } while (!this.f58338d.isEmpty());
                return b();
            }
        }

        public class d extends AbstractIterator<N> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Deque f58341d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Deque f58342e;

            d(Deque deque, Deque deque2) {
                this.f58341d = deque;
                this.f58342e = deque2;
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
            protected N a() {
                while (true) {
                    N n10 = (N) f.this.g(this.f58341d);
                    if (n10 == null) {
                        return !this.f58342e.isEmpty() ? (N) this.f58342e.pop() : b();
                    }
                    Iterator<? extends N> it = f.this.f58336a.a(n10).iterator();
                    if (!it.hasNext()) {
                        return n10;
                    }
                    this.f58341d.addFirst(it);
                    this.f58342e.push(n10);
                }
            }
        }

        f(c1<N> c1Var) {
            this.f58336a = c1Var;
        }

        static <N> f<N> b(c1<N> c1Var) {
            return new a(c1Var, new HashSet());
        }

        static <N> f<N> c(c1<N> c1Var) {
            return new b(c1Var);
        }

        private Iterator<N> f(Iterator<? extends N> it, InsertionOrder insertionOrder) {
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(it);
            return new c(arrayDeque, insertionOrder);
        }

        final Iterator<N> a(Iterator<? extends N> it) {
            return f(it, InsertionOrder.BACK);
        }

        final Iterator<N> d(Iterator<? extends N> it) {
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(it);
            return new d(arrayDeque2, arrayDeque);
        }

        final Iterator<N> e(Iterator<? extends N> it) {
            return f(it, InsertionOrder.FRONT);
        }

        @CheckForNull
        abstract N g(Deque<Iterator<? extends N>> deque);
    }

    private Traverser(c1<N> c1Var) {
        this.f58327a = (c1) com.google.common.base.w.E(c1Var);
    }

    /* synthetic */ Traverser(c1 c1Var, a aVar) {
        this(c1Var);
    }

    public static <N> Traverser<N> g(c1<N> c1Var) {
        return new a(c1Var, c1Var);
    }

    public static <N> Traverser<N> h(c1<N> c1Var) {
        if (c1Var instanceof l) {
            com.google.common.base.w.e(((l) c1Var).c(), "Undirected graphs can never be trees.");
        }
        if (c1Var instanceof s0) {
            com.google.common.base.w.e(((s0) c1Var).c(), "Undirected networks can never be trees.");
        }
        return new b(c1Var, c1Var);
    }

    private ImmutableSet<N> j(Iterable<? extends N> iterable) {
        ImmutableSet<N> immutableSetV = ImmutableSet.v(iterable);
        b3<N> it = immutableSetV.iterator();
        while (it.hasNext()) {
            this.f58327a.a(it.next());
        }
        return immutableSetV;
    }

    public final Iterable<N> a(Iterable<? extends N> iterable) {
        return new c(j(iterable));
    }

    public final Iterable<N> b(N n10) {
        return a(ImmutableSet.E(n10));
    }

    public final Iterable<N> c(Iterable<? extends N> iterable) {
        return new e(j(iterable));
    }

    public final Iterable<N> d(N n10) {
        return c(ImmutableSet.E(n10));
    }

    public final Iterable<N> e(Iterable<? extends N> iterable) {
        return new d(j(iterable));
    }

    public final Iterable<N> f(N n10) {
        return e(ImmutableSet.E(n10));
    }

    abstract f<N> i();
}
