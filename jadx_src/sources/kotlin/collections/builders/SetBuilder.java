package kotlin.collections.builders;

import dl.d;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.f;
import kotlin.jvm.internal.f0;
import zh.h;

/* JADX INFO: compiled from: SetBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SetBuilder<E> extends f<E> implements Set<E>, Serializable, h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final MapBuilder<E, ?> f124612b;

    public SetBuilder() {
        this(new MapBuilder());
    }

    public SetBuilder(int i10) {
        this(new MapBuilder(i10));
    }

    public SetBuilder(@d MapBuilder<E, ?> backing) {
        f0.p(backing, "backing");
        this.f124612b = backing;
    }

    private final Object e() throws NotSerializableException {
        if (this.f124612b.H()) {
            return new SerializedCollection(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // kotlin.collections.f
    /* JADX INFO: renamed from: a */
    public int getSize() {
        return this.f124612b.size();
    }

    @Override // kotlin.collections.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        return this.f124612b.h(e10) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@d Collection<? extends E> elements) {
        f0.p(elements, "elements");
        this.f124612b.l();
        return super.addAll(elements);
    }

    @d
    public final Set<E> b() {
        this.f124612b.j();
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f124612b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f124612b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f124612b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @d
    public Iterator<E> iterator() {
        return this.f124612b.I();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f124612b.P(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        this.f124612b.l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        this.f124612b.l();
        return super.retainAll(elements);
    }
}
