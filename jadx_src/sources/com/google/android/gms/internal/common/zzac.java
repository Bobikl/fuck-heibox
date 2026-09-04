package com.google.android.gms.internal.common;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@s9.f("Use ImmutableList.of or another implementation")
@NullMarked
public abstract class zzac extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object[] f52733b = new Object[0];

    zzac() {
    }

    @s9.a
    int a(Object[] objArr, int i10) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    int b() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    int e() {
        throw null;
    }

    public zzag g() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public abstract g iterator();

    abstract boolean i();

    @CheckForNull
    Object[] j() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f52733b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @s9.a
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] objArrJ = j();
            if (objArrJ != null) {
                return Arrays.copyOfRange(objArrJ, e(), b(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        a(objArr, 0);
        return objArr;
    }
}
