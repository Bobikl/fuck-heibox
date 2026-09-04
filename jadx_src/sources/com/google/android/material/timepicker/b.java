package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.accessibility.a0;

/* JADX INFO: compiled from: ClickActionDelegate.java */
/* JADX INFO: loaded from: classes7.dex */
public class b extends androidx.core.view.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0.a f55766a;

    public b(Context context, int i10) {
        this.f55766a = new a0.a(16, context.getString(i10));
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view, a0 a0Var) {
        super.onInitializeAccessibilityNodeInfo(view, a0Var);
        a0Var.b(this.f55766a);
    }
}
