package com.eclipsesource.v8.utils;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class V8PropertyMap<V> implements Map<String, V> {
    private Hashtable<String, V> map = new Hashtable<>();
    private Set<String> nulls = new HashSet();

    V8PropertyMap() {
    }

    @Override // java.util.Map
    public void clear() {
        this.map.clear();
        this.nulls.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj) || this.nulls.contains(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null && !this.nulls.isEmpty()) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return this.map.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, V>> entrySet() {
        HashSet hashSet = new HashSet(this.map.entrySet());
        Iterator<String> it = this.nulls.iterator();
        while (it.hasNext()) {
            hashSet.add(new AbstractMap.SimpleEntry(it.next(), null));
        }
        return hashSet;
    }

    @Override // java.util.Map
    public V get(Object obj) {
        if (this.nulls.contains(obj)) {
            return null;
        }
        return this.map.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.isEmpty() && this.nulls.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        HashSet hashSet = new HashSet(this.map.keySet());
        hashSet.addAll(this.nulls);
        return hashSet;
    }

    @Override // java.util.Map
    public V put(String str, V v10) {
        if (v10 != null) {
            if (this.nulls.contains(str)) {
                this.nulls.remove(str);
            }
            return this.map.put(str, v10);
        }
        if (this.map.containsKey(str)) {
            this.map.remove(str);
        }
        this.nulls.add(str);
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends V> map) {
        for (Map.Entry<? extends String, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), (Object) entry.getValue());
        }
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        if (!this.nulls.contains(obj)) {
            return this.map.remove(obj);
        }
        this.nulls.remove(obj);
        return null;
    }

    @Override // java.util.Map
    public int size() {
        return this.map.size() + this.nulls.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        ArrayList arrayList = new ArrayList(this.map.values());
        for (int i10 = 0; i10 < this.nulls.size(); i10++) {
            arrayList.add(null);
        }
        return arrayList;
    }
}
