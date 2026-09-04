package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.t0;
import com.google.android.material.R;

/* JADX INFO: compiled from: MaterialAttributes.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class b {
    @p0
    public static TypedValue a(@n0 Context context, @androidx.annotation.f int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(@n0 Context context, @androidx.annotation.f int i10, boolean z10) {
        TypedValue typedValueA = a(context, i10);
        if (typedValueA == null || typedValueA.type != 18) {
            return z10;
        }
        return typedValueA.data != 0;
    }

    public static boolean c(@n0 Context context, @androidx.annotation.f int i10, @n0 String str) {
        return g(context, i10, str) != 0;
    }

    @t0
    public static int d(@n0 Context context, @androidx.annotation.f int i10, @q int i11) {
        TypedValue typedValueA = a(context, i10);
        return (int) ((typedValueA == null || typedValueA.type != 5) ? context.getResources().getDimension(i11) : typedValueA.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static int e(@n0 Context context, @androidx.annotation.f int i10, int i11) {
        TypedValue typedValueA = a(context, i10);
        return (typedValueA == null || typedValueA.type != 16) ? i11 : typedValueA.data;
    }

    @t0
    public static int f(@n0 Context context) {
        return d(context, R.attr.minTouchTargetSize, R.dimen.mtrl_min_touch_target_size);
    }

    public static int g(@n0 Context context, @androidx.annotation.f int i10, @n0 String str) {
        return i(context, i10, str).data;
    }

    public static int h(@n0 View view, @androidx.annotation.f int i10) {
        return j(view, i10).data;
    }

    @n0
    public static TypedValue i(@n0 Context context, @androidx.annotation.f int i10, @n0 String str) {
        TypedValue typedValueA = a(context, i10);
        if (typedValueA != null) {
            return typedValueA;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    @n0
    public static TypedValue j(@n0 View view, @androidx.annotation.f int i10) {
        return i(view.getContext(), i10, view.getClass().getCanonicalName());
    }
}
