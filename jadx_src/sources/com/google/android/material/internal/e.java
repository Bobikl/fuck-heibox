package com.google.android.material.internal;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.g3;
import androidx.core.view.j1;

/* JADX INFO: compiled from: EdgeToEdgeUtils.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f54491a = 128;

    private e() {
    }

    public static void a(@n0 Window window, boolean z10) {
        b(window, z10, null, null);
    }

    public static void b(@n0 Window window, boolean z10, @androidx.annotation.l @p0 Integer num, @androidx.annotation.l @p0 Integer num2) {
        boolean z11 = num == null || num.intValue() == 0;
        boolean z12 = num2 == null || num2.intValue() == 0;
        if (z11 || z12) {
            int iB = com.google.android.material.color.m.b(window.getContext(), R.attr.colorBackground, j1.f21601t);
            if (z11) {
                num = Integer.valueOf(iB);
            }
            if (z12) {
                num2 = Integer.valueOf(iB);
            }
        }
        g3.c(window, !z10);
        int iD = d(window.getContext(), z10);
        int iC = c(window.getContext(), z10);
        window.setStatusBarColor(iD);
        window.setNavigationBarColor(iC);
        g(window, e(iD, com.google.android.material.color.m.m(num.intValue())));
        f(window, e(iC, com.google.android.material.color.m.m(num2.intValue())));
    }

    @TargetApi(21)
    private static int c(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return androidx.core.graphics.f0.B(com.google.android.material.color.m.b(context, R.attr.navigationBarColor, j1.f21601t), 128);
        }
        if (z10) {
            return 0;
        }
        return com.google.android.material.color.m.b(context, R.attr.navigationBarColor, j1.f21601t);
    }

    @TargetApi(21)
    private static int d(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return com.google.android.material.color.m.b(context, R.attr.statusBarColor, j1.f21601t);
    }

    private static boolean e(int i10, boolean z10) {
        return com.google.android.material.color.m.m(i10) || (i10 == 0 && z10);
    }

    public static void f(@n0 Window window, boolean z10) {
        g3.a(window, window.getDecorView()).h(z10);
    }

    public static void g(@n0 Window window, boolean z10) {
        g3.a(window, window.getDecorView()).i(z10);
    }
}
