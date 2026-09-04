package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.b3;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: MultiEdgesConnecting.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public abstract class n0<E> extends AbstractSet<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<E, ?> f58409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f58410c;

    /* JADX INFO: compiled from: MultiEdgesConnecting.java */
    public class a extends AbstractIterator<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Iterator f58411d;

        a(Iterator it) {
            this.f58411d = it;
        }

        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        protected E a() {
            while (this.f58411d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f58411d.next();
                if (n0.this.f58410c.equals(entry.getValue())) {
                    return (E) entry.getKey();
                }
            }
            return b();
        }
    }

    n0(Map<E, ?> map, Object obj) {
        this.f58409b = (Map) com.google.common.base.w.E(map);
        this.f58410c = com.google.common.base.w.E(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b3<E> iterator() {
        return new a(this.f58409b.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.f58410c.equals(this.f58409b.get(obj));
    }
}
