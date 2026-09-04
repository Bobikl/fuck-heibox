package kotlin.collections;

import com.meituan.robust.Constants;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: AbstractCollection.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.u0(version = "1.1")
public abstract class AbstractCollection<E> implements Collection<E>, zh.a {
    protected AbstractCollection() {
    }

    @Override // java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(E e10) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.f0.g(it.next(), e10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: getSize */
    public abstract int getF140741e();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    @dl.d
    public abstract Iterator<E> iterator();

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getF140741e();
    }

    @Override // java.util.Collection
    @dl.d
    public Object[] toArray() {
        return kotlin.jvm.internal.t.a(this);
    }

    @Override // java.util.Collection
    @dl.d
    public <T> T[] toArray(@dl.d T[] array) {
        kotlin.jvm.internal.f0.p(array, "array");
        return (T[]) kotlin.jvm.internal.t.b(this, array);
    }

    @dl.d
    public String toString() {
        return CollectionsKt___CollectionsKt.h3(this, ", ", Constants.ARRAY_TYPE, "]", 0, null, new yh.l<E, CharSequence>(this) { // from class: kotlin.collections.AbstractCollection.toString.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractCollection<E> f124494b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.f124494b = this;
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(E e10) {
                return e10 == this.f124494b ? "(this Collection)" : String.valueOf(e10);
            }
        }, 24, null);
    }
}
