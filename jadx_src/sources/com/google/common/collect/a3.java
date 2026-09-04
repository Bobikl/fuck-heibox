package com.google.common.collect;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: TreeTraverser.java */
/* JADX INFO: loaded from: classes7.dex */
@Deprecated
@o9.a
@o9.b
@u
public abstract class a3<T> {

    /* JADX INFO: compiled from: TreeTraverser.java */
    public class a extends a3<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.base.n f58042a;

        a(com.google.common.base.n nVar) {
            this.f58042a = nVar;
        }

        @Override // com.google.common.collect.a3
        public Iterable<T> b(T t10) {
            return (Iterable) this.f58042a.apply(t10);
        }
    }

    /* JADX INFO: compiled from: TreeTraverser.java */
    public class b extends f0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f58043c;

        b(Object obj) {
            this.f58043c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public b3<T> iterator() {
            return a3.this.e(this.f58043c);
        }
    }

    /* JADX INFO: compiled from: TreeTraverser.java */
    public class c extends f0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f58045c;

        c(Object obj) {
            this.f58045c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public b3<T> iterator() {
            return a3.this.c(this.f58045c);
        }
    }

    /* JADX INFO: compiled from: TreeTraverser.java */
    public class d extends f0<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f58047c;

        d(Object obj) {
            this.f58047c = obj;
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public b3<T> iterator() {
            return new e(this.f58047c);
        }
    }

    /* JADX INFO: compiled from: TreeTraverser.java */
    public final class e extends b3<T> implements y1<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Queue<T> f58049b;

        e(T t10) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f58049b = arrayDeque;
            arrayDeque.add(t10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f58049b.isEmpty();
        }

        @Override // java.util.Iterator, com.google.common.collect.y1
        public T next() {
            T tRemove = this.f58049b.remove();
            l1.a(this.f58049b, a3.this.b(tRemove));
            return tRemove;
        }

        @Override // com.google.common.collect.y1
        public T peek() {
            return this.f58049b.element();
        }
    }

    /* JADX INFO: compiled from: TreeTraverser.java */
    public final class f extends AbstractIterator<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ArrayDeque<g<T>> f58051d;

        f(T t10) {
            ArrayDeque<g<T>> arrayDeque = new ArrayDeque<>();
            this.f58051d = arrayDeque;
            arrayDeque.addLast(d(t10));
        }

        private g<T> d(T t10) {
            return new g<>(t10, a3.this.b(t10).iterator());
        }

        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        protected T a() {
            while (!this.f58051d.isEmpty()) {
                g<T> last = this.f58051d.getLast();
                if (!last.f58054b.hasNext()) {
                    this.f58051d.removeLast();
                    return last.f58053a;
                }
                this.f58051d.addLast(d(last.f58054b.next()));
            }
            return b();
        }
    }

    /* JADX INFO: compiled from: TreeTraverser.java */
    public static final class g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T f58053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Iterator<T> f58054b;

        g(T t10, Iterator<T> it) {
            this.f58053a = (T) com.google.common.base.w.E(t10);
            this.f58054b = (Iterator) com.google.common.base.w.E(it);
        }
    }

    /* JADX INFO: compiled from: TreeTraverser.java */
    public final class h extends b3<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Deque<Iterator<T>> f58055b;

        h(T t10) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f58055b = arrayDeque;
            arrayDeque.addLast(Iterators.Y(com.google.common.base.w.E(t10)));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f58055b.isEmpty();
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
        @Override // java.util.Iterator
        public T next() {
            Iterator<T> last = this.f58055b.getLast();
            T t10 = (T) com.google.common.base.w.E(last.next());
            if (!last.hasNext()) {
                this.f58055b.removeLast();
            }
            Iterator<T> it = a3.this.b(t10).iterator();
            if (it.hasNext()) {
                this.f58055b.addLast(it);
            }
            return t10;
        }
    }

    @Deprecated
    public static <T> a3<T> g(com.google.common.base.n<T, ? extends Iterable<T>> nVar) {
        com.google.common.base.w.E(nVar);
        return new a(nVar);
    }

    @Deprecated
    public final f0<T> a(T t10) {
        com.google.common.base.w.E(t10);
        return new d(t10);
    }

    public abstract Iterable<T> b(T t10);

    b3<T> c(T t10) {
        return new f(t10);
    }

    @Deprecated
    public final f0<T> d(T t10) {
        com.google.common.base.w.E(t10);
        return new c(t10);
    }

    b3<T> e(T t10) {
        return new h(t10);
    }

    @Deprecated
    public final f0<T> f(T t10) {
        com.google.common.base.w.E(t10);
        return new b(t10);
    }
}
