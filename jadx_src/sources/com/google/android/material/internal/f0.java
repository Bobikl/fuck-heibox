package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.n0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: ViewGroupOverlayApi18.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(18)
public class f0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f54494a;

    f0(@n0 ViewGroup viewGroup) {
        this.f54494a = viewGroup.getOverlay();
    }

    @Override // com.google.android.material.internal.i0
    public void a(@n0 Drawable drawable) {
        this.f54494a.remove(drawable);
    }

    @Override // com.google.android.material.internal.i0
    public void b(@n0 Drawable drawable) {
        this.f54494a.add(drawable);
    }

    @Override // com.google.android.material.internal.g0
    public void c(@n0 View view) {
        this.f54494a.add(view);
    }

    @Override // com.google.android.material.internal.g0
    public void d(@n0 View view) {
        this.f54494a.remove(view);
    }
}
