package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t<T> implements m<T>, e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final m<T> f128492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f128493b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f128494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final Iterator<T> f128495c;

        a(t<T> tVar) {
            this.f128494b = ((t) tVar).f128493b;
            this.f128495c = ((t) tVar).f128492a.iterator();
        }

        @dl.d
        public final Iterator<T> a() {
            return this.f128495c;
        }

        public final int b() {
            return this.f128494b;
        }

        public final void c(int i10) {
            this.f128494b = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f128494b > 0 && this.f128495c.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i10 = this.f128494b;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            this.f128494b = i10 - 1;
            return this.f128495c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(@dl.d m<? extends T> sequence, int i10) {
        f0.p(sequence, "sequence");
        this.f128492a = sequence;
        this.f128493b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + lg.a.f131414g).toString());
    }

    @Override // kotlin.sequences.e
    @dl.d
    public m<T> a(int i10) {
        int i11 = this.f128493b;
        return i10 >= i11 ? SequencesKt__SequencesKt.g() : new s(this.f128492a, i10, i11);
    }

    @Override // kotlin.sequences.e
    @dl.d
    public m<T> b(int i10) {
        return i10 >= this.f128493b ? this : new t(this.f128492a, i10);
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
