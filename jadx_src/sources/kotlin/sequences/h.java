package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h<T> implements m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final m<T> f128448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f128449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.l<T, Boolean> f128450c;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Iterator<T> f128451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f128452c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.e
        private T f128453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h<T> f128454e;

        a(h<T> hVar) {
            this.f128454e = hVar;
            this.f128451b = ((h) hVar).f128448a.iterator();
        }

        private final void a() {
            while (this.f128451b.hasNext()) {
                T next = this.f128451b.next();
                if (((Boolean) ((h) this.f128454e).f128450c.invoke(next)).booleanValue() == ((h) this.f128454e).f128449b) {
                    this.f128453d = next;
                    this.f128452c = 1;
                    return;
                }
            }
            this.f128452c = 0;
        }

        @dl.d
        public final Iterator<T> b() {
            return this.f128451b;
        }

        @dl.e
        public final T c() {
            return this.f128453d;
        }

        public final int d() {
            return this.f128452c;
        }

        public final void e(@dl.e T t10) {
            this.f128453d = t10;
        }

        public final void g(int i10) {
            this.f128452c = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f128452c == -1) {
                a();
            }
            return this.f128452c == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f128452c == -1) {
                a();
            }
            if (this.f128452c == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f128453d;
            this.f128453d = null;
            this.f128452c = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@dl.d m<? extends T> sequence, boolean z10, @dl.d yh.l<? super T, Boolean> predicate) {
        f0.p(sequence, "sequence");
        f0.p(predicate, "predicate");
        this.f128448a = sequence;
        this.f128449b = z10;
        this.f128450c = predicate;
    }

    public /* synthetic */ h(m mVar, boolean z10, yh.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this(mVar, (i10 & 2) != 0 ? true : z10, lVar);
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
