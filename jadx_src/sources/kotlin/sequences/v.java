package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class v<T, R> implements m<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final m<T> f128502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.p<Integer, T, R> f128503b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Iterator<T> f128504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f128505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v<T, R> f128506d;

        a(v<T, R> vVar) {
            this.f128506d = vVar;
            this.f128504b = ((v) vVar).f128502a.iterator();
        }

        public final int a() {
            return this.f128505c;
        }

        @dl.d
        public final Iterator<T> b() {
            return this.f128504b;
        }

        public final void c(int i10) {
            this.f128505c = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f128504b.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            yh.p pVar = ((v) this.f128506d).f128503b;
            int i10 = this.f128505c;
            this.f128505c = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            return (R) pVar.invoke(Integer.valueOf(i10), this.f128504b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(@dl.d m<? extends T> sequence, @dl.d yh.p<? super Integer, ? super T, ? extends R> transformer) {
        f0.p(sequence, "sequence");
        f0.p(transformer, "transformer");
        this.f128502a = sequence;
        this.f128503b = transformer;
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<R> iterator() {
        return new a(this);
    }
}
