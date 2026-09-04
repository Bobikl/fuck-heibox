package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: CollectionFuture.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b(emulated = true)
public abstract class t<V, C> extends AggregateFuture<V, C> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @CheckForNull
    private List<b<V>> f59547r;

    /* JADX INFO: compiled from: CollectionFuture.java */
    public static final class a<V> extends t<V, List<V>> {
        a(ImmutableCollection<? extends p0<? extends V>> immutableCollection, boolean z10) {
            super(immutableCollection, z10);
            U();
        }

        @Override // com.google.common.util.concurrent.t
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public List<V> b0(List<b<V>> list) {
            ArrayList arrayListU = Lists.u(list.size());
            Iterator<b<V>> it = list.iterator();
            while (it.hasNext()) {
                b<V> next = it.next();
                arrayListU.add(next != null ? next.f59548a : null);
            }
            return Collections.unmodifiableList(arrayListU);
        }
    }

    /* JADX INFO: compiled from: CollectionFuture.java */
    public static final class b<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        V f59548a;

        b(V v10) {
            this.f59548a = v10;
        }
    }

    t(ImmutableCollection<? extends p0<? extends V>> immutableCollection, boolean z10) {
        super(immutableCollection, z10, true);
        List<b<V>> listEmptyList = immutableCollection.isEmpty() ? Collections.emptyList() : Lists.u(immutableCollection.size());
        for (int i10 = 0; i10 < immutableCollection.size(); i10++) {
            listEmptyList.add(null);
        }
        this.f59547r = listEmptyList;
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    final void P(int i10, @b1 V v10) {
        List<b<V>> list = this.f59547r;
        if (list != null) {
            list.set(i10, new b<>(v10));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    final void S() {
        List<b<V>> list = this.f59547r;
        if (list != null) {
            B(b0(list));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void a0(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.a0(releaseResourcesReason);
        this.f59547r = null;
    }

    abstract C b0(List<b<V>> list);
}
