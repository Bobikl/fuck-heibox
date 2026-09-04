package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: ThemeUtils.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f2922a = "ThemeUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f2923b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f2924c = {-16842910};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[] f2925d = {R.attr.state_focused};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f2926e = {R.attr.state_activated};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f2927f = {R.attr.state_pressed};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f2928g = {R.attr.state_checked};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f2929h = {R.attr.state_selected};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int[] f2930i = {-16842919, -16842908};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int[] f2931j = new int[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f2932k = new int[1];

    private s0() {
    }

    public static void a(@androidx.annotation.n0 View view, @androidx.annotation.n0 Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(androidx.appcompat.R.styleable.f1580m);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar)) {
                Log.e(f2922a, "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @androidx.annotation.n0
    public static ColorStateList b(int i10, int i11) {
        return new ColorStateList(new int[][]{f2924c, f2931j}, new int[]{i11, i10});
    }

    public static int c(@androidx.annotation.n0 Context context, int i10) {
        ColorStateList colorStateListF = f(context, i10);
        if (colorStateListF != null && colorStateListF.isStateful()) {
            return colorStateListF.getColorForState(f2924c, colorStateListF.getDefaultColor());
        }
        TypedValue typedValueG = g();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueG, true);
        return e(context, i10, typedValueG.getFloat());
    }

    public static int d(@androidx.annotation.n0 Context context, int i10) {
        int[] iArr = f2932k;
        iArr[0] = i10;
        x0 x0VarF = x0.F(context, null, iArr);
        try {
            return x0VarF.c(0, 0);
        } finally {
            x0VarF.I();
        }
    }

    static int e(@androidx.annotation.n0 Context context, int i10, float f10) {
        int iD = d(context, i10);
        return androidx.core.graphics.f0.B(iD, Math.round(Color.alpha(iD) * f10));
    }

    @androidx.annotation.p0
    public static ColorStateList f(@androidx.annotation.n0 Context context, int i10) {
        int[] iArr = f2932k;
        iArr[0] = i10;
        x0 x0VarF = x0.F(context, null, iArr);
        try {
            return x0VarF.d(0);
        } finally {
            x0VarF.I();
        }
    }

    private static TypedValue g() {
        ThreadLocal<TypedValue> threadLocal = f2923b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
