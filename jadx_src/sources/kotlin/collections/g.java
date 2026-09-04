package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: AbstractSet.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.u0(version = "1.1")
public abstract class g<E> extends AbstractCollection<E> implements Set<E>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f124613b = new a(null);

    /* JADX INFO: compiled from: AbstractSet.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final boolean a(@dl.d Set<?> c10, @dl.d Set<?> other) {
            kotlin.jvm.internal.f0.p(c10, "c");
            kotlin.jvm.internal.f0.p(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            return c10.containsAll(other);
        }

        public final int b(@dl.d Collection<?> c10) {
            kotlin.jvm.internal.f0.p(c10, "c");
            Iterator<?> it = c10.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode += next != null ? next.hashCode() : 0;
            }
            return iHashCode;
        }
    }

    protected g() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@dl.e Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f124613b.a(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f124613b.b(this);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
