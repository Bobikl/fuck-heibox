package com.google.android.material.resources;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: TypefaceUtils.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class h {
    private h() {
    }

    @p0
    public static Typeface a(@n0 Context context, @n0 Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    @p0
    public static Typeface b(@n0 Configuration configuration, @n0 Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT < 31 || (i10 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i10 == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, a2.a.e(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
