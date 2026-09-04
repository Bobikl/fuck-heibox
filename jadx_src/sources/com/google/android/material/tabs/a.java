package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.n0;
import androidx.annotation.x;

/* JADX INFO: compiled from: ElasticTabIndicatorInterpolator.java */
/* JADX INFO: loaded from: classes7.dex */
public class a extends c {
    a() {
    }

    private static float e(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        return (float) (1.0d - Math.cos((((double) f10) * 3.141592653589793d) / 2.0d));
    }

    private static float f(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        return (float) Math.sin((((double) f10) * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.c
    void d(TabLayout tabLayout, View view, View view2, float f10, @n0 Drawable drawable) {
        float f11;
        float fE;
        RectF rectFA = c.a(tabLayout, view);
        RectF rectFA2 = c.a(tabLayout, view2);
        if (rectFA.left < rectFA2.left) {
            f11 = e(f10);
            fE = f(f10);
        } else {
            f11 = f(f10);
            fE = e(f10);
        }
        drawable.setBounds(com.google.android.material.animation.b.c((int) rectFA.left, (int) rectFA2.left, f11), drawable.getBounds().top, com.google.android.material.animation.b.c((int) rectFA.right, (int) rectFA2.right, fE), drawable.getBounds().bottom);
    }
}
