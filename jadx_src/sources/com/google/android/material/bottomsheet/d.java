package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.annotation.n0;
import androidx.core.view.j3;
import androidx.core.view.n3;
import java.util.List;

/* JADX INFO: compiled from: InsetsAnimationCallback.java */
/* JADX INFO: loaded from: classes7.dex */
public class d extends j3.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f53345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f53347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f53348i;

    public d(View view) {
        super(0);
        this.f53348i = new int[2];
        this.f53345f = view;
    }

    @Override // androidx.core.view.j3.b
    public void c(@n0 j3 j3Var) {
        this.f53345f.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.j3.b
    public void d(@n0 j3 j3Var) {
        this.f53345f.getLocationOnScreen(this.f53348i);
        this.f53346g = this.f53348i[1];
    }

    @Override // androidx.core.view.j3.b
    @n0
    public n3 e(@n0 n3 n3Var, @n0 List<j3> list) {
        for (j3 j3Var : list) {
            if ((j3Var.f() & n3.m.d()) != 0) {
                this.f53345f.setTranslationY(com.google.android.material.animation.b.c(this.f53347h, 0, j3Var.d()));
                break;
            }
        }
        return n3Var;
    }

    @Override // androidx.core.view.j3.b
    @n0
    public j3.a f(@n0 j3 j3Var, @n0 j3.a aVar) {
        this.f53345f.getLocationOnScreen(this.f53348i);
        int i10 = this.f53346g - this.f53348i[1];
        this.f53347h = i10;
        this.f53345f.setTranslationY(i10);
        return aVar;
    }
}
