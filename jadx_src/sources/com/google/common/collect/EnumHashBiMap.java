package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class EnumHashBiMap<K extends Enum<K>, V> extends AbstractBiMap<K, V> {

    @o9.c
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Class<K> f57201g;

    private EnumHashBiMap(Class<K> cls) {
        super(new EnumMap(cls), Maps.a0(cls.getEnumConstants().length));
        this.f57201g = cls;
    }

    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> r1(Class<K> cls) {
        return new EnumHashBiMap<>(cls);
    }

    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> s1(Map<K, ? extends V> map) {
        EnumHashBiMap<K, V> enumHashBiMapR1 = r1(EnumBiMap.v1(map));
        enumHashBiMapR1.putAll(map);
        return enumHashBiMapR1;
    }

    @o9.c
    private void x1(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f57201g = (Class) objectInputStream.readObject();
        m1(new EnumMap(this.f57201g), new HashMap((this.f57201g.getEnumConstants().length * 3) / 2));
        g2.b(this, objectInputStream);
    }

    @o9.c
    private void z1(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f57201g);
        g2.i(this, objectOutputStream);
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

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s0, java.util.Map
    @s9.a
    @CheckForNull
    public /* bridge */ /* synthetic */ Object remove(@CheckForNull Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.l
    @s9.a
    @CheckForNull
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public V R(K k10, @x1 V v10) {
        return (V) super.R(k10, v10);
    }

    public Class<K> v1() {
        return this.f57201g;
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s0, java.util.Map, com.google.common.collect.l
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s0, java.util.Map, com.google.common.collect.l
    @s9.a
    @CheckForNull
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public V put(K k10, @x1 V v10) {
        return (V) super.put(k10, v10);
    }
}
