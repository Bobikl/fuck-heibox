package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.h0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k<T> implements m<h0<? extends T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final m<T> f128466a;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<h0<? extends T>>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Iterator<T> f128467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f128468c;

        a(k<T> kVar) {
            this.f128467b = ((k) kVar).f128466a.iterator();
        }

        public final int a() {
            return this.f128468c;
        }

        @dl.d
        public final Iterator<T> b() {
            return this.f128467b;
        }

        @Override // java.util.Iterator
        @dl.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public h0<T> next() {
            int i10 = this.f128468c;
            this.f128468c = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            return new h0<>(i10, this.f128467b.next());
        }

        public final void d(int i10) {
            this.f128468c = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f128467b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@dl.d m<? extends T> sequence) {
        f0.p(sequence, "sequence");
        this.f128466a = sequence;
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<h0<T>> iterator() {
        return new a(this);
    }
}
