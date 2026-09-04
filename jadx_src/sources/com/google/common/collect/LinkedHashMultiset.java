package com.google.common.collect;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public final class LinkedHashMultiset<E> extends AbstractMapBasedMultiset<E> {
    LinkedHashMultiset(int i10) {
        super(i10);
    }

    public static <E> LinkedHashMultiset<E> o() {
        return q(3);
    }

    public static <E> LinkedHashMultiset<E> q(int i10) {
        return new LinkedHashMultiset<>(i10);
    }

    public static <E> LinkedHashMultiset<E> s(Iterable<? extends E> iterable) {
        LinkedHashMultiset<E> linkedHashMultisetQ = q(Multisets.l(iterable));
        l1.a(linkedHashMultisetQ, iterable);
        return linkedHashMultisetQ;
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    public /* bridge */ /* synthetic */ Set c() {
        return super.c();
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.s1
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.s1
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultiset
    v1<E> j(int i10) {
        return new w1(i10);
    }
}
