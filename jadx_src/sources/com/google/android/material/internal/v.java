package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;

/* JADX INFO: compiled from: RectEvaluator.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class v implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f54576a;

    public v(@n0 Rect rect) {
        this.f54576a = rect;
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f10, @n0 Rect rect, @n0 Rect rect2) {
        int i10 = rect.left;
        int i11 = i10 + ((int) ((rect2.left - i10) * f10));
        int i12 = rect.top;
        int i13 = i12 + ((int) ((rect2.top - i12) * f10));
        int i14 = rect.right;
        int i15 = i14 + ((int) ((rect2.right - i14) * f10));
        int i16 = rect.bottom;
        this.f54576a.set(i11, i13, i15, i16 + ((int) ((rect2.bottom - i16) * f10)));
        return this.f54576a;
    }
}
