package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import androidx.annotation.e1;
import androidx.annotation.f1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.x0;
import com.google.android.material.R;

/* JADX INFO: compiled from: MaterialResources.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f54843a = 1.3f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f54844b = 2.0f;

    private c() {
    }

    @p0
    public static ColorStateList a(@n0 Context context, @n0 TypedArray typedArray, @f1 int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListA = b0.a.a(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListA;
    }

    @p0
    public static ColorStateList b(@n0 Context context, @n0 x0 x0Var, @f1 int i10) {
        int iU;
        ColorStateList colorStateListA;
        return (!x0Var.C(i10) || (iU = x0Var.u(i10, 0)) == 0 || (colorStateListA = b0.a.a(context, iU)) == null) ? x0Var.d(i10) : colorStateListA;
    }

    private static int c(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    public static int d(@n0 Context context, @n0 TypedArray typedArray, @f1 int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i10, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i10, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i11);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @p0
    public static Drawable e(@n0 Context context, @n0 TypedArray typedArray, @f1 int i10) {
        int resourceId;
        Drawable drawableB;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (drawableB = b0.a.b(context, resourceId)) == null) ? typedArray.getDrawable(i10) : drawableB;
    }

    @f1
    static int f(@n0 TypedArray typedArray, @f1 int i10, @f1 int i11) {
        return typedArray.hasValue(i10) ? i10 : i11;
    }

    @p0
    public static d g(@n0 Context context, @n0 TypedArray typedArray, @f1 int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }

    public static int h(@n0 Context context, @e1 int i10, int i11) {
        if (i10 == 0) {
            return i11;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, R.styleable.f52895z1);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(R.styleable.TextAppearance_android_textSize, typedValue);
        typedArrayObtainStyledAttributes.recycle();
        if (value) {
            return c(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return i11;
    }

    public static boolean i(@n0 Context context) {
        return context.getResources().getConfiguration().fontScale >= f54843a;
    }

    public static boolean j(@n0 Context context) {
        return context.getResources().getConfiguration().fontScale >= f54844b;
    }
}
