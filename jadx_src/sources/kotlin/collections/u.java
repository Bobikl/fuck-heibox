package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: compiled from: IteratorsJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class u extends t {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: IteratorsJVM.kt */
    public static final class a<T> implements Iterator<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Enumeration<T> f124640b;

        a(Enumeration<T> enumeration) {
            this.f124640b = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f124640b.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f124640b.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @dl.d
    public static final <T> Iterator<T> c0(@dl.d Enumeration<T> enumeration) {
        kotlin.jvm.internal.f0.p(enumeration, "<this>");
        return new a(enumeration);
    }
}
