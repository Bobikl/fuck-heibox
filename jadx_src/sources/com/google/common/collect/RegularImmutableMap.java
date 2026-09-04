package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte f57800j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f57801k = 128;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f57802l = 32768;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f57803m = 255;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f57804n = 65535;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final ImmutableMap<Object, Object> f57805o = new RegularImmutableMap(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @CheckForNull
    private final transient Object f57806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @o9.d
    final transient Object[] f57807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient int f57808i;

    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final transient ImmutableMap<K, V> f57809g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final transient Object[] f57810h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final transient int f57811i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final transient int f57812j;

        EntrySet(ImmutableMap<K, V> immutableMap, Object[] objArr, int i10, int i11) {
            this.f57809g = immutableMap;
            this.f57810h = objArr;
            this.f57811i = i10;
            this.f57812j = i11;
        }

        @Override // com.google.common.collect.ImmutableSet
        ImmutableList<Map.Entry<K, V>> A() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // java.util.List
                /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> get(int i10) {
                    com.google.common.base.w.C(i10, EntrySet.this.f57812j);
                    int i11 = i10 * 2;
                    Object obj = EntrySet.this.f57810h[EntrySet.this.f57811i + i11];
                    Objects.requireNonNull(obj);
                    Object obj2 = EntrySet.this.f57810h[i11 + (EntrySet.this.f57811i ^ 1)];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // com.google.common.collect.ImmutableCollection
                public boolean i() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return EntrySet.this.f57812j;
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection
        int b(Object[] objArr, int i10) {
            return a().b(objArr, i10);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f57809g.get(key));
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean i() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
        /* JADX INFO: renamed from: j */
        public b3<Map.Entry<K, V>> iterator() {
            return a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f57812j;
        }
    }

    public static final class KeySet<K> extends ImmutableSet<K> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final transient ImmutableMap<K, ?> f57814g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final transient ImmutableList<K> f57815h;

        KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.f57814g = immutableMap;
            this.f57815h = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public ImmutableList<K> a() {
            return this.f57815h;
        }

        @Override // com.google.common.collect.ImmutableCollection
        int b(Object[] objArr, int i10) {
            return a().b(objArr, i10);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.f57814g.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean i() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
        /* JADX INFO: renamed from: j */
        public b3<K> iterator() {
            return a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f57814g.size();
        }
    }

    public static final class KeysOrValuesAsList extends ImmutableList<Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient Object[] f57816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f57817e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final transient int f57818f;

        KeysOrValuesAsList(Object[] objArr, int i10, int i11) {
            this.f57816d = objArr;
            this.f57817e = i10;
            this.f57818f = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            com.google.common.base.w.C(i10, this.f57818f);
            Object obj = this.f57816d[(i10 * 2) + this.f57817e];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57818f;
        }
    }

    private RegularImmutableMap(@CheckForNull Object obj, Object[] objArr, int i10) {
        this.f57806g = obj;
        this.f57807h = objArr;
        this.f57808i = i10;
    }

    static <K, V> RegularImmutableMap<K, V> J(int i10, Object[] objArr) {
        return K(i10, objArr, null);
    }

    static <K, V> RegularImmutableMap<K, V> K(int i10, Object[] objArr, ImmutableMap.b<K, V> bVar) {
        if (i10 == 0) {
            return (RegularImmutableMap) f57805o;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            n.a(obj, obj2);
            return new RegularImmutableMap<>(null, objArr, 1);
        }
        com.google.common.base.w.d0(i10, objArr.length >> 1);
        Object objL = L(objArr, i10, ImmutableSet.t(i10), 0);
        if (objL instanceof Object[]) {
            Object[] objArr2 = (Object[]) objL;
            ImmutableMap.b.a aVar = (ImmutableMap.b.a) objArr2[2];
            if (bVar == null) {
                throw aVar.a();
            }
            bVar.f57304e = aVar;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objL = obj3;
            i10 = iIntValue;
        }
        return new RegularImmutableMap<>(objL, objArr, i10);
    }

    @CheckForNull
    private static Object L(Object[] objArr, int i10, int i11, int i12) {
        ImmutableMap.b.a aVar = null;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            n.a(obj, obj2);
            return null;
        }
        int i13 = i11 - 1;
        int i14 = -1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = (i16 * 2) + i12;
                int i18 = (i15 * 2) + i12;
                Object obj3 = objArr[i17];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i17 ^ 1];
                Objects.requireNonNull(obj4);
                n.a(obj3, obj4);
                int iC = i1.c(obj3.hashCode());
                while (true) {
                    int i19 = iC & i13;
                    int i20 = bArr[i19] & 255;
                    if (i20 == 255) {
                        bArr[i19] = (byte) i18;
                        if (i15 < i16) {
                            objArr[i18] = obj3;
                            objArr[i18 ^ 1] = obj4;
                        }
                        i15++;
                        break;
                    }
                    if (obj3.equals(objArr[i20])) {
                        int i21 = i20 ^ 1;
                        Object obj5 = objArr[i21];
                        Objects.requireNonNull(obj5);
                        aVar = new ImmutableMap.b.a(obj3, obj4, obj5);
                        objArr[i21] = obj4;
                        break;
                    }
                    iC = i19 + 1;
                }
            }
            return i15 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i15), aVar};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i22 = 0;
            for (int i23 = 0; i23 < i10; i23++) {
                int i24 = (i23 * 2) + i12;
                int i25 = (i22 * 2) + i12;
                Object obj6 = objArr[i24];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i24 ^ 1];
                Objects.requireNonNull(obj7);
                n.a(obj6, obj7);
                int iC2 = i1.c(obj6.hashCode());
                while (true) {
                    int i26 = iC2 & i13;
                    int i27 = sArr[i26] & kotlin.x1.f128661e;
                    if (i27 == 65535) {
                        sArr[i26] = (short) i25;
                        if (i22 < i23) {
                            objArr[i25] = obj6;
                            objArr[i25 ^ 1] = obj7;
                        }
                        i22++;
                        break;
                    }
                    if (obj6.equals(objArr[i27])) {
                        int i28 = i27 ^ 1;
                        Object obj8 = objArr[i28];
                        Objects.requireNonNull(obj8);
                        aVar = new ImmutableMap.b.a(obj6, obj7, obj8);
                        objArr[i28] = obj7;
                        break;
                    }
                    iC2 = i26 + 1;
                }
            }
            return i22 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i22), aVar};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i29 = 0;
        int i30 = 0;
        while (i29 < i10) {
            int i31 = (i29 * 2) + i12;
            int i32 = (i30 * 2) + i12;
            Object obj9 = objArr[i31];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i31 ^ 1];
            Objects.requireNonNull(obj10);
            n.a(obj9, obj10);
            int iC3 = i1.c(obj9.hashCode());
            while (true) {
                int i33 = iC3 & i13;
                int i34 = iArr[i33];
                if (i34 == i14) {
                    iArr[i33] = i32;
                    if (i30 < i29) {
                        objArr[i32] = obj9;
                        objArr[i32 ^ 1] = obj10;
                    }
                    i30++;
                    break;
                }
                if (obj9.equals(objArr[i34])) {
                    int i35 = i34 ^ 1;
                    Object obj11 = objArr[i35];
                    Objects.requireNonNull(obj11);
                    aVar = new ImmutableMap.b.a(obj9, obj10, obj11);
                    objArr[i35] = obj10;
                    break;
                }
                iC3 = i33 + 1;
                i14 = -1;
            }
            i29++;
            i14 = -1;
        }
        return i30 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i30), aVar};
    }

    @CheckForNull
    static Object M(Object[] objArr, int i10, int i11, int i12) {
        Object objL = L(objArr, i10, i11, i12);
        if (objL instanceof Object[]) {
            throw ((ImmutableMap.b.a) ((Object[]) objL)[2]).a();
        }
        return objL;
    }

    @CheckForNull
    static Object N(@CheckForNull Object obj, Object[] objArr, int i10, int i11, @CheckForNull Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iC = i1.c(obj2.hashCode());
            while (true) {
                int i12 = iC & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iC = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iC2 = i1.c(obj2.hashCode());
            while (true) {
                int i14 = iC2 & length2;
                int i15 = sArr[i14] & kotlin.x1.f128661e;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iC2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iC3 = i1.c(obj2.hashCode());
            while (true) {
                int i16 = iC3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iC3 = i16 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        V v10 = (V) N(this.f57806g, this.f57807h, this.f57808i, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableSet<Map.Entry<K, V>> h() {
        return new EntrySet(this, this.f57807h, 0, this.f57808i);
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableSet<K> i() {
        return new KeySet(this, new KeysOrValuesAsList(this.f57807h, 0, this.f57808i));
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableCollection<V> j() {
        return new KeysOrValuesAsList(this.f57807h, 1, this.f57808i);
    }

    @Override // com.google.common.collect.ImmutableMap
    boolean p() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f57808i;
    }
}
