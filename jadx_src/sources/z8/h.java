package z8;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public final class h {
    private h() {
    }

    @v8.a
    public static boolean a(@p0 Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @n0
    @v8.a
    @Deprecated
    public static <T> List<T> b() {
        return Collections.emptyList();
    }

    @n0
    @v8.a
    @Deprecated
    public static <T> List<T> c(@n0 T t10) {
        return Collections.singletonList(t10);
    }

    @n0
    @v8.a
    @Deprecated
    public static <T> List<T> d(@n0 T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : c(tArr[0]);
        }
        return b();
    }

    @n0
    @v8.a
    public static <K, V> Map<K, V> e(@n0 K k10, @n0 V v10, @n0 K k11, @n0 V v11, @n0 K k12, @n0 V v12) {
        Map mapK = k(3, false);
        mapK.put(k10, v10);
        mapK.put(k11, v11);
        mapK.put(k12, v12);
        return Collections.unmodifiableMap(mapK);
    }

    @n0
    @v8.a
    public static <K, V> Map<K, V> f(@n0 K k10, @n0 V v10, @n0 K k11, @n0 V v11, @n0 K k12, @n0 V v12, @n0 K k13, @n0 V v13, @n0 K k14, @n0 V v14, @n0 K k15, @n0 V v15) {
        Map mapK = k(6, false);
        mapK.put(k10, v10);
        mapK.put(k11, v11);
        mapK.put(k12, v12);
        mapK.put(k13, v13);
        mapK.put(k14, v14);
        mapK.put(k15, v15);
        return Collections.unmodifiableMap(mapK);
    }

    @n0
    @v8.a
    public static <K, V> Map<K, V> g(@n0 K[] kArr, @n0 V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        }
        if (length == 0) {
            return Collections.emptyMap();
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapK = k(length, false);
        for (int i10 = 0; i10 < kArr.length; i10++) {
            mapK.put(kArr[i10], vArr[i10]);
        }
        return Collections.unmodifiableMap(mapK);
    }

    @n0
    @v8.a
    public static <T> Set<T> h(int i10) {
        return i10 == 0 ? new androidx.collection.c() : l(i10, true);
    }

    @n0
    @v8.a
    @Deprecated
    public static <T> Set<T> i(@n0 T t10, @n0 T t11, @n0 T t12) {
        Set setL = l(3, false);
        setL.add(t10);
        setL.add(t11);
        setL.add(t12);
        return Collections.unmodifiableSet(setL);
    }

    @n0
    @v8.a
    @Deprecated
    public static <T> Set<T> j(@n0 T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t10 = tArr[0];
            T t11 = tArr[1];
            Set setL = l(2, false);
            setL.add(t10);
            setL.add(t11);
            return Collections.unmodifiableSet(setL);
        }
        if (length == 3) {
            return i(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setL2 = l(length, false);
            Collections.addAll(setL2, tArr);
            return Collections.unmodifiableSet(setL2);
        }
        T t12 = tArr[0];
        T t13 = tArr[1];
        T t14 = tArr[2];
        T t15 = tArr[3];
        Set setL3 = l(4, false);
        setL3.add(t12);
        setL3.add(t13);
        setL3.add(t14);
        setL3.add(t15);
        return Collections.unmodifiableSet(setL3);
    }

    private static Map k(int i10, boolean z10) {
        return i10 <= 256 ? new androidx.collection.a(i10) : new HashMap(i10, 1.0f);
    }

    private static Set l(int i10, boolean z10) {
        return i10 <= (true != z10 ? 256 : 128) ? new androidx.collection.c(i10) : new HashSet(i10, true != z10 ? 1.0f : 0.75f);
    }
}
