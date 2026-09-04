package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: Atomics.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public final class n {
    private n() {
    }

    public static <V> AtomicReference<V> a() {
        return new AtomicReference<>();
    }

    public static <V> AtomicReference<V> b(@b1 V v10) {
        return new AtomicReference<>(v10);
    }

    public static <E> AtomicReferenceArray<E> c(int i10) {
        return new AtomicReferenceArray<>(i10);
    }

    public static <E> AtomicReferenceArray<E> d(E[] eArr) {
        return new AtomicReferenceArray<>(eArr);
    }
}
