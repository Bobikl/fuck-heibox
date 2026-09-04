package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d<T> implements m<T>, e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final m<T> f128437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f128438b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Iterator<T> f128439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f128440c;

        a(d<T> dVar) {
            this.f128439b = ((d) dVar).f128437a.iterator();
            this.f128440c = ((d) dVar).f128438b;
        }

        private final void a() {
            while (this.f128440c > 0 && this.f128439b.hasNext()) {
                this.f128439b.next();
                this.f128440c--;
            }
        }

        @dl.d
        public final Iterator<T> b() {
            return this.f128439b;
        }

        public final int c() {
            return this.f128440c;
        }

        public final void d(int i10) {
            this.f128440c = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f128439b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.f128439b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@dl.d m<? extends T> sequence, int i10) {
        f0.p(sequence, "sequence");
        this.f128437a = sequence;
        this.f128438b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + lg.a.f131414g).toString());
    }

    @Override // kotlin.sequences.e
    @dl.d
    public m<T> a(int i10) {
        int i11 = this.f128438b + i10;
        return i11 < 0 ? new d(this, i10) : new d(this.f128437a, i11);
    }

    @Override // kotlin.sequences.e
    @dl.d
    public m<T> b(int i10) {
        int i11 = this.f128438b;
        int i12 = i11 + i10;
        return i12 < 0 ? new t(this, i10) : new s(this.f128437a, i11, i12);
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
