package com.google.common.graph;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: UndirectedGraphConnections.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public final class e1<N, V> implements c0<N, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<N, V> f58369a;

    /* JADX INFO: compiled from: UndirectedGraphConnections.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58370a;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            f58370a = iArr;
            try {
                iArr[ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58370a[ElementOrder.Type.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private e1(Map<N, V> map) {
        this.f58369a = (Map) com.google.common.base.w.E(map);
    }

    static <N, V> e1<N, V> l(ElementOrder<N> elementOrder) {
        int i10 = a.f58370a[elementOrder.h().ordinal()];
        if (i10 == 1) {
            return new e1<>(new HashMap(2, 1.0f));
        }
        if (i10 == 2) {
            return new e1<>(new LinkedHashMap(2, 1.0f));
        }
        throw new AssertionError(elementOrder.h());
    }

    static <N, V> e1<N, V> m(Map<N, V> map) {
        return new e1<>(ImmutableMap.g(map));
    }

    @Override // com.google.common.graph.c0
    public Set<N> a() {
        return Collections.unmodifiableSet(this.f58369a.keySet());
    }

    @Override // com.google.common.graph.c0
    public Set<N> b() {
        return a();
    }

    @Override // com.google.common.graph.c0
    public Set<N> c() {
        return a();
    }

    @Override // com.google.common.graph.c0
    public void d(N n10, V v10) {
        i(n10, v10);
    }

    @Override // com.google.common.graph.c0
    @CheckForNull
    public V e(N n10) {
        return this.f58369a.get(n10);
    }

    @Override // com.google.common.graph.c0
    @CheckForNull
    public V f(N n10) {
        return this.f58369a.remove(n10);
    }

    @Override // com.google.common.graph.c0
    public void g(N n10) {
        f(n10);
    }

    @Override // com.google.common.graph.c0
    public Iterator<u<N>> h(final N n10) {
        return Iterators.c0(this.f58369a.keySet().iterator(), new com.google.common.base.n() { // from class: com.google.common.graph.d1
            @Override // com.google.common.base.n
            public final Object apply(Object obj) {
                return u.q(n10, obj);
            }
        });
    }

    @Override // com.google.common.graph.c0
    @CheckForNull
    public V i(N n10, V v10) {
        return this.f58369a.put(n10, v10);
    }
}
