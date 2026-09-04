package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j<T> implements m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.a<T> f128461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<T, T> f128462b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private T f128463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f128464c = -2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j<T> f128465d;

        a(j<T> jVar) {
            this.f128465d = jVar;
        }

        private final void a() {
            T t10;
            if (this.f128464c == -2) {
                t10 = (T) ((j) this.f128465d).f128461a.invoke();
            } else {
                yh.l lVar = ((j) this.f128465d).f128462b;
                T t11 = this.f128463b;
                f0.m(t11);
                t10 = (T) lVar.invoke(t11);
            }
            this.f128463b = t10;
            this.f128464c = t10 == null ? 0 : 1;
        }

        @dl.e
        public final T b() {
            return this.f128463b;
        }

        public final int c() {
            return this.f128464c;
        }

        public final void d(@dl.e T t10) {
            this.f128463b = t10;
        }

        public final void e(int i10) {
            this.f128464c = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f128464c < 0) {
                a();
            }
            return this.f128464c == 1;
        }

        @Override // java.util.Iterator
        @dl.d
        public T next() {
            if (this.f128464c < 0) {
                a();
            }
            if (this.f128464c == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f128463b;
            f0.n(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f128464c = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@dl.d yh.a<? extends T> getInitialValue, @dl.d yh.l<? super T, ? extends T> getNextValue) {
        f0.p(getInitialValue, "getInitialValue");
        f0.p(getNextValue, "getNextValue");
        this.f128461a = getInitialValue;
        this.f128462b = getNextValue;
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
