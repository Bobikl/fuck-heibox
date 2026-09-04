package com.efs.sdk.base.core.b;

import androidx.annotation.p0;
import com.efs.sdk.base.core.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<Byte, e> f42432a = new ConcurrentHashMap<>();

    @p0
    public final e a(byte b10) {
        if (!this.f42432a.containsKey(Byte.valueOf(b10))) {
            if (b10 == 1) {
                this.f42432a.putIfAbsent(Byte.valueOf(b10), new g());
            } else if (b10 != 2) {
                Log.w("efs.cache", "Cache module not support protocol ".concat(String.valueOf((int) b10)));
            } else {
                this.f42432a.putIfAbsent(Byte.valueOf(b10), new d());
            }
        }
        return this.f42432a.get(Byte.valueOf(b10));
    }
}
