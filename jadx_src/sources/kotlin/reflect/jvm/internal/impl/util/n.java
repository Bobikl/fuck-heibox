package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n<T> extends c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final T f128246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f128247c;

    /* JADX INFO: compiled from: ArrayMap.kt */
    public static final class a implements Iterator<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f128248b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n<T> f128249c;

        a(n<T> nVar) {
            this.f128249c = nVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f128248b;
        }

        @Override // java.util.Iterator
        @dl.d
        public T next() {
            if (!this.f128248b) {
                throw new NoSuchElementException();
            }
            this.f128248b = false;
            return this.f128249c.g();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@dl.d T value, int i10) {
        super(null);
        f0.p(value, "value");
        this.f128246b = value;
        this.f128247c = i10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public int a() {
        return 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public void b(int i10, @dl.d T value) {
        f0.p(value, "value");
        throw new IllegalStateException();
    }

    public final int e() {
        return this.f128247c;
    }

    @dl.d
    public final T g() {
        return this.f128246b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    @dl.e
    public T get(int i10) {
        if (i10 == this.f128247c) {
            return this.f128246b;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c, java.lang.Iterable
    @dl.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
