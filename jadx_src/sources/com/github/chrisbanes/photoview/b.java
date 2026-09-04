package com.github.chrisbanes.photoview;

import android.annotation.TargetApi;
import android.view.View;

/* JADX INFO: compiled from: Compat.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f43083a = 16;

    b() {
    }

    public static void a(View view, Runnable runnable) {
        b(view, runnable);
    }

    @TargetApi(16)
    private static void b(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
