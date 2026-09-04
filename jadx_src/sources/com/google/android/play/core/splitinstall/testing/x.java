package com.google.android.play.core.splitinstall.testing;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class x {
    x() {
    }

    abstract x a(@l9.a int i10);

    abstract x b(Map map);

    abstract y c();

    abstract Map d();

    final y e() {
        b(Collections.unmodifiableMap(d()));
        return c();
    }
}
