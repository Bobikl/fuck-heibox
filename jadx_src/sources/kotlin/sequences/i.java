package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i<T, R, E> implements m<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final m<T> f128455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<T, R> f128456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.l<R, Iterator<E>> f128457c;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<E>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Iterator<T> f128458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private Iterator<? extends E> f128459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i<T, R, E> f128460d;

        a(i<T, R, E> iVar) {
            this.f128460d = iVar;
            this.f128458b = ((i) iVar).f128455a.iterator();
        }

        private final boolean a() {
            Iterator<? extends E> it = this.f128459c;
            if ((it == null || it.hasNext()) ? false : true) {
                this.f128459c = null;
            }
            while (this.f128459c == null) {
                if (!this.f128458b.hasNext()) {
                    return false;
                }
                Iterator<? extends E> it2 = (Iterator) ((i) this.f128460d).f128457c.invoke(((i) this.f128460d).f128456b.invoke(this.f128458b.next()));
                if (it2.hasNext()) {
                    this.f128459c = it2;
                    break;
                }
            }
            return true;
        }

        @dl.e
        public final Iterator<E> b() {
            return this.f128459c;
        }

        @dl.d
        public final Iterator<T> c() {
            return this.f128458b;
        }

        public final void d(@dl.e Iterator<? extends E> it) {
            this.f128459c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return a();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends E> it = this.f128459c;
            f0.m(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@dl.d m<? extends T> sequence, @dl.d yh.l<? super T, ? extends R> transformer, @dl.d yh.l<? super R, ? extends Iterator<? extends E>> iterator) {
        f0.p(sequence, "sequence");
        f0.p(transformer, "transformer");
        f0.p(iterator, "iterator");
        this.f128455a = sequence;
        this.f128456b = transformer;
        this.f128457c = iterator;
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<E> iterator() {
        return new a(this);
    }
}
