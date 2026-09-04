package com.google.android.play.core.splitinstall;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f56468a = new HashMap();

    public final w0 a(String str, String str2, String str3) {
        if (!this.f56468a.containsKey(str2)) {
            this.f56468a.put(str2, new HashMap());
        }
        ((Map) this.f56468a.get(str2)).put(str, str3);
        return this;
    }

    public final y0 b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f56468a.entrySet()) {
            map.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new y0(Collections.unmodifiableMap(map), null);
    }
}
