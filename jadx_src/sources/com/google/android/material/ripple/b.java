package com.google.android.material.ripple;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.k;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.core.graphics.f0;
import com.google.android.material.color.m;

/* JADX INFO: compiled from: RippleUtils.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @k(api = 21)
    public static final boolean f54876a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f54877b = {R.attr.state_pressed};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f54878c = {R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f54879d = {R.attr.state_focused};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f54880e = {R.attr.state_hovered};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f54881f = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f54882g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f54883h = {R.attr.state_selected, R.attr.state_focused};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f54884i = {R.attr.state_selected, R.attr.state_hovered};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f54885j = {R.attr.state_selected};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f54886k = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @j1
    static final String f54887l = b.class.getSimpleName();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @j1
    static final String f54888m = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";

    /* JADX INFO: compiled from: RippleUtils.java */
    @w0(21)
    public static class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @u
        public static Drawable b(@n0 Context context, @t0 int i10) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(m.i(context, com.google.android.material.R.attr.colorControlHighlight, ColorStateList.valueOf(0)), null, new InsetDrawable((Drawable) gradientDrawable, i10, i10, i10, i10));
        }
    }

    private b() {
    }

    @n0
    public static ColorStateList a(@p0 ColorStateList colorStateList) {
        if (f54876a) {
            int[] iArr = f54879d;
            return new ColorStateList(new int[][]{f54885j, iArr, StateSet.NOTHING}, new int[]{d(colorStateList, f54881f), d(colorStateList, iArr), d(colorStateList, f54877b)});
        }
        int[] iArr2 = f54881f;
        int[] iArr3 = f54882g;
        int[] iArr4 = f54883h;
        int[] iArr5 = f54884i;
        int[] iArr6 = f54877b;
        int[] iArr7 = f54878c;
        int[] iArr8 = f54879d;
        int[] iArr9 = f54880e;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, f54885j, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{d(colorStateList, iArr2), d(colorStateList, iArr3), d(colorStateList, iArr4), d(colorStateList, iArr5), 0, d(colorStateList, iArr6), d(colorStateList, iArr7), d(colorStateList, iArr8), d(colorStateList, iArr9), 0});
    }

    @n0
    @w0(21)
    public static Drawable b(@n0 Context context, @t0 int i10) {
        return a.b(context, i10);
    }

    @l
    @TargetApi(21)
    private static int c(@l int i10) {
        return f0.B(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    @l
    private static int d(@p0 ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f54876a ? c(colorForState) : colorForState;
    }

    @n0
    public static ColorStateList e(@p0 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f54886k, 0)) != 0) {
            Log.w(f54887l, f54888m);
        }
        return colorStateList;
    }

    public static boolean f(@n0 int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
