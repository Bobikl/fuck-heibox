package androidx.collection;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MutableScatterSet$MutableSetWrapper$iterator$1<E> implements Iterator<E>, zh.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3469b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Iterator<E> f3470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ MutableScatterSet<E> f3471d;

    MutableScatterSet$MutableSetWrapper$iterator$1(MutableScatterSet<E> mutableScatterSet) {
        this.f3471d = mutableScatterSet;
        this.f3470c = kotlin.sequences.q.a(new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(mutableScatterSet, this, null));
    }

    public final int a() {
        return this.f3469b;
    }

    @dl.d
    public final Iterator<E> b() {
        return this.f3470c;
    }

    public final void c(int i10) {
        this.f3469b = i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3470c.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        return this.f3470c.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i10 = this.f3469b;
        if (i10 != -1) {
            this.f3471d.j0(i10);
            this.f3469b = -1;
        }
    }
}
