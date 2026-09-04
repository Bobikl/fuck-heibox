package com.google.common.cache;

import com.google.common.base.w;
import java.util.AbstractMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@f
@o9.b
public final class RemovalNotification<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RemovalCause f56948b;

    private RemovalNotification(@CheckForNull K k10, @CheckForNull V v10, RemovalCause removalCause) {
        super(k10, v10);
        this.f56948b = (RemovalCause) w.E(removalCause);
    }

    public static <K, V> RemovalNotification<K, V> a(@CheckForNull K k10, @CheckForNull V v10, RemovalCause removalCause) {
        return new RemovalNotification<>(k10, v10, removalCause);
    }

    public RemovalCause b() {
        return this.f56948b;
    }

    public boolean c() {
        return this.f56948b.wasEvicted();
    }
}
