package io.reactivex.internal.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: SorterFunction.java */
/* JADX INFO: loaded from: classes5.dex */
public final class o<T> implements kh.o<List<T>, List<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Comparator<? super T> f123885b;

    public o(Comparator<? super T> comparator) {
        this.f123885b = comparator;
    }

    @Override // kh.o
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<T> apply(List<T> list) throws Exception {
        Collections.sort(list, this.f123885b);
        return list;
    }
}
