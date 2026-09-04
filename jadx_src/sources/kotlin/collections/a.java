package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: AbstractIterator.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a<T> implements Iterator<T>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private State f124557b = State.NotReady;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private T f124558c;

    /* JADX INFO: renamed from: kotlin.collections.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractIterator.kt */
    public final /* synthetic */ class C1124a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f124559a;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f124559a = iArr;
        }
    }

    private final boolean d() {
        this.f124557b = State.Failed;
        a();
        return this.f124557b == State.Ready;
    }

    protected abstract void a();

    protected final void b() {
        this.f124557b = State.Done;
    }

    protected final void c(T t10) {
        this.f124558c = t10;
        this.f124557b = State.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        State state = this.f124557b;
        if (!(state != State.Failed)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i10 = C1124a.f124559a[state.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return d();
        }
        return true;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f124557b = State.NotReady;
        return this.f124558c;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
