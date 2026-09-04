package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.x;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.google.android.material.R;
import com.google.android.material.color.utilities.b0;

/* JADX INFO: compiled from: MaterialColors.java */
/* JADX INFO: loaded from: classes7.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f53751a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f53752b = 0.54f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f53753c = 0.38f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f53754d = 0.32f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f53755e = 0.12f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f53756f = 40;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f53757g = 100;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f53758h = 90;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f53759i = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f53760j = 80;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f53761k = 20;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f53762l = 30;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f53763m = 90;

    private m() {
    }

    @androidx.annotation.l
    public static int a(@androidx.annotation.l int i10, @f0(from = 0, to = 255) int i11) {
        return androidx.core.graphics.f0.B(i10, (Color.alpha(i10) * i11) / 255);
    }

    @androidx.annotation.l
    public static int b(@n0 Context context, @androidx.annotation.f int i10, @androidx.annotation.l int i11) {
        TypedValue typedValueA = com.google.android.material.resources.b.a(context, i10);
        return typedValueA != null ? r(context, typedValueA) : i11;
    }

    @androidx.annotation.l
    public static int c(Context context, @androidx.annotation.f int i10, String str) {
        return r(context, com.google.android.material.resources.b.i(context, i10, str));
    }

    @androidx.annotation.l
    public static int d(@n0 View view, @androidx.annotation.f int i10) {
        return r(view.getContext(), com.google.android.material.resources.b.j(view, i10));
    }

    @androidx.annotation.l
    public static int e(@n0 View view, @androidx.annotation.f int i10, @androidx.annotation.l int i11) {
        return b(view.getContext(), i10, i11);
    }

    @androidx.annotation.l
    private static int f(@androidx.annotation.l int i10, @f0(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.F) int i11) {
        b0 b0VarB = b0.b(i10);
        b0VarB.j(i11);
        return b0VarB.k();
    }

    @n0
    public static f g(@androidx.annotation.l int i10, boolean z10) {
        return z10 ? new f(f(i10, 40), f(i10, 100), f(i10, 90), f(i10, 10)) : new f(f(i10, 80), f(i10, 20), f(i10, 30), f(i10, 90));
    }

    @n0
    public static f h(@n0 Context context, @androidx.annotation.l int i10) {
        return g(i10, com.google.android.material.resources.b.b(context, R.attr.isLightTheme, true));
    }

    @n0
    public static ColorStateList i(@n0 Context context, @androidx.annotation.f int i10, @n0 ColorStateList colorStateList) {
        TypedValue typedValueA = com.google.android.material.resources.b.a(context, i10);
        ColorStateList colorStateListS = typedValueA != null ? s(context, typedValueA) : null;
        return colorStateListS == null ? colorStateList : colorStateListS;
    }

    @p0
    public static ColorStateList j(@n0 Context context, @androidx.annotation.f int i10) {
        TypedValue typedValueA = com.google.android.material.resources.b.a(context, i10);
        if (typedValueA == null) {
            return null;
        }
        int i11 = typedValueA.resourceId;
        if (i11 != 0) {
            return androidx.core.content.d.g(context, i11);
        }
        int i12 = typedValueA.data;
        if (i12 != 0) {
            return ColorStateList.valueOf(i12);
        }
        return null;
    }

    @androidx.annotation.l
    public static int k(@androidx.annotation.l int i10, @androidx.annotation.l int i11) {
        return com.google.android.material.color.utilities.a.b(i10, i11);
    }

    @androidx.annotation.l
    public static int l(@n0 Context context, @androidx.annotation.l int i10) {
        return k(i10, c(context, R.attr.colorPrimary, m.class.getCanonicalName()));
    }

    public static boolean m(@androidx.annotation.l int i10) {
        return i10 != 0 && androidx.core.graphics.f0.m(i10) > 0.5d;
    }

    @androidx.annotation.l
    public static int n(@androidx.annotation.l int i10, @androidx.annotation.l int i11) {
        return androidx.core.graphics.f0.t(i11, i10);
    }

    @androidx.annotation.l
    public static int o(@androidx.annotation.l int i10, @androidx.annotation.l int i11, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        return n(i10, androidx.core.graphics.f0.B(i11, Math.round(Color.alpha(i11) * f10)));
    }

    @androidx.annotation.l
    public static int p(@n0 View view, @androidx.annotation.f int i10, @androidx.annotation.f int i11) {
        return q(view, i10, i11, 1.0f);
    }

    @androidx.annotation.l
    public static int q(@n0 View view, @androidx.annotation.f int i10, @androidx.annotation.f int i11, @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        return o(d(view, i10), d(view, i11), f10);
    }

    private static int r(@n0 Context context, @n0 TypedValue typedValue) {
        int i10 = typedValue.resourceId;
        return i10 != 0 ? androidx.core.content.d.f(context, i10) : typedValue.data;
    }

    private static ColorStateList s(@n0 Context context, @n0 TypedValue typedValue) {
        int i10 = typedValue.resourceId;
        return i10 != 0 ? androidx.core.content.d.g(context, i10) : ColorStateList.valueOf(typedValue.data);
    }
}
