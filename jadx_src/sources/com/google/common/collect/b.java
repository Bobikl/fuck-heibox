package com.google.common.collect;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractMapEntry.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class b<K, V> implements Map.Entry<K, V> {
    b() {
    }

    @Override // java.util.Map.Entry
    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return com.google.common.base.s.a(getKey(), entry.getKey()) && com.google.common.base.s.a(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    @x1
    public abstract K getKey();

    @Override // java.util.Map.Entry
    @x1
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    @x1
    public V setValue(@x1 V v10) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        String strValueOf = String.valueOf(getKey());
        String strValueOf2 = String.valueOf(getValue());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(strValueOf2);
        return sb2.toString();
    }
}
