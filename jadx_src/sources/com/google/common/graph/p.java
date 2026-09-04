package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.b3;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: DirectedGraphConnections.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public final class p<N, V> implements c0<N, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f58414e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<N, Object> f58415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private final List<f<N>> f58416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f58417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f58418d;

    /* JADX INFO: compiled from: DirectedGraphConnections.java */
    public class a extends AbstractSet<N> {

        /* JADX INFO: renamed from: com.google.common.graph.p$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DirectedGraphConnections.java */
        public class C0478a extends AbstractIterator<N> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f58420d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Set f58421e;

            C0478a(a aVar, Iterator it, Set set) {
                this.f58420d = it;
                this.f58421e = set;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            protected N a() {
                while (this.f58420d.hasNext()) {
                    f fVar = (f) this.f58420d.next();
                    if (this.f58421e.add(fVar.f58431a)) {
                        return fVar.f58431a;
                    }
                }
                return b();
            }
        }

        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b3<N> iterator() {
            return new C0478a(this, p.this.f58416b.iterator(), new HashSet());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return p.this.f58415a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return p.this.f58415a.size();
        }
    }

    /* JADX INFO: compiled from: DirectedGraphConnections.java */
    public class b extends AbstractSet<N> {

        /* JADX INFO: compiled from: DirectedGraphConnections.java */
        public class a extends AbstractIterator<N> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f58423d;

            a(b bVar, Iterator it) {
                this.f58423d = it;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            protected N a() {
                while (this.f58423d.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f58423d.next();
                    if (p.s(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return b();
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.p$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DirectedGraphConnections.java */
        public class C0479b extends AbstractIterator<N> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f58424d;

            C0479b(b bVar, Iterator it) {
                this.f58424d = it;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            protected N a() {
                while (this.f58424d.hasNext()) {
                    f fVar = (f) this.f58424d.next();
                    if (fVar instanceof f.a) {
                        return fVar.f58431a;
                    }
                }
                return b();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b3<N> iterator() {
            return p.this.f58416b == null ? new a(this, p.this.f58415a.entrySet().iterator()) : new C0479b(this, p.this.f58416b.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return p.s(p.this.f58415a.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return p.this.f58417c;
        }
    }

    /* JADX INFO: compiled from: DirectedGraphConnections.java */
    public class c extends AbstractSet<N> {

        /* JADX INFO: compiled from: DirectedGraphConnections.java */
        public class a extends AbstractIterator<N> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f58426d;

            a(c cVar, Iterator it) {
                this.f58426d = it;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            protected N a() {
                while (this.f58426d.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f58426d.next();
                    if (p.t(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return b();
            }
        }

        /* JADX INFO: compiled from: DirectedGraphConnections.java */
        public class b extends AbstractIterator<N> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f58427d;

            b(c cVar, Iterator it) {
                this.f58427d = it;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            protected N a() {
                while (this.f58427d.hasNext()) {
                    f fVar = (f) this.f58427d.next();
                    if (fVar instanceof f.b) {
                        return fVar.f58431a;
                    }
                }
                return b();
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b3<N> iterator() {
            return p.this.f58416b == null ? new a(this, p.this.f58415a.entrySet().iterator()) : new b(this, p.this.f58416b.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return p.t(p.this.f58415a.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return p.this.f58418d;
        }
    }

    /* JADX INFO: compiled from: DirectedGraphConnections.java */
    public class d extends AbstractIterator<u<N>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Iterator f58428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f58429e;

        d(p pVar, Iterator it, AtomicBoolean atomicBoolean) {
            this.f58428d = it;
            this.f58429e = atomicBoolean;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u<N> a() {
            while (this.f58428d.hasNext()) {
                u<N> uVar = (u) this.f58428d.next();
                if (!uVar.g().equals(uVar.h()) || !this.f58429e.getAndSet(true)) {
                    return uVar;
                }
            }
            return b();
        }
    }

    /* JADX INFO: compiled from: DirectedGraphConnections.java */
    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58430a;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            f58430a = iArr;
            try {
                iArr[ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58430a[ElementOrder.Type.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: DirectedGraphConnections.java */
    public static abstract class f<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final N f58431a;

        /* JADX INFO: compiled from: DirectedGraphConnections.java */
        public static final class a<N> extends f<N> {
            a(N n10) {
                super(n10);
            }

            public boolean equals(@CheckForNull Object obj) {
                if (obj instanceof a) {
                    return this.f58431a.equals(((a) obj).f58431a);
                }
                return false;
            }

            public int hashCode() {
                return a.class.hashCode() + this.f58431a.hashCode();
            }
        }

        /* JADX INFO: compiled from: DirectedGraphConnections.java */
        public static final class b<N> extends f<N> {
            b(N n10) {
                super(n10);
            }

            public boolean equals(@CheckForNull Object obj) {
                if (obj instanceof b) {
                    return this.f58431a.equals(((b) obj).f58431a);
                }
                return false;
            }

            public int hashCode() {
                return b.class.hashCode() + this.f58431a.hashCode();
            }
        }

        f(N n10) {
            this.f58431a = (N) com.google.common.base.w.E(n10);
        }
    }

    /* JADX INFO: compiled from: DirectedGraphConnections.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f58432a;

        g(Object obj) {
            this.f58432a = obj;
        }
    }

    private p(Map<N, Object> map, @CheckForNull List<f<N>> list, int i10, int i11) {
        this.f58415a = (Map) com.google.common.base.w.E(map);
        this.f58416b = list;
        this.f58417c = Graphs.b(i10);
        this.f58418d = Graphs.b(i11);
        com.google.common.base.w.g0(i10 <= map.size() && i11 <= map.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(@CheckForNull Object obj) {
        return obj == f58414e || (obj instanceof g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(@CheckForNull Object obj) {
        return (obj == f58414e || obj == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ u u(Object obj, Object obj2) {
        return u.l(obj2, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ u w(Object obj, f fVar) {
        return fVar instanceof f.b ? u.l(obj, fVar.f58431a) : u.l(fVar.f58431a, obj);
    }

    static <N, V> p<N, V> x(ElementOrder<N> elementOrder) {
        ArrayList arrayList;
        int i10 = e.f58430a[elementOrder.h().ordinal()];
        if (i10 == 1) {
            arrayList = null;
        } else {
            if (i10 != 2) {
                throw new AssertionError(elementOrder.h());
            }
            arrayList = new ArrayList();
        }
        return new p<>(new HashMap(4, 1.0f), arrayList, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <N, V> p<N, V> y(N n10, Iterable<u<N>> iterable, com.google.common.base.n<N, V> nVar) {
        com.google.common.base.w.E(n10);
        com.google.common.base.w.E(nVar);
        HashMap map = new HashMap();
        ImmutableList.a aVarQ = ImmutableList.q();
        int i10 = 0;
        int i11 = 0;
        for (u<N> uVar : iterable) {
            if (uVar.g().equals(n10) && uVar.h().equals(n10)) {
                map.put(n10, new g(nVar.apply(n10)));
                aVarQ.a(new f.a(n10));
                aVarQ.a(new f.b(n10));
                i10++;
            } else if (uVar.h().equals(n10)) {
                N nG = uVar.g();
                Object objPut = map.put(nG, f58414e);
                if (objPut != null) {
                    map.put(nG, new g(objPut));
                }
                aVarQ.a(new f.a(nG));
                i10++;
            } else {
                com.google.common.base.w.d(uVar.g().equals(n10));
                N nH = uVar.h();
                V vApply = nVar.apply(nH);
                Object objPut2 = map.put(nH, vApply);
                if (objPut2 != null) {
                    com.google.common.base.w.d(objPut2 == f58414e);
                    map.put(nH, new g(vApply));
                }
                aVarQ.a(new f.b(nH));
            }
            i11++;
        }
        return new p<>(map, aVarQ.e(), i10, i11);
    }

    @Override // com.google.common.graph.c0
    public Set<N> a() {
        return this.f58416b == null ? Collections.unmodifiableSet(this.f58415a.keySet()) : new a();
    }

    @Override // com.google.common.graph.c0
    public Set<N> b() {
        return new c();
    }

    @Override // com.google.common.graph.c0
    public Set<N> c() {
        return new b();
    }

    @Override // com.google.common.graph.c0
    public void d(N n10, V v10) {
        Map<N, Object> map = this.f58415a;
        Object obj = f58414e;
        Object objPut = map.put(n10, obj);
        boolean z10 = false;
        if (objPut == null) {
            z10 = true;
        } else if (objPut instanceof g) {
            this.f58415a.put(n10, objPut);
        } else if (objPut != obj) {
            this.f58415a.put(n10, new g(objPut));
            z10 = true;
        }
        if (z10) {
            int i10 = this.f58417c + 1;
            this.f58417c = i10;
            Graphs.d(i10);
            List<f<N>> list = this.f58416b;
            if (list != null) {
                list.add(new f.a(n10));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.c0
    @CheckForNull
    public V e(N n10) {
        com.google.common.base.w.E(n10);
        V v10 = (V) this.f58415a.get(n10);
        if (v10 == f58414e) {
            return null;
        }
        return v10 instanceof g ? (V) ((g) v10).f58432a : v10;
    }

    @Override // com.google.common.graph.c0
    @CheckForNull
    public V f(Object obj) {
        Object obj2;
        com.google.common.base.w.E(obj);
        Object obj3 = this.f58415a.get(obj);
        if (obj3 == null || obj3 == (obj2 = f58414e)) {
            obj3 = null;
        } else if (obj3 instanceof g) {
            this.f58415a.put(obj, obj2);
            obj3 = ((g) obj3).f58432a;
        } else {
            this.f58415a.remove(obj);
        }
        if (obj3 != null) {
            int i10 = this.f58418d - 1;
            this.f58418d = i10;
            Graphs.b(i10);
            List<f<N>> list = this.f58416b;
            if (list != null) {
                list.remove(new f.b(obj));
            }
        }
        if (obj3 == null) {
            return null;
        }
        return (V) obj3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // com.google.common.graph.c0
    public void g(N n10) {
        boolean z10;
        List<f<N>> list;
        com.google.common.base.w.E(n10);
        Object obj = this.f58415a.get(n10);
        if (obj != f58414e) {
            if (obj instanceof g) {
                this.f58415a.put(n10, ((g) obj).f58432a);
            } else {
                z10 = false;
            }
            if (z10) {
                int i10 = this.f58417c - 1;
                this.f58417c = i10;
                Graphs.b(i10);
                list = this.f58416b;
                if (list != null) {
                    list.remove(new f.a(n10));
                }
            }
        }
        this.f58415a.remove(n10);
        z10 = true;
        if (z10) {
            int i11 = this.f58417c - 1;
            this.f58417c = i11;
            Graphs.b(i11);
            list = this.f58416b;
            if (list != null) {
                list.remove(new f.a(n10));
            }
        }
    }

    @Override // com.google.common.graph.c0
    public Iterator<u<N>> h(final N n10) {
        com.google.common.base.w.E(n10);
        List<f<N>> list = this.f58416b;
        return new d(this, list == null ? Iterators.j(Iterators.c0(c().iterator(), new com.google.common.base.n() { // from class: com.google.common.graph.m
            @Override // com.google.common.base.n
            public final Object apply(Object obj) {
                return p.u(n10, obj);
            }
        }), Iterators.c0(b().iterator(), new com.google.common.base.n() { // from class: com.google.common.graph.n
            @Override // com.google.common.base.n
            public final Object apply(Object obj) {
                return u.l(n10, obj);
            }
        })) : Iterators.c0(list.iterator(), new com.google.common.base.n() { // from class: com.google.common.graph.o
            @Override // com.google.common.base.n
            public final Object apply(Object obj) {
                return p.w(n10, (p.f) obj);
            }
        }), new AtomicBoolean(false));
    }

    @Override // com.google.common.graph.c0
    @CheckForNull
    public V i(N n10, V v10) {
        Object objPut = this.f58415a.put(n10, v10);
        if (objPut == null) {
            objPut = null;
        } else if (objPut instanceof g) {
            this.f58415a.put(n10, new g(v10));
            objPut = ((g) objPut).f58432a;
        } else if (objPut == f58414e) {
            this.f58415a.put(n10, new g(v10));
            objPut = null;
        }
        if (objPut == null) {
            int i10 = this.f58418d + 1;
            this.f58418d = i10;
            Graphs.d(i10);
            List<f<N>> list = this.f58416b;
            if (list != null) {
                list.add(new f.b(n10));
            }
        }
        if (objPut == null) {
            return null;
        }
        return (V) objPut;
    }
}
