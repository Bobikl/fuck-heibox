package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public class PrettyPrintTreeMap<K, V> extends TreeMap<K, V> {
    PrettyPrintTreeMap() {
    }

    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("( ");
        for (Map.Entry<K, V> entry : entrySet()) {
            sb2.append('{');
            sb2.append(entry.getKey());
            sb2.append(':');
            sb2.append(entry.getValue());
            sb2.append("}, ");
        }
        if (!isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
