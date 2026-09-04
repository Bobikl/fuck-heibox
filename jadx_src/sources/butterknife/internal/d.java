package butterknife.internal;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: compiled from: ImmutableList.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d<T> extends AbstractList<T> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T[] f35558b;

    d(T[] tArr) {
        this.f35558b = tArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        for (T t10 : this.f35558b) {
            if (t10 == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        return this.f35558b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f35558b.length;
    }
}
