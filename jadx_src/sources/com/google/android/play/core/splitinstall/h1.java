package com.google.android.play.core.splitinstall;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c1 f56250a;

    public static synchronized c1 a(Context context) {
        if (f56250a == null) {
            q0 q0Var = new q0(null);
            q0Var.a(new k(com.google.android.play.core.splitinstall.internal.q0.a(context)));
            f56250a = q0Var.b();
        }
        return f56250a;
    }
}
