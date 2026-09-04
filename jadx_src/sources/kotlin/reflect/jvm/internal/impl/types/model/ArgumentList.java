package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;
import si.k;
import si.l;

/* JADX INFO: compiled from: TypeSystemContext.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ArgumentList extends ArrayList<l> implements k {
    public ArgumentList(int i10) {
        super(i10);
    }

    public /* bridge */ boolean a(l lVar) {
        return super.contains(lVar);
    }

    public /* bridge */ int b() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof l) {
            return a((l) obj);
        }
        return false;
    }

    public /* bridge */ int e(l lVar) {
        return super.indexOf(lVar);
    }

    public /* bridge */ int g(l lVar) {
        return super.lastIndexOf(lVar);
    }

    public /* bridge */ boolean h(l lVar) {
        return super.remove(lVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof l) {
            return e((l) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof l) {
            return g((l) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof l) {
            return h((l) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
