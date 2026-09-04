package org.apache.tools.ant.util;

import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class LinkedHashtable<K, V> extends Hashtable<K, V> {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap<K, V> f136716b;

    public LinkedHashtable() {
        this.f136716b = new LinkedHashMap<>();
    }

    public LinkedHashtable(int i10) {
        this.f136716b = new LinkedHashMap<>(i10);
    }

    public LinkedHashtable(int i10, float f10) {
        this.f136716b = new LinkedHashMap<>(i10, f10);
    }

    public LinkedHashtable(Map<K, V> map) {
        this.f136716b = new LinkedHashMap<>(map);
    }

    @Override // java.util.Hashtable, java.util.Map
    public synchronized void clear() {
        this.f136716b.clear();
    }

    @Override // java.util.Hashtable
    public boolean contains(Object obj) {
        return containsKey(obj);
    }

    @Override // java.util.Hashtable, java.util.Map
    public synchronized boolean containsKey(Object obj) {
        return this.f136716b.containsKey(obj);
    }

    @Override // java.util.Hashtable, java.util.Map
    public synchronized boolean containsValue(Object obj) {
        return this.f136716b.containsValue(obj);
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration<V> elements() {
        return Collections.enumeration(values());
    }

    @Override // java.util.Hashtable, java.util.Map
    public synchronized Set<Map.Entry<K, V>> entrySet() {
        return this.f136716b.entrySet();
    }

    @Override // java.util.Hashtable, java.util.Map
    public synchronized boolean equals(Object obj) {
        return this.f136716b.equals(obj);
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized V get(Object obj) {
        return this.f136716b.get(obj);
    }

    @Override // java.util.Hashtable, java.util.Map
    public synchronized int hashCode() {
        return this.f136716b.hashCode();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized boolean isEmpty() {
        return this.f136716b.isEmpty();
    }

    @Override // java.util.Hashtable, java.util.Map
    public synchronized Set<K> keySet() {
        return this.f136716b.keySet();
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration<K> keys() {
        return Collections.enumeration(keySet());
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized V put(K k10, V v10) {
        return this.f136716b.put(k10, v10);
    }

    @Override // java.util.Hashtable, java.util.Map
    public synchronized void putAll(Map<? extends K, ? extends V> map) {
        this.f136716b.putAll(map);
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized V remove(Object obj) {
        return this.f136716b.remove(obj);
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized int size() {
        return this.f136716b.size();
    }

    @Override // java.util.Hashtable
    public synchronized String toString() {
        return this.f136716b.toString();
    }

    @Override // java.util.Hashtable, java.util.Map
    public synchronized Collection<V> values() {
        return this.f136716b.values();
    }
}
