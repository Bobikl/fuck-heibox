package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w<T, R> implements m<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final m<T> f128507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<T, R> f128508b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Iterator<T> f128509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w<T, R> f128510c;

        a(w<T, R> wVar) {
            this.f128510c = wVar;
            this.f128509b = ((w) wVar).f128507a.iterator();
        }

        @dl.d
        public final Iterator<T> a() {
            return this.f128509b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f128509b.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((w) this.f128510c).f128508b.invoke(this.f128509b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(@dl.d m<? extends T> sequence, @dl.d yh.l<? super T, ? extends R> transformer) {
        f0.p(sequence, "sequence");
        f0.p(transformer, "transformer");
        this.f128507a = sequence;
        this.f128508b = transformer;
    }

    @dl.d
    public final <E> m<E> e(@dl.d yh.l<? super R, ? extends Iterator<? extends E>> iterator) {
        f0.p(iterator, "iterator");
        return new i(this.f128507a, this.f128508b, iterator);
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<R> iterator() {
        return new a(this);
    }
}
