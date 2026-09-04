package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public class TreeMultimap<K, V> extends AbstractSortedKeySortedSetMultimap<K, V> {

    @o9.c
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient Comparator<? super K> f57980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient Comparator<? super V> f57981j;

    TreeMultimap(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        super(new TreeMap(comparator));
        this.f57980i = comparator;
        this.f57981j = comparator2;
    }

    private TreeMultimap(Comparator<? super K> comparator, Comparator<? super V> comparator2, r1<? extends K, ? extends V> r1Var) {
        this(comparator, comparator2);
        A(r1Var);
    }

    public static <K extends Comparable, V extends Comparable> TreeMultimap<K, V> R() {
        return new TreeMultimap<>(Ordering.z(), Ordering.z());
    }

    public static <K extends Comparable, V extends Comparable> TreeMultimap<K, V> S(r1<? extends K, ? extends V> r1Var) {
        return new TreeMultimap<>(Ordering.z(), Ordering.z(), r1Var);
    }

    public static <K, V> TreeMultimap<K, V> T(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        return new TreeMultimap<>((Comparator) com.google.common.base.w.E(comparator), (Comparator) com.google.common.base.w.E(comparator2));
    }

    @o9.c
    private void Y(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f57980i = (Comparator) com.google.common.base.w.E((Comparator) objectInputStream.readObject());
        this.f57981j = (Comparator) com.google.common.base.w.E((Comparator) objectInputStream.readObject());
        D(new TreeMap(this.f57980i));
        g2.d(this, objectInputStream);
    }

    @o9.c
    private void Z(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(W());
        objectOutputStream.writeObject(I());
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

    @Override // com.google.common.collect.t2
    public Comparator<? super V> I() {
        return this.f57981j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: K */
    public SortedSet<V> u() {
        return new TreeSet(this.f57981j);
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public NavigableMap<K, Collection<V>> e() {
        return (NavigableMap) super.e();
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
    @o9.c
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public NavigableSet<V> v(@x1 K k10) {
        return (NavigableSet) super.v((Object) k10);
    }

    @Deprecated
    public Comparator<? super K> W() {
        return this.f57980i;
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.c, com.google.common.collect.r1
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public NavigableSet<K> keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public /* bridge */ /* synthetic */ SortedSet a(@CheckForNull Object obj) {
        return super.a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public /* bridge */ /* synthetic */ SortedSet b(@x1 Object obj, Iterable iterable) {
        return super.b(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
    Map<K, Collection<V>> c() {
        return w();
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
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    Collection<V> v(@x1 K k10) {
        if (k10 == 0) {
            W().compare(k10, k10);
        }
        return super.v(k10);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }
}
