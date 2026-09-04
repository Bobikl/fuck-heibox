package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.j1;

/* JADX INFO: compiled from: ViewOffsetHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f53055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f53058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f53059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f53060f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f53061g = true;

    public i(View view) {
        this.f53055a = view;
    }

    void a() {
        View view = this.f53055a;
        j1.f1(view, this.f53058d - (view.getTop() - this.f53056b));
        View view2 = this.f53055a;
        j1.e1(view2, this.f53059e - (view2.getLeft() - this.f53057c));
    }

    public int b() {
        return this.f53057c;
    }

    public int c() {
        return this.f53056b;
    }

    public int d() {
        return this.f53059e;
    }

    public int e() {
        return this.f53058d;
    }

    public boolean f() {
        return this.f53061g;
    }

    public boolean g() {
        return this.f53060f;
    }

    void h() {
        this.f53056b = this.f53055a.getTop();
        this.f53057c = this.f53055a.getLeft();
    }

    public void i(boolean z10) {
        this.f53061g = z10;
    }

    public boolean j(int i10) {
        if (!this.f53061g || this.f53059e == i10) {
            return false;
        }
        this.f53059e = i10;
        a();
        return true;
    }

    public boolean k(int i10) {
        if (!this.f53060f || this.f53058d == i10) {
            return false;
        }
        this.f53058d = i10;
        a();
        return true;
    }

    public void l(boolean z10) {
        this.f53060f = z10;
    }
}
