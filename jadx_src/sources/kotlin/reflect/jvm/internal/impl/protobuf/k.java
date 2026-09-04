package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: LazyStringArrayList.java */
/* JADX INFO: loaded from: classes5.dex */
public class k extends AbstractList<String> implements RandomAccess, l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f127362c = new k().n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Object> f127363b;

    public k() {
        this.f127363b = new ArrayList();
    }

    public k(l lVar) {
        this.f127363b = new ArrayList(lVar.size());
        addAll(lVar);
    }

    private static d b(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        return obj instanceof String ? d.i((String) obj) : d.g((byte[]) obj);
    }

    private static String e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof d ? ((d) obj).B() : h.b((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        this.f127363b.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        if (collection instanceof l) {
            collection = ((l) collection).p();
        }
        boolean zAddAll = this.f127363b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f127363b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f127363b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String strB = dVar.B();
            if (dVar.q()) {
                this.f127363b.set(i10, strB);
            }
            return strB;
        }
        byte[] bArr = (byte[]) obj;
        String strB2 = h.b(bArr);
        if (h.a(bArr)) {
            this.f127363b.set(i10, strB2);
        }
        return strB2;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        Object objRemove = this.f127363b.remove(i10);
        ((AbstractList) this).modCount++;
        return e(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        return e(this.f127363b.set(i10, str));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public void i1(d dVar) {
        this.f127363b.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public l n() {
        return new t(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public List<?> p() {
        return Collections.unmodifiableList(this.f127363b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public d r(int i10) {
        Object obj = this.f127363b.get(i10);
        d dVarB = b(obj);
        if (dVarB != obj) {
            this.f127363b.set(i10, dVarB);
        }
        return dVarB;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f127363b.size();
    }
}
