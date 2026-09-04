package com.google.android.gms.internal.common;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@NullMarked
public abstract class zzag extends zzac implements List, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f52737c = new e(zzai.f52738f, 0);

    zzag() {
    }

    static zzag m(Object[] objArr, int i10) {
        return i10 == 0 ? zzai.f52738f : new zzai(objArr, i10);
    }

    public static zzag o(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return q((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return zzai.f52738f;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return t(next);
        }
        d dVar = new d(4);
        dVar.c(next);
        dVar.d(it);
        dVar.f52709c = true;
        return m(dVar.f52707a, dVar.f52708b);
    }

    public static zzag q(Collection collection) {
        if (!(collection instanceof zzac)) {
            Object[] array = collection.toArray();
            int length = array.length;
            f.a(array, length);
            return m(array, length);
        }
        zzag zzagVarG = ((zzac) collection).g();
        if (!zzagVarG.i()) {
            return zzagVarG;
        }
        Object[] array2 = zzagVarG.toArray();
        return m(array2, array2.length);
    }

    public static zzag s() {
        return zzai.f52738f;
    }

    public static zzag t(Object obj) {
        Object[] objArr = {obj};
        f.a(objArr, 1);
        return m(objArr, 1);
    }

    public static zzag u(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        f.a(objArr, 2);
        return m(objArr, 2);
    }

    @Override // com.google.android.gms.internal.common.zzac
    int a(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override // java.util.List
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (y.a(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && y.a(it.next(), it2.next())) {
                    }
                }
                if (!it2.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzac
    @Deprecated
    @s9.l(replacement = "this")
    public final zzag g() {
        return this;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: h */
    public final g iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public zzag subList(int i10, int i11) {
        z.c(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? zzai.f52738f : new zzaf(this, i10, i12);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final h listIterator(int i10) {
        z.b(i10, size(), UCropPlusActivity.ARG_INDEX);
        return isEmpty() ? f52737c : new e(this, i10);
    }
}
