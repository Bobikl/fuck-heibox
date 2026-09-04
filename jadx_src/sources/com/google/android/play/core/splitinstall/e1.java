package com.google.android.play.core.splitinstall;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference f56235a = new AtomicReference(null);

    @androidx.annotation.p0
    static d1 a() {
        return (d1) f56235a.get();
    }

    public static void b(d1 d1Var) {
        AtomicReference atomicReference = f56235a;
        while (!androidx.compose.animation.core.s0.a(atomicReference, null, d1Var) && atomicReference.get() == null) {
        }
    }
}
