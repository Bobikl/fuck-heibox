package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final h f128237b = new h();

    /* JADX INFO: compiled from: ArrayMap.kt */
    public static final class a implements Iterator, zh.a {
        a() {
        }

        @Override // java.util.Iterator
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private h() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public int a() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    @dl.e
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Void get(int i10) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(int i10, @dl.d Void value) {
        f0.p(value, "value");
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c, java.lang.Iterable
    @dl.d
    public Iterator iterator() {
        return new a();
    }
}
