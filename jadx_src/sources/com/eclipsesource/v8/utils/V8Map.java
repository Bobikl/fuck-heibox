package com.eclipsesource.v8.utils;

import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8Value;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class V8Map<V> implements Map<V8Value, V>, Releasable {
    private Map<V8Value, V> map = new HashMap();
    private Map<V8Value, V8Value> twinMap = new HashMap();

    @Override // java.util.Map
    public void clear() {
        this.map.clear();
        Iterator<V8Value> it = this.twinMap.keySet().iterator();
        while (it.hasNext()) {
            it.next().close();
        }
        this.twinMap.clear();
    }

    @Override // com.eclipsesource.v8.Releasable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<V8Value, V>> entrySet() {
        return this.map.entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.map.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Map
    public Set<V8Value> keySet() {
        return this.map.keySet();
    }

    @Override // java.util.Map
    public V put(V8Value v8Value, V v10) {
        remove(v8Value);
        V8Value v8ValueTwin = v8Value.twin();
        this.twinMap.put(v8ValueTwin, v8ValueTwin);
        return this.map.put(v8ValueTwin, v10);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends V8Value, ? extends V> map) {
        for (Map.Entry<? extends V8Value, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), (Object) entry.getValue());
        }
    }

    @Override // com.eclipsesource.v8.Releasable
    @Deprecated
    public void release() {
        close();
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        V vRemove = this.map.remove(obj);
        V8Value v8ValueRemove = this.twinMap.remove(obj);
        if (v8ValueRemove != null) {
            v8ValueRemove.close();
        }
        return vRemove;
    }

    @Override // java.util.Map
    public int size() {
        return this.map.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.map.values();
    }
}
