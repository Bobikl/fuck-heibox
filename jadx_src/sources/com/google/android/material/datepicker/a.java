package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.view.j1;
import com.google.android.material.R;

/* JADX INFO: compiled from: CalendarItemStyle.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final Rect f54063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f54064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ColorStateList f54065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ColorStateList f54066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f54067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.material.shape.p f54068f;

    private a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, com.google.android.material.shape.p pVar, @n0 Rect rect) {
        androidx.core.util.o.i(rect.left);
        androidx.core.util.o.i(rect.top);
        androidx.core.util.o.i(rect.right);
        androidx.core.util.o.i(rect.bottom);
        this.f54063a = rect;
        this.f54064b = colorStateList2;
        this.f54065c = colorStateList;
        this.f54066d = colorStateList3;
        this.f54067e = i10;
        this.f54068f = pVar;
    }

    @n0
    static a a(@n0 Context context, @e1 int i10) {
        androidx.core.util.o.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, R.styleable.f52891y0);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateListA = com.google.android.material.resources.c.a(context, typedArrayObtainStyledAttributes, R.styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateListA2 = com.google.android.material.resources.c.a(context, typedArrayObtainStyledAttributes, R.styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateListA3 = com.google.android.material.resources.c.a(context, typedArrayObtainStyledAttributes, R.styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        com.google.android.material.shape.p pVarM = com.google.android.material.shape.p.b(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new a(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, pVarM, rect);
    }

    int b() {
        return this.f54063a.bottom;
    }

    int c() {
        return this.f54063a.left;
    }

    int d() {
        return this.f54063a.right;
    }

    int e() {
        return this.f54063a.top;
    }

    void f(@n0 TextView textView) {
        g(textView, null);
    }

    void g(@n0 TextView textView, @p0 ColorStateList colorStateList) {
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
        com.google.android.material.shape.k kVar2 = new com.google.android.material.shape.k();
        kVar.setShapeAppearanceModel(this.f54068f);
        kVar2.setShapeAppearanceModel(this.f54068f);
        if (colorStateList == null) {
            colorStateList = this.f54065c;
        }
        kVar.o0(colorStateList);
        kVar.E0(this.f54067e, this.f54066d);
        textView.setTextColor(this.f54064b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f54064b.withAlpha(30), kVar, kVar2);
        Rect rect = this.f54063a;
        j1.I1(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
