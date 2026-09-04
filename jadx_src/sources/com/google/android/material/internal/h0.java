package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.n0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: ViewOverlayApi18.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(18)
public class h0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewOverlay f54505a;

    h0(@n0 View view) {
        this.f54505a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.i0
    public void a(@n0 Drawable drawable) {
        this.f54505a.remove(drawable);
    }

    @Override // com.google.android.material.internal.i0
    public void b(@n0 Drawable drawable) {
        this.f54505a.add(drawable);
    }
}
