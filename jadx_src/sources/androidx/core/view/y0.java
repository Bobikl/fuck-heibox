package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: NestedScrollingParentHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21829b;

    public y0(@androidx.annotation.n0 ViewGroup viewGroup) {
    }

    public int a() {
        return this.f21828a | this.f21829b;
    }

    public void b(@androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(@androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f21829b = i10;
        } else {
            this.f21828a = i10;
        }
    }

    public void d(@androidx.annotation.n0 View view) {
        e(view, 0);
    }

    public void e(@androidx.annotation.n0 View view, int i10) {
        if (i10 == 1) {
            this.f21829b = 0;
        } else {
            this.f21828a = 0;
        }
    }
}
