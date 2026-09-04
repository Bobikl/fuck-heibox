package androidx.p001datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: LazyStringArrayList.java */
/* JADX INFO: loaded from: classes6.dex */
public class m1 extends c<String> implements n1, RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final m1 f22524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n1 f22525f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Object> f22526d;

    /* JADX INFO: compiled from: LazyStringArrayList.java */
    public static class a extends AbstractList<byte[]> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m1 f22527b;

        a(m1 m1Var) {
            this.f22527b = m1Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(int i10, byte[] bArr) {
            this.f22527b.o(i10, bArr);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public byte[] get(int i10) {
            return this.f22527b.C(i10);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public byte[] remove(int i10) {
            String strRemove = this.f22527b.remove(i10);
            ((AbstractList) this).modCount++;
            return m1.q(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public byte[] set(int i10, byte[] bArr) {
            Object objB = this.f22527b.B(i10, bArr);
            ((AbstractList) this).modCount++;
            return m1.q(objB);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f22527b.size();
        }
    }

    /* JADX INFO: compiled from: LazyStringArrayList.java */
    public static class b extends AbstractList<ByteString> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m1 f22528b;

        b(m1 m1Var) {
            this.f22528b = m1Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(int i10, ByteString byteString) {
            this.f22528b.l(i10, byteString);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ByteString get(int i10) {
            return this.f22528b.r(i10);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ByteString remove(int i10) {
            String strRemove = this.f22528b.remove(i10);
            ((AbstractList) this).modCount++;
            return m1.s(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public ByteString set(int i10, ByteString byteString) {
            Object objA = this.f22528b.A(i10, byteString);
            ((AbstractList) this).modCount++;
            return m1.s(objA);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f22528b.size();
        }
    }

    static {
        m1 m1Var = new m1();
        f22524e = m1Var;
        m1Var.z0();
        f22525f = m1Var;
    }

    public m1() {
        this(10);
    }

    public m1(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public m1(n1 n1Var) {
        this.f22526d = new ArrayList(n1Var.size());
        addAll(n1Var);
    }

    private m1(ArrayList<Object> arrayList) {
        this.f22526d = arrayList;
    }

    public m1(List<String> list) {
        this((ArrayList<Object>) new ArrayList(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object A(int i10, ByteString byteString) {
        a();
        return this.f22526d.set(i10, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object B(int i10, byte[] bArr) {
        a();
        return this.f22526d.set(i10, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i10, ByteString byteString) {
        a();
        this.f22526d.add(i10, byteString);
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(int i10, byte[] bArr) {
        a();
        this.f22526d.add(i10, bArr);
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] q(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return obj instanceof String ? i1.y((String) obj) : ((ByteString) obj).d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteString s(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        return obj instanceof String ? ByteString.w((String) obj) : ByteString.u((byte[]) obj);
    }

    private static String t(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof ByteString ? ((ByteString) obj).n0() : i1.z((byte[]) obj);
    }

    static m1 u() {
        return f22524e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p001datastore.preferences.protobuf.n1
    public byte[] C(int i10) {
        Object obj = this.f22526d.get(i10);
        byte[] bArrQ = q(obj);
        if (bArrQ != obj) {
            this.f22526d.set(i10, bArrQ);
        }
        return bArrQ;
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public boolean K(Collection<byte[]> collection) {
        a();
        boolean zAddAll = this.f22526d.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public void M0(int i10, ByteString byteString) {
        A(i10, byteString);
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public List<byte[]> P() {
        return new a(this);
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public Object T1(int i10) {
        return this.f22526d.get(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public void Y0(n1 n1Var) {
        a();
        for (Object obj : n1Var.p()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.f22526d.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.f22526d.add(obj);
            }
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        a();
        if (collection instanceof n1) {
            collection = ((n1) collection).p();
        }
        boolean zAddAll = this.f22526d.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        this.f22526d.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.p001datastore.preferences.protobuf.u2
    public List<ByteString> d1() {
        return new b(this);
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public void f0(ByteString byteString) {
        a();
        this.f22526d.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, androidx.datastore.preferences.protobuf.i1.k
    public /* bridge */ /* synthetic */ boolean l1() {
        return super.l1();
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        a();
        this.f22526d.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public n1 n() {
        return l1() ? new y3(this) : this;
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public boolean o0(Collection<? extends ByteString> collection) {
        a();
        boolean zAddAll = this.f22526d.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public List<?> p() {
        return Collections.unmodifiableList(this.f22526d);
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public ByteString r(int i10) {
        Object obj = this.f22526d.get(i10);
        ByteString byteStringS = s(obj);
        if (byteStringS != obj) {
            this.f22526d.set(i10, byteStringS);
        }
        return byteStringS;
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22526d.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f22526d.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String strN0 = byteString.n0();
            if (byteString.H()) {
                this.f22526d.set(i10, strN0);
            }
            return strN0;
        }
        byte[] bArr = (byte[]) obj;
        String strZ = i1.z(bArr);
        if (i1.u(bArr)) {
            this.f22526d.set(i10, strZ);
        }
        return strZ;
    }

    @Override // androidx.datastore.preferences.protobuf.i1.k, androidx.datastore.preferences.protobuf.i1.g
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public m1 d2(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f22526d);
        return new m1((ArrayList<Object>) arrayList);
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        a();
        Object objRemove = this.f22526d.remove(i10);
        ((AbstractList) this).modCount++;
        return t(objRemove);
    }

    @Override // androidx.p001datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        a();
        return t(this.f22526d.set(i10, str));
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public void y1(int i10, byte[] bArr) {
        B(i10, bArr);
    }

    @Override // androidx.p001datastore.preferences.protobuf.n1
    public void z(byte[] bArr) {
        a();
        this.f22526d.add(bArr);
        ((AbstractList) this).modCount++;
    }
}
