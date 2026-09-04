package com.tencent.thumbplayer.tcmedia.utils;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class g<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<K, V> f103148a = new HashMap();

    public g<K, V> a(K k10, V v10) {
        this.f103148a.put(k10, v10);
        return this;
    }

    public Map<K, V> a() {
        return this.f103148a;
    }
}
