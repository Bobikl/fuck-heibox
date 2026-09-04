package io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public enum ArrayListSupplier implements Callable<List<Object>>, kh.o<Object, List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> kh.o<O, List<T>> asFunction() {
        return INSTANCE;
    }

    @Override // kh.o
    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public List<Object> call() throws Exception {
        return new ArrayList();
    }
}
