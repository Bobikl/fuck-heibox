package com.scwang.smartrefresh.layout.impl;

import android.graphics.PointF;
import android.view.View;
import ng.k;

/* JADX INFO: compiled from: ScrollBoundaryDeciderAdapter.java */
/* JADX INFO: loaded from: classes8.dex */
public class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PointF f96761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f96762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f96763c = true;

    @Override // ng.k
    public boolean a(View view) {
        k kVar = this.f96762b;
        return kVar != null ? kVar.a(view) : com.scwang.smartrefresh.layout.util.b.a(view, this.f96761a, this.f96763c);
    }

    @Override // ng.k
    public boolean b(View view) {
        k kVar = this.f96762b;
        return kVar != null ? kVar.b(view) : com.scwang.smartrefresh.layout.util.b.b(view, this.f96761a);
    }
}
