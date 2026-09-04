package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l<T1, T2, V> implements m<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final m<T1> f128469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final m<T2> f128470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.p<T1, T2, V> f128471c;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<V>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Iterator<T1> f128472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final Iterator<T2> f128473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<T1, T2, V> f128474d;

        a(l<T1, T2, V> lVar) {
            this.f128474d = lVar;
            this.f128472b = ((l) lVar).f128469a.iterator();
            this.f128473c = ((l) lVar).f128470b.iterator();
        }

        @dl.d
        public final Iterator<T1> a() {
            return this.f128472b;
        }

        @dl.d
        public final Iterator<T2> b() {
            return this.f128473c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f128472b.hasNext() && this.f128473c.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) ((l) this.f128474d).f128471c.invoke(this.f128472b.next(), this.f128473c.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@dl.d m<? extends T1> sequence1, @dl.d m<? extends T2> sequence2, @dl.d yh.p<? super T1, ? super T2, ? extends V> transform) {
        f0.p(sequence1, "sequence1");
        f0.p(sequence2, "sequence2");
        f0.p(transform, "transform");
        this.f128469a = sequence1;
        this.f128470b = sequence2;
        this.f128471c = transform;
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<V> iterator() {
        return new a(this);
    }
}
