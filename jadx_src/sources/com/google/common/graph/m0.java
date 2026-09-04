package com.google.common.graph;

import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: MapRetrievalCache.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public final class m0<K, V> extends l0<K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private volatile transient a<K, V> f58404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    private volatile transient a<K, V> f58405d;

    /* JADX INFO: compiled from: MapRetrievalCache.java */
    public static final class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f58406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final V f58407b;

        a(K k10, V v10) {
            this.f58406a = k10;
            this.f58407b = v10;
        }
    }

    m0(Map<K, V> map) {
        super(map);
    }

    private void l(a<K, V> aVar) {
        this.f58405d = this.f58404c;
        this.f58404c = aVar;
    }

    private void m(K k10, V v10) {
        l(new a<>(k10, v10));
    }

    @Override // com.google.common.graph.l0
    void d() {
        super.d();
        this.f58404c = null;
        this.f58405d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.l0
    @CheckForNull
    V f(Object obj) {
        com.google.common.base.w.E(obj);
        V vG = g(obj);
        if (vG != null) {
            return vG;
        }
        V vH = h(obj);
        if (vH != null) {
            m(obj, vH);
        }
        return vH;
    }

    @Override // com.google.common.graph.l0
    @CheckForNull
    V g(@CheckForNull Object obj) {
        V v10 = (V) super.g(obj);
        if (v10 != null) {
            return v10;
        }
        a<K, V> aVar = this.f58404c;
        if (aVar != null && aVar.f58406a == obj) {
            return aVar.f58407b;
        }
        a<K, V> aVar2 = this.f58405d;
        if (aVar2 == null || aVar2.f58406a != obj) {
            return null;
        }
        l(aVar2);
        return aVar2.f58407b;
    }
}
