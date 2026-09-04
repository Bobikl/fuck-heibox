package androidx.p001datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: Internal.java */
/* JADX INFO: loaded from: classes6.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f22456a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f22457b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f22458c = 4096;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f22459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f22460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w f22461f;

    /* JADX INFO: compiled from: Internal.java */
    public interface a extends k<Boolean> {
        void M(boolean z10);

        @Override // androidx.datastore.preferences.protobuf.i1.k, androidx.datastore.preferences.protobuf.i1.g
        k<Boolean> d(int i10);

        boolean getBoolean(int i10);

        boolean setBoolean(int i10, boolean z10);
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface b extends k<Double> {
        @Override // androidx.datastore.preferences.protobuf.i1.k, androidx.datastore.preferences.protobuf.i1.g
        k<Double> d(int i10);

        double getDouble(int i10);

        void p0(double d10);

        double setDouble(int i10, double d10);
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface c {
        int getNumber();
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface d<T extends c> {
        T a(int i10);
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface e {
        boolean a(int i10);
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface f extends k<Float> {
        @Override // androidx.datastore.preferences.protobuf.i1.k, androidx.datastore.preferences.protobuf.i1.g
        k<Float> d(int i10);

        float getFloat(int i10);

        float setFloat(int i10, float f10);

        void x0(float f10);
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface g extends k<Integer> {
        @Override // 
        k<Integer> d(int i10);

        int getInt(int i10);

        int setInt(int i10, int i11);

        void t1(int i10);
    }

    /* JADX INFO: compiled from: Internal.java */
    public static class h<F, T> extends AbstractList<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<F> f22462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a<F, T> f22463c;

        /* JADX INFO: compiled from: Internal.java */
        public interface a<F, T> {
            T convert(F f10);
        }

        public h(List<F> list, a<F, T> aVar) {
            this.f22462b = list;
            this.f22463c = aVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return (T) this.f22463c.convert(this.f22462b.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f22462b.size();
        }
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface i extends k<Long> {
        @Override // androidx.datastore.preferences.protobuf.i1.k, androidx.datastore.preferences.protobuf.i1.g
        k<Long> d(int i10);

        long getLong(int i10);

        void j0(long j10);

        long setLong(int i10, long j10);
    }

    /* JADX INFO: compiled from: Internal.java */
    public static class j<K, V, RealValue> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<K, RealValue> f22464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b<RealValue, V> f22465c;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: compiled from: Internal.java */
        public static final class a<T> implements b<Integer, T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f22466a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f22467b;

            a(d dVar, c cVar) {
                this.f22466a = dVar;
                this.f22467b = cVar;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
            @Override // androidx.datastore.preferences.protobuf.i1.j.b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Integer b(c cVar) {
                return Integer.valueOf(cVar.getNumber());
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
            @Override // androidx.datastore.preferences.protobuf.i1.j.b
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public c a(Integer num) {
                c cVarA = this.f22466a.a(num.intValue());
                return cVarA == null ? this.f22467b : cVarA;
            }
        }

        /* JADX INFO: compiled from: Internal.java */
        public interface b<A, B> {
            B a(A a10);

            A b(B b10);
        }

        /* JADX INFO: compiled from: Internal.java */
        public class c implements Map.Entry<K, V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Map.Entry<K, RealValue> f22468b;

            public c(Map.Entry<K, RealValue> entry) {
                this.f22468b = entry;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Map.Entry) {
                    return getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
                }
                return false;
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.f22468b.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) j.this.f22465c.a(this.f22468b.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.f22468b.hashCode();
            }

            @Override // java.util.Map.Entry
            public V setValue(V v10) {
                RealValue value = this.f22468b.setValue((RealValue) j.this.f22465c.b(v10));
                if (value == null) {
                    return null;
                }
                return (V) j.this.f22465c.a(value);
            }
        }

        /* JADX INFO: compiled from: Internal.java */
        public class d implements Iterator<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Iterator<Map.Entry<K, RealValue>> f22470b;

            public d(Iterator<Map.Entry<K, RealValue>> it) {
                this.f22470b = it;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return new c(this.f22470b.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f22470b.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f22470b.remove();
            }
        }

        /* JADX INFO: compiled from: Internal.java */
        public class e extends AbstractSet<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Set<Map.Entry<K, RealValue>> f22472b;

            public e(Set<Map.Entry<K, RealValue>> set) {
                this.f22472b = set;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new d(this.f22472b.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f22472b.size();
            }
        }

        public j(Map<K, RealValue> map, b<RealValue, V> bVar) {
            this.f22464b = map;
            this.f22465c = bVar;
        }

        public static <T extends c> b<Integer, T> b(d<T> dVar, T t10) {
            return new a(dVar, t10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new e(this.f22464b.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            RealValue realvalue = this.f22464b.get(obj);
            if (realvalue == null) {
                return null;
            }
            return this.f22465c.a(realvalue);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k10, V v10) {
            RealValue realvaluePut = this.f22464b.put(k10, this.f22465c.b(v10));
            if (realvaluePut == null) {
                return null;
            }
            return this.f22465c.a(realvaluePut);
        }
    }

    /* JADX INFO: compiled from: Internal.java */
    public interface k<E> extends List<E>, RandomAccess {
        k<E> d(int i10);

        boolean l1();

        void z0();
    }

    static {
        byte[] bArr = new byte[0];
        f22459d = bArr;
        f22460e = ByteBuffer.wrap(bArr);
        f22461f = w.p(bArr);
    }

    private i1() {
    }

    public static byte[] a(String str) {
        return str.getBytes(f22457b);
    }

    public static ByteBuffer b(String str) {
        return ByteBuffer.wrap(a(str));
    }

    public static ByteString c(String str) {
        return ByteString.u(str.getBytes(f22457b));
    }

    static <T> T d(T t10) {
        t10.getClass();
        return t10;
    }

    static <T> T e(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static ByteBuffer f(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferDuplicate.capacity());
        byteBufferAllocate.put(byteBufferDuplicate);
        byteBufferAllocate.clear();
        return byteBufferAllocate;
    }

    public static boolean g(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        return byteBuffer.duplicate().clear().equals(byteBuffer2.duplicate().clear());
    }

    public static boolean i(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!h(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static <T extends z1> T j(Class<T> cls) {
        try {
            Method method = cls.getMethod("getDefaultInstance", new Class[0]);
            return (T) method.invoke(method, new Object[0]);
        } catch (Exception e10) {
            throw new RuntimeException("Failed to get default instance for " + cls, e10);
        }
    }

    public static int k(boolean z10) {
        if (z10) {
            return 1231;
        }
        return bb.c.b.Pk;
    }

    public static int l(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int iM = 1;
        while (it.hasNext()) {
            iM = (iM * 31) + m(it.next());
        }
        return iM;
    }

    public static int m(byte[] bArr) {
        return n(bArr, 0, bArr.length);
    }

    static int n(byte[] bArr, int i10, int i11) {
        int iW = w(i11, bArr, i10, i11);
        if (iW == 0) {
            return 1;
        }
        return iW;
    }

    public static int o(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int iW = w(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (iW == 0) {
                return 1;
            }
            return iW;
        }
        int iCapacity = byteBuffer.capacity() <= 4096 ? byteBuffer.capacity() : 4096;
        byte[] bArr = new byte[iCapacity];
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        int iCapacity2 = byteBuffer.capacity();
        while (byteBufferDuplicate.remaining() > 0) {
            int iRemaining = byteBufferDuplicate.remaining() <= iCapacity ? byteBufferDuplicate.remaining() : iCapacity;
            byteBufferDuplicate.get(bArr, 0, iRemaining);
            iCapacity2 = w(iCapacity2, bArr, 0, iRemaining);
        }
        if (iCapacity2 == 0) {
            return 1;
        }
        return iCapacity2;
    }

    public static int p(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        int iO = 1;
        while (it.hasNext()) {
            iO = (iO * 31) + o(it.next());
        }
        return iO;
    }

    public static int q(c cVar) {
        return cVar.getNumber();
    }

    public static int r(List<? extends c> list) {
        Iterator<? extends c> it = list.iterator();
        int iQ = 1;
        while (it.hasNext()) {
            iQ = (iQ * 31) + q(it.next());
        }
        return iQ;
    }

    public static int s(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean t(ByteString byteString) {
        return byteString.H();
    }

    public static boolean u(byte[] bArr) {
        return Utf8.t(bArr);
    }

    static Object v(Object obj, Object obj2) {
        return ((z1) obj).t().A((z1) obj2).a1();
    }

    static int w(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String x(String str) {
        return new String(str.getBytes(f22457b), f22456a);
    }

    public static byte[] y(String str) {
        return str.getBytes(f22456a);
    }

    public static String z(byte[] bArr) {
        return new String(bArr, f22456a);
    }
}
