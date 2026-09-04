package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: FlexLine.java */
/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f52237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f52238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f52239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f52240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f52241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f52242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f52243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f52244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f52245m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f52247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f52248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f52249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f52250r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f52233a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f52234b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f52235c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f52236d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    List<Integer> f52246n = new ArrayList();

    f() {
    }

    public int a() {
        return this.f52239g;
    }

    public int b() {
        return this.f52247o;
    }

    public int c() {
        return this.f52240h;
    }

    public int d() {
        return this.f52240h - this.f52241i;
    }

    public int e() {
        return this.f52237e;
    }

    public float f() {
        return this.f52242j;
    }

    public float g() {
        return this.f52243k;
    }

    void h(View view, int i10, int i11, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f52233a = Math.min(this.f52233a, (view.getLeft() - flexItem.A1()) - i10);
        this.f52234b = Math.min(this.f52234b, (view.getTop() - flexItem.R()) - i11);
        this.f52235c = Math.max(this.f52235c, view.getRight() + flexItem.K1() + i12);
        this.f52236d = Math.max(this.f52236d, view.getBottom() + flexItem.h0() + i13);
    }
}
