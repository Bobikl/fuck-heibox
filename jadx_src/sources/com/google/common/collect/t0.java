package com.google.common.collect;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingMapEntry.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class t0<K, V> extends y0 implements Map.Entry<K, V> {
    protected t0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.y0
    public abstract Map.Entry<K, V> H0();

    protected boolean J0(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return com.google.common.base.s.a(getKey(), entry.getKey()) && com.google.common.base.s.a(getValue(), entry.getValue());
    }

    protected int L0() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @o9.a
    protected String N0() {
        String strValueOf = String.valueOf(getKey());
        String strValueOf2 = String.valueOf(getValue());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(strValueOf2);
        return sb2.toString();
    }

    public boolean equals(@CheckForNull Object obj) {
        return H0().equals(obj);
    }

    @Override // java.util.Map.Entry
    @x1
    public K getKey() {
        return H0().getKey();
    }

    @x1
    public V getValue() {
        return H0().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return H0().hashCode();
    }

    @x1
    public V setValue(@x1 V v10) {
        return H0().setValue(v10);
    }
}
