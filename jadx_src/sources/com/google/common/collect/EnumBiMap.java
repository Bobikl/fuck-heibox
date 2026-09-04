package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends AbstractBiMap<K, V> {

    @o9.c
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Class<K> f57199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Class<V> f57200h;

    private EnumBiMap(Class<K> cls, Class<V> cls2) {
        super(new EnumMap(cls), new EnumMap(cls2));
        this.f57199g = cls;
        this.f57200h = cls2;
    }

    @o9.c
    private void B1(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f57199g);
        objectOutputStream.writeObject(this.f57200h);
        g2.i(this, objectOutputStream);
    }

    public static <K extends Enum<K>, V extends Enum<V>> EnumBiMap<K, V> s1(Class<K> cls, Class<V> cls2) {
        return new EnumBiMap<>(cls, cls2);
    }

    public static <K extends Enum<K>, V extends Enum<V>> EnumBiMap<K, V> u1(Map<K, V> map) {
        EnumBiMap<K, V> enumBiMapS1 = s1(v1(map), w1(map));
        enumBiMapS1.putAll(map);
        return enumBiMapS1;
    }

    static <K extends Enum<K>> Class<K> v1(Map<K, ?> map) {
        if (map instanceof EnumBiMap) {
            return ((EnumBiMap) map).x1();
        }
        if (map instanceof EnumHashBiMap) {
            return ((EnumHashBiMap) map).v1();
        }
        com.google.common.base.w.d(!map.isEmpty());
        return map.keySet().iterator().next().getDeclaringClass();
    }

    private static <V extends Enum<V>> Class<V> w1(Map<?, V> map) {
        if (map instanceof EnumBiMap) {
            return ((EnumBiMap) map).f57200h;
        }
        com.google.common.base.w.d(!map.isEmpty());
        return map.values().iterator().next().getDeclaringClass();
    }

    @o9.c
    private void z1(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f57199g = (Class) objectInputStream.readObject();
        this.f57200h = (Class) objectInputStream.readObject();
        m1(new EnumMap(this.f57199g), new EnumMap(this.f57200h));
        g2.b(this, objectInputStream);
    }

    public Class<V> A1() {
        return this.f57200h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.l
    @s9.a
    @CheckForNull
    public /* bridge */ /* synthetic */ Object R(@x1 Object obj, @x1 Object obj2) {
        return super.R(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s0, java.util.Map
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s0, java.util.Map
    public /* bridge */ /* synthetic */ boolean containsValue(@CheckForNull Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s0, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.l
    public /* bridge */ /* synthetic */ l i0() {
        return super.i0();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s0, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s0, java.util.Map, com.google.common.collect.l
    @s9.a
    @CheckForNull
    public /* bridge */ /* synthetic */ Object put(@x1 Object obj, @x1 Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s0, java.util.Map, com.google.common.collect.l
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractBiMap
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public K a1(K k10) {
        return (K) com.google.common.base.w.E(k10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractBiMap
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public V b1(V v10) {
        return (V) com.google.common.base.w.E(v10);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s0, java.util.Map
    @s9.a
    @CheckForNull
    public /* bridge */ /* synthetic */ Object remove(@CheckForNull Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s0, java.util.Map, com.google.common.collect.l
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    public Class<K> x1() {
        return this.f57199g;
    }
}
