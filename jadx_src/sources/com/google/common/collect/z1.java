package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class z1 {
    private z1() {
    }

    static void a() {
    }

    static <T> T[] b(Object[] objArr, int i10, int i11, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }

    static <T> T[] c(T[] tArr, int i10) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
    }

    static <K, V> Map<K, V> d(int i10) {
        return CompactHashMap.B(i10);
    }

    static <E> Set<E> e(int i10) {
        return CompactHashSet.o(i10);
    }

    static <K, V> Map<K, V> f(int i10) {
        return CompactLinkedHashMap.m0(i10);
    }

    static <E> Set<E> g(int i10) {
        return CompactLinkedHashSet.Y(i10);
    }

    static <E> Set<E> h() {
        return CompactHashSet.i();
    }

    static <K, V> Map<K, V> i() {
        return CompactHashMap.w();
    }

    static int j(int i10) {
        return i10;
    }

    static int k(int i10) {
        return i10;
    }

    static MapMaker l(MapMaker mapMaker) {
        return mapMaker.l();
    }
}
