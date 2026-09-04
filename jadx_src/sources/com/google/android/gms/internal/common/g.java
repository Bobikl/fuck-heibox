package com.google.android.gms.internal.common;

import java.util.Iterator;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@NullMarked
public abstract class g implements Iterator {
    protected g() {
    }

    @Override // java.util.Iterator
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
