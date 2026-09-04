package com.google.android.play.core.splitinstall;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f56475a;

    public final Map a(Collection collection) {
        Set setUnmodifiableSet;
        HashMap map = new HashMap();
        for (String str : this.f56475a.keySet()) {
            if (this.f56475a.containsKey(str)) {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : ((Map) this.f56475a.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                setUnmodifiableSet = Collections.emptySet();
            }
            map.put(str, setUnmodifiableSet);
        }
        return map;
    }
}
