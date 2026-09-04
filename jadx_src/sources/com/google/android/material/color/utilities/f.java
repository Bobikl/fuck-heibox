package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: DislikeAnalyzer.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class f {
    private f() {
        throw new UnsupportedOperationException();
    }

    public static b0 a(b0 b0Var) {
        return b(b0Var) ? b0.a(b0Var.d(), b0Var.c(), 70.0d) : b0Var;
    }

    public static boolean b(b0 b0Var) {
        return ((((double) Math.round(b0Var.d())) > 90.0d ? 1 : (((double) Math.round(b0Var.d())) == 90.0d ? 0 : -1)) >= 0 && (((double) Math.round(b0Var.d())) > 111.0d ? 1 : (((double) Math.round(b0Var.d())) == 111.0d ? 0 : -1)) <= 0) && ((((double) Math.round(b0Var.c())) > 16.0d ? 1 : (((double) Math.round(b0Var.c())) == 16.0d ? 0 : -1)) > 0) && ((((double) Math.round(b0Var.e())) > 70.0d ? 1 : (((double) Math.round(b0Var.e())) == 70.0d ? 0 : -1)) < 0);
    }
}
