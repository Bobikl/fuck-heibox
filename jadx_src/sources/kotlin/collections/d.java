package kotlin.collections;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: compiled from: AbstractMutableList.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.u0(version = "1.1")
public abstract class d<E> extends AbstractList<E> implements List<E>, zh.e {
    protected d() {
    }

    public abstract int a();

    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i10, E e10);

    public abstract E b(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return b(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i10, E e10);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
