package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class u<T> implements m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final m<T> f128496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<T, Boolean> f128497b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Iterator<T> f128498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f128499c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private T f128500d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ u<T> f128501e;

        a(u<T> uVar) {
            this.f128501e = uVar;
            this.f128498b = ((u) uVar).f128496a.iterator();
        }

        private final void a() {
            if (this.f128498b.hasNext()) {
                T next = this.f128498b.next();
                if (((Boolean) ((u) this.f128501e).f128497b.invoke(next)).booleanValue()) {
                    this.f128499c = 1;
                    this.f128500d = next;
                    return;
                }
            }
            this.f128499c = 0;
        }

        @dl.d
        public final Iterator<T> b() {
            return this.f128498b;
        }

        @dl.e
        public final T c() {
            return this.f128500d;
        }

        public final int d() {
            return this.f128499c;
        }

        public final void e(@dl.e T t10) {
            this.f128500d = t10;
        }

        public final void g(int i10) {
            this.f128499c = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f128499c == -1) {
                a();
            }
            return this.f128499c == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f128499c == -1) {
                a();
            }
            if (this.f128499c == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f128500d;
            this.f128500d = null;
            this.f128499c = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(@dl.d m<? extends T> sequence, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(sequence, "sequence");
        f0.p(predicate, "predicate");
        this.f128496a = sequence;
        this.f128497b = predicate;
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
