package com.google.android.gms.internal.common;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class d extends b {
    public d() {
        super(4);
    }

    d(int i10) {
        super(4);
    }

    @s9.a
    public final d c(Object obj) {
        super.a(obj);
        return this;
    }

    @s9.a
    public final d d(Iterator it) {
        while (it.hasNext()) {
            super.a(it.next());
        }
        return this;
    }
}
