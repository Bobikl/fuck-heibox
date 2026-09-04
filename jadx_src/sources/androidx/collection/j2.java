package androidx.collection;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: SimpleArrayMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nSimpleArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,769:1\n297#1,5:770\n297#1,5:775\n1#2:780\n*S KotlinDebug\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n*L\n276#1:770,5\n291#1:775,5\n*E\n"})
public class j2<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private int[] f3634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private Object[] f3635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3636d;

    @xh.i
    public j2() {
        this(0, 1, null);
    }

    @xh.i
    public j2(int i10) {
        this.f3634b = i10 == 0 ? i0.a.f119206a : new int[i10];
        this.f3635c = i10 == 0 ? i0.a.f119208c : new Object[i10 << 1];
    }

    public /* synthetic */ j2(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public j2(@dl.e j2<? extends K, ? extends V> j2Var) {
        this(0, 1, null);
        if (j2Var != null) {
            h(j2Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends V> T c(Object obj, T t10) {
        int iE = e(obj);
        return iE >= 0 ? (T) this.f3635c[(iE << 1) + 1] : t10;
    }

    private final int d(K k10, int i10) {
        int i11 = this.f3636d;
        if (i11 == 0) {
            return -1;
        }
        int iA = i0.a.a(this.f3634b, i11, i10);
        if (iA < 0 || kotlin.jvm.internal.f0.g(k10, this.f3635c[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f3634b[i12] == i10) {
            if (kotlin.jvm.internal.f0.g(k10, this.f3635c[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f3634b[i13] == i10; i13--) {
            if (kotlin.jvm.internal.f0.g(k10, this.f3635c[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    private final int f() {
        int i10 = this.f3636d;
        if (i10 == 0) {
            return -1;
        }
        int iA = i0.a.a(this.f3634b, i10, 0);
        if (iA < 0 || this.f3635c[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f3634b[i11] == 0) {
            if (this.f3635c[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f3634b[i12] == 0; i12--) {
            if (this.f3635c[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    @xh.h(name = "__restricted$indexOfValue")
    public final int a(V v10) {
        int i10 = this.f3636d * 2;
        Object[] objArr = this.f3635c;
        if (v10 == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (kotlin.jvm.internal.f0.g(v10, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void b(int i10) {
        int i11 = this.f3636d;
        int[] iArr = this.f3634b;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f3634b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3635c, i10 * 2);
            kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f3635c = objArrCopyOf;
        }
        if (this.f3636d != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f3636d > 0) {
            this.f3634b = i0.a.f119206a;
            this.f3635c = i0.a.f119208c;
            this.f3636d = 0;
        }
        if (this.f3636d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k10) {
        return e(k10) >= 0;
    }

    public boolean containsValue(V v10) {
        return a(v10) >= 0;
    }

    public int e(K k10) {
        return k10 == null ? f() : d(k10, k10.hashCode());
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof j2) {
                if (size() != ((j2) obj).size()) {
                    return false;
                }
                j2 j2Var = (j2) obj;
                int i10 = this.f3636d;
                for (int i11 = 0; i11 < i10; i11++) {
                    K kG = g(i11);
                    V vK = k(i11);
                    Object obj2 = j2Var.get(kG);
                    if (vK == null) {
                        if (obj2 != null || !j2Var.containsKey(kG)) {
                            return false;
                        }
                    } else if (!kotlin.jvm.internal.f0.g(vK, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f3636d;
            for (int i13 = 0; i13 < i12; i13++) {
                K kG2 = g(i13);
                V vK2 = k(i13);
                Object obj3 = ((Map) obj).get(kG2);
                if (vK2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(kG2)) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.f0.g(vK2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public K g(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f3636d) {
            z10 = true;
        }
        if (z10) {
            return (K) this.f3635c[i10 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
    }

    @dl.e
    public V get(K k10) {
        int iE = e(k10);
        if (iE >= 0) {
            return (V) this.f3635c[(iE << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(@dl.e Object obj, V v10) {
        int iE = e(obj);
        return iE >= 0 ? (V) this.f3635c[(iE << 1) + 1] : v10;
    }

    public void h(@dl.d j2<? extends K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "map");
        int i10 = map.f3636d;
        b(this.f3636d + i10);
        if (this.f3636d != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.g(i11), map.k(i11));
            }
        } else if (i10 > 0) {
            kotlin.collections.m.a1(map.f3634b, this.f3634b, 0, 0, i10);
            kotlin.collections.m.c1(map.f3635c, this.f3635c, 0, 0, i10 << 1);
            this.f3636d = i10;
        }
    }

    public int hashCode() {
        int[] iArr = this.f3634b;
        Object[] objArr = this.f3635c;
        int i10 = this.f3636d;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public V i(int i10) {
        if (!(i10 >= 0 && i10 < this.f3636d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        Object[] objArr = this.f3635c;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f3636d;
        if (i12 <= 1) {
            clear();
        } else {
            int i13 = i12 - 1;
            int[] iArr = this.f3634b;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    int i15 = i13 + 1;
                    kotlin.collections.m.a1(iArr, iArr, i10, i14, i15);
                    Object[] objArr2 = this.f3635c;
                    kotlin.collections.m.c1(objArr2, objArr2, i11, i14 << 1, i15 << 1);
                }
                Object[] objArr3 = this.f3635c;
                int i16 = i13 << 1;
                objArr3[i16] = null;
                objArr3[i16 + 1] = null;
            } else {
                int i17 = i12 > 8 ? i12 + (i12 >> 1) : 8;
                int[] iArrCopyOf = Arrays.copyOf(iArr, i17);
                kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
                this.f3634b = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.f3635c, i17 << 1);
                kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
                this.f3635c = objArrCopyOf;
                if (i12 != this.f3636d) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    kotlin.collections.m.a1(iArr, this.f3634b, 0, 0, i10);
                    kotlin.collections.m.c1(objArr, this.f3635c, 0, 0, i11);
                }
                if (i10 < i13) {
                    int i18 = i10 + 1;
                    int i19 = i13 + 1;
                    kotlin.collections.m.a1(iArr, this.f3634b, i10, i18, i19);
                    kotlin.collections.m.c1(objArr, this.f3635c, i11, i18 << 1, i19 << 1);
                }
            }
            if (i12 != this.f3636d) {
                throw new ConcurrentModificationException();
            }
            this.f3636d = i13;
        }
        return v10;
    }

    public boolean isEmpty() {
        return this.f3636d <= 0;
    }

    public V j(int i10, V v10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f3636d) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f3635c;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public V k(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f3636d) {
            z10 = true;
        }
        if (z10) {
            return (V) this.f3635c[(i10 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
    }

    @dl.e
    public V put(K k10, V v10) {
        int i10 = this.f3636d;
        int iHashCode = k10 != null ? k10.hashCode() : 0;
        int iD = k10 != null ? d(k10, iHashCode) : f();
        if (iD >= 0) {
            int i11 = (iD << 1) + 1;
            Object[] objArr = this.f3635c;
            V v11 = (V) objArr[i11];
            objArr[i11] = v10;
            return v11;
        }
        int i12 = ~iD;
        int[] iArr = this.f3634b;
        if (i10 >= iArr.length) {
            int i13 = 4;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 >= 4) {
                i13 = 8;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f3634b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f3635c, i13 << 1);
            kotlin.jvm.internal.f0.o(objArrCopyOf, "copyOf(this, newSize)");
            this.f3635c = objArrCopyOf;
            if (i10 != this.f3636d) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f3634b;
            int i14 = i12 + 1;
            kotlin.collections.m.a1(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f3635c;
            kotlin.collections.m.c1(objArr2, objArr2, i14 << 1, i12 << 1, this.f3636d << 1);
        }
        int i15 = this.f3636d;
        if (i10 == i15) {
            int[] iArr3 = this.f3634b;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f3635c;
                int i16 = i12 << 1;
                objArr3[i16] = k10;
                objArr3[i16 + 1] = v10;
                this.f3636d = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @dl.e
    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    @dl.e
    public V remove(K k10) {
        int iE = e(k10);
        if (iE >= 0) {
            return i(iE);
        }
        return null;
    }

    public boolean remove(K k10, V v10) {
        int iE = e(k10);
        if (iE < 0 || !kotlin.jvm.internal.f0.g(v10, k(iE))) {
            return false;
        }
        i(iE);
        return true;
    }

    @dl.e
    public V replace(K k10, V v10) {
        int iE = e(k10);
        if (iE >= 0) {
            return j(iE, v10);
        }
        return null;
    }

    public boolean replace(K k10, V v10, V v11) {
        int iE = e(k10);
        if (iE < 0 || !kotlin.jvm.internal.f0.g(v10, k(iE))) {
            return false;
        }
        j(iE, v11);
        return true;
    }

    public int size() {
        return this.f3636d;
    }

    @dl.d
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f3636d * 28);
        sb2.append('{');
        int i10 = this.f3636d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            K kG = g(i11);
            if (kG != sb2) {
                sb2.append(kG);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append(n5.a.f132013h);
            V vK = k(i11);
            if (vK != sb2) {
                sb2.append(vK);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
