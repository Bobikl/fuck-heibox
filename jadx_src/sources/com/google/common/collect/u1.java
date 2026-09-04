package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ObjectArrays.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class u1 {
    private u1() {
    }

    @s9.a
    static Object a(@CheckForNull Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append("at index ");
        sb2.append(i10);
        throw new NullPointerException(sb2.toString());
    }

    @s9.a
    static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    @s9.a
    static Object[] c(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            a(objArr[i11], i11);
        }
        return objArr;
    }

    public static <T> T[] d(@x1 T t10, T[] tArr) {
        T[] tArr2 = (T[]) j(tArr, tArr.length + 1);
        tArr2[0] = t10;
        System.arraycopy(tArr, 0, tArr2, 1, tArr.length);
        return tArr2;
    }

    public static <T> T[] e(T[] tArr, @x1 T t10) {
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length + 1);
        tArr2[tArr.length] = t10;
        return tArr2;
    }

    @o9.c
    public static <T> T[] f(T[] tArr, T[] tArr2, Class<T> cls) {
        T[] tArr3 = (T[]) i(cls, tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    static Object[] g(Object[] objArr, int i10, int i11) {
        com.google.common.base.w.f0(i10, i10 + i11, objArr.length);
        if (i11 == 0) {
            return new Object[0];
        }
        Object[] objArr2 = new Object[i11];
        System.arraycopy(objArr, i10, objArr2, 0, i11);
        return objArr2;
    }

    @s9.a
    private static Object[] h(Iterable<?> iterable, Object[] objArr) {
        Iterator<?> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    @o9.c
    public static <T> T[] i(Class<T> cls, int i10) {
        return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i10));
    }

    public static <T> T[] j(T[] tArr, int i10) {
        return (T[]) z1.c(tArr, i10);
    }

    static void k(Object[] objArr, int i10, int i11) {
        Object obj = objArr[i10];
        objArr[i10] = objArr[i11];
        objArr[i11] = obj;
    }

    static Object[] l(Collection<?> collection) {
        return h(collection, new Object[collection.size()]);
    }

    static <T> T[] m(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) j(tArr, size);
        }
        h(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    static <T> T[] n(Object[] objArr, int i10, int i11, T[] tArr) {
        com.google.common.base.w.f0(i10, i10 + i11, objArr.length);
        if (tArr.length < i11) {
            tArr = (T[]) j(tArr, i11);
        } else if (tArr.length > i11) {
            tArr[i11] = null;
        }
        System.arraycopy(objArr, i10, tArr, 0, i11);
        return tArr;
    }
}
