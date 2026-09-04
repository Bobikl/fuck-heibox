package com.google.android.material.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;

/* JADX INFO: compiled from: ViewGroupOverlayApi14.java */
/* JADX INFO: loaded from: classes7.dex */
public class e0 extends ViewOverlayApi14 implements g0 {
    e0(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    static e0 f(ViewGroup viewGroup) {
        return (e0) ViewOverlayApi14.e(viewGroup);
    }

    @Override // com.google.android.material.internal.g0
    public void c(@n0 View view) {
        this.f54414a.b(view);
    }

    @Override // com.google.android.material.internal.g0
    public void d(@n0 View view) {
        this.f54414a.h(view);
    }
}
