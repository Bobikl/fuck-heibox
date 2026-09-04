package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public final class HashMultimap<K, V> extends HashMultimapGwtSerializationDependencies<K, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f57261j = 2;

    @o9.c
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @o9.d
    transient int f57262i;

    private HashMultimap() {
        this(12, 2);
    }

    private HashMultimap(int i10, int i11) {
        super(z1.d(i10));
        this.f57262i = 2;
        com.google.common.base.w.d(i11 >= 0);
        this.f57262i = i11;
    }

    private HashMultimap(r1<? extends K, ? extends V> r1Var) {
        super(z1.d(r1Var.keySet().size()));
        this.f57262i = 2;
        A(r1Var);
    }

    public static <K, V> HashMultimap<K, V> K() {
        return new HashMultimap<>();
    }

    public static <K, V> HashMultimap<K, V> L(int i10, int i11) {
        return new HashMultimap<>(i10, i11);
    }

    public static <K, V> HashMultimap<K, V> M(r1<? extends K, ? extends V> r1Var) {
        return new HashMultimap<>(r1Var);
    }

    @o9.c
    private void N(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f57262i = 2;
        int iH = g2.h(objectInputStream);
        D(z1.d(12));
        g2.e(this, objectInputStream, iH);
    }

    @o9.c
    private void O(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        g2.j(this, objectOutputStream);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    @s9.a
    public /* bridge */ /* synthetic */ boolean A(r1 r1Var) {
        return super.A(r1Var);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ boolean D0(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.D0(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: H */
    public Set<V> u() {
        return z1.e(this.f57262i);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public /* bridge */ /* synthetic */ Set a(@CheckForNull Object obj) {
        return super.a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public /* bridge */ /* synthetic */ Set b(@x1 Object obj, Iterable iterable) {
        return super.b(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ boolean containsKey(@CheckForNull Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ boolean containsValue(@CheckForNull Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    public /* bridge */ /* synthetic */ Map e() {
        return super.e();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    public /* bridge */ /* synthetic */ Set v(@x1 Object obj) {
        return super.v(obj);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ Set i() {
        return super.i();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ s1 n0() {
        return super.n0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c, com.google.common.collect.r1
    @s9.a
    public /* bridge */ /* synthetic */ boolean put(@x1 Object obj, @x1 Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    @s9.a
    public /* bridge */ /* synthetic */ boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.c, com.google.common.collect.r1
    @s9.a
    public /* bridge */ /* synthetic */ boolean t0(@x1 Object obj, Iterable iterable) {
        return super.t0(obj, iterable);
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }
}
