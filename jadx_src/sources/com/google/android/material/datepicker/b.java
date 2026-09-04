package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.n0;
import com.google.android.material.R;

/* JADX INFO: compiled from: CalendarStyle.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    final a f54069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    final a f54070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    final a f54071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    final a f54072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    final a f54073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    final a f54074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    final a f54075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    final Paint f54076h;

    b(@n0 Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.b.g(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), R.styleable.f52888x0);
        this.f54069a = a.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayStyle, 0));
        this.f54075g = a.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.f54070b = a.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_daySelectedStyle, 0));
        this.f54071c = a.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateListA = com.google.android.material.resources.c.a(context, typedArrayObtainStyledAttributes, R.styleable.MaterialCalendar_rangeFillColor);
        this.f54072d = a.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearStyle, 0));
        this.f54073e = a.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.f54074f = a.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f54076h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
