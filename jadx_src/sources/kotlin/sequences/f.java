package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f<T> implements m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final m<T> f128441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<T, Boolean> f128442b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Iterator<T> f128443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f128444c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private T f128445d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f<T> f128446e;

        a(f<T> fVar) {
            this.f128446e = fVar;
            this.f128443b = ((f) fVar).f128441a.iterator();
        }

        private final void a() {
            while (this.f128443b.hasNext()) {
                T next = this.f128443b.next();
                if (!((Boolean) ((f) this.f128446e).f128442b.invoke(next)).booleanValue()) {
                    this.f128445d = next;
                    this.f128444c = 1;
                    return;
                }
            }
            this.f128444c = 0;
        }

        public final int b() {
            return this.f128444c;
        }

        @dl.d
        public final Iterator<T> c() {
            return this.f128443b;
        }

        @dl.e
        public final T d() {
            return this.f128445d;
        }

        public final void e(int i10) {
            this.f128444c = i10;
        }

        public final void g(@dl.e T t10) {
            this.f128445d = t10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f128444c == -1) {
                a();
            }
            return this.f128444c == 1 || this.f128443b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f128444c == -1) {
                a();
            }
            if (this.f128444c != 1) {
                return this.f128443b.next();
            }
            T t10 = this.f128445d;
            this.f128445d = null;
            this.f128444c = 0;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@dl.d m<? extends T> sequence, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(sequence, "sequence");
        f0.p(predicate, "predicate");
        this.f128441a = sequence;
        this.f128442b = predicate;
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
