package com.google.android.gms.internal.common;

import java.util.ListIterator;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@NullMarked
public abstract class h extends g implements ListIterator {
    protected h() {
    }

    @Override // java.util.ListIterator
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
