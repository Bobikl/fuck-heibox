package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.n0;
import com.google.android.material.internal.j0;

/* JADX INFO: compiled from: MaterialShapeUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public class l {
    private l() {
    }

    @n0
    static f a(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? b() : new g();
        }
        return new o();
    }

    @n0
    static f b() {
        return new o();
    }

    @n0
    static h c() {
        return new h();
    }

    public static void d(@n0 View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof k) {
            ((k) background).n0(f10);
        }
    }

    public static void e(@n0 View view) {
        Drawable background = view.getBackground();
        if (background instanceof k) {
            f(view, (k) background);
        }
    }

    public static void f(@n0 View view, @n0 k kVar) {
        if (kVar.b0()) {
            kVar.s0(j0.n(view));
        }
    }
}
