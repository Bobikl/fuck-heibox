package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s<T> implements m<T>, e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final m<T> f128486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f128487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f128488c;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Iterator<T> f128489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f128490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s<T> f128491d;

        a(s<T> sVar) {
            this.f128491d = sVar;
            this.f128489b = ((s) sVar).f128486a.iterator();
        }

        private final void a() {
            while (this.f128490c < ((s) this.f128491d).f128487b && this.f128489b.hasNext()) {
                this.f128489b.next();
                this.f128490c++;
            }
        }

        @dl.d
        public final Iterator<T> b() {
            return this.f128489b;
        }

        public final int c() {
            return this.f128490c;
        }

        public final void d(int i10) {
            this.f128490c = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f128490c < ((s) this.f128491d).f128488c && this.f128489b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (this.f128490c >= ((s) this.f128491d).f128488c) {
                throw new NoSuchElementException();
            }
            this.f128490c++;
            return this.f128489b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(@dl.d m<? extends T> sequence, int i10, int i11) {
        f0.p(sequence, "sequence");
        this.f128486a = sequence;
        this.f128487b = i10;
        this.f128488c = i11;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
        }
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
    }

    private final int f() {
        return this.f128488c - this.f128487b;
    }

    @Override // kotlin.sequences.e
    @dl.d
    public m<T> a(int i10) {
        return i10 >= f() ? SequencesKt__SequencesKt.g() : new s(this.f128486a, this.f128487b + i10, this.f128488c);
    }

    @Override // kotlin.sequences.e
    @dl.d
    public m<T> b(int i10) {
        if (i10 >= f()) {
            return this;
        }
        m<T> mVar = this.f128486a;
        int i11 = this.f128487b;
        return new s(mVar, i11, i10 + i11);
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
